/**
 */
package environment;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Digital Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link environment.DigitalConnection#getProtocol <em>Protocol</em>}</li>
 * </ul>
 *
 * @see environment.CyberPhysicalSystemPackage#getDigitalConnection()
 * @model
 * @generated
 */
public interface DigitalConnection extends Connection {

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * The literals are from the enumeration {@link environment.Protocol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see environment.Protocol
	 * @see #setProtocol(Protocol)
	 * @see environment.CyberPhysicalSystemPackage#getDigitalConnection_Protocol()
	 * @model
	 * @generated
	 */
	Protocol getProtocol();

	/**
	 * Sets the value of the '{@link environment.DigitalConnection#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see environment.Protocol
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(Protocol value);
} // DigitalConnection
