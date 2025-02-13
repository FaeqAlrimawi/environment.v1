/**
 */
package environment.impl;

import environment.AccessPoint;
import environment.Action;
import environment.Actor;
import environment.Application;
import environment.Building;
import environment.BusConnection;
import environment.BusNetwork;
import environment.CCTV;
import environment.CardReader;
import environment.CoffeeMachine;
import environment.Computer;
import environment.ComputingDevice;
import environment.Credential;
import environment.CredentialType;
import environment.CyberPhysicalSystemFactory;
import environment.CyberPhysicalSystemPackage;
import environment.Desktop;
import environment.DigitalAsset;
import environment.DigitalConnection;
import environment.DigitalNetwork;
import environment.DigitalStatus;
import environment.DishWasher;
import environment.Elevator;
import environment.ElevatorsArea;
import environment.EmbeddedComputer;
import environment.Employee;
import environment.EnvironmentDiagram;
import environment.Ethernet;
import environment.File;
import environment.FileStatus;
import environment.FireAlarm;
import environment.Floor;
import environment.HVAC;
import environment.Hallway;
import environment.IPConnection;
import environment.IPNetwork;
import environment.KNX;
import environment.Kitchen;
import environment.Lab;
import environment.Laptop;
import environment.Level;
import environment.Lounge;
import environment.Malware;
import environment.MicroController;
import environment.Mobility;
import environment.Office;
import environment.PhysicalAsset;
import environment.PhysicalConnection;
import environment.PhysicalStructure;
import environment.Port;
import environment.Printer;
import environment.Property;
import environment.Room;
import environment.Server;
import environment.SmartLight;
import environment.SmartTV;
import environment.Stairs;
import environment.Status;
import environment.Toilet;
import environment.Type;
import environment.Visitor;
import environment.Vulnerability;
import environment.Walkway;
import environment.WiredConnection;
import environment.Workstation;

