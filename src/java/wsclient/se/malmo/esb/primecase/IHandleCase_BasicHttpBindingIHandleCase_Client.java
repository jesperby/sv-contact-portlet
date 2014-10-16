
package se.malmo.esb.primecase;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.2.2
 * Thu Oct 15 23:14:31 CEST 2009
 * Generated source version: 2.2.2
 * 
 */

public final class IHandleCase_BasicHttpBindingIHandleCase_Client {

    private static final QName SERVICE_NAME = new QName("http://www.malmo.se/esb/primecase", "HandleCase");

    private IHandleCase_BasicHttpBindingIHandleCase_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = HandleCase.WSDL_LOCATION;
        if (args.length > 0) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        HandleCase ss = new HandleCase(wsdlURL, SERVICE_NAME);
        IHandleCase port = ss.getBasicHttpBindingIHandleCase();  
        
        {
        System.out.println("Invoking getRegistrationDrafts...");
        org.datacontract.schemas._2004._07.primesystems_primecasecore.ContactAuthenticationInfo _getRegistrationDrafts_authenticationInfo = null;
        try {
            org.datacontract.schemas._2004._07.primesystems_primecasecore.ArrayOfTempFormBasic _getRegistrationDrafts__return = port.getRegistrationDrafts(_getRegistrationDrafts_authenticationInfo);
            System.out.println("getRegistrationDrafts.result=" + _getRegistrationDrafts__return);

        } catch (IHandleCaseGetRegistrationDraftsAuthenticationModuleErrorFaultFaultMessage e) { 
            System.out.println("Expected exception: IHandleCase_GetRegistrationDrafts_AuthenticationModuleErrorFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (IHandleCaseGetRegistrationDraftsHandleCaseExceptionFaultFaultMessage e) { 
            System.out.println("Expected exception: IHandleCase_GetRegistrationDrafts_HandleCaseExceptionFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking changeRegistrationForm...");
        org.datacontract.schemas._2004._07.primesystems_primecasecore.ContactAuthenticationInfo _changeRegistrationForm_authenticationInfo = null;
        java.lang.Integer _changeRegistrationForm_caseId = null;
        org.datacontract.schemas._2004._07.primesystems_primecasecore.Form _changeRegistrationForm_form = null;
        org.datacontract.schemas._2004._07.primesystems_primecasecore.SignData _changeRegistrationForm_signData = null;
        try {
            org.datacontract.schemas._2004._07.primesystems_primecasecore.FormSavedReply _changeRegistrationForm__return = port.changeRegistrationForm(_changeRegistrationForm_authenticationInfo, _changeRegistrationForm_caseId, _changeRegistrationForm_form, _changeRegistrationForm_signData);
            System.out.println("changeRegistrationForm.result=" + _changeRegistrationForm__return);

        } catch (IHandleCaseChangeRegistrationFormAuthenticationModuleErrorFaultFaultMessage e) { 
            System.out.println("Expected exception: IHandleCase_ChangeRegistrationForm_AuthenticationModuleErrorFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (IHandleCaseChangeRegistrationFormHandleCaseExceptionFaultFaultMessage e) { 
            System.out.println("Expected exception: IHandleCase_ChangeRegistrationForm_HandleCaseExceptionFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking registerCaseWithHandler...");
        org.datacontract.schemas._2004._07.primesystems_primecasecore.ContactAuthenticationInfo _registerCaseWithHandler_authenticationInfo = null;
        java.lang.Integer _registerCaseWithHandler_caseTypeId = null;
        org.datacontract.schemas._2004._07.primesystems_primecasecore.Form _registerCaseWithHandler_form = null;
        java.lang.String _registerCaseWithHandler_handlerGuid = "";
        java.lang.String _registerCaseWithHandler_handlerGroupGuid = "";
        org.datacontract.schemas._2004._07.primesystems_primecasecore.SignData _registerCaseWithHandler_signData = null;
        try {
            org.datacontract.schemas._2004._07.primesystems_primecasecore.NewCaseReply _registerCaseWithHandler__return = port.registerCaseWithHandler(_registerCaseWithHandler_authenticationInfo, _registerCaseWithHandler_caseTypeId, _registerCaseWithHandler_form, _registerCaseWithHandler_handlerGuid, _registerCaseWithHandler_handlerGroupGuid, _registerCaseWithHandler_signData);
            System.out.println("registerCaseWithHandler.result=" + _registerCaseWithHandler__return);

        } catch (IHandleCaseRegisterCaseWithHandlerAuthenticationModuleErrorFaultFaultMessage e) { 
            System.out.println("Expected exception: IHandleCase_RegisterCaseWithHandler_AuthenticationModuleErrorFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (IHandleCaseRegisterCaseWithHandlerHandleCaseExceptionFaultFaultMessage e) { 
            System.out.println("Expected exception: IHandleCase_RegisterCaseWithHandler_HandleCaseExceptionFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getRequestedContactFieldsPrefilled...");
        org.datacontract.schemas._2004._07.primesystems_primecasecore.ContactAuthenticationInfo _getRequestedContactFieldsPrefilled_authenticationInfo = null;
        java.lang.Integer _getRequestedContactFieldsPrefilled_caseTypeId = null;
        try {
            org.datacontract.schemas._2004._07.primesystems_primecasecore.ContactInfoInputs _getRequestedContactFieldsPrefilled__return = port.getRequestedContactFieldsPrefilled(_getRequestedContactFieldsPrefilled_authenticationInfo, _getRequestedContactFieldsPrefilled_caseTypeId);
            System.out.println("getRequestedContactFieldsPrefilled.result=" + _getRequestedContactFieldsPrefilled__return);

        } catch (IHandleCaseGetRequestedContactFieldsPrefilledParameterErrorFaultFaultMessage e) { 
            System.out.println("Expected exception: IHandleCase_GetRequestedContactFieldsPrefilled_ParameterErrorFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getRequestedContactFields...");
        java.lang.Integer _getRequestedContactFields_caseTypeId = null;
        try {
            org.datacontract.schemas._2004._07.primesystems_primecasecore.ContactInfoInputs _getRequestedContactFields__return = port.getRequestedContactFields(_getRequestedContactFields_caseTypeId);
            System.out.println("getRequestedContactFields.result=" + _getRequestedContactFields__return);

        } catch (IHandleCaseGetRequestedContactFieldsParameterErrorFaultFaultMessage e) { 
            System.out.println("Expected exception: IHandleCase_GetRequestedContactFields_ParameterErrorFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking registerCaseWithHandlerAndContactDetails...");
        org.datacontract.schemas._2004._07.primesystems_primecasecore.ContactAuthenticationInfo _registerCaseWithHandlerAndContactDetails_authenticationInfo = null;
        org.datacontract.schemas._2004._07.primesystems_primecasecore.ContactInfo _registerCaseWithHandlerAndContactDetails_contactInfo = null;
        java.lang.Integer _registerCaseWithHandlerAndContactDetails_caseTypeId = null;
        org.datacontract.schemas._2004._07.primesystems_primecasecore.Form _registerCaseWithHandlerAndContactDetails_form = null;
        java.lang.String _registerCaseWithHandlerAndContactDetails_handlerGuid = "";
        java.lang.String _registerCaseWithHandlerAndContactDetails_handlerGroupGuid = "";
        org.datacontract.schemas._2004._07.primesystems_primecasecore.SignData _registerCaseWithHandlerAndContactDetails_signData = null;
        try {
            org.datacontract.schemas._2004._07.primesystems_primecasecore.NewCaseReply _registerCaseWithHandlerAndContactDetails__return = port.registerCaseWithHandlerAndContactDetails(_registerCaseWithHandlerAndContactDetails_authenticationInfo, _registerCaseWithHandlerAndContactDetails_contactInfo, _registerCaseWithHandlerAndContactDetails_caseTypeId, _registerCaseWithHandlerAndContactDetails_form, _registerCaseWithHandlerAndContactDetails_handlerGuid, _registerCaseWithHandlerAndContactDetails_handlerGroupGuid, _registerCaseWithHandlerAndContactDetails_signData);
            System.out.println("registerCaseWithHandlerAndContactDetails.result=" + _registerCaseWithHandlerAndContactDetails__return);

        } catch (IHandleCaseRegisterCaseWithHandlerAndContactDetailsAuthenticationModuleErrorFaultFaultMessage e) { 
            System.out.println("Expected exception: IHandleCase_RegisterCaseWithHandlerAndContactDetails_AuthenticationModuleErrorFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (IHandleCaseRegisterCaseWithHandlerAndContactDetailsHandleCaseExceptionFaultFaultMessage e) { 
            System.out.println("Expected exception: IHandleCase_RegisterCaseWithHandlerAndContactDetails_HandleCaseExceptionFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getRegisteredForm...");
        org.datacontract.schemas._2004._07.primesystems_primecasecore.ContactAuthenticationInfo _getRegisteredForm_authenticationInfo = null;
        java.lang.Integer _getRegisteredForm_caseId = null;
        try {
            org.datacontract.schemas._2004._07.primesystems_primecasecore.Form _getRegisteredForm__return = port.getRegisteredForm(_getRegisteredForm_authenticationInfo, _getRegisteredForm_caseId);
            System.out.println("getRegisteredForm.result=" + _getRegisteredForm__return);

        } catch (IHandleCaseGetRegisteredFormAuthenticationModuleErrorFaultFaultMessage e) { 
            System.out.println("Expected exception: IHandleCase_GetRegisteredForm_AuthenticationModuleErrorFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (IHandleCaseGetRegisteredFormGetRegistrationFormErrorFaultFaultMessage e) { 
            System.out.println("Expected exception: IHandleCase_GetRegisteredForm_GetRegistrationFormErrorFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (IHandleCaseGetRegisteredFormHandleCaseExceptionFaultFaultMessage e) { 
            System.out.println("Expected exception: IHandleCase_GetRegisteredForm_HandleCaseExceptionFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getRegistrationDraft...");
        org.datacontract.schemas._2004._07.primesystems_primecasecore.ContactAuthenticationInfo _getRegistrationDraft_authenticationInfo = null;
        java.lang.String _getRegistrationDraft_draftId = "";
        try {
            org.datacontract.schemas._2004._07.primesystems_primecasecore.Form _getRegistrationDraft__return = port.getRegistrationDraft(_getRegistrationDraft_authenticationInfo, _getRegistrationDraft_draftId);
            System.out.println("getRegistrationDraft.result=" + _getRegistrationDraft__return);

        } catch (IHandleCaseGetRegistrationDraftAuthenticationModuleErrorFaultFaultMessage e) { 
            System.out.println("Expected exception: IHandleCase_GetRegistrationDraft_AuthenticationModuleErrorFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (IHandleCaseGetRegistrationDraftHandleCaseExceptionFaultFaultMessage e) { 
            System.out.println("Expected exception: IHandleCase_GetRegistrationDraft_HandleCaseExceptionFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (IHandleCaseGetRegistrationDraftGetTemporaryFormErrorFaultFaultMessage e) { 
            System.out.println("Expected exception: IHandleCase_GetRegistrationDraft_GetTemporaryFormErrorFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking deleteRegistrationDraft...");
        org.datacontract.schemas._2004._07.primesystems_primecasecore.ContactAuthenticationInfo _deleteRegistrationDraft_authenticationInfo = null;
        java.lang.String _deleteRegistrationDraft_draftId = "";
        try {
            org.datacontract.schemas._2004._07.primesystems_primecasecore.DeleteTempFormReply _deleteRegistrationDraft__return = port.deleteRegistrationDraft(_deleteRegistrationDraft_authenticationInfo, _deleteRegistrationDraft_draftId);
            System.out.println("deleteRegistrationDraft.result=" + _deleteRegistrationDraft__return);

        } catch (IHandleCaseDeleteRegistrationDraftAuthenticationModuleErrorFaultFaultMessage e) { 
            System.out.println("Expected exception: IHandleCase_DeleteRegistrationDraft_AuthenticationModuleErrorFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (IHandleCaseDeleteRegistrationDraftHandleCaseExceptionFaultFaultMessage e) { 
            System.out.println("Expected exception: IHandleCase_DeleteRegistrationDraft_HandleCaseExceptionFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking registerCase...");
        org.datacontract.schemas._2004._07.primesystems_primecasecore.ContactAuthenticationInfo _registerCase_authenticationInfo = null;
        java.lang.Integer _registerCase_caseTypeId = null;
        org.datacontract.schemas._2004._07.primesystems_primecasecore.Form _registerCase_form = null;
        org.datacontract.schemas._2004._07.primesystems_primecasecore.SignData _registerCase_signData = null;
        try {
            org.datacontract.schemas._2004._07.primesystems_primecasecore.NewCaseReply _registerCase__return = port.registerCase(_registerCase_authenticationInfo, _registerCase_caseTypeId, _registerCase_form, _registerCase_signData);
            System.out.println("registerCase.result=" + _registerCase__return);

        } catch (IHandleCaseRegisterCaseAuthenticationModuleErrorFaultFaultMessage e) { 
            System.out.println("Expected exception: IHandleCase_RegisterCase_AuthenticationModuleErrorFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (IHandleCaseRegisterCaseHandleCaseExceptionFaultFaultMessage e) { 
            System.out.println("Expected exception: IHandleCase_RegisterCase_HandleCaseExceptionFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getRegistrationForm...");
        org.datacontract.schemas._2004._07.primesystems_primecasecore.ContactAuthenticationInfo _getRegistrationForm_authenticationInfo = null;
        java.lang.Integer _getRegistrationForm_caseTypeId = null;
        try {
            org.datacontract.schemas._2004._07.primesystems_primecasecore.Form _getRegistrationForm__return = port.getRegistrationForm(_getRegistrationForm_authenticationInfo, _getRegistrationForm_caseTypeId);
            System.out.println("getRegistrationForm.result=" + _getRegistrationForm__return);

        } catch (IHandleCaseGetRegistrationFormAuthenticationModuleErrorFaultFaultMessage e) { 
            System.out.println("Expected exception: IHandleCase_GetRegistrationForm_AuthenticationModuleErrorFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (IHandleCaseGetRegistrationFormGetRegistrationFormErrorFaultFaultMessage e) { 
            System.out.println("Expected exception: IHandleCase_GetRegistrationForm_GetRegistrationFormErrorFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (IHandleCaseGetRegistrationFormHandleCaseExceptionFaultFaultMessage e) { 
            System.out.println("Expected exception: IHandleCase_GetRegistrationForm_HandleCaseExceptionFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getUploadConstraints...");
        try {
            org.datacontract.schemas._2004._07.primesystems_primecasecore.UploadConstraints _getUploadConstraints__return = port.getUploadConstraints();
            System.out.println("getUploadConstraints.result=" + _getUploadConstraints__return);

        } catch (IHandleCaseGetUploadConstraintsHandleCaseExceptionFaultFaultMessage e) { 
            System.out.println("Expected exception: IHandleCase_GetUploadConstraints_HandleCaseExceptionFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getCasesForContact...");
        org.datacontract.schemas._2004._07.primesystems_primecasecore.ContactAuthenticationInfo _getCasesForContact_authenticationInfo = null;
        javax.xml.datatype.XMLGregorianCalendar _getCasesForContact_fromDate = null;
        java.lang.Boolean _getCasesForContact_activeCases = null;
        java.lang.Boolean _getCasesForContact_completedCases = null;
        try {
            org.datacontract.schemas._2004._07.primesystems_primecasecore.ArrayOfCaseInfoBasic _getCasesForContact__return = port.getCasesForContact(_getCasesForContact_authenticationInfo, _getCasesForContact_fromDate, _getCasesForContact_activeCases, _getCasesForContact_completedCases);
            System.out.println("getCasesForContact.result=" + _getCasesForContact__return);

        } catch (IHandleCaseGetCasesForContactAuthenticationModuleErrorFaultFaultMessage e) { 
            System.out.println("Expected exception: IHandleCase_GetCasesForContact_AuthenticationModuleErrorFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (IHandleCaseGetCasesForContactHandleCaseExceptionFaultFaultMessage e) { 
            System.out.println("Expected exception: IHandleCase_GetCasesForContact_HandleCaseExceptionFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking saveRegistrationDraft...");
        org.datacontract.schemas._2004._07.primesystems_primecasecore.ContactAuthenticationInfo _saveRegistrationDraft_authenticationInfo = null;
        org.datacontract.schemas._2004._07.primesystems_primecasecore.Form _saveRegistrationDraft_form = null;
        java.lang.String _saveRegistrationDraft_signText = "";
        try {
            java.lang.Boolean _saveRegistrationDraft__return = port.saveRegistrationDraft(_saveRegistrationDraft_authenticationInfo, _saveRegistrationDraft_form, _saveRegistrationDraft_signText);
            System.out.println("saveRegistrationDraft.result=" + _saveRegistrationDraft__return);

        } catch (IHandleCaseSaveRegistrationDraftAuthenticationModuleErrorFaultFaultMessage e) { 
            System.out.println("Expected exception: IHandleCase_SaveRegistrationDraft_AuthenticationModuleErrorFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (IHandleCaseSaveRegistrationDraftHandleCaseExceptionFaultFaultMessage e) { 
            System.out.println("Expected exception: IHandleCase_SaveRegistrationDraft_HandleCaseExceptionFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking registerCaseWithContactDetails...");
        org.datacontract.schemas._2004._07.primesystems_primecasecore.ContactAuthenticationInfo _registerCaseWithContactDetails_authenticationInfo = null;
        org.datacontract.schemas._2004._07.primesystems_primecasecore.ContactInfo _registerCaseWithContactDetails_contactInfo = null;
        java.lang.Integer _registerCaseWithContactDetails_caseTypeId = null;
        org.datacontract.schemas._2004._07.primesystems_primecasecore.Form _registerCaseWithContactDetails_form = null;
        org.datacontract.schemas._2004._07.primesystems_primecasecore.SignData _registerCaseWithContactDetails_signData = null;
        try {
            org.datacontract.schemas._2004._07.primesystems_primecasecore.NewCaseReply _registerCaseWithContactDetails__return = port.registerCaseWithContactDetails(_registerCaseWithContactDetails_authenticationInfo, _registerCaseWithContactDetails_contactInfo, _registerCaseWithContactDetails_caseTypeId, _registerCaseWithContactDetails_form, _registerCaseWithContactDetails_signData);
            System.out.println("registerCaseWithContactDetails.result=" + _registerCaseWithContactDetails__return);

        } catch (IHandleCaseRegisterCaseWithContactDetailsAuthenticationModuleErrorFaultFaultMessage e) { 
            System.out.println("Expected exception: IHandleCase_RegisterCaseWithContactDetails_AuthenticationModuleErrorFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (IHandleCaseRegisterCaseWithContactDetailsHandleCaseExceptionFaultFaultMessage e) { 
            System.out.println("Expected exception: IHandleCase_RegisterCaseWithContactDetails_HandleCaseExceptionFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getCase...");
        org.datacontract.schemas._2004._07.primesystems_primecasecore.ContactAuthenticationInfo _getCase_authInfo = null;
        java.lang.Integer _getCase_caseId = null;
        try {
            org.datacontract.schemas._2004._07.primesystems_primecasecore.CaseInfo _getCase__return = port.getCase(_getCase_authInfo, _getCase_caseId);
            System.out.println("getCase.result=" + _getCase__return);

        } catch (IHandleCaseGetCaseAuthenticationModuleErrorFaultFaultMessage e) { 
            System.out.println("Expected exception: IHandleCase_GetCase_AuthenticationModuleErrorFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        } catch (IHandleCaseGetCaseHandleCaseExceptionFaultFaultMessage e) { 
            System.out.println("Expected exception: IHandleCase_GetCase_HandleCaseExceptionFault_FaultMessage has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
