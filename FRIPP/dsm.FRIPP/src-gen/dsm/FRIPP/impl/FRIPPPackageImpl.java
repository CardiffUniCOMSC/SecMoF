/**
 */
package dsm.FRIPP.impl;

import dependencyModel.DependencyModelPackage;

import dependencyModel.impl.DependencyModelPackageImpl;

import dsm.FRIPP.ActivityImpact;
import dsm.FRIPP.Actuator;
import dsm.FRIPP.ExternalReference;
import dsm.FRIPP.FRIPPFactory;
import dsm.FRIPP.FRIPPPackage;
import dsm.FRIPP.Organisation;
import dsm.FRIPP.PlaybookProcess;
import dsm.FRIPP.Role;

import dsm.PROVE.PROVEPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FRIPPPackageImpl extends EPackageImpl implements FRIPPPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass playbookProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actuatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityImpactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organisationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum objectiveS_ENUMEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actioN_TYPE_ENUMEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actuatoR_TYPE_ENUMEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum orchestratioN_SERVICE_CATEGORYEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum referencE_TYPE_ENUMEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum goalS_ENUMEEnum = null;

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
	 * @see dsm.FRIPP.FRIPPPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FRIPPPackageImpl() {
		super(eNS_URI, FRIPPFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FRIPPPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FRIPPPackage init() {
		if (isInited)
			return (FRIPPPackage) EPackage.Registry.INSTANCE.getEPackage(FRIPPPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredFRIPPPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		FRIPPPackageImpl theFRIPPPackage = registeredFRIPPPackage instanceof FRIPPPackageImpl
				? (FRIPPPackageImpl) registeredFRIPPPackage
				: new FRIPPPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		PROVEPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DependencyModelPackage.eNS_URI);
		DependencyModelPackageImpl theDependencyModelPackage = (DependencyModelPackageImpl) (registeredPackage instanceof DependencyModelPackageImpl
				? registeredPackage
				: DependencyModelPackage.eINSTANCE);

		// Create package meta-data objects
		theFRIPPPackage.createPackageContents();
		theDependencyModelPackage.createPackageContents();

		// Initialize created meta-data
		theFRIPPPackage.initializePackageContents();
		theDependencyModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFRIPPPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FRIPPPackage.eNS_URI, theFRIPPPackage);
		return theFRIPPPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlaybookProcess() {
		return playbookProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlaybookProcess_Objectives() {
		return (EAttribute) playbookProcessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlaybookProcess_ActionType() {
		return (EAttribute) playbookProcessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlaybookProcess_Relatedreferences() {
		return (EReference) playbookProcessEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlaybookProcess_Externalreferences() {
		return (EReference) playbookProcessEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlaybookProcess_Paragon() {
		return (EReference) playbookProcessEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlaybookProcess_Activityimpact() {
		return (EReference) playbookProcessEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlaybookProcess_AssociatedRole() {
		return (EReference) playbookProcessEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActuator() {
		return actuatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActuator_Type() {
		return (EAttribute) actuatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalReference() {
		return externalReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExternalReference_ReferenceType() {
		return (EAttribute) externalReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExternalReference_Name() {
		return (EAttribute) externalReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActivityImpact() {
		return activityImpactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivityImpact_Paragon() {
		return (EReference) activityImpactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActivityImpact_NewValue() {
		return (EAttribute) activityImpactEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActivityImpact_OriginalType() {
		return (EAttribute) activityImpactEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActivityImpact_OriginalProbability() {
		return (EAttribute) activityImpactEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrganisation() {
		return organisationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrganisation_Playbookprocess() {
		return (EReference) organisationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrganisation_Role() {
		return (EReference) organisationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getOBJECTIVES_ENUM() {
		return objectiveS_ENUMEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getACTION_TYPE_ENUM() {
		return actioN_TYPE_ENUMEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getACTUATOR_TYPE_ENUM() {
		return actuatoR_TYPE_ENUMEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getORCHESTRATION_SERVICE_CATEGORY() {
		return orchestratioN_SERVICE_CATEGORYEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getREFERENCE_TYPE_ENUM() {
		return referencE_TYPE_ENUMEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getGOALS_ENUM() {
		return goalS_ENUMEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FRIPPFactory getFRIPPFactory() {
		return (FRIPPFactory) getEFactoryInstance();
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
		playbookProcessEClass = createEClass(PLAYBOOK_PROCESS);
		createEAttribute(playbookProcessEClass, PLAYBOOK_PROCESS__OBJECTIVES);
		createEAttribute(playbookProcessEClass, PLAYBOOK_PROCESS__ACTION_TYPE);
		createEReference(playbookProcessEClass, PLAYBOOK_PROCESS__RELATEDREFERENCES);
		createEReference(playbookProcessEClass, PLAYBOOK_PROCESS__EXTERNALREFERENCES);
		createEReference(playbookProcessEClass, PLAYBOOK_PROCESS__PARAGON);
		createEReference(playbookProcessEClass, PLAYBOOK_PROCESS__ACTIVITYIMPACT);
		createEReference(playbookProcessEClass, PLAYBOOK_PROCESS__ASSOCIATED_ROLE);

		actuatorEClass = createEClass(ACTUATOR);
		createEAttribute(actuatorEClass, ACTUATOR__TYPE);

		externalReferenceEClass = createEClass(EXTERNAL_REFERENCE);
		createEAttribute(externalReferenceEClass, EXTERNAL_REFERENCE__REFERENCE_TYPE);
		createEAttribute(externalReferenceEClass, EXTERNAL_REFERENCE__NAME);

		activityImpactEClass = createEClass(ACTIVITY_IMPACT);
		createEReference(activityImpactEClass, ACTIVITY_IMPACT__PARAGON);
		createEAttribute(activityImpactEClass, ACTIVITY_IMPACT__NEW_VALUE);
		createEAttribute(activityImpactEClass, ACTIVITY_IMPACT__ORIGINAL_TYPE);
		createEAttribute(activityImpactEClass, ACTIVITY_IMPACT__ORIGINAL_PROBABILITY);

		roleEClass = createEClass(ROLE);

		organisationEClass = createEClass(ORGANISATION);
		createEReference(organisationEClass, ORGANISATION__PLAYBOOKPROCESS);
		createEReference(organisationEClass, ORGANISATION__ROLE);

		// Create enums
		objectiveS_ENUMEEnum = createEEnum(OBJECTIVES_ENUM);
		actioN_TYPE_ENUMEEnum = createEEnum(ACTION_TYPE_ENUM);
		actuatoR_TYPE_ENUMEEnum = createEEnum(ACTUATOR_TYPE_ENUM);
		orchestratioN_SERVICE_CATEGORYEEnum = createEEnum(ORCHESTRATION_SERVICE_CATEGORY);
		referencE_TYPE_ENUMEEnum = createEEnum(REFERENCE_TYPE_ENUM);
		goalS_ENUMEEnum = createEEnum(GOALS_ENUM);
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

		// Obtain other dependent packages
		PROVEPackage thePROVEPackage = (PROVEPackage) EPackage.Registry.INSTANCE.getEPackage(PROVEPackage.eNS_URI);
		DependencyModelPackage theDependencyModelPackage = (DependencyModelPackage) EPackage.Registry.INSTANCE
				.getEPackage(DependencyModelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		playbookProcessEClass.getESuperTypes().add(thePROVEPackage.getProcess());
		actuatorEClass.getESuperTypes().add(thePROVEPackage.getResource());

		// Initialize classes, features, and operations; add parameters
		initEClass(playbookProcessEClass, PlaybookProcess.class, "PlaybookProcess", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlaybookProcess_Objectives(), this.getOBJECTIVES_ENUM(), "objectives", null, 0, -1,
				PlaybookProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlaybookProcess_ActionType(), this.getACTION_TYPE_ENUM(), "actionType", "MANUAL", 0, 1,
				PlaybookProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getPlaybookProcess_Relatedreferences(), this.getExternalReference(), null, "relatedreferences",
				null, 0, -1, PlaybookProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlaybookProcess_Externalreferences(), this.getExternalReference(), null, "externalreferences",
				null, 0, -1, PlaybookProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlaybookProcess_Paragon(), theDependencyModelPackage.getParagon(), null, "paragon", null, 0,
				1, PlaybookProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlaybookProcess_Activityimpact(), this.getActivityImpact(), null, "activityimpact", null, 0,
				-1, PlaybookProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlaybookProcess_AssociatedRole(), this.getRole(), null, "associatedRole", null, 0, -1,
				PlaybookProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actuatorEClass, Actuator.class, "Actuator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActuator_Type(), this.getACTUATOR_TYPE_ENUM(), "type", "HUMAN", 0, 1, Actuator.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalReferenceEClass, ExternalReference.class, "ExternalReference", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalReference_ReferenceType(), this.getREFERENCE_TYPE_ENUM(), "referenceType",
				"BEST_PRACTICE", 0, 1, ExternalReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalReference_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				ExternalReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(activityImpactEClass, ActivityImpact.class, "ActivityImpact", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityImpact_Paragon(), theDependencyModelPackage.getParagon(), null, "paragon", null, 0, 1,
				ActivityImpact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivityImpact_NewValue(), ecorePackage.getEDouble(), "newValue", null, 0, 1,
				ActivityImpact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivityImpact_OriginalType(), theDependencyModelPackage.getPARAGON_COMPOSITION_ENUM(),
				"originalType", "", 0, 1, ActivityImpact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivityImpact_OriginalProbability(), ecorePackage.getEDouble(), "originalProbability", null,
				0, 1, ActivityImpact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(organisationEClass, Organisation.class, "Organisation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrganisation_Playbookprocess(), this.getPlaybookProcess(), null, "playbookprocess", null, 0,
				-1, Organisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganisation_Role(), this.getRole(), null, "role", null, 0, -1, Organisation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(objectiveS_ENUMEEnum, dsm.FRIPP.OBJECTIVES_ENUM.class, "OBJECTIVES_ENUM");
		addEEnumLiteral(objectiveS_ENUMEEnum, dsm.FRIPP.OBJECTIVES_ENUM.INVESTIGATION);
		addEEnumLiteral(objectiveS_ENUMEEnum, dsm.FRIPP.OBJECTIVES_ENUM.MITIGATION);
		addEEnumLiteral(objectiveS_ENUMEEnum, dsm.FRIPP.OBJECTIVES_ENUM.REMEDIATION);
		addEEnumLiteral(objectiveS_ENUMEEnum, dsm.FRIPP.OBJECTIVES_ENUM.PREVENTION);

		initEEnum(actioN_TYPE_ENUMEEnum, dsm.FRIPP.ACTION_TYPE_ENUM.class, "ACTION_TYPE_ENUM");
		addEEnumLiteral(actioN_TYPE_ENUMEEnum, dsm.FRIPP.ACTION_TYPE_ENUM.MANUAL);
		addEEnumLiteral(actioN_TYPE_ENUMEEnum, dsm.FRIPP.ACTION_TYPE_ENUM.AUTOMATIC);
		addEEnumLiteral(actioN_TYPE_ENUMEEnum, dsm.FRIPP.ACTION_TYPE_ENUM.DUAL);
		addEEnumLiteral(actioN_TYPE_ENUMEEnum, dsm.FRIPP.ACTION_TYPE_ENUM.UNKNOWN);

		initEEnum(actuatoR_TYPE_ENUMEEnum, dsm.FRIPP.ACTUATOR_TYPE_ENUM.class, "ACTUATOR_TYPE_ENUM");
		addEEnumLiteral(actuatoR_TYPE_ENUMEEnum, dsm.FRIPP.ACTUATOR_TYPE_ENUM.HUMAN);
		addEEnumLiteral(actuatoR_TYPE_ENUMEEnum, dsm.FRIPP.ACTUATOR_TYPE_ENUM.MACHINE);

		initEEnum(orchestratioN_SERVICE_CATEGORYEEnum, dsm.FRIPP.ORCHESTRATION_SERVICE_CATEGORY.class,
				"ORCHESTRATION_SERVICE_CATEGORY");

		initEEnum(referencE_TYPE_ENUMEEnum, dsm.FRIPP.REFERENCE_TYPE_ENUM.class, "REFERENCE_TYPE_ENUM");
		addEEnumLiteral(referencE_TYPE_ENUMEEnum, dsm.FRIPP.REFERENCE_TYPE_ENUM.BEST_PRACTICE);
		addEEnumLiteral(referencE_TYPE_ENUMEEnum, dsm.FRIPP.REFERENCE_TYPE_ENUM.POLICY);
		addEEnumLiteral(referencE_TYPE_ENUMEEnum, dsm.FRIPP.REFERENCE_TYPE_ENUM.REGULATION);

		initEEnum(goalS_ENUMEEnum, dsm.FRIPP.GOALS_ENUM.class, "GOALS_ENUM");
		addEEnumLiteral(goalS_ENUMEEnum, dsm.FRIPP.GOALS_ENUM.MAKE_SYSTEM_SAFE);
		addEEnumLiteral(goalS_ENUMEEnum, dsm.FRIPP.GOALS_ENUM.PRESERVE_EVIDENCE);
		addEEnumLiteral(goalS_ENUMEEnum, dsm.FRIPP.GOALS_ENUM.ESTABLISH_COMMUNICATION);
		addEEnumLiteral(goalS_ENUMEEnum, dsm.FRIPP.GOALS_ENUM.MAKE_DECISION);

		// Create resource
		createResource(eNS_URI);
	}

} //FRIPPPackageImpl