import environment.X10;
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
public class CyberPhysicalSystemFactoryImpl extends EFactoryImpl implements CyberPhysicalSystemFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CyberPhysicalSystemFactory init() {
		try {
			CyberPhysicalSystemFactory theCyberPhysicalSystemFactory = (CyberPhysicalSystemFactory)EPackage.Registry.INSTANCE.getEFactory(CyberPhysicalSystemPackage.eNS_URI);
			if (theCyberPhysicalSystemFactory != null) {
				return theCyberPhysicalSystemFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CyberPhysicalSystemFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CyberPhysicalSystemFactoryImpl() {
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
			case CyberPhysicalSystemPackage.PHYSICAL_ASSET: return createPhysicalAsset();
			case CyberPhysicalSystemPackage.COMPUTING_DEVICE: return createComputingDevice();
			case CyberPhysicalSystemPackage.HVAC: return createHVAC();
			case CyberPhysicalSystemPackage.SMART_LIGHT: return createSmartLight();
			case CyberPhysicalSystemPackage.LAPTOP: return createLaptop();
			case CyberPhysicalSystemPackage.DESKTOP: return createDesktop();
			case CyberPhysicalSystemPackage.CCTV: return createCCTV();
			case CyberPhysicalSystemPackage.SERVER: return createServer();
			case CyberPhysicalSystemPackage.FILE: return createFile();
			case CyberPhysicalSystemPackage.PROCESS: return createProcess();
			case CyberPhysicalSystemPackage.APPLICATION: return createApplication();
			case CyberPhysicalSystemPackage.DIGITAL_CONNECTION: return createDigitalConnection();
			case CyberPhysicalSystemPackage.PHYSICAL_CONNECTION: return createPhysicalConnection();
			case CyberPhysicalSystemPackage.ENVIRONMENT_DIAGRAM: return createEnvironmentDiagram();
			case CyberPhysicalSystemPackage.PORT: return createPort();
			case CyberPhysicalSystemPackage.PROPERTY: return createProperty();
			case CyberPhysicalSystemPackage.CREDENTIAL: return createCredential();
			case CyberPhysicalSystemPackage.ACTOR: return createActor();
			case CyberPhysicalSystemPackage.PHYSICAL_STRUCTURE: return createPhysicalStructure();
			case CyberPhysicalSystemPackage.DIGITAL_ASSET: return createDigitalAsset();
			case CyberPhysicalSystemPackage.ACTION: return createAction();
			case CyberPhysicalSystemPackage.TYPE: return createType();
			case CyberPhysicalSystemPackage.ROOM: return createRoom();
			case CyberPhysicalSystemPackage.FLOOR: return createFloor();
			case CyberPhysicalSystemPackage.BUILDING: return createBuilding();
			case CyberPhysicalSystemPackage.FIRE_ALARM: return createFireAlarm();
			case CyberPhysicalSystemPackage.WORKSTATION: return createWorkstation();
			case CyberPhysicalSystemPackage.LAB: return createLab();
			case CyberPhysicalSystemPackage.TOILET: return createToilet();
			case CyberPhysicalSystemPackage.LOUNGE: return createLounge();
			case CyberPhysicalSystemPackage.DISH_WASHER: return createDishWasher();
			case CyberPhysicalSystemPackage.COFFEE_MACHINE: return createCoffeeMachine();
			case CyberPhysicalSystemPackage.ELEVATOR: return createElevator();
			case CyberPhysicalSystemPackage.HALLWAY: return createHallway();
			case CyberPhysicalSystemPackage.ELEVATORS_AREA: return createElevatorsArea();
			case CyberPhysicalSystemPackage.IP_NETWORK: return createIPNetwork();
			case CyberPhysicalSystemPackage.DIGITAL_NETWORK: return createDigitalNetwork();
			case CyberPhysicalSystemPackage.BUS_NETWORK: return createBusNetwork();
			case CyberPhysicalSystemPackage.IP_CONNECTION: return createIPConnection();
			case CyberPhysicalSystemPackage.BUS_CONNECTION: return createBusConnection();
			case CyberPhysicalSystemPackage.KITCHEN: return createKitchen();
			case CyberPhysicalSystemPackage.STAIRS: return createStairs();
			case CyberPhysicalSystemPackage.CARD_READER: return createCardReader();
			case CyberPhysicalSystemPackage.EMPLOYEE: return createEmployee();
			case CyberPhysicalSystemPackage.VISITOR: return createVisitor();
			case CyberPhysicalSystemPackage.COMPUTER: return createComputer();
			case CyberPhysicalSystemPackage.EMBEDDED_COMPUTER: return createEmbeddedComputer();
			case CyberPhysicalSystemPackage.MICRO_CONTROLLER: return createMicroController();
			case CyberPhysicalSystemPackage.WIRED_CONNECTION: return createWiredConnection();
			case CyberPhysicalSystemPackage.ETHERNET: return createEthernet();
			case CyberPhysicalSystemPackage.WALKWAY: return createWalkway();
			case CyberPhysicalSystemPackage.KNX: return createKNX();
			case CyberPhysicalSystemPackage.X10: return createX10();
			case CyberPhysicalSystemPackage.VULNERABILITY: return createVulnerability();
			case CyberPhysicalSystemPackage.OFFICE: return createOffice();
			case CyberPhysicalSystemPackage.SMART_TV: return createSmartTV();
			case CyberPhysicalSystemPackage.ACCESS_POINT: return createAccessPoint();
			case CyberPhysicalSystemPackage.MALWARE: return createMalware();
			case CyberPhysicalSystemPackage.PRINTER: return createPrinter();
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
			case CyberPhysicalSystemPackage.STATUS:
				return createStatusFromString(eDataType, initialValue);
			case CyberPhysicalSystemPackage.DIGITAL_STATUS:
				return createDigitalStatusFromString(eDataType, initialValue);
			case CyberPhysicalSystemPackage.FILE_STATUS:
				return createFileStatusFromString(eDataType, initialValue);
			case CyberPhysicalSystemPackage.CREDENTIAL_TYPE:
				return createCredentialTypeFromString(eDataType, initialValue);
			case CyberPhysicalSystemPackage.LEVEL:
				return createLevelFromString(eDataType, initialValue);
			case CyberPhysicalSystemPackage.MOBILITY:
				return createMobilityFromString(eDataType, initialValue);
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
			case CyberPhysicalSystemPackage.STATUS:
				return convertStatusToString(eDataType, instanceValue);
			case CyberPhysicalSystemPackage.DIGITAL_STATUS:
				return convertDigitalStatusToString(eDataType, instanceValue);
			case CyberPhysicalSystemPackage.FILE_STATUS:
				return convertFileStatusToString(eDataType, instanceValue);
			case CyberPhysicalSystemPackage.CREDENTIAL_TYPE:
				return convertCredentialTypeToString(eDataType, instanceValue);
			case CyberPhysicalSystemPackage.LEVEL:
				return convertLevelToString(eDataType, instanceValue);
			case CyberPhysicalSystemPackage.MOBILITY:
				return convertMobilityToString(eDataType, instanceValue);
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
	public PhysicalAsset createPhysicalAsset() {
		PhysicalAssetImpl physicalAsset = new PhysicalAssetImpl();
		return physicalAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComputingDevice createComputingDevice() {
		ComputingDeviceImpl computingDevice = new ComputingDeviceImpl();
		return computingDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HVAC createHVAC() {
		HVACImpl hvac = new HVACImpl();
		return hvac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SmartLight createSmartLight() {
		SmartLightImpl smartLight = new SmartLightImpl();
		return smartLight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Laptop createLaptop() {
		LaptopImpl laptop = new LaptopImpl();
		return laptop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Desktop createDesktop() {
		DesktopImpl desktop = new DesktopImpl();
		return desktop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CCTV createCCTV() {
		CCTVImpl cctv = new CCTVImpl();
		return cctv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Server createServer() {
		ServerImpl server = new ServerImpl();
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public File createFile() {
		FileImpl file = new FileImpl();
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public environment.Process createProcess() {
		ProcessImpl process = new ProcessImpl();
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Application createApplication() {
		ApplicationImpl application = new ApplicationImpl();
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DigitalConnection createDigitalConnection() {
		DigitalConnectionImpl digitalConnection = new DigitalConnectionImpl();
		return digitalConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicalConnection createPhysicalConnection() {
		PhysicalConnectionImpl physicalConnection = new PhysicalConnectionImpl();
		return physicalConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnvironmentDiagram createEnvironmentDiagram() {
		EnvironmentDiagramImpl environmentDiagram = new EnvironmentDiagramImpl();
		return environmentDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Credential createCredential() {
		CredentialImpl credential = new CredentialImpl();
		return credential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicalStructure createPhysicalStructure() {
		PhysicalStructureImpl physicalStructure = new PhysicalStructureImpl();
		return physicalStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DigitalAsset createDigitalAsset() {
		DigitalAssetImpl digitalAsset = new DigitalAssetImpl();
		return digitalAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type createType() {
		TypeImpl type = new TypeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Room createRoom() {
		RoomImpl room = new RoomImpl();
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Floor createFloor() {
		FloorImpl floor = new FloorImpl();
		return floor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Building createBuilding() {
		BuildingImpl building = new BuildingImpl();
		return building;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FireAlarm createFireAlarm() {
		FireAlarmImpl fireAlarm = new FireAlarmImpl();
		return fireAlarm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Workstation createWorkstation() {
		WorkstationImpl workstation = new WorkstationImpl();
		return workstation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lab createLab() {
		LabImpl lab = new LabImpl();
		return lab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Toilet createToilet() {
		ToiletImpl toilet = new ToiletImpl();
		return toilet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lounge createLounge() {
		LoungeImpl lounge = new LoungeImpl();
		return lounge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DishWasher createDishWasher() {
		DishWasherImpl dishWasher = new DishWasherImpl();
		return dishWasher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoffeeMachine createCoffeeMachine() {
		CoffeeMachineImpl coffeeMachine = new CoffeeMachineImpl();
		return coffeeMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Elevator createElevator() {
		ElevatorImpl elevator = new ElevatorImpl();
		return elevator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hallway createHallway() {
		HallwayImpl hallway = new HallwayImpl();
		return hallway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElevatorsArea createElevatorsArea() {
		ElevatorsAreaImpl elevatorsArea = new ElevatorsAreaImpl();
		return elevatorsArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IPNetwork createIPNetwork() {
		IPNetworkImpl ipNetwork = new IPNetworkImpl();
		return ipNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DigitalNetwork createDigitalNetwork() {
		DigitalNetworkImpl digitalNetwork = new DigitalNetworkImpl();
		return digitalNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BusNetwork createBusNetwork() {
		BusNetworkImpl busNetwork = new BusNetworkImpl();
		return busNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IPConnection createIPConnection() {
		IPConnectionImpl ipConnection = new IPConnectionImpl();
		return ipConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BusConnection createBusConnection() {
		BusConnectionImpl busConnection = new BusConnectionImpl();
		return busConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Kitchen createKitchen() {
		KitchenImpl kitchen = new KitchenImpl();
		return kitchen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Stairs createStairs() {
		StairsImpl stairs = new StairsImpl();
		return stairs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CardReader createCardReader() {
		CardReaderImpl cardReader = new CardReaderImpl();
		return cardReader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Employee createEmployee() {
		EmployeeImpl employee = new EmployeeImpl();
		return employee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Visitor createVisitor() {
		VisitorImpl visitor = new VisitorImpl();
		return visitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Computer createComputer() {
		ComputerImpl computer = new ComputerImpl();
		return computer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmbeddedComputer createEmbeddedComputer() {
		EmbeddedComputerImpl embeddedComputer = new EmbeddedComputerImpl();
		return embeddedComputer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MicroController createMicroController() {
		MicroControllerImpl microController = new MicroControllerImpl();
		return microController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WiredConnection createWiredConnection() {
		WiredConnectionImpl wiredConnection = new WiredConnectionImpl();
		return wiredConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ethernet createEthernet() {
		EthernetImpl ethernet = new EthernetImpl();
		return ethernet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Walkway createWalkway() {
		WalkwayImpl walkway = new WalkwayImpl();
		return walkway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KNX createKNX() {
		KNXImpl knx = new KNXImpl();
		return knx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public X10 createX10() {
		X10Impl x10 = new X10Impl();
		return x10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vulnerability createVulnerability() {
		VulnerabilityImpl vulnerability = new VulnerabilityImpl();
		return vulnerability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Office createOffice() {
		OfficeImpl office = new OfficeImpl();
		return office;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SmartTV createSmartTV() {
		SmartTVImpl smartTV = new SmartTVImpl();
		return smartTV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessPoint createAccessPoint() {
		AccessPointImpl accessPoint = new AccessPointImpl();
		return accessPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Malware createMalware() {
		MalwareImpl malware = new MalwareImpl();
		return malware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Printer createPrinter() {
		PrinterImpl printer = new PrinterImpl();
		return printer;
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
	public DigitalStatus createDigitalStatusFromString(EDataType eDataType, String initialValue) {
		DigitalStatus result = DigitalStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDigitalStatusToString(EDataType eDataType, Object instanceValue) {
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
	public Level createLevelFromString(EDataType eDataType, String initialValue) {
		Level result = Level.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mobility createMobilityFromString(EDataType eDataType, String initialValue) {
		Mobility result = Mobility.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMobilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CyberPhysicalSystemPackage getCyberPhysicalSystemPackage() {
		return (CyberPhysicalSystemPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CyberPhysicalSystemPackage getPackage() {
		return CyberPhysicalSystemPackage.eINSTANCE;
	}

} //CyberPhysicalSystemFactoryImpl
