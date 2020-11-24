#include<bits/stdc++.h>
using namespace std;

void countLitres(int cans[], int m, int litres)
{
  int table[litres+1];
  table[0] = 0;
  for(int i=1; i<=litres; i++)
    table[i] = INT_MAX;
  for(int i=1; i<=litres; i++)
  {
    for(int j=0; j<m; j++)
    {
      if(cans[j]<=i)
      {
        int sublitres = table[i-cans[j]];
        if(sublitres!=INT_MAX && sublitres+1 < table[i])
          table[i] = sublitres + 1;
      }
    }
  }
  cout<<table[litres]<<endl;
}
int main()
{
  int cans[] = {1, 5, 7, 10};
  int m = sizeof(cans)/sizeof(cans[0]);
  int tests;
  cin>>tests;
  while(tests--)
  {
    int litres;
    cin>>litres;
    countLitres(cans, m, litres);
  }
  return 0;
}