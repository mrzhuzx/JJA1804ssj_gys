package com.ssm.teamgys.entity;


import lombok.Data;

import javax.annotation.Generated;
import javax.persistence.*;

@Entity
@Table(name = "dog")
@Data // get/set/toString
public class Dog {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
  private long dogId;
  private String dogName;


}
