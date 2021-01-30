class StepTracker {
private:
	int m_minActiveSteps {0};
	int m_activeDays {0};
	int m_dailySteps {0};
	int m_days {0};

public:

	/*
		Constructor
	*/

	StepTracker(int minActiveSteps) {
		(*this).m_minActiveSteps = minActiveSteps;
	};

	//  accumulates information about steps, in readings taken once per day
	void addDailySteps(int steps); 

	// 	returns the number of active days
	int activeDays();

	//  returns the average number of steps per day, calculated by dividing the total number of steps taken by the number of days tracked
	double averageSteps();
	
};