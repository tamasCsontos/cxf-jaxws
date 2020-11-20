
package org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfdateTime;
import org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules_postainterface.ArrayOfBranch;
import org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules_postainterface.ArrayOfBranchState;
import org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules_postainterface.ArrayOfLanguage;
import org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules_postainterface.ArrayOfTicket;
import org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules_postainterface.BookingTicket;
import org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules_postainterface.Ticket;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules package. 
 * &lt;p&gt;An ObjectFactory allows you to programatically 
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

    private final static QName _GetBranchesRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", "GetBranchesRequest");
    private final static QName _GetBranchesResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", "GetBranchesResponse");
    private final static QName _ResponseBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", "ResponseBase");
    private final static QName _GetBranchStatesResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", "GetBranchStatesResponse");
    private final static QName _GetLanguagesResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", "GetLanguagesResponse");
    private final static QName _GetFreeTimesRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", "GetFreeTimesRequest");
    private final static QName _RequestBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", "RequestBase");
    private final static QName _GetFreeTimesResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", "GetFreeTimesResponse");
    private final static QName _AddBookingTicketRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", "AddBookingTicketRequest");
    private final static QName _AddBookingTicketResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", "AddBookingTicketResponse");
    private final static QName _RevokeBookingTicketRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", "RevokeBookingTicketRequest");
    private final static QName _RevokeBookingTicketResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", "RevokeBookingTicketResponse");
    private final static QName _AddTicketRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", "AddTicketRequest");
    private final static QName _AddTicketResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", "AddTicketResponse");
    private final static QName _GetActiveTicketsRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", "GetActiveTicketsRequest");
    private final static QName _GetActiveTicketsResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", "GetActiveTicketsResponse");
    private final static QName _ResponseBaseErrorCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", "ErrorCode");
    private final static QName _GetActiveTicketsResponseActiveTickets_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", "ActiveTickets");
    private final static QName _GetActiveTicketsRequestSeaz_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", "Seaz");
    private final static QName _AddTicketResponseTicket_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", "Ticket");
    private final static QName _AddTicketRequestLanguageID_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", "LanguageID");
    private final static QName _RevokeBookingTicketRequestBookingCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", "BookingCode");
    private final static QName _AddBookingTicketResponseBookingTicket_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", "BookingTicket");
    private final static QName _GetFreeTimesResponseFreeTimes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", "FreeTimes");
    private final static QName _GetLanguagesResponseLanguages_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", "Languages");
    private final static QName _GetBranchStatesResponseBranchStates_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", "BranchStates");
    private final static QName _GetBranchesResponseBranches_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", "Branches");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetBranchesRequest }
     * 
     */
    public GetBranchesRequest createGetBranchesRequest() {
        return new GetBranchesRequest();
    }

    /**
     * Create an instance of {@link GetBranchesResponse }
     * 
     */
    public GetBranchesResponse createGetBranchesResponse() {
        return new GetBranchesResponse();
    }

    /**
     * Create an instance of {@link ResponseBase }
     * 
     */
    public ResponseBase createResponseBase() {
        return new ResponseBase();
    }

    /**
     * Create an instance of {@link GetBranchStatesResponse }
     * 
     */
    public GetBranchStatesResponse createGetBranchStatesResponse() {
        return new GetBranchStatesResponse();
    }

    /**
     * Create an instance of {@link GetLanguagesResponse }
     * 
     */
    public GetLanguagesResponse createGetLanguagesResponse() {
        return new GetLanguagesResponse();
    }

    /**
     * Create an instance of {@link GetFreeTimesRequest }
     * 
     */
    public GetFreeTimesRequest createGetFreeTimesRequest() {
        return new GetFreeTimesRequest();
    }

    /**
     * Create an instance of {@link RequestBase }
     * 
     */
    public RequestBase createRequestBase() {
        return new RequestBase();
    }

    /**
     * Create an instance of {@link GetFreeTimesResponse }
     * 
     */
    public GetFreeTimesResponse createGetFreeTimesResponse() {
        return new GetFreeTimesResponse();
    }

    /**
     * Create an instance of {@link AddBookingTicketRequest }
     * 
     */
    public AddBookingTicketRequest createAddBookingTicketRequest() {
        return new AddBookingTicketRequest();
    }

    /**
     * Create an instance of {@link AddBookingTicketResponse }
     * 
     */
    public AddBookingTicketResponse createAddBookingTicketResponse() {
        return new AddBookingTicketResponse();
    }

    /**
     * Create an instance of {@link RevokeBookingTicketRequest }
     * 
     */
    public RevokeBookingTicketRequest createRevokeBookingTicketRequest() {
        return new RevokeBookingTicketRequest();
    }

    /**
     * Create an instance of {@link RevokeBookingTicketResponse }
     * 
     */
    public RevokeBookingTicketResponse createRevokeBookingTicketResponse() {
        return new RevokeBookingTicketResponse();
    }

    /**
     * Create an instance of {@link AddTicketRequest }
     * 
     */
    public AddTicketRequest createAddTicketRequest() {
        return new AddTicketRequest();
    }

    /**
     * Create an instance of {@link AddTicketResponse }
     * 
     */
    public AddTicketResponse createAddTicketResponse() {
        return new AddTicketResponse();
    }

    /**
     * Create an instance of {@link GetActiveTicketsRequest }
     * 
     */
    public GetActiveTicketsRequest createGetActiveTicketsRequest() {
        return new GetActiveTicketsRequest();
    }

    /**
     * Create an instance of {@link GetActiveTicketsResponse }
     * 
     */
    public GetActiveTicketsResponse createGetActiveTicketsResponse() {
        return new GetActiveTicketsResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBranchesRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBranchesRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", name = "GetBranchesRequest")
    public JAXBElement<GetBranchesRequest> createGetBranchesRequest(GetBranchesRequest value) {
        return new JAXBElement<GetBranchesRequest>(_GetBranchesRequest_QNAME, GetBranchesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBranchesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBranchesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", name = "GetBranchesResponse")
    public JAXBElement<GetBranchesResponse> createGetBranchesResponse(GetBranchesResponse value) {
        return new JAXBElement<GetBranchesResponse>(_GetBranchesResponse_QNAME, GetBranchesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResponseBase }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", name = "ResponseBase")
    public JAXBElement<ResponseBase> createResponseBase(ResponseBase value) {
        return new JAXBElement<ResponseBase>(_ResponseBase_QNAME, ResponseBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBranchStatesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBranchStatesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", name = "GetBranchStatesResponse")
    public JAXBElement<GetBranchStatesResponse> createGetBranchStatesResponse(GetBranchStatesResponse value) {
        return new JAXBElement<GetBranchStatesResponse>(_GetBranchStatesResponse_QNAME, GetBranchStatesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLanguagesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetLanguagesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", name = "GetLanguagesResponse")
    public JAXBElement<GetLanguagesResponse> createGetLanguagesResponse(GetLanguagesResponse value) {
        return new JAXBElement<GetLanguagesResponse>(_GetLanguagesResponse_QNAME, GetLanguagesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFreeTimesRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFreeTimesRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", name = "GetFreeTimesRequest")
    public JAXBElement<GetFreeTimesRequest> createGetFreeTimesRequest(GetFreeTimesRequest value) {
        return new JAXBElement<GetFreeTimesRequest>(_GetFreeTimesRequest_QNAME, GetFreeTimesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RequestBase }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", name = "RequestBase")
    public JAXBElement<RequestBase> createRequestBase(RequestBase value) {
        return new JAXBElement<RequestBase>(_RequestBase_QNAME, RequestBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFreeTimesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFreeTimesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", name = "GetFreeTimesResponse")
    public JAXBElement<GetFreeTimesResponse> createGetFreeTimesResponse(GetFreeTimesResponse value) {
        return new JAXBElement<GetFreeTimesResponse>(_GetFreeTimesResponse_QNAME, GetFreeTimesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBookingTicketRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddBookingTicketRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", name = "AddBookingTicketRequest")
    public JAXBElement<AddBookingTicketRequest> createAddBookingTicketRequest(AddBookingTicketRequest value) {
        return new JAXBElement<AddBookingTicketRequest>(_AddBookingTicketRequest_QNAME, AddBookingTicketRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBookingTicketResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddBookingTicketResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", name = "AddBookingTicketResponse")
    public JAXBElement<AddBookingTicketResponse> createAddBookingTicketResponse(AddBookingTicketResponse value) {
        return new JAXBElement<AddBookingTicketResponse>(_AddBookingTicketResponse_QNAME, AddBookingTicketResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RevokeBookingTicketRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RevokeBookingTicketRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", name = "RevokeBookingTicketRequest")
    public JAXBElement<RevokeBookingTicketRequest> createRevokeBookingTicketRequest(RevokeBookingTicketRequest value) {
        return new JAXBElement<RevokeBookingTicketRequest>(_RevokeBookingTicketRequest_QNAME, RevokeBookingTicketRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RevokeBookingTicketResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RevokeBookingTicketResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", name = "RevokeBookingTicketResponse")
    public JAXBElement<RevokeBookingTicketResponse> createRevokeBookingTicketResponse(RevokeBookingTicketResponse value) {
        return new JAXBElement<RevokeBookingTicketResponse>(_RevokeBookingTicketResponse_QNAME, RevokeBookingTicketResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddTicketRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddTicketRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", name = "AddTicketRequest")
    public JAXBElement<AddTicketRequest> createAddTicketRequest(AddTicketRequest value) {
        return new JAXBElement<AddTicketRequest>(_AddTicketRequest_QNAME, AddTicketRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddTicketResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddTicketResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", name = "AddTicketResponse")
    public JAXBElement<AddTicketResponse> createAddTicketResponse(AddTicketResponse value) {
        return new JAXBElement<AddTicketResponse>(_AddTicketResponse_QNAME, AddTicketResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActiveTicketsRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetActiveTicketsRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", name = "GetActiveTicketsRequest")
    public JAXBElement<GetActiveTicketsRequest> createGetActiveTicketsRequest(GetActiveTicketsRequest value) {
        return new JAXBElement<GetActiveTicketsRequest>(_GetActiveTicketsRequest_QNAME, GetActiveTicketsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActiveTicketsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetActiveTicketsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", name = "GetActiveTicketsResponse")
    public JAXBElement<GetActiveTicketsResponse> createGetActiveTicketsResponse(GetActiveTicketsResponse value) {
        return new JAXBElement<GetActiveTicketsResponse>(_GetActiveTicketsResponse_QNAME, GetActiveTicketsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", name = "ErrorCode", scope = ResponseBase.class)
    public JAXBElement<String> createResponseBaseErrorCode(String value) {
        return new JAXBElement<String>(_ResponseBaseErrorCode_QNAME, String.class, ResponseBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTicket }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfTicket }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", name = "ActiveTickets", scope = GetActiveTicketsResponse.class)
    public JAXBElement<ArrayOfTicket> createGetActiveTicketsResponseActiveTickets(ArrayOfTicket value) {
        return new JAXBElement<ArrayOfTicket>(_GetActiveTicketsResponseActiveTickets_QNAME, ArrayOfTicket.class, GetActiveTicketsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", name = "Seaz", scope = GetActiveTicketsRequest.class)
    public JAXBElement<String> createGetActiveTicketsRequestSeaz(String value) {
        return new JAXBElement<String>(_GetActiveTicketsRequestSeaz_QNAME, String.class, GetActiveTicketsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ticket }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Ticket }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", name = "Ticket", scope = AddTicketResponse.class)
    public JAXBElement<Ticket> createAddTicketResponseTicket(Ticket value) {
        return new JAXBElement<Ticket>(_AddTicketResponseTicket_QNAME, Ticket.class, AddTicketResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", name = "LanguageID", scope = AddTicketRequest.class)
    public JAXBElement<String> createAddTicketRequestLanguageID(String value) {
        return new JAXBElement<String>(_AddTicketRequestLanguageID_QNAME, String.class, AddTicketRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", name = "Seaz", scope = AddTicketRequest.class)
    public JAXBElement<String> createAddTicketRequestSeaz(String value) {
        return new JAXBElement<String>(_GetActiveTicketsRequestSeaz_QNAME, String.class, AddTicketRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", name = "BookingCode", scope = RevokeBookingTicketRequest.class)
    public JAXBElement<String> createRevokeBookingTicketRequestBookingCode(String value) {
        return new JAXBElement<String>(_RevokeBookingTicketRequestBookingCode_QNAME, String.class, RevokeBookingTicketRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookingTicket }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BookingTicket }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", name = "BookingTicket", scope = AddBookingTicketResponse.class)
    public JAXBElement<BookingTicket> createAddBookingTicketResponseBookingTicket(BookingTicket value) {
        return new JAXBElement<BookingTicket>(_AddBookingTicketResponseBookingTicket_QNAME, BookingTicket.class, AddBookingTicketResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", name = "LanguageID", scope = AddBookingTicketRequest.class)
    public JAXBElement<String> createAddBookingTicketRequestLanguageID(String value) {
        return new JAXBElement<String>(_AddTicketRequestLanguageID_QNAME, String.class, AddBookingTicketRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", name = "Seaz", scope = AddBookingTicketRequest.class)
    public JAXBElement<String> createAddBookingTicketRequestSeaz(String value) {
        return new JAXBElement<String>(_GetActiveTicketsRequestSeaz_QNAME, String.class, AddBookingTicketRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfdateTime }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfdateTime }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", name = "FreeTimes", scope = GetFreeTimesResponse.class)
    public JAXBElement<ArrayOfdateTime> createGetFreeTimesResponseFreeTimes(ArrayOfdateTime value) {
        return new JAXBElement<ArrayOfdateTime>(_GetFreeTimesResponseFreeTimes_QNAME, ArrayOfdateTime.class, GetFreeTimesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", name = "Seaz", scope = GetFreeTimesRequest.class)
    public JAXBElement<String> createGetFreeTimesRequestSeaz(String value) {
        return new JAXBElement<String>(_GetActiveTicketsRequestSeaz_QNAME, String.class, GetFreeTimesRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLanguage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLanguage }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", name = "Languages", scope = GetLanguagesResponse.class)
    public JAXBElement<ArrayOfLanguage> createGetLanguagesResponseLanguages(ArrayOfLanguage value) {
        return new JAXBElement<ArrayOfLanguage>(_GetLanguagesResponseLanguages_QNAME, ArrayOfLanguage.class, GetLanguagesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBranchState }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfBranchState }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", name = "BranchStates", scope = GetBranchStatesResponse.class)
    public JAXBElement<ArrayOfBranchState> createGetBranchStatesResponseBranchStates(ArrayOfBranchState value) {
        return new JAXBElement<ArrayOfBranchState>(_GetBranchStatesResponseBranchStates_QNAME, ArrayOfBranchState.class, GetBranchStatesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBranch }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfBranch }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface", name = "Branches", scope = GetBranchesResponse.class)
    public JAXBElement<ArrayOfBranch> createGetBranchesResponseBranches(ArrayOfBranch value) {
        return new JAXBElement<ArrayOfBranch>(_GetBranchesResponseBranches_QNAME, ArrayOfBranch.class, GetBranchesResponse.class, value);
    }

}
