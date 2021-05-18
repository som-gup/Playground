#include <iostream>
using namespace std;

int main() 
{
  int age, weight;
  cin>>age>>weight;
  if(age>17 && weight>=50)
    cout<<"Eligible to donate blood:)";
  else
    cout<<"Not eligible to donate blood:(";
}