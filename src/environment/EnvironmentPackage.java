/**
 */
package environment;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see environment.EnvironmentFactory
 * @model kind="package"
 * @generated
 */
public interface EnvironmentPackage extends EPackage {
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
	EnvironmentPackage eINSTANCE = environment.impl.EnvironmentPackageImpl.init();

	/**
	 * The meta object id for the '{@link environment.impl.AssetImpl <em>Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.impl.AssetImpl
	 * @see environment.impl.EnvironmentPackageImpl#getAsset()
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
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
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
	 * The number of operations of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link environment.impl.PhysicalAssetImpl <em>Physical Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.impl.PhysicalAssetImpl
	 * @see environment.impl.EnvironmentPackageImpl#getPhysicalAsset()
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
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
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
	 * @see environment.impl.EnvironmentPackageImpl#getComputingDevice()
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
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
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
	 * The feature id for the '<em><b>Can Connect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTING_DEVICE__CAN_CONNECT = PHYSICAL_ASSET_FEATURE_COUNT + 1;

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
	 * @see environment.impl.EnvironmentPackageImpl#getHVAC()
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
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
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
	 * The feature id for the '<em><b>Can Connect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HVAC__CAN_CONNECT = COMPUTING_DEVICE__CAN_CONNECT;

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
	 * @see environment.impl.EnvironmentPackageImpl#getSmartLight()
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
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
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
	 * The feature id for the '<em><b>Can Connect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_LIGHT__CAN_CONNECT = COMPUTING_DEVICE__CAN_CONNECT;

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
	 * @see environment.impl.EnvironmentPackageImpl#getLaptop()
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
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
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
	 * The feature id for the '<em><b>Can Connect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAPTOP__CAN_CONNECT = COMPUTING_DEVICE__CAN_CONNECT;

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
	 * @see environment.impl.EnvironmentPackageImpl#getDesktop()
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
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
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
	 * The feature id for the '<em><b>Can Connect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESKTOP__CAN_CONNECT = COMPUTING_DEVICE__CAN_CONNECT;

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
	 * @see environment.impl.EnvironmentPackageImpl#getCCTV()
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
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
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
	 * The feature id for the '<em><b>Can Connect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CCTV__CAN_CONNECT = COMPUTING_DEVICE__CAN_CONNECT;

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
	 * @see environment.impl.EnvironmentPackageImpl#getServer()
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
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
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
	 * The feature id for the '<em><b>Can Connect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__CAN_CONNECT = COMPUTING_DEVICE__CAN_CONNECT;

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
	 * @see environment.impl.EnvironmentPackageImpl#getDigitalAsset()
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
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
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
	 * @see environment.impl.EnvironmentPackageImpl#getFile()
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
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
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
	 * @see environment.impl.EnvironmentPackageImpl#getProcess()
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
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
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
	 * @see environment.impl.EnvironmentPackageImpl#getApplication()
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
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
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
	 * @see environment.impl.EnvironmentPackageImpl#getConnection()
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
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__CONSTRAINTS = 4;

	/**
	 * The feature id for the '<em><b>Is Bidirectional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__IS_BIDIRECTIONAL = 5;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__PORT = 6;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__PROPERTIES = 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__DESCRIPTION = 8;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link environment.impl.DigitalConnectionImpl <em>Digital Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.impl.DigitalConnectionImpl
	 * @see environment.impl.EnvironmentPackageImpl#getDigitalConnection()
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
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_CONNECTION__TYPE = CONNECTION__TYPE;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_CONNECTION__CONSTRAINTS = CONNECTION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Is Bidirectional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_CONNECTION__IS_BIDIRECTIONAL = CONNECTION__IS_BIDIRECTIONAL;

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
	 * The number of structural features of the '<em>Digital Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGITAL_CONNECTION_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 0;

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
	 * @see environment.impl.EnvironmentPackageImpl#getPhysicalConnection()
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
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONNECTION__TYPE = CONNECTION__TYPE;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONNECTION__CONSTRAINTS = CONNECTION__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Is Bidirectional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONNECTION__IS_BIDIRECTIONAL = CONNECTION__IS_BIDIRECTIONAL;

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
	 * The number of structural features of the '<em>Physical Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONNECTION_FEATURE_COUNT = CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Physical Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_CONNECTION_OPERATION_COUNT = CONNECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link environment.impl.EnvironmentDiagramImpl <em>Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.impl.EnvironmentDiagramImpl
	 * @see environment.impl.EnvironmentPackageImpl#getEnvironmentDiagram()
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
	 * The number of structural features of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_DIAGRAM_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Diagram</em>' class.
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
	 * @see environment.impl.EnvironmentPackageImpl#getPort()
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
	 * @see environment.impl.EnvironmentPackageImpl#getProperty()
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
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 2;

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
	 * @see environment.impl.EnvironmentPackageImpl#getCredential()
	 * @generated
	 */
	int CREDENTIAL = 18;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIAL__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIAL__VALUE = 1;

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
	 * @see environment.impl.EnvironmentPackageImpl#getActor()
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
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
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
	 * @see environment.impl.EnvironmentPackageImpl#getPhysicalStructure()
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
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
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
	 * @see environment.impl.EnvironmentPackageImpl#getAction()
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
	 * @see environment.impl.EnvironmentPackageImpl#getType()
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
	 * The feature id for the '<em><b>Super Type</b></em>' containment reference list.
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
	 * @see environment.impl.EnvironmentPackageImpl#getRoom()
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
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
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
	 * @see environment.impl.EnvironmentPackageImpl#getFloor()
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
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
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
	 * @see environment.impl.EnvironmentPackageImpl#getBuilding()
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
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
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
	 * @see environment.impl.EnvironmentPackageImpl#getFireAlarm()
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
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
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
	 * The feature id for the '<em><b>Can Connect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRE_ALARM__CAN_CONNECT = COMPUTING_DEVICE__CAN_CONNECT;

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
	 * @see environment.impl.EnvironmentPackageImpl#getWorkstation()
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
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
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
	 * The feature id for the '<em><b>Can Connect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSTATION__CAN_CONNECT = COMPUTING_DEVICE__CAN_CONNECT;

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
	 * @see environment.impl.EnvironmentPackageImpl#getLab()
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
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
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
	 * @see environment.impl.EnvironmentPackageImpl#getToilet()
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
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
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
	 * @see environment.impl.EnvironmentPackageImpl#getLounge()
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
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
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
	 * @see environment.impl.EnvironmentPackageImpl#getDishWasher()
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
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
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
	 * The feature id for the '<em><b>Can Connect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISH_WASHER__CAN_CONNECT = COMPUTING_DEVICE__CAN_CONNECT;

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
	 * @see environment.impl.EnvironmentPackageImpl#getCoffeeMachine()
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
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
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
	 * The feature id for the '<em><b>Can Connect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COFFEE_MACHINE__CAN_CONNECT = COMPUTING_DEVICE__CAN_CONNECT;

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
	 * @see environment.impl.EnvironmentPackageImpl#getElevator()
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
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
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
	 * The feature id for the '<em><b>Can Connect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATOR__CAN_CONNECT = COMPUTING_DEVICE__CAN_CONNECT;

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
	 * @see environment.impl.EnvironmentPackageImpl#getHallway()
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
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
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
	 * @see environment.impl.EnvironmentPackageImpl#getElevatorsArea()
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
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
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
	 * The number of operations of the '<em>Elevators Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEVATORS_AREA_OPERATION_COUNT = ROOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link environment.Status <em>Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.Status
	 * @see environment.impl.EnvironmentPackageImpl#getStatus()
	 * @generated
	 */
	int STATUS = 37;

