#include<iostream>
using namespace std;
bool hack(long long,long long);
 
int main()
{
	int tests;
	cin>>tests;
	for(int i=0;i<tests;i++)
	{
		long long target;
		cin>>target;
		if(hack(target,1))
			cout<<"Yes"<<endl;
		else cout<<"No"<<endl;
	}
	return 0;
}
bool hack(long long target,long long current)
{
	if(current==target) return true;
	else if(current>target) return false;
	else
	{
		if(hack(target,10*current))
			return true;
		if(hack(target,20*current))
			return true;
	}
	return false;
}