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
 * @see environment.smartbuildingPackage#getAsset()
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
	 * @see environment.smartbuildingPackage#getAsset_Connections()
	 * @model
	 * @generated
	 */
	EList<Connection> getConnections();

	//type similarity is given 30% (one of the following values will be assigned)
	static final int EXACT_TYPE = 30; // best: both have the same type
	static final int ASSIGNABLE_TYPE = 15; // very good: one is the super type of the other
	static final int EXACT_SUPER_TYPE = 10; // good: both share the same super type (e.g., lab and kitchen are Rooms)
	static final int ATTRIBUTE_TYPE = 5; // natching of the type as attribute
	static final int ABSTRACT_TYPE = 1; // not so good: both either physical or digital
	
	//if one asset is digital and the other is physical, then their similarity would be zero
	static final int NO_COMMON_TYPE = 0;
	
	//contained by the same parent 20%
	static final int COMMON_PARENT = 20;
	static final int COMMON_PARENT_TYPE = 10; //parents have the same type
	
	//similarity of contained assets 20%
	static final int CONTAINEDASSETS_EXACT = 20; //same number and type of assets
	static final int CONTAINEDASSETS_PARTIAL = 10; //some of the contained assets have the same type. some is set by CONTAINEDASSETS_PARTIAL_NUMBER PERCENTAGE
	static final double CONTAINEDASSETS_PARTIAL_PERCENTAGE = 0.5; // 50% OF contained assets
	static final int NO_CONTAINEDASSETS = 10; // both assets have no contained assets
	//connectivity 
	
	// reference match
	
	//attributes match
	
	//properties match
	
	static final int SIMILARITY_MAXIMUM_VALUE = (EXACT_TYPE + ATTRIBUTE_TYPE) + COMMON_PARENT + CONTAINEDASSETS_EXACT; // currently 75
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
	 * @see environment.smartbuildingPackage#getAsset_Name()
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
	int compareType(Asset asset);
	int compareContainedAssets(Asset asset);
	int compareParentAsset(Asset asset);
	int compareConnections(Asset asset);
	
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
	 * @see environment.smartbuildingPackage#getAsset_Property()
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
	 * @see environment.smartbuildingPackage#getAsset_Value()
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
	 * @see environment.smartbuildingPackage#getAsset_Type()
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
	 * @see environment.smartbuildingPackage#getAsset_Description()
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
	 * @see environment.smartbuildingPackage#getAsset_Control()
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Asset abstractAsset();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int isSimilarTo(Asset asset);
	

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
