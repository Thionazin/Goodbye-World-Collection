#include <iostream>

int main(int c, char *argv[]) {
	std::cout << "Goodbye world" << std::endl;
	remove("goodbye_world.cpp");
	remove(argv[0]);
}
