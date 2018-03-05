/**
 */
package environment;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link environment.Process#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see environment.EnvironmentPackage#getProcess()
 * @model
 * @generated
 */
public interface Process extends DigitalAsset {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link environment.ProcessStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see environment.ProcessStatus
	 * @see #setStatus(ProcessStatus)
	 * @see environment.EnvironmentPackage#getProcess_Status()
	 * @model
	 * @generated
	 */
	ProcessStatus getStatus();

	/**
	 * Sets the value of the '{@link environment.Process#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see environment.ProcessStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ProcessStatus value);

} // Process
