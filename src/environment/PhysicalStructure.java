/**
 */
package environment;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link environment.PhysicalStructure#getBoundingWalls <em>Bounding Walls</em>}</li>
 * </ul>
 *
 * @see environment.EnvironmentPackage#getPhysicalStructure()
 * @model
 * @generated
 */
public interface PhysicalStructure extends Tangible {
	/**
	 * Returns the value of the '<em><b>Bounding Walls</b></em>' reference list.
	 * The list contents are of type {@link environment.Wall}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bounding Walls</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bounding Walls</em>' reference list.
	 * @see environment.EnvironmentPackage#getPhysicalStructure_BoundingWalls()
	 * @model
	 * @generated
	 */
	EList<Wall> getBoundingWalls();

} // PhysicalStructure
