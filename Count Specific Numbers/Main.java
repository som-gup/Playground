#include<bits/stdc++.h>
using namespace std;
int CountSpecificNumber(int m,int n);
bool checkNumber(int num);
int main()
{
	int m,n;
	cin>>m>>n;
	cout<<CountSpecificNumber(m,n);
	return 0;
}
int CountSpecificNumber(int m,int n)
{
  if(m>n)
    return -1;
  int count = 0;
  for(int i=m; i<=n; i++)
  {
    if(checkNumber(i))
      count++;
  }
  return count;
}

bool checkNumber(int num)
{
  while(num)
  {
    if(num%10 != 1 && num%10 != 4 && num%10 != 9)
      return false;
    num = num/10;
  }
  return true;
}