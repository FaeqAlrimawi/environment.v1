/**
 */
package environment;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see environment.CyberPhysicalSystemPackage
 * @generated
 */
public interface CyberPhysicalSystemFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CyberPhysicalSystemFactory eINSTANCE = environment.impl.CyberPhysicalSystemFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Physical Asset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Asset</em>'.
	 * @generated
	 */
	PhysicalAsset createPhysicalAsset();

	/**
	 * Returns a new object of class '<em>Computing Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Computing Device</em>'.
	 * @generated
	 */
	ComputingDevice createComputingDevice();

	/**
	 * Returns a new object of class '<em>HVAC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HVAC</em>'.
	 * @generated
	 */
	HVAC createHVAC();

	/**
	 * Returns a new object of class '<em>Smart Light</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Smart Light</em>'.
	 * @generated
	 */
	SmartLight createSmartLight();

	/**
	 * Returns a new object of class '<em>Laptop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Laptop</em>'.
	 * @generated
	 */
	Laptop createLaptop();

	/**
	 * Returns a new object of class '<em>Desktop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Desktop</em>'.
	 * @generated
	 */
	Desktop createDesktop();

	/**
	 * Returns a new object of class '<em>CCTV</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CCTV</em>'.
	 * @generated
	 */
	CCTV createCCTV();

	/**
	 * Returns a new object of class '<em>Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Server</em>'.
	 * @generated
	 */
	Server createServer();

	/**
	 * Returns a new object of class '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File</em>'.
	 * @generated
	 */
	File createFile();

	/**
	 * Returns a new object of class '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process</em>'.
	 * @generated
	 */
	Process createProcess();

	/**
	 * Returns a new object of class '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application</em>'.
	 * @generated
	 */
	Application createApplication();

	/**
	 * Returns a new object of class '<em>Digital Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Digital Connection</em>'.
	 * @generated
	 */
	DigitalConnection createDigitalConnection();

	/**
	 * Returns a new object of class '<em>Physical Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Connection</em>'.
	 * @generated
	 */
	PhysicalConnection createPhysicalConnection();

	/**
	 * Returns a new object of class '<em>Environment Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Environment Diagram</em>'.
	 * @generated
	 */
	EnvironmentDiagram createEnvironmentDiagram();

	/**
	 * Returns a new object of class '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port</em>'.
	 * @generated
	 */
	Port createPort();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	Property createProperty();

	/**
	 * Returns a new object of class '<em>Credential</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Credential</em>'.
	 * @generated
	 */
	Credential createCredential();

	/**
	 * Returns a new object of class '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actor</em>'.
	 * @generated
	 */
	Actor createActor();

	/**
	 * Returns a new object of class '<em>Physical Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Structure</em>'.
	 * @generated
	 */
	PhysicalStructure createPhysicalStructure();

	/**
	 * Returns a new object of class '<em>Digital Asset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Digital Asset</em>'.
	 * @generated
	 */
	DigitalAsset createDigitalAsset();

	/**
	 * Returns a new object of class '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action</em>'.
	 * @generated
	 */
	Action createAction();

	/**
	 * Returns a new object of class '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	Type createType();

	/**
	 * Returns a new object of class '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room</em>'.
	 * @generated
	 */
	Room createRoom();

	/**
	 * Returns a new object of class '<em>Floor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Floor</em>'.
	 * @generated
	 */
	Floor createFloor();

	/**
	 * Returns a new object of class '<em>Building</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Building</em>'.
	 * @generated
	 */
	Building createBuilding();

	/**
	 * Returns a new object of class '<em>Fire Alarm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fire Alarm</em>'.
	 * @generated
	 */
	FireAlarm createFireAlarm();

	/**
	 * Returns a new object of class '<em>Workstation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workstation</em>'.
	 * @generated
	 */
	Workstation createWorkstation();

	/**
	 * Returns a new object of class '<em>Lab</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lab</em>'.
	 * @generated
	 */
	Lab createLab();

	/**
	 * Returns a new object of class '<em>Toilet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Toilet</em>'.
	 * @generated
	 */
	Toilet createToilet();

	/**
	 * Returns a new object of class '<em>Lounge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lounge</em>'.
	 * @generated
	 */
	Lounge createLounge();

	/**
	 * Returns a new object of class '<em>Dish Washer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dish Washer</em>'.
	 * @generated
	 */
	DishWasher createDishWasher();

	/**
	 * Returns a new object of class '<em>Coffee Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coffee Machine</em>'.
	 * @generated
	 */
	CoffeeMachine createCoffeeMachine();

	/**
	 * Returns a new object of class '<em>Elevator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Elevator</em>'.
	 * @generated
	 */
	Elevator createElevator();

	/**
	 * Returns a new object of class '<em>Hallway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hallway</em>'.
	 * @generated
	 */
	Hallway createHallway();

	/**
	 * Returns a new object of class '<em>Elevators Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Elevators Area</em>'.
	 * @generated
	 */
	ElevatorsArea createElevatorsArea();

	/**
	 * Returns a new object of class '<em>IP Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IP Network</em>'.
	 * @generated
	 */
	IPNetwork createIPNetwork();

	/**
	 * Returns a new object of class '<em>Digital Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Digital Network</em>'.
	 * @generated
	 */
	DigitalNetwork createDigitalNetwork();

	/**
	 * Returns a new object of class '<em>Bus Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bus Network</em>'.
	 * @generated
	 */
	BusNetwork createBusNetwork();

	/**
	 * Returns a new object of class '<em>IP Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IP Connection</em>'.
	 * @generated
	 */
	IPConnection createIPConnection();

	/**
	 * Returns a new object of class '<em>Bus Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bus Connection</em>'.
	 * @generated
	 */
	BusConnection createBusConnection();

	/**
	 * Returns a new object of class '<em>Kitchen</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kitchen</em>'.
	 * @generated
	 */
	Kitchen createKitchen();

	/**
	 * Returns a new object of class '<em>Stairs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stairs</em>'.
	 * @generated
	 */
	Stairs createStairs();

	/**
	 * Returns a new object of class '<em>Card Reader</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Card Reader</em>'.
	 * @generated
	 */
	CardReader createCardReader();

	/**
	 * Returns a new object of class '<em>Employee</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Employee</em>'.
	 * @generated
	 */
	Employee createEmployee();

	/**
	 * Returns a new object of class '<em>Visitor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visitor</em>'.
	 * @generated
	 */
	Visitor createVisitor();

	/**
	 * Returns a new object of class '<em>Computer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Computer</em>'.
	 * @generated
	 */
	Computer createComputer();

	/**
	 * Returns a new object of class '<em>Embedded Computer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Embedded Computer</em>'.
	 * @generated
	 */
	EmbeddedComputer createEmbeddedComputer();

	/**
	 * Returns a new object of class '<em>Micro Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Micro Controller</em>'.
	 * @generated
	 */
	MicroController createMicroController();

	/**
	 * Returns a new object of class '<em>Wired Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wired Connection</em>'.
	 * @generated
	 */
	WiredConnection createWiredConnection();

	/**
	 * Returns a new object of class '<em>Ethernet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ethernet</em>'.
	 * @generated
	 */
	Ethernet createEthernet();

	/**
	 * Returns a new object of class '<em>Walkway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Walkway</em>'.
	 * @generated
	 */
	Walkway createWalkway();

	/**
	 * Returns a new object of class '<em>KNX</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>KNX</em>'.
	 * @generated
	 */
	KNX createKNX();

	/**
	 * Returns a new object of class '<em>X10</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>X10</em>'.
	 * @generated
	 */
	X10 createX10();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CyberPhysicalSystemPackage getCyberPhysicalSystemPackage();

} //CyberPhysicalSystemFactory
