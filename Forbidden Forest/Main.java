#include <bits/stdc++.h> 
using namespace std; 
void reverseWords(string str) 
{ 
    stack<char> st; 
    string temp = "";
    string current = "";
    for (int i = 0; i < str.length(); ++i) { 
        if (str[i] != ' ') 
            st.push(str[i]); 
        else 
        { 
            while (st.empty() == false) 
            { 
                char ch = st.top();
                current = current + ch;
                st.pop(); 
            } 
            temp = current;
            reverse(temp.begin(), temp.end());
            if(current != temp)
                cout << current;
            else
                cout << "$" << temp << "$";
            cout << " "; 
            temp = "";
            current = "";
        } 
    } 
    		while (st.empty() == false) 
            { 
                char ch = st.top();
                current = current + ch;
                st.pop(); 
            } 
            
            temp = current;
            reverse(temp.begin(), temp.end());
            if(current != temp)
                cout << current;
            else
                cout << "$" << temp << "$";
            cout << " "; 
            temp = "";
            current = "";
} 
 

int main() 
{ 
    string str;
    getline(cin, str);
    reverseWords(str); 
    return 0; 
}