#ifndef GROCERY_ITEM
#define GROCERY_ITEM

#include <iostream>
#include <string>
#include <iomanip>

/*

	This header file defines the methods for the GroceryItem class
	Usually I wouldn't put definitions in a header file, but the class itself isn't too complex.

*/

class GroceryItem
{
private:

    // instance variables
    std::string m_itemName;
    double m_itemPrice;
    int m_itemSize;
    std::string m_itemCategory;

public:
    GroceryItem() = default; // just so the compiler doesn't yell at me for not having a default constructor
    GroceryItem(const char * n, double p, int s, const char * c)
    {
        m_itemName = n;
        m_itemPrice = p;
        m_itemSize = s;
        m_itemCategory = c;
    }

    void setItemName(const char * n)
    {
        m_itemName = n;
    }

    void setItemPrice(double p)
    {
        m_itemPrice = p;
    }

    void setItemSize(int s)
    {
        m_itemSize = s;
    }

    void setItemCategory(const char * c)
    {
        m_itemCategory = c;
    }

    std::string getItemName()
    {
        return m_itemName;
    }

    double getItemPrice()
    {
        return m_itemPrice;
    }

    int getItemSize()
    {
        return m_itemSize;
    }

    std::string getItemCategory()
    {
        return m_itemCategory;
    }

    void printItem()
    {
        std::cout << std::setw(10) << m_itemName
            << " | " << m_itemPrice 
            << " | " << std::setw(2) << m_itemSize
            << " | " << m_itemCategory << "\n";
    }
};
#endif