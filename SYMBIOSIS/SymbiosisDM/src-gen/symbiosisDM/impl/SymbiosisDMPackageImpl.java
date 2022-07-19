/**
 */
package symbiosisDM.impl;

import dependencyModel.DependencyModelPackage;

import dependencyModel.impl.DependencyModelPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import symbiosisDM.BaseMeasurement;
import symbiosisDM.BusinessObjective;
import symbiosisDM.SecurityMeasurementGoal;
import symbiosisDM.SecurityMetric;
import symbiosisDM.SymbiosisDMFactory;
import symbiosisDM.SymbiosisDMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SymbiosisDMPackageImpl extends EPackageImpl implements SymbiosisDMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessObjectiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityMeasurementGoalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseMeasurementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symbiosisEClass = null;

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
	 * @see symbiosisDM.SymbiosisDMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SymbiosisDMPackageImpl() {
		super(eNS_URI, SymbiosisDMFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SymbiosisDMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SymbiosisDMPackage init() {
		if (isInited)
			return (SymbiosisDMPackage) EPackage.Registry.INSTANCE.getEPackage(SymbiosisDMPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSymbiosisDMPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SymbiosisDMPackageImpl theSymbiosisDMPackage = registeredSymbiosisDMPackage instanceof SymbiosisDMPackageImpl
				? (SymbiosisDMPackageImpl) registeredSymbiosisDMPackage
				: new SymbiosisDMPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DependencyModelPackage.eNS_URI);
		DependencyModelPackageImpl theDependencyModelPackage = (DependencyModelPackageImpl) (registeredPackage instanceof DependencyModelPackageImpl
				? registeredPackage
				: DependencyModelPackage.eINSTANCE);

		// Create package meta-data objects
		theSymbiosisDMPackage.createPackageContents();
		theDependencyModelPackage.createPackageContents();

		// Initialize created meta-data
		theSymbiosisDMPackage.initializePackageContents();
		theDependencyModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSymbiosisDMPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SymbiosisDMPackage.eNS_URI, theSymbiosisDMPackage);
		return theSymbiosisDMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessObjective() {
		return businessObjectiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessObjective_Object() {
		return (EAttribute) businessObjectiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessObjective_Scope() {
		return (EAttribute) businessObjectiveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessObjective_Purpose() {
		return (EAttribute) businessObjectiveEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessObjective_Viewpoint() {
		return (EAttribute) businessObjectiveEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessObjective_Context() {
		return (EAttribute) businessObjectiveEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessObjective_RelatedBusinessobjective() {
		return (EReference) businessObjectiveEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessObjective_Paragon() {
		return (EReference) businessObjectiveEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityMeasurementGoal() {
		return securityMeasurementGoalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityMeasurementGoal_Viewpoint() {
		return (EAttribute) securityMeasurementGoalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityMeasurementGoal_Context() {
		return (EAttribute) securityMeasurementGoalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityMeasurementGoal_Scope() {
		return (EAttribute) securityMeasurementGoalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityMeasurementGoal_Object() {
		return (EAttribute) securityMeasurementGoalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityMeasurementGoal_Purpose() {
		return (EAttribute) securityMeasurementGoalEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityMeasurementGoal_Focus() {
		return (EAttribute) securityMeasurementGoalEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityMeasurementGoal_Criteria() {
		return (EAttribute) securityMeasurementGoalEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityMeasurementGoal_Businessobjective() {
		return (EReference) securityMeasurementGoalEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityMeasurementGoal_Paragon() {
		return (EReference) securityMeasurementGoalEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityMetric() {
		return securityMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityMetric_Description() {
		return (EAttribute) securityMetricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityMetric_Goal() {
		return (EAttribute) securityMetricEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityMetric_Basemeasurement() {
		return (EReference) securityMetricEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityMetric_Method() {
		return (EAttribute) securityMetricEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityMetric_Function() {
		return (EAttribute) securityMetricEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityMetric_Interpretation() {
		return (EAttribute) securityMetricEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityMetric_Reporting() {
		return (EAttribute) securityMetricEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityMetric_Securitymeasurementgoal() {
		return (EReference) securityMetricEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseMeasurement() {
		return baseMeasurementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseMeasurement_Description() {
		return (EAttribute) baseMeasurementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSYMBIOSIS() {
		return symbiosisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSYMBIOSIS_Businessobjective() {
		return (EReference) symbiosisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSYMBIOSIS_Securitymeasurementgoal() {
		return (EReference) symbiosisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSYMBIOSIS_Securitymetric() {
		return (EReference) symbiosisEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSYMBIOSIS_Basemeasurement() {
		return (EReference) symbiosisEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSYMBIOSIS_DependencyModel() {
		return (EReference) symbiosisEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbiosisDMFactory getSymbiosisDMFactory() {
		return (SymbiosisDMFactory) getEFactoryInstance();
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
		businessObjectiveEClass = createEClass(BUSINESS_OBJECTIVE);
		createEAttribute(businessObjectiveEClass, BUSINESS_OBJECTIVE__OBJECT);
		createEAttribute(businessObjectiveEClass, BUSINESS_OBJECTIVE__SCOPE);
		createEAttribute(businessObjectiveEClass, BUSINESS_OBJECTIVE__PURPOSE);
		createEAttribute(businessObjectiveEClass, BUSINESS_OBJECTIVE__VIEWPOINT);
		createEAttribute(businessObjectiveEClass, BUSINESS_OBJECTIVE__CONTEXT);
		createEReference(businessObjectiveEClass, BUSINESS_OBJECTIVE__RELATED_BUSINESSOBJECTIVE);
		createEReference(businessObjectiveEClass, BUSINESS_OBJECTIVE__PARAGON);

		securityMeasurementGoalEClass = createEClass(SECURITY_MEASUREMENT_GOAL);
		createEAttribute(securityMeasurementGoalEClass, SECURITY_MEASUREMENT_GOAL__OBJECT);
		createEAttribute(securityMeasurementGoalEClass, SECURITY_MEASUREMENT_GOAL__VIEWPOINT);
		createEAttribute(securityMeasurementGoalEClass, SECURITY_MEASUREMENT_GOAL__CONTEXT);
		createEAttribute(securityMeasurementGoalEClass, SECURITY_MEASUREMENT_GOAL__SCOPE);
		createEAttribute(securityMeasurementGoalEClass, SECURITY_MEASUREMENT_GOAL__PURPOSE);
		createEAttribute(securityMeasurementGoalEClass, SECURITY_MEASUREMENT_GOAL__FOCUS);
		createEAttribute(securityMeasurementGoalEClass, SECURITY_MEASUREMENT_GOAL__CRITERIA);
		createEReference(securityMeasurementGoalEClass, SECURITY_MEASUREMENT_GOAL__BUSINESSOBJECTIVE);
		createEReference(securityMeasurementGoalEClass, SECURITY_MEASUREMENT_GOAL__PARAGON);

		securityMetricEClass = createEClass(SECURITY_METRIC);
		createEAttribute(securityMetricEClass, SECURITY_METRIC__DESCRIPTION);
		createEAttribute(securityMetricEClass, SECURITY_METRIC__GOAL);
		createEReference(securityMetricEClass, SECURITY_METRIC__BASEMEASUREMENT);
		createEAttribute(securityMetricEClass, SECURITY_METRIC__METHOD);
		createEAttribute(securityMetricEClass, SECURITY_METRIC__FUNCTION);
		createEAttribute(securityMetricEClass, SECURITY_METRIC__INTERPRETATION);
		createEAttribute(securityMetricEClass, SECURITY_METRIC__REPORTING);
		createEReference(securityMetricEClass, SECURITY_METRIC__SECURITYMEASUREMENTGOAL);

		baseMeasurementEClass = createEClass(BASE_MEASUREMENT);
		createEAttribute(baseMeasurementEClass, BASE_MEASUREMENT__DESCRIPTION);

		symbiosisEClass = createEClass(SYMBIOSIS);
		createEReference(symbiosisEClass, SYMBIOSIS__BUSINESSOBJECTIVE);
		createEReference(symbiosisEClass, SYMBIOSIS__SECURITYMEASUREMENTGOAL);
		createEReference(symbiosisEClass, SYMBIOSIS__SECURITYMETRIC);
		createEReference(symbiosisEClass, SYMBIOSIS__BASEMEASUREMENT);
		createEReference(symbiosisEClass, SYMBIOSIS__DEPENDENCY_MODEL);
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
		DependencyModelPackage theDependencyModelPackage = (DependencyModelPackage) EPackage.Registry.INSTANCE
				.getEPackage(DependencyModelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(businessObjectiveEClass, BusinessObjective.class, "BusinessObjective", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBusinessObjective_Object(), ecorePackage.getEString(), "object", null, 0, 1,
				BusinessObjective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessObjective_Scope(), ecorePackage.getEString(), "scope", null, 0, 1,
				BusinessObjective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessObjective_Purpose(), ecorePackage.getEString(), "purpose", null, 0, 1,
				BusinessObjective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessObjective_Viewpoint(), ecorePackage.getEString(), "viewpoint", null, 0, 1,
				BusinessObjective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getBusinessObjective_Context(), ecorePackage.getEString(), "context", null, 0, 1,
				BusinessObjective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessObjective_RelatedBusinessobjective(), this.getBusinessObjective(), null,
				"relatedBusinessobjective", null, 0, -1, BusinessObjective.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBusinessObjective_Paragon(), theDependencyModelPackage.getParagon(), null, "paragon", null, 0,
				1, BusinessObjective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityMeasurementGoalEClass, SecurityMeasurementGoal.class, "SecurityMeasurementGoal",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecurityMeasurementGoal_Object(), ecorePackage.getEString(), "object", null, 0, 1,
				SecurityMeasurementGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID,
				IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityMeasurementGoal_Viewpoint(), ecorePackage.getEString(), "viewpoint", null, 0, 1,
				SecurityMeasurementGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				!IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityMeasurementGoal_Context(), ecorePackage.getEString(), "context", null, 0, 1,
				SecurityMeasurementGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityMeasurementGoal_Scope(), ecorePackage.getEString(), "scope", null, 0, 1,
				SecurityMeasurementGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityMeasurementGoal_Purpose(), ecorePackage.getEString(), "purpose", null, 0, 1,
				SecurityMeasurementGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityMeasurementGoal_Focus(), ecorePackage.getEString(), "focus", null, 0, 1,
				SecurityMeasurementGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityMeasurementGoal_Criteria(), ecorePackage.getEString(), "criteria", null, 0, 1,
				SecurityMeasurementGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityMeasurementGoal_Businessobjective(), this.getBusinessObjective(), null,
				"businessobjective", null, 0, -1, SecurityMeasurementGoal.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityMeasurementGoal_Paragon(), theDependencyModelPackage.getParagon(), null, "paragon",
				null, 0, 1, SecurityMeasurementGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityMetricEClass, SecurityMetric.class, "SecurityMetric", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecurityMetric_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				SecurityMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityMetric_Goal(), ecorePackage.getEString(), "goal", null, 0, 1, SecurityMetric.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityMetric_Basemeasurement(), this.getBaseMeasurement(), null, "basemeasurement", null, 0,
				-1, SecurityMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityMetric_Method(), ecorePackage.getEString(), "method", null, 0, 1,
				SecurityMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityMetric_Function(), ecorePackage.getEString(), "function", null, 0, 1,
				SecurityMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityMetric_Interpretation(), ecorePackage.getEString(), "interpretation", null, 0, 1,
				SecurityMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityMetric_Reporting(), ecorePackage.getEString(), "reporting", null, 0, 1,
				SecurityMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityMetric_Securitymeasurementgoal(), this.getSecurityMeasurementGoal(), null,
				"securitymeasurementgoal", null, 0, -1, SecurityMetric.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(baseMeasurementEClass, BaseMeasurement.class, "BaseMeasurement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBaseMeasurement_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				BaseMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(symbiosisEClass, symbiosisDM.SYMBIOSIS.class, "SYMBIOSIS", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSYMBIOSIS_Businessobjective(), this.getBusinessObjective(), null, "businessobjective", null,
				0, -1, symbiosisDM.SYMBIOSIS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSYMBIOSIS_Securitymeasurementgoal(), this.getSecurityMeasurementGoal(), null,
				"securitymeasurementgoal", null, 0, -1, symbiosisDM.SYMBIOSIS.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSYMBIOSIS_Securitymetric(), this.getSecurityMetric(), null, "securitymetric", null, 0, -1,
				symbiosisDM.SYMBIOSIS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSYMBIOSIS_Basemeasurement(), this.getBaseMeasurement(), null, "basemeasurement", null, 0, -1,
				symbiosisDM.SYMBIOSIS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSYMBIOSIS_DependencyModel(), theDependencyModelPackage.getParagon(), null, "dependencyModel",
				null, 0, -1, symbiosisDM.SYMBIOSIS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SymbiosisDMPackageImpl
