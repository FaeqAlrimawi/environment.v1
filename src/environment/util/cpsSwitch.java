/**
 */
package environment.util;

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
import environment.ComputingDevice;
import environment.Connection;
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
import environment.Property;
import environment.Room;
import environment.Server;
import environment.SmartLight;
import environment.Stairs;
import environment.Toilet;
import environment.Type;
import environment.Visitor;
import environment.Workstation;
import environment.cpsPackage;

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
 * @see environment.cpsPackage
 * @generated
 */
public class cpsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static cpsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public cpsSwitch() {
		if (modelPackage == null) {
			modelPackage = cpsPackage.eINSTANCE;
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
			case cpsPackage.PHYSICAL_ASSET: {
				PhysicalAsset physicalAsset = (PhysicalAsset)theEObject;
				T result = casePhysicalAsset(physicalAsset);
				if (result == null) result = caseAsset(physicalAsset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cpsPackage.COMPUTING_DEVICE: {
				ComputingDevice computingDevice = (ComputingDevice)theEObject;
				T result = caseComputingDevice(computingDevice);
				if (result == null) result = casePhysicalAsset(computingDevice);
				if (result == null) result = caseAsset(computingDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cpsPackage.HVAC: {
				HVAC hvac = (HVAC)theEObject;
				T result = caseHVAC(hvac);
				if (result == null) result = caseComputingDevice(hvac);
				if (result == null) result = casePhysicalAsset(hvac);
				if (result == null) result = caseAsset(hvac);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cpsPackage.SMART_LIGHT: {
				SmartLight smartLight = (SmartLight)theEObject;
				T result = caseSmartLight(smartLight);
				if (result == null) result = caseComputingDevice(smartLight);
				if (result == null) result = casePhysicalAsset(smartLight);
				if (result == null) result = caseAsset(smartLight);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cpsPackage.LAPTOP: {
				Laptop laptop = (Laptop)theEObject;
				T result = caseLaptop(laptop);
				if (result == null) result = caseComputingDevice(laptop);
				if (result == null) result = casePhysicalAsset(laptop);
				if (result == null) result = caseAsset(laptop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cpsPackage.DESKTOP: {
				Desktop desktop = (Desktop)theEObject;
				T result = caseDesktop(desktop);
				if (result == null) result = caseComputingDevice(desktop);
				if (result == null) result = casePhysicalAsset(desktop);
				if (result == null) result = caseAsset(desktop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cpsPackage.CCTV: {
				CCTV cctv = (CCTV)theEObject;
				T result = caseCCTV(cctv);
				if (result == null) result = caseComputingDevice(cctv);
				if (result == null) result = casePhysicalAsset(cctv);
				if (result == null) result = caseAsset(cctv);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cpsPackage.SERVER: {
				Server server = (Server)theEObject;
				T result = caseServer(server);
				if (result == null) result = caseComputingDevice(server);
				if (result == null) result = casePhysicalAsset(server);
				if (result == null) result = caseAsset(server);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cpsPackage.FILE: {
				File file = (File)theEObject;
				T result = caseFile(file);
				if (result == null) result = caseDigitalAsset(file);
				if (result == null) result = caseAsset(file);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cpsPackage.PROCESS: {
				environment.Process process = (environment.Process)theEObject;
				T result = caseProcess(process);
				if (result == null) result = caseDigitalAsset(process);
				if (result == null) result = caseAsset(process);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cpsPackage.APPLICATION: {
				Application application = (Application)theEObject;
				T result = caseApplication(application);
				if (result == null) result = caseDigitalAsset(application);
				if (result == null) result = caseAsset(application);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cpsPackage.CONNECTION: {
				Connection connection = (Connection)theEObject;
				T result = caseConnection(connection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cpsPackage.DIGITAL_CONNECTION: {
				DigitalConnection digitalConnection = (DigitalConnection)theEObject;
				T result = caseDigitalConnection(digitalConnection);
				if (result == null) result = caseConnection(digitalConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cpsPackage.PHYSICAL_CONNECTION: {
				PhysicalConnection physicalConnection = (PhysicalConnection)theEObject;
				T result = casePhysicalConnection(physicalConnection);
				if (result == null) result = caseConnection(physicalConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cpsPackage.ASSET: {
				Asset asset = (Asset)theEObject;
				T result = caseAsset(asset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cpsPackage.ENVIRONMENT_DIAGRAM: {
				EnvironmentDiagram environmentDiagram = (EnvironmentDiagram)theEObject;
				T result = caseEnvironmentDiagram(environmentDiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cpsPackage.PORT: {
				Port port = (Port)theEObject;
				T result = casePort(port);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cpsPackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cpsPackage.CREDENTIAL: {
				Credential credential = (Credential)theEObject;
				T result = caseCredential(credential);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cpsPackage.ACTOR: {
				Actor actor = (Actor)theEObject;
				T result = caseActor(actor);
				if (result == null) result = casePhysicalAsset(actor);
				if (result == null) result = caseAsset(actor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cpsPackage.PHYSICAL_STRUCTURE: {
				PhysicalStructure physicalStructure = (PhysicalStructure)theEObject;
				T result = casePhysicalStructure(physicalStructure);
				if (result == null) result = casePhysicalAsset(physicalStructure);
				if (result == null) result = caseAsset(physicalStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cpsPackage.DIGITAL_ASSET: {
				DigitalAsset digitalAsset = (DigitalAsset)theEObject;
				T result = caseDigitalAsset(digitalAsset);
				if (result == null) result = caseAsset(digitalAsset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cpsPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cpsPackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cpsPackage.ROOM: {
				Room room = (Room)theEObject;
				T result = caseRoom(room);
				if (result == null) result = casePhysicalStructure(room);
				if (result == null) result = casePhysicalAsset(room);
				if (result == null) result = caseAsset(room);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cpsPackage.FLOOR: {
				Floor floor = (Floor)theEObject;
				T result = caseFloor(floor);
				if (result == null) result = casePhysicalStructure(floor);
				if (result == null) result = casePhysicalAsset(floor);
				if (result == null) result = caseAsset(floor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cpsPackage.BUILDING: {
				Building building = (Building)theEObject;
				T result = caseBuilding(building);
				if (result == null) result = casePhysicalStructure(building);
				if (result == null) result = casePhysicalAsset(building);
				if (result == null) result = caseAsset(building);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cpsPackage.FIRE_ALARM: {
				FireAlarm fireAlarm = (FireAlarm)theEObject;
				T result = caseFireAlarm(fireAlarm);
				if (result == null) result = caseComputingDevice(fireAlarm);
				if (result == null) result = casePhysicalAsset(fireAlarm);
				if (result == null) result = caseAsset(fireAlarm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cpsPackage.WORKSTATION: {
				Workstation workstation = (Workstation)theEObject;
				T result = caseWorkstation(workstation);
				if (result == null) result = caseComputingDevice(workstation);
				if (result == null) result = casePhysicalAsset(workstation);
				if (result == null) result = caseAsset(workstation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cpsPackage.LAB: {
				Lab lab = (Lab)theEObject;
				T result = caseLab(lab);
				if (result == null) result = caseRoom(lab);
				if (result == null) result = casePhysicalStructure(lab);
				if (result == null) result = casePhysicalAsset(lab);
				if (result == null) result = caseAsset(lab);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cpsPackage.TOILET: {
				Toilet toilet = (Toilet)theEObject;
				T result = caseToilet(toilet);
				if (result == null) result = caseRoom(toilet);
				if (result == null) result = casePhysicalStructure(toilet);
				if (result == null) result = casePhysicalAsset(toilet);
				if (result == null) result = caseAsset(toilet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cpsPackage.LOUNGE: {
				Lounge lounge = (Lounge)theEObject;
				T result = caseLounge(lounge);
				if (result == null) result = caseRoom(lounge);
				if (result == null) result = casePhysicalStructure(lounge);
				if (result == null) result = casePhysicalAsset(lounge);
				if (result == null) result = caseAsset(lounge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cpsPackage.DISH_WASHER: {
				DishWasher dishWasher = (DishWasher)theEObject;
				T result = caseDishWasher(dishWasher);
				if (result == null) result = caseComputingDevice(dishWasher);
				if (result == null) result = casePhysicalAsset(dishWasher);
				if (result == null) result = caseAsset(dishWasher);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cpsPackage.COFFEE_MACHINE: {
				CoffeeMachine coffeeMachine = (CoffeeMachine)theEObject;
				T result = caseCoffeeMachine(coffeeMachine);
				if (result == null) result = caseComputingDevice(coffeeMachine);
				if (result == null) result = casePhysicalAsset(coffeeMachine);
				if (result == null) result = caseAsset(coffeeMachine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cpsPackage.ELEVATOR: {
				Elevator elevator = (Elevator)theEObject;
				T result = caseElevator(elevator);
				if (result == null) result = caseComputingDevice(elevator);
				if (result == null) result = casePhysicalAsset(elevator);
				if (result == null) result = caseAsset(elevator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cpsPackage.HALLWAY: {
				Hallway hallway = (Hallway)theEObject;
				T result = caseHallway(hallway);
				if (result == null) result = casePhysicalStructure(hallway);
				if (result == null) result = casePhysicalAsset(hallway);
				if (result == null) result = caseAsset(hallway);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cpsPackage.ELEVATORS_AREA: {
				ElevatorsArea elevatorsArea = (ElevatorsArea)theEObject;
				T result = caseElevatorsArea(elevatorsArea);
				if (result == null) result = caseRoom(elevatorsArea);
				if (result == null) result = casePhysicalStructure(elevatorsArea);
				if (result == null) result = casePhysicalAsset(elevatorsArea);
				if (result == null) result = caseAsset(elevatorsArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cpsPackage.IP_NETWORK: {
				IPNetwork ipNetwork = (IPNetwork)theEObject;
				T result = caseIPNetwork(ipNetwork);
				if (result == null) result = caseDigitalNetwork(ipNetwork);
				if (result == null) result = caseDigitalAsset(ipNetwork);
				if (result == null) result = caseAsset(ipNetwork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cpsPackage.DIGITAL_NETWORK: {
				DigitalNetwork digitalNetwork = (DigitalNetwork)theEObject;
				T result = caseDigitalNetwork(digitalNetwork);
				if (result == null) result = caseDigitalAsset(digitalNetwork);
				if (result == null) result = caseAsset(digitalNetwork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cpsPackage.BUS_NETWORK: {
				BusNetwork busNetwork = (BusNetwork)theEObject;
				T result = caseBusNetwork(busNetwork);
				if (result == null) result = caseDigitalNetwork(busNetwork);
				if (result == null) result = caseDigitalAsset(busNetwork);
				if (result == null) result = caseAsset(busNetwork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cpsPackage.IP_CONNECTION: {
				IPConnection ipConnection = (IPConnection)theEObject;
				T result = caseIPConnection(ipConnection);
				if (result == null) result = caseDigitalConnection(ipConnection);
				if (result == null) result = caseConnection(ipConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cpsPackage.BUS_CONNECTION: {
				BusConnection busConnection = (BusConnection)theEObject;
				T result = caseBusConnection(busConnection);
				if (result == null) result = caseDigitalConnection(busConnection);
				if (result == null) result = caseConnection(busConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cpsPackage.KITCHEN: {
				Kitchen kitchen = (Kitchen)theEObject;
				T result = caseKitchen(kitchen);
				if (result == null) result = caseRoom(kitchen);
				if (result == null) result = casePhysicalStructure(kitchen);
				if (result == null) result = casePhysicalAsset(kitchen);
				if (result == null) result = caseAsset(kitchen);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cpsPackage.STAIRS: {
				Stairs stairs = (Stairs)theEObject;
				T result = caseStairs(stairs);
				if (result == null) result = casePhysicalStructure(stairs);
				if (result == null) result = casePhysicalAsset(stairs);
				if (result == null) result = caseAsset(stairs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cpsPackage.CARD_READER: {
				CardReader cardReader = (CardReader)theEObject;
				T result = caseCardReader(cardReader);
				if (result == null) result = caseComputingDevice(cardReader);
				if (result == null) result = casePhysicalAsset(cardReader);
				if (result == null) result = caseAsset(cardReader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cpsPackage.EMPLOYEE: {
				Employee employee = (Employee)theEObject;
				T result = caseEmployee(employee);
				if (result == null) result = caseActor(employee);
				if (result == null) result = casePhysicalAsset(employee);
				if (result == null) result = caseAsset(employee);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case cpsPackage.VISITOR: {
				Visitor visitor = (Visitor)theEObject;
				T result = caseVisitor(visitor);
				if (result == null) result = caseActor(visitor);
				if (result == null) result = casePhysicalAsset(visitor);
				if (result == null) result = caseAsset(visitor);
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

} //cpsSwitch
