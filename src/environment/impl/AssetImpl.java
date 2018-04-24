/**
 */
package environment.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import environment.Asset;
import environment.Connection;
import environment.DigitalAsset;
import environment.PhysicalAsset;
import environment.Property;
import environment.Type;
import environment.smartbuildingFactory;
import environment.smartbuildingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link environment.impl.AssetImpl#getConnections <em>Connections</em>}</li>
 *   <li>{@link environment.impl.AssetImpl#getName <em>Name</em>}</li>
 *   <li>{@link environment.impl.AssetImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link environment.impl.AssetImpl#getValue <em>Value</em>}</li>
 *   <li>{@link environment.impl.AssetImpl#getType <em>Type</em>}</li>
 *   <li>{@link environment.impl.AssetImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link environment.impl.AssetImpl#getControl <em>Control</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AssetImpl extends MinimalEObjectImpl.Container implements Asset {
	/**
	 * The cached value of the '{@link #getConnections() <em>Connections</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> connections;

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
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> property;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected int value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

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
	 * The default value of the '{@link #getControl() <em>Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControl()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTROL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getControl() <em>Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControl()
	 * @generated
	 * @ordered
	 */
	protected String control = CONTROL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return smartbuildingPackage.Literals.ASSET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getConnections() {
		if (connections == null) {
			connections = new EObjectResolvingEList<Connection>(Connection.class, this, smartbuildingPackage.ASSET__CONNECTIONS);
		}
		return connections;
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
			eNotify(new ENotificationImpl(this, Notification.SET, smartbuildingPackage.ASSET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<Property>(Property.class, this, smartbuildingPackage.ASSET__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(int newValue) {
		int oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, smartbuildingPackage.ASSET__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Type newType, NotificationChain msgs) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, smartbuildingPackage.ASSET__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - smartbuildingPackage.ASSET__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - smartbuildingPackage.ASSET__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, smartbuildingPackage.ASSET__TYPE, newType, newType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, smartbuildingPackage.ASSET__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getControl() {
		return control;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControl(String newControl) {
		String oldControl = control;
		control = newControl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, smartbuildingPackage.ASSET__CONTROL, oldControl, control));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Asset abstractAsset() {
		// TODO: implement this method
		//abstracting an asset includes:
		//1-abstracting attributes (name, type, etc.)
		//2-contained assets 
		//3-connections
		
		//1-abstract attributes
		smartbuildingFactory instance = environment.smartbuildingFactory.eINSTANCE;
		Asset abstractedAsset;
		
		if(PhysicalAsset.class.isAssignableFrom(this.getClass())) {
			abstractedAsset = instance.createPhysicalAsset();
		} else {
			abstractedAsset = instance.createDigitalAsset();
		}
		
		// 1-set attributes
		// a-change name
		abstractedAsset.setName("temp");// give a unique name

		// b-set value...value represents how important the asset in the system.
		// the higher the more value it has
		abstractedAsset.setValue(this.getValue());
		
		// c-type
		Type type = instance.createType();
		type.setName(this.getType().getName());
		abstractedAsset.setType(type);

		//2-properties are added to the new abstracted asset only if they are abstractable i.e. isAbstractable is set to true
		Property tmp;
		for (Property pro : this.getProperty()) {
			if(pro.isAbstractable()) {
				tmp = instance.createProperty();
				tmp.setName(pro.getName());
				tmp.setValue(pro.getValue());
				abstractedAsset.getProperty().add(tmp);
			}
		}
		
		// 3-abstract contained assets (can be done by merging/aggregating
		// assets if possible)
		// shallow abstraction of contained assets might be needed
		mergeContainedAssets();

		// 4-abstract connections (can be done by merging/aggregating
		// connections if possible)
		// shallow abstraction of connections might be needed
		mergeConnections();
		
		return abstractedAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Compares two Assets based on some criteria.
	 * Criteria: 1- type, 2- 
	 * <!-- end-user-doc -->
	 */
	public int isSimilarTo(Asset asset) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		int similarityPercentage = compareType(asset);
		
		
		//if non of the above type matching fits then they are not simialr at all
		if(similarityPercentage == Asset.NO_COMMON_TYPE) {
			return Asset.NO_COMMON_TYPE;
		}
			
		//compare type as attribute if specified
		if(this.getType().getName() != null && this.getType().getName().isEmpty() &&
				asset.getType().getName() != null && !asset.getType().getName().isEmpty() &&
				this.getType().getName().equalsIgnoreCase(asset.getType().getName()) ) {
			similarityPercentage = 10;
		}
		
		/*//next, check number and type of contained assets
		EList<?> thisAssets;
		EList<?> argAssets;
	
		if (PhysicalAsset.class.isInstance(this)) {
			thisAssets = ((PhysicalAsset)this).getContainedAssets();
			argAssets = ((PhysicalAsset)asset).getContainedAssets();
		} else {
			thisAssets =((DigitalAsset)this).getContainedAssets();
			argAssets = ((DigitalAsset)asset).getContainedAssets();
		} moved to their respecitve classes (digital and physical)*/
		
		
		return similarityPercentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	
	public int compareType(Asset asset) {
		
		int similarityPercentage = 0; //goes from 0 (not similar) to 100 (equal)
		
		//similarity is based on:
		//Type of assets being compared i.e. if both has the same class then they get some value
		//if both has the same super class then they get [5]
		//if type match on more abstract classes then they get no value
		//if none of the above, then return 0 (execution of method stops)
		
		//if they have exactly the same class
		if(this.getClass().equals(asset.getClass())) {
			similarityPercentage += Asset.SHARE_EXACT_TYPE;
		////if one is a super class of another
		} else if (this.getClass().isAssignableFrom(asset.getClass())
				|| asset.getClass().isAssignableFrom(this.getClass())) {
			similarityPercentage += Asset.SHARE_ASSIGNABLE_TYPE;
		//if they have a common super class
		} else if(this.getClass().getSuperclass().equals(asset.getClass().getSuperclass())) {
			similarityPercentage += Asset.SHARE_EXACT_SUPER_TYPE;
		//final check is if both either digital or physical assets
		} else if ((PhysicalAsset.class.isInstance(this) &&
				PhysicalAsset.class.isInstance(asset))
				||
				(DigitalAsset.class.isInstance(this) &&
				DigitalAsset.class.isInstance(asset))) {
			similarityPercentage = Asset.SHARE_ABSTRACT_TYPE;
		}
		
		return similarityPercentage;
	}
	
	
	public void mergeConnections() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		
		if(canMergeConnections()) {
			//merge connections
			//define criteria to do the merging
			//criteria include: 
			//
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean canMergeConnections() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		//defines conditions upon which merging of connections can take place


		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean canMergeContainedAssets() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT

		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * This method merges assets that are similar to each other if found
	 * Similarity is defined by the method {@link #isSimilarTo(Asset)}
	 * <!-- end-user-doc -->
	 */
	public void mergeContainedAssets() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		
		if(!canMergeContainedAssets()) {
			return;
		}
		
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void mergeConnections(EList<Connection> connections) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->

	 */
	public boolean canMergeConnections(EList<Connection> connections) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT


		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case smartbuildingPackage.ASSET__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case smartbuildingPackage.ASSET__TYPE:
				return basicSetType(null, msgs);
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
			case smartbuildingPackage.ASSET__CONNECTIONS:
				return getConnections();
			case smartbuildingPackage.ASSET__NAME:
				return getName();
			case smartbuildingPackage.ASSET__PROPERTY:
				return getProperty();
			case smartbuildingPackage.ASSET__VALUE:
				return getValue();
			case smartbuildingPackage.ASSET__TYPE:
				return getType();
			case smartbuildingPackage.ASSET__DESCRIPTION:
				return getDescription();
			case smartbuildingPackage.ASSET__CONTROL:
				return getControl();
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
			case smartbuildingPackage.ASSET__CONNECTIONS:
				getConnections().clear();
				getConnections().addAll((Collection<? extends Connection>)newValue);
				return;
			case smartbuildingPackage.ASSET__NAME:
				setName((String)newValue);
				return;
			case smartbuildingPackage.ASSET__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case smartbuildingPackage.ASSET__VALUE:
				setValue((Integer)newValue);
				return;
			case smartbuildingPackage.ASSET__TYPE:
				setType((Type)newValue);
				return;
			case smartbuildingPackage.ASSET__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case smartbuildingPackage.ASSET__CONTROL:
				setControl((String)newValue);
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
			case smartbuildingPackage.ASSET__CONNECTIONS:
				getConnections().clear();
				return;
			case smartbuildingPackage.ASSET__NAME:
				setName(NAME_EDEFAULT);
				return;
			case smartbuildingPackage.ASSET__PROPERTY:
				getProperty().clear();
				return;
			case smartbuildingPackage.ASSET__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case smartbuildingPackage.ASSET__TYPE:
				setType((Type)null);
				return;
			case smartbuildingPackage.ASSET__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case smartbuildingPackage.ASSET__CONTROL:
				setControl(CONTROL_EDEFAULT);
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
			case smartbuildingPackage.ASSET__CONNECTIONS:
				return connections != null && !connections.isEmpty();
			case smartbuildingPackage.ASSET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case smartbuildingPackage.ASSET__PROPERTY:
				return property != null && !property.isEmpty();
			case smartbuildingPackage.ASSET__VALUE:
				return value != VALUE_EDEFAULT;
			case smartbuildingPackage.ASSET__TYPE:
				return type != null;
			case smartbuildingPackage.ASSET__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case smartbuildingPackage.ASSET__CONTROL:
				return CONTROL_EDEFAULT == null ? control != null : !CONTROL_EDEFAULT.equals(control);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case smartbuildingPackage.ASSET___ABSTRACT_ASSET:
				return abstractAsset();
			case smartbuildingPackage.ASSET___IS_SIMILAR_TO__ASSET:
				return isSimilarTo((Asset)arguments.get(0));
			case smartbuildingPackage.ASSET___MERGE_CONNECTIONS:
				mergeConnections();
				return null;
			case smartbuildingPackage.ASSET___CAN_MERGE_CONNECTIONS:
				return canMergeConnections();
			case smartbuildingPackage.ASSET___CAN_MERGE_CONTAINED_ASSETS:
				return canMergeContainedAssets();
			case smartbuildingPackage.ASSET___MERGE_CONTAINED_ASSETS:
				mergeContainedAssets();
				return null;
			case smartbuildingPackage.ASSET___MERGE_CONNECTIONS__ELIST:
				mergeConnections((EList<Connection>)arguments.get(0));
				return null;
			case smartbuildingPackage.ASSET___CAN_MERGE_CONNECTIONS__ELIST:
				return canMergeConnections((EList<Connection>)arguments.get(0));
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
		result.append(", value: ");
		result.append(value);
		result.append(", description: ");
		result.append(description);
		result.append(", control: ");
		result.append(control);
		result.append(')');
		return result.toString();
	}

} //AssetImpl
