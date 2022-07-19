/**
 */
package dependencyModel.impl;

import dependencyModel.DependencyModelFactory;
import dependencyModel.DependencyModelPackage;
import dependencyModel.Paragon;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import symbiosisDM.SymbiosisDMPackage;

import symbiosisDM.impl.SymbiosisDMPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DependencyModelPackageImpl extends EPackageImpl implements DependencyModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paragonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum paragoN_COMPOSITION_ENUMEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see dependencyModel.DependencyModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DependencyModelPackageImpl() {
		super(eNS_URI, DependencyModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link DependencyModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DependencyModelPackage init() {
		if (isInited)
			return (DependencyModelPackage) EPackage.Registry.INSTANCE.getEPackage(DependencyModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDependencyModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DependencyModelPackageImpl theDependencyModelPackage = registeredDependencyModelPackage instanceof DependencyModelPackageImpl
				? (DependencyModelPackageImpl) registeredDependencyModelPackage
				: new DependencyModelPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SymbiosisDMPackage.eNS_URI);
		SymbiosisDMPackageImpl theSymbiosisDMPackage = (SymbiosisDMPackageImpl) (registeredPackage instanceof SymbiosisDMPackageImpl
				? registeredPackage
				: SymbiosisDMPackage.eINSTANCE);

		// Create package meta-data objects
		theDependencyModelPackage.createPackageContents();
		theSymbiosisDMPackage.createPackageContents();

		// Initialize created meta-data
		theDependencyModelPackage.initializePackageContents();
		theSymbiosisDMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDependencyModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DependencyModelPackage.eNS_URI, theDependencyModelPackage);
		return theDependencyModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParagon() {
		return paragonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParagon_Description() {
		return (EAttribute) paragonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParagon_Probability() {
		return (EAttribute) paragonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParagon_Paragon() {
		return (EReference) paragonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParagon_Type() {
		return (EAttribute) paragonEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPARAGON_COMPOSITION_ENUM() {
		return paragoN_COMPOSITION_ENUMEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DependencyModelFactory getDependencyModelFactory() {
		return (DependencyModelFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		paragonEClass = createEClass(PARAGON);
		createEAttribute(paragonEClass, PARAGON__DESCRIPTION);
		createEAttribute(paragonEClass, PARAGON__PROBABILITY);
		createEReference(paragonEClass, PARAGON__PARAGON);
		createEAttribute(paragonEClass, PARAGON__TYPE);

		// Create enums
		paragoN_COMPOSITION_ENUMEEnum = createEEnum(PARAGON_COMPOSITION_ENUM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(paragonEClass, Paragon.class, "Paragon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParagon_Description(), ecorePackage.getEString(), "description", null, 0, 1, Paragon.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParagon_Probability(), ecorePackage.getEDouble(), "probability", "0.0", 1, 1, Paragon.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getParagon_Paragon(), this.getParagon(), null, "paragon", null, 0, -1, Paragon.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParagon_Type(), this.getPARAGON_COMPOSITION_ENUM(), "Type", "UNCONTROLLABLE", 0, 1,
				Paragon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(paragoN_COMPOSITION_ENUMEEnum, dependencyModel.PARAGON_COMPOSITION_ENUM.class,
				"PARAGON_COMPOSITION_ENUM");
		addEEnumLiteral(paragoN_COMPOSITION_ENUMEEnum, dependencyModel.PARAGON_COMPOSITION_ENUM.AND);
		addEEnumLiteral(paragoN_COMPOSITION_ENUMEEnum, dependencyModel.PARAGON_COMPOSITION_ENUM.OR);
		addEEnumLiteral(paragoN_COMPOSITION_ENUMEEnum, dependencyModel.PARAGON_COMPOSITION_ENUM.UNCONTROLLABLE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation(this, source, new String[] { "ecore", "http://www.eclipse.org/emf/2002/Ecore" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source,
				new String[] { "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL", "settingDelegates",
						"http://www.eclipse.org/emf/2002/Ecore/OCL", "validationDelegates",
						"http://www.eclipse.org/emf/2002/Ecore/OCL" });
	}

} //DependencyModelPackageImpl
