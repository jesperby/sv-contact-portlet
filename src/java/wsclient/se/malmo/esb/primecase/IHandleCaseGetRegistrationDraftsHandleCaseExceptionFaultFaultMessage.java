
package se.malmo.esb.primecase;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.2.2
 * Thu Oct 15 23:14:32 CEST 2009
 * Generated source version: 2.2.2
 * 
 */

@WebFault(name = "HandleCaseException", targetNamespace = "http://schemas.datacontract.org/2004/07/PrimeSystems.PrimeCaseCore.Portal")
public class IHandleCaseGetRegistrationDraftsHandleCaseExceptionFaultFaultMessage extends Exception {
    public static final long serialVersionUID = 20091015231432L;
    
    private org.datacontract.schemas._2004._07.primesystems_primecasecore.HandleCaseException handleCaseException;

    public IHandleCaseGetRegistrationDraftsHandleCaseExceptionFaultFaultMessage() {
        super();
    }
    
    public IHandleCaseGetRegistrationDraftsHandleCaseExceptionFaultFaultMessage(String message) {
        super(message);
    }
    
    public IHandleCaseGetRegistrationDraftsHandleCaseExceptionFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IHandleCaseGetRegistrationDraftsHandleCaseExceptionFaultFaultMessage(String message, org.datacontract.schemas._2004._07.primesystems_primecasecore.HandleCaseException handleCaseException) {
        super(message);
        this.handleCaseException = handleCaseException;
    }

    public IHandleCaseGetRegistrationDraftsHandleCaseExceptionFaultFaultMessage(String message, org.datacontract.schemas._2004._07.primesystems_primecasecore.HandleCaseException handleCaseException, Throwable cause) {
        super(message, cause);
        this.handleCaseException = handleCaseException;
    }

    public org.datacontract.schemas._2004._07.primesystems_primecasecore.HandleCaseException getFaultInfo() {
        return this.handleCaseException;
    }
}
