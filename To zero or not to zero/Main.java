#include <iostream>
using namespace std;

int countDiff(int a, int b)
{
  int counta = 0, countb = 0, diff = 0;
  while(a)
  {
    a = a/10;
    counta++;
  }
  while(b)
  {
    b=b/10;
    countb++;
  }
  diff = countb - counta;
  return diff;
}
int main() 
{
  int m,n;
  cin>>m>>n;
  int diff, differ;
  diff = countDiff(m,n);
  if(diff == 0)
  {
    for(int i=m; i<=n; i++)
      cout<<i<<" ";
  }
  else
  {
    for(int i=m; i<=n; i++)
    {
      differ = countDiff(i,n);
      for(int j=1; j<=differ; j++)
        cout<<"0";
      cout<<i<<" ";
    }
  }
}