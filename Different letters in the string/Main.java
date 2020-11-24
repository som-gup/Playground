#include <iostream>
#include <string.h>
using namespace std;
int main()
{
    string str1,str2;
    cin>>str1;
    cin>>str2;
  	int i,j;
    for(i=0, j=0;i<str1.length();i++)
    {
            if(str1[i]==str2[j])
                j++;
            else
                cout<<str1[i];  
    }
  	if(j==str1.length())
      	cout<<"NA";
    return 0;
}