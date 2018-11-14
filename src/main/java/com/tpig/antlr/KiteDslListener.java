// Generated from /Users/jackwong/Documents/Program/ruoruo/dsl-demo/src/main/java/com/tpig/antlr/KiteDsl.g4 by ANTLR 4.7
package com.tpig.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KiteDslParser}.
 */
public interface KiteDslListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KiteDslParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(KiteDslParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KiteDslParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(KiteDslParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KiteDslParser#multipleCommonFieldName}.
	 * @param ctx the parse tree
	 */
	void enterMultipleCommonFieldName(KiteDslParser.MultipleCommonFieldNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link KiteDslParser#multipleCommonFieldName}.
	 * @param ctx the parse tree
	 */
	void exitMultipleCommonFieldName(KiteDslParser.MultipleCommonFieldNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link KiteDslParser#oneCommonFieldName}.
	 * @param ctx the parse tree
	 */
	void enterOneCommonFieldName(KiteDslParser.OneCommonFieldNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link KiteDslParser#oneCommonFieldName}.
	 * @param ctx the parse tree
	 */
	void exitOneCommonFieldName(KiteDslParser.OneCommonFieldNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link KiteDslParser#commonFieldName}.
	 * @param ctx the parse tree
	 */
	void enterCommonFieldName(KiteDslParser.CommonFieldNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link KiteDslParser#commonFieldName}.
	 * @param ctx the parse tree
	 */
	void exitCommonFieldName(KiteDslParser.CommonFieldNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link KiteDslParser#simpleFieldName}.
	 * @param ctx the parse tree
	 */
	void enterSimpleFieldName(KiteDslParser.SimpleFieldNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link KiteDslParser#simpleFieldName}.
	 * @param ctx the parse tree
	 */
	void exitSimpleFieldName(KiteDslParser.SimpleFieldNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link KiteDslParser#arrayFieldName}.
	 * @param ctx the parse tree
	 */
	void enterArrayFieldName(KiteDslParser.ArrayFieldNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link KiteDslParser#arrayFieldName}.
	 * @param ctx the parse tree
	 */
	void exitArrayFieldName(KiteDslParser.ArrayFieldNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link KiteDslParser#defaultExpr}.
	 * @param ctx the parse tree
	 */
	void enterDefaultExpr(KiteDslParser.DefaultExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KiteDslParser#defaultExpr}.
	 * @param ctx the parse tree
	 */
	void exitDefaultExpr(KiteDslParser.DefaultExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KiteDslParser#formatExpr}.
	 * @param ctx the parse tree
	 */
	void enterFormatExpr(KiteDslParser.FormatExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KiteDslParser#formatExpr}.
	 * @param ctx the parse tree
	 */
	void exitFormatExpr(KiteDslParser.FormatExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KiteDslParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(KiteDslParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link KiteDslParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(KiteDslParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link KiteDslParser#formatValue}.
	 * @param ctx the parse tree
	 */
	void enterFormatValue(KiteDslParser.FormatValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link KiteDslParser#formatValue}.
	 * @param ctx the parse tree
	 */
	void exitFormatValue(KiteDslParser.FormatValueContext ctx);
}