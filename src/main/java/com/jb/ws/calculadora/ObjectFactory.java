
package com.jb.ws.calculadora;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.jb.ws.calculadora package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _OperacionResponse_QNAME = new QName("http://calculadora.ws.jb.com/", "operacionResponse");
    private final static QName _Operacion_QNAME = new QName("http://calculadora.ws.jb.com/", "operacion");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.jb.ws.calculadora
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OperacionResponse }
     * 
     */
    public OperacionResponse createOperacionResponse() {
        return new OperacionResponse();
    }

    /**
     * Create an instance of {@link Operacion }
     * 
     */
    public Operacion createOperacion() {
        return new Operacion();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculadora.ws.jb.com/", name = "operacionResponse")
    public JAXBElement<OperacionResponse> createOperacionResponse(OperacionResponse value) {
        return new JAXBElement<OperacionResponse>(_OperacionResponse_QNAME, OperacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Operacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculadora.ws.jb.com/", name = "operacion")
    public JAXBElement<Operacion> createOperacion(Operacion value) {
        return new JAXBElement<Operacion>(_Operacion_QNAME, Operacion.class, null, value);
    }

}
