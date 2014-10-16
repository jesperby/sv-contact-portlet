
package se.malmo.esb.primecase;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.2.1
 * Mon Jun 15 17:24:05 CEST 2009
 * Generated source version: 2.2.1
 * 
 */

@WebFault(name = "HandleCaseException", targetNamespace = "http://schemas.datacontract.org/2004/07/PrimeSystems.PrimeCaseCore.Portal")
public class IHandleCaseGetTempFormHandleCaseExceptionFaultFaultMessage extends Exception {
    public static final long serialVersionUID = 20090615172405L;
    
    private org.datacontract.schemas._2004._07.primesystems_primecasecore.HandleCaseException handleCaseException;

    public IHandleCaseGetTempFormHandleCaseExceptionFaultFaultMessage() {
        super();
    }
    
    public IHandleCaseGetTempFormHandleCaseExceptionFaultFaultMessage(String message) {
        super(message);
    }
    
    public IHandleCaseGetTempFormHandleCaseExceptionFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IHandleCaseGetTempFormHandleCaseExceptionFaultFaultMessage(String message, org.datacontract.schemas._2004._07.primesystems_primecasecore.HandleCaseException handleCaseException) {
        super(message);
        this.handleCaseException = handleCaseException;
    }

    public IHandleCaseGetTempFormHandleCaseExceptionFaultFaultMessage(String message, org.datacontract.schemas._2004._07.primesystems_primecasecore.HandleCaseException handleCaseException, Throwable cause) {
        super(message, cause);
        this.handleCaseException = handleCaseException;
    }

    public org.datacontract.schemas._2004._07.primesystems_primecasecore.HandleCaseException getFaultInfo() {
        return this.handleCaseException;
    }
}
