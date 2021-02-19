#include <iostream>

/*
 * Class Base
 * Class Derived : public Base
 * to obtain a pointer to the virtual table which is the most sacred Holy grail structure that
 * a C++ compiler creates to facilitate dynamic dispatch
 * new Derived -> pointer to the layout of Derived
 * */

using namespace std;

class Base {
public:
    //void (*)()
    virtual void m1() {
        cout << "Base:m1" << endl;
    }
    virtual void m2() {
        cout << "Base:m2" << endl;
    }
};

class Derived : public Base {
private:
    virtual void m1() {
        cout << "Derived:m1" << endl;
    }
    virtual void m2() {
        cout << "Derived:m2" << endl;
    }
    virtual void m3() {
        cout << "Derived:m3" << endl;
    }
};

int main() {
    long somevar = 7;
    long *p1 = &somevar;
    Base * pp = new Derived();
    pp->m1();

    cout << "address of somevar: " << &somevar << ", p1: " << p1 << ", the value of the loc to which p1 points to: " << *p1 << endl;

    long *vtable = *(long **)(new Derived());
//    void (*fptr)();
    ((void (*)())vtable[0])();
//    fptr();
    return 0;
}
