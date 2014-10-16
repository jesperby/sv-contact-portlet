
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.primesystems_primecasecore.Form;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetRegisteredFormResult" type="{http://schemas.datacontract.org/2004/07/PrimeSystems.PrimeCaseCore.Portal}Form" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getRegisteredFormResult"
})
@XmlRootElement(name = "GetRegisteredFormResponse")
public class GetRegisteredFormResponse {

    @XmlElementRef(name = "GetRegisteredFormResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<Form> getRegisteredFormResult;

    /**
     * Gets the value of the getRegisteredFormResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Form }{@code >}
     *     
     */
    public JAXBElement<Form> getGetRegisteredFormResult() {
        return getRegisteredFormResult;
    }

    /**
     * Sets the value of the getRegisteredFormResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Form }{@code >}
     *     
     */
    public void setGetRegisteredFormResult(JAXBElement<Form> value) {
        this.getRegisteredFormResult = ((JAXBElement<Form> ) value);
    }

}
