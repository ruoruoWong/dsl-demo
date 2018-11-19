// Generated from /Users/jackwong/Documents/Program/ruoruo/dsl-demo/src/main/java/com/tpig/antlr/KiteDsl2.g4 by ANTLR 4.7
package com.tpig.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KiteDsl2Parser}.
 */
public interface KiteDsl2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KiteDsl2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(KiteDsl2Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KiteDsl2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(KiteDsl2Parser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KiteDsl2Parser#objectBodyExpr}.
	 * @param ctx the parse tree
	 */
	void enterObjectBodyExpr(KiteDsl2Parser.ObjectBodyExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KiteDsl2Parser#objectBodyExpr}.
	 * @param ctx the parse tree
	 */
	void exitObjectBodyExpr(KiteDsl2Parser.ObjectBodyExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KiteDsl2Parser#singleFieldExpr}.
	 * @param ctx the parse tree
	 */
	void enterSingleFieldExpr(KiteDsl2Parser.SingleFieldExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KiteDsl2Parser#singleFieldExpr}.
	 * @param ctx the parse tree
	 */
	void exitSingleFieldExpr(KiteDsl2Parser.SingleFieldExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KiteDsl2Parser#objectFieldExpr}.
	 * @param ctx the parse tree
	 */
	void enterObjectFieldExpr(KiteDsl2Parser.ObjectFieldExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KiteDsl2Parser#objectFieldExpr}.
	 * @param ctx the parse tree
	 */
	void exitObjectFieldExpr(KiteDsl2Parser.ObjectFieldExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KiteDsl2Parser#normalFieldExpr}.
	 * @param ctx the parse tree
	 */
	void enterNormalFieldExpr(KiteDsl2Parser.NormalFieldExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KiteDsl2Parser#normalFieldExpr}.
	 * @param ctx the parse tree
	 */
	void exitNormalFieldExpr(KiteDsl2Parser.NormalFieldExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KiteDsl2Parser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(KiteDsl2Parser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link KiteDsl2Parser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(KiteDsl2Parser.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link KiteDsl2Parser#fieldName}.
	 * @param ctx the parse tree
	 */
	void enterFieldName(KiteDsl2Parser.FieldNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link KiteDsl2Parser#fieldName}.
	 * @param ctx the parse tree
	 */
	void exitFieldName(KiteDsl2Parser.FieldNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link KiteDsl2Parser#packageName}.
	 * @param ctx the parse tree
	 */
	void enterPackageName(KiteDsl2Parser.PackageNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link KiteDsl2Parser#packageName}.
	 * @param ctx the parse tree
	 */
	void exitPackageName(KiteDsl2Parser.PackageNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link KiteDsl2Parser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(KiteDsl2Parser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link KiteDsl2Parser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(KiteDsl2Parser.PathContext ctx);
	/**
	 * Enter a parse tree produced by {@link KiteDsl2Parser#pathPiece}.
	 * @param ctx the parse tree
	 */
	void enterPathPiece(KiteDsl2Parser.PathPieceContext ctx);
	/**
	 * Exit a parse tree produced by {@link KiteDsl2Parser#pathPiece}.
	 * @param ctx the parse tree
	 */
	void exitPathPiece(KiteDsl2Parser.PathPieceContext ctx);
}