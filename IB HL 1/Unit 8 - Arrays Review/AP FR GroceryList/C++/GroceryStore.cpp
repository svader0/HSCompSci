#include "GroceryStore.h"
#include "GroceryItem.h"

/*

	This file contains method definitions for the GroceryStore class methods. 
	All declarations are made in .h file

*/



GroceryStore::GroceryStore()
{

    m_groceryList[0] = GroceryItem(("avocado"), 1.68, 8, "P");
    m_groceryList[1] = GroceryItem("milk", 1.78, 64, "D");
    m_groceryList[2] = GroceryItem("chicken", 4.48, 64, "M");
    m_groceryList[3] = GroceryItem("broccoli", 1.92, 16, "P");
    m_groceryList[4] = GroceryItem("yogurt", 0.96, 16, "D");
    m_groceryList[5] = GroceryItem("spinach", 1.76, 16, "P");
    m_groceryList[6] = GroceryItem("cornedbeef", 6.72, 48, "M");
    m_groceryList[7] = GroceryItem{ "porkchops", 2.02, 32, "M" };

    m_numItems = 8;  // number of items added to list (you know, because of index 0.)
}

double GroceryStore::getPrice(const char * itemName) {
    for (int i = 0; i < m_numItems; i++)
    {
        if (m_groceryList[i].getItemName() == (itemName))
        {
            return m_groceryList[i].getItemPrice();
        }
    }
    return -1;  // not found	
}

int GroceryStore::getSize(const char* itemName) {
    for (int i = 0; i < m_numItems; i++)
    {
        if (m_groceryList[i].getItemName() == (itemName))
        {
            return m_groceryList[i].getItemSize();
        }
           
    }
    return -1;  // not found		
}

void GroceryStore::setPrice(const char * itemName, double price) 
{
    for (int i = 0; i < m_numItems; i++)
    {
        if (m_groceryList[i].getItemName() == (itemName))
        {
            m_groceryList[i].setItemPrice(price);
        }
    }
    
}

	// 	BARGAN_ITEM
	// postcondition: returns the name of an item whose unit
	//                price is the lowest in the specified category;
	//                if no items in the specified category,
	//                returns "none".

std::string GroceryStore::bargainItem(const char* category)
{
    std::string lowestItem{};
    double lowestPrice{1000.0};
    for (int i = 0; i < m_numItems; i++)
    {
        if (category == m_groceryList[i].getItemCategory())
        {
            if ((m_groceryList[i].getItemPrice() / m_groceryList[i].getItemSize()) < lowestPrice) 
            {
                lowestItem = m_groceryList[i].getItemName();
                lowestPrice = m_groceryList[i].getItemPrice();
            }
         }
    }
    if (lowestItem == "") 
    {
        return "none";
    }
    else return lowestItem;
}

void GroceryStore::printString()
{
	std::cout << "\n === STORE INVENTORY === \n\n";
    for (int i = 0; i < m_numItems; i++)
    {
        m_groceryList[i].printItem();
    }
}