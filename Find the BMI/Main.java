#include <iostream>
using namespace std;

int main() 
{
  int weight;
  float height;
  cin>>weight>>height;
  float bmi;
  bmi = (float) (weight/(height * height));
  if(bmi < 18)
    cout<<"0";
  else if(bmi>=18 && bmi<25)
    cout<<"1";
  else if(bmi>=25 && bmi<30)
    cout<<"2";
  else if(bmi>=30 && bmi<40)
    cout<<"3";
  else
    cout<<"4";
}