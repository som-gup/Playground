#include <iostream>
using namespace std;

int main() 
{
  int num;
  cin>>num;
  int l1, p1;
  cin>>l1>>p1;
  int l2, p2;
  cin>>l2>>p2;
  int smallprice, smallquant, largeprice, largequant;
  if(p1<p2)
  {
    smallprice = p1;
    smallquant = l1;
    largeprice = p2;
    largequant = l2;
  }
  else
  {
    smallprice = p2;
    smallquant = l2;
    largeprice = p1;
    largequant = l1;
  }
  if(num%smallquant == 0)
  {
    cout<<((num/smallquant) * smallprice);
  }
  else
  {
    int count = 0;
    while(1)
    {
      num = num - largequant;
      count++;
      if(num%smallquant == 0)
      {
        cout<<((num/smallquant) * smallprice) + count*largeprice;
        break;
      }
    }
  }
 }