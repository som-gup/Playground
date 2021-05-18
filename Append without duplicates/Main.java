#include<bits/stdc++.h>
using namespace std;
int main()
{
  int n;
  vector<int> vec;
  int firstflag = 0;
  while(1)
  {
    cin>>n;
    if(n<0)
    {
      if(firstflag == 0)
      {
        cout<<"List is empty"<<endl;
        break;
      }
      break;
    }
    firstflag = 1;
    int presentflag = 0;
    for(int i=0; i<vec.size(); i++)
    {
      if(vec[i] == n)
      {
        presentflag = 1;
        break;
      }
    }
    if(presentflag == 0)
    {
      vec.push_back(n);
      cout<<n<<endl;
    }
  }
}