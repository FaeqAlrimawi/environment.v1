/**
 */
package environment.impl;

import environment.Action;
import environment.Actor;
import environment.Application;
import environment.Building;
import environment.BusConnection;
import environment.BusNetwork;
import environment.CCTV;
import environment.CardReader;
import environment.CoffeeMachine;
import environment.ComputingDevice;
import environment.Credential;
import environment.CredentialType;
import environment.Desktop;
import environment.DigitalAsset;
import environment.DigitalConnection;
import environment.DigitalNetwork;
import environment.DishWasher;
import environment.Elevator;
import environment.ElevatorsArea;
import environment.Employee;
import environment.EnvironmentDiagram;
import environment.File;
import environment.FileStatus;
import environment.FireAlarm;
import environment.Floor;
import environment.HVAC;
import environment.Hallway;
import environment.IPConnection;
import environment.IPNetwork;
import environment.Kitchen;
import environment.Lab;
import environment.Laptop;
import environment.Lounge;
import environment.PhysicalAsset;
import environment.PhysicalConnection;
import environment.PhysicalStructure;
import environment.Port;
import environment.ProcessStatus;
import environment.Property;
import environment.Room;
import environment.Server;
import environment.SmartLight;
import environment.Stairs;
import environment.Status;
import environment.Toilet;
import environment.Type;
import environment.Visitor;
import environment.Workstation;
import environment.cpsFactory;
import environment.cpsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class cpsFactoryImpl extends EFactoryImpl implements cpsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static cpsFactory init() {
		try {
			cpsFactory thecpsFactory = (cpsFactory)EPackage.Registry.INSTANCE.getEFactory(cpsPackage.eNS_URI);
			if (thecpsFactory != null) {
				return thecpsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new cpsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public cpsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case cpsPackage.PHYSICAL_ASSET: return createPhysicalAsset();
			case cpsPackage.COMPUTING_DEVICE: return createComputingDevice();
			case cpsPackage.HVAC: return createHVAC();
			case cpsPackage.SMART_LIGHT: return createSmartLight();
			case cpsPackage.LAPTOP: return createLaptop();
			case cpsPackage.DESKTOP: return createDesktop();
			case cpsPackage.CCTV: return createCCTV();
			case cpsPackage.SERVER: return createServer();
			case cpsPackage.FILE: return createFile();
			case cpsPackage.PROCESS: return createProcess();
			case cpsPackage.APPLICATION: return createApplication();
			case cpsPackage.DIGITAL_CONNECTION: return createDigitalConnection();
			case cpsPackage.PHYSICAL_CONNECTION: return createPhysicalConnection();
			case cpsPackage.ENVIRONMENT_DIAGRAM: return createEnvironmentDiagram();
			case cpsPackage.PORT: return createPort();
			case cpsPackage.PROPERTY: return createProperty();
			case cpsPackage.CREDENTIAL: return createCredential();
			case cpsPackage.ACTOR: return createActor();
			case cpsPackage.PHYSICAL_STRUCTURE: return createPhysicalStructure();
			case cpsPackage.DIGITAL_ASSET: return createDigitalAsset();
			case cpsPackage.ACTION: return createAction();
			case cpsPackage.TYPE: return createType();
			case cpsPackage.ROOM: return createRoom();
			case cpsPackage.FLOOR: return createFloor();
			case cpsPackage.BUILDING: return createBuilding();
			case cpsPackage.FIRE_ALARM: return createFireAlarm();
			case cpsPackage.WORKSTATION: return createWorkstation();
			case cpsPackage.LAB: return createLab();
			case cpsPackage.TOILET: return createToilet();
			case cpsPackage.LOUNGE: return createLounge();
			case cpsPackage.DISH_WASHER: return createDishWasher();
			case cpsPackage.COFFEE_MACHINE: return createCoffeeMachine();
			case cpsPackage.ELEVATOR: return createElevator();
			case cpsPackage.HALLWAY: return createHallway();
			case cpsPackage.ELEVATORS_AREA: return createElevatorsArea();
			case cpsPackage.IP_NETWORK: return createIPNetwork();
			case cpsPackage.DIGITAL_NETWORK: return createDigitalNetwork();
			case cpsPackage.BUS_NETWORK: return createBusNetwork();
			case cpsPackage.IP_CONNECTION: return createIPConnection();
			case cpsPackage.BUS_CONNECTION: return createBusConnection();
			case cpsPackage.KITCHEN: return createKitchen();
			case cpsPackage.STAIRS: return createStairs();
			case cpsPackage.CARD_READER: return createCardReader();
			case cpsPackage.EMPLOYEE: return createEmployee();
			case cpsPackage.VISITOR: return createVisitor();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case cpsPackage.STATUS:
				return createStatusFromString(eDataType, initialValue);
			case cpsPackage.PROCESS_STATUS:
				return createProcessStatusFromString(eDataType, initialValue);
			case cpsPackage.FILE_STATUS:
				return createFileStatusFromString(eDataType, initialValue);
			case cpsPackage.CREDENTIAL_TYPE:
				return createCredentialTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case cpsPackage.STATUS:
				return convertStatusToString(eDataType, instanceValue);
			case cpsPackage.PROCESS_STATUS:
				return convertProcessStatusToString(eDataType, instanceValue);
			case cpsPackage.FILE_STATUS:
				return convertFileStatusToString(eDataType, instanceValue);
			case cpsPackage.CREDENTIAL_TYPE:
				return convertCredentialTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalAsset createPhysicalAsset() {
		PhysicalAssetImpl physicalAsset = new PhysicalAssetImpl();
		return physicalAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputingDevice createComputingDevice() {
		ComputingDeviceImpl computingDevice = new ComputingDeviceImpl();
		return computingDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HVAC createHVAC() {
		HVACImpl hvac = new HVACImpl();
		return hvac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartLight createSmartLight() {
		SmartLightImpl smartLight = new SmartLightImpl();
		return smartLight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Laptop createLaptop() {
		LaptopImpl laptop = new LaptopImpl();
		return laptop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Desktop createDesktop() {
		DesktopImpl desktop = new DesktopImpl();
		return desktop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CCTV createCCTV() {
		CCTVImpl cctv = new CCTVImpl();
		return cctv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Server createServer() {
		ServerImpl server = new ServerImpl();
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File createFile() {
		FileImpl file = new FileImpl();
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public environment.Process createProcess() {
		ProcessImpl process = new ProcessImpl();
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application createApplication() {
		ApplicationImpl application = new ApplicationImpl();
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DigitalConnection createDigitalConnection() {
		DigitalConnectionImpl digitalConnection = new DigitalConnectionImpl();
		return digitalConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalConnection createPhysicalConnection() {
		PhysicalConnectionImpl physicalConnection = new PhysicalConnectionImpl();
		return physicalConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentDiagram createEnvironmentDiagram() {
		EnvironmentDiagramImpl environmentDiagram = new EnvironmentDiagramImpl();
		return environmentDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Credential createCredential() {
		CredentialImpl credential = new CredentialImpl();
		return credential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalStructure createPhysicalStructure() {
		PhysicalStructureImpl physicalStructure = new PhysicalStructureImpl();
		return physicalStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DigitalAsset createDigitalAsset() {
		DigitalAssetImpl digitalAsset = new DigitalAssetImpl();
		return digitalAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createType() {
		TypeImpl type = new TypeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room createRoom() {
		RoomImpl room = new RoomImpl();
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Floor createFloor() {
		FloorImpl floor = new FloorImpl();
		return floor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Building createBuilding() {
		BuildingImpl building = new BuildingImpl();
		return building;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FireAlarm createFireAlarm() {
		FireAlarmImpl fireAlarm = new FireAlarmImpl();
		return fireAlarm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workstation createWorkstation() {
		WorkstationImpl workstation = new WorkstationImpl();
		return workstation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lab createLab() {
		LabImpl lab = new LabImpl();
		return lab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Toilet createToilet() {
		ToiletImpl toilet = new ToiletImpl();
		return toilet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lounge createLounge() {
		LoungeImpl lounge = new LoungeImpl();
		return lounge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DishWasher createDishWasher() {
		DishWasherImpl dishWasher = new DishWasherImpl();
		return dishWasher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoffeeMachine createCoffeeMachine() {
		CoffeeMachineImpl coffeeMachine = new CoffeeMachineImpl();
		return coffeeMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Elevator createElevator() {
		ElevatorImpl elevator = new ElevatorImpl();
		return elevator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hallway createHallway() {
		HallwayImpl hallway = new HallwayImpl();
		return hallway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElevatorsArea createElevatorsArea() {
		ElevatorsAreaImpl elevatorsArea = new ElevatorsAreaImpl();
		return elevatorsArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPNetwork createIPNetwork() {
		IPNetworkImpl ipNetwork = new IPNetworkImpl();
		return ipNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DigitalNetwork createDigitalNetwork() {
		DigitalNetworkImpl digitalNetwork = new DigitalNetworkImpl();
		return digitalNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusNetwork createBusNetwork() {
		BusNetworkImpl busNetwork = new BusNetworkImpl();
		return busNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPConnection createIPConnection() {
		IPConnectionImpl ipConnection = new IPConnectionImpl();
		return ipConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusConnection createBusConnection() {
		BusConnectionImpl busConnection = new BusConnectionImpl();
		return busConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kitchen createKitchen() {
		KitchenImpl kitchen = new KitchenImpl();
		return kitchen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stairs createStairs() {
		StairsImpl stairs = new StairsImpl();
		return stairs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardReader createCardReader() {
		CardReaderImpl cardReader = new CardReaderImpl();
		return cardReader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employee createEmployee() {
		EmployeeImpl employee = new EmployeeImpl();
		return employee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visitor createVisitor() {
		VisitorImpl visitor = new VisitorImpl();
		return visitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status createStatusFromString(EDataType eDataType, String initialValue) {
		Status result = Status.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessStatus createProcessStatusFromString(EDataType eDataType, String initialValue) {
		ProcessStatus result = ProcessStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileStatus createFileStatusFromString(EDataType eDataType, String initialValue) {
		FileStatus result = FileStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFileStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CredentialType createCredentialTypeFromString(EDataType eDataType, String initialValue) {
		CredentialType result = CredentialType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCredentialTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public cpsPackage getcpsPackage() {
		return (cpsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static cpsPackage getPackage() {
		return cpsPackage.eINSTANCE;
	}

} //cpsFactoryImpl
