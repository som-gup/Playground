#include<iostream>
using namespace std;

int main()
{
  int holes;
  cin>>holes;
  long long int holearray[holes];
  long long int holecountarray[holes];
  for(int i = 0; i<holes; i++)
  {
    cin>>holearray[i];
    holecountarray[i] = i+1;
  }
  int balls;
  cin>>balls;
  long long int ballarray[balls];
  for(int i=0; i<balls; i++)
    cin>>ballarray[i];
  int position[balls];
  for(int i=0; i<balls; i++)
    position[i] = 0;
  for(int i=0; i<balls; i++)
  {
    for(int j=holes-1; j>=0; j--)
    {
      if(ballarray[i]<=holearray[j] && holecountarray[j]!=0)
      {
         holecountarray[j]--;
         position[i] = j+1;
         break;        
      }
    }
  }
  for(int i=0; i<balls; i++)
    cout<<position[i]<<" ";
  return 0;
}