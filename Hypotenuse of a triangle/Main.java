#include <iostream>
#include<math.h>
using namespace std;

int main() 
{
  float a,b;
  cin>>a>>b;
  float hypotu;
  hypotu = sqrt(((a*a) + (b*b)));
  printf("%0.2f", hypotu);
}