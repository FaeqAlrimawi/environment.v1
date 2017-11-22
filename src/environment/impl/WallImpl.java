/**
 */
package environment.impl;

import environment.Door;
import environment.EnvironmentPackage;
import environment.PhysicalStructure;
import environment.Wall;
import environment.Window;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wall</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link environment.impl.WallImpl#getDoors <em>Doors</em>}</li>
 *   <li>{@link environment.impl.WallImpl#getWindows <em>Windows</em>}</li>
 *   <li>{@link environment.impl.WallImpl#getRelatedSpace <em>Related Space</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WallImpl extends PhysicalStructureImpl implements Wall {
	/**
	 * The cached value of the '{@link #getDoors() <em>Doors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoors()
	 * @generated
	 * @ordered
	 */
	protected EList<Door> doors;

	/**
	 * The cached value of the '{@link #getWindows() <em>Windows</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindows()
	 * @generated
	 * @ordered
	 */
	protected EList<Window> windows;

	/**
	 * The cached value of the '{@link #getRelatedSpace() <em>Related Space</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedSpace()
	 * @generated
	 * @ordered
	 */
	protected PhysicalStructure relatedSpace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnvironmentPackage.Literals.WALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Door> getDoors() {
		if (doors == null) {
			doors = new EObjectResolvingEList<Door>(Door.class, this, EnvironmentPackage.WALL__DOORS);
		}
		return doors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Window> getWindows() {
		if (windows == null) {
			windows = new EObjectResolvingEList<Window>(Window.class, this, EnvironmentPackage.WALL__WINDOWS);
		}
		return windows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalStructure getRelatedSpace() {
		if (relatedSpace != null && relatedSpace.eIsProxy()) {
			InternalEObject oldRelatedSpace = (InternalEObject)relatedSpace;
			relatedSpace = (PhysicalStructure)eResolveProxy(oldRelatedSpace);
			if (relatedSpace != oldRelatedSpace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EnvironmentPackage.WALL__RELATED_SPACE, oldRelatedSpace, relatedSpace));
			}
		}
		return relatedSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalStructure basicGetRelatedSpace() {
		return relatedSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedSpace(PhysicalStructure newRelatedSpace) {
		PhysicalStructure oldRelatedSpace = relatedSpace;
		relatedSpace = newRelatedSpace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnvironmentPackage.WALL__RELATED_SPACE, oldRelatedSpace, relatedSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EnvironmentPackage.WALL__DOORS:
				return getDoors();
			case EnvironmentPackage.WALL__WINDOWS:
				return getWindows();
			case EnvironmentPackage.WALL__RELATED_SPACE:
				if (resolve) return getRelatedSpace();
				return basicGetRelatedSpace();
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
			case EnvironmentPackage.WALL__DOORS:
				getDoors().clear();
				getDoors().addAll((Collection<? extends Door>)newValue);
				return;
			case EnvironmentPackage.WALL__WINDOWS:
				getWindows().clear();
				getWindows().addAll((Collection<? extends Window>)newValue);
				return;
			case EnvironmentPackage.WALL__RELATED_SPACE:
				setRelatedSpace((PhysicalStructure)newValue);
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
			case EnvironmentPackage.WALL__DOORS:
				getDoors().clear();
				return;
			case EnvironmentPackage.WALL__WINDOWS:
				getWindows().clear();
				return;
			case EnvironmentPackage.WALL__RELATED_SPACE:
				setRelatedSpace((PhysicalStructure)null);
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
			case EnvironmentPackage.WALL__DOORS:
				return doors != null && !doors.isEmpty();
			case EnvironmentPackage.WALL__WINDOWS:
				return windows != null && !windows.isEmpty();
			case EnvironmentPackage.WALL__RELATED_SPACE:
				return relatedSpace != null;
		}
		return super.eIsSet(featureID);
	}

} //WallImpl
