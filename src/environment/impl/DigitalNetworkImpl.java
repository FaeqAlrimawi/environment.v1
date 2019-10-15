/**
 */
package environment.impl;

import environment.DigitalNetwork;
import environment.CyberPhysicalSystemPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Digital Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link environment.impl.DigitalNetworkImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link environment.impl.DigitalNetworkImpl#getEncryption <em>Encryption</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DigitalNetworkImpl extends DigitalAssetImpl implements DigitalNetwork {
	/**
	 * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final String PROTOCOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected String protocol = PROTOCOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getEncryption() <em>Encryption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncryption()
	 * @generated
	 * @ordered
	 */
	protected static final String ENCRYPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEncryption() <em>Encryption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncryption()
	 * @generated
	 * @ordered
	 */
	protected String encryption = ENCRYPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DigitalNetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CyberPhysicalSystemPackage.Literals.DIGITAL_NETWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProtocol(String newProtocol) {
		String oldProtocol = protocol;
		protocol = newProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalSystemPackage.DIGITAL_NETWORK__PROTOCOL, oldProtocol, protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEncryption() {
		return encryption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEncryption(String newEncryption) {
		String oldEncryption = encryption;
		encryption = newEncryption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalSystemPackage.DIGITAL_NETWORK__ENCRYPTION, oldEncryption, encryption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CyberPhysicalSystemPackage.DIGITAL_NETWORK__PROTOCOL:
				return getProtocol();
			case CyberPhysicalSystemPackage.DIGITAL_NETWORK__ENCRYPTION:
				return getEncryption();
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
			case CyberPhysicalSystemPackage.DIGITAL_NETWORK__PROTOCOL:
				setProtocol((String)newValue);
				return;
			case CyberPhysicalSystemPackage.DIGITAL_NETWORK__ENCRYPTION:
				setEncryption((String)newValue);
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
			case CyberPhysicalSystemPackage.DIGITAL_NETWORK__PROTOCOL:
				setProtocol(PROTOCOL_EDEFAULT);
				return;
			case CyberPhysicalSystemPackage.DIGITAL_NETWORK__ENCRYPTION:
				setEncryption(ENCRYPTION_EDEFAULT);
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
			case CyberPhysicalSystemPackage.DIGITAL_NETWORK__PROTOCOL:
				return PROTOCOL_EDEFAULT == null ? protocol != null : !PROTOCOL_EDEFAULT.equals(protocol);
			case CyberPhysicalSystemPackage.DIGITAL_NETWORK__ENCRYPTION:
				return ENCRYPTION_EDEFAULT == null ? encryption != null : !ENCRYPTION_EDEFAULT.equals(encryption);
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Protocol: ");
		result.append(protocol);
		result.append(", encryption: ");
		result.append(encryption);
		result.append(')');
		return result.toString();
	}

} //DigitalNetworkImpl
