// Generated from Z3proof.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Z3proofParser}.
 */
public interface Z3proofListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Z3proofParser#proof}.
	 * @param ctx the parse tree
	 */
	void enterProof(Z3proofParser.ProofContext ctx);
	/**
	 * Exit a parse tree produced by {@link Z3proofParser#proof}.
	 * @param ctx the parse tree
	 */
	void exitProof(Z3proofParser.ProofContext ctx);
	/**
	 * Enter a parse tree produced by {@link Z3proofParser#rules}.
	 * @param ctx the parse tree
	 */
	void enterRules(Z3proofParser.RulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Z3proofParser#rules}.
	 * @param ctx the parse tree
	 */
	void exitRules(Z3proofParser.RulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Z3proofParser#proof_rule}.
	 * @param ctx the parse tree
	 */
	void enterProof_rule(Z3proofParser.Proof_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link Z3proofParser#proof_rule}.
	 * @param ctx the parse tree
	 */
	void exitProof_rule(Z3proofParser.Proof_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link Z3proofParser#ruleList}.
	 * @param ctx the parse tree
	 */
	void enterRuleList(Z3proofParser.RuleListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Z3proofParser#ruleList}.
	 * @param ctx the parse tree
	 */
	void exitRuleList(Z3proofParser.RuleListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Z3proofParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(Z3proofParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Z3proofParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(Z3proofParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Z3proofParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(Z3proofParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Z3proofParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(Z3proofParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Z3proofParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(Z3proofParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Z3proofParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(Z3proofParser.ArgumentsContext ctx);
}