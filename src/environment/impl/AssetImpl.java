/**
 */
package environment.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import environment.Asset;
import environment.Connection;
import environment.CyberPhysicalSystemFactory;
import environment.CyberPhysicalSystemPackage;
import environment.DigitalAsset;
import environment.Mobility;
import environment.PhysicalAsset;
import environment.Property;
import environment.Type;
import environment.Vulnerability;
import externalUtility.HungarianAlgorithm;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link environment.impl.AssetImpl#getConnections <em>Connections</em>}</li>
 *   <li>{@link environment.impl.AssetImpl#getName <em>Name</em>}</li>
 *   <li>{@link environment.impl.AssetImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link environment.impl.AssetImpl#getValue <em>Value</em>}</li>
 *   <li>{@link environment.impl.AssetImpl#getType <em>Type</em>}</li>
 *   <li>{@link environment.impl.AssetImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link environment.impl.AssetImpl#getVulnerabilities <em>Vulnerabilities</em>}</li>
 *   <li>{@link environment.impl.AssetImpl#getMobility <em>Mobility</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AssetImpl extends MinimalEObjectImpl.Container implements Asset {
	/**
	 * The cached value of the '{@link #getConnections() <em>Connections</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> connections;
	
	protected CyberPhysicalSystemFactory instance = environment.CyberPhysicalSystemFactory.eINSTANCE;
	
	//used for naming abstracted assets
	protected static int assetNumber = 1;
	protected static final long ASSET_NUMBER_LIMIT = Long.MAX_VALUE;
	protected static String assetName = "asset";
	protected Asset abstractedAsset;
	protected boolean isAbstracted = false;
	
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> property;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected int value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVulnerabilities() <em>Vulnerabilities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVulnerabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Vulnerability> vulnerabilities;

	/**
	 * The default value of the '{@link #getMobility() <em>Mobility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMobility()
	 * @generated
	 * @ordered
	 */
	protected static final Mobility MOBILITY_EDEFAULT = Mobility.MOVABLE;

/**
	 * The cached value of the '{@link #getMobility() <em>Mobility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMobility()
	 * @generated
	 * @ordered
	 */
	protected Mobility mobility = MOBILITY_EDEFAULT;

	//	protected  static LinkedList<Integer> assetNumbers = new LinkedList<Integer>();
//	
//	protected static Random random = new Random();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected AssetImpl() {
		super();
		
		//by default, control is set to the name of the class that is invoked
		String className = this.getClass().getName();
		String [] names = className.split("\\.");
		String cName = names[names.length-1].replace("Impl", "");
		String ctrl = cName;
		
//		String currentCtrl = getControl();
//		
//		if(currentCtrl == null || currentCtrl.isEmpty()) {
//			//if this object can be cast to a Room, then the control is a room
//			if(Room.class.isInstance(this)) {
//				ctrl = "Room";
//			} else if(ComputingDevice.class.isInstance(this)) {
//				ctrl = "ComputingDevice";
//			}
//			
//			setControl(ctrl);
//		}
		
		//give default name to the asset if there's no name
		String currentName = getName();
		
		if(currentName == null || currentName.isEmpty()) {
				String name = this.getClass().getSimpleName().replace("Impl", "")+ assetNumber++;
				char c[] = name.toCharArray();
				c[0] = Character.toLowerCase(c[0]);
				name = new String(c);
				setName(name);
			}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CyberPhysicalSystemPackage.Literals.ASSET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	
	 */
	public EList<Connection> getConnections() {
		if (connections == null) {
			connections = new EObjectResolvingEList<Connection>(Connection.class, this, CyberPhysicalSystemPackage.ASSET__CONNECTIONS);
		}
		
		removeDuplicates(connections);
		return connections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalSystemPackage.ASSET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<Property>(Property.class, this, CyberPhysicalSystemPackage.ASSET__PROPERTY);
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(int newValue) {
		int oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalSystemPackage.ASSET__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Type newType, NotificationChain msgs) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CyberPhysicalSystemPackage.ASSET__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(Type newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CyberPhysicalSystemPackage.ASSET__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CyberPhysicalSystemPackage.ASSET__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalSystemPackage.ASSET__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalSystemPackage.ASSET__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Vulnerability> getVulnerabilities() {
		if (vulnerabilities == null) {
			vulnerabilities = new EObjectResolvingEList<Vulnerability>(Vulnerability.class, this, CyberPhysicalSystemPackage.ASSET__VULNERABILITIES);
		}
		return vulnerabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Mobility getMobility() {
		return mobility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMobility(Mobility newMobility) {
		Mobility oldMobility = mobility;
		mobility = newMobility == null ? MOBILITY_EDEFAULT : newMobility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CyberPhysicalSystemPackage.ASSET__MOBILITY, oldMobility, mobility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Asset abstractAsset() {

		//abstracting an asset includes:
		//1-abstract asset type
		//2-abstracting attributes (name, type, etc.)
		//3-contained assets 
		//4-connections
		
		//if an abstracted asset is already created for this asset
		if(isAbstracted) {
			return getAbstractedAsset();
		}
	
		//1-abstract type
		//Asset abstractedAsset;

		abstractedAsset = abstractType();
		
		if(abstractedAsset != null) {
			isAbstracted = true;
		} else {
			return null;
		}
		// 2-set attributes

		// a-set value...value represents how important the asset in the system.
		// the higher the more value it has
		abstractedAsset.setValue(this.getValue());
		
		// b-type
		if(this.getType() != null) {
			Type type = instance.createType();
			type.setName(this.getType().getName());
			abstractedAsset.setType(type);	
		}
		
		//c-control (remains the same)
//		abstractedAsset.setControl(this.getControl());
		
		//c-properties are added to the new abstracted asset only if they are abstractable i.e. isAbstractable is set to true
		Property tmp;
	
		for (Property pro : this.getProperty()) {
			if(pro.isAbstractable()) {
				tmp = instance.createProperty();
				tmp.setName(pro.getName());
				tmp.setValue(pro.getValue());
				abstractedAsset.getProperty().add(tmp);
			}
		}
		
		//d-Mobility
		abstractedAsset.setMobility(this.getMobility());
		// 4-abstract contained assets (can be done by merging/aggregating
		// assets if possible)
		// shallow abstraction of contained assets might be needed
		
		abstractContainedAssets();
		
		// 5-abstract connections (can be done by merging/aggregating
		// connections if possible)
		// shallow abstraction of connections might be needed
		abstractConnections();
		
		//create a periodic task to update the abstracted asset
		
		
		return abstractedAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Compares two Assets based on some criteria.
	 * Criteria: 1- type, 2- 
	 * <!-- end-user-doc -->
	 */
	public double similarTo(Asset asset) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		double similarity = 0;
		
		//compare types of assets
		similarity += compareType(asset);
		
		//if non of the above type matching fits then they are not simialr at all
		if(similarity == Asset.NO_COMMON_TYPE) {
			return 0;
		}
			
		//compare parent types of assets
		similarity += compareParentAsset(asset);
		
		//next, check number and type of contained assets
		similarity += compareContainedAssets(asset);
		
		similarity += this.compareConnections(asset);
		//compare type as attribute if specified
		if(this.getType() != null && !this.getType().getName().isEmpty() &&
				asset.getType() != null && !asset.getType().getName().isEmpty() &&
				this.getType().getName().equalsIgnoreCase(asset.getType().getName()) ) {
			similarity += Asset.ATTRIBUTE_TYPE;
		}
		
		return similarity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	
	public double compareType(Asset asset) {
		
		int similarityPercentage = 0; //goes from 0 (not similar) to 100 (equal)
		
		//similarity is based on:
		//Type of assets being compared i.e. if both has the same class then they get some value
		//if both has the same super class then they get [5]
		//if type match on more abstract classes then they get no value
		//if none of the above, then return 0 (execution of method stops)
		
		//if they have exactly the same class
		if(this.getClass().equals(asset.getClass())) {
			similarityPercentage += Asset.EXACT_TYPE;
		////if one is a super class of another
		} else if (this.getClass().isAssignableFrom(asset.getClass())
				|| asset.getClass().isAssignableFrom(this.getClass())) {
			similarityPercentage += Asset.ASSIGNABLE_TYPE;
		//if they have a common super class
		} else if(this.getClass().getSuperclass().equals(asset.getClass().getSuperclass())) {
			similarityPercentage += Asset.EXACT_SUPER_TYPE;
		//final check is if both either digital or physical assets
		} else if ((PhysicalAsset.class.isInstance(this) &&
				PhysicalAsset.class.isInstance(asset))
				||
				(DigitalAsset.class.isInstance(this) &&
				DigitalAsset.class.isInstance(asset))) {
			similarityPercentage = Asset.ABSTRACT_TYPE;
		}
		
		return similarityPercentage;
	}
	
	public Asset abstractType() {
		

		try {
		
		//abstract type based on levels in system meta-model. Currently has 3 levels

		for (List<Class<?>> level : EnvironmentDiagramImpl.abstractionLevels.values()) {
			for(Class<?> cls : level) {
				if(cls.isInstance(this)) {
					return (Asset) cls.newInstance();
				}
			}
		}			
		
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;

	}
	
	/*public Asset abstractType(String classType) {
		
		Asset ast = null;
		
		try {
			
			//if the class name specified does not contain an "Impl" at the end of the name then it will be added
			if(!classType.endsWith("Impl")) {
				classType = classType+"Impl";
			}
			
			String pkgName = CyberPhysicalSystemPackage.eNAME+".impl.";
			
			Class<?> cls = Class.forName(pkgName+classType);
			ast = (Asset)(cls.newInstance());
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ast;
	}*/
	
	@Override
	public double compareContainedAssets(Asset asset) {

		EList<Asset> thisAssets = null;
		EList<DigitalAsset> thisDigitalAssets = null;
		EList<Asset> argAssets = null;
		EList<DigitalAsset> argDigitalAssets = null;
		
		if(PhysicalAsset.class.isInstance(this)) {
			thisAssets = ((PhysicalAsset)this).getContainedAssets();	
		} else if(DigitalAsset.class.isInstance(this)) {
			thisDigitalAssets = ((DigitalAsset)this).getContainedAssets();	
		}
		
		if(PhysicalAsset.class.isInstance(asset)) {
			argAssets = ((PhysicalAsset)asset).getContainedAssets();	
		} else if(DigitalAsset.class.isInstance(asset)) {
			argDigitalAssets = ((DigitalAsset)asset).getContainedAssets();	
		}
		
		//move digital assets to the assets variable
		if(thisDigitalAssets != null) {
			thisAssets = new BasicEList<Asset>();
			for(DigitalAsset ast : thisDigitalAssets) {
				thisAssets.add(ast);
			}
		}

		// move digital assets to the assets variable
		if (argDigitalAssets != null) {
			argAssets = new BasicEList<Asset>();
			for (DigitalAsset ast : argDigitalAssets) {
				argAssets.add(ast);
			}
		}
		
				
		//if one of the assets has no contained assets then it returns 0
		if((thisAssets == null || thisAssets.isEmpty()) &&
				(argAssets != null && !argAssets.isEmpty())) {
			return 0;
		}
		//if one of the assets has no contained assets then it returns 0
		if((argAssets == null || argAssets.isEmpty()) &&
				(thisAssets != null && !thisAssets.isEmpty())) {
			return 0;
		}
		
		//if both assets have no contained assets then it returns NO_CONTAINEDASSETS value
		if((argAssets == null || argAssets.isEmpty()) &&
				(thisAssets == null || thisAssets.isEmpty())) {
			return Asset.NO_CONTAINEDASSETS;
		}
		
		//find common contained assets (type & number are considered)
		
			
		int matchesCount = 0;

		EList<Asset> matchedAssets = new BasicEList<Asset>();
		
		for(Asset thisAst : thisAssets) {
			for (Asset argAst: argAssets) {
				if(!matchedAssets.contains(argAst)) {
					if(thisAst.compareType(argAst) == Asset.EXACT_TYPE) {
						matchesCount++;
						matchedAssets.add(argAst);
						break;
					}
				}
			}
		}
		
		//if there are no matches
		if(matchesCount == 0) {
			return 0;
		}
		
		//if they have the same number and type of assets
		if ((thisAssets.size() == argAssets.size()) && matchesCount == thisAssets.size()) {
			return Asset.CONTAINEDASSETS_EXACT;
		}
		
		double percentageOfMatchesInThis = (double)matchesCount/(double)thisAssets.size();
		double percentageOfMatchesInArg =  (double)matchesCount/(double)argAssets.size();
		
		//to be partially matched both percentages should be above 50% (or as indicated by the Asset constant)
		if((percentageOfMatchesInThis >= Asset.CONTAINEDASSETS_PARTIAL_PERCENTAGE) 
				&& (percentageOfMatchesInArg >= Asset.CONTAINEDASSETS_PARTIAL_PERCENTAGE)) {
			return Asset.CONTAINEDASSETS_PARTIAL;
		}
		
		
			//array defines the matching map. 0 is not visited, 1 is matched, 2 is visited
			/*	int [][] isMatched = new int[thisAssets.size()][argAssets.size()];
				
				//initialise
				for(int i=0;i<isMatched.length;i++) {// this asset contained assets
					for(int j=0;j<isMatched[i].length;j++){ // argument asset contained assets
						isMatched[i][j] = 0;
					}
				}*/
				
		/*		//find matches
				for(int i=0;i<isMatched.length;i++) {
					for(int j=0;j<isMatched[i].length;j++){
						if(isMatched[i][j] == 0) { // not visited
							if(thisAssets.get(i).compareType(argAssets.get(j)) == Asset.SHARE_EXACT_TYPE) {
								isMatched[i][j] = 1; //matched
								
								//mark relevant postitions as visited (i.e. 2)
								//first rows
								for(int k=i+1;k<isMatched.length;k++) {
									isMatched[k][j] = 2;
								}
								
								//columns 
								//first rows
								for(int u=j+1;u<isMatched[i].length;u++) {
									isMatched[i][u] = 2;
								}
								
								break;
							}	
						} 
						
					}
				}
									
	//count the number of 1 (i.e. matches)
		for(int i=0;i<isMatched.length;i++) {
			for(int j=0;j<isMatched[i].length;j++){
				if(isMatched[i][j] == 1) { 
					matchesCount++;
				}
			}
		}
			*/

			
		return 0;
	}
	
	public double compareParentAsset(Asset asset) {
		
		Asset thisParentAsset = null;
		Asset argParentAsset = null;
		
		if(PhysicalAsset.class.isInstance(this)) {
			thisParentAsset = ((PhysicalAsset)this).getParentAsset();
		} else if(DigitalAsset.class.isInstance(this)) {
			thisParentAsset = ((DigitalAsset)this).getParentAsset();
		}
		
		if(PhysicalAsset.class.isInstance(asset)) {
			argParentAsset = ((PhysicalAsset)asset).getParentAsset();
		} else if(DigitalAsset.class.isInstance(asset)) {
			argParentAsset = ((DigitalAsset)asset).getParentAsset();
		}
		
		if(thisParentAsset != null && 
				argParentAsset != null) {
			if(thisParentAsset.equals(argParentAsset)) {
				return Asset.COMMON_PARENT;
		//check if their both parents have the same type
		} else if (thisParentAsset.compareType(argParentAsset) == Asset.EXACT_TYPE){
			return Asset.COMMON_PARENT_TYPE;
		}
		} 
		
		return 0;
	}
	
	public double compareConnections(Asset asset) {
		
		// percentage of similarity is found then all percentages are added then divided by the number of connections (thisConnectionsSize*argConnectionsSize) to get average similarity
		
		double similarity = 0;
		double [][] similarityValues;
		int thisConnectionsSize = this.getConnections().size();
		int argConnectionsSize = asset.getConnections().size();
		
		//they are similar in the sense that they both don't have connections
		if (thisConnectionsSize == 0 && argConnectionsSize == 0) {
			return Asset.BOTH_HAVE_NO_CONNECTIONS;
		}
		
		//if one of the assets has no connections
		if(thisConnectionsSize == 0 || argConnectionsSize == 0) {
			return 0;
		}
		
		//determine which connections should be rows and which should be columns
		if(thisConnectionsSize < argConnectionsSize) {
			similarityValues = new double[thisConnectionsSize][argConnectionsSize];
		} else {
			similarityValues = new double[argConnectionsSize][thisConnectionsSize];
		}
		
		
		//double averageSimilarityPercentage = 0;
		
		//find similarity values between all connections (matrix: smaller size * bigger size connections)
		for(int i=0;i<similarityValues.length;i++) {
			for(int j=0;j<similarityValues[i].length;j++) {
				similarityValues[i][j] = (double)this.getConnections().get(i).similarTo(asset.getConnections().get(j))/(double)Connection.MAXIMUM_SIMILARITY_VALUE;
				//averageSimilarityPercentage += similarityValues[i][j]; 
			}

		}
		
		//print matrix
/*		for(int i=0;i<similarityValues.length;i++) {
			for(int j=0;j<similarityValues[i].length;j++) {
				System.out.print(" ("+i+","+j+")="+similarityValues[i][j]);
			}
			System.out.println();
		}*/
		
		
		//find max similarity using the Hungarian lgorithm (combinatorial optimisation algorithm to solve assignment problem)
		double hungMaxSimilarity = HungarianAlgorithm.hgAlgorithm(similarityValues, "max");
		
		//it is divided by the bigger size array
		hungMaxSimilarity = hungMaxSimilarity/(double)similarityValues[0].length;
		
		//System.out.println("hung max similarity: " + hungMaxSimilarity);
		
		//alternative: average similarity is calculated (easy)
		//averageSimilarityPercentage = averageSimilarityPercentage/(double)(thisConnectionsSize*argConnectionsSize);
			
		//System.out.println("average similarity: " + averageSimilarityPercentage);
		
		//currently if hungMxSimilairty is less than 2% then similarity is zero
		similarity = (double)Asset.CONNECTION_VALUE*hungMaxSimilarity;
		
		//System.out.println("similarity points out of "+Asset.CONNECTION_VALUE + "= "+ similarity);
		
		return similarity;
	}
	
	@Override
	    public boolean equals(Object o) {
	 
	        // If the object is compared with itself then return true  
	        if (o == this) {
	            return true;
	        }
	 
	        /* Check if o is an instance of Complex or not
	          "null instanceof [type]" also returns false */
	        if (!(o instanceof Asset)) {
	            return false;
	        }
	         
	        // typecast o to Complex so that we can compare data members 
	        Asset c = (Asset) o;
	        
	        
	        if(this.getName() == null || c.getName() == null) {
	        	return false;
	        }
	        
	     // compare based on having the same name
	        if(this.getName().equalsIgnoreCase(c.getName())) {
	        	return true;
	        }
	        
	        return false;
	  }
	  
	public void mergeConnections() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		
		if(canMergeConnections()) {
			//merge connections
			//define criteria to do the merging
			//criteria include: 
			//
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean canMergeConnections() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		//defines conditions upon which merging of connections can take place


		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean canMergeContainedAssets() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT

		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * This method merges assets that are similar to each other if found
	 * Similarity is defined by the method {@link #isSimilarTo(Asset)}
	 * <!-- end-user-doc -->
	 */
	public void mergeContainedAssets() {


		//
		if(!canMergeContainedAssets()) {
			return;
		}
		
		
	}

	public void abstractContainedAssets() {
		
		EList<? extends Asset> thisAssets = (EList)this.getContainedAssets();
		
		//create a new list of assets that are abstracts of the contained assets
		EList<Asset> abstractedAssets = new BasicEList< Asset>();
		
		for(Asset ast : thisAssets) {
			Asset astAbstract = ast.abstractAsset();
			if(astAbstract != null) {
				abstractedAssets.add(astAbstract);	
			} else { //else add the original asset
				abstractedAssets.add(ast);
			}
		}

			/*if(PhysicalAsset.class.isInstance(abstractedAsset)) {
				((PhysicalAsset)abstractedAsset).getContainedAssets().clear();
				((PhysicalAsset)abstractedAsset).getContainedAssets().addAll(abstractedAssets);
			} else if(DigitalAsset.class.isInstance(abstractedAsset)) {
				((DigitalAsset)abstractedAsset).getContainedAssets().clear();
				for(Asset as : abstractedAssets) {
					((DigitalAsset)abstractedAsset).getContainedAssets().add((DigitalAsset)as);
				}
			}*/
		abstractedAsset.getContainedAssets().clear();
		abstractedAsset.getContainedAssets().addAll((EList) abstractedAssets);
		
			
			//mergeContainedAssets();
	}
	
	public void abstractConnections() {

		for(Connection con : getConnections()) {
			Connection abstractedConnection = con.abstractConnection();
			if(abstractedConnection != null) {
				abstractedAsset.getConnections().add(abstractedConnection);
			}
		}
	}
	
//	public EList<? extends Asset> getContainedAssets() {
//		
//		/*EList<Asset> thisAssets = null;
//		EList<DigitalAsset> thisDigitalAssets = null;
//		
//		if(PhysicalAsset.class.isInstance(this)) {
//			thisAssets = ((PhysicalAsset)this).getContainedAssets();	
//		} else if(DigitalAsset.class.isInstance(this)) {
//			thisDigitalAssets = ((DigitalAsset)this).getContainedAssets();	
//		}
//			
//		//move digital assets to the assets variable
//		if(thisDigitalAssets != null) {
//			thisAssets = new BasicEList<Asset>();
//			for(DigitalAsset ast : thisDigitalAssets) {
//				thisAssets.add(ast);
//			}
//		}
//
//		if(thisAssets == null || thisAssets.size() == 0) {
//			return new BasicEList<Asset>();
//		}
//		*/
//		
//		//will never be called
//		
//		return new BasicEList();
//	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void mergeConnections(EList<Connection> connections) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		
		return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->

	 */
	public boolean canMergeConnections(EList<Connection> connections) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT


		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CyberPhysicalSystemPackage.ASSET__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case CyberPhysicalSystemPackage.ASSET__TYPE:
				return basicSetType(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc --
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CyberPhysicalSystemPackage.ASSET__CONNECTIONS:
				return getConnections();
			case CyberPhysicalSystemPackage.ASSET__NAME:
				return getName();
			case CyberPhysicalSystemPackage.ASSET__PROPERTY:
				return getProperty();
			case CyberPhysicalSystemPackage.ASSET__VALUE:
				return getValue();
			case CyberPhysicalSystemPackage.ASSET__TYPE:
				return getType();
			case CyberPhysicalSystemPackage.ASSET__DESCRIPTION:
				return getDescription();
			case CyberPhysicalSystemPackage.ASSET__VULNERABILITIES:
				return getVulnerabilities();
			case CyberPhysicalSystemPackage.ASSET__MOBILITY:
				return getMobility();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	private void removeDuplicates(Collection<Connection> connections) {

		Set<Connection> hs = new HashSet<Connection>();
		hs.addAll(connections);
		connections.clear();
		connections.addAll(hs);		
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CyberPhysicalSystemPackage.ASSET__CONNECTIONS:
				getConnections().clear();
				getConnections().addAll((Collection<? extends Connection>)newValue);
				return;
			case CyberPhysicalSystemPackage.ASSET__NAME:
				setName((String)newValue);
				return;
			case CyberPhysicalSystemPackage.ASSET__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case CyberPhysicalSystemPackage.ASSET__VALUE:
				setValue((Integer)newValue);
				return;
			case CyberPhysicalSystemPackage.ASSET__TYPE:
				setType((Type)newValue);
				return;
			case CyberPhysicalSystemPackage.ASSET__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CyberPhysicalSystemPackage.ASSET__VULNERABILITIES:
				getVulnerabilities().clear();
				getVulnerabilities().addAll((Collection<? extends Vulnerability>)newValue);
				return;
			case CyberPhysicalSystemPackage.ASSET__MOBILITY:
				setMobility((Mobility)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CyberPhysicalSystemPackage.ASSET__CONNECTIONS:
				getConnections().clear();
				return;
			case CyberPhysicalSystemPackage.ASSET__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CyberPhysicalSystemPackage.ASSET__PROPERTY:
				getProperty().clear();
				return;
			case CyberPhysicalSystemPackage.ASSET__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case CyberPhysicalSystemPackage.ASSET__TYPE:
				setType((Type)null);
				return;
			case CyberPhysicalSystemPackage.ASSET__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CyberPhysicalSystemPackage.ASSET__VULNERABILITIES:
				getVulnerabilities().clear();
				return;
			case CyberPhysicalSystemPackage.ASSET__MOBILITY:
				setMobility(MOBILITY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CyberPhysicalSystemPackage.ASSET__CONNECTIONS:
				return connections != null && !connections.isEmpty();
			case CyberPhysicalSystemPackage.ASSET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CyberPhysicalSystemPackage.ASSET__PROPERTY:
				return property != null && !property.isEmpty();
			case CyberPhysicalSystemPackage.ASSET__VALUE:
				return value != VALUE_EDEFAULT;
			case CyberPhysicalSystemPackage.ASSET__TYPE:
				return type != null;
			case CyberPhysicalSystemPackage.ASSET__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CyberPhysicalSystemPackage.ASSET__VULNERABILITIES:
				return vulnerabilities != null && !vulnerabilities.isEmpty();
			case CyberPhysicalSystemPackage.ASSET__MOBILITY:
				return mobility != MOBILITY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CyberPhysicalSystemPackage.ASSET___ABSTRACT_ASSET:
				return abstractAsset();
			case CyberPhysicalSystemPackage.ASSET___SIMILAR_TO__ASSET:
				return similarTo((Asset)arguments.get(0));
			case CyberPhysicalSystemPackage.ASSET___MERGE_CONNECTIONS:
				mergeConnections();
				return null;
			case CyberPhysicalSystemPackage.ASSET___CAN_MERGE_CONNECTIONS:
				return canMergeConnections();
			case CyberPhysicalSystemPackage.ASSET___CAN_MERGE_CONTAINED_ASSETS:
				return canMergeContainedAssets();
			case CyberPhysicalSystemPackage.ASSET___MERGE_CONTAINED_ASSETS:
				mergeContainedAssets();
				return null;
			case CyberPhysicalSystemPackage.ASSET___MERGE_CONNECTIONS__ELIST:
				mergeConnections((EList<Connection>)arguments.get(0));
				return null;
			case CyberPhysicalSystemPackage.ASSET___CAN_MERGE_CONNECTIONS__ELIST:
				return canMergeConnections((EList<Connection>)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", value: ");
		result.append(value);
		result.append(", description: ");
		result.append(description);
		result.append(", mobility: ");
		result.append(mobility);
		result.append(')');
		return result.toString();
	}

	public Asset getAbstractedAsset() {
		return abstractedAsset;
	}
	
	public void setAbstractedAsset(Asset ast) {
		
		if(ast == null) {
			isAbstracted = false;
		} else {
			isAbstracted = true;	
		}
		
		abstractedAsset = ast;
		
	}

	public boolean isAbstracted() {
		return isAbstracted;
	}

	public void setAbstracted(boolean isAbstracted) {
		this.isAbstracted = isAbstracted;
	}
	
	
} //AssetImpl
