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
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

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
 *   <li>{@link environment.impl.EnvironmentDiagramImpl#getRule <em>Rule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnvironmentDiagramImpl extends MinimalEObjectImpl.Container implements EnvironmentDiagram {
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
	 * The cached value of the '{@link #getRule() <em>Rule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRule()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> rule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvironmentDiagramImpl() {
		super();
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
	public EList<Asset> getAsset() {
		if (asset == null) {
			asset = new EObjectContainmentEList<Asset>(Asset.class, this, CyberPhysicalSystemPackage.ENVIRONMENT_DIAGRAM__ASSET);
		}
		return asset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public EList<Action> getRule() {
		if (rule == null) {
			rule = new EObjectContainmentEList<Action>(Action.class, this, CyberPhysicalSystemPackage.ENVIRONMENT_DIAGRAM__RULE);
		}
		return rule;
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
			case CyberPhysicalSystemPackage.ENVIRONMENT_DIAGRAM__RULE:
				return ((InternalEList<?>)getRule()).basicRemove(otherEnd, msgs);
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
			case CyberPhysicalSystemPackage.ENVIRONMENT_DIAGRAM__RULE:
				return getRule();
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
			case CyberPhysicalSystemPackage.ENVIRONMENT_DIAGRAM__RULE:
				getRule().clear();
				getRule().addAll((Collection<? extends Action>)newValue);
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
			case CyberPhysicalSystemPackage.ENVIRONMENT_DIAGRAM__RULE:
				getRule().clear();
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
			case CyberPhysicalSystemPackage.ENVIRONMENT_DIAGRAM__RULE:
				return rule != null && !rule.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EnvironmentDiagramImpl
