/**
 */
package environment.impl;

import environment.Asset;
import environment.Connection;
import environment.PhysicalAsset;
import environment.Room;

import environment.smartbuildingPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RoomImpl extends PhysicalStructureImpl implements Room {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return smartbuildingPackage.Literals.ROOM;
	}
	
public Room abstractAsset() {
		
		Room abstractedAsset = environment.smartbuildingFactory.eINSTANCE.createRoom();
		
		//get an abstracted asset from parent
		PhysicalAsset aset = (PhysicalAsset)super.abstractAsset();
		
		
		//set attributes
		//set name...can be just left for the super
		abstractedAsset.setName(aset.getName());//give a unique name
		abstractedAsset.setValue(aset.getValue());
		
		//copy abstracted connections
		for(Connection con : aset.getConnections()) {
			abstractedAsset.getConnections().add(con);
		}
		
		//copy abstracted assets
		for(Asset ast : aset.getContainedAssets()) {
			abstractedAsset.getContainedAssets().add(ast);
		}
	
		//c-model is not abstracted at the moment as it can be private info. maybe a field can indicate if it can be included or not when abstracting
		//abstractedAsset.setModel(this.getModel());
		
		
		//2-abstract contained assets (can be done by merging/aggregating assets if possible)
		//shallow abstraction of contained assets might be needed
		//mergeContainedAssets();
	
		//3-abstract connections (can be done by merging/aggregating connections if possible)
		//shallow abstraction of connections might be needed
		//mergeConnections();
		aset = null;
		
		return abstractedAsset;
	}
	

} //RoomImpl
