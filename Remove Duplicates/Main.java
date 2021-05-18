#include<iostream>
using namespace std;

int main() 
{ 
  int size,flag;
  cin>>size;
  int a[size];
  for(int i=0;i<size;i++)
  {
      cin>>a[i];
  }
  for(int i=0;i<size;i++)
  {
      flag=0;
      for(int j=i;j>=0;j--)
      {
          if(a[i]==a[j])
          {
              flag++;
          }
      }
      if(flag==1)
      {
          cout<<a[i]<<" ";
      }
  }
    return 0; 
}
     
