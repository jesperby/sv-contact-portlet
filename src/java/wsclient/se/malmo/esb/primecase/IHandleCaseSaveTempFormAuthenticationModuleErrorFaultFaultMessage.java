
package se.malmo.esb.primecase;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.2.1
 * Mon Jun 15 17:24:05 CEST 2009
 * Generated source version: 2.2.1
 * 
 */

@WebFault(name = "AuthenticationModuleError", targetNamespace = "http://schemas.datacontract.org/2004/07/PrimeSystems.PrimeCaseCore.Portal")
public class IHandleCaseSaveTempFormAuthenticationModuleErrorFaultFaultMessage extends Exception {
    public static final long serialVersionUID = 20090615172405L;
    
    private org.datacontract.schemas._2004._07.primesystems_primecasecore.AuthenticationModuleError authenticationModuleError;

    public IHandleCaseSaveTempFormAuthenticationModuleErrorFaultFaultMessage() {
        super();
    }
    
    public IHandleCaseSaveTempFormAuthenticationModuleErrorFaultFaultMessage(String message) {
        super(message);
    }
    
    public IHandleCaseSaveTempFormAuthenticationModuleErrorFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IHandleCaseSaveTempFormAuthenticationModuleErrorFaultFaultMessage(String message, org.datacontract.schemas._2004._07.primesystems_primecasecore.AuthenticationModuleError authenticationModuleError) {
        super(message);
        this.authenticationModuleError = authenticationModuleError;
    }

    public IHandleCaseSaveTempFormAuthenticationModuleErrorFaultFaultMessage(String message, org.datacontract.schemas._2004._07.primesystems_primecasecore.AuthenticationModuleError authenticationModuleError, Throwable cause) {
        super(message, cause);
        this.authenticationModuleError = authenticationModuleError;
    }

    public org.datacontract.schemas._2004._07.primesystems_primecasecore.AuthenticationModuleError getFaultInfo() {
        return this.authenticationModuleError;
    }
}
