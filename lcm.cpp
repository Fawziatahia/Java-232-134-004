#include <bits/stdc++.h>
using namespace std;

int LCS(string &s1, string &s2, int x, int y, int c[1000][1000])
{
    for (int i = 1; i <= x; i++)
    {
        for (int j = 1; j <= y; j++)
        {
            if (s1[i - 1] == s2[j - 1])
                c[i][j] = c[i - 1][j - 1] + 1;
            else
                c[i][j] = max(c[i][j - 1], c[i - 1][j]);
        }
    }
    return c[x][y];
}

string getLCS(string &s1, string &s2, int x, int y, int c[1000][1000])
{
    string lcs = "";
    int i = x, j = y;
    while (i > 0 && j > 0)
    {
        if (s1[i - 1] == s2[j - 1])
        {
            lcs = s1[i - 1] + lcs;
            i--;
            j--;
        }
        else if (c[i - 1][j] >= c[i][j - 1])
            i--;
        else
            j--;
    }
    return lcs;
}

void printTable(int c[1000][1000], int x, int y)
{
    for (int i = 0; i <= x; i++)
    {
        for (int j = 0; j <= y; j++)
            cout << c[i][j] << " ";
        cout << '\n';
    }
}

int main()
{
    string s1 = "BDCABA";
    string s2 = "ABCBDAB";
    int x = s1.size();
    int y = s2.size();

    // Declare a 2D array for storing the DP table
    int c[1000][1000] = {0};

    // Calculate the length of LCS and fill the table
    int lcs_length = LCS(s1, s2, x, y, c);

    // Display the DP table
    cout << "DP Table: " << '\n';
    printTable(c, x, y);
    cout << '\n';

    // Get the actual LCS string
    string lcs = getLCS(s1, s2, x, y, c);

    // Display the LCS length and the LCS string
    cout << "Length of LCS: " << lcs_length << '\n';
    cout << "LCS: " << lcs << '\n';

    return 0;
}
