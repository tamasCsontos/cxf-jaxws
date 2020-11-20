
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.AddBookingTicketRequest;
import org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.AddTicketRequest;
import org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.GetActiveTicketsRequest;
import org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.GetBranchesRequest;
import org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.GetFreeTimesRequest;
import org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.RevokeBookingTicketRequest;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
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

    private final static QName _GetBranchesRequest_QNAME = new QName("http://tempuri.org/", "request");
    private final static QName _GetBranchesResponseGetBranchesResult_QNAME = new QName("http://tempuri.org/", "GetBranchesResult");
    private final static QName _GetBranchStatesResponseGetBranchStatesResult_QNAME = new QName("http://tempuri.org/", "GetBranchStatesResult");
    private final static QName _GetLanguagesResponseGetLanguagesResult_QNAME = new QName("http://tempuri.org/", "GetLanguagesResult");
    private final static QName _GetFreeTimesResponseGetFreeTimesResult_QNAME = new QName("http://tempuri.org/", "GetFreeTimesResult");
    private final static QName _AddBookingTicketResponseAddBookingTicketResult_QNAME = new QName("http://tempuri.org/", "AddBookingTicketResult");
    private final static QName _RevokeBookingTicketResponseRevokeBookingTicketResult_QNAME = new QName("http://tempuri.org/", "RevokeBookingTicketResult");
    private final static QName _AddTicketResponseAddTicketResult_QNAME = new QName("http://tempuri.org/", "AddTicketResult");
    private final static QName _GetActiveTicketsResponseGetActiveTicketsResult_QNAME = new QName("http://tempuri.org/", "GetActiveTicketsResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetBranches }
     * 
     */
    public GetBranches createGetBranches() {
        return new GetBranches();
    }

    /**
     * Create an instance of {@link org.tempuri.GetBranchesResponse }
     * 
     */
    public org.tempuri.GetBranchesResponse createGetBranchesResponse() {
        return new org.tempuri.GetBranchesResponse();
    }

    /**
     * Create an instance of {@link GetBranchStates }
     * 
     */
    public GetBranchStates createGetBranchStates() {
        return new GetBranchStates();
    }

    /**
     * Create an instance of {@link org.tempuri.GetBranchStatesResponse }
     * 
     */
    public org.tempuri.GetBranchStatesResponse createGetBranchStatesResponse() {
        return new org.tempuri.GetBranchStatesResponse();
    }

    /**
     * Create an instance of {@link GetLanguages }
     * 
     */
    public GetLanguages createGetLanguages() {
        return new GetLanguages();
    }

    /**
     * Create an instance of {@link org.tempuri.GetLanguagesResponse }
     * 
     */
    public org.tempuri.GetLanguagesResponse createGetLanguagesResponse() {
        return new org.tempuri.GetLanguagesResponse();
    }

    /**
     * Create an instance of {@link GetFreeTimes }
     * 
     */
    public GetFreeTimes createGetFreeTimes() {
        return new GetFreeTimes();
    }

    /**
     * Create an instance of {@link org.tempuri.GetFreeTimesResponse }
     * 
     */
    public org.tempuri.GetFreeTimesResponse createGetFreeTimesResponse() {
        return new org.tempuri.GetFreeTimesResponse();
    }

    /**
     * Create an instance of {@link AddBookingTicket }
     * 
     */
    public AddBookingTicket createAddBookingTicket() {
        return new AddBookingTicket();
    }

    /**
     * Create an instance of {@link org.tempuri.AddBookingTicketResponse }
     * 
     */
    public org.tempuri.AddBookingTicketResponse createAddBookingTicketResponse() {
        return new org.tempuri.AddBookingTicketResponse();
    }

    /**
     * Create an instance of {@link RevokeBookingTicket }
     * 
     */
    public RevokeBookingTicket createRevokeBookingTicket() {
        return new RevokeBookingTicket();
    }

    /**
     * Create an instance of {@link org.tempuri.RevokeBookingTicketResponse }
     * 
     */
    public org.tempuri.RevokeBookingTicketResponse createRevokeBookingTicketResponse() {
        return new org.tempuri.RevokeBookingTicketResponse();
    }

    /**
     * Create an instance of {@link AddTicket }
     * 
     */
    public AddTicket createAddTicket() {
        return new AddTicket();
    }

    /**
     * Create an instance of {@link org.tempuri.AddTicketResponse }
     * 
     */
    public org.tempuri.AddTicketResponse createAddTicketResponse() {
        return new org.tempuri.AddTicketResponse();
    }

    /**
     * Create an instance of {@link GetActiveTickets }
     * 
     */
    public GetActiveTickets createGetActiveTickets() {
        return new GetActiveTickets();
    }

    /**
     * Create an instance of {@link org.tempuri.GetActiveTicketsResponse }
     * 
     */
    public org.tempuri.GetActiveTicketsResponse createGetActiveTicketsResponse() {
        return new org.tempuri.GetActiveTicketsResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBranchesRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBranchesRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "request", scope = GetBranches.class)
    public JAXBElement<GetBranchesRequest> createGetBranchesRequest(GetBranchesRequest value) {
        return new JAXBElement<GetBranchesRequest>(_GetBranchesRequest_QNAME, GetBranchesRequest.class, GetBranches.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.GetBranchesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.GetBranchesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetBranchesResult", scope = org.tempuri.GetBranchesResponse.class)
    public JAXBElement<org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.GetBranchesResponse> createGetBranchesResponseGetBranchesResult(org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.GetBranchesResponse value) {
        return new JAXBElement<org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.GetBranchesResponse>(_GetBranchesResponseGetBranchesResult_QNAME, org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.GetBranchesResponse.class, org.tempuri.GetBranchesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.GetBranchStatesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.GetBranchStatesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetBranchStatesResult", scope = org.tempuri.GetBranchStatesResponse.class)
    public JAXBElement<org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.GetBranchStatesResponse> createGetBranchStatesResponseGetBranchStatesResult(org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.GetBranchStatesResponse value) {
        return new JAXBElement<org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.GetBranchStatesResponse>(_GetBranchStatesResponseGetBranchStatesResult_QNAME, org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.GetBranchStatesResponse.class, org.tempuri.GetBranchStatesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.GetLanguagesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.GetLanguagesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetLanguagesResult", scope = org.tempuri.GetLanguagesResponse.class)
    public JAXBElement<org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.GetLanguagesResponse> createGetLanguagesResponseGetLanguagesResult(org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.GetLanguagesResponse value) {
        return new JAXBElement<org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.GetLanguagesResponse>(_GetLanguagesResponseGetLanguagesResult_QNAME, org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.GetLanguagesResponse.class, org.tempuri.GetLanguagesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFreeTimesRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFreeTimesRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "request", scope = GetFreeTimes.class)
    public JAXBElement<GetFreeTimesRequest> createGetFreeTimesRequest(GetFreeTimesRequest value) {
        return new JAXBElement<GetFreeTimesRequest>(_GetBranchesRequest_QNAME, GetFreeTimesRequest.class, GetFreeTimes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.GetFreeTimesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.GetFreeTimesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetFreeTimesResult", scope = org.tempuri.GetFreeTimesResponse.class)
    public JAXBElement<org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.GetFreeTimesResponse> createGetFreeTimesResponseGetFreeTimesResult(org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.GetFreeTimesResponse value) {
        return new JAXBElement<org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.GetFreeTimesResponse>(_GetFreeTimesResponseGetFreeTimesResult_QNAME, org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.GetFreeTimesResponse.class, org.tempuri.GetFreeTimesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBookingTicketRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddBookingTicketRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "request", scope = AddBookingTicket.class)
    public JAXBElement<AddBookingTicketRequest> createAddBookingTicketRequest(AddBookingTicketRequest value) {
        return new JAXBElement<AddBookingTicketRequest>(_GetBranchesRequest_QNAME, AddBookingTicketRequest.class, AddBookingTicket.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.AddBookingTicketResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.AddBookingTicketResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AddBookingTicketResult", scope = org.tempuri.AddBookingTicketResponse.class)
    public JAXBElement<org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.AddBookingTicketResponse> createAddBookingTicketResponseAddBookingTicketResult(org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.AddBookingTicketResponse value) {
        return new JAXBElement<org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.AddBookingTicketResponse>(_AddBookingTicketResponseAddBookingTicketResult_QNAME, org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.AddBookingTicketResponse.class, org.tempuri.AddBookingTicketResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RevokeBookingTicketRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RevokeBookingTicketRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "request", scope = RevokeBookingTicket.class)
    public JAXBElement<RevokeBookingTicketRequest> createRevokeBookingTicketRequest(RevokeBookingTicketRequest value) {
        return new JAXBElement<RevokeBookingTicketRequest>(_GetBranchesRequest_QNAME, RevokeBookingTicketRequest.class, RevokeBookingTicket.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.RevokeBookingTicketResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.RevokeBookingTicketResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RevokeBookingTicketResult", scope = org.tempuri.RevokeBookingTicketResponse.class)
    public JAXBElement<org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.RevokeBookingTicketResponse> createRevokeBookingTicketResponseRevokeBookingTicketResult(org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.RevokeBookingTicketResponse value) {
        return new JAXBElement<org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.RevokeBookingTicketResponse>(_RevokeBookingTicketResponseRevokeBookingTicketResult_QNAME, org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.RevokeBookingTicketResponse.class, org.tempuri.RevokeBookingTicketResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddTicketRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddTicketRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "request", scope = AddTicket.class)
    public JAXBElement<AddTicketRequest> createAddTicketRequest(AddTicketRequest value) {
        return new JAXBElement<AddTicketRequest>(_GetBranchesRequest_QNAME, AddTicketRequest.class, AddTicket.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.AddTicketResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.AddTicketResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AddTicketResult", scope = org.tempuri.AddTicketResponse.class)
    public JAXBElement<org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.AddTicketResponse> createAddTicketResponseAddTicketResult(org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.AddTicketResponse value) {
        return new JAXBElement<org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.AddTicketResponse>(_AddTicketResponseAddTicketResult_QNAME, org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.AddTicketResponse.class, org.tempuri.AddTicketResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActiveTicketsRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetActiveTicketsRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "request", scope = GetActiveTickets.class)
    public JAXBElement<GetActiveTicketsRequest> createGetActiveTicketsRequest(GetActiveTicketsRequest value) {
        return new JAXBElement<GetActiveTicketsRequest>(_GetBranchesRequest_QNAME, GetActiveTicketsRequest.class, GetActiveTickets.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.GetActiveTicketsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.GetActiveTicketsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetActiveTicketsResult", scope = org.tempuri.GetActiveTicketsResponse.class)
    public JAXBElement<org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.GetActiveTicketsResponse> createGetActiveTicketsResponseGetActiveTicketsResult(org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.GetActiveTicketsResponse value) {
        return new JAXBElement<org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.GetActiveTicketsResponse>(_GetActiveTicketsResponseGetActiveTicketsResult_QNAME, org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules.GetActiveTicketsResponse.class, org.tempuri.GetActiveTicketsResponse.class, value);
    }

}
