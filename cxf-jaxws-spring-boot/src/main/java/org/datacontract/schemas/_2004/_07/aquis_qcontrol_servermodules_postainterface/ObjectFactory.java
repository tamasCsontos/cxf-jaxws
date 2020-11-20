
package org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules_postainterface;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules_postainterface package. 
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

    private final static QName _ArrayOfBranch_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", "ArrayOfBranch");
    private final static QName _Branch_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", "Branch");
    private final static QName _ArrayOfTask_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", "ArrayOfTask");
    private final static QName _Task_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", "Task");
    private final static QName _OpeningHours_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", "OpeningHours");
    private final static QName _ArrayOfOpeningHoursException_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", "ArrayOfOpeningHoursException");
    private final static QName _OpeningHoursException_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", "OpeningHoursException");
    private final static QName _ArrayOfDay_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", "ArrayOfDay");
    private final static QName _Day_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", "Day");
    private final static QName _ArrayOfLanguageString_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", "ArrayOfLanguageString");
    private final static QName _LanguageString_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", "LanguageString");
    private final static QName _ArrayOfBranchState_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", "ArrayOfBranchState");
    private final static QName _BranchState_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", "BranchState");
    private final static QName _ArrayOfTaskState_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", "ArrayOfTaskState");
    private final static QName _TaskState_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", "TaskState");
    private final static QName _ArrayOfLanguage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", "ArrayOfLanguage");
    private final static QName _Language_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", "Language");
    private final static QName _BookingTicket_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", "BookingTicket");
    private final static QName _Ticket_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", "Ticket");
    private final static QName _ArrayOfTicket_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", "ArrayOfTicket");
    private final static QName _TicketLanguageID_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", "LanguageID");
    private final static QName _BookingTicketBookingCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", "BookingCode");
    private final static QName _LanguageID_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", "ID");
    private final static QName _LanguageName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", "Name");
    private final static QName _BranchStateSeaz_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", "Seaz");
    private final static QName _BranchStateTaskStates_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", "TaskStates");
    private final static QName _LanguageStringText_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", "Text");
    private final static QName _DayDayOfWeek_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", "DayOfWeek");
    private final static QName _DayOpenTimes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", "OpenTimes");
    private final static QName _OpeningHoursExceptionWeek_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", "Week");
    private final static QName _OpeningHoursExceptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", "Exceptions");
    private final static QName _TaskBookingOpeningHours_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", "BookingOpeningHours");
    private final static QName _BranchTasks_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", "Tasks");
    private final static QName _BranchTotemType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", "TotemType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.aquis_qcontrol_servermodules_postainterface
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfBranch }
     * 
     */
    public ArrayOfBranch createArrayOfBranch() {
        return new ArrayOfBranch();
    }

    /**
     * Create an instance of {@link Branch }
     * 
     */
    public Branch createBranch() {
        return new Branch();
    }

    /**
     * Create an instance of {@link ArrayOfTask }
     * 
     */
    public ArrayOfTask createArrayOfTask() {
        return new ArrayOfTask();
    }

    /**
     * Create an instance of {@link Task }
     * 
     */
    public Task createTask() {
        return new Task();
    }

    /**
     * Create an instance of {@link OpeningHours }
     * 
     */
    public OpeningHours createOpeningHours() {
        return new OpeningHours();
    }

    /**
     * Create an instance of {@link ArrayOfOpeningHoursException }
     * 
     */
    public ArrayOfOpeningHoursException createArrayOfOpeningHoursException() {
        return new ArrayOfOpeningHoursException();
    }

    /**
     * Create an instance of {@link OpeningHoursException }
     * 
     */
    public OpeningHoursException createOpeningHoursException() {
        return new OpeningHoursException();
    }

    /**
     * Create an instance of {@link ArrayOfDay }
     * 
     */
    public ArrayOfDay createArrayOfDay() {
        return new ArrayOfDay();
    }

    /**
     * Create an instance of {@link Day }
     * 
     */
    public Day createDay() {
        return new Day();
    }

    /**
     * Create an instance of {@link ArrayOfLanguageString }
     * 
     */
    public ArrayOfLanguageString createArrayOfLanguageString() {
        return new ArrayOfLanguageString();
    }

    /**
     * Create an instance of {@link LanguageString }
     * 
     */
    public LanguageString createLanguageString() {
        return new LanguageString();
    }

    /**
     * Create an instance of {@link ArrayOfBranchState }
     * 
     */
    public ArrayOfBranchState createArrayOfBranchState() {
        return new ArrayOfBranchState();
    }

    /**
     * Create an instance of {@link BranchState }
     * 
     */
    public BranchState createBranchState() {
        return new BranchState();
    }

    /**
     * Create an instance of {@link ArrayOfTaskState }
     * 
     */
    public ArrayOfTaskState createArrayOfTaskState() {
        return new ArrayOfTaskState();
    }

    /**
     * Create an instance of {@link TaskState }
     * 
     */
    public TaskState createTaskState() {
        return new TaskState();
    }

    /**
     * Create an instance of {@link ArrayOfLanguage }
     * 
     */
    public ArrayOfLanguage createArrayOfLanguage() {
        return new ArrayOfLanguage();
    }

    /**
     * Create an instance of {@link Language }
     * 
     */
    public Language createLanguage() {
        return new Language();
    }

    /**
     * Create an instance of {@link BookingTicket }
     * 
     */
    public BookingTicket createBookingTicket() {
        return new BookingTicket();
    }

    /**
     * Create an instance of {@link Ticket }
     * 
     */
    public Ticket createTicket() {
        return new Ticket();
    }

    /**
     * Create an instance of {@link ArrayOfTicket }
     * 
     */
    public ArrayOfTicket createArrayOfTicket() {
        return new ArrayOfTicket();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBranch }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfBranch }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", name = "ArrayOfBranch")
    public JAXBElement<ArrayOfBranch> createArrayOfBranch(ArrayOfBranch value) {
        return new JAXBElement<ArrayOfBranch>(_ArrayOfBranch_QNAME, ArrayOfBranch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Branch }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Branch }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", name = "Branch")
    public JAXBElement<Branch> createBranch(Branch value) {
        return new JAXBElement<Branch>(_Branch_QNAME, Branch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTask }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfTask }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", name = "ArrayOfTask")
    public JAXBElement<ArrayOfTask> createArrayOfTask(ArrayOfTask value) {
        return new JAXBElement<ArrayOfTask>(_ArrayOfTask_QNAME, ArrayOfTask.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Task }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Task }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", name = "Task")
    public JAXBElement<Task> createTask(Task value) {
        return new JAXBElement<Task>(_Task_QNAME, Task.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpeningHours }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OpeningHours }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", name = "OpeningHours")
    public JAXBElement<OpeningHours> createOpeningHours(OpeningHours value) {
        return new JAXBElement<OpeningHours>(_OpeningHours_QNAME, OpeningHours.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOpeningHoursException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfOpeningHoursException }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", name = "ArrayOfOpeningHoursException")
    public JAXBElement<ArrayOfOpeningHoursException> createArrayOfOpeningHoursException(ArrayOfOpeningHoursException value) {
        return new JAXBElement<ArrayOfOpeningHoursException>(_ArrayOfOpeningHoursException_QNAME, ArrayOfOpeningHoursException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpeningHoursException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OpeningHoursException }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", name = "OpeningHoursException")
    public JAXBElement<OpeningHoursException> createOpeningHoursException(OpeningHoursException value) {
        return new JAXBElement<OpeningHoursException>(_OpeningHoursException_QNAME, OpeningHoursException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDay }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDay }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", name = "ArrayOfDay")
    public JAXBElement<ArrayOfDay> createArrayOfDay(ArrayOfDay value) {
        return new JAXBElement<ArrayOfDay>(_ArrayOfDay_QNAME, ArrayOfDay.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Day }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Day }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", name = "Day")
    public JAXBElement<Day> createDay(Day value) {
        return new JAXBElement<Day>(_Day_QNAME, Day.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLanguageString }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLanguageString }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", name = "ArrayOfLanguageString")
    public JAXBElement<ArrayOfLanguageString> createArrayOfLanguageString(ArrayOfLanguageString value) {
        return new JAXBElement<ArrayOfLanguageString>(_ArrayOfLanguageString_QNAME, ArrayOfLanguageString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LanguageString }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LanguageString }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", name = "LanguageString")
    public JAXBElement<LanguageString> createLanguageString(LanguageString value) {
        return new JAXBElement<LanguageString>(_LanguageString_QNAME, LanguageString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBranchState }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfBranchState }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", name = "ArrayOfBranchState")
    public JAXBElement<ArrayOfBranchState> createArrayOfBranchState(ArrayOfBranchState value) {
        return new JAXBElement<ArrayOfBranchState>(_ArrayOfBranchState_QNAME, ArrayOfBranchState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BranchState }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BranchState }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", name = "BranchState")
    public JAXBElement<BranchState> createBranchState(BranchState value) {
        return new JAXBElement<BranchState>(_BranchState_QNAME, BranchState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTaskState }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfTaskState }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", name = "ArrayOfTaskState")
    public JAXBElement<ArrayOfTaskState> createArrayOfTaskState(ArrayOfTaskState value) {
        return new JAXBElement<ArrayOfTaskState>(_ArrayOfTaskState_QNAME, ArrayOfTaskState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskState }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TaskState }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", name = "TaskState")
    public JAXBElement<TaskState> createTaskState(TaskState value) {
        return new JAXBElement<TaskState>(_TaskState_QNAME, TaskState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLanguage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLanguage }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", name = "ArrayOfLanguage")
    public JAXBElement<ArrayOfLanguage> createArrayOfLanguage(ArrayOfLanguage value) {
        return new JAXBElement<ArrayOfLanguage>(_ArrayOfLanguage_QNAME, ArrayOfLanguage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Language }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Language }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", name = "Language")
    public JAXBElement<Language> createLanguage(Language value) {
        return new JAXBElement<Language>(_Language_QNAME, Language.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookingTicket }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BookingTicket }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", name = "BookingTicket")
    public JAXBElement<BookingTicket> createBookingTicket(BookingTicket value) {
        return new JAXBElement<BookingTicket>(_BookingTicket_QNAME, BookingTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ticket }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Ticket }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", name = "Ticket")
    public JAXBElement<Ticket> createTicket(Ticket value) {
        return new JAXBElement<Ticket>(_Ticket_QNAME, Ticket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTicket }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfTicket }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", name = "ArrayOfTicket")
    public JAXBElement<ArrayOfTicket> createArrayOfTicket(ArrayOfTicket value) {
        return new JAXBElement<ArrayOfTicket>(_ArrayOfTicket_QNAME, ArrayOfTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", name = "LanguageID", scope = Ticket.class)
    public JAXBElement<String> createTicketLanguageID(String value) {
        return new JAXBElement<String>(_TicketLanguageID_QNAME, String.class, Ticket.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", name = "BookingCode", scope = BookingTicket.class)
    public JAXBElement<String> createBookingTicketBookingCode(String value) {
        return new JAXBElement<String>(_BookingTicketBookingCode_QNAME, String.class, BookingTicket.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", name = "LanguageID", scope = BookingTicket.class)
    public JAXBElement<String> createBookingTicketLanguageID(String value) {
        return new JAXBElement<String>(_TicketLanguageID_QNAME, String.class, BookingTicket.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", name = "ID", scope = Language.class)
    public JAXBElement<String> createLanguageID(String value) {
        return new JAXBElement<String>(_LanguageID_QNAME, String.class, Language.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", name = "Name", scope = Language.class)
    public JAXBElement<String> createLanguageName(String value) {
        return new JAXBElement<String>(_LanguageName_QNAME, String.class, Language.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", name = "Seaz", scope = BranchState.class)
    public JAXBElement<String> createBranchStateSeaz(String value) {
        return new JAXBElement<String>(_BranchStateSeaz_QNAME, String.class, BranchState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTaskState }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfTaskState }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", name = "TaskStates", scope = BranchState.class)
    public JAXBElement<ArrayOfTaskState> createBranchStateTaskStates(ArrayOfTaskState value) {
        return new JAXBElement<ArrayOfTaskState>(_BranchStateTaskStates_QNAME, ArrayOfTaskState.class, BranchState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", name = "LanguageID", scope = LanguageString.class)
    public JAXBElement<String> createLanguageStringLanguageID(String value) {
        return new JAXBElement<String>(_TicketLanguageID_QNAME, String.class, LanguageString.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", name = "Text", scope = LanguageString.class)
    public JAXBElement<String> createLanguageStringText(String value) {
        return new JAXBElement<String>(_LanguageStringText_QNAME, String.class, LanguageString.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", name = "DayOfWeek", scope = Day.class)
    public JAXBElement<String> createDayDayOfWeek(String value) {
        return new JAXBElement<String>(_DayDayOfWeek_QNAME, String.class, Day.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", name = "OpenTimes", scope = Day.class)
    public JAXBElement<ArrayOfstring> createDayOpenTimes(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_DayOpenTimes_QNAME, ArrayOfstring.class, Day.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDay }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDay }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", name = "Week", scope = OpeningHoursException.class)
    public JAXBElement<ArrayOfDay> createOpeningHoursExceptionWeek(ArrayOfDay value) {
        return new JAXBElement<ArrayOfDay>(_OpeningHoursExceptionWeek_QNAME, ArrayOfDay.class, OpeningHoursException.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOpeningHoursException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfOpeningHoursException }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", name = "Exceptions", scope = OpeningHours.class)
    public JAXBElement<ArrayOfOpeningHoursException> createOpeningHoursExceptions(ArrayOfOpeningHoursException value) {
        return new JAXBElement<ArrayOfOpeningHoursException>(_OpeningHoursExceptions_QNAME, ArrayOfOpeningHoursException.class, OpeningHours.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDay }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDay }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", name = "Week", scope = OpeningHours.class)
    public JAXBElement<ArrayOfDay> createOpeningHoursWeek(ArrayOfDay value) {
        return new JAXBElement<ArrayOfDay>(_OpeningHoursExceptionWeek_QNAME, ArrayOfDay.class, OpeningHours.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpeningHours }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OpeningHours }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", name = "BookingOpeningHours", scope = Task.class)
    public JAXBElement<OpeningHours> createTaskBookingOpeningHours(OpeningHours value) {
        return new JAXBElement<OpeningHours>(_TaskBookingOpeningHours_QNAME, OpeningHours.class, Task.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLanguageString }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLanguageString }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", name = "Name", scope = Task.class)
    public JAXBElement<ArrayOfLanguageString> createTaskName(ArrayOfLanguageString value) {
        return new JAXBElement<ArrayOfLanguageString>(_LanguageName_QNAME, ArrayOfLanguageString.class, Task.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", name = "Name", scope = Branch.class)
    public JAXBElement<String> createBranchName(String value) {
        return new JAXBElement<String>(_LanguageName_QNAME, String.class, Branch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", name = "Seaz", scope = Branch.class)
    public JAXBElement<String> createBranchSeaz(String value) {
        return new JAXBElement<String>(_BranchStateSeaz_QNAME, String.class, Branch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTask }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfTask }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", name = "Tasks", scope = Branch.class)
    public JAXBElement<ArrayOfTask> createBranchTasks(ArrayOfTask value) {
        return new JAXBElement<ArrayOfTask>(_BranchTasks_QNAME, ArrayOfTask.class, Branch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Aquis.QControl.ServerModules.PostaInterface.ServiceEntities", name = "TotemType", scope = Branch.class)
    public JAXBElement<String> createBranchTotemType(String value) {
        return new JAXBElement<String>(_BranchTotemType_QNAME, String.class, Branch.class, value);
    }

}
