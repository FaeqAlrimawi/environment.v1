/**
 */
package environment;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import environment.impl.ActorImpl;
import environment.impl.ApplicationImpl;
import environment.impl.BuildingImpl;
import environment.impl.BusConnectionImpl;
import environment.impl.BusNetworkImpl;
import environment.impl.ComputerImpl;
import environment.impl.ComputingDeviceImpl;
import environment.impl.DigitalAssetImpl;
import environment.impl.DigitalConnectionImpl;
import environment.impl.DigitalNetworkImpl;
import environment.impl.EmployeeImpl;
import environment.impl.FileImpl;
import environment.impl.FloorImpl;
import environment.impl.HallwayImpl;
import environment.impl.IPConnectionImpl;
import environment.impl.IPNetworkImpl;
import environment.impl.PhysicalAssetImpl;
import environment.impl.PhysicalConnectionImpl;
import environment.impl.PhysicalStructureImpl;
import environment.impl.ProcessImpl;
import environment.impl.RoomImpl;
import environment.impl.StairsImpl;
import environment.impl.VisitorImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link environment.EnvironmentDiagram#getAsset <em>Asset</em>}</li>
 *   <li>{@link environment.EnvironmentDiagram#getConnection <em>Connection</em>}</li>
 *   <li>{@link environment.EnvironmentDiagram#getPort <em>Port</em>}</li>
 *   <li>{@link environment.EnvironmentDiagram#getProperty <em>Property</em>}</li>
 *   <li>{@link environment.EnvironmentDiagram#getCredential <em>Credential</em>}</li>
 *   <li>{@link environment.EnvironmentDiagram#getAction <em>Action</em>}</li>
 *   <li>{@link environment.EnvironmentDiagram#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see environment.CyberPhysicalSystemPackage#getEnvironmentDiagram()
 * @model
 * @generated
 */
public interface EnvironmentDiagram extends EObject {
	
	
	//Level-0 is an Asset, which is an abstract (i.e. not instantiated)
	
	int LEVEL1 = 1;
	int LEVEL2 = 2;
	int LEVEL3 = 3;
	
	//Level 1. Most abstract. Includes Digital and Physical assets
	Class<?> [] LEVEL1_CLASSES = {PhysicalAssetImpl.class, DigitalAssetImpl.class, 
			DigitalConnectionImpl.class, PhysicalConnectionImpl.class};
	
	//Level 2
	Class<?>[] LEVEL2_CLASSES = 
		{PhysicalStructureImpl.class, ActorImpl.class, ComputingDeviceImpl.class, 
				ApplicationImpl.class, ProcessImpl.class, FileImpl.class, DigitalNetworkImpl.class,
				IPConnectionImpl.class, BusConnectionImpl.class};
	
	//Level 3 classes. Least abstract
	Class<?>[] LEVEL3_CLASSES = 
		{BuildingImpl.class, FloorImpl.class, RoomImpl.class, HallwayImpl.class, 
				StairsImpl.class, EmployeeImpl.class, VisitorImpl.class, BusNetworkImpl.class, 
				IPNetworkImpl.class, ComputerImpl.class}; 
	
	
	List<String> getAssetNames();
	/**
	 * Returns the value of the '<em><b>Asset</b></em>' containment reference list.
	 * The list contents are of type {@link environment.Asset}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset</em>' containment reference list.
	 * @see environment.CyberPhysicalSystemPackage#getEnvironmentDiagram_Asset()
	 * @model containment="true"
	 * @generated
	 */
	EList<Asset> getAsset();
	Asset getAsset(String assetName);
	Connection getConnection(String connectionName);
	/**
	 * Returns the value of the '<em><b>Connection</b></em>' containment reference list.
	 * The list contents are of type {@link environment.Connection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection</em>' containment reference list.
	 * @see environment.CyberPhysicalSystemPackage#getEnvironmentDiagram_Connection()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connection> getConnection();

	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference list.
	 * The list contents are of type {@link environment.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference list.
	 * @see environment.CyberPhysicalSystemPackage#getEnvironmentDiagram_Port()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port> getPort();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link environment.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see environment.CyberPhysicalSystemPackage#getEnvironmentDiagram_Property()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperty();

	/**
	 * Returns the value of the '<em><b>Credential</b></em>' containment reference list.
	 * The list contents are of type {@link environment.Credential}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Credential</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credential</em>' containment reference list.
	 * @see environment.CyberPhysicalSystemPackage#getEnvironmentDiagram_Credential()
	 * @model containment="true"
	 * @generated
	 */
	EList<Credential> getCredential();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link environment.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see environment.CyberPhysicalSystemPackage#getEnvironmentDiagram_Action()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getAction();
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see environment.CyberPhysicalSystemPackage#getEnvironmentDiagram_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();
	/**
	 * Sets the value of the '{@link environment.EnvironmentDiagram#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // EnvironmentDiagram
