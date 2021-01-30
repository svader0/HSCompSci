#include <iostream>
#include "FrogSimulation.h"
#include <ncurses.h>
#include <stdio.h>
#include <string>


int main() {
	srand(time(0));
	initscr();
	start_color();
	init_pair(1, COLOR_GREEN, COLOR_BLACK);
	init_pair(2, COLOR_RED, COLOR_BLACK);

	attron(COLOR_PAIR(1));
	mvprintw(2, 5, "Press any key to start the simulation...   ");
	attroff(COLOR_PAIR(1));
	getch();
	clear();
	refresh();

	FrogSimulation sim1(12, 9);    // 12 goal, 9 hops
	FrogSimulation sim2(10, 2);    // 10 goal, 2 hops
	FrogSimulation sim3(20, 6);    // 20 goal,6 hops
	FrogSimulation sim4(30, 12);    // 30 goal, 12 hops

	mvprintw(1, 5, "This proportion should trend in the high range: ");
	mvprintw(2, 5, "FrogSimulation sim1(12,9) -->");

	mvprintw(4, 5, "This proportion should trend in the low range.");
	mvprintw(5, 5, "FrogSimulation sim2(10,2) -->");

	mvprintw(7, 5, "This proportion should trend in the lower middle range.");
	mvprintw(8, 5, "FrogSimulation sim3(20,6) -->");

	mvprintw(10, 5, "This proportion should trend in the higher middle range.");
	mvprintw(11, 5, "FrogSimulation sim4(30,12) -->");

	attron(COLOR_PAIR(1));
		mvprintw(2, 39, "Proportion: %f", sim1.runSimulations(50));
		mvprintw(5, 39, "Proportion: %f", sim2.runSimulations(50));
		mvprintw(8, 39, "Proportion: %f", sim3.runSimulations(50));
		mvprintw(11, 39, "Proportion: %f", sim4.runSimulations(50));
	attroff(COLOR_PAIR(1));
	attron(COLOR_PAIR(2));
		mvprintw(15, 39, "(e) exit   (r) repeat ...   ");
	attroff(COLOR_PAIR(2));

	char input{};
	input = getch();

	if (input == 'r') {
		clear();
		main();
	}
	else
		endwin();
	std::cout << "Application exited with code 0" << std::endl;
	return 0;
}