	/**
	 * The meta object id for the '{@link environment.ProcessStatus <em>Process Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.ProcessStatus
	 * @see environment.impl.EnvironmentPackageImpl#getProcessStatus()
	 * @generated
	 */
	int PROCESS_STATUS = 38;

	/**
	 * The meta object id for the '{@link environment.FileStatus <em>File Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see environment.FileStatus
	 * @see environment.impl.EnvironmentPackageImpl#getFileStatus()
	 * @generated
	 */
	int FILE_STATUS = 39;


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
	 * Returns the meta object for the attribute '{@link environment.ComputingDevice#isCanConnect <em>Can Connect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Can Connect</em>'.
	 * @see environment.ComputingDevice#isCanConnect()
	 * @see #getComputingDevice()
	 * @generated
	 */
	EAttribute getComputingDevice_CanConnect();

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
	 * Returns the meta object for the attribute '{@link environment.Connection#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see environment.Connection#getType()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Type();

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
	 * Returns the meta object for the attribute '{@link environment.Connection#isIsBidirectional <em>Is Bidirectional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Bidirectional</em>'.
	 * @see environment.Connection#isIsBidirectional()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_IsBidirectional();

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
	 * Returns the meta object for class '{@link environment.DigitalConnection <em>Digital Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Digital Connection</em>'.
	 * @see environment.DigitalConnection
	 * @generated
	 */
	EClass getDigitalConnection();

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
	 * Returns the meta object for the containment reference list '{@link environment.Asset#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type</em>'.
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
	 * Returns the meta object for class '{@link environment.EnvironmentDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram</em>'.
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
	 * Returns the meta object for class '{@link environment.Credential <em>Credential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Credential</em>'.
	 * @see environment.Credential
	 * @generated
	 */
	EClass getCredential();

