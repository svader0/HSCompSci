#include "tardies.h"

    // constructor
    Tardies::Tardies()
    {
        Student students[50];   // instantiate array
        int numStudents {0};
    }
	
    /** precondition: none
     *  postcondition: students array has been populated with
     *     Student objects from keyboard input. numStudents has 
     *     been updated to reflect the logical size of the 
     *     array student.
     */
	 
    void Tardies::enterData()
    {
		std::string in_firstname{};
		std::string in_lastname{};
		std::string in_tardies{};
		bool isEntering{true};

		for (int i = 0; i < 50; i++) 
		{
			

			std::cout << "student " << i + 1 << " first name --> ";
			std::cin >> in_firstname;
			std::cout << "student " << i + 1 << " last name --> ";
			std::cin >> in_lastname;
			std::cout << "student " << i + 1 << " tardies --> ";
			std::cin >> in_tardies;
			students[i] = Student(in_lastname, in_firstname, std::stoi(in_tardies));
			numStudents++;

			std::cout << "\nEnter another student? [y/n]\n\n --> ";
			std::string input;
			std::cin >> input;
			if (input == "n") 
			{
				break;
			}
		}
    }

    /* @return the total number of tardies for all students
     *    in the class.
     */

    int Tardies::getTotalTardies()
    {
		int total {0};
		for (int i = 0; i < numStudents; i++) 
		{
			total += students[i].getTardies();
		}
		return total;
    }
	
    /** precondition: none
     *  postcondition: a summary report has been printed which includes
     *     the total number of tardies for the entire class and a
     *     list of names and tardies for every student in the class.
     */

    void Tardies::summaryReport()
    {
		std::cout << "\n\n\n\n\n" << "\nSUMMARY REPORT\nLast           First     Tardies\n================================\n";
		for (int i = 0; i < numStudents; i++) 
		{
			std::cout << std::setw(15) << std::left << students[i].getFirstName() << " " << students[i].getLastName() << " " << std::setw(7) << std::right << students[i].getTardies() << "\n";
		}
    }