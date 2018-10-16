/**
 */
package environment.impl;

import environment.PhysicalStructure;
import environment.CyberPhysicalSystemPackage;
import environment.Mobility;

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
	 * 
	 */
	protected PhysicalStructureImpl() {
		super();
		
		setMobility(Mobility.FIXED);
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
	
	/*public Asset abstractType() {
		
		try {
			return (Asset)this.getClass().newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
}*/

} //PhysicalStructureImpl
