#include <iostream>
#include <iomanip>
#include "student.h"

class Tardies {
    // instance variables
private:

	Student students[50];    // list of students
    int numStudents;       // logical size of the array

public:
    // constructor
    Tardies();
	
    /** precondition: none
     *  postcondition: students array has been populated with
     *     Student objects from keyboard input. numStudents has 
     *     been updated to reflect the logical size of the 
     *     array student.
     */
    void enterData();

    /* @return the total number of tardies for all students
     *    in the class.
     */
    int getTotalTardies();
	
    /** precondition: none
     *  postcondition: a summary report has been printed which includes
     *     the total number of tardies for the entire class and a
     *     list of names and tardies for every student in the class.
     */
    void summaryReport();
};