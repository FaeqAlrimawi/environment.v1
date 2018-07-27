/**
 */
package environment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link environment.Asset#getConnections <em>Connections</em>}</li>
 *   <li>{@link environment.Asset#getName <em>Name</em>}</li>
 *   <li>{@link environment.Asset#getProperty <em>Property</em>}</li>
 *   <li>{@link environment.Asset#getValue <em>Value</em>}</li>
 *   <li>{@link environment.Asset#getType <em>Type</em>}</li>
 *   <li>{@link environment.Asset#getDescription <em>Description</em>}</li>
 *   <li>{@link environment.Asset#getControl <em>Control</em>}</li>
 * </ul>
 *
 * @see environment.CyberPhysicalSystemPackage#getAsset()
 * @model abstract="true"
 * @generated
 */
public interface Asset extends EObject {
	/**
	 * Returns the value of the '<em><b>Connections</b></em>' reference list.
	 * The list contents are of type {@link environment.Connection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' reference list.
	 * @see environment.CyberPhysicalSystemPackage#getAsset_Connections()
	 * @model
	 * @generated
	 */
	EList<Connection> getConnections();

	//type similarity is given 40 (one of the following values will be assigned)
	static final int EXACT_TYPE = 40; // best: both have the same type
	static final int ASSIGNABLE_TYPE = 25; // very good: one is the super type of the other
	static final int EXACT_SUPER_TYPE = 15; // good: both share the same super type (e.g., lab and kitchen are Rooms)
	static final int ATTRIBUTE_TYPE = 10; // matching of the type as attribute
	static final int ABSTRACT_TYPE = 5; // not so good: both either physical or digital
	
	//if one asset is digital and the other is physical, then their similarity would be zero
	static final int NO_COMMON_TYPE = 0;
	
	//contained by the same parent 20
	static final int COMMON_PARENT = 20;
	static final int COMMON_PARENT_TYPE = 10; //parents have the same type
	
	//similarity of contained assets max. 30
	static final int CONTAINEDASSETS_EXACT = 30; //same number and type of assets
	static final int CONTAINEDASSETS_PARTIAL = 20; //some of the contained assets have the same type. some is set by CONTAINEDASSETS_PARTIAL_NUMBER PERCENTAGE
	static final double CONTAINEDASSETS_PARTIAL_PERCENTAGE = 0.5; // 50% OF contained assets
	static final int NO_CONTAINEDASSETS = 10; // both assets have no contained assets
	
	//connectivity takes max. 50. calculation will depend on the value returned from the connection/total multiplied by this value
	static final int CONNECTION_VALUE = 50;
	static final int BOTH_HAVE_NO_CONNECTIONS = 10; //if both assets have no connections
	// reference match
	
	//attributes match
	
	//properties match
	
	static final int SIMILARITY_MAXIMUM_VALUE = (EXACT_TYPE + ATTRIBUTE_TYPE) + COMMON_PARENT + CONTAINEDASSETS_EXACT + CONNECTION_VALUE; // currently 105
	static int SIMILARITY_THRESHOLD = SIMILARITY_MAXIMUM_VALUE/2; // currently 50%
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
	 * @see environment.CyberPhysicalSystemPackage#getAsset_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link environment.Asset#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	//added manually
	
	double compareType(Asset asset);
	double compareContainedAssets(Asset asset);
	double compareParentAsset(Asset asset);
	double compareConnections(Asset asset);
	

	//Asset abstractType();
	
	/**
	 * returns an abstract representation of this asset or null if there is no such representation
	 * @return An Asset object that is the abstract
	 */
	Asset getAbstractedAsset();
	
	/**
	 * Sets the abstract representation of this asset to the given argument. If the argument is NULL then
	 * this can allow to create a new abstract asset using the method {@link environment.Asset#abstractAsset()}
	 * @param newAbstractedAsset The Asset object that is the new abstract 
	 */
	void setAbstractedAsset(Asset newAbstractedAsset);
	
	void abstractContainedAssets();
	boolean isAbstracted();
	void setAbstracted(boolean isAbstracted);
	void abstractConnections();
	EList<? extends Asset> getContainedAssets();
	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link environment.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see environment.CyberPhysicalSystemPackage#getAsset_Property()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperty();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see environment.CyberPhysicalSystemPackage#getAsset_Value()
	 * @model
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link environment.Asset#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Type)
	 * @see environment.CyberPhysicalSystemPackage#getAsset_Type()
	 * @model containment="true"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link environment.Asset#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

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
	 * @see environment.CyberPhysicalSystemPackage#getAsset_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link environment.Asset#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control</em>' attribute.
	 * @see #setControl(String)
	 * @see environment.CyberPhysicalSystemPackage#getAsset_Control()
	 * @model
	 * @generated
	 */
	String getControl();

	/**
	 * Sets the value of the '{@link environment.Asset#getControl <em>Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control</em>' attribute.
	 * @see #getControl()
	 * @generated
	 */
	void setControl(String value);

	/**
	 * Creates a new Asset object that represents an abstraction of this asset. This includes its attributes 
	 * and references (e.g., contained assets and connections). The method returns null if the abstraction
	 * method fails to create an abstract representation
	 * @return An Asset object that is an abstract or null
	 */
	Asset abstractAsset();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	
	 */
	double similarTo(Asset asset);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void mergeConnections();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean canMergeConnections();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean canMergeContainedAssets();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void mergeContainedAssets();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model connectionsMany="true"
	 * @generated
	 */
	void mergeConnections(EList<Connection> connections);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model connectionsMany="true"
	 * @generated
	 */
	boolean canMergeConnections(EList<Connection> connections);

} // Asset
