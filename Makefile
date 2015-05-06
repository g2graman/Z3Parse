.PHONY: all clean install parse run

all: clean install parse run

install:
	@scripts/install_z3 || :

clean:
	@scripts/clean || :

parse:
	scripts/generate_parser

run:
	scripts/run_z3
