
/*
 * 
 */

package se.malmo.esb.primecase;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.2.2
 * Thu Oct 15 23:14:32 CEST 2009
 * Generated source version: 2.2.2
 * 
 */


@WebServiceClient(name = "HandleCase", 
                  wsdlLocation = "http://esb.dev.malmo.se:9080/primcase-bpel/HandleCase/BasicHttpBinding_IHandleCase?wsdl",
                  targetNamespace = "http://www.malmo.se/esb/primecase") 
public class HandleCase extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("http://www.malmo.se/esb/primecase", "HandleCase");
    public final static QName BasicHttpBindingIHandleCase = new QName("http://www.malmo.se/esb/primecase", "BasicHttpBinding_IHandleCase");
    static {
        URL url = null;
        try {
            url = new URL("http://esb.dev.malmo.se:9080/primcase-bpel/HandleCase/BasicHttpBinding_IHandleCase?wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from http://esb.dev.malmo.se:9080/primcase-bpel/HandleCase/BasicHttpBinding_IHandleCase?wsdl");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public HandleCase(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public HandleCase(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HandleCase() {
        super(WSDL_LOCATION, SERVICE);
    }

    /**
     * 
     * @return
     *     returns IHandleCase
     */
    @WebEndpoint(name = "BasicHttpBinding_IHandleCase")
    public IHandleCase getBasicHttpBindingIHandleCase() {
        return super.getPort(BasicHttpBindingIHandleCase, IHandleCase.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IHandleCase
     */
    @WebEndpoint(name = "BasicHttpBinding_IHandleCase")
    public IHandleCase getBasicHttpBindingIHandleCase(WebServiceFeature... features) {
        return super.getPort(BasicHttpBindingIHandleCase, IHandleCase.class, features);
    }

}
