/**
 */
package environment;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tangible</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link environment.Tangible#getContainedAssets <em>Contained Assets</em>}</li>
 *   <li>{@link environment.Tangible#getParentAsset <em>Parent Asset</em>}</li>
 * </ul>
 *
 * @see environment.EnvironmentPackage#getTangible()
 * @model
 * @generated
 */
public interface Tangible extends Asset {
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
	 * @see environment.EnvironmentPackage#getTangible_ContainedAssets()
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
	 * @see #setParentAsset(Tangible)
	 * @see environment.EnvironmentPackage#getTangible_ParentAsset()
	 * @model
	 * @generated
	 */
	Tangible getParentAsset();

	/**
	 * Sets the value of the '{@link environment.Tangible#getParentAsset <em>Parent Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Asset</em>' reference.
	 * @see #getParentAsset()
	 * @generated
	 */
	void setParentAsset(Tangible value);

} // Tangible
