/**
 */
package environment.impl;

import environment.Asset;
import environment.PhysicalStructure;
import environment.CyberPhysicalSystemPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PhysicalStructureImpl extends PhysicalAssetImpl implements PhysicalStructure {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CyberPhysicalSystemPackage.Literals.PHYSICAL_STRUCTURE;
	}
	
	public Asset abstractType() {
		
		return instance.createPhysicalStructure();
}

} //PhysicalStructureImpl