	/**
	 * Returns the meta object for the attribute '{@link environment.Credential#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see environment.Credential#getKey()
	 * @see #getCredential()
	 * @generated
	 */
	EAttribute getCredential_Key();

	/**
	 * Returns the meta object for the attribute '{@link environment.Credential#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see environment.Credential#getValue()
	 * @see #getCredential()
	 * @generated
	 */
	EAttribute getCredential_Value();

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
	 * Returns the meta object for the containment reference list '{@link environment.Type#getSuperType <em>Super Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Super Type</em>'.
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
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EnvironmentFactory getEnvironmentFactory();

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
		 * @see environment.impl.EnvironmentPackageImpl#getPhysicalAsset()
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
		 * @see environment.impl.EnvironmentPackageImpl#getComputingDevice()
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
		 * The meta object literal for the '<em><b>Can Connect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPUTING_DEVICE__CAN_CONNECT = eINSTANCE.getComputingDevice_CanConnect();

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
		 * @see environment.impl.EnvironmentPackageImpl#getHVAC()
		 * @generated
		 */
		EClass HVAC = eINSTANCE.getHVAC();

		/**
		 * The meta object literal for the '{@link environment.impl.SmartLightImpl <em>Smart Light</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.SmartLightImpl
		 * @see environment.impl.EnvironmentPackageImpl#getSmartLight()
		 * @generated
		 */
		EClass SMART_LIGHT = eINSTANCE.getSmartLight();

		/**
		 * The meta object literal for the '{@link environment.impl.LaptopImpl <em>Laptop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.LaptopImpl
		 * @see environment.impl.EnvironmentPackageImpl#getLaptop()
		 * @generated
		 */
		EClass LAPTOP = eINSTANCE.getLaptop();

		/**
		 * The meta object literal for the '{@link environment.impl.DesktopImpl <em>Desktop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.DesktopImpl
		 * @see environment.impl.EnvironmentPackageImpl#getDesktop()
		 * @generated
		 */
		EClass DESKTOP = eINSTANCE.getDesktop();

		/**
		 * The meta object literal for the '{@link environment.impl.CCTVImpl <em>CCTV</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.CCTVImpl
		 * @see environment.impl.EnvironmentPackageImpl#getCCTV()
		 * @generated
		 */
		EClass CCTV = eINSTANCE.getCCTV();

