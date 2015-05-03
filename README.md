# Z3Parse

The purpose of **Z3Parse** is to take user-input in the form of an [SMT formula](en.wikipedia.org/wiki/Satisfiability_modulo_theories), pipe that formula to [Z3py](https://github.com/z3prover/z3/wiki) in an attempt to solve it. If the formula is not satisfiable, counter examples will be printed to stdout; otherwise, a human-readable format of the Z3py proof is printed to stdout.

## Contributing 

Z3Parse welcomes pull requests from other users and will be merged so long as they do not cause regression which can be noted by unit tests. At the time of writing this, however, a thorough set of unit tests has not yet been committed to the repository so pull requests will be merged with caution. It is encouraged to focus on submitting pull requests containing unit tests before attempting to modify any component in the Z3Parse chain.

### Unit Tests

Notwithstanding the "tests" currently found in the tests folder, each simpler test program should target at most a couple of the rules in the grammar and the targeted rules should be reflected in the filename of the test program. For example, if a script is written to test the `expression` grammar rule then `expression` should be found somewhere in the filename of the test program.

<!-- To add: **Z3Parse** provided the grammar located at `parser/Z3proof.g4` to [ANTLR v4](https://github.com/antlr/antlr4) in order to generate a parser for the grammar for reformatting Z3py proofs. -->
