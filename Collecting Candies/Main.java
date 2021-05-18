#include<bits/stdc++.h>
using namespace std;

int main()
{
  int test;
  cin>>test;
  while(test--)
  {
    int boxes, total, t1, t2, temp;
    cin>>boxes;
    priority_queue<int, vector<int>, greater<int> > candies;
    for(int i=0; i<boxes; i++)
    {
      cin>>temp;
      candies.push(temp);
    }
    while(candies.size()>1)
    {
      t1 = candies.top();
      candies.pop();
      t2 = candies.top();
      candies.pop();
      total = total + t1+t2;
      candies.push(t1+t2);
    }
    cout<<total<<endl;
  }
  return 0;
}