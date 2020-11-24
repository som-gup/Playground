#include <iostream>
using namespace std;

int main() 
{
  int numplayers;
  cin>>numplayers;
  int scorearray[numplayers];
  for(int i=0; i<numplayers; i++)
    cin>>scorearray[i];
  int pillar1, pillar2, count = 0;
  cin>>pillar1>>pillar2;
  for(int i=0; i<numplayers; i++)
  {
    if(pillar1%scorearray[i] == 0 && pillar2%scorearray[i] == 0)
      count++;
  }
  cout<<count;
}