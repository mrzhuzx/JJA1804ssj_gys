package com.ssm.teamgys.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 鑫杰、佳毅
 */
public class SmbmsAddress {
  @Id //这是一个主键
  @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
  private Long addId;
  private String addContact; //联系人
  private String addDesc;
  private String addPostCode;
  private String addTelPhone;
  private java.sql.Timestamp creationDate;
  private java.sql.Timestamp modifyDate;




}
