package desafio.ejb.usuario;


/*
  ** This file was automatically generated by 
  ** EJBGen WebLogic Server 10.3.6.0  Tue Nov 15 08:52:36 PST 2011 1441050 
*/


import java.io.Serializable;

// BEGIN imports from bean class
import javax.ejb.CreateException;
import javax.ejb.EntityBean;
import weblogic.ejb.GenericEntityBean;
import weblogic.ejbgen.CmpField;
import weblogic.ejbgen.Constants;
import weblogic.ejbgen.Entity;
import weblogic.ejbgen.FileGeneration;
import weblogic.ejbgen.JndiName;
import weblogic.ejbgen.LocalMethod;
// END imports from bean class


public class UsuarioBeanValue  implements Serializable  {

  public UsuarioBeanValue() {}

  public UsuarioBeanValue(java.lang.Integer key) {
    m_key = key;
  }

  public java.lang.Integer toPK() {
    return m_key;
  }

  private java.lang.Integer m_key;
  public java.lang.Integer getKey(){
    return m_key;
  }

  public void setKey(java.lang.Integer n){
    m_key = n;
  }

  public String toString() {
    StringBuffer result = new StringBuffer("[UsuarioBeanValue ");
    result.append(  " key:" + m_key);
    result.append("]");
    return result.toString();
  }

  private int m_hashCode = 0;
  public int hashCode() {
    if (0 == m_hashCode) {
      m_hashCode = 
                            (null != m_key ? m_key.hashCode() : 0)
                      ;
    }
    
    return m_hashCode;
  }

  public boolean equals(Object other) {
    if (other == this) return true;
    if (null == other) return false;
    if (other.hashCode() != hashCode()) return false;
    try {
      UsuarioBeanValue other2 = ( UsuarioBeanValue ) other;
            return
                      (safeEquals(this.m_key, other2.m_key))
                      ;
    }
    catch(ClassCastException ex) {
      return false;
    }
  }
  
  private boolean safeEquals(Object o1, Object o2) {
    if (null == o1 && null == o2) return true;
    if (null == o1 && null != o2) return false;
    if (null != o1 && null == o2) return false;
    return o1.equals(o2);
  }
  
}