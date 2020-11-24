#include<bits/stdc++.h>
using namespace std;

int main() 
{
  string str;
  char ch;
  getline(cin, str);
  cin>>ch;
  str.erase(remove(str.begin(), str.end(), ch), str.end());
  cout<<str;
}