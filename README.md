# Z3Parse

The purpose of **Z3Parse** is to take user-input in the form of an [SMT formula](en.wikipedia.org/wiki/Satisfiability_modulo_theories), pipe that formula to [Z3py](https://github.com/z3prover/z3/wiki) in an attempt to solve it. If the formula is not satisfiable, counter examples will be printed to stdout; otherwise, a human-readable format of the Z3py proof is printed to stdout.

----------------------------

## Contributing 

Z3Parse welcomes pull requests from other users and will be merged so long as they do not cause regression which can be noted by unit tests. At the time of writing this, however, a thorough set of unit tests has not yet been committed to the repository so pull requests will be merged with caution. It is encouraged to focus on submitting pull requests containing unit tests before attempting to modify any component in the Z3Parse chain.

=======================================================

### Unit Tests

Notwithstanding the "tests" currently found in the tests folder, each simpler test program should target at most a couple of the rules in the grammar and the targeted rules should be reflected in the filename of the test program. For example, if a script is written to test the `expression` grammar rule then `expression` should be found somewhere in the filename of the test program.

=======================================================

### Changing the grammar

It is not recommended that, for a quick modification, at least, you add or remove any lexer rules (the rules in `parser/Z3proof.g4` in all caps such as `ASSERTED`) or parser rules (all the other rules, such as `proof_rule`). This could cause adverse affects for the current build chain because when you regenerate the parser `parser/main.py` and `parser/Z3proofFormatter.py` will no longer necessarily correspond to the grammar. That said, 

=======================================================

### More on the build chain
To start the automated build process, simply use `make`. Once invoked, `make` will subsequently invoke `scripts/clean` which will remove all**<sup>1</sup>** files that match entries in `.gitignore` and format all python *.py* files to conform to [PEP8](https://www.python.org/dev/peps/pep-0008/). After invoking `scripts/clean`, `make` subsequently invokes `scripts/install_z3` which installs [A python runtime of the Z3 Theorem Prover by Microsoft Research](https://github.com/z3prover/z3). Finally, `make` invokes `scripts/generate_parser` to handle ANTLR dependencies and provide the grammar located at `parser/Z3proof.g4` to [ANTLR](https://github.com/antlr/antlr4) in order to generate a parser for the grammar for reformatting Z3py proofs.

**<sup>1</sup>** The directory `z3` (which is generated during the build process but not tracked under version control) is omitted from the clean script (but still in `.gitignore`) to emulate a build cache so it would not need to be rebuilt. 
