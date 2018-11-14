package com.tpig.model;

/**
 * @author Wang Ruoruo
 * @date 2018/11/14
 * @time 15:21
 **/
public class Token {



  public enum Token_Type {
    INT,            //      0|([1-9][0-9]*)
    FLOAT,          //      (0|([1-9][0-9]*)\.?[0-9]+)
    STRING,
    IDENTIFIER,      //      [a-zA-Z_][0-9a-zA-Z_]*
    KEYWORD,
    OPERATOR,       // + - * / += -= *= /= = == ! - && ||
    BRACKET,        // () {} []
  }

}
