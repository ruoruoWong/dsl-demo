package com.tpig.core;

import com.tpig.antlr.KiteDsl2Lexer;
import com.tpig.antlr.KiteDsl2Parser;
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
    String express = "class xxx.xxx.User[] -> /Users/User {\n"
        + "  id -> Id;\n"
        + "  name -> Name;\n"
        + "  (roleList[] -> Roles/Role){\n"
        + "    id -> Id;\n"
        + "    name -> Name;\n"
        + "    (subRole[] -> SubRoles/SubRole){\n"
        + "      id -> Id;\n"
        + "      name -> Name;\n"
        + "    };\n"
        + "  };\n"
        + "  (group -> Group){\n"
        + "    id -> Id;\n"
        + "    name -> Name;\n"
        + "  };\n"
        + "}";

    CharStream input = CharStreams.fromString(express);
    KiteDsl2Lexer lexer = new KiteDsl2Lexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    KiteDsl2Parser parser = new KiteDsl2Parser(tokens);

    System.out.println(parser.expr());


  }

}
