package com.tpig.core;

import com.tpig.antlr.KiteDslBaseVisitor;
import com.tpig.antlr.KiteDslLexer;
import com.tpig.antlr.KiteDslParser;
import com.tpig.antlr.KiteDslParser.ArrayFieldNameContext;
import com.tpig.antlr.KiteDslParser.CommonFieldNameContext;
import com.tpig.antlr.KiteDslParser.DefaultExprContext;
import com.tpig.antlr.KiteDslParser.DefaultValueContext;
import com.tpig.antlr.KiteDslParser.ExprContext;
import com.tpig.antlr.KiteDslParser.FormatExprContext;
import com.tpig.antlr.KiteDslParser.FormatValueContext;
import com.tpig.antlr.KiteDslParser.MultipleCommonFieldNameContext;
import com.tpig.antlr.KiteDslParser.OneCommonFieldNameContext;
import com.tpig.antlr.KiteDslParser.SimpleFieldNameContext;
import com.tpig.model.FieldNode;
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;

/**
 * @author Wang Ruoruo
 * @date 2018/11/14
 * @time 15:22
 **/
public class DslService {

  /**
   * roleList[0].roleName name age birthday(default:19900301,format:yyyyMMdd)
   */
  @Test
  public void test() {
    String express = "roleList[0].roleName(format:yyyyMMdd)\r\n"
        + "name\r\n";

    CharStream input = CharStreams.fromString(express);
    KiteDslLexer lexer = new KiteDslLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    KiteDslParser parser = new KiteDslParser(tokens);
    MultipleCommonFieldNameContext multipleCommonFieldNameContext = parser
        .multipleCommonFieldName();
    KiteDslVisitorTest vt = new KiteDslVisitorTest();
    FieldNode fieldNode = vt.visitMultipleCommonFieldName(multipleCommonFieldNameContext);
    System.out.println(multipleCommonFieldNameContext.getText());


  }

}

class KiteDslVisitorTest extends KiteDslBaseVisitor<FieldNode> {

  @Override
  public FieldNode visitExpr(ExprContext ctx) {
    System.out.println("visitExpr:" + ctx.getText());
    return super.visitExpr(ctx);
  }

  @Override
  public FieldNode visitMultipleCommonFieldName(MultipleCommonFieldNameContext ctx) {
    System.out.println("visitMultipleCommonFieldName:" + ctx.getText());
    List<OneCommonFieldNameContext> oneCommonFieldNameContexts = ctx.oneCommonFieldName();
    List<FieldNode> fieldNodeList = new ArrayList<FieldNode>();
    for (OneCommonFieldNameContext oneCommonFieldNameContext : oneCommonFieldNameContexts) {

      List<CommonFieldNameContext> commonFieldNameContextList = oneCommonFieldNameContext
          .commonFieldName();
      FieldNode previousFieldName = null;
      for (int i = 0; i < commonFieldNameContextList.size(); i++) {
        FieldNode fieldNode = new FieldNode();

      }

    }
    return super.visitMultipleCommonFieldName(ctx);
  }

  @Override
  public FieldNode visitOneCommonFieldName(OneCommonFieldNameContext ctx) {
    ctx.commonFieldName();
    System.out.println("visitOneCommonFieldName:" + ctx.getText());
    return super.visitOneCommonFieldName(ctx);
  }

  @Override
  public FieldNode visitCommonFieldName(CommonFieldNameContext ctx) {
    System.out.println("visitCommonFieldName:" + ctx.getText());
    return super.visitCommonFieldName(ctx);
  }

  @Override
  public FieldNode visitSimpleFieldName(SimpleFieldNameContext ctx) {
    System.out.println("visitSimpleFieldName:" + ctx.getText());
    return super.visitSimpleFieldName(ctx);
  }

  @Override
  public FieldNode visitArrayFieldName(ArrayFieldNameContext ctx) {
    System.out.println("visitArrayFieldName:" + ctx.getText());
    return super.visitArrayFieldName(ctx);
  }

  @Override
  public FieldNode visitDefaultExpr(DefaultExprContext ctx) {
    System.out.println("visitDefaultExpr:" + ctx.getText());
    return super.visitDefaultExpr(ctx);
  }

  @Override
  public FieldNode visitFormatExpr(FormatExprContext ctx) {
    System.out.println("visitFormatExpr:" + ctx.getText());
    return super.visitFormatExpr(ctx);
  }

  @Override
  public FieldNode visitDefaultValue(DefaultValueContext ctx) {
    System.out.println("visitDefaultValue:" + ctx.getText());
    return super.visitDefaultValue(ctx);
  }

  @Override
  public FieldNode visitFormatValue(FormatValueContext ctx) {
    System.out.println("visitFormatValue:" + ctx.getText());
    return super.visitFormatValue(ctx);
  }
}
