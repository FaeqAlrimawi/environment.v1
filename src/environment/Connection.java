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
 *   <li>{@link environment.Connection#getType <em>Type</em>}</li>
 *   <li>{@link environment.Connection#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link environment.Connection#isBidirectional <em>Bidirectional</em>}</li>
 *   <li>{@link environment.Connection#getPort <em>Port</em>}</li>
 *   <li>{@link environment.Connection#getProperties <em>Properties</em>}</li>
 *   <li>{@link environment.Connection#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see environment.smartbuildingPackage#getConnection()
 * @model abstract="true"
 * @generated
 */
public interface Connection extends EObject {
	
	// type 30%
	static final int EXACT_TYPE = 30;
	static final int ASSIGNABLE_TYPE = 15;
	static final int EXACT_SUPER_TYPE = 10;
	static final int ABSTRACT_TYPE = 1;
	static final int TYPE_MISMATCH = 0;
	
	// direction 5%
	static final int CONNECTION_DIRECTION = 5;
	
	static final int MAXIMUM_SIMILARITY_VALUE = EXACT_TYPE + CONNECTION_DIRECTION;
	static final int SIMILARITY_THRESHOLD_VALUE =  MAXIMUM_SIMILARITY_VALUE/2;
	
	//maunally added methods
	int compareType(Connection connection);
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
	 * @see environment.smartbuildingPackage#getConnection_Asset1()
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
	 * @see environment.smartbuildingPackage#getConnection_Asset2()
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
	 * @see environment.smartbuildingPackage#getConnection_Name()
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
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see environment.smartbuildingPackage#getConnection_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link environment.Connection#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

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
	 * @see environment.smartbuildingPackage#getConnection_Constraints()
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
	 * @see environment.smartbuildingPackage#getConnection_Bidirectional()
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
	 * @see environment.smartbuildingPackage#getConnection_Port()
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
	 * @see environment.smartbuildingPackage#getConnection_Properties()
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
	 * @see environment.smartbuildingPackage#getConnection_Description()
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
	int isSimilarTo(Connection connection);

} // Connection
