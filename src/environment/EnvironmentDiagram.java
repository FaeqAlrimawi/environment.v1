/**
 */
package environment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

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
 * @see environment.smartbuildingPackage#getEnvironmentDiagram()
 * @model
 * @generated
 */
public interface EnvironmentDiagram extends EObject {
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
	 * @see environment.smartbuildingPackage#getEnvironmentDiagram_Asset()
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
	 * @see environment.smartbuildingPackage#getEnvironmentDiagram_Connection()
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
	 * @see environment.smartbuildingPackage#getEnvironmentDiagram_Port()
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
	 * @see environment.smartbuildingPackage#getEnvironmentDiagram_Property()
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
	 * @see environment.smartbuildingPackage#getEnvironmentDiagram_Credential()
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
	 * @see environment.smartbuildingPackage#getEnvironmentDiagram_Rule()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getRule();

} // EnvironmentDiagram
