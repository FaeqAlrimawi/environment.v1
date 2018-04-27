/**
 */
package environment;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Credential</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link environment.Credential#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see environment.smartbuildingPackage#getCredential()
 * @model
 * @generated
 */
public interface Credential extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link environment.CredentialType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see environment.CredentialType
	 * @see #setName(CredentialType)
	 * @see environment.smartbuildingPackage#getCredential_Name()
	 * @model id="true"
	 * @generated
	 */
	CredentialType getName();

	/**
	 * Sets the value of the '{@link environment.Credential#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see environment.CredentialType
	 * @see #getName()
	 * @generated
	 */
	void setName(CredentialType value);

} // Credential