		/**
		 * The meta object literal for the '{@link environment.impl.ServerImpl <em>Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.ServerImpl
		 * @see environment.impl.EnvironmentPackageImpl#getServer()
		 * @generated
		 */
		EClass SERVER = eINSTANCE.getServer();

		/**
		 * The meta object literal for the '{@link environment.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.FileImpl
		 * @see environment.impl.EnvironmentPackageImpl#getFile()
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
		 * @see environment.impl.EnvironmentPackageImpl#getProcess()
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
		 * @see environment.impl.EnvironmentPackageImpl#getApplication()
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
		 * @see environment.impl.EnvironmentPackageImpl#getConnection()
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
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__TYPE = eINSTANCE.getConnection_Type();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__CONSTRAINTS = eINSTANCE.getConnection_Constraints();

		/**
		 * The meta object literal for the '<em><b>Is Bidirectional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__IS_BIDIRECTIONAL = eINSTANCE.getConnection_IsBidirectional();

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
		 * The meta object literal for the '{@link environment.impl.DigitalConnectionImpl <em>Digital Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.DigitalConnectionImpl
		 * @see environment.impl.EnvironmentPackageImpl#getDigitalConnection()
		 * @generated
		 */
		EClass DIGITAL_CONNECTION = eINSTANCE.getDigitalConnection();

		/**
		 * The meta object literal for the '{@link environment.impl.PhysicalConnectionImpl <em>Physical Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.PhysicalConnectionImpl
		 * @see environment.impl.EnvironmentPackageImpl#getPhysicalConnection()
		 * @generated
		 */
		EClass PHYSICAL_CONNECTION = eINSTANCE.getPhysicalConnection();

		/**
		 * The meta object literal for the '{@link environment.impl.AssetImpl <em>Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.AssetImpl
		 * @see environment.impl.EnvironmentPackageImpl#getAsset()
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
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference list feature.
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
		 * The meta object literal for the '{@link environment.impl.EnvironmentDiagramImpl <em>Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.EnvironmentDiagramImpl
		 * @see environment.impl.EnvironmentPackageImpl#getEnvironmentDiagram()
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
		 * @see environment.impl.EnvironmentPackageImpl#getPort()
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
		 * @see environment.impl.EnvironmentPackageImpl#getProperty()
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
		 * The meta object literal for the '{@link environment.impl.CredentialImpl <em>Credential</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.CredentialImpl
		 * @see environment.impl.EnvironmentPackageImpl#getCredential()
		 * @generated
		 */
		EClass CREDENTIAL = eINSTANCE.getCredential();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDENTIAL__KEY = eINSTANCE.getCredential_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDENTIAL__VALUE = eINSTANCE.getCredential_Value();

		/**
		 * The meta object literal for the '{@link environment.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.ActorImpl
		 * @see environment.impl.EnvironmentPackageImpl#getActor()
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
		 * @see environment.impl.EnvironmentPackageImpl#getPhysicalStructure()
		 * @generated
		 */
		EClass PHYSICAL_STRUCTURE = eINSTANCE.getPhysicalStructure();

		/**
		 * The meta object literal for the '{@link environment.impl.DigitalAssetImpl <em>Digital Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.DigitalAssetImpl
		 * @see environment.impl.EnvironmentPackageImpl#getDigitalAsset()
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
		 * @see environment.impl.EnvironmentPackageImpl#getAction()
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
		 * @see environment.impl.EnvironmentPackageImpl#getType()
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
		 * The meta object literal for the '<em><b>Super Type</b></em>' containment reference list feature.
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
		 * @see environment.impl.EnvironmentPackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '{@link environment.impl.FloorImpl <em>Floor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.FloorImpl
		 * @see environment.impl.EnvironmentPackageImpl#getFloor()
		 * @generated
		 */
		EClass FLOOR = eINSTANCE.getFloor();

		/**
		 * The meta object literal for the '{@link environment.impl.BuildingImpl <em>Building</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.BuildingImpl
		 * @see environment.impl.EnvironmentPackageImpl#getBuilding()
		 * @generated
		 */
		EClass BUILDING = eINSTANCE.getBuilding();

