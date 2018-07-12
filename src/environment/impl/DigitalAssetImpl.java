/**
 */
package environment.impl;

import environment.Asset;
import environment.DigitalAsset;
import environment.PhysicalAsset;
import environment.CyberPhysicalSystemPackage;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Digital Asset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link environment.impl.DigitalAssetImpl#getParentAsset <em>Parent Asset</em>}</li>
 *   <li>{@link environment.impl.DigitalAssetImpl#getContainedAssets <em>Contained Assets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DigitalAssetImpl extends AssetImpl implements DigitalAsset {
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
	protected EList<DigitalAsset> containedAssets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	
	 */
	protected DigitalAssetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CyberPhysicalSystemPackage.Literals.DIGITAL_ASSET;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CyberPhysicalSystemPackage.DIGITAL_ASSET__PARENT_ASSET, oldParentAsset, parentAsset));
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
	 */
	public void setParentAsset(Asset newParentAsset) {
		Asset oldParentAsset = parentAsset;
		parentAsset = newParentAsset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalSystemPackage.DIGITAL_ASSET__PARENT_ASSET, oldParentAsset, parentAsset));
		
		//add this object as a child to the parent as well and remove from old parent if any
				if(newParentAsset != null) {
					if(PhysicalAsset.class.isInstance(newParentAsset)) {
						EList<Asset> containedAssets = ((PhysicalAsset)newParentAsset).getContainedAssets();
					
					//add to the new parent
						if(!isContainedInPhysical((Collection<Asset>)containedAssets)) {
							containedAssets.add(this);
							//removeDuplicatesPhysical((Collection<Asset>)containedAssets);
						}
					} else if(DigitalAsset.class.isInstance(newParentAsset)) {
						EList<DigitalAsset> containedAssets = ((DigitalAsset)newParentAsset).getContainedAssets();
					
						//add to the new parent
							if(!isContainedIn((Collection<DigitalAsset>)containedAssets)) {
								containedAssets.add(this);
						}
						
						//removeDuplicates((Collection<DigitalAsset>)containedAssets);			
					}
				}
				//remove from old parent
				if(oldParentAsset != null) {
					if(PhysicalAsset.class.isInstance(oldParentAsset)) {
						((PhysicalAsset)oldParentAsset).getContainedAssets().remove(this);
					
					} else if(DigitalAsset.class.isInstance(oldParentAsset)) {
						((DigitalAsset)oldParentAsset).getContainedAssets().remove(this);
		
					}
			} 
				
	}
	
	private boolean isContainedIn(Collection<DigitalAsset> containedAssets) {
		
		for(Asset ast : containedAssets) {
			if(this.getName().equalsIgnoreCase(ast.getName())) {
				return true;
			}
		}
		
		return false;
	}
	
	private boolean isContainedInPhysical(Collection<Asset> containedAssets) {
		
		for(Asset ast : containedAssets) {
			if(this.getName().equalsIgnoreCase(ast.getName())) {
				return true;
			}
		}
		
		return false;
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DigitalAsset> getContainedAssets() {
		if (containedAssets == null) {
			containedAssets = new EObjectResolvingEList<DigitalAsset>(DigitalAsset.class, this, CyberPhysicalSystemPackage.DIGITAL_ASSET__CONTAINED_ASSETS);
		}
		return containedAssets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CyberPhysicalSystemPackage.DIGITAL_ASSET__PARENT_ASSET:
				if (resolve) return getParentAsset();
				return basicGetParentAsset();
			case CyberPhysicalSystemPackage.DIGITAL_ASSET__CONTAINED_ASSETS:
				removeDuplicates(getContainedAssets());
				return getContainedAssets();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	private void removeDuplicates(Collection<DigitalAsset> assets) {

		Set<DigitalAsset> hs = new HashSet<DigitalAsset>();
		hs.addAll(assets);
		assets.clear();
		assets.addAll(hs);		
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
			case CyberPhysicalSystemPackage.DIGITAL_ASSET__PARENT_ASSET:
				setParentAsset((Asset)newValue);
				return;
			case CyberPhysicalSystemPackage.DIGITAL_ASSET__CONTAINED_ASSETS:
				getContainedAssets().clear();
				getContainedAssets().addAll((Collection<? extends DigitalAsset>)newValue);
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
			case CyberPhysicalSystemPackage.DIGITAL_ASSET__PARENT_ASSET:
				setParentAsset((Asset)null);
				return;
			case CyberPhysicalSystemPackage.DIGITAL_ASSET__CONTAINED_ASSETS:
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
			case CyberPhysicalSystemPackage.DIGITAL_ASSET__PARENT_ASSET:
				return parentAsset != null;
			case CyberPhysicalSystemPackage.DIGITAL_ASSET__CONTAINED_ASSETS:
				return containedAssets != null && !containedAssets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DigitalAssetImpl
