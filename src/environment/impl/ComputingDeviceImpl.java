/**
 */
package environment.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import environment.Asset;
import environment.ComputingDevice;
import environment.Status;
import environment.CyberPhysicalSystemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Computing Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link environment.impl.ComputingDeviceImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link environment.impl.ComputingDeviceImpl#isConnectable <em>Connectable</em>}</li>
 *   <li>{@link environment.impl.ComputingDeviceImpl#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComputingDeviceImpl extends PhysicalAssetImpl implements ComputingDevice {
	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Status STATUS_EDEFAULT = Status.ON;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Status status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #isConnectable() <em>Connectable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConnectable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONNECTABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConnectable() <em>Connectable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConnectable()
	 * @generated
	 * @ordered
	 */
	protected boolean connectable = CONNECTABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected String model = MODEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComputingDeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CyberPhysicalSystemPackage.Literals.COMPUTING_DEVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(Status newStatus) {
		Status oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalSystemPackage.COMPUTING_DEVICE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConnectable() {
		return connectable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectable(boolean newConnectable) {
		boolean oldConnectable = connectable;
		connectable = newConnectable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalSystemPackage.COMPUTING_DEVICE__CONNECTABLE, oldConnectable, connectable));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(String newModel) {
		String oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalSystemPackage.COMPUTING_DEVICE__MODEL, oldModel, model));
	}


/*	public ComputingDevice abstractAsset() {
		
		// TODO: implement this method
		//abstracting an asset includes:
		//1-abstracting attributes (name, type, status, etc.)
		//2-contained assets 
		//3-connections
		ComputingDevice abstractedAsset = environment.smartbuildingFactory.eINSTANCE.createComputingDevice();
		
		//get an abstracted asset from parent
		PhysicalAsset aset = (PhysicalAsset)super.abstractAsset();
		
		
		//set attributes
		//set name...can be just left for the super
		abstractedAsset.setName(aset.getName());//give a unique name
		abstractedAsset.setValue(aset.getValue());
		
		//copy abstracted connections
		for(Connection con : aset.getConnections()) {
			abstractedAsset.getConnections().add(con);
		}
		
		//copy abstracted assets
		for(Asset ast : aset.getContainedAssets()) {
			abstractedAsset.getContainedAssets().add(ast);
		}
		
		//a-status
		abstractedAsset.setStatus(this.getStatus());
		//b-canConect
		abstractedAsset.setCanConnect(this.canConnect());
		//c-model is not abstracted at the moment as it can be private info. maybe a field can indicate if it can be included or not when abstracting
		//abstractedAsset.setModel(this.getModel());
		
		
		//2-abstract contained assets (can be done by merging/aggregating assets if possible)
		//shallow abstraction of contained assets might be needed
		//mergeContainedAssets();
	
		//3-abstract connections (can be done by merging/aggregating connections if possible)
		//shallow abstraction of connections might be needed
		//mergeConnections();
			
		return abstractedAsset;
	}*/
	
	/*public Asset abstractType() {
		
		try {
			return ComputingDeviceImpl.class.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
}*/
	
	public Asset abstractAsset() {
		
		ComputingDevice abstractedAsset = (ComputingDevice) super.abstractAsset();
		
		//set connectability
		abstractedAsset.setConnectable(this.isConnectable());
		
		//set model
		abstractedAsset.setModel(this.getModel());
		
		//set status
		abstractedAsset.setStatus(this.getStatus());
		
		return abstractedAsset;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CyberPhysicalSystemPackage.COMPUTING_DEVICE__STATUS:
				return getStatus();
			case CyberPhysicalSystemPackage.COMPUTING_DEVICE__CONNECTABLE:
				return isConnectable();
			case CyberPhysicalSystemPackage.COMPUTING_DEVICE__MODEL:
				return getModel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CyberPhysicalSystemPackage.COMPUTING_DEVICE__STATUS:
				setStatus((Status)newValue);
				return;
			case CyberPhysicalSystemPackage.COMPUTING_DEVICE__CONNECTABLE:
				setConnectable((Boolean)newValue);
				return;
			case CyberPhysicalSystemPackage.COMPUTING_DEVICE__MODEL:
				setModel((String)newValue);
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
			case CyberPhysicalSystemPackage.COMPUTING_DEVICE__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case CyberPhysicalSystemPackage.COMPUTING_DEVICE__CONNECTABLE:
				setConnectable(CONNECTABLE_EDEFAULT);
				return;
			case CyberPhysicalSystemPackage.COMPUTING_DEVICE__MODEL:
				setModel(MODEL_EDEFAULT);
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
			case CyberPhysicalSystemPackage.COMPUTING_DEVICE__STATUS:
				return status != STATUS_EDEFAULT;
			case CyberPhysicalSystemPackage.COMPUTING_DEVICE__CONNECTABLE:
				return connectable != CONNECTABLE_EDEFAULT;
			case CyberPhysicalSystemPackage.COMPUTING_DEVICE__MODEL:
				return MODEL_EDEFAULT == null ? model != null : !MODEL_EDEFAULT.equals(model);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (status: ");
		result.append(status);
		result.append(", connectable: ");
		result.append(connectable);
		result.append(", model: ");
		result.append(model);
		result.append(')');
		return result.toString();
	}


} //ComputingDeviceImpl
