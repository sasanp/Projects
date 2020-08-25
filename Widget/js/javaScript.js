
/* 
Author: Sasan Pournouri
*/
document.querySelector('.rating-widget').addEventListener("click", ratingFunction);

function ratingFunction(e) {
    const starId = e.target.id;
    if (starId.includes('star')) {
        networkRequest();
        return new Promise(resolve => {
            setTimeout(() => {
              resolve('resolved');
              document.getElementById(starId).classList.add('rated');
            }, 500);
          }); 
    }
}

async function networkRequest() {
    console.log("successful request");
}
