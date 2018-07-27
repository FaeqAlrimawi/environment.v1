/**
 */
package environment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link environment.Connection#getAsset1 <em>Asset1</em>}</li>
 *   <li>{@link environment.Connection#getAsset2 <em>Asset2</em>}</li>
 *   <li>{@link environment.Connection#getName <em>Name</em>}</li>
 *   <li>{@link environment.Connection#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link environment.Connection#isBidirectional <em>Bidirectional</em>}</li>
 *   <li>{@link environment.Connection#getPort <em>Port</em>}</li>
 *   <li>{@link environment.Connection#getProperties <em>Properties</em>}</li>
 *   <li>{@link environment.Connection#getDescription <em>Description</em>}</li>
 *   <li>{@link environment.Connection#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see environment.CyberPhysicalSystemPackage#getConnection()
 * @model abstract="true"
 * @generated
 */
public interface Connection extends EObject {
	
	// type max. 50
	static final int EXACT_TYPE = 50;
	static final int ASSIGNABLE_TYPE = 30;
	static final int EXACT_SUPER_TYPE = 25;
	static final int ABSTRACT_TYPE = 5;
	static final int TYPE_MISMATCH = 0;
	
	//port max. 30
	static final int EXACT_PORT = 30; // matches port name, asset linked to it, and credential
	static final int PARTIAL_PORT = 15; // matches asset type associated with port
	
	// ends max. 40
	static final int END1_SAME_END2_TYPE = 40; // one end of both connections share the same asset, the other end share the same type (direct type) of asset
	static final int END1_TYPE_END2_TYPE = 35; // both ends of both connections have similar types
	static final int END1_SAME_END2_ASSIGNABLETYPE = 30; // one end of both connections share the same asset, the other end share ASSIGNABLE type 
	static final int END1_TYP1_END2_ASSIGNABLETYPE = 25; // one end on both connections share a common type, the other ends share ASSIGNABLE type
	static final int END1_SAME_END2_SUPERTYPE = 20; // one end of both connections share the same asset, the other end share SAME SUPER type
	static final int END1_TYP1_END2_SUPERTYPE = 15; // one end on both connections share a common type, the other ends share super type (i.e. physical or digital)
	static final int END1_SAME_END2_ABSTRACTTYPE = 10; // one end of both connections share the same asset, the other end share ABSTRACT type (digital or physical)
	static final int END1_TYPE_END2_ABSTRACTTYPE = 5; // one end on both connections share a common type, the other ends share an abstract type (i.e. physical or digital)
	
	// direction max. 5
	static final int CONNECTION_DIRECTION = 5;
	
	static final int MAXIMUM_SIMILARITY_VALUE = EXACT_TYPE + EXACT_PORT + END1_SAME_END2_TYPE + CONNECTION_DIRECTION; //currently 125
	static int SIMILARITY_THRESHOLD_VALUE =  MAXIMUM_SIMILARITY_VALUE/2; // currently 50% of the total or above 
	
	// maunally added methods
	int compareType(Connection connection);
	int comparePort(Connection connection);
	int compareEnds(Connection connection);
	
	/**
	 * Creates a new Connection object that represents an abstraction of this connection. This includes its attributes 
	 * and references (e.g., asset1 and asset2). The method returns null if the abstraction
	 * method fails to create an abstract representation
	 * @return A Connection object that is an abstract or null
	 */
	Connection abstractConnection();
	
	void setAbstractedConnection(Connection newAbstractConnection);
	boolean isAbstracted();
	void setAbstracted(boolean isAbstracted);
	void abstractPort(); 
	/**
	 * Returns the value of the '<em><b>Asset1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset1</em>' reference.
	 * @see #setAsset1(Asset)
	 * @see environment.CyberPhysicalSystemPackage#getConnection_Asset1()
	 * @model
	 * @generated
	 */
	Asset getAsset1();

	/**
	 * Sets the value of the '{@link environment.Connection#getAsset1 <em>Asset1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset1</em>' reference.
	 * @see #getAsset1()
	 * @generated
	 */
	void setAsset1(Asset value);

	/**
	 * Returns the value of the '<em><b>Asset2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset2</em>' reference.
	 * @see #setAsset2(Asset)
	 * @see environment.CyberPhysicalSystemPackage#getConnection_Asset2()
	 * @model
	 * @generated
	 */
	Asset getAsset2();

	/**
	 * Sets the value of the '{@link environment.Connection#getAsset2 <em>Asset2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset2</em>' reference.
	 * @see #getAsset2()
	 * @generated
	 */
	void setAsset2(Asset value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see environment.CyberPhysicalSystemPackage#getConnection_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link environment.Connection#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Type)
	 * @see environment.CyberPhysicalSystemPackage#getConnection_Type()
	 * @model containment="true"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link environment.Connection#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);
	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' attribute list.
	 * @see environment.CyberPhysicalSystemPackage#getConnection_Constraints()
	 * @model
	 * @generated
	 */
	EList<String> getConstraints();

	/**
	 * Returns the value of the '<em><b>Bidirectional</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bidirectional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bidirectional</em>' attribute.
	 * @see #setBidirectional(boolean)
	 * @see environment.CyberPhysicalSystemPackage#getConnection_Bidirectional()
	 * @model default="true"
	 * @generated
	 */
	boolean isBidirectional();
	/**
	 * Sets the value of the '{@link environment.Connection#isBidirectional <em>Bidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bidirectional</em>' attribute.
	 * @see #isBidirectional()
	 * @generated
	 */
	void setBidirectional(boolean value);
	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference.
	 * @see #setPort(Port)
	 * @see environment.CyberPhysicalSystemPackage#getConnection_Port()
	 * @model containment="true"
	 * @generated
	 */
	Port getPort();

	/**
	 * Sets the value of the '{@link environment.Connection#getPort <em>Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' containment reference.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(Port value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' reference list.
	 * The list contents are of type {@link environment.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' reference list.
	 * @see environment.CyberPhysicalSystemPackage#getConnection_Properties()
	 * @model
	 * @generated
	 */
	EList<Property> getProperties();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see environment.CyberPhysicalSystemPackage#getConnection_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link environment.Connection#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int similarTo(Connection connection);

} // Connection
