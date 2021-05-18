#include <bits/stdc++.h>
using namespace std;
int main()
{
  int base, expo;
  cin>>base>>expo;
  if(expo < 0)
    cout<<"Wrong input";
  else
    cout<<pow(base, expo);
}