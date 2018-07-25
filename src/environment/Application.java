/**
 */
package environment;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link environment.Application#getStatus <em>Status</em>}</li>
 *   <li>{@link environment.Application#getUrl <em>Url</em>}</li>
 * </ul>
 *
 * @see environment.CyberPhysicalSystemPackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends DigitalAsset {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link environment.DigitalStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see environment.DigitalStatus
	 * @see #setStatus(DigitalStatus)
	 * @see environment.CyberPhysicalSystemPackage#getApplication_Status()
	 * @model
	 * @generated
	 */
	DigitalStatus getStatus();

	/**
	 * Sets the value of the '{@link environment.Application#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see environment.DigitalStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(DigitalStatus value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see environment.CyberPhysicalSystemPackage#getApplication_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link environment.Application#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

} // Application
