#include<bits/stdc++.h>
using namespace std;

int main()
{
  string str;
  getline(cin,str);
  string str2;
  cin>>str2;
  int count = 0, co, flag = 0;
  for(int i=0; i<str.length(); i++)
  {
    flag = 0;
    if(str[i] == str2[0])
    {
      co = i+1;
      for(int j=1; j<str2.length(); j++)
      {
        if(str[co++] == str2[j])
          flag = 1;
        else
        {
          flag = 0;
       	  break;
        }
      }
      if(flag)
        count++;
    }
  }
  cout<<"Occurrences = "<<count;
}