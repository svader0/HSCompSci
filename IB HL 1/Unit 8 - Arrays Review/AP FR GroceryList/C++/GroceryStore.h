#ifndef GROCERY_STORE
#define GROCERY_STORE

#include "GroceryItem.h"


class GroceryStore
{
private:
	static constexpr int SIZE{ 50 };

	GroceryItem m_groceryList[SIZE];  // array of grocery items
	int m_numItems;               // number of items added to list
public:

	GroceryStore();

	// returns the price of this item
	double getPrice(const char * itemName);

	// returns the size (in ounces) of this item
	int getSize(const char * itemName);

	// Part (a)
	// changes the price of item associated with itemName
	void setPrice(const char * itemName, double price);

	// Part (b)
		// postcondition: returns the name of an item whose unit
	//                price is the lowest in the specified category;
	//                if no items in the specified category,
	//                returns "none".
	std::string bargainItem(const char* category);

	//idk it just prints out all the stuff in the store.
	void printString();
};

#endif