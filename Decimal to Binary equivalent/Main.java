#include <bits/stdc++.h>
using namespace std;

int main() 
{
  int n;
  cin>>n;
  vector<int> vec;
  while(n)
  {
    vec.push_back(n%2);
    n = n/2;
  }
  for(int j=vec.size()-1; j>=0; j--)
    cout<<vec[j];
}

/*#include <iostream>
using namespace std;

int main() 
{
  int n;
  cin>>n;
  int a[32];
  int i=0;
  while(n)
  {
    a[i] = n%2;
    n = n/2;
    i++;
  }
  for(int j = i-1; j>=0; j--)
    cout<<a[j];
}*/