#include<iostream>
using namespace std;
int main()
{
	int n,i,j,count;
	cin>>n;
	int a[n],psc[n];
	for(i=0;i<n;i++)
		cin>>a[i];
	for(i=0;i<n;i++)
	{
		count=0;
		for(j=0;j<i;j++)
		{
			if(a[i]<a[j])
				count++;
		}
		psc[i]=count;
	}
	for(i=0;i<n;i++)
		cout<<psc[i]<<" ";
}