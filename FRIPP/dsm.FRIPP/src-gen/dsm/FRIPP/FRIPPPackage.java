/**
 */
package dsm.FRIPP;

import dsm.PROVE.PROVEPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dsm.FRIPP.FRIPPFactory
 * @model kind="package"
 * @generated
 */
public interface FRIPPPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "FRIPP";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/FRIPP";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "FRIPP";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FRIPPPackage eINSTANCE = dsm.FRIPP.impl.FRIPPPackageImpl.init();

	/**
	 * The meta object id for the '{@link dsm.FRIPP.impl.PlaybookProcessImpl <em>Playbook Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.FRIPP.impl.PlaybookProcessImpl
	 * @see dsm.FRIPP.impl.FRIPPPackageImpl#getPlaybookProcess()
	 * @generated
	 */
	int PLAYBOOK_PROCESS = 0;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYBOOK_PROCESS__ARTIFACT = PROVEPackage.PROCESS__ARTIFACT;

	/**
	 * The feature id for the '<em><b>Process</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYBOOK_PROCESS__PROCESS = PROVEPackage.PROCESS__PROCESS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYBOOK_PROCESS__NAME = PROVEPackage.PROCESS__NAME;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYBOOK_PROCESS__NOTES = PROVEPackage.PROCESS__NOTES;

	/**
	 * The feature id for the '<em><b>Artifact In State Used</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYBOOK_PROCESS__ARTIFACT_IN_STATE_USED = PROVEPackage.PROCESS__ARTIFACT_IN_STATE_USED;

	/**
	 * The feature id for the '<em><b>Result Artifact In State</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYBOOK_PROCESS__RESULT_ARTIFACT_IN_STATE = PROVEPackage.PROCESS__RESULT_ARTIFACT_IN_STATE;

	/**
	 * The feature id for the '<em><b>Shadownodeincoming</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYBOOK_PROCESS__SHADOWNODEINCOMING = PROVEPackage.PROCESS__SHADOWNODEINCOMING;

	/**
	 * The feature id for the '<em><b>Shadownodeoutgoing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYBOOK_PROCESS__SHADOWNODEOUTGOING = PROVEPackage.PROCESS__SHADOWNODEOUTGOING;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYBOOK_PROCESS__START_DATE = PROVEPackage.PROCESS__START_DATE;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYBOOK_PROCESS__END_DATE = PROVEPackage.PROCESS__END_DATE;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYBOOK_PROCESS__RESOURCE = PROVEPackage.PROCESS__RESOURCE;

	/**
	 * The feature id for the '<em><b>Resource Used</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYBOOK_PROCESS__RESOURCE_USED = PROVEPackage.PROCESS__RESOURCE_USED;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYBOOK_PROCESS__STATUS = PROVEPackage.PROCESS__STATUS;

	/**
	 * The feature id for the '<em><b>Objectives</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYBOOK_PROCESS__OBJECTIVES = PROVEPackage.PROCESS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Action Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYBOOK_PROCESS__ACTION_TYPE = PROVEPackage.PROCESS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Relatedreferences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYBOOK_PROCESS__RELATEDREFERENCES = PROVEPackage.PROCESS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Externalreferences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYBOOK_PROCESS__EXTERNALREFERENCES = PROVEPackage.PROCESS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Paragon</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYBOOK_PROCESS__PARAGON = PROVEPackage.PROCESS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Activityimpact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYBOOK_PROCESS__ACTIVITYIMPACT = PROVEPackage.PROCESS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Associated Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYBOOK_PROCESS__ASSOCIATED_ROLE = PROVEPackage.PROCESS_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Playbook Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYBOOK_PROCESS_FEATURE_COUNT = PROVEPackage.PROCESS_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Playbook Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYBOOK_PROCESS_OPERATION_COUNT = PROVEPackage.PROCESS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsm.FRIPP.impl.ActuatorImpl <em>Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.FRIPP.impl.ActuatorImpl
	 * @see dsm.FRIPP.impl.FRIPPPackageImpl#getActuator()
	 * @generated
	 */
	int ACTUATOR = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__NAME = PROVEPackage.RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__RESOURCE = PROVEPackage.RESOURCE__RESOURCE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__TYPE = PROVEPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_FEATURE_COUNT = PROVEPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_OPERATION_COUNT = PROVEPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dsm.FRIPP.impl.ExternalReferenceImpl <em>External Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.FRIPP.impl.ExternalReferenceImpl
	 * @see dsm.FRIPP.impl.FRIPPPackageImpl#getExternalReference()
	 * @generated
	 */
	int EXTERNAL_REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Reference Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__REFERENCE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__NAME = 1;

	/**
	 * The number of structural features of the '<em>External Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>External Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.FRIPP.impl.ActivityImpactImpl <em>Activity Impact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.FRIPP.impl.ActivityImpactImpl
	 * @see dsm.FRIPP.impl.FRIPPPackageImpl#getActivityImpact()
	 * @generated
	 */
	int ACTIVITY_IMPACT = 3;

	/**
	 * The feature id for the '<em><b>Paragon</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_IMPACT__PARAGON = 0;

	/**
	 * The feature id for the '<em><b>New Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_IMPACT__NEW_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Original Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_IMPACT__ORIGINAL_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Original Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_IMPACT__ORIGINAL_PROBABILITY = 3;

	/**
	 * The number of structural features of the '<em>Activity Impact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_IMPACT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Activity Impact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_IMPACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.FRIPP.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.FRIPP.impl.RoleImpl
	 * @see dsm.FRIPP.impl.FRIPPPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 4;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.FRIPP.impl.OrganisationImpl <em>Organisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.FRIPP.impl.OrganisationImpl
	 * @see dsm.FRIPP.impl.FRIPPPackageImpl#getOrganisation()
	 * @generated
	 */
	int ORGANISATION = 5;

	/**
	 * The feature id for the '<em><b>Playbookprocess</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__PLAYBOOKPROCESS = 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__ROLE = 1;

	/**
	 * The number of structural features of the '<em>Organisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Organisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dsm.FRIPP.OBJECTIVES_ENUM <em>OBJECTIVES ENUM</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.FRIPP.OBJECTIVES_ENUM
	 * @see dsm.FRIPP.impl.FRIPPPackageImpl#getOBJECTIVES_ENUM()
	 * @generated
	 */
	int OBJECTIVES_ENUM = 6;

	/**
	 * The meta object id for the '{@link dsm.FRIPP.ACTION_TYPE_ENUM <em>ACTION TYPE ENUM</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.FRIPP.ACTION_TYPE_ENUM
	 * @see dsm.FRIPP.impl.FRIPPPackageImpl#getACTION_TYPE_ENUM()
	 * @generated
	 */
	int ACTION_TYPE_ENUM = 7;

	/**
	 * The meta object id for the '{@link dsm.FRIPP.ACTUATOR_TYPE_ENUM <em>ACTUATOR TYPE ENUM</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.FRIPP.ACTUATOR_TYPE_ENUM
	 * @see dsm.FRIPP.impl.FRIPPPackageImpl#getACTUATOR_TYPE_ENUM()
	 * @generated
	 */
	int ACTUATOR_TYPE_ENUM = 8;

	/**
	 * The meta object id for the '{@link dsm.FRIPP.ORCHESTRATION_SERVICE_CATEGORY <em>ORCHESTRATION SERVICE CATEGORY</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.FRIPP.ORCHESTRATION_SERVICE_CATEGORY
	 * @see dsm.FRIPP.impl.FRIPPPackageImpl#getORCHESTRATION_SERVICE_CATEGORY()
	 * @generated
	 */
	int ORCHESTRATION_SERVICE_CATEGORY = 9;

	/**
	 * The meta object id for the '{@link dsm.FRIPP.REFERENCE_TYPE_ENUM <em>REFERENCE TYPE ENUM</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.FRIPP.REFERENCE_TYPE_ENUM
	 * @see dsm.FRIPP.impl.FRIPPPackageImpl#getREFERENCE_TYPE_ENUM()
	 * @generated
	 */
	int REFERENCE_TYPE_ENUM = 10;

	/**
	 * The meta object id for the '{@link dsm.FRIPP.GOALS_ENUM <em>GOALS ENUM</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dsm.FRIPP.GOALS_ENUM
	 * @see dsm.FRIPP.impl.FRIPPPackageImpl#getGOALS_ENUM()
	 * @generated
	 */
	int GOALS_ENUM = 11;

	/**
	 * Returns the meta object for class '{@link dsm.FRIPP.PlaybookProcess <em>Playbook Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Playbook Process</em>'.
	 * @see dsm.FRIPP.PlaybookProcess
	 * @generated
	 */
	EClass getPlaybookProcess();

	/**
	 * Returns the meta object for the attribute list '{@link dsm.FRIPP.PlaybookProcess#getObjectives <em>Objectives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Objectives</em>'.
	 * @see dsm.FRIPP.PlaybookProcess#getObjectives()
	 * @see #getPlaybookProcess()
	 * @generated
	 */
	EAttribute getPlaybookProcess_Objectives();

	/**
	 * Returns the meta object for the attribute '{@link dsm.FRIPP.PlaybookProcess#getActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Type</em>'.
	 * @see dsm.FRIPP.PlaybookProcess#getActionType()
	 * @see #getPlaybookProcess()
	 * @generated
	 */
	EAttribute getPlaybookProcess_ActionType();

	/**
	 * Returns the meta object for the reference list '{@link dsm.FRIPP.PlaybookProcess#getRelatedreferences <em>Relatedreferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relatedreferences</em>'.
	 * @see dsm.FRIPP.PlaybookProcess#getRelatedreferences()
	 * @see #getPlaybookProcess()
	 * @generated
	 */
	EReference getPlaybookProcess_Relatedreferences();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.FRIPP.PlaybookProcess#getExternalreferences <em>Externalreferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Externalreferences</em>'.
	 * @see dsm.FRIPP.PlaybookProcess#getExternalreferences()
	 * @see #getPlaybookProcess()
	 * @generated
	 */
	EReference getPlaybookProcess_Externalreferences();

	/**
	 * Returns the meta object for the reference '{@link dsm.FRIPP.PlaybookProcess#getParagon <em>Paragon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Paragon</em>'.
	 * @see dsm.FRIPP.PlaybookProcess#getParagon()
	 * @see #getPlaybookProcess()
	 * @generated
	 */
	EReference getPlaybookProcess_Paragon();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.FRIPP.PlaybookProcess#getActivityimpact <em>Activityimpact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activityimpact</em>'.
	 * @see dsm.FRIPP.PlaybookProcess#getActivityimpact()
	 * @see #getPlaybookProcess()
	 * @generated
	 */
	EReference getPlaybookProcess_Activityimpact();

	/**
	 * Returns the meta object for the reference list '{@link dsm.FRIPP.PlaybookProcess#getAssociatedRole <em>Associated Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Associated Role</em>'.
	 * @see dsm.FRIPP.PlaybookProcess#getAssociatedRole()
	 * @see #getPlaybookProcess()
	 * @generated
	 */
	EReference getPlaybookProcess_AssociatedRole();

	/**
	 * Returns the meta object for class '{@link dsm.FRIPP.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator</em>'.
	 * @see dsm.FRIPP.Actuator
	 * @generated
	 */
	EClass getActuator();

	/**
	 * Returns the meta object for the attribute '{@link dsm.FRIPP.Actuator#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see dsm.FRIPP.Actuator#getType()
	 * @see #getActuator()
	 * @generated
	 */
	EAttribute getActuator_Type();

	/**
	 * Returns the meta object for class '{@link dsm.FRIPP.ExternalReference <em>External Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Reference</em>'.
	 * @see dsm.FRIPP.ExternalReference
	 * @generated
	 */
	EClass getExternalReference();

	/**
	 * Returns the meta object for the attribute '{@link dsm.FRIPP.ExternalReference#getReferenceType <em>Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Type</em>'.
	 * @see dsm.FRIPP.ExternalReference#getReferenceType()
	 * @see #getExternalReference()
	 * @generated
	 */
	EAttribute getExternalReference_ReferenceType();

	/**
	 * Returns the meta object for the attribute '{@link dsm.FRIPP.ExternalReference#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dsm.FRIPP.ExternalReference#getName()
	 * @see #getExternalReference()
	 * @generated
	 */
	EAttribute getExternalReference_Name();

	/**
	 * Returns the meta object for class '{@link dsm.FRIPP.ActivityImpact <em>Activity Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Impact</em>'.
	 * @see dsm.FRIPP.ActivityImpact
	 * @generated
	 */
	EClass getActivityImpact();

	/**
	 * Returns the meta object for the reference '{@link dsm.FRIPP.ActivityImpact#getParagon <em>Paragon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Paragon</em>'.
	 * @see dsm.FRIPP.ActivityImpact#getParagon()
	 * @see #getActivityImpact()
	 * @generated
	 */
	EReference getActivityImpact_Paragon();

	/**
	 * Returns the meta object for the attribute '{@link dsm.FRIPP.ActivityImpact#getNewValue <em>New Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Value</em>'.
	 * @see dsm.FRIPP.ActivityImpact#getNewValue()
	 * @see #getActivityImpact()
	 * @generated
	 */
	EAttribute getActivityImpact_NewValue();

	/**
	 * Returns the meta object for the attribute '{@link dsm.FRIPP.ActivityImpact#getOriginalType <em>Original Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Original Type</em>'.
	 * @see dsm.FRIPP.ActivityImpact#getOriginalType()
	 * @see #getActivityImpact()
	 * @generated
	 */
	EAttribute getActivityImpact_OriginalType();

	/**
	 * Returns the meta object for the attribute '{@link dsm.FRIPP.ActivityImpact#getOriginalProbability <em>Original Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Original Probability</em>'.
	 * @see dsm.FRIPP.ActivityImpact#getOriginalProbability()
	 * @see #getActivityImpact()
	 * @generated
	 */
	EAttribute getActivityImpact_OriginalProbability();

	/**
	 * Returns the meta object for class '{@link dsm.FRIPP.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see dsm.FRIPP.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for class '{@link dsm.FRIPP.Organisation <em>Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organisation</em>'.
	 * @see dsm.FRIPP.Organisation
	 * @generated
	 */
	EClass getOrganisation();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.FRIPP.Organisation#getPlaybookprocess <em>Playbookprocess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Playbookprocess</em>'.
	 * @see dsm.FRIPP.Organisation#getPlaybookprocess()
	 * @see #getOrganisation()
	 * @generated
	 */
	EReference getOrganisation_Playbookprocess();

	/**
	 * Returns the meta object for the containment reference list '{@link dsm.FRIPP.Organisation#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role</em>'.
	 * @see dsm.FRIPP.Organisation#getRole()
	 * @see #getOrganisation()
	 * @generated
	 */
	EReference getOrganisation_Role();

	/**
	 * Returns the meta object for enum '{@link dsm.FRIPP.OBJECTIVES_ENUM <em>OBJECTIVES ENUM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>OBJECTIVES ENUM</em>'.
	 * @see dsm.FRIPP.OBJECTIVES_ENUM
	 * @generated
	 */
	EEnum getOBJECTIVES_ENUM();

	/**
	 * Returns the meta object for enum '{@link dsm.FRIPP.ACTION_TYPE_ENUM <em>ACTION TYPE ENUM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ACTION TYPE ENUM</em>'.
	 * @see dsm.FRIPP.ACTION_TYPE_ENUM
	 * @generated
	 */
	EEnum getACTION_TYPE_ENUM();

	/**
	 * Returns the meta object for enum '{@link dsm.FRIPP.ACTUATOR_TYPE_ENUM <em>ACTUATOR TYPE ENUM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ACTUATOR TYPE ENUM</em>'.
	 * @see dsm.FRIPP.ACTUATOR_TYPE_ENUM
	 * @generated
	 */
	EEnum getACTUATOR_TYPE_ENUM();

	/**
	 * Returns the meta object for enum '{@link dsm.FRIPP.ORCHESTRATION_SERVICE_CATEGORY <em>ORCHESTRATION SERVICE CATEGORY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ORCHESTRATION SERVICE CATEGORY</em>'.
	 * @see dsm.FRIPP.ORCHESTRATION_SERVICE_CATEGORY
	 * @generated
	 */
	EEnum getORCHESTRATION_SERVICE_CATEGORY();

	/**
	 * Returns the meta object for enum '{@link dsm.FRIPP.REFERENCE_TYPE_ENUM <em>REFERENCE TYPE ENUM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>REFERENCE TYPE ENUM</em>'.
	 * @see dsm.FRIPP.REFERENCE_TYPE_ENUM
	 * @generated
	 */
	EEnum getREFERENCE_TYPE_ENUM();

	/**
	 * Returns the meta object for enum '{@link dsm.FRIPP.GOALS_ENUM <em>GOALS ENUM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GOALS ENUM</em>'.
	 * @see dsm.FRIPP.GOALS_ENUM
	 * @generated
	 */
	EEnum getGOALS_ENUM();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FRIPPFactory getFRIPPFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link dsm.FRIPP.impl.PlaybookProcessImpl <em>Playbook Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.FRIPP.impl.PlaybookProcessImpl
		 * @see dsm.FRIPP.impl.FRIPPPackageImpl#getPlaybookProcess()
		 * @generated
		 */
		EClass PLAYBOOK_PROCESS = eINSTANCE.getPlaybookProcess();

		/**
		 * The meta object literal for the '<em><b>Objectives</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYBOOK_PROCESS__OBJECTIVES = eINSTANCE.getPlaybookProcess_Objectives();

		/**
		 * The meta object literal for the '<em><b>Action Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYBOOK_PROCESS__ACTION_TYPE = eINSTANCE.getPlaybookProcess_ActionType();

		/**
		 * The meta object literal for the '<em><b>Relatedreferences</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYBOOK_PROCESS__RELATEDREFERENCES = eINSTANCE.getPlaybookProcess_Relatedreferences();

		/**
		 * The meta object literal for the '<em><b>Externalreferences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYBOOK_PROCESS__EXTERNALREFERENCES = eINSTANCE.getPlaybookProcess_Externalreferences();

		/**
		 * The meta object literal for the '<em><b>Paragon</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYBOOK_PROCESS__PARAGON = eINSTANCE.getPlaybookProcess_Paragon();

		/**
		 * The meta object literal for the '<em><b>Activityimpact</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYBOOK_PROCESS__ACTIVITYIMPACT = eINSTANCE.getPlaybookProcess_Activityimpact();

		/**
		 * The meta object literal for the '<em><b>Associated Role</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYBOOK_PROCESS__ASSOCIATED_ROLE = eINSTANCE.getPlaybookProcess_AssociatedRole();

		/**
		 * The meta object literal for the '{@link dsm.FRIPP.impl.ActuatorImpl <em>Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.FRIPP.impl.ActuatorImpl
		 * @see dsm.FRIPP.impl.FRIPPPackageImpl#getActuator()
		 * @generated
		 */
		EClass ACTUATOR = eINSTANCE.getActuator();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUATOR__TYPE = eINSTANCE.getActuator_Type();

		/**
		 * The meta object literal for the '{@link dsm.FRIPP.impl.ExternalReferenceImpl <em>External Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.FRIPP.impl.ExternalReferenceImpl
		 * @see dsm.FRIPP.impl.FRIPPPackageImpl#getExternalReference()
		 * @generated
		 */
		EClass EXTERNAL_REFERENCE = eINSTANCE.getExternalReference();

		/**
		 * The meta object literal for the '<em><b>Reference Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_REFERENCE__REFERENCE_TYPE = eINSTANCE.getExternalReference_ReferenceType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_REFERENCE__NAME = eINSTANCE.getExternalReference_Name();

		/**
		 * The meta object literal for the '{@link dsm.FRIPP.impl.ActivityImpactImpl <em>Activity Impact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.FRIPP.impl.ActivityImpactImpl
		 * @see dsm.FRIPP.impl.FRIPPPackageImpl#getActivityImpact()
		 * @generated
		 */
		EClass ACTIVITY_IMPACT = eINSTANCE.getActivityImpact();

		/**
		 * The meta object literal for the '<em><b>Paragon</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_IMPACT__PARAGON = eINSTANCE.getActivityImpact_Paragon();

		/**
		 * The meta object literal for the '<em><b>New Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_IMPACT__NEW_VALUE = eINSTANCE.getActivityImpact_NewValue();

		/**
		 * The meta object literal for the '<em><b>Original Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_IMPACT__ORIGINAL_TYPE = eINSTANCE.getActivityImpact_OriginalType();

		/**
		 * The meta object literal for the '<em><b>Original Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_IMPACT__ORIGINAL_PROBABILITY = eINSTANCE.getActivityImpact_OriginalProbability();

		/**
		 * The meta object literal for the '{@link dsm.FRIPP.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.FRIPP.impl.RoleImpl
		 * @see dsm.FRIPP.impl.FRIPPPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '{@link dsm.FRIPP.impl.OrganisationImpl <em>Organisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.FRIPP.impl.OrganisationImpl
		 * @see dsm.FRIPP.impl.FRIPPPackageImpl#getOrganisation()
		 * @generated
		 */
		EClass ORGANISATION = eINSTANCE.getOrganisation();

		/**
		 * The meta object literal for the '<em><b>Playbookprocess</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANISATION__PLAYBOOKPROCESS = eINSTANCE.getOrganisation_Playbookprocess();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANISATION__ROLE = eINSTANCE.getOrganisation_Role();

		/**
		 * The meta object literal for the '{@link dsm.FRIPP.OBJECTIVES_ENUM <em>OBJECTIVES ENUM</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.FRIPP.OBJECTIVES_ENUM
		 * @see dsm.FRIPP.impl.FRIPPPackageImpl#getOBJECTIVES_ENUM()
		 * @generated
		 */
		EEnum OBJECTIVES_ENUM = eINSTANCE.getOBJECTIVES_ENUM();

		/**
		 * The meta object literal for the '{@link dsm.FRIPP.ACTION_TYPE_ENUM <em>ACTION TYPE ENUM</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.FRIPP.ACTION_TYPE_ENUM
		 * @see dsm.FRIPP.impl.FRIPPPackageImpl#getACTION_TYPE_ENUM()
		 * @generated
		 */
		EEnum ACTION_TYPE_ENUM = eINSTANCE.getACTION_TYPE_ENUM();

		/**
		 * The meta object literal for the '{@link dsm.FRIPP.ACTUATOR_TYPE_ENUM <em>ACTUATOR TYPE ENUM</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.FRIPP.ACTUATOR_TYPE_ENUM
		 * @see dsm.FRIPP.impl.FRIPPPackageImpl#getACTUATOR_TYPE_ENUM()
		 * @generated
		 */
		EEnum ACTUATOR_TYPE_ENUM = eINSTANCE.getACTUATOR_TYPE_ENUM();

		/**
		 * The meta object literal for the '{@link dsm.FRIPP.ORCHESTRATION_SERVICE_CATEGORY <em>ORCHESTRATION SERVICE CATEGORY</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.FRIPP.ORCHESTRATION_SERVICE_CATEGORY
		 * @see dsm.FRIPP.impl.FRIPPPackageImpl#getORCHESTRATION_SERVICE_CATEGORY()
		 * @generated
		 */
		EEnum ORCHESTRATION_SERVICE_CATEGORY = eINSTANCE.getORCHESTRATION_SERVICE_CATEGORY();

		/**
		 * The meta object literal for the '{@link dsm.FRIPP.REFERENCE_TYPE_ENUM <em>REFERENCE TYPE ENUM</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.FRIPP.REFERENCE_TYPE_ENUM
		 * @see dsm.FRIPP.impl.FRIPPPackageImpl#getREFERENCE_TYPE_ENUM()
		 * @generated
		 */
		EEnum REFERENCE_TYPE_ENUM = eINSTANCE.getREFERENCE_TYPE_ENUM();

		/**
		 * The meta object literal for the '{@link dsm.FRIPP.GOALS_ENUM <em>GOALS ENUM</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dsm.FRIPP.GOALS_ENUM
		 * @see dsm.FRIPP.impl.FRIPPPackageImpl#getGOALS_ENUM()
		 * @generated
		 */
		EEnum GOALS_ENUM = eINSTANCE.getGOALS_ENUM();

	}

} //FRIPPPackage
