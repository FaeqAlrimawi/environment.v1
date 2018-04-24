/**
 */
package environment;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Computing Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link environment.ComputingDevice#getStatus <em>Status</em>}</li>
 *   <li>{@link environment.ComputingDevice#isCanConnect <em>Can Connect</em>}</li>
 *   <li>{@link environment.ComputingDevice#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @see environment.smartbuildingPackage#getComputingDevice()
 * @model
 * @generated
 */
public interface ComputingDevice extends PhysicalAsset {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link environment.Status}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see environment.Status
	 * @see #setStatus(Status)
	 * @see environment.smartbuildingPackage#getComputingDevice_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link environment.ComputingDevice#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see environment.Status
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Can Connect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Can Connect</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Connect</em>' attribute.
	 * @see #setCanConnect(boolean)
	 * @see environment.smartbuildingPackage#getComputingDevice_CanConnect()
	 * @model
	 * @generated
	 */
	boolean isCanConnect();

	/**
	 * Returns the value of the '<em><b>Can Connect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Can Connect</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Connect</em>' attribute.
	 * @see #setCanConnect(boolean)
	 * @see environment.smartbuildingPackage#getComputingDevice_CanConnect()
	 * @model

	 */
	boolean canConnect();

	/**
	 * Sets the value of the '{@link environment.ComputingDevice#isCanConnect <em>Can Connect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Connect</em>' attribute.
	 * @see #isCanConnect()
	 * @generated
	 */
	void setCanConnect(boolean value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' attribute.
	 * @see #setModel(String)
	 * @see environment.smartbuildingPackage#getComputingDevice_Model()
	 * @model
	 * @generated
	 */
	String getModel();

	/**
	 * Sets the value of the '{@link environment.ComputingDevice#getModel <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' attribute.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isAbstractable();

} // ComputingDevice
