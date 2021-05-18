#include<iostream>
using namespace std;

int tobinary(int num)
{  
  int rem,rev=0;
  while(num!=0)  
  {    
    rem=num%2; 
    rev=rev*10+rem;
    num/=2; 
   } 
   return rev;
}
int main()
{
   int n,i; 
   cin>>n;
   for(i=1;i<=n;i+=2)
     cout<<tobinary(i)<<endl;
   return 0;
}
