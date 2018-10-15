/**
 */
package environment.util;

import environment.CyberPhysicalSystemPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CyberPhysicalSystemXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CyberPhysicalSystemXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		CyberPhysicalSystemPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the CyberPhysicalSystemResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new CyberPhysicalSystemResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new CyberPhysicalSystemResourceFactoryImpl());
		}
		return registrations;
	}

} //CyberPhysicalSystemXMLProcessor
