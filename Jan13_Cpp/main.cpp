#include <iostream>

Macro("DOUBLE", 2*x)

#define DOUBLE(x) 2*x

using namespace std;

void *pVoid = NULL;

void f() {
    static char *sv = "PLDJan15";
    pVoid = sv;
}

class X{};

int main() {
    int xx = 3;
    std::cout << DOUBLE(xx) << endl;


    int varUnInit;
    f();
   X *x = new X();
    x = NULL;

    cout << pVoid << endl;//0x7ffee9c66a48

//    *(int *)pVoid = 7;


    cout << *((int *)pVoid) << ", " << varUnInit << std::endl;
    return 0;
}