		/**
		 * The meta object literal for the '{@link environment.impl.FireAlarmImpl <em>Fire Alarm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.FireAlarmImpl
		 * @see environment.impl.EnvironmentPackageImpl#getFireAlarm()
		 * @generated
		 */
		EClass FIRE_ALARM = eINSTANCE.getFireAlarm();

		/**
		 * The meta object literal for the '{@link environment.impl.WorkstationImpl <em>Workstation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.WorkstationImpl
		 * @see environment.impl.EnvironmentPackageImpl#getWorkstation()
		 * @generated
		 */
		EClass WORKSTATION = eINSTANCE.getWorkstation();

		/**
		 * The meta object literal for the '{@link environment.impl.LabImpl <em>Lab</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.LabImpl
		 * @see environment.impl.EnvironmentPackageImpl#getLab()
		 * @generated
		 */
		EClass LAB = eINSTANCE.getLab();

		/**
		 * The meta object literal for the '{@link environment.impl.ToiletImpl <em>Toilet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.ToiletImpl
		 * @see environment.impl.EnvironmentPackageImpl#getToilet()
		 * @generated
		 */
		EClass TOILET = eINSTANCE.getToilet();

		/**
		 * The meta object literal for the '{@link environment.impl.LoungeImpl <em>Lounge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.LoungeImpl
		 * @see environment.impl.EnvironmentPackageImpl#getLounge()
		 * @generated
		 */
		EClass LOUNGE = eINSTANCE.getLounge();

		/**
		 * The meta object literal for the '{@link environment.impl.DishWasherImpl <em>Dish Washer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.DishWasherImpl
		 * @see environment.impl.EnvironmentPackageImpl#getDishWasher()
		 * @generated
		 */
		EClass DISH_WASHER = eINSTANCE.getDishWasher();

		/**
		 * The meta object literal for the '{@link environment.impl.CoffeeMachineImpl <em>Coffee Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.CoffeeMachineImpl
		 * @see environment.impl.EnvironmentPackageImpl#getCoffeeMachine()
		 * @generated
		 */
		EClass COFFEE_MACHINE = eINSTANCE.getCoffeeMachine();

		/**
		 * The meta object literal for the '{@link environment.impl.ElevatorImpl <em>Elevator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.ElevatorImpl
		 * @see environment.impl.EnvironmentPackageImpl#getElevator()
		 * @generated
		 */
		EClass ELEVATOR = eINSTANCE.getElevator();

		/**
		 * The meta object literal for the '{@link environment.impl.HallwayImpl <em>Hallway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.HallwayImpl
		 * @see environment.impl.EnvironmentPackageImpl#getHallway()
		 * @generated
		 */
		EClass HALLWAY = eINSTANCE.getHallway();

		/**
		 * The meta object literal for the '{@link environment.impl.ElevatorsAreaImpl <em>Elevators Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.impl.ElevatorsAreaImpl
		 * @see environment.impl.EnvironmentPackageImpl#getElevatorsArea()
		 * @generated
		 */
		EClass ELEVATORS_AREA = eINSTANCE.getElevatorsArea();

		/**
		 * The meta object literal for the '{@link environment.Status <em>Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.Status
		 * @see environment.impl.EnvironmentPackageImpl#getStatus()
		 * @generated
		 */
		EEnum STATUS = eINSTANCE.getStatus();

		/**
		 * The meta object literal for the '{@link environment.ProcessStatus <em>Process Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.ProcessStatus
		 * @see environment.impl.EnvironmentPackageImpl#getProcessStatus()
		 * @generated
		 */
		EEnum PROCESS_STATUS = eINSTANCE.getProcessStatus();

		/**
		 * The meta object literal for the '{@link environment.FileStatus <em>File Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see environment.FileStatus
		 * @see environment.impl.EnvironmentPackageImpl#getFileStatus()
		 * @generated
		 */
		EEnum FILE_STATUS = eINSTANCE.getFileStatus();

	}

} //EnvironmentPackage
