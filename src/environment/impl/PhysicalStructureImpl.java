/**
 */
package environment.impl;

import environment.EnvironmentPackage;
import environment.PhysicalStructure;
import environment.Wall;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link environment.impl.PhysicalStructureImpl#getBoundingWalls <em>Bounding Walls</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhysicalStructureImpl extends TangibleImpl implements PhysicalStructure {
	/**
	 * The cached value of the '{@link #getBoundingWalls() <em>Bounding Walls</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundingWalls()
	 * @generated
	 * @ordered
	 */
	protected EList<Wall> boundingWalls;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnvironmentPackage.Literals.PHYSICAL_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Wall> getBoundingWalls() {
		if (boundingWalls == null) {
			boundingWalls = new EObjectResolvingEList<Wall>(Wall.class, this, EnvironmentPackage.PHYSICAL_STRUCTURE__BOUNDING_WALLS);
		}
		return boundingWalls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EnvironmentPackage.PHYSICAL_STRUCTURE__BOUNDING_WALLS:
				return getBoundingWalls();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EnvironmentPackage.PHYSICAL_STRUCTURE__BOUNDING_WALLS:
				getBoundingWalls().clear();
				getBoundingWalls().addAll((Collection<? extends Wall>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EnvironmentPackage.PHYSICAL_STRUCTURE__BOUNDING_WALLS:
				getBoundingWalls().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EnvironmentPackage.PHYSICAL_STRUCTURE__BOUNDING_WALLS:
				return boundingWalls != null && !boundingWalls.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PhysicalStructureImpl
