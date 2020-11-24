#include<iostream>
using namespace std;

int baseconverter(int i, int base)
{
  int convertedno = 0, index = 0 ;
  int store[100];
  int rem;
  while(i>0)
  {
    rem = i%base;
    store[index++] = rem;
    i=i/base;
  }
  
  for(int i = index-1; i>=0; i--)
  {
    convertedno = convertedno*10 + store[i];
  }
  return convertedno;
}
int convertedtobasesum(int i, int base)
{
  int sum = 0, rem;
  while(i>0)
  {
    rem = i%base;
    sum = sum+rem;
    i=i/base;
  }
  return sum;
}
int main()
{
  int base, testcount, count = 0, i;
  cin>>base>>testcount;
  for(i=base;;i++)
  {
    if(i%convertedtobasesum(i, base)==0)
    {
      count++;
    }
    else
    {
      if(count==testcount)
      {
        break;
      }
      count = 0;
    }
  }
  cout<<baseconverter(i-testcount, base);
  return 0;
}