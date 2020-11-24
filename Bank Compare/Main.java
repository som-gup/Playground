#include<iostream>
#include<cmath>
using namespace std;

int main()
{
  long int principal;
  float EMIA, EMIB;
  cin>>principal;
  int years;
  cin>>years;
  int bankA;
  cin>>bankA;
  float bankAarray[bankA][2];
  for(int i=0; i<bankA; i++)
  {
    for(int j=0; j<2; j++)
      cin>>bankAarray[i][j];
  }
  int bankB;
  cin>>bankB;
  float bankBarray[bankB][2];
  for(int i=0; i<bankB; i++)
  {
    for(int j=0; j<2; j++)
      cin>>bankBarray[i][j];
  }
  for(int i=0; i<bankA; i++)
  {
    EMIA = EMIA + principal * bankAarray[i][1]/(1-1/(pow((1+bankAarray[i][1]),(bankAarray[i][0])*12)));
  }
  for(int i=0; i<bankB; i++)
  {
    EMIB = EMIB + principal * bankBarray[i][1]/(1-1/(pow((1+bankBarray[i][1]),(bankBarray[i][0])*12)));
  }
  (EMIA>EMIB) ? (cout<<"Bank B") : (cout<<"Bank A");
  return 0;
}