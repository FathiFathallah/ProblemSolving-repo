#include <iostream>

using namespace std;

string repetition(string txt, int n) {
	if(n == 1) return txt;
	return (repetition(txt,n-1)+txt);
}

int main()
{
    string x;
    cin>>x;
    int n;
    cin>>n;
    cout << repetition(x,n);
    return 0;
}
