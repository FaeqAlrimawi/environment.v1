/**
 */
package environment;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import environment.impl.ActorImpl;
import environment.impl.ApplicationImpl;
import environment.impl.BuildingImpl;
import environment.impl.BusNetworkImpl;
import environment.impl.ComputingDeviceImpl;
import environment.impl.DigitalAssetImpl;
import environment.impl.DigitalNetworkImpl;
import environment.impl.EmployeeImpl;
import environment.impl.FileImpl;
import environment.impl.HallwayImpl;
import environment.impl.IPNetworkImpl;
import environment.impl.PhysicalAssetImpl;
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
 *   <li>{@link environment.EnvironmentDiagram#getRule <em>Rule</em>}</li>
 * </ul>
 *
 * @see environment.cpsPackage#getEnvironmentDiagram()
 * @model
 * @generated
 */
public interface EnvironmentDiagram extends EObject {
	
	
	//Level-0 is an Asset, which is an abstract (i.e. not instantiated)
	//Level 1. Most abstract. Includes Digital and Physical assets
	final Class<?>[] LEVEL1_CLASSES = 
		{PhysicalAssetImpl.class, DigitalAssetImpl.class};
	
	//Level 2
	final Class<?>[] LEVEL2_CLASSES = 
		{PhysicalStructureImpl.class, ActorImpl.class, ComputingDeviceImpl.class, 
				ApplicationImpl.class, ProcessImpl.class, FileImpl.class, DigitalNetworkImpl.class};
	
	//Level 3 classes. Least abstract
	final Class<?>[] LEVEL3_CLASSES = 
		{BuildingImpl.class, Floor.class, RoomImpl.class, HallwayImpl.class, 
				StairsImpl.class, EmployeeImpl.class, VisitorImpl.class, BusNetworkImpl.class, 
				IPNetworkImpl.class}; 
	
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
	 * @see environment.cpsPackage#getEnvironmentDiagram_Asset()
	 * @model containment="true"
	 * @generated
	 */
	EList<Asset> getAsset();

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
	 * @see environment.cpsPackage#getEnvironmentDiagram_Connection()
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
	 * @see environment.cpsPackage#getEnvironmentDiagram_Port()
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
	 * @see environment.cpsPackage#getEnvironmentDiagram_Property()
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
	 * @see environment.cpsPackage#getEnvironmentDiagram_Credential()
	 * @model containment="true"
	 * @generated
	 */
	EList<Credential> getCredential();

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' containment reference list.
	 * The list contents are of type {@link environment.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' containment reference list.
	 * @see environment.cpsPackage#getEnvironmentDiagram_Rule()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getRule();

} // EnvironmentDiagram
