
package prog4.beadando.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.1
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "Movie", targetNamespace = "prog4.beadando.ws.soap", wsdlLocation = "file:/C:/Users/Dav/prog4-beadando/client-side/src/main/resources/SoapMovieDataService.wsdl")
public class Movie
    extends Service
{

    private static final URL MOVIE_WSDL_LOCATION;
    private static final WebServiceException MOVIE_EXCEPTION;
    private static final QName MOVIE_QNAME = new QName("prog4.beadando.ws.soap", "Movie");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/Dav/prog4-beadando/client-side/src/main/resources/SoapMovieDataService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MOVIE_WSDL_LOCATION = url;
        MOVIE_EXCEPTION = e;
    }

    public Movie() {
        super(__getWsdlLocation(), MOVIE_QNAME);
    }

    public Movie(WebServiceFeature... features) {
        super(__getWsdlLocation(), MOVIE_QNAME, features);
    }

    public Movie(URL wsdlLocation) {
        super(wsdlLocation, MOVIE_QNAME);
    }

    public Movie(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MOVIE_QNAME, features);
    }

    public Movie(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Movie(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MovieDataService
     */
    @WebEndpoint(name = "SoapMovieDataServicePort")
    public MovieDataService getSoapMovieDataServicePort() {
        return super.getPort(new QName("prog4.beadando.ws.soap", "SoapMovieDataServicePort"), MovieDataService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MovieDataService
     */
    @WebEndpoint(name = "SoapMovieDataServicePort")
    public MovieDataService getSoapMovieDataServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("prog4.beadando.ws.soap", "SoapMovieDataServicePort"), MovieDataService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MOVIE_EXCEPTION!= null) {
            throw MOVIE_EXCEPTION;
        }
        return MOVIE_WSDL_LOCATION;
    }

}
