.PHONY: all clean install parse

all: clean install parse

install:
	@scripts/install_z3 || :

clean:
	@scripts/clean || :

parse:
	scripts/generate_parser
	#scripts/parse
