
package prog4.beadando.ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for movieDataResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="movieDataResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="imdbRating" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "movieDataResponse", propOrder = {
    "id",
    "imdbRating"
})
public class MovieDataResponse {

    protected String id;
    protected Double imdbRating;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the imdbRating property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getImdbRating() {
        return imdbRating;
    }

    /**
     * Sets the value of the imdbRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setImdbRating(Double value) {
        this.imdbRating = value;
    }

}
