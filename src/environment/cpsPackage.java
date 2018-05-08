/**
 */
package environment;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see environment.cpsFactory
 * @model kind="package"
 * @generated
 */
public interface cpsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "environment";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/environment";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "environment";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	cpsPackage eINSTANCE = environment.impl.cpsPackageImpl.init();

	/**
	 * The meta object id for the '{@link environment.impl.AssetImpl <em>Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.impl.AssetImpl
	 * @see environment.impl.cpsPackageImpl#getAsset()
	 * @generated
	 */
	int ASSET = 14;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__CONNECTIONS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__NAME = 1;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__PROPERTY = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__VALUE = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__TYPE = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__CONTROL = 6;

	/**
	 * The number of structural features of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Abstract Asset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET___ABSTRACT_ASSET = 0;

	/**
	 * The operation id for the '<em>Similar To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET___SIMILAR_TO__ASSET = 1;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET___MERGE_CONNECTIONS = 2;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET___CAN_MERGE_CONNECTIONS = 3;

	/**
	 * The operation id for the '<em>Can Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET___CAN_MERGE_CONTAINED_ASSETS = 4;

	/**
	 * The operation id for the '<em>Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET___MERGE_CONTAINED_ASSETS = 5;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET___MERGE_CONNECTIONS__ELIST = 6;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET___CAN_MERGE_CONNECTIONS__ELIST = 7;

	/**
	 * The number of operations of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_OPERATION_COUNT = 8;

	/**
	 * The meta object id for the '{@link environment.impl.PhysicalAssetImpl <em>Physical Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.impl.PhysicalAssetImpl
	 * @see environment.impl.cpsPackageImpl#getPhysicalAsset()
	 * @generated
	 */
	int PHYSICAL_ASSET = 0;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ASSET__CONNECTIONS = ASSET__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ASSET__NAME = ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ASSET__PROPERTY = ASSET__PROPERTY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ASSET__VALUE = ASSET__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ASSET__TYPE = ASSET__TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ASSET__DESCRIPTION = ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ASSET__CONTROL = ASSET__CONTROL;

	/**
	 * The feature id for the '<em><b>Contained Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ASSET__CONTAINED_ASSETS = ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ASSET__PARENT_ASSET = ASSET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Physical Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ASSET_FEATURE_COUNT = ASSET_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Abstract Asset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ASSET___ABSTRACT_ASSET = ASSET___ABSTRACT_ASSET;

	/**
	 * The operation id for the '<em>Similar To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ASSET___SIMILAR_TO__ASSET = ASSET___SIMILAR_TO__ASSET;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ASSET___MERGE_CONNECTIONS = ASSET___MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ASSET___CAN_MERGE_CONNECTIONS = ASSET___CAN_MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ASSET___CAN_MERGE_CONTAINED_ASSETS = ASSET___CAN_MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ASSET___MERGE_CONTAINED_ASSETS = ASSET___MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ASSET___MERGE_CONNECTIONS__ELIST = ASSET___MERGE_CONNECTIONS__ELIST;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ASSET___CAN_MERGE_CONNECTIONS__ELIST = ASSET___CAN_MERGE_CONNECTIONS__ELIST;

	/**
	 * The number of operations of the '<em>Physical Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_ASSET_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link environment.impl.ComputingDeviceImpl <em>Computing Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.impl.ComputingDeviceImpl
	 * @see environment.impl.cpsPackageImpl#getComputingDevice()
	 * @generated
	 */
	int COMPUTING_DEVICE = 1;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_DEVICE__CONNECTIONS = PHYSICAL_ASSET__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_DEVICE__NAME = PHYSICAL_ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_DEVICE__PROPERTY = PHYSICAL_ASSET__PROPERTY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_DEVICE__VALUE = PHYSICAL_ASSET__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_DEVICE__TYPE = PHYSICAL_ASSET__TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_DEVICE__DESCRIPTION = PHYSICAL_ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_DEVICE__CONTROL = PHYSICAL_ASSET__CONTROL;

	/**
	 * The feature id for the '<em><b>Contained Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_DEVICE__CONTAINED_ASSETS = PHYSICAL_ASSET__CONTAINED_ASSETS;

	/**
	 * The feature id for the '<em><b>Parent Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_DEVICE__PARENT_ASSET = PHYSICAL_ASSET__PARENT_ASSET;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_DEVICE__STATUS = PHYSICAL_ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connectable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_DEVICE__CONNECTABLE = PHYSICAL_ASSET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_DEVICE__MODEL = PHYSICAL_ASSET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Computing Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_DEVICE_FEATURE_COUNT = PHYSICAL_ASSET_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Abstract Asset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_DEVICE___ABSTRACT_ASSET = PHYSICAL_ASSET___ABSTRACT_ASSET;

	/**
	 * The operation id for the '<em>Similar To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_DEVICE___SIMILAR_TO__ASSET = PHYSICAL_ASSET___SIMILAR_TO__ASSET;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_DEVICE___MERGE_CONNECTIONS = PHYSICAL_ASSET___MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_DEVICE___CAN_MERGE_CONNECTIONS = PHYSICAL_ASSET___CAN_MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_DEVICE___CAN_MERGE_CONTAINED_ASSETS = PHYSICAL_ASSET___CAN_MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_DEVICE___MERGE_CONTAINED_ASSETS = PHYSICAL_ASSET___MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_DEVICE___MERGE_CONNECTIONS__ELIST = PHYSICAL_ASSET___MERGE_CONNECTIONS__ELIST;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_DEVICE___CAN_MERGE_CONNECTIONS__ELIST = PHYSICAL_ASSET___CAN_MERGE_CONNECTIONS__ELIST;

	/**
	 * The number of operations of the '<em>Computing Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_DEVICE_OPERATION_COUNT = PHYSICAL_ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link environment.impl.HVACImpl <em>HVAC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.impl.HVACImpl
	 * @see environment.impl.cpsPackageImpl#getHVAC()
	 * @generated
	 */
	int HVAC = 2;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HVAC__CONNECTIONS = COMPUTING_DEVICE__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HVAC__NAME = COMPUTING_DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HVAC__PROPERTY = COMPUTING_DEVICE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HVAC__VALUE = COMPUTING_DEVICE__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HVAC__TYPE = COMPUTING_DEVICE__TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HVAC__DESCRIPTION = COMPUTING_DEVICE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HVAC__CONTROL = COMPUTING_DEVICE__CONTROL;

	/**
	 * The feature id for the '<em><b>Contained Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HVAC__CONTAINED_ASSETS = COMPUTING_DEVICE__CONTAINED_ASSETS;

	/**
	 * The feature id for the '<em><b>Parent Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HVAC__PARENT_ASSET = COMPUTING_DEVICE__PARENT_ASSET;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HVAC__STATUS = COMPUTING_DEVICE__STATUS;

	/**
	 * The feature id for the '<em><b>Connectable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HVAC__CONNECTABLE = COMPUTING_DEVICE__CONNECTABLE;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HVAC__MODEL = COMPUTING_DEVICE__MODEL;

	/**
	 * The number of structural features of the '<em>HVAC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HVAC_FEATURE_COUNT = COMPUTING_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Abstract Asset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HVAC___ABSTRACT_ASSET = COMPUTING_DEVICE___ABSTRACT_ASSET;

	/**
	 * The operation id for the '<em>Similar To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HVAC___SIMILAR_TO__ASSET = COMPUTING_DEVICE___SIMILAR_TO__ASSET;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HVAC___MERGE_CONNECTIONS = COMPUTING_DEVICE___MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HVAC___CAN_MERGE_CONNECTIONS = COMPUTING_DEVICE___CAN_MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HVAC___CAN_MERGE_CONTAINED_ASSETS = COMPUTING_DEVICE___CAN_MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HVAC___MERGE_CONTAINED_ASSETS = COMPUTING_DEVICE___MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HVAC___MERGE_CONNECTIONS__ELIST = COMPUTING_DEVICE___MERGE_CONNECTIONS__ELIST;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HVAC___CAN_MERGE_CONNECTIONS__ELIST = COMPUTING_DEVICE___CAN_MERGE_CONNECTIONS__ELIST;

	/**
	 * The number of operations of the '<em>HVAC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HVAC_OPERATION_COUNT = COMPUTING_DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link environment.impl.SmartLightImpl <em>Smart Light</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.impl.SmartLightImpl
	 * @see environment.impl.cpsPackageImpl#getSmartLight()
	 * @generated
	 */
	int SMART_LIGHT = 3;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_LIGHT__CONNECTIONS = COMPUTING_DEVICE__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_LIGHT__NAME = COMPUTING_DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_LIGHT__PROPERTY = COMPUTING_DEVICE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_LIGHT__VALUE = COMPUTING_DEVICE__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_LIGHT__TYPE = COMPUTING_DEVICE__TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_LIGHT__DESCRIPTION = COMPUTING_DEVICE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_LIGHT__CONTROL = COMPUTING_DEVICE__CONTROL;

	/**
	 * The feature id for the '<em><b>Contained Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_LIGHT__CONTAINED_ASSETS = COMPUTING_DEVICE__CONTAINED_ASSETS;

	/**
	 * The feature id for the '<em><b>Parent Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_LIGHT__PARENT_ASSET = COMPUTING_DEVICE__PARENT_ASSET;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_LIGHT__STATUS = COMPUTING_DEVICE__STATUS;

	/**
	 * The feature id for the '<em><b>Connectable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_LIGHT__CONNECTABLE = COMPUTING_DEVICE__CONNECTABLE;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_LIGHT__MODEL = COMPUTING_DEVICE__MODEL;

	/**
	 * The number of structural features of the '<em>Smart Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_LIGHT_FEATURE_COUNT = COMPUTING_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Abstract Asset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_LIGHT___ABSTRACT_ASSET = COMPUTING_DEVICE___ABSTRACT_ASSET;

	/**
	 * The operation id for the '<em>Similar To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_LIGHT___SIMILAR_TO__ASSET = COMPUTING_DEVICE___SIMILAR_TO__ASSET;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_LIGHT___MERGE_CONNECTIONS = COMPUTING_DEVICE___MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_LIGHT___CAN_MERGE_CONNECTIONS = COMPUTING_DEVICE___CAN_MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_LIGHT___CAN_MERGE_CONTAINED_ASSETS = COMPUTING_DEVICE___CAN_MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_LIGHT___MERGE_CONTAINED_ASSETS = COMPUTING_DEVICE___MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_LIGHT___MERGE_CONNECTIONS__ELIST = COMPUTING_DEVICE___MERGE_CONNECTIONS__ELIST;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_LIGHT___CAN_MERGE_CONNECTIONS__ELIST = COMPUTING_DEVICE___CAN_MERGE_CONNECTIONS__ELIST;

	/**
	 * The number of operations of the '<em>Smart Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_LIGHT_OPERATION_COUNT = COMPUTING_DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link environment.impl.LaptopImpl <em>Laptop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.impl.LaptopImpl
	 * @see environment.impl.cpsPackageImpl#getLaptop()
	 * @generated
	 */
	int LAPTOP = 4;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAPTOP__CONNECTIONS = COMPUTING_DEVICE__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAPTOP__NAME = COMPUTING_DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAPTOP__PROPERTY = COMPUTING_DEVICE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAPTOP__VALUE = COMPUTING_DEVICE__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAPTOP__TYPE = COMPUTING_DEVICE__TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAPTOP__DESCRIPTION = COMPUTING_DEVICE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAPTOP__CONTROL = COMPUTING_DEVICE__CONTROL;

	/**
	 * The feature id for the '<em><b>Contained Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAPTOP__CONTAINED_ASSETS = COMPUTING_DEVICE__CONTAINED_ASSETS;

	/**
	 * The feature id for the '<em><b>Parent Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAPTOP__PARENT_ASSET = COMPUTING_DEVICE__PARENT_ASSET;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAPTOP__STATUS = COMPUTING_DEVICE__STATUS;

	/**
	 * The feature id for the '<em><b>Connectable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAPTOP__CONNECTABLE = COMPUTING_DEVICE__CONNECTABLE;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAPTOP__MODEL = COMPUTING_DEVICE__MODEL;

	/**
	 * The number of structural features of the '<em>Laptop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAPTOP_FEATURE_COUNT = COMPUTING_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Abstract Asset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAPTOP___ABSTRACT_ASSET = COMPUTING_DEVICE___ABSTRACT_ASSET;

	/**
	 * The operation id for the '<em>Similar To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAPTOP___SIMILAR_TO__ASSET = COMPUTING_DEVICE___SIMILAR_TO__ASSET;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAPTOP___MERGE_CONNECTIONS = COMPUTING_DEVICE___MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAPTOP___CAN_MERGE_CONNECTIONS = COMPUTING_DEVICE___CAN_MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAPTOP___CAN_MERGE_CONTAINED_ASSETS = COMPUTING_DEVICE___CAN_MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAPTOP___MERGE_CONTAINED_ASSETS = COMPUTING_DEVICE___MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAPTOP___MERGE_CONNECTIONS__ELIST = COMPUTING_DEVICE___MERGE_CONNECTIONS__ELIST;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAPTOP___CAN_MERGE_CONNECTIONS__ELIST = COMPUTING_DEVICE___CAN_MERGE_CONNECTIONS__ELIST;

	/**
	 * The number of operations of the '<em>Laptop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAPTOP_OPERATION_COUNT = COMPUTING_DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link environment.impl.DesktopImpl <em>Desktop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.impl.DesktopImpl
	 * @see environment.impl.cpsPackageImpl#getDesktop()
	 * @generated
	 */
	int DESKTOP = 5;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESKTOP__CONNECTIONS = COMPUTING_DEVICE__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESKTOP__NAME = COMPUTING_DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESKTOP__PROPERTY = COMPUTING_DEVICE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESKTOP__VALUE = COMPUTING_DEVICE__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESKTOP__TYPE = COMPUTING_DEVICE__TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESKTOP__DESCRIPTION = COMPUTING_DEVICE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESKTOP__CONTROL = COMPUTING_DEVICE__CONTROL;

	/**
	 * The feature id for the '<em><b>Contained Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESKTOP__CONTAINED_ASSETS = COMPUTING_DEVICE__CONTAINED_ASSETS;

	/**
	 * The feature id for the '<em><b>Parent Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESKTOP__PARENT_ASSET = COMPUTING_DEVICE__PARENT_ASSET;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESKTOP__STATUS = COMPUTING_DEVICE__STATUS;

	/**
	 * The feature id for the '<em><b>Connectable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESKTOP__CONNECTABLE = COMPUTING_DEVICE__CONNECTABLE;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESKTOP__MODEL = COMPUTING_DEVICE__MODEL;

	/**
	 * The number of structural features of the '<em>Desktop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESKTOP_FEATURE_COUNT = COMPUTING_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Abstract Asset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESKTOP___ABSTRACT_ASSET = COMPUTING_DEVICE___ABSTRACT_ASSET;

	/**
	 * The operation id for the '<em>Similar To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESKTOP___SIMILAR_TO__ASSET = COMPUTING_DEVICE___SIMILAR_TO__ASSET;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESKTOP___MERGE_CONNECTIONS = COMPUTING_DEVICE___MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESKTOP___CAN_MERGE_CONNECTIONS = COMPUTING_DEVICE___CAN_MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESKTOP___CAN_MERGE_CONTAINED_ASSETS = COMPUTING_DEVICE___CAN_MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESKTOP___MERGE_CONTAINED_ASSETS = COMPUTING_DEVICE___MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESKTOP___MERGE_CONNECTIONS__ELIST = COMPUTING_DEVICE___MERGE_CONNECTIONS__ELIST;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESKTOP___CAN_MERGE_CONNECTIONS__ELIST = COMPUTING_DEVICE___CAN_MERGE_CONNECTIONS__ELIST;

	/**
	 * The number of operations of the '<em>Desktop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESKTOP_OPERATION_COUNT = COMPUTING_DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link environment.impl.CCTVImpl <em>CCTV</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.impl.CCTVImpl
	 * @see environment.impl.cpsPackageImpl#getCCTV()
	 * @generated
	 */
	int CCTV = 6;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCTV__CONNECTIONS = COMPUTING_DEVICE__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCTV__NAME = COMPUTING_DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCTV__PROPERTY = COMPUTING_DEVICE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCTV__VALUE = COMPUTING_DEVICE__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCTV__TYPE = COMPUTING_DEVICE__TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCTV__DESCRIPTION = COMPUTING_DEVICE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCTV__CONTROL = COMPUTING_DEVICE__CONTROL;

	/**
	 * The feature id for the '<em><b>Contained Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCTV__CONTAINED_ASSETS = COMPUTING_DEVICE__CONTAINED_ASSETS;

	/**
	 * The feature id for the '<em><b>Parent Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCTV__PARENT_ASSET = COMPUTING_DEVICE__PARENT_ASSET;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCTV__STATUS = COMPUTING_DEVICE__STATUS;

	/**
	 * The feature id for the '<em><b>Connectable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCTV__CONNECTABLE = COMPUTING_DEVICE__CONNECTABLE;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCTV__MODEL = COMPUTING_DEVICE__MODEL;

	/**
	 * The number of structural features of the '<em>CCTV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCTV_FEATURE_COUNT = COMPUTING_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Abstract Asset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCTV___ABSTRACT_ASSET = COMPUTING_DEVICE___ABSTRACT_ASSET;

	/**
	 * The operation id for the '<em>Similar To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCTV___SIMILAR_TO__ASSET = COMPUTING_DEVICE___SIMILAR_TO__ASSET;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCTV___MERGE_CONNECTIONS = COMPUTING_DEVICE___MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCTV___CAN_MERGE_CONNECTIONS = COMPUTING_DEVICE___CAN_MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCTV___CAN_MERGE_CONTAINED_ASSETS = COMPUTING_DEVICE___CAN_MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCTV___MERGE_CONTAINED_ASSETS = COMPUTING_DEVICE___MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCTV___MERGE_CONNECTIONS__ELIST = COMPUTING_DEVICE___MERGE_CONNECTIONS__ELIST;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCTV___CAN_MERGE_CONNECTIONS__ELIST = COMPUTING_DEVICE___CAN_MERGE_CONNECTIONS__ELIST;

	/**
	 * The number of operations of the '<em>CCTV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCTV_OPERATION_COUNT = COMPUTING_DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link environment.impl.ServerImpl <em>Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.impl.ServerImpl
	 * @see environment.impl.cpsPackageImpl#getServer()
	 * @generated
	 */
	int SERVER = 7;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__CONNECTIONS = COMPUTING_DEVICE__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__NAME = COMPUTING_DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__PROPERTY = COMPUTING_DEVICE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__VALUE = COMPUTING_DEVICE__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__TYPE = COMPUTING_DEVICE__TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__DESCRIPTION = COMPUTING_DEVICE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__CONTROL = COMPUTING_DEVICE__CONTROL;

	/**
	 * The feature id for the '<em><b>Contained Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__CONTAINED_ASSETS = COMPUTING_DEVICE__CONTAINED_ASSETS;

	/**
	 * The feature id for the '<em><b>Parent Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__PARENT_ASSET = COMPUTING_DEVICE__PARENT_ASSET;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__STATUS = COMPUTING_DEVICE__STATUS;

	/**
	 * The feature id for the '<em><b>Connectable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__CONNECTABLE = COMPUTING_DEVICE__CONNECTABLE;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__MODEL = COMPUTING_DEVICE__MODEL;

	/**
	 * The number of structural features of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_FEATURE_COUNT = COMPUTING_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Abstract Asset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER___ABSTRACT_ASSET = COMPUTING_DEVICE___ABSTRACT_ASSET;

	/**
	 * The operation id for the '<em>Similar To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER___SIMILAR_TO__ASSET = COMPUTING_DEVICE___SIMILAR_TO__ASSET;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER___MERGE_CONNECTIONS = COMPUTING_DEVICE___MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER___CAN_MERGE_CONNECTIONS = COMPUTING_DEVICE___CAN_MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER___CAN_MERGE_CONTAINED_ASSETS = COMPUTING_DEVICE___CAN_MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER___MERGE_CONTAINED_ASSETS = COMPUTING_DEVICE___MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER___MERGE_CONNECTIONS__ELIST = COMPUTING_DEVICE___MERGE_CONNECTIONS__ELIST;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER___CAN_MERGE_CONNECTIONS__ELIST = COMPUTING_DEVICE___CAN_MERGE_CONNECTIONS__ELIST;

	/**
	 * The number of operations of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_OPERATION_COUNT = COMPUTING_DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link environment.impl.DigitalAssetImpl <em>Digital Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.impl.DigitalAssetImpl
	 * @see environment.impl.cpsPackageImpl#getDigitalAsset()
	 * @generated
	 */
	int DIGITAL_ASSET = 21;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ASSET__CONNECTIONS = ASSET__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ASSET__NAME = ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ASSET__PROPERTY = ASSET__PROPERTY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ASSET__VALUE = ASSET__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ASSET__TYPE = ASSET__TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ASSET__DESCRIPTION = ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ASSET__CONTROL = ASSET__CONTROL;

	/**
	 * The feature id for the '<em><b>Parent Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ASSET__PARENT_ASSET = ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contained Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ASSET__CONTAINED_ASSETS = ASSET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Digital Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ASSET_FEATURE_COUNT = ASSET_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Abstract Asset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ASSET___ABSTRACT_ASSET = ASSET___ABSTRACT_ASSET;

	/**
	 * The operation id for the '<em>Similar To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ASSET___SIMILAR_TO__ASSET = ASSET___SIMILAR_TO__ASSET;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ASSET___MERGE_CONNECTIONS = ASSET___MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ASSET___CAN_MERGE_CONNECTIONS = ASSET___CAN_MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ASSET___CAN_MERGE_CONTAINED_ASSETS = ASSET___CAN_MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ASSET___MERGE_CONTAINED_ASSETS = ASSET___MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ASSET___MERGE_CONNECTIONS__ELIST = ASSET___MERGE_CONNECTIONS__ELIST;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ASSET___CAN_MERGE_CONNECTIONS__ELIST = ASSET___CAN_MERGE_CONNECTIONS__ELIST;

	/**
	 * The number of operations of the '<em>Digital Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_ASSET_OPERATION_COUNT = ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link environment.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.impl.FileImpl
	 * @see environment.impl.cpsPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 8;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__CONNECTIONS = DIGITAL_ASSET__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__NAME = DIGITAL_ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__PROPERTY = DIGITAL_ASSET__PROPERTY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__VALUE = DIGITAL_ASSET__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__TYPE = DIGITAL_ASSET__TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__DESCRIPTION = DIGITAL_ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__CONTROL = DIGITAL_ASSET__CONTROL;

	/**
	 * The feature id for the '<em><b>Parent Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__PARENT_ASSET = DIGITAL_ASSET__PARENT_ASSET;

	/**
	 * The feature id for the '<em><b>Contained Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__CONTAINED_ASSETS = DIGITAL_ASSET__CONTAINED_ASSETS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__STATUS = DIGITAL_ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__URL = DIGITAL_ASSET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = DIGITAL_ASSET_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Abstract Asset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE___ABSTRACT_ASSET = DIGITAL_ASSET___ABSTRACT_ASSET;

	/**
	 * The operation id for the '<em>Similar To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE___SIMILAR_TO__ASSET = DIGITAL_ASSET___SIMILAR_TO__ASSET;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE___MERGE_CONNECTIONS = DIGITAL_ASSET___MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE___CAN_MERGE_CONNECTIONS = DIGITAL_ASSET___CAN_MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE___CAN_MERGE_CONTAINED_ASSETS = DIGITAL_ASSET___CAN_MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE___MERGE_CONTAINED_ASSETS = DIGITAL_ASSET___MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE___MERGE_CONNECTIONS__ELIST = DIGITAL_ASSET___MERGE_CONNECTIONS__ELIST;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE___CAN_MERGE_CONNECTIONS__ELIST = DIGITAL_ASSET___CAN_MERGE_CONNECTIONS__ELIST;

	/**
	 * The number of operations of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OPERATION_COUNT = DIGITAL_ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link environment.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.impl.ProcessImpl
	 * @see environment.impl.cpsPackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 9;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__CONNECTIONS = DIGITAL_ASSET__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NAME = DIGITAL_ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PROPERTY = DIGITAL_ASSET__PROPERTY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__VALUE = DIGITAL_ASSET__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__TYPE = DIGITAL_ASSET__TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__DESCRIPTION = DIGITAL_ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__CONTROL = DIGITAL_ASSET__CONTROL;

	/**
	 * The feature id for the '<em><b>Parent Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PARENT_ASSET = DIGITAL_ASSET__PARENT_ASSET;

	/**
	 * The feature id for the '<em><b>Contained Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__CONTAINED_ASSETS = DIGITAL_ASSET__CONTAINED_ASSETS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__STATUS = DIGITAL_ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = DIGITAL_ASSET_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Abstract Asset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___ABSTRACT_ASSET = DIGITAL_ASSET___ABSTRACT_ASSET;

	/**
	 * The operation id for the '<em>Similar To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___SIMILAR_TO__ASSET = DIGITAL_ASSET___SIMILAR_TO__ASSET;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___MERGE_CONNECTIONS = DIGITAL_ASSET___MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___CAN_MERGE_CONNECTIONS = DIGITAL_ASSET___CAN_MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___CAN_MERGE_CONTAINED_ASSETS = DIGITAL_ASSET___CAN_MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___MERGE_CONTAINED_ASSETS = DIGITAL_ASSET___MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___MERGE_CONNECTIONS__ELIST = DIGITAL_ASSET___MERGE_CONNECTIONS__ELIST;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___CAN_MERGE_CONNECTIONS__ELIST = DIGITAL_ASSET___CAN_MERGE_CONNECTIONS__ELIST;

	/**
	 * The number of operations of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OPERATION_COUNT = DIGITAL_ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link environment.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.impl.ApplicationImpl
	 * @see environment.impl.cpsPackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 10;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__CONNECTIONS = DIGITAL_ASSET__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__NAME = DIGITAL_ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__PROPERTY = DIGITAL_ASSET__PROPERTY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__VALUE = DIGITAL_ASSET__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__TYPE = DIGITAL_ASSET__TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__DESCRIPTION = DIGITAL_ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__CONTROL = DIGITAL_ASSET__CONTROL;

	/**
	 * The feature id for the '<em><b>Parent Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__PARENT_ASSET = DIGITAL_ASSET__PARENT_ASSET;

	/**
	 * The feature id for the '<em><b>Contained Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__CONTAINED_ASSETS = DIGITAL_ASSET__CONTAINED_ASSETS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__STATUS = DIGITAL_ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__URL = DIGITAL_ASSET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = DIGITAL_ASSET_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Abstract Asset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION___ABSTRACT_ASSET = DIGITAL_ASSET___ABSTRACT_ASSET;

	/**
	 * The operation id for the '<em>Similar To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION___SIMILAR_TO__ASSET = DIGITAL_ASSET___SIMILAR_TO__ASSET;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION___MERGE_CONNECTIONS = DIGITAL_ASSET___MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION___CAN_MERGE_CONNECTIONS = DIGITAL_ASSET___CAN_MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION___CAN_MERGE_CONTAINED_ASSETS = DIGITAL_ASSET___CAN_MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION___MERGE_CONTAINED_ASSETS = DIGITAL_ASSET___MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION___MERGE_CONNECTIONS__ELIST = DIGITAL_ASSET___MERGE_CONNECTIONS__ELIST;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION___CAN_MERGE_CONNECTIONS__ELIST = DIGITAL_ASSET___CAN_MERGE_CONNECTIONS__ELIST;

	/**
	 * The number of operations of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_OPERATION_COUNT = DIGITAL_ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link environment.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.impl.ConnectionImpl
	 * @see environment.impl.cpsPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 11;

	/**
	 * The feature id for the '<em><b>Asset1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__ASSET1 = 0;

	/**
	 * The feature id for the '<em><b>Asset2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__ASSET2 = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__NAME = 2;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__CONSTRAINTS = 3;

	/**
	 * The feature id for the '<em><b>Bidirectional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__BIDIRECTIONAL = 4;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__PORT = 5;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__PROPERTIES = 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__DESCRIPTION = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TYPE = 8;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 9;

	/**
	 * The operation id for the '<em>Similar To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___SIMILAR_TO__CONNECTION = 0;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link environment.impl.DigitalConnectionImpl <em>Digital Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.impl.DigitalConnectionImpl
	 * @see environment.impl.cpsPackageImpl#getDigitalConnection()
	 * @generated
	 */
	int DIGITAL_CONNECTION = 12;

	/**
	 * The feature id for the '<em><b>Asset1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_CONNECTION__ASSET1 = CONNECTION__ASSET1;

	/**
	 * The feature id for the '<em><b>Asset2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_CONNECTION__ASSET2 = CONNECTION__ASSET2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_CONNECTION__NAME = CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_CONNECTION__CONSTRAINTS = CONNECTION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Bidirectional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_CONNECTION__BIDIRECTIONAL = CONNECTION__BIDIRECTIONAL;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_CONNECTION__PORT = CONNECTION__PORT;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_CONNECTION__PROPERTIES = CONNECTION__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_CONNECTION__DESCRIPTION = CONNECTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_CONNECTION__TYPE = CONNECTION__TYPE;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_CONNECTION__PROTOCOL = CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Digital Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_CONNECTION_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Similar To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_CONNECTION___SIMILAR_TO__CONNECTION = CONNECTION___SIMILAR_TO__CONNECTION;

	/**
	 * The number of operations of the '<em>Digital Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_CONNECTION_OPERATION_COUNT = CONNECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link environment.impl.PhysicalConnectionImpl <em>Physical Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.impl.PhysicalConnectionImpl
	 * @see environment.impl.cpsPackageImpl#getPhysicalConnection()
	 * @generated
	 */
	int PHYSICAL_CONNECTION = 13;

	/**
	 * The feature id for the '<em><b>Asset1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONNECTION__ASSET1 = CONNECTION__ASSET1;

	/**
	 * The feature id for the '<em><b>Asset2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONNECTION__ASSET2 = CONNECTION__ASSET2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONNECTION__NAME = CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONNECTION__CONSTRAINTS = CONNECTION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Bidirectional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONNECTION__BIDIRECTIONAL = CONNECTION__BIDIRECTIONAL;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONNECTION__PORT = CONNECTION__PORT;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONNECTION__PROPERTIES = CONNECTION__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONNECTION__DESCRIPTION = CONNECTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONNECTION__TYPE = CONNECTION__TYPE;

	/**
	 * The number of structural features of the '<em>Physical Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONNECTION_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Similar To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONNECTION___SIMILAR_TO__CONNECTION = CONNECTION___SIMILAR_TO__CONNECTION;

	/**
	 * The number of operations of the '<em>Physical Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONNECTION_OPERATION_COUNT = CONNECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link environment.impl.EnvironmentDiagramImpl <em>Environment Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.impl.EnvironmentDiagramImpl
	 * @see environment.impl.cpsPackageImpl#getEnvironmentDiagram()
	 * @generated
	 */
	int ENVIRONMENT_DIAGRAM = 15;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_DIAGRAM__ASSET = 0;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_DIAGRAM__CONNECTION = 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_DIAGRAM__PORT = 2;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_DIAGRAM__PROPERTY = 3;

	/**
	 * The feature id for the '<em><b>Credential</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_DIAGRAM__CREDENTIAL = 4;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_DIAGRAM__RULE = 5;

	/**
	 * The number of structural features of the '<em>Environment Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_DIAGRAM_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Environment Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_DIAGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link environment.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.impl.PortImpl
	 * @see environment.impl.cpsPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 16;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__ASSET = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Credential</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__CREDENTIAL = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link environment.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.impl.PropertyImpl
	 * @see environment.impl.cpsPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Abstractable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ABSTRACTABLE = 2;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link environment.impl.CredentialImpl <em>Credential</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.impl.CredentialImpl
	 * @see environment.impl.cpsPackageImpl#getCredential()
	 * @generated
	 */
	int CREDENTIAL = 18;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIAL__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Other</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIAL__OTHER = 1;

	/**
	 * The number of structural features of the '<em>Credential</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIAL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Credential</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link environment.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.impl.ActorImpl
	 * @see environment.impl.cpsPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 19;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__CONNECTIONS = PHYSICAL_ASSET__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = PHYSICAL_ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__PROPERTY = PHYSICAL_ASSET__PROPERTY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__VALUE = PHYSICAL_ASSET__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__TYPE = PHYSICAL_ASSET__TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__DESCRIPTION = PHYSICAL_ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__CONTROL = PHYSICAL_ASSET__CONTROL;

	/**
	 * The feature id for the '<em><b>Contained Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__CONTAINED_ASSETS = PHYSICAL_ASSET__CONTAINED_ASSETS;

	/**
	 * The feature id for the '<em><b>Parent Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__PARENT_ASSET = PHYSICAL_ASSET__PARENT_ASSET;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ROLE = PHYSICAL_ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = PHYSICAL_ASSET_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Abstract Asset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___ABSTRACT_ASSET = PHYSICAL_ASSET___ABSTRACT_ASSET;

	/**
	 * The operation id for the '<em>Similar To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___SIMILAR_TO__ASSET = PHYSICAL_ASSET___SIMILAR_TO__ASSET;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___MERGE_CONNECTIONS = PHYSICAL_ASSET___MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___CAN_MERGE_CONNECTIONS = PHYSICAL_ASSET___CAN_MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___CAN_MERGE_CONTAINED_ASSETS = PHYSICAL_ASSET___CAN_MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___MERGE_CONTAINED_ASSETS = PHYSICAL_ASSET___MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___MERGE_CONNECTIONS__ELIST = PHYSICAL_ASSET___MERGE_CONNECTIONS__ELIST;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___CAN_MERGE_CONNECTIONS__ELIST = PHYSICAL_ASSET___CAN_MERGE_CONNECTIONS__ELIST;

	/**
	 * The number of operations of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_OPERATION_COUNT = PHYSICAL_ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link environment.impl.PhysicalStructureImpl <em>Physical Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.impl.PhysicalStructureImpl
	 * @see environment.impl.cpsPackageImpl#getPhysicalStructure()
	 * @generated
	 */
	int PHYSICAL_STRUCTURE = 20;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_STRUCTURE__CONNECTIONS = PHYSICAL_ASSET__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_STRUCTURE__NAME = PHYSICAL_ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_STRUCTURE__PROPERTY = PHYSICAL_ASSET__PROPERTY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_STRUCTURE__VALUE = PHYSICAL_ASSET__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_STRUCTURE__TYPE = PHYSICAL_ASSET__TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_STRUCTURE__DESCRIPTION = PHYSICAL_ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_STRUCTURE__CONTROL = PHYSICAL_ASSET__CONTROL;

	/**
	 * The feature id for the '<em><b>Contained Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_STRUCTURE__CONTAINED_ASSETS = PHYSICAL_ASSET__CONTAINED_ASSETS;

	/**
	 * The feature id for the '<em><b>Parent Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_STRUCTURE__PARENT_ASSET = PHYSICAL_ASSET__PARENT_ASSET;

	/**
	 * The number of structural features of the '<em>Physical Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_STRUCTURE_FEATURE_COUNT = PHYSICAL_ASSET_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Abstract Asset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_STRUCTURE___ABSTRACT_ASSET = PHYSICAL_ASSET___ABSTRACT_ASSET;

	/**
	 * The operation id for the '<em>Similar To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_STRUCTURE___SIMILAR_TO__ASSET = PHYSICAL_ASSET___SIMILAR_TO__ASSET;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_STRUCTURE___MERGE_CONNECTIONS = PHYSICAL_ASSET___MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_STRUCTURE___CAN_MERGE_CONNECTIONS = PHYSICAL_ASSET___CAN_MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_STRUCTURE___CAN_MERGE_CONTAINED_ASSETS = PHYSICAL_ASSET___CAN_MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_STRUCTURE___MERGE_CONTAINED_ASSETS = PHYSICAL_ASSET___MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_STRUCTURE___MERGE_CONNECTIONS__ELIST = PHYSICAL_ASSET___MERGE_CONNECTIONS__ELIST;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_STRUCTURE___CAN_MERGE_CONNECTIONS__ELIST = PHYSICAL_ASSET___CAN_MERGE_CONNECTIONS__ELIST;

	/**
	 * The number of operations of the '<em>Physical Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_STRUCTURE_OPERATION_COUNT = PHYSICAL_ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link environment.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.impl.ActionImpl
	 * @see environment.impl.cpsPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Preconditions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__PRECONDITIONS = 1;

	/**
	 * The feature id for the '<em><b>Postconditions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__POSTCONDITIONS = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link environment.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.impl.TypeImpl
	 * @see environment.impl.cpsPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__SUPER_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link environment.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.impl.RoomImpl
	 * @see environment.impl.cpsPackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 24;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__CONNECTIONS = PHYSICAL_STRUCTURE__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__NAME = PHYSICAL_STRUCTURE__NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__PROPERTY = PHYSICAL_STRUCTURE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__VALUE = PHYSICAL_STRUCTURE__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__TYPE = PHYSICAL_STRUCTURE__TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__DESCRIPTION = PHYSICAL_STRUCTURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__CONTROL = PHYSICAL_STRUCTURE__CONTROL;

	/**
	 * The feature id for the '<em><b>Contained Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__CONTAINED_ASSETS = PHYSICAL_STRUCTURE__CONTAINED_ASSETS;

	/**
	 * The feature id for the '<em><b>Parent Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__PARENT_ASSET = PHYSICAL_STRUCTURE__PARENT_ASSET;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = PHYSICAL_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Abstract Asset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM___ABSTRACT_ASSET = PHYSICAL_STRUCTURE___ABSTRACT_ASSET;

	/**
	 * The operation id for the '<em>Similar To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM___SIMILAR_TO__ASSET = PHYSICAL_STRUCTURE___SIMILAR_TO__ASSET;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM___MERGE_CONNECTIONS = PHYSICAL_STRUCTURE___MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM___CAN_MERGE_CONNECTIONS = PHYSICAL_STRUCTURE___CAN_MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM___CAN_MERGE_CONTAINED_ASSETS = PHYSICAL_STRUCTURE___CAN_MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM___MERGE_CONTAINED_ASSETS = PHYSICAL_STRUCTURE___MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM___MERGE_CONNECTIONS__ELIST = PHYSICAL_STRUCTURE___MERGE_CONNECTIONS__ELIST;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM___CAN_MERGE_CONNECTIONS__ELIST = PHYSICAL_STRUCTURE___CAN_MERGE_CONNECTIONS__ELIST;

	/**
	 * The number of operations of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATION_COUNT = PHYSICAL_STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link environment.impl.FloorImpl <em>Floor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.impl.FloorImpl
	 * @see environment.impl.cpsPackageImpl#getFloor()
	 * @generated
	 */
	int FLOOR = 25;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR__CONNECTIONS = PHYSICAL_STRUCTURE__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR__NAME = PHYSICAL_STRUCTURE__NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR__PROPERTY = PHYSICAL_STRUCTURE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR__VALUE = PHYSICAL_STRUCTURE__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR__TYPE = PHYSICAL_STRUCTURE__TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR__DESCRIPTION = PHYSICAL_STRUCTURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR__CONTROL = PHYSICAL_STRUCTURE__CONTROL;

	/**
	 * The feature id for the '<em><b>Contained Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR__CONTAINED_ASSETS = PHYSICAL_STRUCTURE__CONTAINED_ASSETS;

	/**
	 * The feature id for the '<em><b>Parent Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR__PARENT_ASSET = PHYSICAL_STRUCTURE__PARENT_ASSET;

	/**
	 * The number of structural features of the '<em>Floor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_FEATURE_COUNT = PHYSICAL_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Abstract Asset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR___ABSTRACT_ASSET = PHYSICAL_STRUCTURE___ABSTRACT_ASSET;

	/**
	 * The operation id for the '<em>Similar To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR___SIMILAR_TO__ASSET = PHYSICAL_STRUCTURE___SIMILAR_TO__ASSET;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR___MERGE_CONNECTIONS = PHYSICAL_STRUCTURE___MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR___CAN_MERGE_CONNECTIONS = PHYSICAL_STRUCTURE___CAN_MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR___CAN_MERGE_CONTAINED_ASSETS = PHYSICAL_STRUCTURE___CAN_MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR___MERGE_CONTAINED_ASSETS = PHYSICAL_STRUCTURE___MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR___MERGE_CONNECTIONS__ELIST = PHYSICAL_STRUCTURE___MERGE_CONNECTIONS__ELIST;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR___CAN_MERGE_CONNECTIONS__ELIST = PHYSICAL_STRUCTURE___CAN_MERGE_CONNECTIONS__ELIST;

	/**
	 * The number of operations of the '<em>Floor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_OPERATION_COUNT = PHYSICAL_STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link environment.impl.BuildingImpl <em>Building</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.impl.BuildingImpl
	 * @see environment.impl.cpsPackageImpl#getBuilding()
	 * @generated
	 */
	int BUILDING = 26;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__CONNECTIONS = PHYSICAL_STRUCTURE__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__NAME = PHYSICAL_STRUCTURE__NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__PROPERTY = PHYSICAL_STRUCTURE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__VALUE = PHYSICAL_STRUCTURE__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__TYPE = PHYSICAL_STRUCTURE__TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__DESCRIPTION = PHYSICAL_STRUCTURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__CONTROL = PHYSICAL_STRUCTURE__CONTROL;

	/**
	 * The feature id for the '<em><b>Contained Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__CONTAINED_ASSETS = PHYSICAL_STRUCTURE__CONTAINED_ASSETS;

	/**
	 * The feature id for the '<em><b>Parent Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING__PARENT_ASSET = PHYSICAL_STRUCTURE__PARENT_ASSET;

	/**
	 * The number of structural features of the '<em>Building</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_FEATURE_COUNT = PHYSICAL_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Abstract Asset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING___ABSTRACT_ASSET = PHYSICAL_STRUCTURE___ABSTRACT_ASSET;

	/**
	 * The operation id for the '<em>Similar To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING___SIMILAR_TO__ASSET = PHYSICAL_STRUCTURE___SIMILAR_TO__ASSET;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING___MERGE_CONNECTIONS = PHYSICAL_STRUCTURE___MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING___CAN_MERGE_CONNECTIONS = PHYSICAL_STRUCTURE___CAN_MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING___CAN_MERGE_CONTAINED_ASSETS = PHYSICAL_STRUCTURE___CAN_MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING___MERGE_CONTAINED_ASSETS = PHYSICAL_STRUCTURE___MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING___MERGE_CONNECTIONS__ELIST = PHYSICAL_STRUCTURE___MERGE_CONNECTIONS__ELIST;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING___CAN_MERGE_CONNECTIONS__ELIST = PHYSICAL_STRUCTURE___CAN_MERGE_CONNECTIONS__ELIST;

	/**
	 * The number of operations of the '<em>Building</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILDING_OPERATION_COUNT = PHYSICAL_STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link environment.impl.FireAlarmImpl <em>Fire Alarm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.impl.FireAlarmImpl
	 * @see environment.impl.cpsPackageImpl#getFireAlarm()
	 * @generated
	 */
	int FIRE_ALARM = 27;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRE_ALARM__CONNECTIONS = COMPUTING_DEVICE__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRE_ALARM__NAME = COMPUTING_DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRE_ALARM__PROPERTY = COMPUTING_DEVICE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRE_ALARM__VALUE = COMPUTING_DEVICE__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRE_ALARM__TYPE = COMPUTING_DEVICE__TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRE_ALARM__DESCRIPTION = COMPUTING_DEVICE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRE_ALARM__CONTROL = COMPUTING_DEVICE__CONTROL;

	/**
	 * The feature id for the '<em><b>Contained Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRE_ALARM__CONTAINED_ASSETS = COMPUTING_DEVICE__CONTAINED_ASSETS;

	/**
	 * The feature id for the '<em><b>Parent Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRE_ALARM__PARENT_ASSET = COMPUTING_DEVICE__PARENT_ASSET;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRE_ALARM__STATUS = COMPUTING_DEVICE__STATUS;

	/**
	 * The feature id for the '<em><b>Connectable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRE_ALARM__CONNECTABLE = COMPUTING_DEVICE__CONNECTABLE;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRE_ALARM__MODEL = COMPUTING_DEVICE__MODEL;

	/**
	 * The number of structural features of the '<em>Fire Alarm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRE_ALARM_FEATURE_COUNT = COMPUTING_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Abstract Asset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRE_ALARM___ABSTRACT_ASSET = COMPUTING_DEVICE___ABSTRACT_ASSET;

	/**
	 * The operation id for the '<em>Similar To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRE_ALARM___SIMILAR_TO__ASSET = COMPUTING_DEVICE___SIMILAR_TO__ASSET;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRE_ALARM___MERGE_CONNECTIONS = COMPUTING_DEVICE___MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRE_ALARM___CAN_MERGE_CONNECTIONS = COMPUTING_DEVICE___CAN_MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRE_ALARM___CAN_MERGE_CONTAINED_ASSETS = COMPUTING_DEVICE___CAN_MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRE_ALARM___MERGE_CONTAINED_ASSETS = COMPUTING_DEVICE___MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRE_ALARM___MERGE_CONNECTIONS__ELIST = COMPUTING_DEVICE___MERGE_CONNECTIONS__ELIST;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRE_ALARM___CAN_MERGE_CONNECTIONS__ELIST = COMPUTING_DEVICE___CAN_MERGE_CONNECTIONS__ELIST;

	/**
	 * The number of operations of the '<em>Fire Alarm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRE_ALARM_OPERATION_COUNT = COMPUTING_DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link environment.impl.WorkstationImpl <em>Workstation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.impl.WorkstationImpl
	 * @see environment.impl.cpsPackageImpl#getWorkstation()
	 * @generated
	 */
	int WORKSTATION = 28;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTATION__CONNECTIONS = COMPUTING_DEVICE__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTATION__NAME = COMPUTING_DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTATION__PROPERTY = COMPUTING_DEVICE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTATION__VALUE = COMPUTING_DEVICE__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTATION__TYPE = COMPUTING_DEVICE__TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTATION__DESCRIPTION = COMPUTING_DEVICE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTATION__CONTROL = COMPUTING_DEVICE__CONTROL;

	/**
	 * The feature id for the '<em><b>Contained Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTATION__CONTAINED_ASSETS = COMPUTING_DEVICE__CONTAINED_ASSETS;

	/**
	 * The feature id for the '<em><b>Parent Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTATION__PARENT_ASSET = COMPUTING_DEVICE__PARENT_ASSET;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTATION__STATUS = COMPUTING_DEVICE__STATUS;

	/**
	 * The feature id for the '<em><b>Connectable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTATION__CONNECTABLE = COMPUTING_DEVICE__CONNECTABLE;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTATION__MODEL = COMPUTING_DEVICE__MODEL;

	/**
	 * The number of structural features of the '<em>Workstation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTATION_FEATURE_COUNT = COMPUTING_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Abstract Asset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTATION___ABSTRACT_ASSET = COMPUTING_DEVICE___ABSTRACT_ASSET;

	/**
	 * The operation id for the '<em>Similar To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTATION___SIMILAR_TO__ASSET = COMPUTING_DEVICE___SIMILAR_TO__ASSET;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTATION___MERGE_CONNECTIONS = COMPUTING_DEVICE___MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTATION___CAN_MERGE_CONNECTIONS = COMPUTING_DEVICE___CAN_MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTATION___CAN_MERGE_CONTAINED_ASSETS = COMPUTING_DEVICE___CAN_MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTATION___MERGE_CONTAINED_ASSETS = COMPUTING_DEVICE___MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTATION___MERGE_CONNECTIONS__ELIST = COMPUTING_DEVICE___MERGE_CONNECTIONS__ELIST;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTATION___CAN_MERGE_CONNECTIONS__ELIST = COMPUTING_DEVICE___CAN_MERGE_CONNECTIONS__ELIST;

	/**
	 * The number of operations of the '<em>Workstation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTATION_OPERATION_COUNT = COMPUTING_DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link environment.impl.LabImpl <em>Lab</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.impl.LabImpl
	 * @see environment.impl.cpsPackageImpl#getLab()
	 * @generated
	 */
	int LAB = 29;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAB__CONNECTIONS = ROOM__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAB__NAME = ROOM__NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAB__PROPERTY = ROOM__PROPERTY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAB__VALUE = ROOM__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAB__TYPE = ROOM__TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAB__DESCRIPTION = ROOM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAB__CONTROL = ROOM__CONTROL;

	/**
	 * The feature id for the '<em><b>Contained Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAB__CONTAINED_ASSETS = ROOM__CONTAINED_ASSETS;

	/**
	 * The feature id for the '<em><b>Parent Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAB__PARENT_ASSET = ROOM__PARENT_ASSET;

	/**
	 * The number of structural features of the '<em>Lab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAB_FEATURE_COUNT = ROOM_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Abstract Asset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAB___ABSTRACT_ASSET = ROOM___ABSTRACT_ASSET;

	/**
	 * The operation id for the '<em>Similar To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAB___SIMILAR_TO__ASSET = ROOM___SIMILAR_TO__ASSET;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAB___MERGE_CONNECTIONS = ROOM___MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAB___CAN_MERGE_CONNECTIONS = ROOM___CAN_MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAB___CAN_MERGE_CONTAINED_ASSETS = ROOM___CAN_MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAB___MERGE_CONTAINED_ASSETS = ROOM___MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAB___MERGE_CONNECTIONS__ELIST = ROOM___MERGE_CONNECTIONS__ELIST;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAB___CAN_MERGE_CONNECTIONS__ELIST = ROOM___CAN_MERGE_CONNECTIONS__ELIST;

	/**
	 * The number of operations of the '<em>Lab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAB_OPERATION_COUNT = ROOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link environment.impl.ToiletImpl <em>Toilet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.impl.ToiletImpl
	 * @see environment.impl.cpsPackageImpl#getToilet()
	 * @generated
	 */
	int TOILET = 30;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOILET__CONNECTIONS = ROOM__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOILET__NAME = ROOM__NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOILET__PROPERTY = ROOM__PROPERTY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOILET__VALUE = ROOM__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOILET__TYPE = ROOM__TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOILET__DESCRIPTION = ROOM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOILET__CONTROL = ROOM__CONTROL;

	/**
	 * The feature id for the '<em><b>Contained Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOILET__CONTAINED_ASSETS = ROOM__CONTAINED_ASSETS;

	/**
	 * The feature id for the '<em><b>Parent Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOILET__PARENT_ASSET = ROOM__PARENT_ASSET;

	/**
	 * The number of structural features of the '<em>Toilet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOILET_FEATURE_COUNT = ROOM_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Abstract Asset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOILET___ABSTRACT_ASSET = ROOM___ABSTRACT_ASSET;

	/**
	 * The operation id for the '<em>Similar To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOILET___SIMILAR_TO__ASSET = ROOM___SIMILAR_TO__ASSET;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOILET___MERGE_CONNECTIONS = ROOM___MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOILET___CAN_MERGE_CONNECTIONS = ROOM___CAN_MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOILET___CAN_MERGE_CONTAINED_ASSETS = ROOM___CAN_MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOILET___MERGE_CONTAINED_ASSETS = ROOM___MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOILET___MERGE_CONNECTIONS__ELIST = ROOM___MERGE_CONNECTIONS__ELIST;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOILET___CAN_MERGE_CONNECTIONS__ELIST = ROOM___CAN_MERGE_CONNECTIONS__ELIST;

	/**
	 * The number of operations of the '<em>Toilet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOILET_OPERATION_COUNT = ROOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link environment.impl.LoungeImpl <em>Lounge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.impl.LoungeImpl
	 * @see environment.impl.cpsPackageImpl#getLounge()
	 * @generated
	 */
	int LOUNGE = 31;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOUNGE__CONNECTIONS = ROOM__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOUNGE__NAME = ROOM__NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOUNGE__PROPERTY = ROOM__PROPERTY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOUNGE__VALUE = ROOM__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOUNGE__TYPE = ROOM__TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOUNGE__DESCRIPTION = ROOM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOUNGE__CONTROL = ROOM__CONTROL;

	/**
	 * The feature id for the '<em><b>Contained Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOUNGE__CONTAINED_ASSETS = ROOM__CONTAINED_ASSETS;

	/**
	 * The feature id for the '<em><b>Parent Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOUNGE__PARENT_ASSET = ROOM__PARENT_ASSET;

	/**
	 * The number of structural features of the '<em>Lounge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOUNGE_FEATURE_COUNT = ROOM_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Abstract Asset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOUNGE___ABSTRACT_ASSET = ROOM___ABSTRACT_ASSET;

	/**
	 * The operation id for the '<em>Similar To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOUNGE___SIMILAR_TO__ASSET = ROOM___SIMILAR_TO__ASSET;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOUNGE___MERGE_CONNECTIONS = ROOM___MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOUNGE___CAN_MERGE_CONNECTIONS = ROOM___CAN_MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOUNGE___CAN_MERGE_CONTAINED_ASSETS = ROOM___CAN_MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOUNGE___MERGE_CONTAINED_ASSETS = ROOM___MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOUNGE___MERGE_CONNECTIONS__ELIST = ROOM___MERGE_CONNECTIONS__ELIST;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOUNGE___CAN_MERGE_CONNECTIONS__ELIST = ROOM___CAN_MERGE_CONNECTIONS__ELIST;

	/**
	 * The number of operations of the '<em>Lounge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOUNGE_OPERATION_COUNT = ROOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link environment.impl.DishWasherImpl <em>Dish Washer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.impl.DishWasherImpl
	 * @see environment.impl.cpsPackageImpl#getDishWasher()
	 * @generated
	 */
	int DISH_WASHER = 32;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISH_WASHER__CONNECTIONS = COMPUTING_DEVICE__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISH_WASHER__NAME = COMPUTING_DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISH_WASHER__PROPERTY = COMPUTING_DEVICE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISH_WASHER__VALUE = COMPUTING_DEVICE__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISH_WASHER__TYPE = COMPUTING_DEVICE__TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISH_WASHER__DESCRIPTION = COMPUTING_DEVICE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISH_WASHER__CONTROL = COMPUTING_DEVICE__CONTROL;

	/**
	 * The feature id for the '<em><b>Contained Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISH_WASHER__CONTAINED_ASSETS = COMPUTING_DEVICE__CONTAINED_ASSETS;

	/**
	 * The feature id for the '<em><b>Parent Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISH_WASHER__PARENT_ASSET = COMPUTING_DEVICE__PARENT_ASSET;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISH_WASHER__STATUS = COMPUTING_DEVICE__STATUS;

	/**
	 * The feature id for the '<em><b>Connectable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISH_WASHER__CONNECTABLE = COMPUTING_DEVICE__CONNECTABLE;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISH_WASHER__MODEL = COMPUTING_DEVICE__MODEL;

	/**
	 * The number of structural features of the '<em>Dish Washer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISH_WASHER_FEATURE_COUNT = COMPUTING_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Abstract Asset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISH_WASHER___ABSTRACT_ASSET = COMPUTING_DEVICE___ABSTRACT_ASSET;

	/**
	 * The operation id for the '<em>Similar To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISH_WASHER___SIMILAR_TO__ASSET = COMPUTING_DEVICE___SIMILAR_TO__ASSET;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISH_WASHER___MERGE_CONNECTIONS = COMPUTING_DEVICE___MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISH_WASHER___CAN_MERGE_CONNECTIONS = COMPUTING_DEVICE___CAN_MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISH_WASHER___CAN_MERGE_CONTAINED_ASSETS = COMPUTING_DEVICE___CAN_MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISH_WASHER___MERGE_CONTAINED_ASSETS = COMPUTING_DEVICE___MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISH_WASHER___MERGE_CONNECTIONS__ELIST = COMPUTING_DEVICE___MERGE_CONNECTIONS__ELIST;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISH_WASHER___CAN_MERGE_CONNECTIONS__ELIST = COMPUTING_DEVICE___CAN_MERGE_CONNECTIONS__ELIST;

	/**
	 * The number of operations of the '<em>Dish Washer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISH_WASHER_OPERATION_COUNT = COMPUTING_DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link environment.impl.CoffeeMachineImpl <em>Coffee Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.impl.CoffeeMachineImpl
	 * @see environment.impl.cpsPackageImpl#getCoffeeMachine()
	 * @generated
	 */
	int COFFEE_MACHINE = 33;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COFFEE_MACHINE__CONNECTIONS = COMPUTING_DEVICE__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COFFEE_MACHINE__NAME = COMPUTING_DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COFFEE_MACHINE__PROPERTY = COMPUTING_DEVICE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COFFEE_MACHINE__VALUE = COMPUTING_DEVICE__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COFFEE_MACHINE__TYPE = COMPUTING_DEVICE__TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COFFEE_MACHINE__DESCRIPTION = COMPUTING_DEVICE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COFFEE_MACHINE__CONTROL = COMPUTING_DEVICE__CONTROL;

	/**
	 * The feature id for the '<em><b>Contained Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COFFEE_MACHINE__CONTAINED_ASSETS = COMPUTING_DEVICE__CONTAINED_ASSETS;

	/**
	 * The feature id for the '<em><b>Parent Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COFFEE_MACHINE__PARENT_ASSET = COMPUTING_DEVICE__PARENT_ASSET;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COFFEE_MACHINE__STATUS = COMPUTING_DEVICE__STATUS;

	/**
	 * The feature id for the '<em><b>Connectable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COFFEE_MACHINE__CONNECTABLE = COMPUTING_DEVICE__CONNECTABLE;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COFFEE_MACHINE__MODEL = COMPUTING_DEVICE__MODEL;

	/**
	 * The number of structural features of the '<em>Coffee Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COFFEE_MACHINE_FEATURE_COUNT = COMPUTING_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Abstract Asset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COFFEE_MACHINE___ABSTRACT_ASSET = COMPUTING_DEVICE___ABSTRACT_ASSET;

	/**
	 * The operation id for the '<em>Similar To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COFFEE_MACHINE___SIMILAR_TO__ASSET = COMPUTING_DEVICE___SIMILAR_TO__ASSET;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COFFEE_MACHINE___MERGE_CONNECTIONS = COMPUTING_DEVICE___MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COFFEE_MACHINE___CAN_MERGE_CONNECTIONS = COMPUTING_DEVICE___CAN_MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COFFEE_MACHINE___CAN_MERGE_CONTAINED_ASSETS = COMPUTING_DEVICE___CAN_MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COFFEE_MACHINE___MERGE_CONTAINED_ASSETS = COMPUTING_DEVICE___MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COFFEE_MACHINE___MERGE_CONNECTIONS__ELIST = COMPUTING_DEVICE___MERGE_CONNECTIONS__ELIST;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COFFEE_MACHINE___CAN_MERGE_CONNECTIONS__ELIST = COMPUTING_DEVICE___CAN_MERGE_CONNECTIONS__ELIST;

	/**
	 * The number of operations of the '<em>Coffee Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COFFEE_MACHINE_OPERATION_COUNT = COMPUTING_DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link environment.impl.ElevatorImpl <em>Elevator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.impl.ElevatorImpl
	 * @see environment.impl.cpsPackageImpl#getElevator()
	 * @generated
	 */
	int ELEVATOR = 34;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR__CONNECTIONS = COMPUTING_DEVICE__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR__NAME = COMPUTING_DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR__PROPERTY = COMPUTING_DEVICE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR__VALUE = COMPUTING_DEVICE__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR__TYPE = COMPUTING_DEVICE__TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR__DESCRIPTION = COMPUTING_DEVICE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR__CONTROL = COMPUTING_DEVICE__CONTROL;

	/**
	 * The feature id for the '<em><b>Contained Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR__CONTAINED_ASSETS = COMPUTING_DEVICE__CONTAINED_ASSETS;

	/**
	 * The feature id for the '<em><b>Parent Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR__PARENT_ASSET = COMPUTING_DEVICE__PARENT_ASSET;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR__STATUS = COMPUTING_DEVICE__STATUS;

	/**
	 * The feature id for the '<em><b>Connectable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR__CONNECTABLE = COMPUTING_DEVICE__CONNECTABLE;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR__MODEL = COMPUTING_DEVICE__MODEL;

	/**
	 * The number of structural features of the '<em>Elevator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_FEATURE_COUNT = COMPUTING_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Abstract Asset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR___ABSTRACT_ASSET = COMPUTING_DEVICE___ABSTRACT_ASSET;

	/**
	 * The operation id for the '<em>Similar To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR___SIMILAR_TO__ASSET = COMPUTING_DEVICE___SIMILAR_TO__ASSET;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR___MERGE_CONNECTIONS = COMPUTING_DEVICE___MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR___CAN_MERGE_CONNECTIONS = COMPUTING_DEVICE___CAN_MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR___CAN_MERGE_CONTAINED_ASSETS = COMPUTING_DEVICE___CAN_MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR___MERGE_CONTAINED_ASSETS = COMPUTING_DEVICE___MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR___MERGE_CONNECTIONS__ELIST = COMPUTING_DEVICE___MERGE_CONNECTIONS__ELIST;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR___CAN_MERGE_CONNECTIONS__ELIST = COMPUTING_DEVICE___CAN_MERGE_CONNECTIONS__ELIST;

	/**
	 * The number of operations of the '<em>Elevator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR_OPERATION_COUNT = COMPUTING_DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link environment.impl.HallwayImpl <em>Hallway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.impl.HallwayImpl
	 * @see environment.impl.cpsPackageImpl#getHallway()
	 * @generated
	 */
	int HALLWAY = 35;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALLWAY__CONNECTIONS = PHYSICAL_STRUCTURE__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALLWAY__NAME = PHYSICAL_STRUCTURE__NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALLWAY__PROPERTY = PHYSICAL_STRUCTURE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALLWAY__VALUE = PHYSICAL_STRUCTURE__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALLWAY__TYPE = PHYSICAL_STRUCTURE__TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALLWAY__DESCRIPTION = PHYSICAL_STRUCTURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALLWAY__CONTROL = PHYSICAL_STRUCTURE__CONTROL;

	/**
	 * The feature id for the '<em><b>Contained Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALLWAY__CONTAINED_ASSETS = PHYSICAL_STRUCTURE__CONTAINED_ASSETS;

	/**
	 * The feature id for the '<em><b>Parent Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALLWAY__PARENT_ASSET = PHYSICAL_STRUCTURE__PARENT_ASSET;

	/**
	 * The number of structural features of the '<em>Hallway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALLWAY_FEATURE_COUNT = PHYSICAL_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Abstract Asset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALLWAY___ABSTRACT_ASSET = PHYSICAL_STRUCTURE___ABSTRACT_ASSET;

	/**
	 * The operation id for the '<em>Similar To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALLWAY___SIMILAR_TO__ASSET = PHYSICAL_STRUCTURE___SIMILAR_TO__ASSET;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALLWAY___MERGE_CONNECTIONS = PHYSICAL_STRUCTURE___MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALLWAY___CAN_MERGE_CONNECTIONS = PHYSICAL_STRUCTURE___CAN_MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALLWAY___CAN_MERGE_CONTAINED_ASSETS = PHYSICAL_STRUCTURE___CAN_MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALLWAY___MERGE_CONTAINED_ASSETS = PHYSICAL_STRUCTURE___MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALLWAY___MERGE_CONNECTIONS__ELIST = PHYSICAL_STRUCTURE___MERGE_CONNECTIONS__ELIST;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALLWAY___CAN_MERGE_CONNECTIONS__ELIST = PHYSICAL_STRUCTURE___CAN_MERGE_CONNECTIONS__ELIST;

	/**
	 * The number of operations of the '<em>Hallway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALLWAY_OPERATION_COUNT = PHYSICAL_STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link environment.impl.ElevatorsAreaImpl <em>Elevators Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.impl.ElevatorsAreaImpl
	 * @see environment.impl.cpsPackageImpl#getElevatorsArea()
	 * @generated
	 */
	int ELEVATORS_AREA = 36;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATORS_AREA__CONNECTIONS = ROOM__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATORS_AREA__NAME = ROOM__NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATORS_AREA__PROPERTY = ROOM__PROPERTY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATORS_AREA__VALUE = ROOM__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATORS_AREA__TYPE = ROOM__TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATORS_AREA__DESCRIPTION = ROOM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATORS_AREA__CONTROL = ROOM__CONTROL;

	/**
	 * The feature id for the '<em><b>Contained Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATORS_AREA__CONTAINED_ASSETS = ROOM__CONTAINED_ASSETS;

	/**
	 * The feature id for the '<em><b>Parent Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATORS_AREA__PARENT_ASSET = ROOM__PARENT_ASSET;

	/**
	 * The number of structural features of the '<em>Elevators Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATORS_AREA_FEATURE_COUNT = ROOM_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Abstract Asset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATORS_AREA___ABSTRACT_ASSET = ROOM___ABSTRACT_ASSET;

	/**
	 * The operation id for the '<em>Similar To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATORS_AREA___SIMILAR_TO__ASSET = ROOM___SIMILAR_TO__ASSET;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATORS_AREA___MERGE_CONNECTIONS = ROOM___MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATORS_AREA___CAN_MERGE_CONNECTIONS = ROOM___CAN_MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATORS_AREA___CAN_MERGE_CONTAINED_ASSETS = ROOM___CAN_MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATORS_AREA___MERGE_CONTAINED_ASSETS = ROOM___MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATORS_AREA___MERGE_CONNECTIONS__ELIST = ROOM___MERGE_CONNECTIONS__ELIST;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATORS_AREA___CAN_MERGE_CONNECTIONS__ELIST = ROOM___CAN_MERGE_CONNECTIONS__ELIST;

	/**
	 * The number of operations of the '<em>Elevators Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATORS_AREA_OPERATION_COUNT = ROOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link environment.impl.DigitalNetworkImpl <em>Digital Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.impl.DigitalNetworkImpl
	 * @see environment.impl.cpsPackageImpl#getDigitalNetwork()
	 * @generated
	 */
	int DIGITAL_NETWORK = 38;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_NETWORK__CONNECTIONS = DIGITAL_ASSET__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_NETWORK__NAME = DIGITAL_ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_NETWORK__PROPERTY = DIGITAL_ASSET__PROPERTY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_NETWORK__VALUE = DIGITAL_ASSET__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_NETWORK__TYPE = DIGITAL_ASSET__TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_NETWORK__DESCRIPTION = DIGITAL_ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_NETWORK__CONTROL = DIGITAL_ASSET__CONTROL;

	/**
	 * The feature id for the '<em><b>Parent Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_NETWORK__PARENT_ASSET = DIGITAL_ASSET__PARENT_ASSET;

	/**
	 * The feature id for the '<em><b>Contained Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_NETWORK__CONTAINED_ASSETS = DIGITAL_ASSET__CONTAINED_ASSETS;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_NETWORK__PROTOCOL = DIGITAL_ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Encryption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_NETWORK__ENCRYPTION = DIGITAL_ASSET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Digital Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_NETWORK_FEATURE_COUNT = DIGITAL_ASSET_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Abstract Asset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_NETWORK___ABSTRACT_ASSET = DIGITAL_ASSET___ABSTRACT_ASSET;

	/**
	 * The operation id for the '<em>Similar To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_NETWORK___SIMILAR_TO__ASSET = DIGITAL_ASSET___SIMILAR_TO__ASSET;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_NETWORK___MERGE_CONNECTIONS = DIGITAL_ASSET___MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_NETWORK___CAN_MERGE_CONNECTIONS = DIGITAL_ASSET___CAN_MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_NETWORK___CAN_MERGE_CONTAINED_ASSETS = DIGITAL_ASSET___CAN_MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_NETWORK___MERGE_CONTAINED_ASSETS = DIGITAL_ASSET___MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_NETWORK___MERGE_CONNECTIONS__ELIST = DIGITAL_ASSET___MERGE_CONNECTIONS__ELIST;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_NETWORK___CAN_MERGE_CONNECTIONS__ELIST = DIGITAL_ASSET___CAN_MERGE_CONNECTIONS__ELIST;

	/**
	 * The number of operations of the '<em>Digital Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_NETWORK_OPERATION_COUNT = DIGITAL_ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link environment.impl.IPNetworkImpl <em>IP Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.impl.IPNetworkImpl
	 * @see environment.impl.cpsPackageImpl#getIPNetwork()
	 * @generated
	 */
	int IP_NETWORK = 37;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_NETWORK__CONNECTIONS = DIGITAL_NETWORK__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_NETWORK__NAME = DIGITAL_NETWORK__NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_NETWORK__PROPERTY = DIGITAL_NETWORK__PROPERTY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_NETWORK__VALUE = DIGITAL_NETWORK__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_NETWORK__TYPE = DIGITAL_NETWORK__TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_NETWORK__DESCRIPTION = DIGITAL_NETWORK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_NETWORK__CONTROL = DIGITAL_NETWORK__CONTROL;

	/**
	 * The feature id for the '<em><b>Parent Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_NETWORK__PARENT_ASSET = DIGITAL_NETWORK__PARENT_ASSET;

	/**
	 * The feature id for the '<em><b>Contained Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_NETWORK__CONTAINED_ASSETS = DIGITAL_NETWORK__CONTAINED_ASSETS;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_NETWORK__PROTOCOL = DIGITAL_NETWORK__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Encryption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_NETWORK__ENCRYPTION = DIGITAL_NETWORK__ENCRYPTION;

	/**
	 * The number of structural features of the '<em>IP Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_NETWORK_FEATURE_COUNT = DIGITAL_NETWORK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Abstract Asset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_NETWORK___ABSTRACT_ASSET = DIGITAL_NETWORK___ABSTRACT_ASSET;

	/**
	 * The operation id for the '<em>Similar To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_NETWORK___SIMILAR_TO__ASSET = DIGITAL_NETWORK___SIMILAR_TO__ASSET;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_NETWORK___MERGE_CONNECTIONS = DIGITAL_NETWORK___MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_NETWORK___CAN_MERGE_CONNECTIONS = DIGITAL_NETWORK___CAN_MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_NETWORK___CAN_MERGE_CONTAINED_ASSETS = DIGITAL_NETWORK___CAN_MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_NETWORK___MERGE_CONTAINED_ASSETS = DIGITAL_NETWORK___MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_NETWORK___MERGE_CONNECTIONS__ELIST = DIGITAL_NETWORK___MERGE_CONNECTIONS__ELIST;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_NETWORK___CAN_MERGE_CONNECTIONS__ELIST = DIGITAL_NETWORK___CAN_MERGE_CONNECTIONS__ELIST;

	/**
	 * The number of operations of the '<em>IP Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_NETWORK_OPERATION_COUNT = DIGITAL_NETWORK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link environment.impl.BusNetworkImpl <em>Bus Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.impl.BusNetworkImpl
	 * @see environment.impl.cpsPackageImpl#getBusNetwork()
	 * @generated
	 */
	int BUS_NETWORK = 39;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_NETWORK__CONNECTIONS = DIGITAL_NETWORK__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_NETWORK__NAME = DIGITAL_NETWORK__NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_NETWORK__PROPERTY = DIGITAL_NETWORK__PROPERTY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_NETWORK__VALUE = DIGITAL_NETWORK__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_NETWORK__TYPE = DIGITAL_NETWORK__TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_NETWORK__DESCRIPTION = DIGITAL_NETWORK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_NETWORK__CONTROL = DIGITAL_NETWORK__CONTROL;

	/**
	 * The feature id for the '<em><b>Parent Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_NETWORK__PARENT_ASSET = DIGITAL_NETWORK__PARENT_ASSET;

	/**
	 * The feature id for the '<em><b>Contained Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_NETWORK__CONTAINED_ASSETS = DIGITAL_NETWORK__CONTAINED_ASSETS;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_NETWORK__PROTOCOL = DIGITAL_NETWORK__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Encryption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_NETWORK__ENCRYPTION = DIGITAL_NETWORK__ENCRYPTION;

	/**
	 * The number of structural features of the '<em>Bus Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_NETWORK_FEATURE_COUNT = DIGITAL_NETWORK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Abstract Asset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_NETWORK___ABSTRACT_ASSET = DIGITAL_NETWORK___ABSTRACT_ASSET;

	/**
	 * The operation id for the '<em>Similar To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_NETWORK___SIMILAR_TO__ASSET = DIGITAL_NETWORK___SIMILAR_TO__ASSET;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_NETWORK___MERGE_CONNECTIONS = DIGITAL_NETWORK___MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_NETWORK___CAN_MERGE_CONNECTIONS = DIGITAL_NETWORK___CAN_MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_NETWORK___CAN_MERGE_CONTAINED_ASSETS = DIGITAL_NETWORK___CAN_MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_NETWORK___MERGE_CONTAINED_ASSETS = DIGITAL_NETWORK___MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_NETWORK___MERGE_CONNECTIONS__ELIST = DIGITAL_NETWORK___MERGE_CONNECTIONS__ELIST;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_NETWORK___CAN_MERGE_CONNECTIONS__ELIST = DIGITAL_NETWORK___CAN_MERGE_CONNECTIONS__ELIST;

	/**
	 * The number of operations of the '<em>Bus Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_NETWORK_OPERATION_COUNT = DIGITAL_NETWORK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link environment.impl.IPConnectionImpl <em>IP Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.impl.IPConnectionImpl
	 * @see environment.impl.cpsPackageImpl#getIPConnection()
	 * @generated
	 */
	int IP_CONNECTION = 40;

	/**
	 * The feature id for the '<em><b>Asset1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_CONNECTION__ASSET1 = DIGITAL_CONNECTION__ASSET1;

	/**
	 * The feature id for the '<em><b>Asset2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_CONNECTION__ASSET2 = DIGITAL_CONNECTION__ASSET2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_CONNECTION__NAME = DIGITAL_CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_CONNECTION__CONSTRAINTS = DIGITAL_CONNECTION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Bidirectional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_CONNECTION__BIDIRECTIONAL = DIGITAL_CONNECTION__BIDIRECTIONAL;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_CONNECTION__PORT = DIGITAL_CONNECTION__PORT;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_CONNECTION__PROPERTIES = DIGITAL_CONNECTION__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_CONNECTION__DESCRIPTION = DIGITAL_CONNECTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_CONNECTION__TYPE = DIGITAL_CONNECTION__TYPE;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_CONNECTION__PROTOCOL = DIGITAL_CONNECTION__PROTOCOL;

	/**
	 * The number of structural features of the '<em>IP Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_CONNECTION_FEATURE_COUNT = DIGITAL_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Similar To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_CONNECTION___SIMILAR_TO__CONNECTION = DIGITAL_CONNECTION___SIMILAR_TO__CONNECTION;

	/**
	 * The number of operations of the '<em>IP Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_CONNECTION_OPERATION_COUNT = DIGITAL_CONNECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link environment.impl.BusConnectionImpl <em>Bus Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.impl.BusConnectionImpl
	 * @see environment.impl.cpsPackageImpl#getBusConnection()
	 * @generated
	 */
	int BUS_CONNECTION = 41;

	/**
	 * The feature id for the '<em><b>Asset1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTION__ASSET1 = DIGITAL_CONNECTION__ASSET1;

	/**
	 * The feature id for the '<em><b>Asset2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTION__ASSET2 = DIGITAL_CONNECTION__ASSET2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTION__NAME = DIGITAL_CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTION__CONSTRAINTS = DIGITAL_CONNECTION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Bidirectional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTION__BIDIRECTIONAL = DIGITAL_CONNECTION__BIDIRECTIONAL;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTION__PORT = DIGITAL_CONNECTION__PORT;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTION__PROPERTIES = DIGITAL_CONNECTION__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTION__DESCRIPTION = DIGITAL_CONNECTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTION__TYPE = DIGITAL_CONNECTION__TYPE;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTION__PROTOCOL = DIGITAL_CONNECTION__PROTOCOL;

	/**
	 * The number of structural features of the '<em>Bus Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTION_FEATURE_COUNT = DIGITAL_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Similar To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTION___SIMILAR_TO__CONNECTION = DIGITAL_CONNECTION___SIMILAR_TO__CONNECTION;

	/**
	 * The number of operations of the '<em>Bus Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_CONNECTION_OPERATION_COUNT = DIGITAL_CONNECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link environment.impl.KitchenImpl <em>Kitchen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.impl.KitchenImpl
	 * @see environment.impl.cpsPackageImpl#getKitchen()
	 * @generated
	 */
	int KITCHEN = 42;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN__CONNECTIONS = ROOM__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN__NAME = ROOM__NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN__PROPERTY = ROOM__PROPERTY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN__VALUE = ROOM__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN__TYPE = ROOM__TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN__DESCRIPTION = ROOM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN__CONTROL = ROOM__CONTROL;

	/**
	 * The feature id for the '<em><b>Contained Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN__CONTAINED_ASSETS = ROOM__CONTAINED_ASSETS;

	/**
	 * The feature id for the '<em><b>Parent Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN__PARENT_ASSET = ROOM__PARENT_ASSET;

	/**
	 * The number of structural features of the '<em>Kitchen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN_FEATURE_COUNT = ROOM_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Abstract Asset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN___ABSTRACT_ASSET = ROOM___ABSTRACT_ASSET;

	/**
	 * The operation id for the '<em>Similar To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN___SIMILAR_TO__ASSET = ROOM___SIMILAR_TO__ASSET;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN___MERGE_CONNECTIONS = ROOM___MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN___CAN_MERGE_CONNECTIONS = ROOM___CAN_MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN___CAN_MERGE_CONTAINED_ASSETS = ROOM___CAN_MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN___MERGE_CONTAINED_ASSETS = ROOM___MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN___MERGE_CONNECTIONS__ELIST = ROOM___MERGE_CONNECTIONS__ELIST;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN___CAN_MERGE_CONNECTIONS__ELIST = ROOM___CAN_MERGE_CONNECTIONS__ELIST;

	/**
	 * The number of operations of the '<em>Kitchen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN_OPERATION_COUNT = ROOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link environment.impl.StairsImpl <em>Stairs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.impl.StairsImpl
	 * @see environment.impl.cpsPackageImpl#getStairs()
	 * @generated
	 */
	int STAIRS = 43;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAIRS__CONNECTIONS = PHYSICAL_STRUCTURE__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAIRS__NAME = PHYSICAL_STRUCTURE__NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAIRS__PROPERTY = PHYSICAL_STRUCTURE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAIRS__VALUE = PHYSICAL_STRUCTURE__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAIRS__TYPE = PHYSICAL_STRUCTURE__TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAIRS__DESCRIPTION = PHYSICAL_STRUCTURE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAIRS__CONTROL = PHYSICAL_STRUCTURE__CONTROL;

	/**
	 * The feature id for the '<em><b>Contained Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAIRS__CONTAINED_ASSETS = PHYSICAL_STRUCTURE__CONTAINED_ASSETS;

	/**
	 * The feature id for the '<em><b>Parent Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAIRS__PARENT_ASSET = PHYSICAL_STRUCTURE__PARENT_ASSET;

	/**
	 * The number of structural features of the '<em>Stairs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAIRS_FEATURE_COUNT = PHYSICAL_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Abstract Asset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAIRS___ABSTRACT_ASSET = PHYSICAL_STRUCTURE___ABSTRACT_ASSET;

	/**
	 * The operation id for the '<em>Similar To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAIRS___SIMILAR_TO__ASSET = PHYSICAL_STRUCTURE___SIMILAR_TO__ASSET;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAIRS___MERGE_CONNECTIONS = PHYSICAL_STRUCTURE___MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAIRS___CAN_MERGE_CONNECTIONS = PHYSICAL_STRUCTURE___CAN_MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAIRS___CAN_MERGE_CONTAINED_ASSETS = PHYSICAL_STRUCTURE___CAN_MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAIRS___MERGE_CONTAINED_ASSETS = PHYSICAL_STRUCTURE___MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAIRS___MERGE_CONNECTIONS__ELIST = PHYSICAL_STRUCTURE___MERGE_CONNECTIONS__ELIST;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAIRS___CAN_MERGE_CONNECTIONS__ELIST = PHYSICAL_STRUCTURE___CAN_MERGE_CONNECTIONS__ELIST;

	/**
	 * The number of operations of the '<em>Stairs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAIRS_OPERATION_COUNT = PHYSICAL_STRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link environment.impl.CardReaderImpl <em>Card Reader</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.impl.CardReaderImpl
	 * @see environment.impl.cpsPackageImpl#getCardReader()
	 * @generated
	 */
	int CARD_READER = 44;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_READER__CONNECTIONS = COMPUTING_DEVICE__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_READER__NAME = COMPUTING_DEVICE__NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_READER__PROPERTY = COMPUTING_DEVICE__PROPERTY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_READER__VALUE = COMPUTING_DEVICE__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_READER__TYPE = COMPUTING_DEVICE__TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_READER__DESCRIPTION = COMPUTING_DEVICE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_READER__CONTROL = COMPUTING_DEVICE__CONTROL;

	/**
	 * The feature id for the '<em><b>Contained Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_READER__CONTAINED_ASSETS = COMPUTING_DEVICE__CONTAINED_ASSETS;

	/**
	 * The feature id for the '<em><b>Parent Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_READER__PARENT_ASSET = COMPUTING_DEVICE__PARENT_ASSET;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_READER__STATUS = COMPUTING_DEVICE__STATUS;

	/**
	 * The feature id for the '<em><b>Connectable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_READER__CONNECTABLE = COMPUTING_DEVICE__CONNECTABLE;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_READER__MODEL = COMPUTING_DEVICE__MODEL;

	/**
	 * The number of structural features of the '<em>Card Reader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_READER_FEATURE_COUNT = COMPUTING_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Abstract Asset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_READER___ABSTRACT_ASSET = COMPUTING_DEVICE___ABSTRACT_ASSET;

	/**
	 * The operation id for the '<em>Similar To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_READER___SIMILAR_TO__ASSET = COMPUTING_DEVICE___SIMILAR_TO__ASSET;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_READER___MERGE_CONNECTIONS = COMPUTING_DEVICE___MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_READER___CAN_MERGE_CONNECTIONS = COMPUTING_DEVICE___CAN_MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_READER___CAN_MERGE_CONTAINED_ASSETS = COMPUTING_DEVICE___CAN_MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_READER___MERGE_CONTAINED_ASSETS = COMPUTING_DEVICE___MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_READER___MERGE_CONNECTIONS__ELIST = COMPUTING_DEVICE___MERGE_CONNECTIONS__ELIST;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_READER___CAN_MERGE_CONNECTIONS__ELIST = COMPUTING_DEVICE___CAN_MERGE_CONNECTIONS__ELIST;

	/**
	 * The number of operations of the '<em>Card Reader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_READER_OPERATION_COUNT = COMPUTING_DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link environment.impl.EmployeeImpl <em>Employee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.impl.EmployeeImpl
	 * @see environment.impl.cpsPackageImpl#getEmployee()
	 * @generated
	 */
	int EMPLOYEE = 45;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__CONNECTIONS = ACTOR__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__NAME = ACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__PROPERTY = ACTOR__PROPERTY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__VALUE = ACTOR__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__TYPE = ACTOR__TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__DESCRIPTION = ACTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__CONTROL = ACTOR__CONTROL;

	/**
	 * The feature id for the '<em><b>Contained Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__CONTAINED_ASSETS = ACTOR__CONTAINED_ASSETS;

	/**
	 * The feature id for the '<em><b>Parent Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__PARENT_ASSET = ACTOR__PARENT_ASSET;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__ROLE = ACTOR__ROLE;

	/**
	 * The number of structural features of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_FEATURE_COUNT = ACTOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Abstract Asset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE___ABSTRACT_ASSET = ACTOR___ABSTRACT_ASSET;

	/**
	 * The operation id for the '<em>Similar To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE___SIMILAR_TO__ASSET = ACTOR___SIMILAR_TO__ASSET;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE___MERGE_CONNECTIONS = ACTOR___MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE___CAN_MERGE_CONNECTIONS = ACTOR___CAN_MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE___CAN_MERGE_CONTAINED_ASSETS = ACTOR___CAN_MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE___MERGE_CONTAINED_ASSETS = ACTOR___MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE___MERGE_CONNECTIONS__ELIST = ACTOR___MERGE_CONNECTIONS__ELIST;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE___CAN_MERGE_CONNECTIONS__ELIST = ACTOR___CAN_MERGE_CONNECTIONS__ELIST;

	/**
	 * The number of operations of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_OPERATION_COUNT = ACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link environment.impl.VisitorImpl <em>Visitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.impl.VisitorImpl
	 * @see environment.impl.cpsPackageImpl#getVisitor()
	 * @generated
	 */
	int VISITOR = 46;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISITOR__CONNECTIONS = ACTOR__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISITOR__NAME = ACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISITOR__PROPERTY = ACTOR__PROPERTY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISITOR__VALUE = ACTOR__VALUE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISITOR__TYPE = ACTOR__TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISITOR__DESCRIPTION = ACTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISITOR__CONTROL = ACTOR__CONTROL;

	/**
	 * The feature id for the '<em><b>Contained Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISITOR__CONTAINED_ASSETS = ACTOR__CONTAINED_ASSETS;

	/**
	 * The feature id for the '<em><b>Parent Asset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISITOR__PARENT_ASSET = ACTOR__PARENT_ASSET;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISITOR__ROLE = ACTOR__ROLE;

	/**
	 * The number of structural features of the '<em>Visitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISITOR_FEATURE_COUNT = ACTOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Abstract Asset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISITOR___ABSTRACT_ASSET = ACTOR___ABSTRACT_ASSET;

	/**
	 * The operation id for the '<em>Similar To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISITOR___SIMILAR_TO__ASSET = ACTOR___SIMILAR_TO__ASSET;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISITOR___MERGE_CONNECTIONS = ACTOR___MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISITOR___CAN_MERGE_CONNECTIONS = ACTOR___CAN_MERGE_CONNECTIONS;

	/**
	 * The operation id for the '<em>Can Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISITOR___CAN_MERGE_CONTAINED_ASSETS = ACTOR___CAN_MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Contained Assets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISITOR___MERGE_CONTAINED_ASSETS = ACTOR___MERGE_CONTAINED_ASSETS;

	/**
	 * The operation id for the '<em>Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISITOR___MERGE_CONNECTIONS__ELIST = ACTOR___MERGE_CONNECTIONS__ELIST;

	/**
	 * The operation id for the '<em>Can Merge Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISITOR___CAN_MERGE_CONNECTIONS__ELIST = ACTOR___CAN_MERGE_CONNECTIONS__ELIST;

	/**
	 * The number of operations of the '<em>Visitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISITOR_OPERATION_COUNT = ACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link environment.Status <em>Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.Status
	 * @see environment.impl.cpsPackageImpl#getStatus()
	 * @generated
	 */
	int STATUS = 47;

	/**
	 * The meta object id for the '{@link environment.ProcessStatus <em>Process Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.ProcessStatus
	 * @see environment.impl.cpsPackageImpl#getProcessStatus()
	 * @generated
	 */
	int PROCESS_STATUS = 48;

	/**
	 * The meta object id for the '{@link environment.FileStatus <em>File Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.FileStatus
	 * @see environment.impl.cpsPackageImpl#getFileStatus()
	 * @generated
	 */
	int FILE_STATUS = 49;

	/**
	 * The meta object id for the '{@link environment.CredentialType <em>Credential Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.CredentialType
	 * @see environment.impl.cpsPackageImpl#getCredentialType()
	 * @generated
	 */
	int CREDENTIAL_TYPE = 50;


	/**
	 * Returns the meta object for class '{@link environment.PhysicalAsset <em>Physical Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Asset</em>'.
	 * @see environment.PhysicalAsset
	 * @generated
	 */
	EClass getPhysicalAsset();

	/**
	 * Returns the meta object for the reference list '{@link environment.PhysicalAsset#getContainedAssets <em>Contained Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contained Assets</em>'.
	 * @see environment.PhysicalAsset#getContainedAssets()
	 * @see #getPhysicalAsset()
	 * @generated
	 */
	EReference getPhysicalAsset_ContainedAssets();

	/**
	 * Returns the meta object for the reference '{@link environment.PhysicalAsset#getParentAsset <em>Parent Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Asset</em>'.
	 * @see environment.PhysicalAsset#getParentAsset()
	 * @see #getPhysicalAsset()
	 * @generated
	 */
	EReference getPhysicalAsset_ParentAsset();

	/**
	 * Returns the meta object for class '{@link environment.ComputingDevice <em>Computing Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computing Device</em>'.
	 * @see environment.ComputingDevice
	 * @generated
	 */
	EClass getComputingDevice();

	/**
	 * Returns the meta object for the attribute '{@link environment.ComputingDevice#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see environment.ComputingDevice#getStatus()
	 * @see #getComputingDevice()
	 * @generated
	 */
	EAttribute getComputingDevice_Status();

	/**
	 * Returns the meta object for the attribute '{@link environment.ComputingDevice#isConnectable <em>Connectable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connectable</em>'.
	 * @see environment.ComputingDevice#isConnectable()
	 * @see #getComputingDevice()
	 * @generated
	 */
	EAttribute getComputingDevice_Connectable();

	/**
	 * Returns the meta object for the attribute '{@link environment.ComputingDevice#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see environment.ComputingDevice#getModel()
	 * @see #getComputingDevice()
	 * @generated
	 */
	EAttribute getComputingDevice_Model();

	/**
	 * Returns the meta object for class '{@link environment.HVAC <em>HVAC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HVAC</em>'.
	 * @see environment.HVAC
	 * @generated
	 */
	EClass getHVAC();

	/**
	 * Returns the meta object for class '{@link environment.SmartLight <em>Smart Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Smart Light</em>'.
	 * @see environment.SmartLight
	 * @generated
	 */
	EClass getSmartLight();

	/**
	 * Returns the meta object for class '{@link environment.Laptop <em>Laptop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Laptop</em>'.
	 * @see environment.Laptop
	 * @generated
	 */
	EClass getLaptop();

	/**
	 * Returns the meta object for class '{@link environment.Desktop <em>Desktop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Desktop</em>'.
	 * @see environment.Desktop
	 * @generated
	 */
	EClass getDesktop();

	/**
	 * Returns the meta object for class '{@link environment.CCTV <em>CCTV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CCTV</em>'.
	 * @see environment.CCTV
	 * @generated
	 */
	EClass getCCTV();

	/**
	 * Returns the meta object for class '{@link environment.Server <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server</em>'.
	 * @see environment.Server
	 * @generated
	 */
	EClass getServer();

	/**
	 * Returns the meta object for class '{@link environment.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see environment.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the attribute '{@link environment.File#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see environment.File#getStatus()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Status();

	/**
	 * Returns the meta object for the attribute '{@link environment.File#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see environment.File#getUrl()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Url();

	/**
	 * Returns the meta object for class '{@link environment.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see environment.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for the attribute '{@link environment.Process#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see environment.Process#getStatus()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_Status();

	/**
	 * Returns the meta object for class '{@link environment.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see environment.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the attribute '{@link environment.Application#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see environment.Application#getStatus()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Status();

	/**
	 * Returns the meta object for the attribute '{@link environment.Application#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see environment.Application#getUrl()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Url();

	/**
	 * Returns the meta object for class '{@link environment.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see environment.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the reference '{@link environment.Connection#getAsset1 <em>Asset1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asset1</em>'.
	 * @see environment.Connection#getAsset1()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Asset1();

	/**
	 * Returns the meta object for the reference '{@link environment.Connection#getAsset2 <em>Asset2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asset2</em>'.
	 * @see environment.Connection#getAsset2()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Asset2();

	/**
	 * Returns the meta object for the attribute '{@link environment.Connection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see environment.Connection#getName()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Name();

	/**
	 * Returns the meta object for the attribute list '{@link environment.Connection#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Constraints</em>'.
	 * @see environment.Connection#getConstraints()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Constraints();

	/**
	 * Returns the meta object for the attribute '{@link environment.Connection#isBidirectional <em>Bidirectional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bidirectional</em>'.
	 * @see environment.Connection#isBidirectional()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Bidirectional();

	/**
	 * Returns the meta object for the containment reference '{@link environment.Connection#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Port</em>'.
	 * @see environment.Connection#getPort()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Port();

	/**
	 * Returns the meta object for the reference list '{@link environment.Connection#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Properties</em>'.
	 * @see environment.Connection#getProperties()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Properties();

	/**
	 * Returns the meta object for the attribute '{@link environment.Connection#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see environment.Connection#getDescription()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Description();

	/**
	 * Returns the meta object for the containment reference '{@link environment.Connection#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see environment.Connection#getType()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Type();

	/**
	 * Returns the meta object for the '{@link environment.Connection#similarTo(environment.Connection) <em>Similar To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Similar To</em>' operation.
	 * @see environment.Connection#similarTo(environment.Connection)
	 * @generated
	 */
	EOperation getConnection__SimilarTo__Connection();

	/**
	 * Returns the meta object for class '{@link environment.DigitalConnection <em>Digital Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Digital Connection</em>'.
	 * @see environment.DigitalConnection
	 * @generated
	 */
	EClass getDigitalConnection();

	/**
	 * Returns the meta object for the attribute '{@link environment.DigitalConnection#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see environment.DigitalConnection#getProtocol()
	 * @see #getDigitalConnection()
	 * @generated
	 */
	EAttribute getDigitalConnection_Protocol();

	/**
	 * Returns the meta object for class '{@link environment.PhysicalConnection <em>Physical Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Connection</em>'.
	 * @see environment.PhysicalConnection
	 * @generated
	 */
	EClass getPhysicalConnection();

	/**
	 * Returns the meta object for class '{@link environment.Asset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset</em>'.
	 * @see environment.Asset
	 * @generated
	 */
	EClass getAsset();

	/**
	 * Returns the meta object for the reference list '{@link environment.Asset#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connections</em>'.
	 * @see environment.Asset#getConnections()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_Connections();

	/**
	 * Returns the meta object for the attribute '{@link environment.Asset#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see environment.Asset#getName()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link environment.Asset#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see environment.Asset#getProperty()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_Property();

	/**
	 * Returns the meta object for the attribute '{@link environment.Asset#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see environment.Asset#getValue()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_Value();

	/**
	 * Returns the meta object for the containment reference '{@link environment.Asset#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see environment.Asset#getType()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_Type();

	/**
	 * Returns the meta object for the attribute '{@link environment.Asset#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see environment.Asset#getDescription()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_Description();

	/**
	 * Returns the meta object for the attribute '{@link environment.Asset#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control</em>'.
	 * @see environment.Asset#getControl()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_Control();

	/**
	 * Returns the meta object for the '{@link environment.Asset#abstractAsset() <em>Abstract Asset</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Abstract Asset</em>' operation.
	 * @see environment.Asset#abstractAsset()
	 * @generated
	 */
	EOperation getAsset__AbstractAsset();

	/**
	 * Returns the meta object for the '{@link environment.Asset#similarTo(environment.Asset) <em>Similar To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Similar To</em>' operation.
	 * @see environment.Asset#similarTo(environment.Asset)
	 * @generated
	 */
	EOperation getAsset__SimilarTo__Asset();

	/**
	 * Returns the meta object for the '{@link environment.Asset#mergeConnections() <em>Merge Connections</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Merge Connections</em>' operation.
	 * @see environment.Asset#mergeConnections()
	 * @generated
	 */
	EOperation getAsset__MergeConnections();

	/**
	 * Returns the meta object for the '{@link environment.Asset#canMergeConnections() <em>Can Merge Connections</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Merge Connections</em>' operation.
	 * @see environment.Asset#canMergeConnections()
	 * @generated
	 */
	EOperation getAsset__CanMergeConnections();

	/**
	 * Returns the meta object for the '{@link environment.Asset#canMergeContainedAssets() <em>Can Merge Contained Assets</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Merge Contained Assets</em>' operation.
	 * @see environment.Asset#canMergeContainedAssets()
	 * @generated
	 */
	EOperation getAsset__CanMergeContainedAssets();

	/**
	 * Returns the meta object for the '{@link environment.Asset#mergeContainedAssets() <em>Merge Contained Assets</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Merge Contained Assets</em>' operation.
	 * @see environment.Asset#mergeContainedAssets()
	 * @generated
	 */
	EOperation getAsset__MergeContainedAssets();

	/**
	 * Returns the meta object for the '{@link environment.Asset#mergeConnections(org.eclipse.emf.common.util.EList) <em>Merge Connections</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Merge Connections</em>' operation.
	 * @see environment.Asset#mergeConnections(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getAsset__MergeConnections__EList();

	/**
	 * Returns the meta object for the '{@link environment.Asset#canMergeConnections(org.eclipse.emf.common.util.EList) <em>Can Merge Connections</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Merge Connections</em>' operation.
	 * @see environment.Asset#canMergeConnections(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getAsset__CanMergeConnections__EList();

	/**
	 * Returns the meta object for class '{@link environment.EnvironmentDiagram <em>Environment Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment Diagram</em>'.
	 * @see environment.EnvironmentDiagram
	 * @generated
	 */
	EClass getEnvironmentDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link environment.EnvironmentDiagram#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Asset</em>'.
	 * @see environment.EnvironmentDiagram#getAsset()
	 * @see #getEnvironmentDiagram()
	 * @generated
	 */
	EReference getEnvironmentDiagram_Asset();

	/**
	 * Returns the meta object for the containment reference list '{@link environment.EnvironmentDiagram#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection</em>'.
	 * @see environment.EnvironmentDiagram#getConnection()
	 * @see #getEnvironmentDiagram()
	 * @generated
	 */
	EReference getEnvironmentDiagram_Connection();

	/**
	 * Returns the meta object for the containment reference list '{@link environment.EnvironmentDiagram#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port</em>'.
	 * @see environment.EnvironmentDiagram#getPort()
	 * @see #getEnvironmentDiagram()
	 * @generated
	 */
	EReference getEnvironmentDiagram_Port();

	/**
	 * Returns the meta object for the containment reference list '{@link environment.EnvironmentDiagram#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see environment.EnvironmentDiagram#getProperty()
	 * @see #getEnvironmentDiagram()
	 * @generated
	 */
	EReference getEnvironmentDiagram_Property();

	/**
	 * Returns the meta object for the containment reference list '{@link environment.EnvironmentDiagram#getCredential <em>Credential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Credential</em>'.
	 * @see environment.EnvironmentDiagram#getCredential()
	 * @see #getEnvironmentDiagram()
	 * @generated
	 */
	EReference getEnvironmentDiagram_Credential();

	/**
	 * Returns the meta object for the containment reference list '{@link environment.EnvironmentDiagram#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule</em>'.
	 * @see environment.EnvironmentDiagram#getRule()
	 * @see #getEnvironmentDiagram()
	 * @generated
	 */
	EReference getEnvironmentDiagram_Rule();

	/**
	 * Returns the meta object for class '{@link environment.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see environment.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the reference '{@link environment.Port#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asset</em>'.
	 * @see environment.Port#getAsset()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Asset();

	/**
	 * Returns the meta object for the attribute '{@link environment.Port#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see environment.Port#getName()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link environment.Port#getCredential <em>Credential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Credential</em>'.
	 * @see environment.Port#getCredential()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Credential();

	/**
	 * Returns the meta object for the attribute '{@link environment.Port#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see environment.Port#getDescription()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Description();

	/**
	 * Returns the meta object for class '{@link environment.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see environment.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link environment.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see environment.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link environment.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see environment.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Value();

	/**
	 * Returns the meta object for the attribute '{@link environment.Property#isAbstractable <em>Abstractable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstractable</em>'.
	 * @see environment.Property#isAbstractable()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Abstractable();

	/**
	 * Returns the meta object for class '{@link environment.Credential <em>Credential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Credential</em>'.
	 * @see environment.Credential
	 * @generated
	 */
	EClass getCredential();

	/**
	 * Returns the meta object for the attribute '{@link environment.Credential#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see environment.Credential#getType()
	 * @see #getCredential()
	 * @generated
	 */
	EAttribute getCredential_Type();

	/**
	 * Returns the meta object for the attribute '{@link environment.Credential#getOther <em>Other</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Other</em>'.
	 * @see environment.Credential#getOther()
	 * @see #getCredential()
	 * @generated
	 */
	EAttribute getCredential_Other();

	/**
	 * Returns the meta object for class '{@link environment.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see environment.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the attribute '{@link environment.Actor#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see environment.Actor#getRole()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Role();

	/**
	 * Returns the meta object for class '{@link environment.PhysicalStructure <em>Physical Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Structure</em>'.
	 * @see environment.PhysicalStructure
	 * @generated
	 */
	EClass getPhysicalStructure();

	/**
	 * Returns the meta object for class '{@link environment.DigitalAsset <em>Digital Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Digital Asset</em>'.
	 * @see environment.DigitalAsset
	 * @generated
	 */
	EClass getDigitalAsset();

	/**
	 * Returns the meta object for the reference '{@link environment.DigitalAsset#getParentAsset <em>Parent Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Asset</em>'.
	 * @see environment.DigitalAsset#getParentAsset()
	 * @see #getDigitalAsset()
	 * @generated
	 */
	EReference getDigitalAsset_ParentAsset();

	/**
	 * Returns the meta object for the reference list '{@link environment.DigitalAsset#getContainedAssets <em>Contained Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contained Assets</em>'.
	 * @see environment.DigitalAsset#getContainedAssets()
	 * @see #getDigitalAsset()
	 * @generated
	 */
	EReference getDigitalAsset_ContainedAssets();

	/**
	 * Returns the meta object for class '{@link environment.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see environment.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link environment.Action#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see environment.Action#getName()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Name();

	/**
	 * Returns the meta object for the attribute list '{@link environment.Action#getPreconditions <em>Preconditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Preconditions</em>'.
	 * @see environment.Action#getPreconditions()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Preconditions();

	/**
	 * Returns the meta object for the attribute list '{@link environment.Action#getPostconditions <em>Postconditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Postconditions</em>'.
	 * @see environment.Action#getPostconditions()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Postconditions();

	/**
	 * Returns the meta object for the attribute '{@link environment.Action#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see environment.Action#getDescription()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Description();

	/**
	 * Returns the meta object for class '{@link environment.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see environment.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the attribute '{@link environment.Type#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see environment.Type#getName()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Name();

	/**
	 * Returns the meta object for the containment reference '{@link environment.Type#getSuperType <em>Super Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Super Type</em>'.
	 * @see environment.Type#getSuperType()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_SuperType();

	/**
	 * Returns the meta object for class '{@link environment.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see environment.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for class '{@link environment.Floor <em>Floor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Floor</em>'.
	 * @see environment.Floor
	 * @generated
	 */
	EClass getFloor();

	/**
	 * Returns the meta object for class '{@link environment.Building <em>Building</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Building</em>'.
	 * @see environment.Building
	 * @generated
	 */
	EClass getBuilding();

	/**
	 * Returns the meta object for class '{@link environment.FireAlarm <em>Fire Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fire Alarm</em>'.
	 * @see environment.FireAlarm
	 * @generated
	 */
	EClass getFireAlarm();

	/**
	 * Returns the meta object for class '{@link environment.Workstation <em>Workstation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workstation</em>'.
	 * @see environment.Workstation
	 * @generated
	 */
	EClass getWorkstation();

	/**
	 * Returns the meta object for class '{@link environment.Lab <em>Lab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lab</em>'.
	 * @see environment.Lab
	 * @generated
	 */
	EClass getLab();

	/**
	 * Returns the meta object for class '{@link environment.Toilet <em>Toilet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Toilet</em>'.
	 * @see environment.Toilet
	 * @generated
	 */
	EClass getToilet();

	/**
	 * Returns the meta object for class '{@link environment.Lounge <em>Lounge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lounge</em>'.
	 * @see environment.Lounge
	 * @generated
	 */
	EClass getLounge();

	/**
	 * Returns the meta object for class '{@link environment.DishWasher <em>Dish Washer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dish Washer</em>'.
	 * @see environment.DishWasher
	 * @generated
	 */
	EClass getDishWasher();

	/**
	 * Returns the meta object for class '{@link environment.CoffeeMachine <em>Coffee Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coffee Machine</em>'.
	 * @see environment.CoffeeMachine
	 * @generated
	 */
	EClass getCoffeeMachine();

	/**
	 * Returns the meta object for class '{@link environment.Elevator <em>Elevator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elevator</em>'.
	 * @see environment.Elevator
	 * @generated
	 */
	EClass getElevator();

	/**
	 * Returns the meta object for class '{@link environment.Hallway <em>Hallway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hallway</em>'.
	 * @see environment.Hallway
	 * @generated
	 */
	EClass getHallway();

	/**
	 * Returns the meta object for class '{@link environment.ElevatorsArea <em>Elevators Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elevators Area</em>'.
	 * @see environment.ElevatorsArea
	 * @generated
	 */
	EClass getElevatorsArea();

	/**
	 * Returns the meta object for class '{@link environment.IPNetwork <em>IP Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IP Network</em>'.
	 * @see environment.IPNetwork
	 * @generated
	 */
	EClass getIPNetwork();

	/**
	 * Returns the meta object for class '{@link environment.DigitalNetwork <em>Digital Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Digital Network</em>'.
	 * @see environment.DigitalNetwork
	 * @generated
	 */
	EClass getDigitalNetwork();

	/**
	 * Returns the meta object for the attribute '{@link environment.DigitalNetwork#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see environment.DigitalNetwork#getProtocol()
	 * @see #getDigitalNetwork()
	 * @generated
	 */
	EAttribute getDigitalNetwork_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link environment.DigitalNetwork#getEncryption <em>Encryption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encryption</em>'.
	 * @see environment.DigitalNetwork#getEncryption()
	 * @see #getDigitalNetwork()
	 * @generated
	 */
	EAttribute getDigitalNetwork_Encryption();

	/**
	 * Returns the meta object for class '{@link environment.BusNetwork <em>Bus Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus Network</em>'.
	 * @see environment.BusNetwork
	 * @generated
	 */
	EClass getBusNetwork();

	/**
	 * Returns the meta object for class '{@link environment.IPConnection <em>IP Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IP Connection</em>'.
	 * @see environment.IPConnection
	 * @generated
	 */
	EClass getIPConnection();

	/**
	 * Returns the meta object for class '{@link environment.BusConnection <em>Bus Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus Connection</em>'.
	 * @see environment.BusConnection
	 * @generated
	 */
	EClass getBusConnection();

	/**
	 * Returns the meta object for class '{@link environment.Kitchen <em>Kitchen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kitchen</em>'.
	 * @see environment.Kitchen
	 * @generated
	 */
	EClass getKitchen();

	/**
	 * Returns the meta object for class '{@link environment.Stairs <em>Stairs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stairs</em>'.
	 * @see environment.Stairs
	 * @generated
	 */
	EClass getStairs();

	/**
	 * Returns the meta object for class '{@link environment.CardReader <em>Card Reader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Card Reader</em>'.
	 * @see environment.CardReader
	 * @generated
	 */
	EClass getCardReader();

	/**
	 * Returns the meta object for class '{@link environment.Employee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employee</em>'.
	 * @see environment.Employee
	 * @generated
	 */
	EClass getEmployee();

	/**
	 * Returns the meta object for class '{@link environment.Visitor <em>Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visitor</em>'.
	 * @see environment.Visitor
	 * @generated
	 */
	EClass getVisitor();

	/**
	 * Returns the meta object for enum '{@link environment.Status <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status</em>'.
	 * @see environment.Status
	 * @generated
	 */
	EEnum getStatus();

	/**
	 * Returns the meta object for enum '{@link environment.ProcessStatus <em>Process Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Process Status</em>'.
	 * @see environment.ProcessStatus
	 * @generated
	 */
	EEnum getProcessStatus();

	/**
	 * Returns the meta object for enum '{@link environment.FileStatus <em>File Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>File Status</em>'.
	 * @see environment.FileStatus
	 * @generated
	 */
	EEnum getFileStatus();

	/**
	 * Returns the meta object for enum '{@link environment.CredentialType <em>Credential Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Credential Type</em>'.
	 * @see environment.CredentialType
	 * @generated
	 */
	EEnum getCredentialType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	cpsFactory getcpsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link environment.impl.PhysicalAssetImpl <em>Physical Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.PhysicalAssetImpl
		 * @see environment.impl.cpsPackageImpl#getPhysicalAsset()
		 * @generated
		 */
		EClass PHYSICAL_ASSET = eINSTANCE.getPhysicalAsset();

		/**
		 * The meta object literal for the '<em><b>Contained Assets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_ASSET__CONTAINED_ASSETS = eINSTANCE.getPhysicalAsset_ContainedAssets();

		/**
		 * The meta object literal for the '<em><b>Parent Asset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_ASSET__PARENT_ASSET = eINSTANCE.getPhysicalAsset_ParentAsset();

		/**
		 * The meta object literal for the '{@link environment.impl.ComputingDeviceImpl <em>Computing Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.ComputingDeviceImpl
		 * @see environment.impl.cpsPackageImpl#getComputingDevice()
		 * @generated
		 */
		EClass COMPUTING_DEVICE = eINSTANCE.getComputingDevice();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTING_DEVICE__STATUS = eINSTANCE.getComputingDevice_Status();

		/**
		 * The meta object literal for the '<em><b>Connectable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTING_DEVICE__CONNECTABLE = eINSTANCE.getComputingDevice_Connectable();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTING_DEVICE__MODEL = eINSTANCE.getComputingDevice_Model();

		/**
		 * The meta object literal for the '{@link environment.impl.HVACImpl <em>HVAC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.HVACImpl
		 * @see environment.impl.cpsPackageImpl#getHVAC()
		 * @generated
		 */
		EClass HVAC = eINSTANCE.getHVAC();

		/**
		 * The meta object literal for the '{@link environment.impl.SmartLightImpl <em>Smart Light</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.SmartLightImpl
		 * @see environment.impl.cpsPackageImpl#getSmartLight()
		 * @generated
		 */
		EClass SMART_LIGHT = eINSTANCE.getSmartLight();

		/**
		 * The meta object literal for the '{@link environment.impl.LaptopImpl <em>Laptop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.LaptopImpl
		 * @see environment.impl.cpsPackageImpl#getLaptop()
		 * @generated
		 */
		EClass LAPTOP = eINSTANCE.getLaptop();

		/**
		 * The meta object literal for the '{@link environment.impl.DesktopImpl <em>Desktop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.DesktopImpl
		 * @see environment.impl.cpsPackageImpl#getDesktop()
		 * @generated
		 */
		EClass DESKTOP = eINSTANCE.getDesktop();

		/**
		 * The meta object literal for the '{@link environment.impl.CCTVImpl <em>CCTV</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.CCTVImpl
		 * @see environment.impl.cpsPackageImpl#getCCTV()
		 * @generated
		 */
		EClass CCTV = eINSTANCE.getCCTV();

		/**
		 * The meta object literal for the '{@link environment.impl.ServerImpl <em>Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.ServerImpl
		 * @see environment.impl.cpsPackageImpl#getServer()
		 * @generated
		 */
		EClass SERVER = eINSTANCE.getServer();

		/**
		 * The meta object literal for the '{@link environment.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.FileImpl
		 * @see environment.impl.cpsPackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__STATUS = eINSTANCE.getFile_Status();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__URL = eINSTANCE.getFile_Url();

		/**
		 * The meta object literal for the '{@link environment.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.ProcessImpl
		 * @see environment.impl.cpsPackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__STATUS = eINSTANCE.getProcess_Status();

		/**
		 * The meta object literal for the '{@link environment.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.ApplicationImpl
		 * @see environment.impl.cpsPackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__STATUS = eINSTANCE.getApplication_Status();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__URL = eINSTANCE.getApplication_Url();

		/**
		 * The meta object literal for the '{@link environment.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.ConnectionImpl
		 * @see environment.impl.cpsPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Asset1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__ASSET1 = eINSTANCE.getConnection_Asset1();

		/**
		 * The meta object literal for the '<em><b>Asset2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__ASSET2 = eINSTANCE.getConnection_Asset2();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__NAME = eINSTANCE.getConnection_Name();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__CONSTRAINTS = eINSTANCE.getConnection_Constraints();

		/**
		 * The meta object literal for the '<em><b>Bidirectional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__BIDIRECTIONAL = eINSTANCE.getConnection_Bidirectional();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__PORT = eINSTANCE.getConnection_Port();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__PROPERTIES = eINSTANCE.getConnection_Properties();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__DESCRIPTION = eINSTANCE.getConnection_Description();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__TYPE = eINSTANCE.getConnection_Type();

		/**
		 * The meta object literal for the '<em><b>Similar To</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONNECTION___SIMILAR_TO__CONNECTION = eINSTANCE.getConnection__SimilarTo__Connection();

		/**
		 * The meta object literal for the '{@link environment.impl.DigitalConnectionImpl <em>Digital Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.DigitalConnectionImpl
		 * @see environment.impl.cpsPackageImpl#getDigitalConnection()
		 * @generated
		 */
		EClass DIGITAL_CONNECTION = eINSTANCE.getDigitalConnection();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIGITAL_CONNECTION__PROTOCOL = eINSTANCE.getDigitalConnection_Protocol();

		/**
		 * The meta object literal for the '{@link environment.impl.PhysicalConnectionImpl <em>Physical Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.PhysicalConnectionImpl
		 * @see environment.impl.cpsPackageImpl#getPhysicalConnection()
		 * @generated
		 */
		EClass PHYSICAL_CONNECTION = eINSTANCE.getPhysicalConnection();

		/**
		 * The meta object literal for the '{@link environment.impl.AssetImpl <em>Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.AssetImpl
		 * @see environment.impl.cpsPackageImpl#getAsset()
		 * @generated
		 */
		EClass ASSET = eINSTANCE.getAsset();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__CONNECTIONS = eINSTANCE.getAsset_Connections();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__NAME = eINSTANCE.getAsset_Name();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__PROPERTY = eINSTANCE.getAsset_Property();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__VALUE = eINSTANCE.getAsset_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__TYPE = eINSTANCE.getAsset_Type();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__DESCRIPTION = eINSTANCE.getAsset_Description();

		/**
		 * The meta object literal for the '<em><b>Control</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__CONTROL = eINSTANCE.getAsset_Control();

		/**
		 * The meta object literal for the '<em><b>Abstract Asset</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSET___ABSTRACT_ASSET = eINSTANCE.getAsset__AbstractAsset();

		/**
		 * The meta object literal for the '<em><b>Similar To</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSET___SIMILAR_TO__ASSET = eINSTANCE.getAsset__SimilarTo__Asset();

		/**
		 * The meta object literal for the '<em><b>Merge Connections</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSET___MERGE_CONNECTIONS = eINSTANCE.getAsset__MergeConnections();

		/**
		 * The meta object literal for the '<em><b>Can Merge Connections</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSET___CAN_MERGE_CONNECTIONS = eINSTANCE.getAsset__CanMergeConnections();

		/**
		 * The meta object literal for the '<em><b>Can Merge Contained Assets</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSET___CAN_MERGE_CONTAINED_ASSETS = eINSTANCE.getAsset__CanMergeContainedAssets();

		/**
		 * The meta object literal for the '<em><b>Merge Contained Assets</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSET___MERGE_CONTAINED_ASSETS = eINSTANCE.getAsset__MergeContainedAssets();

		/**
		 * The meta object literal for the '<em><b>Merge Connections</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSET___MERGE_CONNECTIONS__ELIST = eINSTANCE.getAsset__MergeConnections__EList();

		/**
		 * The meta object literal for the '<em><b>Can Merge Connections</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSET___CAN_MERGE_CONNECTIONS__ELIST = eINSTANCE.getAsset__CanMergeConnections__EList();

		/**
		 * The meta object literal for the '{@link environment.impl.EnvironmentDiagramImpl <em>Environment Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.EnvironmentDiagramImpl
		 * @see environment.impl.cpsPackageImpl#getEnvironmentDiagram()
		 * @generated
		 */
		EClass ENVIRONMENT_DIAGRAM = eINSTANCE.getEnvironmentDiagram();

		/**
		 * The meta object literal for the '<em><b>Asset</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT_DIAGRAM__ASSET = eINSTANCE.getEnvironmentDiagram_Asset();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT_DIAGRAM__CONNECTION = eINSTANCE.getEnvironmentDiagram_Connection();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT_DIAGRAM__PORT = eINSTANCE.getEnvironmentDiagram_Port();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT_DIAGRAM__PROPERTY = eINSTANCE.getEnvironmentDiagram_Property();

		/**
		 * The meta object literal for the '<em><b>Credential</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT_DIAGRAM__CREDENTIAL = eINSTANCE.getEnvironmentDiagram_Credential();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT_DIAGRAM__RULE = eINSTANCE.getEnvironmentDiagram_Rule();

		/**
		 * The meta object literal for the '{@link environment.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.PortImpl
		 * @see environment.impl.cpsPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Asset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__ASSET = eINSTANCE.getPort_Asset();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__NAME = eINSTANCE.getPort_Name();

		/**
		 * The meta object literal for the '<em><b>Credential</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__CREDENTIAL = eINSTANCE.getPort_Credential();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__DESCRIPTION = eINSTANCE.getPort_Description();

		/**
		 * The meta object literal for the '{@link environment.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.PropertyImpl
		 * @see environment.impl.cpsPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

		/**
		 * The meta object literal for the '<em><b>Abstractable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__ABSTRACTABLE = eINSTANCE.getProperty_Abstractable();

		/**
		 * The meta object literal for the '{@link environment.impl.CredentialImpl <em>Credential</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.CredentialImpl
		 * @see environment.impl.cpsPackageImpl#getCredential()
		 * @generated
		 */
		EClass CREDENTIAL = eINSTANCE.getCredential();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDENTIAL__TYPE = eINSTANCE.getCredential_Type();

		/**
		 * The meta object literal for the '<em><b>Other</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDENTIAL__OTHER = eINSTANCE.getCredential_Other();

		/**
		 * The meta object literal for the '{@link environment.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.ActorImpl
		 * @see environment.impl.cpsPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__ROLE = eINSTANCE.getActor_Role();

		/**
		 * The meta object literal for the '{@link environment.impl.PhysicalStructureImpl <em>Physical Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.PhysicalStructureImpl
		 * @see environment.impl.cpsPackageImpl#getPhysicalStructure()
		 * @generated
		 */
		EClass PHYSICAL_STRUCTURE = eINSTANCE.getPhysicalStructure();

		/**
		 * The meta object literal for the '{@link environment.impl.DigitalAssetImpl <em>Digital Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.DigitalAssetImpl
		 * @see environment.impl.cpsPackageImpl#getDigitalAsset()
		 * @generated
		 */
		EClass DIGITAL_ASSET = eINSTANCE.getDigitalAsset();

		/**
		 * The meta object literal for the '<em><b>Parent Asset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIGITAL_ASSET__PARENT_ASSET = eINSTANCE.getDigitalAsset_ParentAsset();

		/**
		 * The meta object literal for the '<em><b>Contained Assets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIGITAL_ASSET__CONTAINED_ASSETS = eINSTANCE.getDigitalAsset_ContainedAssets();

		/**
		 * The meta object literal for the '{@link environment.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.ActionImpl
		 * @see environment.impl.cpsPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__NAME = eINSTANCE.getAction_Name();

		/**
		 * The meta object literal for the '<em><b>Preconditions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__PRECONDITIONS = eINSTANCE.getAction_Preconditions();

		/**
		 * The meta object literal for the '<em><b>Postconditions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__POSTCONDITIONS = eINSTANCE.getAction_Postconditions();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__DESCRIPTION = eINSTANCE.getAction_Description();

		/**
		 * The meta object literal for the '{@link environment.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.TypeImpl
		 * @see environment.impl.cpsPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__NAME = eINSTANCE.getType_Name();

		/**
		 * The meta object literal for the '<em><b>Super Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__SUPER_TYPE = eINSTANCE.getType_SuperType();

		/**
		 * The meta object literal for the '{@link environment.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.RoomImpl
		 * @see environment.impl.cpsPackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '{@link environment.impl.FloorImpl <em>Floor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.FloorImpl
		 * @see environment.impl.cpsPackageImpl#getFloor()
		 * @generated
		 */
		EClass FLOOR = eINSTANCE.getFloor();

		/**
		 * The meta object literal for the '{@link environment.impl.BuildingImpl <em>Building</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.BuildingImpl
		 * @see environment.impl.cpsPackageImpl#getBuilding()
		 * @generated
		 */
		EClass BUILDING = eINSTANCE.getBuilding();

		/**
		 * The meta object literal for the '{@link environment.impl.FireAlarmImpl <em>Fire Alarm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.FireAlarmImpl
		 * @see environment.impl.cpsPackageImpl#getFireAlarm()
		 * @generated
		 */
		EClass FIRE_ALARM = eINSTANCE.getFireAlarm();

		/**
		 * The meta object literal for the '{@link environment.impl.WorkstationImpl <em>Workstation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.WorkstationImpl
		 * @see environment.impl.cpsPackageImpl#getWorkstation()
		 * @generated
		 */
		EClass WORKSTATION = eINSTANCE.getWorkstation();

		/**
		 * The meta object literal for the '{@link environment.impl.LabImpl <em>Lab</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.LabImpl
		 * @see environment.impl.cpsPackageImpl#getLab()
		 * @generated
		 */
		EClass LAB = eINSTANCE.getLab();

		/**
		 * The meta object literal for the '{@link environment.impl.ToiletImpl <em>Toilet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.ToiletImpl
		 * @see environment.impl.cpsPackageImpl#getToilet()
		 * @generated
		 */
		EClass TOILET = eINSTANCE.getToilet();

		/**
		 * The meta object literal for the '{@link environment.impl.LoungeImpl <em>Lounge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.LoungeImpl
		 * @see environment.impl.cpsPackageImpl#getLounge()
		 * @generated
		 */
		EClass LOUNGE = eINSTANCE.getLounge();

		/**
		 * The meta object literal for the '{@link environment.impl.DishWasherImpl <em>Dish Washer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.DishWasherImpl
		 * @see environment.impl.cpsPackageImpl#getDishWasher()
		 * @generated
		 */
		EClass DISH_WASHER = eINSTANCE.getDishWasher();

		/**
		 * The meta object literal for the '{@link environment.impl.CoffeeMachineImpl <em>Coffee Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.CoffeeMachineImpl
		 * @see environment.impl.cpsPackageImpl#getCoffeeMachine()
		 * @generated
		 */
		EClass COFFEE_MACHINE = eINSTANCE.getCoffeeMachine();

		/**
		 * The meta object literal for the '{@link environment.impl.ElevatorImpl <em>Elevator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.ElevatorImpl
		 * @see environment.impl.cpsPackageImpl#getElevator()
		 * @generated
		 */
		EClass ELEVATOR = eINSTANCE.getElevator();

		/**
		 * The meta object literal for the '{@link environment.impl.HallwayImpl <em>Hallway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.HallwayImpl
		 * @see environment.impl.cpsPackageImpl#getHallway()
		 * @generated
		 */
		EClass HALLWAY = eINSTANCE.getHallway();

		/**
		 * The meta object literal for the '{@link environment.impl.ElevatorsAreaImpl <em>Elevators Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.ElevatorsAreaImpl
		 * @see environment.impl.cpsPackageImpl#getElevatorsArea()
		 * @generated
		 */
		EClass ELEVATORS_AREA = eINSTANCE.getElevatorsArea();

		/**
		 * The meta object literal for the '{@link environment.impl.IPNetworkImpl <em>IP Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.IPNetworkImpl
		 * @see environment.impl.cpsPackageImpl#getIPNetwork()
		 * @generated
		 */
		EClass IP_NETWORK = eINSTANCE.getIPNetwork();

		/**
		 * The meta object literal for the '{@link environment.impl.DigitalNetworkImpl <em>Digital Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.DigitalNetworkImpl
		 * @see environment.impl.cpsPackageImpl#getDigitalNetwork()
		 * @generated
		 */
		EClass DIGITAL_NETWORK = eINSTANCE.getDigitalNetwork();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIGITAL_NETWORK__PROTOCOL = eINSTANCE.getDigitalNetwork_Protocol();

		/**
		 * The meta object literal for the '<em><b>Encryption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIGITAL_NETWORK__ENCRYPTION = eINSTANCE.getDigitalNetwork_Encryption();

		/**
		 * The meta object literal for the '{@link environment.impl.BusNetworkImpl <em>Bus Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.BusNetworkImpl
		 * @see environment.impl.cpsPackageImpl#getBusNetwork()
		 * @generated
		 */
		EClass BUS_NETWORK = eINSTANCE.getBusNetwork();

		/**
		 * The meta object literal for the '{@link environment.impl.IPConnectionImpl <em>IP Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.IPConnectionImpl
		 * @see environment.impl.cpsPackageImpl#getIPConnection()
		 * @generated
		 */
		EClass IP_CONNECTION = eINSTANCE.getIPConnection();

		/**
		 * The meta object literal for the '{@link environment.impl.BusConnectionImpl <em>Bus Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.BusConnectionImpl
		 * @see environment.impl.cpsPackageImpl#getBusConnection()
		 * @generated
		 */
		EClass BUS_CONNECTION = eINSTANCE.getBusConnection();

		/**
		 * The meta object literal for the '{@link environment.impl.KitchenImpl <em>Kitchen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.KitchenImpl
		 * @see environment.impl.cpsPackageImpl#getKitchen()
		 * @generated
		 */
		EClass KITCHEN = eINSTANCE.getKitchen();

		/**
		 * The meta object literal for the '{@link environment.impl.StairsImpl <em>Stairs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.StairsImpl
		 * @see environment.impl.cpsPackageImpl#getStairs()
		 * @generated
		 */
		EClass STAIRS = eINSTANCE.getStairs();

		/**
		 * The meta object literal for the '{@link environment.impl.CardReaderImpl <em>Card Reader</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.CardReaderImpl
		 * @see environment.impl.cpsPackageImpl#getCardReader()
		 * @generated
		 */
		EClass CARD_READER = eINSTANCE.getCardReader();

		/**
		 * The meta object literal for the '{@link environment.impl.EmployeeImpl <em>Employee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.EmployeeImpl
		 * @see environment.impl.cpsPackageImpl#getEmployee()
		 * @generated
		 */
		EClass EMPLOYEE = eINSTANCE.getEmployee();

		/**
		 * The meta object literal for the '{@link environment.impl.VisitorImpl <em>Visitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.VisitorImpl
		 * @see environment.impl.cpsPackageImpl#getVisitor()
		 * @generated
		 */
		EClass VISITOR = eINSTANCE.getVisitor();

		/**
		 * The meta object literal for the '{@link environment.Status <em>Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.Status
		 * @see environment.impl.cpsPackageImpl#getStatus()
		 * @generated
		 */
		EEnum STATUS = eINSTANCE.getStatus();

		/**
		 * The meta object literal for the '{@link environment.ProcessStatus <em>Process Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.ProcessStatus
		 * @see environment.impl.cpsPackageImpl#getProcessStatus()
		 * @generated
		 */
		EEnum PROCESS_STATUS = eINSTANCE.getProcessStatus();

		/**
		 * The meta object literal for the '{@link environment.FileStatus <em>File Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.FileStatus
		 * @see environment.impl.cpsPackageImpl#getFileStatus()
		 * @generated
		 */
		EEnum FILE_STATUS = eINSTANCE.getFileStatus();

		/**
		 * The meta object literal for the '{@link environment.CredentialType <em>Credential Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.CredentialType
		 * @see environment.impl.cpsPackageImpl#getCredentialType()
		 * @generated
		 */
		EEnum CREDENTIAL_TYPE = eINSTANCE.getCredentialType();

	}

} //cpsPackage
