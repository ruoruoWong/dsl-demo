package com.tpig.model;

/**
 * @author Wang Ruoruo
 * @date 2018/11/14
 * @time 17:58
 **/
public class FieldNode {

  private String fieldName;

  private String defaultValue;

  private String format;

  private FieldNode next;

  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public String getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }

  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public FieldNode getNext() {
    return next;
  }

  public void setNext(FieldNode next) {
    this.next = next;
  }
}
