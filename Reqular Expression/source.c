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
int isMatching(char string[], char pattern[], int n, int m)
{
	// If string and pattern reach their end,
	// return true
	if (m < 0 && n < 0)
		return TRUE;

	// If only pattern reaches its end, return false
	else if (m < 0)
		return FALSE;

	// If only input string reaches its end, return true
	// if remaining characters in the pattern are all '*'
	else if (n < 0)
	{
		for (int i = 0; i <= m; i++)
			if (pattern[i] != '*')
				return 0;

		return TRUE;
	}

	// If the sub-problem is encountered for the first time
	if (lookup[m][n] == -1)
	{
		if (pattern[m] == '*')
		{
			// 1. * matches with current characters in input string.
			// Here we will move to next character in the string

			// 2. Ignore * and move to next character in the pattern
			lookup[m][n] = isMatching(string, pattern, n - 1, m) ||
				isMatching(string, pattern, n, m - 1);
		}
		else
		{
			// If the current character is not a wildcard character, it
			// should match with current character in the input string
			if (pattern[m] != '.' && pattern[m] != string[n])
				lookup[m][n] = 0;

			// check if pattern[0..m-1] matches string[0..n-1]
			else
				lookup[m][n] = isMatching(string, pattern, n - 1, m - 1);
		}
	}

	return lookup[m][n];
}