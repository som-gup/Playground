#include <iostream>
using namespace std;

int main()
{
int yr;
cin>>yr;
if(yr%100==0){
		if(yr%400==0)
		        {	
		            cout<<"LEAP YEAR";	         
		        }
		else
		{	 
		    cout<<"NOT LEAP YEAR";   
		}
}
else if(yr%4==0)
{		 
  cout<<"LEAP YEAR";		
}
else
{	 
  cout<<"NOT LEAP YEAR";       	
}
return 0;
}