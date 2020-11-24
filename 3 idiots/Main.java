#include<iostream>
using namespace std;
int main()
{
  int x1,y1,x2,y2;
  float xcord, ycord;
  cin>>x1>>y1>>x2>>y2;
  xcord = (x1 + x2)/2.0;
  ycord = (y1 + y2)/2.0;
  cout<<"Rachel's house is located at("<<xcord<<","<<ycord<<")";
}