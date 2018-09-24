/**
 */
package environment.impl;

import environment.Asset;
import environment.Connection;
import environment.Credential;
import environment.CredentialType;
import environment.DigitalConnection;
import environment.PhysicalConnection;
import environment.Port;
import environment.Property;
import environment.Type;
import environment.Vulnerability;
import environment.CyberPhysicalSystemPackage;
import environment.CyberPhysicalSystemFactory;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
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
 *   <li>{@link environment.impl.ConnectionImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link environment.impl.ConnectionImpl#isBidirectional <em>Bidirectional</em>}</li>
 *   <li>{@link environment.impl.ConnectionImpl#getPort <em>Port</em>}</li>
 *   <li>{@link environment.impl.ConnectionImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link environment.impl.ConnectionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link environment.impl.ConnectionImpl#getType <em>Type</em>}</li>
 *   <li>{@link environment.impl.ConnectionImpl#getVulnerabilities <em>Vulnerabilities</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ConnectionImpl extends MinimalEObjectImpl.Container implements Connection {
	
	protected CyberPhysicalSystemFactory instance = environment.CyberPhysicalSystemFactory.eINSTANCE;
	protected static int connectionNumber = 1;
	protected static int portNumber = 1;
	protected static final long CONNECTION_NUMBER_LIMIT = Long.MAX_VALUE;
	protected static final long PORT_NUMBER_LIMIT = Long.MAX_VALUE;
	protected static String connectionName = "connection";
	protected static String portName = "port";
	protected Connection abstractedConnection;
	protected boolean isAbstracted = false;
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
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

	/**
	 * The cached value of the '{@link #getVulnerabilities() <em>Vulnerabilities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVulnerabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Vulnerability> vulnerabilities;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->

	 */
	protected ConnectionImpl() {
		super();
		
		//set default name
		String currentName = getName();
		String className = this.getClass().getName();
		String [] names = className.split("\\.");
		String cName = names[names.length-1].replace("Impl", "");
		
		if(currentName == null || currentName.isEmpty()) {
				String name = cName + connectionNumber++;
				char c[] = name.toCharArray();
				c[0] = Character.toLowerCase(c[0]);
				name = new String(c);
				setName(name);
			}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CyberPhysicalSystemPackage.Literals.CONNECTION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CyberPhysicalSystemPackage.CONNECTION__ASSET1, oldAsset1, asset1));
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
	 */
	public void setAsset1(Asset newAsset1) {
		Asset oldAsset1 = asset1;
		asset1 = newAsset1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalSystemPackage.CONNECTION__ASSET1, oldAsset1, asset1));
		
		//update asset1 with the connection
		if(asset1 != null) {
			EList<Connection> connections = asset1.getConnections();
			
			if(!isContainedIn((Collection<Connection>)connections)) {
				connections.add(this);
			}
		}
		
		
		//remove connection from old asset
		if(oldAsset1 != null) {
			oldAsset1.getConnections().remove(this);
		}
		
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CyberPhysicalSystemPackage.CONNECTION__ASSET2, oldAsset2, asset2));
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

	 */
	public void setAsset2(Asset newAsset2) {
		Asset oldAsset2 = asset2;
		asset2 = newAsset2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalSystemPackage.CONNECTION__ASSET2, oldAsset2, asset2));
		
		//add connection to asset2
		if(asset2 != null) {
			EList<Connection> connections = asset2.getConnections();
			
			if(!isContainedIn((Collection<Connection>)connections)) {
				connections.add(this);
			}
		}
		
		//remove connection from old asset
		if(oldAsset2 != null) {
			oldAsset2.getConnections().remove(this);
		}
	}

