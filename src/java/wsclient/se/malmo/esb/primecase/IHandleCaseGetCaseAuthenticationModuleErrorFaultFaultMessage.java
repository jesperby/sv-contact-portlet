
package se.malmo.esb.primecase;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.2.2
 * Thu Oct 15 23:14:32 CEST 2009
 * Generated source version: 2.2.2
 * 
 */

@WebFault(name = "AuthenticationModuleError", targetNamespace = "http://schemas.datacontract.org/2004/07/PrimeSystems.PrimeCaseCore.Portal")
public class IHandleCaseGetCaseAuthenticationModuleErrorFaultFaultMessage extends Exception {
    public static final long serialVersionUID = 20091015231432L;
    
    private org.datacontract.schemas._2004._07.primesystems_primecasecore.AuthenticationModuleError authenticationModuleError;

    public IHandleCaseGetCaseAuthenticationModuleErrorFaultFaultMessage() {
        super();
    }
    
    public IHandleCaseGetCaseAuthenticationModuleErrorFaultFaultMessage(String message) {
        super(message);
    }
    
    public IHandleCaseGetCaseAuthenticationModuleErrorFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IHandleCaseGetCaseAuthenticationModuleErrorFaultFaultMessage(String message, org.datacontract.schemas._2004._07.primesystems_primecasecore.AuthenticationModuleError authenticationModuleError) {
        super(message);
        this.authenticationModuleError = authenticationModuleError;
    }

    public IHandleCaseGetCaseAuthenticationModuleErrorFaultFaultMessage(String message, org.datacontract.schemas._2004._07.primesystems_primecasecore.AuthenticationModuleError authenticationModuleError, Throwable cause) {
        super(message, cause);
        this.authenticationModuleError = authenticationModuleError;
    }

    public org.datacontract.schemas._2004._07.primesystems_primecasecore.AuthenticationModuleError getFaultInfo() {
        return this.authenticationModuleError;
    }
}
