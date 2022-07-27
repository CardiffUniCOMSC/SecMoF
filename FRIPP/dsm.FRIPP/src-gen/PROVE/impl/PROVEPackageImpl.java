/**
 */
package PROVE.impl;

import PROVE.Artifact;
import PROVE.ArtifactState;
import PROVE.ArtifactStateInstance;
import PROVE.PROVEFactory;
import PROVE.PROVEPackage;
import PROVE.Resource;
import PROVE.ShadowNodeIncoming;
import PROVE.ShadowNodeOutgoing;
import PROVE.ShadowNodeTypeENUM;

import dependencyModel.DependencyModelPackage;

import dependencyModel.impl.DependencyModelPackageImpl;

import dsm.FRIPP.FRIPPPackage;

import dsm.FRIPP.impl.FRIPPPackageImpl;

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
public class PROVEPackageImpl extends EPackageImpl implements PROVEPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shadowNodeIncomingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shadowNodeOutgoingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactStateInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum shadowNodeTypeENUMEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum statuS_ENUMEEnum = null;

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
	 * @see PROVE.PROVEPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PROVEPackageImpl() {
		super(eNS_URI, PROVEFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PROVEPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PROVEPackage init() {
		if (isInited)
			return (PROVEPackage) EPackage.Registry.INSTANCE.getEPackage(PROVEPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPROVEPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PROVEPackageImpl thePROVEPackage = registeredPROVEPackage instanceof PROVEPackageImpl
				? (PROVEPackageImpl) registeredPROVEPackage
				: new PROVEPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FRIPPPackage.eNS_URI);
		FRIPPPackageImpl theFRIPPPackage = (FRIPPPackageImpl) (registeredPackage instanceof FRIPPPackageImpl
				? registeredPackage
				: FRIPPPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DependencyModelPackage.eNS_URI);
		DependencyModelPackageImpl theDependencyModelPackage = (DependencyModelPackageImpl) (registeredPackage instanceof DependencyModelPackageImpl
				? registeredPackage
				: DependencyModelPackage.eINSTANCE);

		// Create package meta-data objects
		thePROVEPackage.createPackageContents();
		theFRIPPPackage.createPackageContents();
		theDependencyModelPackage.createPackageContents();

		// Initialize created meta-data
		thePROVEPackage.initializePackageContents();
		theFRIPPPackage.initializePackageContents();
		theDependencyModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePROVEPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PROVEPackage.eNS_URI, thePROVEPackage);
		return thePROVEPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArtifact() {
		return artifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArtifact_State() {
		return (EReference) artifactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArtifact_Name() {
		return (EAttribute) artifactEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArtifactState() {
		return artifactStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArtifactState_AchievedStatus() {
		return (EAttribute) artifactStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArtifactState_ArtifactName() {
		return (EAttribute) artifactStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArtifactState_Artifactstateinstance() {
		return (EReference) artifactStateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArtifactState_Name() {
		return (EAttribute) artifactStateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcess() {
		return processEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcess_Artifact() {
		return (EReference) processEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcess_Process() {
		return (EReference) processEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcess_Name() {
		return (EAttribute) processEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcess_Notes() {
		return (EAttribute) processEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcess_ArtifactInStateUsed() {
		return (EReference) processEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcess_ResultArtifactInState() {
		return (EReference) processEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcess_Shadownodeincoming() {
		return (EReference) processEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcess_Shadownodeoutgoing() {
		return (EReference) processEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcess_StartDate() {
		return (EAttribute) processEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcess_EndDate() {
		return (EAttribute) processEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcess_Resource() {
		return (EReference) processEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcess_ResourceUsed() {
		return (EReference) processEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcess_Status() {
		return (EAttribute) processEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShadowNodeIncoming() {
		return shadowNodeIncomingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShadowNodeOutgoing() {
		return shadowNodeOutgoingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArtifactStateInstance() {
		return artifactStateInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArtifactStateInstance_UsedByActivity() {
		return (EReference) artifactStateInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArtifactStateInstance_OriginatingActivity() {
		return (EReference) artifactStateInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResource_Name() {
		return (EAttribute) resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResource_Resource() {
		return (EReference) resourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getShadowNodeTypeENUM() {
		return shadowNodeTypeENUMEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSTATUS_ENUM() {
		return statuS_ENUMEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PROVEFactory getPROVEFactory() {
		return (PROVEFactory) getEFactoryInstance();
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
		artifactEClass = createEClass(ARTIFACT);
		createEReference(artifactEClass, ARTIFACT__STATE);
		createEAttribute(artifactEClass, ARTIFACT__NAME);

		artifactStateEClass = createEClass(ARTIFACT_STATE);
		createEAttribute(artifactStateEClass, ARTIFACT_STATE__ACHIEVED_STATUS);
		createEAttribute(artifactStateEClass, ARTIFACT_STATE__ARTIFACT_NAME);
		createEReference(artifactStateEClass, ARTIFACT_STATE__ARTIFACTSTATEINSTANCE);
		createEAttribute(artifactStateEClass, ARTIFACT_STATE__NAME);

		processEClass = createEClass(PROCESS);
		createEReference(processEClass, PROCESS__ARTIFACT);
		createEReference(processEClass, PROCESS__PROCESS);
		createEAttribute(processEClass, PROCESS__NAME);
		createEAttribute(processEClass, PROCESS__NOTES);
		createEReference(processEClass, PROCESS__ARTIFACT_IN_STATE_USED);
		createEReference(processEClass, PROCESS__RESULT_ARTIFACT_IN_STATE);
		createEReference(processEClass, PROCESS__SHADOWNODEINCOMING);
		createEReference(processEClass, PROCESS__SHADOWNODEOUTGOING);
		createEAttribute(processEClass, PROCESS__START_DATE);
		createEAttribute(processEClass, PROCESS__END_DATE);
		createEReference(processEClass, PROCESS__RESOURCE);
		createEReference(processEClass, PROCESS__RESOURCE_USED);
		createEAttribute(processEClass, PROCESS__STATUS);

		shadowNodeIncomingEClass = createEClass(SHADOW_NODE_INCOMING);

		shadowNodeOutgoingEClass = createEClass(SHADOW_NODE_OUTGOING);

		artifactStateInstanceEClass = createEClass(ARTIFACT_STATE_INSTANCE);
		createEReference(artifactStateInstanceEClass, ARTIFACT_STATE_INSTANCE__USED_BY_ACTIVITY);
		createEReference(artifactStateInstanceEClass, ARTIFACT_STATE_INSTANCE__ORIGINATING_ACTIVITY);

		resourceEClass = createEClass(RESOURCE);
		createEAttribute(resourceEClass, RESOURCE__NAME);
		createEReference(resourceEClass, RESOURCE__RESOURCE);

		// Create enums
		shadowNodeTypeENUMEEnum = createEEnum(SHADOW_NODE_TYPE_ENUM);
		statuS_ENUMEEnum = createEEnum(STATUS_ENUM);
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
		shadowNodeIncomingEClass.getESuperTypes().add(this.getProcess());
		shadowNodeOutgoingEClass.getESuperTypes().add(this.getProcess());

		// Initialize classes, features, and operations; add parameters
		initEClass(artifactEClass, Artifact.class, "Artifact", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArtifact_State(), this.getArtifactState(), null, "state", null, 0, -1, Artifact.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtifact_Name(), ecorePackage.getEString(), "name", null, 0, 1, Artifact.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(artifactStateEClass, ArtifactState.class, "ArtifactState", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArtifactState_AchievedStatus(), ecorePackage.getEBoolean(), "achievedStatus", null, 0, 1,
				ArtifactState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtifactState_ArtifactName(), ecorePackage.getEString(), "artifactName", null, 0, 1,
				ArtifactState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getArtifactState_Artifactstateinstance(), this.getArtifactStateInstance(), null,
				"artifactstateinstance", null, 0, -1, ArtifactState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtifactState_Name(), ecorePackage.getEString(), "name", null, 0, 1, ArtifactState.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processEClass, PROVE.Process.class, "Process", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcess_Artifact(), this.getArtifact(), null, "artifact", null, 0, -1, PROVE.Process.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_Process(), this.getProcess(), null, "process", null, 0, -1, PROVE.Process.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcess_Name(), ecorePackage.getEString(), "name", null, 0, 1, PROVE.Process.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcess_Notes(), ecorePackage.getEString(), "notes", null, 0, 1, PROVE.Process.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_ArtifactInStateUsed(), this.getArtifactStateInstance(),
				this.getArtifactStateInstance_UsedByActivity(), "artifactInStateUsed", null, 0, -1, PROVE.Process.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_ResultArtifactInState(), this.getArtifactStateInstance(),
				this.getArtifactStateInstance_OriginatingActivity(), "resultArtifactInState", null, 0, -1,
				PROVE.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_Shadownodeincoming(), this.getShadowNodeIncoming(), null, "shadownodeincoming", null,
				0, 1, PROVE.Process.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_Shadownodeoutgoing(), this.getShadowNodeOutgoing(), null, "shadownodeoutgoing", null,
				0, 1, PROVE.Process.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcess_StartDate(), ecorePackage.getEDate(), "startDate", null, 0, 1, PROVE.Process.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcess_EndDate(), ecorePackage.getEDate(), "endDate", null, 0, 1, PROVE.Process.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_Resource(), this.getResource(), null, "resource", null, 0, -1, PROVE.Process.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_ResourceUsed(), this.getResource(), null, "resourceUsed", null, 0, -1,
				PROVE.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcess_Status(), this.getSTATUS_ENUM(), "status", null, 0, 1, PROVE.Process.class,
				IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(shadowNodeIncomingEClass, ShadowNodeIncoming.class, "ShadowNodeIncoming", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(shadowNodeOutgoingEClass, ShadowNodeOutgoing.class, "ShadowNodeOutgoing", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(artifactStateInstanceEClass, ArtifactStateInstance.class, "ArtifactStateInstance", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArtifactStateInstance_UsedByActivity(), this.getProcess(),
				this.getProcess_ArtifactInStateUsed(), "usedByActivity", null, 0, 1, ArtifactStateInstance.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifactStateInstance_OriginatingActivity(), this.getProcess(),
				this.getProcess_ResultArtifactInState(), "originatingActivity", null, 0, 1, ArtifactStateInstance.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResource_Name(), ecorePackage.getEString(), "name", null, 0, 1, Resource.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_Resource(), this.getResource(), null, "resource", null, 0, -1, Resource.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(shadowNodeTypeENUMEEnum, ShadowNodeTypeENUM.class, "ShadowNodeTypeENUM");
		addEEnumLiteral(shadowNodeTypeENUMEEnum, ShadowNodeTypeENUM.RESERVED_NOT_IN_USE);
		addEEnumLiteral(shadowNodeTypeENUMEEnum, ShadowNodeTypeENUM.INPUT);
		addEEnumLiteral(shadowNodeTypeENUMEEnum, ShadowNodeTypeENUM.OUTPUT);
		addEEnumLiteral(shadowNodeTypeENUMEEnum, ShadowNodeTypeENUM.INTERNAL);

		initEEnum(statuS_ENUMEEnum, PROVE.STATUS_ENUM.class, "STATUS_ENUM");
		addEEnumLiteral(statuS_ENUMEEnum, PROVE.STATUS_ENUM.UNSPECIFIED);
		addEEnumLiteral(statuS_ENUMEEnum, PROVE.STATUS_ENUM.COMPLETED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.obeo.fr/dsl/dnc/archetype
		createArchetypeAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.obeo.fr/dsl/dnc/archetype</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createArchetypeAnnotations() {
		String source = "http://www.obeo.fr/dsl/dnc/archetype";
		addAnnotation(shadowNodeIncomingEClass, source, new String[] { "archetype", "Description" });
	}

} //PROVEPackageImpl
