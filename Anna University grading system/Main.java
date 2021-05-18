#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  if(n==100)
    cout<<"S";
  else if(n>=90 && n<=99)
    cout<<"A";
  else if(n>=80 && n<=89)
    cout<<"B";
  else if(n>=70 && n<=79)
    cout<<"C";
  else if(n>=60 && n<=69)
    cout<<"D";
  else if(n>=50 && n<=59)
    cout<<"E";
  else if(n<50)
    cout<<"F";
  else
    cout<<"Invalid Input";
}