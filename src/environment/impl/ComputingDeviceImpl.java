/**
 */
package environment.impl;

import environment.ComputingDevice;
import environment.EnvironmentPackage;
import environment.Status;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
public class ComputingDeviceImpl extends TangibleImpl implements ComputingDevice {
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
		return EnvironmentPackage.Literals.COMPUTING_DEVICE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EnvironmentPackage.COMPUTING_DEVICE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCanConnect() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, EnvironmentPackage.COMPUTING_DEVICE__CAN_CONNECT, oldCanConnect, canConnect));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EnvironmentPackage.COMPUTING_DEVICE__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EnvironmentPackage.COMPUTING_DEVICE__STATUS:
				return getStatus();
			case EnvironmentPackage.COMPUTING_DEVICE__CAN_CONNECT:
				return isCanConnect();
			case EnvironmentPackage.COMPUTING_DEVICE__MODEL:
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
			case EnvironmentPackage.COMPUTING_DEVICE__STATUS:
				setStatus((Status)newValue);
				return;
			case EnvironmentPackage.COMPUTING_DEVICE__CAN_CONNECT:
				setCanConnect((Boolean)newValue);
				return;
			case EnvironmentPackage.COMPUTING_DEVICE__MODEL:
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
			case EnvironmentPackage.COMPUTING_DEVICE__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case EnvironmentPackage.COMPUTING_DEVICE__CAN_CONNECT:
				setCanConnect(CAN_CONNECT_EDEFAULT);
				return;
			case EnvironmentPackage.COMPUTING_DEVICE__MODEL:
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
			case EnvironmentPackage.COMPUTING_DEVICE__STATUS:
				return status != STATUS_EDEFAULT;
			case EnvironmentPackage.COMPUTING_DEVICE__CAN_CONNECT:
				return canConnect != CAN_CONNECT_EDEFAULT;
			case EnvironmentPackage.COMPUTING_DEVICE__MODEL:
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
		result.append(", canConnect: ");
		result.append(canConnect);
		result.append(", model: ");
		result.append(model);
		result.append(')');
		return result.toString();
	}

} //ComputingDeviceImpl
