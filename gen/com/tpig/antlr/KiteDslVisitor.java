// Generated from /Users/jackwong/Documents/Program/ruoruo/dsl-demo/src/main/java/com/tpig/antlr/KiteDsl.g4 by ANTLR 4.7
package com.tpig.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link KiteDslParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface KiteDslVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link KiteDslParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(KiteDslParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KiteDslParser#multipleCommonFieldName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleCommonFieldName(KiteDslParser.MultipleCommonFieldNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link KiteDslParser#oneCommonFieldName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOneCommonFieldName(KiteDslParser.OneCommonFieldNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link KiteDslParser#commonFieldName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommonFieldName(KiteDslParser.CommonFieldNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link KiteDslParser#simpleFieldName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleFieldName(KiteDslParser.SimpleFieldNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link KiteDslParser#arrayFieldName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayFieldName(KiteDslParser.ArrayFieldNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link KiteDslParser#defaultExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultExpr(KiteDslParser.DefaultExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KiteDslParser#formatExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormatExpr(KiteDslParser.FormatExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KiteDslParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(KiteDslParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link KiteDslParser#formatValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormatValue(KiteDslParser.FormatValueContext ctx);
}