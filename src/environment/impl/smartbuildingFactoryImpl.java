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
import environment.smartbuildingFactory;
import environment.smartbuildingPackage;

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
public class smartbuildingFactoryImpl extends EFactoryImpl implements smartbuildingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static smartbuildingFactory init() {
		try {
			smartbuildingFactory thesmartbuildingFactory = (smartbuildingFactory)EPackage.Registry.INSTANCE.getEFactory(smartbuildingPackage.eNS_URI);
			if (thesmartbuildingFactory != null) {
				return thesmartbuildingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new smartbuildingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public smartbuildingFactoryImpl() {
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
			case smartbuildingPackage.PHYSICAL_ASSET: return createPhysicalAsset();
			case smartbuildingPackage.COMPUTING_DEVICE: return createComputingDevice();
			case smartbuildingPackage.HVAC: return createHVAC();
			case smartbuildingPackage.SMART_LIGHT: return createSmartLight();
			case smartbuildingPackage.LAPTOP: return createLaptop();
			case smartbuildingPackage.DESKTOP: return createDesktop();
			case smartbuildingPackage.CCTV: return createCCTV();
			case smartbuildingPackage.SERVER: return createServer();
			case smartbuildingPackage.FILE: return createFile();
			case smartbuildingPackage.PROCESS: return createProcess();
			case smartbuildingPackage.APPLICATION: return createApplication();
			case smartbuildingPackage.DIGITAL_CONNECTION: return createDigitalConnection();
			case smartbuildingPackage.PHYSICAL_CONNECTION: return createPhysicalConnection();
			case smartbuildingPackage.ENVIRONMENT_DIAGRAM: return createEnvironmentDiagram();
			case smartbuildingPackage.PORT: return createPort();
			case smartbuildingPackage.PROPERTY: return createProperty();
			case smartbuildingPackage.CREDENTIAL: return createCredential();
			case smartbuildingPackage.ACTOR: return createActor();
			case smartbuildingPackage.PHYSICAL_STRUCTURE: return createPhysicalStructure();
			case smartbuildingPackage.DIGITAL_ASSET: return createDigitalAsset();
			case smartbuildingPackage.ACTION: return createAction();
			case smartbuildingPackage.TYPE: return createType();
			case smartbuildingPackage.ROOM: return createRoom();
			case smartbuildingPackage.FLOOR: return createFloor();
			case smartbuildingPackage.BUILDING: return createBuilding();
			case smartbuildingPackage.FIRE_ALARM: return createFireAlarm();
			case smartbuildingPackage.WORKSTATION: return createWorkstation();
			case smartbuildingPackage.LAB: return createLab();
			case smartbuildingPackage.TOILET: return createToilet();
			case smartbuildingPackage.LOUNGE: return createLounge();
			case smartbuildingPackage.DISH_WASHER: return createDishWasher();
			case smartbuildingPackage.COFFEE_MACHINE: return createCoffeeMachine();
			case smartbuildingPackage.ELEVATOR: return createElevator();
			case smartbuildingPackage.HALLWAY: return createHallway();
			case smartbuildingPackage.ELEVATORS_AREA: return createElevatorsArea();
			case smartbuildingPackage.IP_NETWORK: return createIPNetwork();
			case smartbuildingPackage.DIGITAL_NETWORK: return createDigitalNetwork();
			case smartbuildingPackage.BUS_NETWORK: return createBusNetwork();
			case smartbuildingPackage.IP_CONNECTION: return createIPConnection();
			case smartbuildingPackage.BUS_CONNECTION: return createBusConnection();
			case smartbuildingPackage.KITCHEN: return createKitchen();
			case smartbuildingPackage.STAIRS: return createStairs();
			case smartbuildingPackage.CARD_READER: return createCardReader();
			case smartbuildingPackage.EMPLOYEE: return createEmployee();
			case smartbuildingPackage.VISITOR: return createVisitor();
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
			case smartbuildingPackage.STATUS:
				return createStatusFromString(eDataType, initialValue);
			case smartbuildingPackage.PROCESS_STATUS:
				return createProcessStatusFromString(eDataType, initialValue);
			case smartbuildingPackage.FILE_STATUS:
				return createFileStatusFromString(eDataType, initialValue);
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
			case smartbuildingPackage.STATUS:
				return convertStatusToString(eDataType, instanceValue);
			case smartbuildingPackage.PROCESS_STATUS:
				return convertProcessStatusToString(eDataType, instanceValue);
			case smartbuildingPackage.FILE_STATUS:
				return convertFileStatusToString(eDataType, instanceValue);
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
	public smartbuildingPackage getsmartbuildingPackage() {
		return (smartbuildingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static smartbuildingPackage getPackage() {
		return smartbuildingPackage.eINSTANCE;
	}

} //smartbuildingFactoryImpl
