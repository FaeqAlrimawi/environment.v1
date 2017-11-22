/**
 */
package environment.impl;

import environment.AccessControlDevice;
import environment.Actor;
import environment.Application;
import environment.Building;
import environment.CCTV;
import environment.ComputingDevice;
import environment.Credential;
import environment.Desktop;
import environment.Digital;
import environment.DigitalConnection;
import environment.EnvironmentDiagram;
import environment.EnvironmentFactory;
import environment.EnvironmentPackage;
import environment.File;
import environment.FileStatus;
import environment.Floor;
import environment.HVAC;
import environment.Intellectual;
import environment.Laptop;
import environment.PhysicalConnection;
import environment.PhysicalStructure;
import environment.Port;
import environment.ProcessStatus;
import environment.Property;
import environment.Room;
import environment.Rule;
import environment.Server;
import environment.SmartLight;
import environment.Status;
import environment.Tangible;
import environment.Type;

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
public class EnvironmentFactoryImpl extends EFactoryImpl implements EnvironmentFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnvironmentFactory init() {
		try {
			EnvironmentFactory theEnvironmentFactory = (EnvironmentFactory)EPackage.Registry.INSTANCE.getEFactory(EnvironmentPackage.eNS_URI);
			if (theEnvironmentFactory != null) {
				return theEnvironmentFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EnvironmentFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentFactoryImpl() {
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
			case EnvironmentPackage.TANGIBLE: return createTangible();
			case EnvironmentPackage.COMPUTING_DEVICE: return createComputingDevice();
			case EnvironmentPackage.HVAC: return createHVAC();
			case EnvironmentPackage.SMART_LIGHT: return createSmartLight();
			case EnvironmentPackage.LAPTOP: return createLaptop();
			case EnvironmentPackage.DESKTOP: return createDesktop();
			case EnvironmentPackage.CCTV: return createCCTV();
			case EnvironmentPackage.SERVER: return createServer();
			case EnvironmentPackage.DIGITAL: return createDigital();
			case EnvironmentPackage.FILE: return createFile();
			case EnvironmentPackage.PROCESS: return createProcess();
			case EnvironmentPackage.APPLICATION: return createApplication();
			case EnvironmentPackage.DIGITAL_CONNECTION: return createDigitalConnection();
			case EnvironmentPackage.PHYSICAL_CONNECTION: return createPhysicalConnection();
			case EnvironmentPackage.ENVIRONMENT_DIAGRAM: return createEnvironmentDiagram();
			case EnvironmentPackage.PORT: return createPort();
			case EnvironmentPackage.PROPERTY: return createProperty();
			case EnvironmentPackage.CREDENTIAL: return createCredential();
			case EnvironmentPackage.ACTOR: return createActor();
			case EnvironmentPackage.PHYSICAL_STRUCTURE: return createPhysicalStructure();
			case EnvironmentPackage.INTELLECTUAL: return createIntellectual();
			case EnvironmentPackage.RULE: return createRule();
			case EnvironmentPackage.ACCESS_CONTROL_DEVICE: return createAccessControlDevice();
			case EnvironmentPackage.TYPE: return createType();
			case EnvironmentPackage.ROOM: return createRoom();
			case EnvironmentPackage.FLOOR: return createFloor();
			case EnvironmentPackage.BUILDING: return createBuilding();
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
			case EnvironmentPackage.STATUS:
				return createStatusFromString(eDataType, initialValue);
			case EnvironmentPackage.PROCESS_STATUS:
				return createProcessStatusFromString(eDataType, initialValue);
			case EnvironmentPackage.FILE_STATUS:
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
			case EnvironmentPackage.STATUS:
				return convertStatusToString(eDataType, instanceValue);
			case EnvironmentPackage.PROCESS_STATUS:
				return convertProcessStatusToString(eDataType, instanceValue);
			case EnvironmentPackage.FILE_STATUS:
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
	public Tangible createTangible() {
		TangibleImpl tangible = new TangibleImpl();
		return tangible;
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
	public Digital createDigital() {
		DigitalImpl digital = new DigitalImpl();
		return digital;
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
	public Intellectual createIntellectual() {
		IntellectualImpl intellectual = new IntellectualImpl();
		return intellectual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessControlDevice createAccessControlDevice() {
		AccessControlDeviceImpl accessControlDevice = new AccessControlDeviceImpl();
		return accessControlDevice;
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
	public EnvironmentPackage getEnvironmentPackage() {
		return (EnvironmentPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EnvironmentPackage getPackage() {
		return EnvironmentPackage.eINSTANCE;
	}

} //EnvironmentFactoryImpl
