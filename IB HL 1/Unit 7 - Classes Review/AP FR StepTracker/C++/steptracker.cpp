#include "steptracker.hpp"
#include <cmath> // for -NaN detection

void StepTracker::addDailySteps(int steps) {
	m_dailySteps += steps;
	m_days++;
	if (steps > m_minActiveSteps) {
		m_activeDays++;
	}
};

int StepTracker::activeDays() {
	return this->m_activeDays;
};

double StepTracker::averageSteps() {
	double avg = (static_cast<double>(m_dailySteps) / static_cast<double>(m_days));
	if (std::isnan(avg)) {
		return 0;
	}
	else { return avg; }

};