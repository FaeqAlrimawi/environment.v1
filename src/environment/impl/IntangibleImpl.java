/**
 */
package environment.impl;

import environment.Asset;
import environment.EnvironmentPackage;
import environment.Intangible;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intangible</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link environment.impl.IntangibleImpl#getParentAsset <em>Parent Asset</em>}</li>
 *   <li>{@link environment.impl.IntangibleImpl#getContainedAssets <em>Contained Assets</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class IntangibleImpl extends AssetImpl implements Intangible {
	/**
	 * The cached value of the '{@link #getParentAsset() <em>Parent Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentAsset()
	 * @generated
	 * @ordered
	 */
	protected Asset parentAsset;

	/**
	 * The cached value of the '{@link #getContainedAssets() <em>Contained Assets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<Intangible> containedAssets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntangibleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnvironmentPackage.Literals.INTANGIBLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asset getParentAsset() {
		if (parentAsset != null && parentAsset.eIsProxy()) {
			InternalEObject oldParentAsset = (InternalEObject)parentAsset;
			parentAsset = (Asset)eResolveProxy(oldParentAsset);
			if (parentAsset != oldParentAsset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EnvironmentPackage.INTANGIBLE__PARENT_ASSET, oldParentAsset, parentAsset));
			}
		}
		return parentAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asset basicGetParentAsset() {
		return parentAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAsset(Asset newParentAsset) {
		Asset oldParentAsset = parentAsset;
		parentAsset = newParentAsset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnvironmentPackage.INTANGIBLE__PARENT_ASSET, oldParentAsset, parentAsset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Intangible> getContainedAssets() {
		if (containedAssets == null) {
			containedAssets = new EObjectResolvingEList<Intangible>(Intangible.class, this, EnvironmentPackage.INTANGIBLE__CONTAINED_ASSETS);
		}
		return containedAssets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EnvironmentPackage.INTANGIBLE__PARENT_ASSET:
				if (resolve) return getParentAsset();
				return basicGetParentAsset();
			case EnvironmentPackage.INTANGIBLE__CONTAINED_ASSETS:
				return getContainedAssets();
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
			case EnvironmentPackage.INTANGIBLE__PARENT_ASSET:
				setParentAsset((Asset)newValue);
				return;
			case EnvironmentPackage.INTANGIBLE__CONTAINED_ASSETS:
				getContainedAssets().clear();
				getContainedAssets().addAll((Collection<? extends Intangible>)newValue);
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
			case EnvironmentPackage.INTANGIBLE__PARENT_ASSET:
				setParentAsset((Asset)null);
				return;
			case EnvironmentPackage.INTANGIBLE__CONTAINED_ASSETS:
				getContainedAssets().clear();
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
			case EnvironmentPackage.INTANGIBLE__PARENT_ASSET:
				return parentAsset != null;
			case EnvironmentPackage.INTANGIBLE__CONTAINED_ASSETS:
				return containedAssets != null && !containedAssets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IntangibleImpl
