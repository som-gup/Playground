#include <iostream>
using namespace std;

int main() 
{
  int m,n;
  cin>>m>>n;
  int val;
  cin>>val;
  for(int i=0; i<m; i++)
  {
    for(int j=0; j<n; j++)
    {
      cout<<val++<<" ";
    }
    cout<<endl;
  }
}