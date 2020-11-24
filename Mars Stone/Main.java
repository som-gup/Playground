#include <bits/stdc++.h>
using namespace std;

int main() 
{
  int maxval, common, index = 0, unidex = 0, count = 0, sum = 0;
  cin>>maxval>>common;
  int mars[maxval], earth[common], unique[maxval - common];
  for(int i = 0; i<common; i++)
    cin>>earth[i];
  for(int i=0; i<maxval; i++)
    mars[i] = i+1;
  sort(earth, earth + common);
  for(int i = 0; i<maxval - common; i++)
  {
    if(mars[i] == earth[index])
      index++;
    else
      unique[unidex++] = mars[i];
  }
  for(int i = 0; i<maxval - common; i++)
  {
    sum = sum + unique[i];
    if(sum<=maxval)
      count++;
    else
      break;
  }
  cout<<count;
}