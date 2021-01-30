#include <iostream>
#include "GroceryStore.h"

#define PRINT(x) std::cout << x << std::endl; //macro

/*
 *     AP FR GroceryList
 *     By Sam Vader 
 *     1/29/21
 */

int main() {
    GroceryStore store;

    store.printString();
    PRINT("\n");

    PRINT("Test setPrice method");
    PRINT("====================");

    store.setPrice("milk", 1.92);
    store.setPrice("porkchops", 2.24);

    PRINT("milk changed from 1.78 to 1.92");
    PRINT("porkchops changed from 2.02 to 2.24");
    PRINT("\n");

    store.printString();
    PRINT("\n");

    PRINT("Test bargainItem method");
    PRINT("=======================");

    PRINT("Produce = " + store.bargainItem("P"));
    PRINT("Meat    = " + store.bargainItem("M"));
    PRINT("Bread   = " + store.bargainItem("B"));
    PRINT("\n");
}