#include<iostream>
using namespace std;

int main()
{
  int tests;
  cin>>tests;
  while(tests--)
  {
    string str1, str2, result = "";
    cin>>str1>>str2;
    int len1, len2;
    len1 = str1.size();
    len2 = str2.size();
    int frequency[256] = {0};
    for(int i=0; i<len2; i++)
      frequency[str2[i]]++;
    for(int i=0; i<len1; i++)
    {
      if(frequency[str1[i]]!=0)
      {
        while(frequency[str1[i]])
        {
          result = result + str1[i];
          frequency[str1[i]]--;
        }
      }
    }
    cout<<result<<endl;
  }
  return 0;
}