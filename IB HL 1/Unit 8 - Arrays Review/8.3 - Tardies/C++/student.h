#include <string>
#include <iostream>

class Student
{

private:

    // Instance Variables
    std::string lastName;
    std::string firstName;
    int tardies;
    
public:

    // Default Constructor
    Student();
    
    // Second Constructor
    Student(std::string l, std::string f, int t);
    
    // Accessor Methods
    std::string getLastName();
    std::string getFirstName();
    int getTardies();
    
    // Mutator Methods
    void setLastName(std::string l);
    void setFirstName(std::string f);
    void setTardies(int t);
    
    // toString Method
    std::string toString();
};