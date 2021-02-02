#ifndef NUMBER_RUNS
#define NUMBER_RUNS

#include <random>

struct NumberCube
{
    /** @return an integer value between 1 and 6, inclusive */
    int toss()
    {
        return static_cast<int>(rand() % 6 + 1);
    }
};

#endif