/**
 */
package environment.util;

import environment.AccessPoint;
import environment.Action;
import environment.Actor;
import environment.Application;
import environment.Asset;
import environment.Building;
import environment.BusConnection;
import environment.BusNetwork;
import environment.CCTV;
import environment.CardReader;
import environment.CoffeeMachine;
import environment.Computer;
import environment.ComputingDevice;
import environment.Connection;
import environment.Credential;
import environment.CyberPhysicalSystemPackage;
import environment.Desktop;
import environment.DigitalAsset;
import environment.DigitalConnection;
import environment.DigitalNetwork;
import environment.DishWasher;
import environment.Elevator;
import environment.ElevatorsArea;
import environment.EmbeddedComputer;
import environment.Employee;
import environment.EnvironmentDiagram;
import environment.Ethernet;
import environment.File;
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
import environment.Lounge;
import environment.MicroController;
import environment.Office;
import environment.PhysicalAsset;
import environment.PhysicalConnection;
import environment.PhysicalStructure;
import environment.Port;
import environment.Property;
import environment.Room;
import environment.Server;
import environment.SmartLight;
import environment.SmartTV;
import environment.Stairs;
import environment.Toilet;
import environment.Type;
import environment.Visitor;
import environment.Vulnerability;
import environment.Walkway;
import environment.WiredConnection;
import environment.Workstation;

import environment.X10;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see environment.CyberPhysicalSystemPackage
 * @generated
 */
