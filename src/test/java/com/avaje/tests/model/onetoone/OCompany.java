package com.avaje.tests.model.onetoone;

import com.avaje.tests.model.basic.BasicDomain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class OCompany extends BasicDomain {

  @Column(length = 50, unique = true)
  public String corpId;

  public String getCorpId() {
    return corpId;
  }

  public void setCorpId(String corpId) {
    this.corpId = corpId;
  }
}
