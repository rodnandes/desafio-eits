package desafio.ejb.managerdb;


/*
  ** This file was automatically generated by 
  ** EJBGen WebLogic Server 10.3.6.0  Tue Nov 15 08:52:36 PST 2011 1441050 
*/


import javax.ejb.CreateException;
import javax.ejb.EJBHome;
import javax.ejb.FinderException;
import java.rmi.RemoteException;
import java.util.Collection;

// BEGIN imports from bean class
import javax.ejb.SessionBean;
import weblogic.ejb.GenericSessionBean;
import weblogic.ejbgen.Constants;
import weblogic.ejbgen.FileGeneration;
import weblogic.ejbgen.JndiName;
import weblogic.ejbgen.Session;
// END imports from bean class


/**
 * * 
 * GenericSessionBean subclass automatically generated by OEPE.
 * Please complete the ejbCreate method as needed to properly initialize new instances of your bean and add
 * all required business methods. Also, review the Session, JndiName and FileGeneration annotations 
 * to ensure the settings match the bean's intended use.
 
 */

public interface LocalizacaoDBSessionRemoteHome extends EJBHome {



  public LocalizacaoDBSessionRemote create()     throws CreateException, RemoteException, javax.ejb.CreateException;



}
