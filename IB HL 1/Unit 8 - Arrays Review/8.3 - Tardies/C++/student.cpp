#include "student.h"
    
    // Default Constructor
    Student::Student()
    {
        lastName="";
        firstName="";
        tardies=0;
    }
    
    // Second Constructor
    Student::Student(std::string l, std::string f, int t)
    {
        lastName = l;
        firstName = f;
        tardies = t;
    }
    
    // Accessor Methods
    std::string Student::getLastName()
    {
        return lastName;
    }
	
    std::string Student::getFirstName()
    {
        return firstName;
    }

    int Student::getTardies()
    {
        return tardies;
    }
    
    // Mutator Methods
    void Student::setLastName(std::string l)
    {
        lastName = l;
    }
    
	void Student::setFirstName(std::string f)
    {
        firstName = f;
    }
    
    void Student::setTardies(int t)
    {
        tardies = t;
    }
    
    // toString Method
    std::string Student::toString()
    {
        std::string str = "First Name = " + firstName + "\n" + "Last Name   = " + lastName + "\n" + "Tardies       = " + std::to_string(tardies) + "\n";
              
        return str;
    }