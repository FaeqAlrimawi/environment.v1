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
import environment.Walkway;
import environment.WiredConnection;
import environment.Workstation;

import environment.X10;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see environment.CyberPhysicalSystemPackage
 * @generated
 */
public class CyberPhysicalSystemAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CyberPhysicalSystemPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CyberPhysicalSystemAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CyberPhysicalSystemPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CyberPhysicalSystemSwitch<Adapter> modelSwitch =
		new CyberPhysicalSystemSwitch<Adapter>() {
			@Override
			public Adapter casePhysicalAsset(PhysicalAsset object) {
				return createPhysicalAssetAdapter();
			}
			@Override
			public Adapter caseComputingDevice(ComputingDevice object) {
				return createComputingDeviceAdapter();
			}
			@Override
			public Adapter caseHVAC(HVAC object) {
				return createHVACAdapter();
			}
			@Override
			public Adapter caseSmartLight(SmartLight object) {
				return createSmartLightAdapter();
			}
			@Override
			public Adapter caseLaptop(Laptop object) {
				return createLaptopAdapter();
			}
			@Override
			public Adapter caseDesktop(Desktop object) {
				return createDesktopAdapter();
			}
			@Override
			public Adapter caseCCTV(CCTV object) {
				return createCCTVAdapter();
			}
			@Override
			public Adapter caseServer(Server object) {
				return createServerAdapter();
			}
			@Override
			public Adapter caseFile(File object) {
				return createFileAdapter();
			}
			@Override
			public Adapter caseProcess(environment.Process object) {
				return createProcessAdapter();
			}
			@Override
			public Adapter caseApplication(Application object) {
				return createApplicationAdapter();
			}
			@Override
			public Adapter caseConnection(Connection object) {
				return createConnectionAdapter();
			}
			@Override
			public Adapter caseDigitalConnection(DigitalConnection object) {
				return createDigitalConnectionAdapter();
			}
			@Override
			public Adapter casePhysicalConnection(PhysicalConnection object) {
				return createPhysicalConnectionAdapter();
			}
			@Override
			public Adapter caseAsset(Asset object) {
				return createAssetAdapter();
			}
			@Override
			public Adapter caseEnvironmentDiagram(EnvironmentDiagram object) {
				return createEnvironmentDiagramAdapter();
			}
			@Override
			public Adapter casePort(Port object) {
				return createPortAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseCredential(Credential object) {
				return createCredentialAdapter();
			}
			@Override
			public Adapter caseActor(Actor object) {
				return createActorAdapter();
			}
			@Override
			public Adapter casePhysicalStructure(PhysicalStructure object) {
				return createPhysicalStructureAdapter();
			}
			@Override
			public Adapter caseDigitalAsset(DigitalAsset object) {
				return createDigitalAssetAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter caseRoom(Room object) {
				return createRoomAdapter();
			}
			@Override
			public Adapter caseFloor(Floor object) {
				return createFloorAdapter();
			}
			@Override
			public Adapter caseBuilding(Building object) {
				return createBuildingAdapter();
			}
			@Override
			public Adapter caseFireAlarm(FireAlarm object) {
				return createFireAlarmAdapter();
			}
			@Override
			public Adapter caseWorkstation(Workstation object) {
				return createWorkstationAdapter();
			}
			@Override
			public Adapter caseLab(Lab object) {
				return createLabAdapter();
			}
			@Override
			public Adapter caseToilet(Toilet object) {
				return createToiletAdapter();
			}
			@Override
			public Adapter caseLounge(Lounge object) {
				return createLoungeAdapter();
			}
			@Override
			public Adapter caseDishWasher(DishWasher object) {
				return createDishWasherAdapter();
			}
			@Override
			public Adapter caseCoffeeMachine(CoffeeMachine object) {
				return createCoffeeMachineAdapter();
			}
			@Override
			public Adapter caseElevator(Elevator object) {
				return createElevatorAdapter();
			}
			@Override
			public Adapter caseHallway(Hallway object) {
				return createHallwayAdapter();
			}
			@Override
			public Adapter caseElevatorsArea(ElevatorsArea object) {
				return createElevatorsAreaAdapter();
			}
			@Override
			public Adapter caseIPNetwork(IPNetwork object) {
				return createIPNetworkAdapter();
			}
			@Override
			public Adapter caseDigitalNetwork(DigitalNetwork object) {
				return createDigitalNetworkAdapter();
			}
			@Override
			public Adapter caseBusNetwork(BusNetwork object) {
				return createBusNetworkAdapter();
			}
			@Override
			public Adapter caseIPConnection(IPConnection object) {
				return createIPConnectionAdapter();
			}
			@Override
			public Adapter caseBusConnection(BusConnection object) {
				return createBusConnectionAdapter();
			}
			@Override
			public Adapter caseKitchen(Kitchen object) {
				return createKitchenAdapter();
			}
			@Override
			public Adapter caseStairs(Stairs object) {
				return createStairsAdapter();
			}
			@Override
			public Adapter caseCardReader(CardReader object) {
				return createCardReaderAdapter();
			}
			@Override
			public Adapter caseEmployee(Employee object) {
				return createEmployeeAdapter();
			}
			@Override
			public Adapter caseVisitor(Visitor object) {
				return createVisitorAdapter();
			}
			@Override
			public Adapter caseComputer(Computer object) {
				return createComputerAdapter();
			}
			@Override
			public Adapter caseEmbeddedComputer(EmbeddedComputer object) {
				return createEmbeddedComputerAdapter();
			}
			@Override
			public Adapter caseMicroController(MicroController object) {
				return createMicroControllerAdapter();
			}
			@Override
			public Adapter caseWiredConnection(WiredConnection object) {
				return createWiredConnectionAdapter();
			}
			@Override
			public Adapter caseEthernet(Ethernet object) {
				return createEthernetAdapter();
			}
			@Override
			public Adapter caseWalkway(Walkway object) {
				return createWalkwayAdapter();
			}
			@Override
			public Adapter caseKNX(KNX object) {
				return createKNXAdapter();
			}
			@Override
			public Adapter caseX10(X10 object) {
				return createX10Adapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link environment.PhysicalAsset <em>Physical Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see environment.PhysicalAsset
	 * @generated
	 */
	public Adapter createPhysicalAssetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link environment.ComputingDevice <em>Computing Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see environment.ComputingDevice
	 * @generated
	 */
	public Adapter createComputingDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link environment.HVAC <em>HVAC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see environment.HVAC
	 * @generated
	 */
	public Adapter createHVACAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link environment.SmartLight <em>Smart Light</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see environment.SmartLight
	 * @generated
	 */
	public Adapter createSmartLightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link environment.Laptop <em>Laptop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see environment.Laptop
	 * @generated
	 */
	public Adapter createLaptopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link environment.Desktop <em>Desktop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see environment.Desktop
	 * @generated
	 */
	public Adapter createDesktopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link environment.CCTV <em>CCTV</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see environment.CCTV
	 * @generated
	 */
	public Adapter createCCTVAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link environment.Server <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see environment.Server
	 * @generated
	 */
	public Adapter createServerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link environment.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see environment.File
	 * @generated
	 */
	public Adapter createFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link environment.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see environment.Process
	 * @generated
	 */
	public Adapter createProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link environment.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see environment.Application
	 * @generated
	 */
	public Adapter createApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link environment.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see environment.Connection
	 * @generated
	 */
	public Adapter createConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link environment.DigitalConnection <em>Digital Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see environment.DigitalConnection
	 * @generated
	 */
	public Adapter createDigitalConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link environment.PhysicalConnection <em>Physical Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see environment.PhysicalConnection
	 * @generated
	 */
	public Adapter createPhysicalConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link environment.Asset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see environment.Asset
	 * @generated
	 */
	public Adapter createAssetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link environment.EnvironmentDiagram <em>Environment Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see environment.EnvironmentDiagram
	 * @generated
	 */
	public Adapter createEnvironmentDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link environment.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see environment.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link environment.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see environment.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link environment.Credential <em>Credential</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see environment.Credential
	 * @generated
	 */
	public Adapter createCredentialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link environment.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see environment.Actor
	 * @generated
	 */
	public Adapter createActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link environment.PhysicalStructure <em>Physical Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see environment.PhysicalStructure
	 * @generated
	 */
	public Adapter createPhysicalStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link environment.DigitalAsset <em>Digital Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see environment.DigitalAsset
	 * @generated
	 */
	public Adapter createDigitalAssetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link environment.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see environment.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link environment.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see environment.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link environment.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see environment.Room
	 * @generated
	 */
	public Adapter createRoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link environment.Floor <em>Floor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see environment.Floor
	 * @generated
	 */
	public Adapter createFloorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link environment.Building <em>Building</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see environment.Building
	 * @generated
	 */
	public Adapter createBuildingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link environment.FireAlarm <em>Fire Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see environment.FireAlarm
	 * @generated
	 */
	public Adapter createFireAlarmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link environment.Workstation <em>Workstation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see environment.Workstation
	 * @generated
	 */
	public Adapter createWorkstationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link environment.Lab <em>Lab</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see environment.Lab
	 * @generated
	 */
	public Adapter createLabAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link environment.Toilet <em>Toilet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see environment.Toilet
	 * @generated
	 */
	public Adapter createToiletAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link environment.Lounge <em>Lounge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see environment.Lounge
	 * @generated
	 */
	public Adapter createLoungeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link environment.DishWasher <em>Dish Washer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see environment.DishWasher
	 * @generated
	 */
	public Adapter createDishWasherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link environment.CoffeeMachine <em>Coffee Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see environment.CoffeeMachine
	 * @generated
	 */
	public Adapter createCoffeeMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link environment.Elevator <em>Elevator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see environment.Elevator
	 * @generated
	 */
	public Adapter createElevatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link environment.Hallway <em>Hallway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see environment.Hallway
	 * @generated
	 */
	public Adapter createHallwayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link environment.ElevatorsArea <em>Elevators Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see environment.ElevatorsArea
	 * @generated
	 */
	public Adapter createElevatorsAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link environment.IPNetwork <em>IP Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see environment.IPNetwork
	 * @generated
	 */
	public Adapter createIPNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link environment.DigitalNetwork <em>Digital Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see environment.DigitalNetwork
	 * @generated
	 */
	public Adapter createDigitalNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link environment.BusNetwork <em>Bus Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see environment.BusNetwork
	 * @generated
	 */
	public Adapter createBusNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link environment.IPConnection <em>IP Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see environment.IPConnection
	 * @generated
	 */
	public Adapter createIPConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link environment.BusConnection <em>Bus Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see environment.BusConnection
	 * @generated
	 */
	public Adapter createBusConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link environment.Kitchen <em>Kitchen</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see environment.Kitchen
	 * @generated
	 */
	public Adapter createKitchenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link environment.Stairs <em>Stairs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see environment.Stairs
	 * @generated
	 */
	public Adapter createStairsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link environment.CardReader <em>Card Reader</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see environment.CardReader
	 * @generated
	 */
	public Adapter createCardReaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link environment.Employee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see environment.Employee
	 * @generated
	 */
	public Adapter createEmployeeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link environment.Visitor <em>Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see environment.Visitor
	 * @generated
	 */
	public Adapter createVisitorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link environment.Computer <em>Computer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see environment.Computer
	 * @generated
	 */
	public Adapter createComputerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link environment.EmbeddedComputer <em>Embedded Computer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see environment.EmbeddedComputer
	 * @generated
	 */
	public Adapter createEmbeddedComputerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link environment.MicroController <em>Micro Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see environment.MicroController
	 * @generated
	 */
	public Adapter createMicroControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link environment.WiredConnection <em>Wired Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see environment.WiredConnection
	 * @generated
	 */
	public Adapter createWiredConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link environment.Ethernet <em>Ethernet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see environment.Ethernet
	 * @generated
	 */
	public Adapter createEthernetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link environment.Walkway <em>Walkway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see environment.Walkway
	 * @generated
	 */
	public Adapter createWalkwayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link environment.KNX <em>KNX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see environment.KNX
	 * @generated
	 */
	public Adapter createKNXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link environment.X10 <em>X10</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see environment.X10
	 * @generated
	 */
	public Adapter createX10Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CyberPhysicalSystemAdapterFactory
