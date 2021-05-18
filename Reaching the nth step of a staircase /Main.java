#include <iostream>
using namespace std;

int staircase(int A[], int cs, int n)
{
  if(cs == n)
    return 1;
  if (cs > n)
    return 0;
  
  if(A[cs] != -1)
    return A[cs];
  
  int totalways = staircase(A, cs+1, n) + staircase(A, cs+2, n);
  A[cs] = totalways;
  
  return totalways;
}
int staircase_opt(int cs, int n)
{
  int A[n+1];
  for(int i = 0; i <= n; i++)
    A[i] = -1;
  
  return staircase(A, 0, n);
}
int main() 
{
   int n;
  cin >> n;
  cout << staircase_opt(0,n);
    return 0;
}