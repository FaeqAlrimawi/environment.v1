/**
 */
package environment;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wall</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link environment.Wall#getDoors <em>Doors</em>}</li>
 *   <li>{@link environment.Wall#getWindows <em>Windows</em>}</li>
 *   <li>{@link environment.Wall#getRelatedSpace <em>Related Space</em>}</li>
 * </ul>
 *
 * @see environment.EnvironmentPackage#getWall()
 * @model
 * @generated
 */
public interface Wall extends PhysicalStructure {
	/**
	 * Returns the value of the '<em><b>Doors</b></em>' reference list.
	 * The list contents are of type {@link environment.Door}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Doors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doors</em>' reference list.
	 * @see environment.EnvironmentPackage#getWall_Doors()
	 * @model
	 * @generated
	 */
	EList<Door> getDoors();

	/**
	 * Returns the value of the '<em><b>Windows</b></em>' reference list.
	 * The list contents are of type {@link environment.Window}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Windows</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Windows</em>' reference list.
	 * @see environment.EnvironmentPackage#getWall_Windows()
	 * @model
	 * @generated
	 */
	EList<Window> getWindows();

	/**
	 * Returns the value of the '<em><b>Related Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Space</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Space</em>' reference.
	 * @see #setRelatedSpace(PhysicalStructure)
	 * @see environment.EnvironmentPackage#getWall_RelatedSpace()
	 * @model
	 * @generated
	 */
	PhysicalStructure getRelatedSpace();

	/**
	 * Sets the value of the '{@link environment.Wall#getRelatedSpace <em>Related Space</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Space</em>' reference.
	 * @see #getRelatedSpace()
	 * @generated
	 */
	void setRelatedSpace(PhysicalStructure value);

} // Wall