public class CyberPhysicalSystemSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CyberPhysicalSystemPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CyberPhysicalSystemSwitch() {
		if (modelPackage == null) {
			modelPackage = CyberPhysicalSystemPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CyberPhysicalSystemPackage.PHYSICAL_ASSET: {
				PhysicalAsset physicalAsset = (PhysicalAsset)theEObject;
				T result = casePhysicalAsset(physicalAsset);
				if (result == null) result = caseAsset(physicalAsset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CyberPhysicalSystemPackage.COMPUTING_DEVICE: {
				ComputingDevice computingDevice = (ComputingDevice)theEObject;
				T result = caseComputingDevice(computingDevice);
				if (result == null) result = casePhysicalAsset(computingDevice);
				if (result == null) result = caseAsset(computingDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CyberPhysicalSystemPackage.HVAC: {
				HVAC hvac = (HVAC)theEObject;
				T result = caseHVAC(hvac);
				if (result == null) result = caseComputingDevice(hvac);
				if (result == null) result = casePhysicalAsset(hvac);
				if (result == null) result = caseAsset(hvac);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CyberPhysicalSystemPackage.SMART_LIGHT: {
				SmartLight smartLight = (SmartLight)theEObject;
				T result = caseSmartLight(smartLight);
				if (result == null) result = caseComputingDevice(smartLight);
				if (result == null) result = casePhysicalAsset(smartLight);
				if (result == null) result = caseAsset(smartLight);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CyberPhysicalSystemPackage.LAPTOP: {
				Laptop laptop = (Laptop)theEObject;
				T result = caseLaptop(laptop);
				if (result == null) result = caseComputer(laptop);
				if (result == null) result = caseComputingDevice(laptop);
				if (result == null) result = casePhysicalAsset(laptop);
				if (result == null) result = caseAsset(laptop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CyberPhysicalSystemPackage.DESKTOP: {
				Desktop desktop = (Desktop)theEObject;
				T result = caseDesktop(desktop);
				if (result == null) result = caseComputer(desktop);
				if (result == null) result = caseComputingDevice(desktop);
				if (result == null) result = casePhysicalAsset(desktop);
				if (result == null) result = caseAsset(desktop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CyberPhysicalSystemPackage.CCTV: {
				CCTV cctv = (CCTV)theEObject;
				T result = caseCCTV(cctv);
				if (result == null) result = caseComputingDevice(cctv);
				if (result == null) result = casePhysicalAsset(cctv);
				if (result == null) result = caseAsset(cctv);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CyberPhysicalSystemPackage.SERVER: {
				Server server = (Server)theEObject;
				T result = caseServer(server);
				if (result == null) result = caseComputer(server);
				if (result == null) result = caseComputingDevice(server);
				if (result == null) result = casePhysicalAsset(server);
				if (result == null) result = caseAsset(server);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CyberPhysicalSystemPackage.FILE: {
				File file = (File)theEObject;
				T result = caseFile(file);
				if (result == null) result = caseDigitalAsset(file);
				if (result == null) result = caseAsset(file);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CyberPhysicalSystemPackage.PROCESS: {
				environment.Process process = (environment.Process)theEObject;
				T result = caseProcess(process);
				if (result == null) result = caseDigitalAsset(process);
				if (result == null) result = caseAsset(process);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CyberPhysicalSystemPackage.APPLICATION: {
				Application application = (Application)theEObject;
				T result = caseApplication(application);
				if (result == null) result = caseDigitalAsset(application);
				if (result == null) result = caseAsset(application);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CyberPhysicalSystemPackage.CONNECTION: {
				Connection connection = (Connection)theEObject;
				T result = caseConnection(connection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CyberPhysicalSystemPackage.DIGITAL_CONNECTION: {
				DigitalConnection digitalConnection = (DigitalConnection)theEObject;
				T result = caseDigitalConnection(digitalConnection);
				if (result == null) result = caseConnection(digitalConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CyberPhysicalSystemPackage.PHYSICAL_CONNECTION: {
				PhysicalConnection physicalConnection = (PhysicalConnection)theEObject;
				T result = casePhysicalConnection(physicalConnection);
				if (result == null) result = caseConnection(physicalConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CyberPhysicalSystemPackage.ASSET: {
				Asset asset = (Asset)theEObject;
				T result = caseAsset(asset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CyberPhysicalSystemPackage.ENVIRONMENT_DIAGRAM: {
				EnvironmentDiagram environmentDiagram = (EnvironmentDiagram)theEObject;
				T result = caseEnvironmentDiagram(environmentDiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CyberPhysicalSystemPackage.PORT: {
				Port port = (Port)theEObject;
				T result = casePort(port);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CyberPhysicalSystemPackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CyberPhysicalSystemPackage.CREDENTIAL: {
				Credential credential = (Credential)theEObject;
				T result = caseCredential(credential);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CyberPhysicalSystemPackage.ACTOR: {
				Actor actor = (Actor)theEObject;
				T result = caseActor(actor);
				if (result == null) result = casePhysicalAsset(actor);
				if (result == null) result = caseAsset(actor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CyberPhysicalSystemPackage.PHYSICAL_STRUCTURE: {
				PhysicalStructure physicalStructure = (PhysicalStructure)theEObject;
				T result = casePhysicalStructure(physicalStructure);
				if (result == null) result = casePhysicalAsset(physicalStructure);
				if (result == null) result = caseAsset(physicalStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CyberPhysicalSystemPackage.DIGITAL_ASSET: {
				DigitalAsset digitalAsset = (DigitalAsset)theEObject;
				T result = caseDigitalAsset(digitalAsset);
				if (result == null) result = caseAsset(digitalAsset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CyberPhysicalSystemPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CyberPhysicalSystemPackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CyberPhysicalSystemPackage.ROOM: {
				Room room = (Room)theEObject;
				T result = caseRoom(room);
				if (result == null) result = casePhysicalStructure(room);
				if (result == null) result = casePhysicalAsset(room);
				if (result == null) result = caseAsset(room);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CyberPhysicalSystemPackage.FLOOR: {
				Floor floor = (Floor)theEObject;
				T result = caseFloor(floor);
				if (result == null) result = casePhysicalStructure(floor);
				if (result == null) result = casePhysicalAsset(floor);
				if (result == null) result = caseAsset(floor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CyberPhysicalSystemPackage.BUILDING: {
				Building building = (Building)theEObject;
				T result = caseBuilding(building);
				if (result == null) result = casePhysicalStructure(building);
				if (result == null) result = casePhysicalAsset(building);
				if (result == null) result = caseAsset(building);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CyberPhysicalSystemPackage.FIRE_ALARM: {
				FireAlarm fireAlarm = (FireAlarm)theEObject;
				T result = caseFireAlarm(fireAlarm);
				if (result == null) result = caseComputingDevice(fireAlarm);
				if (result == null) result = casePhysicalAsset(fireAlarm);
				if (result == null) result = caseAsset(fireAlarm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CyberPhysicalSystemPackage.WORKSTATION: {
				Workstation workstation = (Workstation)theEObject;
				T result = caseWorkstation(workstation);
				if (result == null) result = caseComputer(workstation);
				if (result == null) result = caseComputingDevice(workstation);
				if (result == null) result = casePhysicalAsset(workstation);
				if (result == null) result = caseAsset(workstation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CyberPhysicalSystemPackage.LAB: {
				Lab lab = (Lab)theEObject;
				T result = caseLab(lab);
				if (result == null) result = caseRoom(lab);
				if (result == null) result = casePhysicalStructure(lab);
				if (result == null) result = casePhysicalAsset(lab);
				if (result == null) result = caseAsset(lab);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CyberPhysicalSystemPackage.TOILET: {
				Toilet toilet = (Toilet)theEObject;
				T result = caseToilet(toilet);
				if (result == null) result = caseRoom(toilet);
				if (result == null) result = casePhysicalStructure(toilet);
				if (result == null) result = casePhysicalAsset(toilet);
				if (result == null) result = caseAsset(toilet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CyberPhysicalSystemPackage.LOUNGE: {
				Lounge lounge = (Lounge)theEObject;
				T result = caseLounge(lounge);
				if (result == null) result = caseRoom(lounge);
				if (result == null) result = casePhysicalStructure(lounge);
				if (result == null) result = casePhysicalAsset(lounge);
				if (result == null) result = caseAsset(lounge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CyberPhysicalSystemPackage.DISH_WASHER: {
				DishWasher dishWasher = (DishWasher)theEObject;
				T result = caseDishWasher(dishWasher);
				if (result == null) result = caseComputingDevice(dishWasher);
				if (result == null) result = casePhysicalAsset(dishWasher);
				if (result == null) result = caseAsset(dishWasher);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CyberPhysicalSystemPackage.COFFEE_MACHINE: {
				CoffeeMachine coffeeMachine = (CoffeeMachine)theEObject;
				T result = caseCoffeeMachine(coffeeMachine);
				if (result == null) result = caseComputingDevice(coffeeMachine);
				if (result == null) result = casePhysicalAsset(coffeeMachine);
				if (result == null) result = caseAsset(coffeeMachine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CyberPhysicalSystemPackage.ELEVATOR: {
				Elevator elevator = (Elevator)theEObject;
				T result = caseElevator(elevator);
				if (result == null) result = caseComputingDevice(elevator);
				if (result == null) result = casePhysicalAsset(elevator);
				if (result == null) result = caseAsset(elevator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CyberPhysicalSystemPackage.HALLWAY: {
				Hallway hallway = (Hallway)theEObject;
				T result = caseHallway(hallway);
				if (result == null) result = casePhysicalStructure(hallway);
				if (result == null) result = casePhysicalAsset(hallway);
				if (result == null) result = caseAsset(hallway);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CyberPhysicalSystemPackage.ELEVATORS_AREA: {
				ElevatorsArea elevatorsArea = (ElevatorsArea)theEObject;
				T result = caseElevatorsArea(elevatorsArea);
				if (result == null) result = caseRoom(elevatorsArea);
				if (result == null) result = casePhysicalStructure(elevatorsArea);
				if (result == null) result = casePhysicalAsset(elevatorsArea);
				if (result == null) result = caseAsset(elevatorsArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CyberPhysicalSystemPackage.IP_NETWORK: {
				IPNetwork ipNetwork = (IPNetwork)theEObject;
				T result = caseIPNetwork(ipNetwork);
				if (result == null) result = caseDigitalNetwork(ipNetwork);
				if (result == null) result = caseDigitalAsset(ipNetwork);
				if (result == null) result = caseAsset(ipNetwork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CyberPhysicalSystemPackage.DIGITAL_NETWORK: {
				DigitalNetwork digitalNetwork = (DigitalNetwork)theEObject;
				T result = caseDigitalNetwork(digitalNetwork);
				if (result == null) result = caseDigitalAsset(digitalNetwork);
				if (result == null) result = caseAsset(digitalNetwork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CyberPhysicalSystemPackage.BUS_NETWORK: {
				BusNetwork busNetwork = (BusNetwork)theEObject;
				T result = caseBusNetwork(busNetwork);
				if (result == null) result = caseDigitalNetwork(busNetwork);
				if (result == null) result = caseDigitalAsset(busNetwork);
				if (result == null) result = caseAsset(busNetwork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CyberPhysicalSystemPackage.IP_CONNECTION: {
				IPConnection ipConnection = (IPConnection)theEObject;
				T result = caseIPConnection(ipConnection);
				if (result == null) result = caseDigitalConnection(ipConnection);
				if (result == null) result = caseConnection(ipConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CyberPhysicalSystemPackage.BUS_CONNECTION: {
				BusConnection busConnection = (BusConnection)theEObject;
				T result = caseBusConnection(busConnection);
				if (result == null) result = caseDigitalConnection(busConnection);
				if (result == null) result = caseConnection(busConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CyberPhysicalSystemPackage.KITCHEN: {
				Kitchen kitchen = (Kitchen)theEObject;
				T result = caseKitchen(kitchen);
				if (result == null) result = caseRoom(kitchen);
				if (result == null) result = casePhysicalStructure(kitchen);
				if (result == null) result = casePhysicalAsset(kitchen);
				if (result == null) result = caseAsset(kitchen);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CyberPhysicalSystemPackage.STAIRS: {
				Stairs stairs = (Stairs)theEObject;
				T result = caseStairs(stairs);
				if (result == null) result = casePhysicalStructure(stairs);
				if (result == null) result = casePhysicalAsset(stairs);
				if (result == null) result = caseAsset(stairs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CyberPhysicalSystemPackage.CARD_READER: {
				CardReader cardReader = (CardReader)theEObject;
				T result = caseCardReader(cardReader);
				if (result == null) result = caseComputingDevice(cardReader);
				if (result == null) result = casePhysicalAsset(cardReader);
				if (result == null) result = caseAsset(cardReader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CyberPhysicalSystemPackage.EMPLOYEE: {
				Employee employee = (Employee)theEObject;
				T result = caseEmployee(employee);
				if (result == null) result = caseActor(employee);
				if (result == null) result = casePhysicalAsset(employee);
				if (result == null) result = caseAsset(employee);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CyberPhysicalSystemPackage.VISITOR: {
				Visitor visitor = (Visitor)theEObject;
				T result = caseVisitor(visitor);
				if (result == null) result = caseActor(visitor);
				if (result == null) result = casePhysicalAsset(visitor);
				if (result == null) result = caseAsset(visitor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CyberPhysicalSystemPackage.COMPUTER: {
				Computer computer = (Computer)theEObject;
				T result = caseComputer(computer);
				if (result == null) result = caseComputingDevice(computer);
				if (result == null) result = casePhysicalAsset(computer);
				if (result == null) result = caseAsset(computer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CyberPhysicalSystemPackage.EMBEDDED_COMPUTER: {
				EmbeddedComputer embeddedComputer = (EmbeddedComputer)theEObject;
				T result = caseEmbeddedComputer(embeddedComputer);
				if (result == null) result = caseComputer(embeddedComputer);
				if (result == null) result = caseComputingDevice(embeddedComputer);
				if (result == null) result = casePhysicalAsset(embeddedComputer);
				if (result == null) result = caseAsset(embeddedComputer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CyberPhysicalSystemPackage.MICRO_CONTROLLER: {
				MicroController microController = (MicroController)theEObject;
				T result = caseMicroController(microController);
				if (result == null) result = caseEmbeddedComputer(microController);
				if (result == null) result = caseComputer(microController);
				if (result == null) result = caseComputingDevice(microController);
				if (result == null) result = casePhysicalAsset(microController);
				if (result == null) result = caseAsset(microController);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CyberPhysicalSystemPackage.WIRED_CONNECTION: {
				WiredConnection wiredConnection = (WiredConnection)theEObject;
				T result = caseWiredConnection(wiredConnection);
				if (result == null) result = casePhysicalConnection(wiredConnection);
				if (result == null) result = caseConnection(wiredConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CyberPhysicalSystemPackage.ETHERNET: {
				Ethernet ethernet = (Ethernet)theEObject;
				T result = caseEthernet(ethernet);
				if (result == null) result = caseWiredConnection(ethernet);
				if (result == null) result = casePhysicalConnection(ethernet);
				if (result == null) result = caseConnection(ethernet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CyberPhysicalSystemPackage.WALKWAY: {
				Walkway walkway = (Walkway)theEObject;
				T result = caseWalkway(walkway);
				if (result == null) result = casePhysicalConnection(walkway);
				if (result == null) result = caseConnection(walkway);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CyberPhysicalSystemPackage.KNX: {
				KNX knx = (KNX)theEObject;
				T result = caseKNX(knx);
				if (result == null) result = caseBusConnection(knx);
				if (result == null) result = caseDigitalConnection(knx);
				if (result == null) result = caseConnection(knx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CyberPhysicalSystemPackage.X10: {
				X10 x10 = (X10)theEObject;
				T result = caseX10(x10);
				if (result == null) result = caseBusConnection(x10);
				if (result == null) result = caseDigitalConnection(x10);
				if (result == null) result = caseConnection(x10);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CyberPhysicalSystemPackage.VULNERABILITY: {
				Vulnerability vulnerability = (Vulnerability)theEObject;
				T result = caseVulnerability(vulnerability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CyberPhysicalSystemPackage.OFFICE: {
				Office office = (Office)theEObject;
				T result = caseOffice(office);
				if (result == null) result = caseRoom(office);
				if (result == null) result = casePhysicalStructure(office);
				if (result == null) result = casePhysicalAsset(office);
				if (result == null) result = caseAsset(office);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CyberPhysicalSystemPackage.SMART_TV: {
				SmartTV smartTV = (SmartTV)theEObject;
				T result = caseSmartTV(smartTV);
				if (result == null) result = caseComputingDevice(smartTV);
				if (result == null) result = casePhysicalAsset(smartTV);
				if (result == null) result = caseAsset(smartTV);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CyberPhysicalSystemPackage.ACCESS_POINT: {
				AccessPoint accessPoint = (AccessPoint)theEObject;
				T result = caseAccessPoint(accessPoint);
				if (result == null) result = caseComputingDevice(accessPoint);
				if (result == null) result = casePhysicalAsset(accessPoint);
				if (result == null) result = caseAsset(accessPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalAsset(PhysicalAsset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Computing Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Computing Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComputingDevice(ComputingDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HVAC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HVAC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHVAC(HVAC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Smart Light</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Smart Light</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSmartLight(SmartLight object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Laptop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Laptop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLaptop(Laptop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Desktop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Desktop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDesktop(Desktop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CCTV</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CCTV</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCCTV(CCTV object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServer(Server object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFile(File object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcess(environment.Process object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplication(Application object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnection(Connection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Digital Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Digital Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDigitalConnection(DigitalConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalConnection(PhysicalConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsset(Asset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Environment Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Environment Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvironmentDiagram(EnvironmentDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Credential</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Credential</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCredential(Credential object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActor(Actor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalStructure(PhysicalStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Digital Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Digital Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDigitalAsset(DigitalAsset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoom(Room object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Floor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Floor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloor(Floor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Building</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Building</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuilding(Building object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fire Alarm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fire Alarm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFireAlarm(FireAlarm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workstation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workstation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkstation(Workstation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lab</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lab</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLab(Lab object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Toilet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Toilet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToilet(Toilet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lounge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lounge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLounge(Lounge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dish Washer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dish Washer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDishWasher(DishWasher object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coffee Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coffee Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoffeeMachine(CoffeeMachine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elevator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elevator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElevator(Elevator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hallway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hallway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHallway(Hallway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elevators Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elevators Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElevatorsArea(ElevatorsArea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IP Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IP Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIPNetwork(IPNetwork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Digital Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Digital Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDigitalNetwork(DigitalNetwork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bus Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bus Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusNetwork(BusNetwork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IP Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IP Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIPConnection(IPConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bus Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bus Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusConnection(BusConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kitchen</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kitchen</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKitchen(Kitchen object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stairs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stairs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStairs(Stairs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Card Reader</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Card Reader</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCardReader(CardReader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Employee</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Employee</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmployee(Employee object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visitor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visitor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisitor(Visitor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Computer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Computer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComputer(Computer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Embedded Computer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Embedded Computer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmbeddedComputer(EmbeddedComputer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Micro Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Micro Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMicroController(MicroController object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wired Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wired Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWiredConnection(WiredConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ethernet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ethernet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEthernet(Ethernet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Walkway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Walkway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWalkway(Walkway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KNX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KNX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKNX(KNX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>X10</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>X10</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseX10(X10 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vulnerability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vulnerability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVulnerability(Vulnerability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Office</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Office</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOffice(Office object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Smart TV</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Smart TV</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSmartTV(SmartTV object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Access Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Access Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessPoint(AccessPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CyberPhysicalSystemSwitch
