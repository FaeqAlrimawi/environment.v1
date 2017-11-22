/**
 */
package environment;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see environment.EnvironmentPackage
 * @generated
 */
public interface EnvironmentFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EnvironmentFactory eINSTANCE = environment.impl.EnvironmentFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Tangible</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tangible</em>'.
	 * @generated
	 */
	Tangible createTangible();

	/**
	 * Returns a new object of class '<em>Computing Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Computing Device</em>'.
	 * @generated
	 */
	ComputingDevice createComputingDevice();

	/**
	 * Returns a new object of class '<em>HVAC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HVAC</em>'.
	 * @generated
	 */
	HVAC createHVAC();

	/**
	 * Returns a new object of class '<em>Smart Light</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Smart Light</em>'.
	 * @generated
	 */
	SmartLight createSmartLight();

	/**
	 * Returns a new object of class '<em>Laptop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Laptop</em>'.
	 * @generated
	 */
	Laptop createLaptop();

	/**
	 * Returns a new object of class '<em>Desktop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Desktop</em>'.
	 * @generated
	 */
	Desktop createDesktop();

	/**
	 * Returns a new object of class '<em>CCTV</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CCTV</em>'.
	 * @generated
	 */
	CCTV createCCTV();

	/**
	 * Returns a new object of class '<em>Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Server</em>'.
	 * @generated
	 */
	Server createServer();

	/**
	 * Returns a new object of class '<em>Digital</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Digital</em>'.
	 * @generated
	 */
	Digital createDigital();

	/**
	 * Returns a new object of class '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File</em>'.
	 * @generated
	 */
	File createFile();

	/**
	 * Returns a new object of class '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process</em>'.
	 * @generated
	 */
	Process createProcess();

	/**
	 * Returns a new object of class '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application</em>'.
	 * @generated
	 */
	Application createApplication();

	/**
	 * Returns a new object of class '<em>Digital Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Digital Connection</em>'.
	 * @generated
	 */
	DigitalConnection createDigitalConnection();

	/**
	 * Returns a new object of class '<em>Physical Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Connection</em>'.
	 * @generated
	 */
	PhysicalConnection createPhysicalConnection();

	/**
	 * Returns a new object of class '<em>Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagram</em>'.
	 * @generated
	 */
	EnvironmentDiagram createEnvironmentDiagram();

	/**
	 * Returns a new object of class '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port</em>'.
	 * @generated
	 */
	Port createPort();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	Property createProperty();

	/**
	 * Returns a new object of class '<em>Credential</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Credential</em>'.
	 * @generated
	 */
	Credential createCredential();

	/**
	 * Returns a new object of class '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actor</em>'.
	 * @generated
	 */
	Actor createActor();

	/**
	 * Returns a new object of class '<em>Physical Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Structure</em>'.
	 * @generated
	 */
	PhysicalStructure createPhysicalStructure();

	/**
	 * Returns a new object of class '<em>Intellectual</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intellectual</em>'.
	 * @generated
	 */
	Intellectual createIntellectual();

	/**
	 * Returns a new object of class '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule</em>'.
	 * @generated
	 */
	Rule createRule();

	/**
	 * Returns a new object of class '<em>Access Control Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Access Control Device</em>'.
	 * @generated
	 */
	AccessControlDevice createAccessControlDevice();

	/**
	 * Returns a new object of class '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	Type createType();

	/**
	 * Returns a new object of class '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room</em>'.
	 * @generated
	 */
	Room createRoom();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EnvironmentPackage getEnvironmentPackage();

} //EnvironmentFactory
