/**
 */
package environment.impl;

import environment.Asset;
import environment.Connection;
import environment.DigitalConnection;
import environment.PhysicalConnection;
import environment.Port;
import environment.Property;

import environment.smartbuildingPackage;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link environment.impl.ConnectionImpl#getAsset1 <em>Asset1</em>}</li>
 *   <li>{@link environment.impl.ConnectionImpl#getAsset2 <em>Asset2</em>}</li>
 *   <li>{@link environment.impl.ConnectionImpl#getName <em>Name</em>}</li>
 *   <li>{@link environment.impl.ConnectionImpl#getType <em>Type</em>}</li>
 *   <li>{@link environment.impl.ConnectionImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link environment.impl.ConnectionImpl#isBidirectional <em>Bidirectional</em>}</li>
 *   <li>{@link environment.impl.ConnectionImpl#getPort <em>Port</em>}</li>
 *   <li>{@link environment.impl.ConnectionImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link environment.impl.ConnectionImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ConnectionImpl extends MinimalEObjectImpl.Container implements Connection {
	/**
	 * The cached value of the '{@link #getAsset1() <em>Asset1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsset1()
	 * @generated
	 * @ordered
	 */
	protected Asset asset1;

	/**
	 * The cached value of the '{@link #getAsset2() <em>Asset2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsset2()
	 * @generated
	 * @ordered
	 */
	protected Asset asset2;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<String> constraints;

	/**
	 * The default value of the '{@link #isBidirectional() <em>Bidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBidirectional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BIDIRECTIONAL_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isBidirectional() <em>Bidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBidirectional()
	 * @generated
	 * @ordered
	 */
	protected boolean bidirectional = BIDIRECTIONAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected Port port;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> properties;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return smartbuildingPackage.Literals.CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asset getAsset1() {
		if (asset1 != null && asset1.eIsProxy()) {
			InternalEObject oldAsset1 = (InternalEObject)asset1;
			asset1 = (Asset)eResolveProxy(oldAsset1);
			if (asset1 != oldAsset1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, smartbuildingPackage.CONNECTION__ASSET1, oldAsset1, asset1));
			}
		}
		return asset1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asset basicGetAsset1() {
		return asset1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsset1(Asset newAsset1) {
		Asset oldAsset1 = asset1;
		asset1 = newAsset1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, smartbuildingPackage.CONNECTION__ASSET1, oldAsset1, asset1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asset getAsset2() {
		if (asset2 != null && asset2.eIsProxy()) {
			InternalEObject oldAsset2 = (InternalEObject)asset2;
			asset2 = (Asset)eResolveProxy(oldAsset2);
			if (asset2 != oldAsset2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, smartbuildingPackage.CONNECTION__ASSET2, oldAsset2, asset2));
			}
		}
		return asset2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asset basicGetAsset2() {
		return asset2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsset2(Asset newAsset2) {
		Asset oldAsset2 = asset2;
		asset2 = newAsset2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, smartbuildingPackage.CONNECTION__ASSET2, oldAsset2, asset2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, smartbuildingPackage.CONNECTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, smartbuildingPackage.CONNECTION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getConstraints() {
		if (constraints == null) {
			constraints = new EDataTypeUniqueEList<String>(String.class, this, smartbuildingPackage.CONNECTION__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBidirectional() {
		return bidirectional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBidirectional(boolean newBidirectional) {
		boolean oldBidirectional = bidirectional;
		bidirectional = newBidirectional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, smartbuildingPackage.CONNECTION__BIDIRECTIONAL, oldBidirectional, bidirectional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPort(Port newPort, NotificationChain msgs) {
		Port oldPort = port;
		port = newPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, smartbuildingPackage.CONNECTION__PORT, oldPort, newPort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(Port newPort) {
		if (newPort != port) {
			NotificationChain msgs = null;
			if (port != null)
				msgs = ((InternalEObject)port).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - smartbuildingPackage.CONNECTION__PORT, null, msgs);
			if (newPort != null)
				msgs = ((InternalEObject)newPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - smartbuildingPackage.CONNECTION__PORT, null, msgs);
			msgs = basicSetPort(newPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, smartbuildingPackage.CONNECTION__PORT, newPort, newPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectResolvingEList<Property>(Property.class, this, smartbuildingPackage.CONNECTION__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, smartbuildingPackage.CONNECTION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int isSimilarTo(Connection connection) {
		
		//compares current connection with the parameter one
		//criteria for comparison:
		//1-Type of connection e.g., physical or digital. Are they the sane? or of higher type
		//2-direction. is it the same
		//3-ports used, which include credentials required
		
		int similarity = 0;
		
		//compare connections types
		similarity += compareType(connection);
		
		//compare direction. Default value for direction is true i.e. bidirectional
		if((this.isBidirectional() == false) && (connection.isBidirectional() == false)) {
			similarity += Connection.CONNECTION_DIRECTION;
		}
		
		
		return similarity;
	}

public int compareType(Connection connection) {
		
		int similarityPercentage = 0; //goes from 0 (not similar) to 100 (equal)
		
		//similarity is based on:
		//Type of assets being compared i.e. if both has the same class then they get some value
		//if both has the same super class then they get [5]
		//if type match on more abstract classes then they get no value
		//if none of the above, then return 0 (execution of method stops)
		
		//if they have exactly the same class
		if(this.getClass().equals(connection.getClass())) {
			similarityPercentage += Connection.EXACT_TYPE;
		
		//if one is a super class of another
		} else if (this.getClass().isAssignableFrom(connection.getClass())
				|| connection.getClass().isAssignableFrom(this.getClass())) {
			similarityPercentage += Connection.ASSIGNABLE_TYPE;
		
		//if they have a common super class
		} else if(this.getClass().getSuperclass().equals(connection.getClass().getSuperclass())
				&& (!this.getClass().getSuperclass().equals(ConnectionImpl.class) ||
						!connection.getClass().getSuperclass().equals(ConnectionImpl.class))) {
			similarityPercentage += Connection.EXACT_SUPER_TYPE;
		
		//final check is if both either digital or physical assets
		} else if ((PhysicalConnection.class.isInstance(this) &&
				PhysicalConnection.class.isInstance(connection))
				||
				(DigitalConnection.class.isInstance(this) &&
						DigitalConnection.class.isInstance(connection))) {
			similarityPercentage = Connection.ABSTRACT_TYPE;
		}
		
		return similarityPercentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case smartbuildingPackage.CONNECTION__PORT:
				return basicSetPort(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case smartbuildingPackage.CONNECTION__ASSET1:
				if (resolve) return getAsset1();
				return basicGetAsset1();
			case smartbuildingPackage.CONNECTION__ASSET2:
				if (resolve) return getAsset2();
				return basicGetAsset2();
			case smartbuildingPackage.CONNECTION__NAME:
				return getName();
			case smartbuildingPackage.CONNECTION__TYPE:
				return getType();
			case smartbuildingPackage.CONNECTION__CONSTRAINTS:
				return getConstraints();
			case smartbuildingPackage.CONNECTION__BIDIRECTIONAL:
				return isBidirectional();
			case smartbuildingPackage.CONNECTION__PORT:
				return getPort();
			case smartbuildingPackage.CONNECTION__PROPERTIES:
				return getProperties();
			case smartbuildingPackage.CONNECTION__DESCRIPTION:
				return getDescription();
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
			case smartbuildingPackage.CONNECTION__ASSET1:
				setAsset1((Asset)newValue);
				return;
			case smartbuildingPackage.CONNECTION__ASSET2:
				setAsset2((Asset)newValue);
				return;
			case smartbuildingPackage.CONNECTION__NAME:
				setName((String)newValue);
				return;
			case smartbuildingPackage.CONNECTION__TYPE:
				setType((String)newValue);
				return;
			case smartbuildingPackage.CONNECTION__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends String>)newValue);
				return;
			case smartbuildingPackage.CONNECTION__BIDIRECTIONAL:
				setBidirectional((Boolean)newValue);
				return;
			case smartbuildingPackage.CONNECTION__PORT:
				setPort((Port)newValue);
				return;
			case smartbuildingPackage.CONNECTION__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
				return;
			case smartbuildingPackage.CONNECTION__DESCRIPTION:
				setDescription((String)newValue);
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
			case smartbuildingPackage.CONNECTION__ASSET1:
				setAsset1((Asset)null);
				return;
			case smartbuildingPackage.CONNECTION__ASSET2:
				setAsset2((Asset)null);
				return;
			case smartbuildingPackage.CONNECTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case smartbuildingPackage.CONNECTION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case smartbuildingPackage.CONNECTION__CONSTRAINTS:
				getConstraints().clear();
				return;
			case smartbuildingPackage.CONNECTION__BIDIRECTIONAL:
				setBidirectional(BIDIRECTIONAL_EDEFAULT);
				return;
			case smartbuildingPackage.CONNECTION__PORT:
				setPort((Port)null);
				return;
			case smartbuildingPackage.CONNECTION__PROPERTIES:
				getProperties().clear();
				return;
			case smartbuildingPackage.CONNECTION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case smartbuildingPackage.CONNECTION__ASSET1:
				return asset1 != null;
			case smartbuildingPackage.CONNECTION__ASSET2:
				return asset2 != null;
			case smartbuildingPackage.CONNECTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case smartbuildingPackage.CONNECTION__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case smartbuildingPackage.CONNECTION__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case smartbuildingPackage.CONNECTION__BIDIRECTIONAL:
				return bidirectional != BIDIRECTIONAL_EDEFAULT;
			case smartbuildingPackage.CONNECTION__PORT:
				return port != null;
			case smartbuildingPackage.CONNECTION__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case smartbuildingPackage.CONNECTION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
			case smartbuildingPackage.CONNECTION___IS_SIMILAR_TO__CONNECTION:
				return isSimilarTo((Connection)arguments.get(0));
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
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(", constraints: ");
		result.append(constraints);
		result.append(", bidirectional: ");
		result.append(bidirectional);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ConnectionImpl
