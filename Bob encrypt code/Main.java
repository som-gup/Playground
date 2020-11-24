#include<iostream>
using namespace std;
#include<math.h>
int main()
{
	long int s,n,m,ans;
	cin>>s>>n>>m;
	ans = pow(s,n);
	ans = ans%10;
	ans = pow(ans,m);
	ans = ans%1000000007;
	cout<<ans;
	return 0;
}