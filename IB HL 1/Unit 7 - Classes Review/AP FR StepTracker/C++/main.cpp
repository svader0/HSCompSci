#include <iostream>
#include "steptracker.hpp" //           <----    header file import
#define PRINT(x) std::cout << x << std::endl //  macro for easy printing :)
#define SPACE std::cout << "\n\n\n\n\n";

int main() {
		PRINT("\n\nAP FR StepTracker:\n==================");
		SPACE;

		StepTracker tr(10000);
        PRINT("Active day consists of at least 10,000 steps.");
        PRINT("Current Days Active: " << tr.activeDays());
        PRINT("Average Number of Steps: " << tr.averageSteps());
		
		PRINT("\n");
        tr.addDailySteps(9000);
        PRINT("9000 steps today, not enough to meet active goal.");
        
		PRINT("\n");
        tr.addDailySteps(5000);
        PRINT("5000 steps today, not enough to meet active goal.");
        PRINT("Current Days Active: " << tr.activeDays());
        PRINT("Average Number of Steps: " << tr.averageSteps());
		
		PRINT("\n");
        tr.addDailySteps(13000);
        PRINT("13000 steps today, met active goal!");
        PRINT("Current Days Active: " << tr.activeDays());
        PRINT("Average Number of Steps: " << tr.averageSteps());
		
		PRINT("\n");
        tr.addDailySteps(23000);
        PRINT("23000 steps today, met active goal!");
		
		PRINT("\n");
        tr.addDailySteps(1111);
        PRINT("1111 steps today, not enough to meet active goal.");
        PRINT("Current Days Active: " << tr.activeDays());
        PRINT("Average Number of Steps: " << tr.averageSteps()); 
}