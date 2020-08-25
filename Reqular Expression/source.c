//Author: Sasan Pournouri
//Date: August 21, 2020
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>

#define SIZE 10
#define TRUE 1
#define FALSE 0

// create a DP lookup table
int lookup[SIZE][SIZE];

// function prototype
int isMatching(char string[], char pattern[], int n, int m);

//main function
int main(void)
{
	//char string[] = "xyxzzxy";
	//char pattern[] = "x***x.";

	char string[SIZE], pattern[SIZE];
	
	int i = 0;

	printf("Enter a string between 1-10 characters: ");
	gets(string, sizeof(string), stdin);

	printf("Enter a pattern between 1-10 characters: ");
	gets(pattern, sizeof(string), stdin);
	

	memset(lookup, -1, sizeof(lookup));

	
		
		if (isMatching(string, pattern, strlen(string) - 1, strlen(pattern) - 1))


			printf("Match");
	
	else
	
		printf("No Match");
	
	

	_getch();
	return FALSE;

	
}

//isMatching function
int isMatching(char string[], char pattern[], int str, int ptr)
{
	// return true if the end has reached
	if (ptr < 0 && str < 0)
		return TRUE;

	// If only pattern reaches its end, return false
	else if (ptr < 0)
		return FALSE;

	// return true if rest of the charracters are '*' 
	// and only if the string is at its end
	else if (str < 0)
	{
		for (int i = 0; i <= ptr; i++)
			if (pattern[i] != '*')
				return 0;

		return TRUE;
	}

	// If the sub-problem is encountered for the first time
	if (lookup[ptr][str] == -1)
	{
		if (pattern[ptr] == '*')
		{
			// 1. * matching with the current character in the input string
			// move to the next char

			// ignoring the '*' and moving on to the next charracter
			lookup[ptr][str] = isMatching(string, pattern, str - 1, ptr) ||
				isMatching(string, pattern, str, ptr - 1);
		}
		else
		{
			// matching with the current character in the input string if the corrent character is not '.'
			if (pattern[ptr] != '.' && pattern[ptr] != string[str])
				lookup[ptr][str] = 0;

			// check if pattern matches the string
			else
				lookup[ptr][str] = isMatching(string, pattern, str - 1, ptr - 1);
		}
	}

	return lookup[ptr][str];
}
