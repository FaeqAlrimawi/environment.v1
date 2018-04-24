/**
 */
package environment;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Digital Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link environment.DigitalNetwork#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link environment.DigitalNetwork#getEncryption <em>Encryption</em>}</li>
 * </ul>
 *
 * @see environment.smartbuildingPackage#getDigitalNetwork()
 * @model
 * @generated
 */
public interface DigitalNetwork extends DigitalAsset {
	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see #setProtocol(String)
	 * @see environment.smartbuildingPackage#getDigitalNetwork_Protocol()
	 * @model
	 * @generated
	 */
	String getProtocol();

	/**
	 * Sets the value of the '{@link environment.DigitalNetwork#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(String value);

	/**
	 * Returns the value of the '<em><b>Encryption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encryption</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encryption</em>' attribute.
	 * @see #setEncryption(String)
	 * @see environment.smartbuildingPackage#getDigitalNetwork_Encryption()
	 * @model
	 * @generated
	 */
	String getEncryption();

	/**
	 * Sets the value of the '{@link environment.DigitalNetwork#getEncryption <em>Encryption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encryption</em>' attribute.
	 * @see #getEncryption()
	 * @generated
	 */
	void setEncryption(String value);

} // DigitalNetwork
