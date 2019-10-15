/**
 */
package environment.impl;

import environment.Action;
import environment.Asset;
import environment.Connection;
import environment.Credential;
import environment.EnvironmentDiagram;
import environment.Port;
import environment.Property;
import environment.CyberPhysicalSystemPackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link environment.impl.EnvironmentDiagramImpl#getAsset <em>Asset</em>}</li>
 *   <li>{@link environment.impl.EnvironmentDiagramImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link environment.impl.EnvironmentDiagramImpl#getPort <em>Port</em>}</li>
 *   <li>{@link environment.impl.EnvironmentDiagramImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link environment.impl.EnvironmentDiagramImpl#getCredential <em>Credential</em>}</li>
 *   <li>{@link environment.impl.EnvironmentDiagramImpl#getAction <em>Action</em>}</li>
 *   <li>{@link environment.impl.EnvironmentDiagramImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnvironmentDiagramImpl extends MinimalEObjectImpl.Container implements EnvironmentDiagram {
	
	public static TreeMap<Integer, List<Class<?>>> abstractionLevels;
	public static int leastAbstractLevel = EnvironmentDiagram.LEVEL3;
	public static int mostAbstractLevel = EnvironmentDiagram.LEVEL1;
	
	protected Map<String, Asset> assetMap = new HashMap<String, Asset>();
	
	/**
	 * The cached value of the '{@link #getAsset() <em>Asset</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsset()
	 * @generated
	 * @ordered
	 */
	protected EList<Asset> asset;

	/**
	 * The cached value of the '{@link #getConnection() <em>Connection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> connection;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> port;

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
	 * The cached value of the '{@link #getCredential() <em>Credential</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredential()
	 * @generated
	 * @ordered
	 */
	protected EList<Credential> credential;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> action;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected EnvironmentDiagramImpl() {
		super();
		
		//used to sort keys (with values i.e. lists) in descending order (from highest, least abstract,
		//to lowest, most abstract)
		Comparator<Integer> greatestToLowest = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		};
		
		abstractionLevels = new TreeMap<Integer, List<Class<?>>>(greatestToLowest);
		
		//level1
//		levels.add(Arrays.asList(EnvironmentDiagram.LEVEL1_CLASSES));
		abstractionLevels.put(1, Arrays.asList(EnvironmentDiagram.LEVEL1_CLASSES));
		
		//level2
//		levels.add(Arrays.asList(EnvironmentDiagram.LEVEL2_CLASSES));
		abstractionLevels.put(2, Arrays.asList(EnvironmentDiagram.LEVEL2_CLASSES));
		
		//level3
//		levels.add(Arrays.asList(EnvironmentDiagram.LEVEL3_CLASSES));
		abstractionLevels.put(3, Arrays.asList(EnvironmentDiagram.LEVEL3_CLASSES));

	}

	public List<String> getAssetNames() {
		
		LinkedList<String> assetNames = new LinkedList<String>();
		
		for(Asset ast : getAsset()) {
			assetNames.add(ast.getName());
		}
		
		return assetNames;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CyberPhysicalSystemPackage.Literals.ENVIRONMENT_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Asset> getAsset() {
		if (asset == null) {
			asset = new EObjectContainmentEList<Asset>(Asset.class, this, CyberPhysicalSystemPackage.ENVIRONMENT_DIAGRAM__ASSET);
		}
		return asset;
	}
	
	public Asset getAsset(String assetName) {
	
		if(assetMap == null || assetMap.isEmpty()) {
			generateAssetMap();
		}
		
		return assetMap.get(assetName);
		
	}

	public Connection getConnection(String connectionName) {
	
			for(Connection con : getConnection()) {
				if(con.getName().equals(connectionName)) {
					return con;
				}
			}
			
			return null;
	}
	
	protected void generateAssetMap() {
		
		if(assetMap == null) {
			assetMap = new HashMap<String, Asset>();
		} else {
			assetMap.clear();
		}
		
		for(Asset ast : getAsset()) {
			assetMap.put(ast.getName(), ast);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Connection> getConnection() {
		if (connection == null) {
			connection = new EObjectContainmentEList<Connection>(Connection.class, this, CyberPhysicalSystemPackage.ENVIRONMENT_DIAGRAM__CONNECTION);
		}
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Port> getPort() {
		if (port == null) {
			port = new EObjectContainmentEList<Port>(Port.class, this, CyberPhysicalSystemPackage.ENVIRONMENT_DIAGRAM__PORT);
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<Property>(Property.class, this, CyberPhysicalSystemPackage.ENVIRONMENT_DIAGRAM__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Credential> getCredential() {
		if (credential == null) {
			credential = new EObjectContainmentEList<Credential>(Credential.class, this, CyberPhysicalSystemPackage.ENVIRONMENT_DIAGRAM__CREDENTIAL);
		}
		return credential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Action> getAction() {
		if (action == null) {
			action = new EObjectContainmentEList<Action>(Action.class, this, CyberPhysicalSystemPackage.ENVIRONMENT_DIAGRAM__ACTION);
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalSystemPackage.ENVIRONMENT_DIAGRAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CyberPhysicalSystemPackage.ENVIRONMENT_DIAGRAM__ASSET:
				return ((InternalEList<?>)getAsset()).basicRemove(otherEnd, msgs);
			case CyberPhysicalSystemPackage.ENVIRONMENT_DIAGRAM__CONNECTION:
				return ((InternalEList<?>)getConnection()).basicRemove(otherEnd, msgs);
			case CyberPhysicalSystemPackage.ENVIRONMENT_DIAGRAM__PORT:
				return ((InternalEList<?>)getPort()).basicRemove(otherEnd, msgs);
			case CyberPhysicalSystemPackage.ENVIRONMENT_DIAGRAM__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case CyberPhysicalSystemPackage.ENVIRONMENT_DIAGRAM__CREDENTIAL:
				return ((InternalEList<?>)getCredential()).basicRemove(otherEnd, msgs);
			case CyberPhysicalSystemPackage.ENVIRONMENT_DIAGRAM__ACTION:
				return ((InternalEList<?>)getAction()).basicRemove(otherEnd, msgs);
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
			case CyberPhysicalSystemPackage.ENVIRONMENT_DIAGRAM__ASSET:
				return getAsset();
			case CyberPhysicalSystemPackage.ENVIRONMENT_DIAGRAM__CONNECTION:
				return getConnection();
			case CyberPhysicalSystemPackage.ENVIRONMENT_DIAGRAM__PORT:
				return getPort();
			case CyberPhysicalSystemPackage.ENVIRONMENT_DIAGRAM__PROPERTY:
				return getProperty();
			case CyberPhysicalSystemPackage.ENVIRONMENT_DIAGRAM__CREDENTIAL:
				return getCredential();
			case CyberPhysicalSystemPackage.ENVIRONMENT_DIAGRAM__ACTION:
				return getAction();
			case CyberPhysicalSystemPackage.ENVIRONMENT_DIAGRAM__NAME:
				return getName();
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
			case CyberPhysicalSystemPackage.ENVIRONMENT_DIAGRAM__ASSET:
				getAsset().clear();
				getAsset().addAll((Collection<? extends Asset>)newValue);
				return;
			case CyberPhysicalSystemPackage.ENVIRONMENT_DIAGRAM__CONNECTION:
				getConnection().clear();
				getConnection().addAll((Collection<? extends Connection>)newValue);
				return;
			case CyberPhysicalSystemPackage.ENVIRONMENT_DIAGRAM__PORT:
				getPort().clear();
				getPort().addAll((Collection<? extends Port>)newValue);
				return;
			case CyberPhysicalSystemPackage.ENVIRONMENT_DIAGRAM__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case CyberPhysicalSystemPackage.ENVIRONMENT_DIAGRAM__CREDENTIAL:
				getCredential().clear();
				getCredential().addAll((Collection<? extends Credential>)newValue);
				return;
			case CyberPhysicalSystemPackage.ENVIRONMENT_DIAGRAM__ACTION:
				getAction().clear();
				getAction().addAll((Collection<? extends Action>)newValue);
				return;
			case CyberPhysicalSystemPackage.ENVIRONMENT_DIAGRAM__NAME:
				setName((String)newValue);
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
			case CyberPhysicalSystemPackage.ENVIRONMENT_DIAGRAM__ASSET:
				getAsset().clear();
				return;
			case CyberPhysicalSystemPackage.ENVIRONMENT_DIAGRAM__CONNECTION:
				getConnection().clear();
				return;
			case CyberPhysicalSystemPackage.ENVIRONMENT_DIAGRAM__PORT:
				getPort().clear();
				return;
			case CyberPhysicalSystemPackage.ENVIRONMENT_DIAGRAM__PROPERTY:
				getProperty().clear();
				return;
			case CyberPhysicalSystemPackage.ENVIRONMENT_DIAGRAM__CREDENTIAL:
				getCredential().clear();
				return;
			case CyberPhysicalSystemPackage.ENVIRONMENT_DIAGRAM__ACTION:
				getAction().clear();
				return;
			case CyberPhysicalSystemPackage.ENVIRONMENT_DIAGRAM__NAME:
				setName(NAME_EDEFAULT);
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
			case CyberPhysicalSystemPackage.ENVIRONMENT_DIAGRAM__ASSET:
				return asset != null && !asset.isEmpty();
			case CyberPhysicalSystemPackage.ENVIRONMENT_DIAGRAM__CONNECTION:
				return connection != null && !connection.isEmpty();
			case CyberPhysicalSystemPackage.ENVIRONMENT_DIAGRAM__PORT:
				return port != null && !port.isEmpty();
			case CyberPhysicalSystemPackage.ENVIRONMENT_DIAGRAM__PROPERTY:
				return property != null && !property.isEmpty();
			case CyberPhysicalSystemPackage.ENVIRONMENT_DIAGRAM__CREDENTIAL:
				return credential != null && !credential.isEmpty();
			case CyberPhysicalSystemPackage.ENVIRONMENT_DIAGRAM__ACTION:
				return action != null && !action.isEmpty();
			case CyberPhysicalSystemPackage.ENVIRONMENT_DIAGRAM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //EnvironmentDiagramImpl
