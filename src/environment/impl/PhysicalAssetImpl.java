/**
 */
package environment.impl;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import environment.Asset;
import environment.PhysicalAsset;
import environment.CyberPhysicalSystemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Asset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link environment.impl.PhysicalAssetImpl#getContainedAssets <em>Contained Assets</em>}</li>
 *   <li>{@link environment.impl.PhysicalAssetImpl#getParentAsset <em>Parent Asset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhysicalAssetImpl extends AssetImpl implements PhysicalAsset {
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
	protected PhysicalAsset parentAsset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalAssetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CyberPhysicalSystemPackage.Literals.PHYSICAL_ASSET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Asset> getContainedAssets() {
		if (containedAssets == null) {
			containedAssets = new EObjectResolvingEList<Asset>(Asset.class, this, CyberPhysicalSystemPackage.PHYSICAL_ASSET__CONTAINED_ASSETS);
		}
		return containedAssets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicalAsset getParentAsset() {
		if (parentAsset != null && parentAsset.eIsProxy()) {
			InternalEObject oldParentAsset = (InternalEObject)parentAsset;
			parentAsset = (PhysicalAsset)eResolveProxy(oldParentAsset);
			if (parentAsset != oldParentAsset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CyberPhysicalSystemPackage.PHYSICAL_ASSET__PARENT_ASSET, oldParentAsset, parentAsset));
			}
		}
		return parentAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalAsset basicGetParentAsset() {
		return parentAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setParentAsset(PhysicalAsset newParentAsset) {
		PhysicalAsset oldParentAsset = parentAsset;
		parentAsset = newParentAsset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalSystemPackage.PHYSICAL_ASSET__PARENT_ASSET, oldParentAsset, parentAsset));
		
		//add this object as a child to the parent as well and remove from old parent if any
//		if(parentAsset == null) {
//			return;
//		}
//		
//		EList<Asset> containedAssets = parentAsset.getContainedAssets();
//		EList<Asset> newList = new BasicEList<Asset>();
//		
//		newList.addAll(containedAssets);
//		newList.add(this);
//	
//		parentAsset.getContainedAssets().clear();
//		parentAsset.getContainedAssets().addAll(newList);
//		
//		//add to the new parent
//		if(!isContainedIn(containedAssets)) {	
//			containedAssets.add(this);
//		}
//		
//		//remove from old parent
//		if(oldParentAsset != null) {
//			oldParentAsset.getContainedAssets().remove(this);
//		}
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CyberPhysicalSystemPackage.PHYSICAL_ASSET__CONTAINED_ASSETS:
				return getContainedAssets();
			case CyberPhysicalSystemPackage.PHYSICAL_ASSET__PARENT_ASSET:
				if (resolve) return getParentAsset();
				return basicGetParentAsset();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	private boolean isContainedIn(Collection<Asset> containedAssets) {
		
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CyberPhysicalSystemPackage.PHYSICAL_ASSET__CONTAINED_ASSETS:
				getContainedAssets().clear();
				getContainedAssets().addAll((Collection<? extends Asset>)newValue);
				return;
			case CyberPhysicalSystemPackage.PHYSICAL_ASSET__PARENT_ASSET:
				setParentAsset((PhysicalAsset)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}
	
	private void removeDuplicates(Collection<Asset> assets) {

		Set<Asset> hs = new HashSet<Asset>();
		hs.addAll(assets);
		assets.clear();
		assets.addAll(hs);		
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CyberPhysicalSystemPackage.PHYSICAL_ASSET__CONTAINED_ASSETS:
				getContainedAssets().clear();
				return;
			case CyberPhysicalSystemPackage.PHYSICAL_ASSET__PARENT_ASSET:
				setParentAsset((PhysicalAsset)null);
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
			case CyberPhysicalSystemPackage.PHYSICAL_ASSET__CONTAINED_ASSETS:
				return containedAssets != null && !containedAssets.isEmpty();
			case CyberPhysicalSystemPackage.PHYSICAL_ASSET__PARENT_ASSET:
				return parentAsset != null;
		}
		return super.eIsSet(featureID);
	}

	/*public int isSimilarTo(Asset asset) {
	
		int similarityPercentage = super.isSimilarTo(asset);
		
		if(similarityPercentage == Asset.NO_COMMON_TYPE) {
			return Asset.NO_COMMON_TYPE;
		}
		
		PhysicalAsset physAsset = ((PhysicalAsset)asset);
		
		//check if they both are contained by the same parent
		if(this.getParentAsset() != null && 
				physAsset.getParentAsset() != null) {
			if(this.getParentAsset().equals(physAsset.getParentAsset())) {
				similarityPercentage += Asset.COMMON_PARENT;
		//check if their both parents have the same type
		} else if (this.getParentAsset().compareType(physAsset.getParentAsset()) == Asset.EXACT_TYPE){
			similarityPercentage += Asset.COMMON_PARENT_TYPE;
		}
		}	
	
		return similarityPercentage;
	}*/

/*	@Override
	public int compareContainedAssets(Asset asset) {
		
		EList<Asset> thisAssets = this.getContainedAssets();
		EList<Asset> argAssets;
		
		if(PhysicalAsset.class.isAssignableFrom(asset.getClass())) {
			argAssets = ((PhysicalAsset)asset).getContainedAssets();	
		} else if(DigitalAsset.class.isAssignableFrom(asset.getClass())) {
			argAssets = ((DigitalAsset)asset).getContainedAssets();	
		}
		
		return 0;
	}*/
} //PhysicalAssetImpl
