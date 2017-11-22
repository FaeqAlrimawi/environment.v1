/**
 */
package environment.impl;

import environment.Asset;
import environment.EnvironmentPackage;
import environment.Tangible;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tangible</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link environment.impl.TangibleImpl#getContainedAssets <em>Contained Assets</em>}</li>
 *   <li>{@link environment.impl.TangibleImpl#getParentAsset <em>Parent Asset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TangibleImpl extends AssetImpl implements Tangible {
	/**
	 * The cached value of the '{@link #getContainedAssets() <em>Contained Assets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<Asset> containedAssets;

	/**
	 * The cached value of the '{@link #getParentAsset() <em>Parent Asset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentAsset()
	 * @generated
	 * @ordered
	 */
	protected Tangible parentAsset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TangibleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnvironmentPackage.Literals.TANGIBLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Asset> getContainedAssets() {
		if (containedAssets == null) {
			containedAssets = new EObjectResolvingEList<Asset>(Asset.class, this, EnvironmentPackage.TANGIBLE__CONTAINED_ASSETS);
		}
		return containedAssets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tangible getParentAsset() {
		if (parentAsset != null && parentAsset.eIsProxy()) {
			InternalEObject oldParentAsset = (InternalEObject)parentAsset;
			parentAsset = (Tangible)eResolveProxy(oldParentAsset);
			if (parentAsset != oldParentAsset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EnvironmentPackage.TANGIBLE__PARENT_ASSET, oldParentAsset, parentAsset));
			}
		}
		return parentAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tangible basicGetParentAsset() {
		return parentAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAsset(Tangible newParentAsset) {
		Tangible oldParentAsset = parentAsset;
		parentAsset = newParentAsset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnvironmentPackage.TANGIBLE__PARENT_ASSET, oldParentAsset, parentAsset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EnvironmentPackage.TANGIBLE__CONTAINED_ASSETS:
				return getContainedAssets();
			case EnvironmentPackage.TANGIBLE__PARENT_ASSET:
				if (resolve) return getParentAsset();
				return basicGetParentAsset();
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
			case EnvironmentPackage.TANGIBLE__CONTAINED_ASSETS:
				getContainedAssets().clear();
				getContainedAssets().addAll((Collection<? extends Asset>)newValue);
				return;
			case EnvironmentPackage.TANGIBLE__PARENT_ASSET:
				setParentAsset((Tangible)newValue);
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
			case EnvironmentPackage.TANGIBLE__CONTAINED_ASSETS:
				getContainedAssets().clear();
				return;
			case EnvironmentPackage.TANGIBLE__PARENT_ASSET:
				setParentAsset((Tangible)null);
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
			case EnvironmentPackage.TANGIBLE__CONTAINED_ASSETS:
				return containedAssets != null && !containedAssets.isEmpty();
			case EnvironmentPackage.TANGIBLE__PARENT_ASSET:
				return parentAsset != null;
		}
		return super.eIsSet(featureID);
	}

} //TangibleImpl
