#include<bits/stdc++.h>
using namespace std;
int main()
{
  int x, y, xv, yv;
  cin>>x>>y>>xv>>yv;
  double d, min = sqrt(x*x + y*y);
  if(x <=0 || y <=0 || xv <=0 || yv<=0)
    cout<<"Invalid Input";
  else
  {
    while(x>=0 || y>=0)
    {
      x = x - xv;
      y = y - yv;
      d = sqrt(x*x + y*y);
      if(d<min)
      {
        min = d;
      }
    }
    if(min == 0.0)
      cout<<"0.0";
    else
      cout<<fixed<<setprecision(11)<<min;
  }
    
  return 0;
}