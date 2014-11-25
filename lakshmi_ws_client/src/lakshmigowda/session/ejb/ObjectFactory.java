
package lakshmigowda.session.ejb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the lakshmigowda.session.ejb package. 
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

    private final static QName _GetSurveylist_QNAME = new QName("http://ejb.session.lakshmigowda/", "getSurveylist");
    private final static QName _GetSurveylistResponse_QNAME = new QName("http://ejb.session.lakshmigowda/", "getSurveylistResponse");
    private final static QName _SearchSurveyResponse_QNAME = new QName("http://ejb.session.lakshmigowda/", "searchSurveyResponse");
    private final static QName _DeleteSurvey_QNAME = new QName("http://ejb.session.lakshmigowda/", "deleteSurvey");
    private final static QName _SQLException_QNAME = new QName("http://ejb.session.lakshmigowda/", "SQLException");
    private final static QName _SearchSurvey_QNAME = new QName("http://ejb.session.lakshmigowda/", "searchSurvey");
    private final static QName _StoreSurvey_QNAME = new QName("http://ejb.session.lakshmigowda/", "storeSurvey");
    private final static QName _StoreSurveyResponse_QNAME = new QName("http://ejb.session.lakshmigowda/", "storeSurveyResponse");
    private final static QName _DeleteSurveyResponse_QNAME = new QName("http://ejb.session.lakshmigowda/", "deleteSurveyResponse");
    private final static QName _ParseException_QNAME = new QName("http://ejb.session.lakshmigowda/", "ParseException");
    private final static QName _ClassNotFoundException_QNAME = new QName("http://ejb.session.lakshmigowda/", "ClassNotFoundException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: lakshmigowda.session.ejb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetSurveylist }
     * 
     */
    public GetSurveylist createGetSurveylist() {
        return new GetSurveylist();
    }

    /**
     * Create an instance of {@link GetSurveylistResponse }
     * 
     */
    public GetSurveylistResponse createGetSurveylistResponse() {
        return new GetSurveylistResponse();
    }

    /**
     * Create an instance of {@link SearchSurveyResponse }
     * 
     */
    public SearchSurveyResponse createSearchSurveyResponse() {
        return new SearchSurveyResponse();
    }

    /**
     * Create an instance of {@link DeleteSurvey }
     * 
     */
    public DeleteSurvey createDeleteSurvey() {
        return new DeleteSurvey();
    }

    /**
     * Create an instance of {@link SQLException }
     * 
     */
    public SQLException createSQLException() {
        return new SQLException();
    }

    /**
     * Create an instance of {@link SearchSurvey }
     * 
     */
    public SearchSurvey createSearchSurvey() {
        return new SearchSurvey();
    }

    /**
     * Create an instance of {@link StoreSurvey }
     * 
     */
    public StoreSurvey createStoreSurvey() {
        return new StoreSurvey();
    }

    /**
     * Create an instance of {@link StoreSurveyResponse }
     * 
     */
    public StoreSurveyResponse createStoreSurveyResponse() {
        return new StoreSurveyResponse();
    }

    /**
     * Create an instance of {@link DeleteSurveyResponse }
     * 
     */
    public DeleteSurveyResponse createDeleteSurveyResponse() {
        return new DeleteSurveyResponse();
    }

    /**
     * Create an instance of {@link ParseException }
     * 
     */
    public ParseException createParseException() {
        return new ParseException();
    }

    /**
     * Create an instance of {@link ClassNotFoundException }
     * 
     */
    public ClassNotFoundException createClassNotFoundException() {
        return new ClassNotFoundException();
    }

    /**
     * Create an instance of {@link SearchAppModel }
     * 
     */
    public SearchAppModel createSearchAppModel() {
        return new SearchAppModel();
    }

    /**
     * Create an instance of {@link EmergencyContactAppModel }
     * 
     */
    public EmergencyContactAppModel createEmergencyContactAppModel() {
        return new EmergencyContactAppModel();
    }

    /**
     * Create an instance of {@link ArrayList }
     * 
     */
    public ArrayList createArrayList() {
        return new ArrayList();
    }

    /**
     * Create an instance of {@link StudentAppModel }
     * 
     */
    public StudentAppModel createStudentAppModel() {
        return new StudentAppModel();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSurveylist }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.session.lakshmigowda/", name = "getSurveylist")
    public JAXBElement<GetSurveylist> createGetSurveylist(GetSurveylist value) {
        return new JAXBElement<GetSurveylist>(_GetSurveylist_QNAME, GetSurveylist.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSurveylistResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.session.lakshmigowda/", name = "getSurveylistResponse")
    public JAXBElement<GetSurveylistResponse> createGetSurveylistResponse(GetSurveylistResponse value) {
        return new JAXBElement<GetSurveylistResponse>(_GetSurveylistResponse_QNAME, GetSurveylistResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchSurveyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.session.lakshmigowda/", name = "searchSurveyResponse")
    public JAXBElement<SearchSurveyResponse> createSearchSurveyResponse(SearchSurveyResponse value) {
        return new JAXBElement<SearchSurveyResponse>(_SearchSurveyResponse_QNAME, SearchSurveyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSurvey }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.session.lakshmigowda/", name = "deleteSurvey")
    public JAXBElement<DeleteSurvey> createDeleteSurvey(DeleteSurvey value) {
        return new JAXBElement<DeleteSurvey>(_DeleteSurvey_QNAME, DeleteSurvey.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SQLException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.session.lakshmigowda/", name = "SQLException")
    public JAXBElement<SQLException> createSQLException(SQLException value) {
        return new JAXBElement<SQLException>(_SQLException_QNAME, SQLException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchSurvey }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.session.lakshmigowda/", name = "searchSurvey")
    public JAXBElement<SearchSurvey> createSearchSurvey(SearchSurvey value) {
        return new JAXBElement<SearchSurvey>(_SearchSurvey_QNAME, SearchSurvey.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreSurvey }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.session.lakshmigowda/", name = "storeSurvey")
    public JAXBElement<StoreSurvey> createStoreSurvey(StoreSurvey value) {
        return new JAXBElement<StoreSurvey>(_StoreSurvey_QNAME, StoreSurvey.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreSurveyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.session.lakshmigowda/", name = "storeSurveyResponse")
    public JAXBElement<StoreSurveyResponse> createStoreSurveyResponse(StoreSurveyResponse value) {
        return new JAXBElement<StoreSurveyResponse>(_StoreSurveyResponse_QNAME, StoreSurveyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSurveyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.session.lakshmigowda/", name = "deleteSurveyResponse")
    public JAXBElement<DeleteSurveyResponse> createDeleteSurveyResponse(DeleteSurveyResponse value) {
        return new JAXBElement<DeleteSurveyResponse>(_DeleteSurveyResponse_QNAME, DeleteSurveyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParseException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.session.lakshmigowda/", name = "ParseException")
    public JAXBElement<ParseException> createParseException(ParseException value) {
        return new JAXBElement<ParseException>(_ParseException_QNAME, ParseException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassNotFoundException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb.session.lakshmigowda/", name = "ClassNotFoundException")
    public JAXBElement<ClassNotFoundException> createClassNotFoundException(ClassNotFoundException value) {
        return new JAXBElement<ClassNotFoundException>(_ClassNotFoundException_QNAME, ClassNotFoundException.class, null, value);
    }

}
