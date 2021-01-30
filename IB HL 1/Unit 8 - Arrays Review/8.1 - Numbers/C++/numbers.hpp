#include <stdlib.h>

class Numbers {
private:
	constexpr static int numSize = 20;
	int nums[20];
	int positives[20];
	int negatives[20];
	int p {0}; // logic size of positives array
	int n {0}; // logical size of negative array

public:
	/** precondition: none
     *  postcondition: nums has been populated with random numbers
     *     in the range of -100 to 100.
     */
	void populateNums();
	
	/** precondition: none
     *  postcondition: positives has been populated with all the
     *     numbers in nums that were positive. The variable p has
     *     has been updated to reflect the logical size of
     *     positives array.
     */
	void populatePositives();

	/** precondition: none
     *  postcondition: negatives has been populated with all the
     *     numbers in nums that were negative. The variable n has
     *     has been updated to reflect the logical size of
     *     negatives array.
     */
	void populateNegatives(); 

	/** precondition: size >=0
     *  postcondition: all the values of array have been printed 
     *     from index 0 to the logical size of the array.
     *  @param array the array to be printed.
     *  @param size the logical size of array
     */
	void print(int (&arr)[20], const int size);
	
	/** precondition: none
     *  postcondition: all three arrays have been printed with 
     *     appropriate labelling.
     */
	void printArrays();

};