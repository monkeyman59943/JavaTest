#include <iostream>
#include "TestClass.h"

using namespace std;




int main(int argc, char* argv[])
{

TestClass x;
x.set_Values(2);
cout << "This compiled" << endl;
cout << "This is x: " << x.amout << endl;
return 0;
}

