/**
 */
package environment;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Digital Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link environment.DigitalAsset#getParentAsset <em>Parent Asset</em>}</li>
 *   <li>{@link environment.DigitalAsset#getContainedAssets <em>Contained Assets</em>}</li>
 * </ul>
 *
 * @see environment.smartbuildingPackage#getDigitalAsset()
 * @model
 * @generated
 */
public interface DigitalAsset extends Asset {
	/**
	 * Returns the value of the '<em><b>Parent Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Asset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Asset</em>' reference.
	 * @see #setParentAsset(Asset)
	 * @see environment.smartbuildingPackage#getDigitalAsset_ParentAsset()
	 * @model
	 * @generated
	 */
	Asset getParentAsset();

	/**
	 * Sets the value of the '{@link environment.DigitalAsset#getParentAsset <em>Parent Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Asset</em>' reference.
	 * @see #getParentAsset()
	 * @generated
	 */
	void setParentAsset(Asset value);

	/**
	 * Returns the value of the '<em><b>Contained Assets</b></em>' reference list.
	 * The list contents are of type {@link environment.DigitalAsset}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Assets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Assets</em>' reference list.
	 * @see environment.smartbuildingPackage#getDigitalAsset_ContainedAssets()
	 * @model
	 * @generated
	 */
	EList<DigitalAsset> getContainedAssets();

} // DigitalAsset