private boolean isContainedIn(Collection<Connection> connections) {
		
		for(Connection con : connections) {
			if(this.getName() != null) {
				if(this.getName().equalsIgnoreCase(con.getName())) {
					return true;
				}
			}
			
		}
		
		return false;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalSystemPackage.CONNECTION__NAME, oldName, name));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CyberPhysicalSystemPackage.CONNECTION__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CyberPhysicalSystemPackage.CONNECTION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CyberPhysicalSystemPackage.CONNECTION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalSystemPackage.CONNECTION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vulnerability> getVulnerabilities() {
		if (vulnerabilities == null) {
			vulnerabilities = new EObjectResolvingEList<Vulnerability>(Vulnerability.class, this, CyberPhysicalSystemPackage.CONNECTION__VULNERABILITIES);
		}
		return vulnerabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getConstraints() {
		if (constraints == null) {
			constraints = new EDataTypeUniqueEList<String>(String.class, this, CyberPhysicalSystemPackage.CONNECTION__CONSTRAINTS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalSystemPackage.CONNECTION__BIDIRECTIONAL, oldBidirectional, bidirectional));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CyberPhysicalSystemPackage.CONNECTION__PORT, oldPort, newPort);
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
				msgs = ((InternalEObject)port).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CyberPhysicalSystemPackage.CONNECTION__PORT, null, msgs);
			if (newPort != null)
				msgs = ((InternalEObject)newPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CyberPhysicalSystemPackage.CONNECTION__PORT, null, msgs);
			msgs = basicSetPort(newPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalSystemPackage.CONNECTION__PORT, newPort, newPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectResolvingEList<Property>(Property.class, this, CyberPhysicalSystemPackage.CONNECTION__PROPERTIES);
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
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalSystemPackage.CONNECTION__DESCRIPTION, oldDescription, description));
	}

	public Connection abstractConnection() {
		
		
		if(isAbstracted) {
			return abstractedConnection;
		}
		
		//set type
		abstractedConnection = abstractType();
		
		if(abstractedConnection != null) {
			setAbstracted(true);	
		} else {
			return null;
		}
		
		//set bidirectional
		abstractedConnection.setBidirectional(this.isBidirectional());
		
		// type as attribute. for the moment it is abstracted (whatever value found)
		if(this.getType() != null) {
			Type type = instance.createType();
			type.setName(this.getType().getName());
			abstractedConnection.setType(type);	
		}
		
		//abstract port
		abstractPort();
		
		//abstract connection ends i.e. asset1 & asset2
		if(this.getAsset1() != null) {
			abstractedConnection.setAsset1(this.getAsset1().abstractAsset());
		}
		if(this.getAsset2() != null) {
			abstractedConnection.setAsset2(this.getAsset2().abstractAsset());
		}
		

		return  abstractedConnection;
	}
	
	public Connection abstractType() {
		
		try {
			
			//abstract type based on levels in system meta-model. Currently has 3 levels

			for (List<Class<?>> level : EnvironmentDiagramImpl.abstractionLevels.values()) {
				for(Class<?> cls : level) {
					if(cls.isInstance(this)) {
						return (Connection) cls.newInstance();
					}
				}
			}			
			
			} catch (InstantiationException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return null;
	}
	
	public void abstractPort() {
		
		Port port = this.getPort();
		
		//if current connection has no holds then abstraction is not required
		if(port == null) {
			return;
		}
		
		Port portAbstracted = instance.createPort();
		
		//set name
		portAbstracted.setName(ConnectionImpl.portName+ConnectionImpl.portNumber++);
		
		if(ConnectionImpl.portNumber >= ConnectionImpl.PORT_NUMBER_LIMIT) {
			ConnectionImpl.portNumber = 0;
		}
		
		//abstract asset
		Asset portAsset = port.getAsset();
		
		if(portAsset != null) {
			portAbstracted.setAsset(portAsset.abstractAsset());
		}
		
		Credential c;
		
		//set credentials
		for(Credential cred : port.getCredential()) {
			c = instance.createCredential();
			c.setType(cred.getType());
			if(c.getType() == CredentialType.OTHER) {
				c.setOther(cred.getOther());
			}
			portAbstracted.getCredential().add(c);
		}
		
		abstractedConnection.setPort(portAbstracted);
		
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int similarTo(Connection connection) {
		
		//compares current connection with the parameter one
		//criteria for comparison:
		//1-Type of connection e.g., physical or digital. Are they the sane? or of higher type
		//2-direction. is it the same
		//3-ports used, which include credentials required
		
		int similarity = 0;
		
		// compare connections types
		similarity += compareType(connection);
		
		// compare ports
		similarity += comparePort(connection);
		
		//compare ends of connections
		similarity += compareEnds(connection);
		
		// compare direction. Default value for direction is true i.e. bidirectional
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

	public int comparePort(Connection connection) {

		// compare ports: name, asset, and credential

		Port thisPort = this.getPort();
		Port argPort = connection.getPort();
		boolean isNameMatched = false;
		boolean isAssetMatched = false;
		boolean areCredentialsMatched = false;

		// if one or both DON'T have ports then return 0
		if (thisPort == null || argPort == null) {
			return 0;
		}

		// if the port is the same object for both connections. It is not likely as the model wouldn't allow the assignment of a port object to two different connection
		if (thisPort.equals(argPort)) {
			return Connection.EXACT_PORT;
		}

		// match name
		if (thisPort.getName().equals(argPort.getName())) {
			isNameMatched = true;
		}

		// match asset
		if (thisPort.getAsset() != null && argPort.getAsset() != null
				&& thisPort.getAsset().compareType(argPort.getAsset()) == Asset.EXACT_TYPE) {
			isAssetMatched = true;
		}

		BasicEList<Credential> matchedCredentials = new BasicEList<Credential>();
		int numOfMatches = 0;

		// match credentials
		for (Credential thisCred : thisPort.getCredential()) {
			for (Credential argCred : argPort.getCredential()) {

				// if already matched, then continue to the next
				if (matchedCredentials.contains(argCred)) {
					continue;
				}

				// if other is selected for both, then compare the "other"
				// attribute string value
				if (thisCred.getType().equals(CredentialType.OTHER) && argCred.getType().equals(CredentialType.OTHER)) {
					if (thisCred.getOther().equalsIgnoreCase(argCred.getOther())) {
						numOfMatches++;
						matchedCredentials.add(argCred);
						break;
					}

					// compare types
				} else if (thisCred.getType().equals(argCred.getType())) {
					numOfMatches++;
					matchedCredentials.add(argCred);
					break;
				}
			}
		}

		// exact match of credentials number. Credentials should be the same
		// size and all matched
		if ((numOfMatches == thisPort.getCredential().size()) && (numOfMatches == argPort.getCredential().size())) {
			areCredentialsMatched = true;
		}

		// if all match
		if (isNameMatched == true && isAssetMatched == true && areCredentialsMatched == true) {
			return Connection.EXACT_PORT;
		}

		// if only asset type matches
		if (isAssetMatched == true) {
			return Connection.PARTIAL_PORT;
		}

		return 0;
	}
	
	public int compareEnds(Connection connection) {
		
		Asset thisAsset1 = this.getAsset1();
		Asset thisAsset2 = this.getAsset2();
		Asset argAsset1 = connection.getAsset1();
		Asset argAsset2 = connection.getAsset2();
		
		// if any the ends are null return 0
		if (thisAsset1 == null || thisAsset2 == null || argAsset1 == null || argAsset2 == null) {
			return 0;
		}

		// one end is the same and the other end is of same type
		if ((thisAsset1.equals(argAsset1)) && (thisAsset2.compareType(argAsset2) == Asset.EXACT_TYPE)
				|| (thisAsset1.equals(argAsset2)) && (thisAsset2.compareType(argAsset1) == Asset.EXACT_TYPE)
				|| (thisAsset2.equals(argAsset1)) && (thisAsset1.compareType(argAsset2) == Asset.EXACT_TYPE)
				|| (thisAsset2.equals(argAsset2)) && (thisAsset1.compareType(argAsset1) == Asset.EXACT_TYPE)) {
			return Connection.END1_SAME_END2_TYPE;
		}
		
		// one end is the same, the other shares a super type
		if ((thisAsset1.equals(argAsset1)) && (thisAsset2.compareType(argAsset2) == Asset.EXACT_SUPER_TYPE)
				|| (thisAsset1.equals(argAsset2)) && (thisAsset2.compareType(argAsset1) == Asset.EXACT_SUPER_TYPE)
				|| (thisAsset2.equals(argAsset1)) && (thisAsset1.compareType(argAsset2) == Asset.EXACT_SUPER_TYPE)
				|| (thisAsset2.equals(argAsset2)) && (thisAsset1.compareType(argAsset1) == Asset.EXACT_SUPER_TYPE)) {
			return Connection.END1_SAME_END2_SUPERTYPE;
		}
		
		// one end is the same, the other shares an assignable type
		if ((thisAsset1.equals(argAsset1)) && (thisAsset2.compareType(argAsset2) == Asset.ASSIGNABLE_TYPE)
				|| (thisAsset1.equals(argAsset2)) && (thisAsset2.compareType(argAsset1) == Asset.ASSIGNABLE_TYPE)
				|| (thisAsset2.equals(argAsset1)) && (thisAsset1.compareType(argAsset2) == Asset.ASSIGNABLE_TYPE)
				|| (thisAsset2.equals(argAsset2)) && (thisAsset1.compareType(argAsset1) == Asset.ASSIGNABLE_TYPE)) {
			return Connection.END1_SAME_END2_ASSIGNABLETYPE;
		}

		// one end is the same, the other shares an abstract type
		if ((thisAsset1.equals(argAsset1)) && (thisAsset2.compareType(argAsset2) == Asset.ABSTRACT_TYPE)
				|| (thisAsset1.equals(argAsset2)) && (thisAsset2.compareType(argAsset1) == Asset.ABSTRACT_TYPE)
				|| (thisAsset2.equals(argAsset1)) && (thisAsset1.compareType(argAsset2) == Asset.ABSTRACT_TYPE)
				|| (thisAsset2.equals(argAsset2)) && (thisAsset1.compareType(argAsset1) == Asset.ABSTRACT_TYPE)) {
			return Connection.END1_SAME_END2_ABSTRACTTYPE;
		}
		
		//both ends on both connections have the same type
		if ((thisAsset1.compareType(argAsset1) == Asset.EXACT_TYPE)
				&& (thisAsset2.compareType(argAsset2) == Asset.EXACT_TYPE)
				|| (thisAsset1.compareType(argAsset2) == Asset.EXACT_TYPE)
						&& (thisAsset2.compareType(argAsset1) == Asset.EXACT_TYPE)
				|| (thisAsset2.compareType(argAsset1) == Asset.EXACT_TYPE)
						&& (thisAsset1.compareType(argAsset2) == Asset.EXACT_TYPE)
				|| (thisAsset2.compareType(argAsset2) == Asset.EXACT_TYPE)
						&& (thisAsset1.compareType(argAsset1) == Asset.EXACT_TYPE)) {
			return Connection.END1_TYPE_END2_TYPE;
		}
		
		// one end share a type, the other share super type
		if ((thisAsset1.compareType(argAsset1) == Asset.EXACT_TYPE)
				&& (thisAsset2.compareType(argAsset2) == Asset.EXACT_SUPER_TYPE)
				|| (thisAsset1.compareType(argAsset2) == Asset.EXACT_TYPE)
						&& (thisAsset2.compareType(argAsset1) == Asset.EXACT_SUPER_TYPE)
				|| (thisAsset2.compareType(argAsset1) == Asset.EXACT_TYPE)
						&& (thisAsset1.compareType(argAsset2) == Asset.EXACT_SUPER_TYPE)
				|| (thisAsset2.compareType(argAsset2) == Asset.EXACT_TYPE)
						&& (thisAsset1.compareType(argAsset1) == Asset.EXACT_SUPER_TYPE)) {
			return Connection.END1_TYP1_END2_SUPERTYPE;
		}

		// one end share a type, the other share assignable type
		if ((thisAsset1.compareType(argAsset1) == Asset.EXACT_TYPE)
				&& (thisAsset2.compareType(argAsset2) == Asset.ASSIGNABLE_TYPE)
				|| (thisAsset1.compareType(argAsset2) == Asset.EXACT_TYPE)
						&& (thisAsset2.compareType(argAsset1) == Asset.ASSIGNABLE_TYPE)
				|| (thisAsset2.compareType(argAsset1) == Asset.EXACT_TYPE)
						&& (thisAsset1.compareType(argAsset2) == Asset.ASSIGNABLE_TYPE)
				|| (thisAsset2.compareType(argAsset2) == Asset.EXACT_TYPE)
						&& (thisAsset1.compareType(argAsset1) == Asset.ASSIGNABLE_TYPE)) {
			return Connection.END1_TYP1_END2_ASSIGNABLETYPE;
		}
		
		// one end share a type, the other share only abstract type (digital or physical)
		if ((thisAsset1.compareType(argAsset1) == Asset.EXACT_TYPE)
				&& (thisAsset2.compareType(argAsset2) == Asset.ABSTRACT_TYPE)
				|| (thisAsset1.compareType(argAsset2) == Asset.EXACT_TYPE)
						&& (thisAsset2.compareType(argAsset1) == Asset.ABSTRACT_TYPE)
				|| (thisAsset2.compareType(argAsset1) == Asset.EXACT_TYPE)
						&& (thisAsset1.compareType(argAsset2) == Asset.ABSTRACT_TYPE)
				|| (thisAsset2.compareType(argAsset2) == Asset.EXACT_TYPE)
						&& (thisAsset1.compareType(argAsset1) == Asset.ABSTRACT_TYPE)) {
			return Connection.END1_TYPE_END2_ABSTRACTTYPE;
		}

		/*//one end is the same and the other could be anything
		if((thisAsset1.equals(argAsset1) && !thisAsset2.equals(argAsset2))
				|| (thisAsset1.equals(argAsset2) && !thisAsset2.equals(argAsset1))
				|| (thisAsset2.equals(argAsset1) && !thisAsset1.equals(argAsset2))
				|| (thisAsset2.equals(argAsset2) && !thisAsset1.equals(argAsset1))) {
			return Connection.COMMON_END;
		}*/
		
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CyberPhysicalSystemPackage.CONNECTION__PORT:
				return basicSetPort(null, msgs);
			case CyberPhysicalSystemPackage.CONNECTION__TYPE:
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
			case CyberPhysicalSystemPackage.CONNECTION__ASSET1:
				if (resolve) return getAsset1();
				return basicGetAsset1();
			case CyberPhysicalSystemPackage.CONNECTION__ASSET2:
				if (resolve) return getAsset2();
				return basicGetAsset2();
			case CyberPhysicalSystemPackage.CONNECTION__NAME:
				return getName();
			case CyberPhysicalSystemPackage.CONNECTION__CONSTRAINTS:
				return getConstraints();
			case CyberPhysicalSystemPackage.CONNECTION__BIDIRECTIONAL:
				return isBidirectional();
			case CyberPhysicalSystemPackage.CONNECTION__PORT:
				return getPort();
			case CyberPhysicalSystemPackage.CONNECTION__PROPERTIES:
				return getProperties();
			case CyberPhysicalSystemPackage.CONNECTION__DESCRIPTION:
				return getDescription();
			case CyberPhysicalSystemPackage.CONNECTION__TYPE:
				return getType();
			case CyberPhysicalSystemPackage.CONNECTION__VULNERABILITIES:
				return getVulnerabilities();
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
			case CyberPhysicalSystemPackage.CONNECTION__ASSET1:
				setAsset1((Asset)newValue);
				return;
			case CyberPhysicalSystemPackage.CONNECTION__ASSET2:
				setAsset2((Asset)newValue);
				return;
			case CyberPhysicalSystemPackage.CONNECTION__NAME:
				setName((String)newValue);
				return;
			case CyberPhysicalSystemPackage.CONNECTION__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends String>)newValue);
				return;
			case CyberPhysicalSystemPackage.CONNECTION__BIDIRECTIONAL:
				setBidirectional((Boolean)newValue);
				return;
			case CyberPhysicalSystemPackage.CONNECTION__PORT:
				setPort((Port)newValue);
				return;
			case CyberPhysicalSystemPackage.CONNECTION__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
				return;
			case CyberPhysicalSystemPackage.CONNECTION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CyberPhysicalSystemPackage.CONNECTION__TYPE:
				setType((Type)newValue);
				return;
			case CyberPhysicalSystemPackage.CONNECTION__VULNERABILITIES:
				getVulnerabilities().clear();
				getVulnerabilities().addAll((Collection<? extends Vulnerability>)newValue);
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
			case CyberPhysicalSystemPackage.CONNECTION__ASSET1:
				setAsset1((Asset)null);
				return;
			case CyberPhysicalSystemPackage.CONNECTION__ASSET2:
				setAsset2((Asset)null);
				return;
			case CyberPhysicalSystemPackage.CONNECTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CyberPhysicalSystemPackage.CONNECTION__CONSTRAINTS:
				getConstraints().clear();
				return;
			case CyberPhysicalSystemPackage.CONNECTION__BIDIRECTIONAL:
				setBidirectional(BIDIRECTIONAL_EDEFAULT);
				return;
			case CyberPhysicalSystemPackage.CONNECTION__PORT:
				setPort((Port)null);
				return;
			case CyberPhysicalSystemPackage.CONNECTION__PROPERTIES:
				getProperties().clear();
				return;
			case CyberPhysicalSystemPackage.CONNECTION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CyberPhysicalSystemPackage.CONNECTION__TYPE:
				setType((Type)null);
				return;
			case CyberPhysicalSystemPackage.CONNECTION__VULNERABILITIES:
				getVulnerabilities().clear();
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
			case CyberPhysicalSystemPackage.CONNECTION__ASSET1:
				return asset1 != null;
			case CyberPhysicalSystemPackage.CONNECTION__ASSET2:
				return asset2 != null;
			case CyberPhysicalSystemPackage.CONNECTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CyberPhysicalSystemPackage.CONNECTION__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case CyberPhysicalSystemPackage.CONNECTION__BIDIRECTIONAL:
				return bidirectional != BIDIRECTIONAL_EDEFAULT;
			case CyberPhysicalSystemPackage.CONNECTION__PORT:
				return port != null;
			case CyberPhysicalSystemPackage.CONNECTION__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case CyberPhysicalSystemPackage.CONNECTION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CyberPhysicalSystemPackage.CONNECTION__TYPE:
				return type != null;
			case CyberPhysicalSystemPackage.CONNECTION__VULNERABILITIES:
				return vulnerabilities != null && !vulnerabilities.isEmpty();
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
			case CyberPhysicalSystemPackage.CONNECTION___SIMILAR_TO__CONNECTION:
				return similarTo((Connection)arguments.get(0));
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
		result.append(", constraints: ");
		result.append(constraints);
		result.append(", bidirectional: ");
		result.append(bidirectional);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

	public Connection getAbstractedConnection() {
		return abstractedConnection;
	}

	public void setAbstractedConnection(Connection abstractedConnection) {
		
		if(abstractedConnection == null) {
			isAbstracted = false;
		} else {
			isAbstracted = true;
		}
		this.abstractedConnection = abstractedConnection;
	}

	public boolean isAbstracted() {
		return isAbstracted;
	}

	public void setAbstracted(boolean isAbstracted) {
		this.isAbstracted = isAbstracted;
	}

	
} //ConnectionImpl
