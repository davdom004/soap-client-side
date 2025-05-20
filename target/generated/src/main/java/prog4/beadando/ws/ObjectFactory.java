
package prog4.beadando.ws;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the prog4.beadando.ws package. 
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

    private static final QName _GetMovieData_QNAME = new QName("http://ws.beadando.prog4/", "getMovieData");
    private static final QName _GetMovieDataResponse_QNAME = new QName("http://ws.beadando.prog4/", "getMovieDataResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: prog4.beadando.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetMovieData }
     * 
     * @return
     *     the new instance of {@link GetMovieData }
     */
    public GetMovieData createGetMovieData() {
        return new GetMovieData();
    }

    /**
     * Create an instance of {@link GetMovieDataResponse }
     * 
     * @return
     *     the new instance of {@link GetMovieDataResponse }
     */
    public GetMovieDataResponse createGetMovieDataResponse() {
        return new GetMovieDataResponse();
    }

    /**
     * Create an instance of {@link MovieDataRequest }
     * 
     * @return
     *     the new instance of {@link MovieDataRequest }
     */
    public MovieDataRequest createMovieDataRequest() {
        return new MovieDataRequest();
    }

    /**
     * Create an instance of {@link MovieDataResponse }
     * 
     * @return
     *     the new instance of {@link MovieDataResponse }
     */
    public MovieDataResponse createMovieDataResponse() {
        return new MovieDataResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMovieData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetMovieData }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.beadando.prog4/", name = "getMovieData")
    public JAXBElement<GetMovieData> createGetMovieData(GetMovieData value) {
        return new JAXBElement<>(_GetMovieData_QNAME, GetMovieData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMovieDataResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetMovieDataResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.beadando.prog4/", name = "getMovieDataResponse")
    public JAXBElement<GetMovieDataResponse> createGetMovieDataResponse(GetMovieDataResponse value) {
        return new JAXBElement<>(_GetMovieDataResponse_QNAME, GetMovieDataResponse.class, null, value);
    }

}
