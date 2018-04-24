/**
 */
package environment.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import environment.Asset;
import environment.ComputingDevice;
import environment.Connection;
import environment.PhysicalAsset;
import environment.Status;
import environment.smartbuildingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Computing Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link environment.impl.ComputingDeviceImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link environment.impl.ComputingDeviceImpl#isCanConnect <em>Can Connect</em>}</li>
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
	 * The default value of the '{@link #isCanConnect() <em>Can Connect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanConnect()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAN_CONNECT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCanConnect() <em>Can Connect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanConnect()
	 * @generated
	 * @ordered
	 */
	protected boolean canConnect = CAN_CONNECT_EDEFAULT;

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
		return smartbuildingPackage.Literals.COMPUTING_DEVICE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, smartbuildingPackage.COMPUTING_DEVICE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->

	 */
	public boolean canConnect() {
		return canConnect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanConnect(boolean newCanConnect) {
		boolean oldCanConnect = canConnect;
		canConnect = newCanConnect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, smartbuildingPackage.COMPUTING_DEVICE__CAN_CONNECT, oldCanConnect, canConnect));
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
			eNotify(new ENotificationImpl(this, Notification.SET, smartbuildingPackage.COMPUTING_DEVICE__MODEL, oldModel, model));
	}


	public ComputingDevice abstractAsset() {
		
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
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case smartbuildingPackage.COMPUTING_DEVICE__STATUS:
				return getStatus();
			case smartbuildingPackage.COMPUTING_DEVICE__CAN_CONNECT:
				return isCanConnect();
			case smartbuildingPackage.COMPUTING_DEVICE__MODEL:
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
			case smartbuildingPackage.COMPUTING_DEVICE__STATUS:
				setStatus((Status)newValue);
				return;
			case smartbuildingPackage.COMPUTING_DEVICE__CAN_CONNECT:
				setCanConnect((Boolean)newValue);
				return;
			case smartbuildingPackage.COMPUTING_DEVICE__MODEL:
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
			case smartbuildingPackage.COMPUTING_DEVICE__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case smartbuildingPackage.COMPUTING_DEVICE__CAN_CONNECT:
				setCanConnect(CAN_CONNECT_EDEFAULT);
				return;
			case smartbuildingPackage.COMPUTING_DEVICE__MODEL:
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
			case smartbuildingPackage.COMPUTING_DEVICE__STATUS:
				return status != STATUS_EDEFAULT;
			case smartbuildingPackage.COMPUTING_DEVICE__CAN_CONNECT:
				return canConnect != CAN_CONNECT_EDEFAULT;
			case smartbuildingPackage.COMPUTING_DEVICE__MODEL:
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case smartbuildingPackage.COMPUTING_DEVICE___IS_ABSTRACTABLE:
				return isAbstractable();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(", canConnect: ");
		result.append(canConnect);
		result.append(", model: ");
		result.append(model);
		result.append(')');
		return result.toString();
	}

	@Override
	public boolean isAbstractable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCanConnect() {
		// TODO Auto-generated method stub
		return false;
	}

} //ComputingDeviceImpl
