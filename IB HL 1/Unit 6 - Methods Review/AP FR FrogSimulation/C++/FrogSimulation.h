#ifndef FROGSIM
#define FROGSIM
#include<ctime>

class FrogSimulation {
private:

	int maxHops;
	int goalDistance;

public:

	FrogSimulation(int dist, int numHops);
	int hopDistance();
	bool simulate();
	double runSimulations(int num);

};
#endif