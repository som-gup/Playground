#include<iostream>
#include<stdio.h>
#define MAX_SIZE 10
using namespace std;

int main()
{
    int t, sum;
    int first[10][10];
    int second[10][10];
    int mul[10][10];
    int i, j, k,m, n, l;
    cin>>t;
    
    for(l = 0; l < t; l++)
    {
        cin>>m>>n;
        for(i = 0; i < m; i++)
            for(j = 0; j < n; j++)
                cin>>first[i][j];
        for(i = 0; i < m; i++)
            for(j = 0; j < n; j++)
                cin>>second[i][j];

        for ( i = 0 ; i < m ; i++ )
        {
          for ( j = 0 ; j < n ; j++ )
          {
            mul[i][j] = first[i][j] + second[i][j];
          }
       }
       for(i = 0; i < m; i++)
            for(j = 0; j < n; j++)
                cout<<mul[i][j]<<" ";
       cout<<"\n";
    }
    return 0;
}