.PHONY: all clean main
PROJECT_NAME = calc
CC = g++ -std=c++17

all: main

main: clean
	$(CC) *.cc -o model_core.out

clean:
	rm -f *.o *.gcno *.gcda *.info *.out */.clang-format .clang-format *.a model/*.gch
	rm -rf ./report/ *.dSYM
	@clear
