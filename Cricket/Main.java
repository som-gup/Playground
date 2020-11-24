#include<iostream>
#include<bits/stdc++.h> 
using namespace std;
int main()
{
int a,b,c,d;
  cin>>a>>b>>c>>d;
float  e=a/6;
 int f=d/6;
 int g=d%6;
  float h=((float)f+(float)g/10);
 float i=c/h;
 float j=b/e;
  cout<<e<<"\n"<<fixed<<setprecision(1) <<h<<"\n"<<i<<"\n"<<j;
  if(i>j){
    cout<<"\nEligible to Win";
  }
    else{
    cout<<"\nNot Eligible to Win";
}
}