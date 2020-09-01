//Author: Sasan
// set up variables 

const record = document.querySelector('.record');
const stop = document.querySelector('.stop');
const soundClips = document.querySelector('.sound-clips');
const canvas = document.querySelector('.visualizer');
const mainSection = document.querySelector('.main-controls');

// disable stop button while not recording

stop.disabled = true;

// visualiser setup - create web audio api context and canvas

let audioCtx;
const canvasCtx = canvas.getContext("2d");

// Check if getUserMedia media is supported before anything else run

if (navigator.mediaDevices.getUserMedia) 
{
  console.log('getUserMedia supported.');
// only record audio
  const constraints = 
  { 
      audio: true 
  };
  let chunks = [];

// run once getUserMedia call has compeleted 
  let onSuccess = function(stream) 
  {
    const mediaRecorder = new MediaRecorder(stream);

    visualize(stream);

    record.onclick = function() 
    {
        //start recording after record button is pressed
      mediaRecorder.start();
      console.log(mediaRecorder.state);
      console.log("recorder started");
      record.style.background = "black";
      
        
      stop.disabled = false;
      record.disabled = true;
    }

    stop.onclick = function()
     
    {
      mediaRecorder.stop();
      console.log(mediaRecorder.state);
      console.log("recorder stopped");
      record.style.background = "";
      record.style.color = "";
      // mediaRecorder.requestData();

      stop.disabled = true;
      record.disabled = false;
    }
    //after pressing stop, prompt alert asks to name the recording
    mediaRecorder.onstop = function(e) 
    {
      console.log("data available after MediaRecorder.stop() called.");
    //asking for the name of the recording
      const clipName = prompt('Name your sound clip: ','My Recording');
    //caling the article element from html
      const clipContainer = document.createElement('article');
      const clipLabel = document.createElement('p');
      const audio = document.createElement('audio');
      const deleteButton = document.createElement('button');

      clipContainer.classList.add('clip');
      audio.setAttribute('controls', '');
      deleteButton.textContent = 'Delete';
      deleteButton.className = 'delete';

    //print the chosen name or else just the defualt name    
      if(clipName === null) {
        clipLabel.textContent = 'My Recordings';
      
    } else 

    {
        clipLabel.textContent = clipName;
      
    }

      clipContainer.appendChild(audio);
      clipContainer.appendChild(clipLabel);
      clipContainer.appendChild(deleteButton);
      soundClips.appendChild(clipContainer);
    //creating a combined blob from recorder audio chunks
      audio.controls = true;
      const blob = new Blob(chunks, { 'type' : 'audio/ogg; codecs=opus' });
      chunks = [];
    //creating an object URL is pointing to
      const audioURL = window.URL.createObjectURL(blob);
    //setting the value of audio to the object URL(audioURL)
      audio.src = audioURL;
      console.log("recorder stopped");
    //setting onclick handler on the delete button to be a function that delete recordings
      deleteButton.onclick = function(e) 
      {
        let evtTgt = e.target;
        evtTgt.parentNode.parentNode.removeChild(evtTgt.parentNode);
      }

      clipLabel.onclick = function() 
      {
        const existingName = clipLabel.textContent;
        const newClipName = prompt('Name your sound clip: ');
        if(newClipName === null) 
        
        {
          clipLabel.textContent = existingName;
        } else 
        
        {
          clipLabel.textContent = newClipName;
        }
      }
    }

    mediaRecorder.ondataavailable = function(e) 
    {
      chunks.push(e.data);
    }
  }
//if getUserMedia call fails, run this code
  let onError = function(err) 
  {
    console.log('The following error occured: ' + err);
  }

  navigator.mediaDevices.getUserMedia(constraints).then(onSuccess, onError);

} else 
{
   console.log('getUserMedia not supported on your browser!');
}

function visualize(stream) 
{
  if(!audioCtx) {
    audioCtx = new AudioContext();
  
}

  const source = audioCtx.createMediaStreamSource(stream);

  const analyser = audioCtx.createAnalyser();
  analyser.fftSize = 2048;
  const bufferLength = analyser.frequencyBinCount;
  const dataArray = new Uint8Array(bufferLength);

  source.connect(analyser);
 

  draw()

  function draw() 
  {
    const WIDTH = canvas.width
    const HEIGHT = canvas.height;

    requestAnimationFrame(draw);

    analyser.getByteTimeDomainData(dataArray);

    canvasCtx.fillStyle = 'rgb(69, 202, 255)';
    canvasCtx.fillRect(0, 0, WIDTH, HEIGHT);

    canvasCtx.lineWidth = 2;
    canvasCtx.strokeStyle = 'rgb(0, 0, 0)';

    canvasCtx.beginPath();

    let sliceWidth = WIDTH * 1.0 / bufferLength;
    let x = 0;


    for(let i = 0; i < bufferLength; i++) 
    {

      let v = dataArray[i] / 128.0;
      let y = v * HEIGHT/2;

      if(i === 0) {
        canvasCtx.moveTo(x, y);
      } else {
        canvasCtx.lineTo(x, y);
      }

      x += sliceWidth;
    }

    canvasCtx.lineTo(canvas.width, canvas.height/2);
    canvasCtx.stroke();

  }
}

window.onresize = function() 
{
  canvas.width = mainSection.offsetWidth;
}

window.onresize();