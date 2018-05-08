/**
 */
package environment;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link environment.PhysicalAsset#getContainedAssets <em>Contained Assets</em>}</li>
 *   <li>{@link environment.PhysicalAsset#getParentAsset <em>Parent Asset</em>}</li>
 * </ul>
 *
 * @see environment.cpsPackage#getPhysicalAsset()
 * @model
 * @generated
 */
public interface PhysicalAsset extends Asset {
	/**
	 * Returns the value of the '<em><b>Contained Assets</b></em>' reference list.
	 * The list contents are of type {@link environment.Asset}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Assets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Assets</em>' reference list.
	 * @see environment.cpsPackage#getPhysicalAsset_ContainedAssets()
	 * @model
	 * @generated
	 */
	EList<Asset> getContainedAssets();

	/**
	 * Returns the value of the '<em><b>Parent Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Asset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Asset</em>' reference.
	 * @see #setParentAsset(PhysicalAsset)
	 * @see environment.cpsPackage#getPhysicalAsset_ParentAsset()
	 * @model
	 * @generated
	 */
	PhysicalAsset getParentAsset();

	/**
	 * Sets the value of the '{@link environment.PhysicalAsset#getParentAsset <em>Parent Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Asset</em>' reference.
	 * @see #getParentAsset()
	 * @generated
	 */
	void setParentAsset(PhysicalAsset value);

} // PhysicalAsset
