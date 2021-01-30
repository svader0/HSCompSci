#include "FrogSimulation.h"

#include<cstdlib>
#include<iostream>

#define JUMPING_ODDS 10

/** Constructs a FrogSimuation where dist is the distance, in inches, from the starting
*  position to the goal, and numHops is the maximum number of hops allowed to reach the goal.
*  Precondition: dist > 0; numHops > 0;
*/

FrogSimulation::FrogSimulation(int dist, int numHops)
{
	goalDistance = dist;
	maxHops = numHops;
}

/** Returns an integer representing the distance, in inches, to be moved when the frog hops.
*/

int FrogSimulation::hopDistance()
{
	int odds = (int)(1 + (rand() % JUMPING_ODDS));
	int num = 0;
	if (odds <= 8)
	{
		num = (int)(1 + (rand() % 8));   // range 1 to 8
		return num;
	}
	else
	{
		num = (int)(1 + (rand() % 8));   // range 1 to 8
		return -num;
	}
}

// Part A
/* Simulates a frog attempting to reach the goal as described in part (a).
* Returns true if the frog successfully reached or passed the goal during the simulation;
false otherwise.
*/
bool FrogSimulation::simulate()
{
	int position{ 0 }; //current position
	int hops{ 0 }; // current amount of hops

	while (true)
	{
		position = position + hopDistance();
		hops++;

		if (position < 0) {
			break;
		}
		if (position >= goalDistance) {
			break;
		}
		if (hops >= maxHops) {
			break;
		}

	}
	return (position >= goalDistance ? true : false);
}

// Part B
/** Runs num simulations and returns the proportion of simulations in which the frog
*  successfully reached or passed the goal.
*  Precondition: num > 0
*/

double FrogSimulation::runSimulations(int num)
{
	int passedGoal{ 0 };
	for (int i = 0; i < num; i++) {
		if (simulate()) {
			passedGoal++;
		}
	}
	double proportion = (static_cast<double>(passedGoal) / num);
	return proportion;
}