/**
 */
package symbiosisDM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see symbiosisDM.SymbiosisDMFactory
 * @model kind="package"
 * @generated
 */
public interface SymbiosisDMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "symbiosisDM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/symbiosisDM";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "symbiosisDM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SymbiosisDMPackage eINSTANCE = symbiosisDM.impl.SymbiosisDMPackageImpl.init();

	/**
	 * The meta object id for the '{@link symbiosisDM.impl.BusinessObjectiveImpl <em>Business Objective</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see symbiosisDM.impl.BusinessObjectiveImpl
	 * @see symbiosisDM.impl.SymbiosisDMPackageImpl#getBusinessObjective()
	 * @generated
	 */
	int BUSINESS_OBJECTIVE = 0;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECTIVE__OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECTIVE__SCOPE = 1;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECTIVE__PURPOSE = 2;

	/**
	 * The feature id for the '<em><b>Viewpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECTIVE__VIEWPOINT = 3;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECTIVE__CONTEXT = 4;

	/**
	 * The feature id for the '<em><b>Related Businessobjective</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECTIVE__RELATED_BUSINESSOBJECTIVE = 5;

	/**
	 * The feature id for the '<em><b>Paragon</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECTIVE__PARAGON = 6;

	/**
	 * The number of structural features of the '<em>Business Objective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECTIVE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Business Objective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECTIVE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link symbiosisDM.impl.SecurityMeasurementGoalImpl <em>Security Measurement Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see symbiosisDM.impl.SecurityMeasurementGoalImpl
	 * @see symbiosisDM.impl.SymbiosisDMPackageImpl#getSecurityMeasurementGoal()
	 * @generated
	 */
	int SECURITY_MEASUREMENT_GOAL = 1;

	/**
	 * The feature id for the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MEASUREMENT_GOAL__OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Viewpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MEASUREMENT_GOAL__VIEWPOINT = 1;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MEASUREMENT_GOAL__CONTEXT = 2;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MEASUREMENT_GOAL__SCOPE = 3;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MEASUREMENT_GOAL__PURPOSE = 4;

	/**
	 * The feature id for the '<em><b>Focus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MEASUREMENT_GOAL__FOCUS = 5;

	/**
	 * The feature id for the '<em><b>Criteria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MEASUREMENT_GOAL__CRITERIA = 6;

	/**
	 * The feature id for the '<em><b>Businessobjective</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MEASUREMENT_GOAL__BUSINESSOBJECTIVE = 7;

	/**
	 * The feature id for the '<em><b>Paragon</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MEASUREMENT_GOAL__PARAGON = 8;

	/**
	 * The number of structural features of the '<em>Security Measurement Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MEASUREMENT_GOAL_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Security Measurement Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_MEASUREMENT_GOAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link symbiosisDM.impl.SecurityMetricImpl <em>Security Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see symbiosisDM.impl.SecurityMetricImpl
	 * @see symbiosisDM.impl.SymbiosisDMPackageImpl#getSecurityMetric()
	 * @generated
	 */
	int SECURITY_METRIC = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_METRIC__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_METRIC__GOAL = 1;

	/**
	 * The feature id for the '<em><b>Basemeasurement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_METRIC__BASEMEASUREMENT = 2;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_METRIC__METHOD = 3;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_METRIC__FUNCTION = 4;

	/**
	 * The feature id for the '<em><b>Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_METRIC__INTERPRETATION = 5;

	/**
	 * The feature id for the '<em><b>Reporting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_METRIC__REPORTING = 6;

	/**
	 * The feature id for the '<em><b>Securitymeasurementgoal</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_METRIC__SECURITYMEASUREMENTGOAL = 7;

	/**
	 * The number of structural features of the '<em>Security Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_METRIC_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Security Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_METRIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link symbiosisDM.impl.BaseMeasurementImpl <em>Base Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see symbiosisDM.impl.BaseMeasurementImpl
	 * @see symbiosisDM.impl.SymbiosisDMPackageImpl#getBaseMeasurement()
	 * @generated
	 */
	int BASE_MEASUREMENT = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_MEASUREMENT__DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>Base Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_MEASUREMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Base Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_MEASUREMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link symbiosisDM.impl.SYMBIOSISImpl <em>SYMBIOSIS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see symbiosisDM.impl.SYMBIOSISImpl
	 * @see symbiosisDM.impl.SymbiosisDMPackageImpl#getSYMBIOSIS()
	 * @generated
	 */
	int SYMBIOSIS = 4;

	/**
	 * The feature id for the '<em><b>Businessobjective</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBIOSIS__BUSINESSOBJECTIVE = 0;

	/**
	 * The feature id for the '<em><b>Securitymeasurementgoal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBIOSIS__SECURITYMEASUREMENTGOAL = 1;

	/**
	 * The feature id for the '<em><b>Securitymetric</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBIOSIS__SECURITYMETRIC = 2;

	/**
	 * The feature id for the '<em><b>Basemeasurement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBIOSIS__BASEMEASUREMENT = 3;

	/**
	 * The feature id for the '<em><b>Dependency Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBIOSIS__DEPENDENCY_MODEL = 4;

	/**
	 * The number of structural features of the '<em>SYMBIOSIS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBIOSIS_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>SYMBIOSIS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBIOSIS_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link symbiosisDM.BusinessObjective <em>Business Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Objective</em>'.
	 * @see symbiosisDM.BusinessObjective
	 * @generated
	 */
	EClass getBusinessObjective();

	/**
	 * Returns the meta object for the attribute '{@link symbiosisDM.BusinessObjective#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object</em>'.
	 * @see symbiosisDM.BusinessObjective#getObject()
	 * @see #getBusinessObjective()
	 * @generated
	 */
	EAttribute getBusinessObjective_Object();

	/**
	 * Returns the meta object for the attribute '{@link symbiosisDM.BusinessObjective#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see symbiosisDM.BusinessObjective#getScope()
	 * @see #getBusinessObjective()
	 * @generated
	 */
	EAttribute getBusinessObjective_Scope();

	/**
	 * Returns the meta object for the attribute '{@link symbiosisDM.BusinessObjective#getPurpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purpose</em>'.
	 * @see symbiosisDM.BusinessObjective#getPurpose()
	 * @see #getBusinessObjective()
	 * @generated
	 */
	EAttribute getBusinessObjective_Purpose();

	/**
	 * Returns the meta object for the attribute '{@link symbiosisDM.BusinessObjective#getViewpoint <em>Viewpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Viewpoint</em>'.
	 * @see symbiosisDM.BusinessObjective#getViewpoint()
	 * @see #getBusinessObjective()
	 * @generated
	 */
	EAttribute getBusinessObjective_Viewpoint();

	/**
	 * Returns the meta object for the attribute '{@link symbiosisDM.BusinessObjective#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context</em>'.
	 * @see symbiosisDM.BusinessObjective#getContext()
	 * @see #getBusinessObjective()
	 * @generated
	 */
	EAttribute getBusinessObjective_Context();

	/**
	 * Returns the meta object for the reference list '{@link symbiosisDM.BusinessObjective#getRelatedBusinessobjective <em>Related Businessobjective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related Businessobjective</em>'.
	 * @see symbiosisDM.BusinessObjective#getRelatedBusinessobjective()
	 * @see #getBusinessObjective()
	 * @generated
	 */
	EReference getBusinessObjective_RelatedBusinessobjective();

	/**
	 * Returns the meta object for the reference '{@link symbiosisDM.BusinessObjective#getParagon <em>Paragon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Paragon</em>'.
	 * @see symbiosisDM.BusinessObjective#getParagon()
	 * @see #getBusinessObjective()
	 * @generated
	 */
	EReference getBusinessObjective_Paragon();

	/**
	 * Returns the meta object for class '{@link symbiosisDM.SecurityMeasurementGoal <em>Security Measurement Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Measurement Goal</em>'.
	 * @see symbiosisDM.SecurityMeasurementGoal
	 * @generated
	 */
	EClass getSecurityMeasurementGoal();

	/**
	 * Returns the meta object for the attribute '{@link symbiosisDM.SecurityMeasurementGoal#getViewpoint <em>Viewpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Viewpoint</em>'.
	 * @see symbiosisDM.SecurityMeasurementGoal#getViewpoint()
	 * @see #getSecurityMeasurementGoal()
	 * @generated
	 */
	EAttribute getSecurityMeasurementGoal_Viewpoint();

	/**
	 * Returns the meta object for the attribute '{@link symbiosisDM.SecurityMeasurementGoal#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context</em>'.
	 * @see symbiosisDM.SecurityMeasurementGoal#getContext()
	 * @see #getSecurityMeasurementGoal()
	 * @generated
	 */
	EAttribute getSecurityMeasurementGoal_Context();

	/**
	 * Returns the meta object for the attribute '{@link symbiosisDM.SecurityMeasurementGoal#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see symbiosisDM.SecurityMeasurementGoal#getScope()
	 * @see #getSecurityMeasurementGoal()
	 * @generated
	 */
	EAttribute getSecurityMeasurementGoal_Scope();

	/**
	 * Returns the meta object for the attribute '{@link symbiosisDM.SecurityMeasurementGoal#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object</em>'.
	 * @see symbiosisDM.SecurityMeasurementGoal#getObject()
	 * @see #getSecurityMeasurementGoal()
	 * @generated
	 */
	EAttribute getSecurityMeasurementGoal_Object();

	/**
	 * Returns the meta object for the attribute '{@link symbiosisDM.SecurityMeasurementGoal#getPurpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purpose</em>'.
	 * @see symbiosisDM.SecurityMeasurementGoal#getPurpose()
	 * @see #getSecurityMeasurementGoal()
	 * @generated
	 */
	EAttribute getSecurityMeasurementGoal_Purpose();

	/**
	 * Returns the meta object for the attribute '{@link symbiosisDM.SecurityMeasurementGoal#getFocus <em>Focus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Focus</em>'.
	 * @see symbiosisDM.SecurityMeasurementGoal#getFocus()
	 * @see #getSecurityMeasurementGoal()
	 * @generated
	 */
	EAttribute getSecurityMeasurementGoal_Focus();

	/**
	 * Returns the meta object for the attribute '{@link symbiosisDM.SecurityMeasurementGoal#getCriteria <em>Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Criteria</em>'.
	 * @see symbiosisDM.SecurityMeasurementGoal#getCriteria()
	 * @see #getSecurityMeasurementGoal()
	 * @generated
	 */
	EAttribute getSecurityMeasurementGoal_Criteria();

	/**
	 * Returns the meta object for the reference list '{@link symbiosisDM.SecurityMeasurementGoal#getBusinessobjective <em>Businessobjective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Businessobjective</em>'.
	 * @see symbiosisDM.SecurityMeasurementGoal#getBusinessobjective()
	 * @see #getSecurityMeasurementGoal()
	 * @generated
	 */
	EReference getSecurityMeasurementGoal_Businessobjective();

	/**
	 * Returns the meta object for the reference '{@link symbiosisDM.SecurityMeasurementGoal#getParagon <em>Paragon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Paragon</em>'.
	 * @see symbiosisDM.SecurityMeasurementGoal#getParagon()
	 * @see #getSecurityMeasurementGoal()
	 * @generated
	 */
	EReference getSecurityMeasurementGoal_Paragon();

	/**
	 * Returns the meta object for class '{@link symbiosisDM.SecurityMetric <em>Security Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Metric</em>'.
	 * @see symbiosisDM.SecurityMetric
	 * @generated
	 */
	EClass getSecurityMetric();

	/**
	 * Returns the meta object for the attribute '{@link symbiosisDM.SecurityMetric#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see symbiosisDM.SecurityMetric#getDescription()
	 * @see #getSecurityMetric()
	 * @generated
	 */
	EAttribute getSecurityMetric_Description();

	/**
	 * Returns the meta object for the attribute '{@link symbiosisDM.SecurityMetric#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Goal</em>'.
	 * @see symbiosisDM.SecurityMetric#getGoal()
	 * @see #getSecurityMetric()
	 * @generated
	 */
	EAttribute getSecurityMetric_Goal();

	/**
	 * Returns the meta object for the reference list '{@link symbiosisDM.SecurityMetric#getBasemeasurement <em>Basemeasurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Basemeasurement</em>'.
	 * @see symbiosisDM.SecurityMetric#getBasemeasurement()
	 * @see #getSecurityMetric()
	 * @generated
	 */
	EReference getSecurityMetric_Basemeasurement();

	/**
	 * Returns the meta object for the attribute '{@link symbiosisDM.SecurityMetric#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see symbiosisDM.SecurityMetric#getMethod()
	 * @see #getSecurityMetric()
	 * @generated
	 */
	EAttribute getSecurityMetric_Method();

	/**
	 * Returns the meta object for the attribute '{@link symbiosisDM.SecurityMetric#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function</em>'.
	 * @see symbiosisDM.SecurityMetric#getFunction()
	 * @see #getSecurityMetric()
	 * @generated
	 */
	EAttribute getSecurityMetric_Function();

	/**
	 * Returns the meta object for the attribute '{@link symbiosisDM.SecurityMetric#getInterpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpretation</em>'.
	 * @see symbiosisDM.SecurityMetric#getInterpretation()
	 * @see #getSecurityMetric()
	 * @generated
	 */
	EAttribute getSecurityMetric_Interpretation();

	/**
	 * Returns the meta object for the attribute '{@link symbiosisDM.SecurityMetric#getReporting <em>Reporting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reporting</em>'.
	 * @see symbiosisDM.SecurityMetric#getReporting()
	 * @see #getSecurityMetric()
	 * @generated
	 */
	EAttribute getSecurityMetric_Reporting();

	/**
	 * Returns the meta object for the reference list '{@link symbiosisDM.SecurityMetric#getSecuritymeasurementgoal <em>Securitymeasurementgoal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Securitymeasurementgoal</em>'.
	 * @see symbiosisDM.SecurityMetric#getSecuritymeasurementgoal()
	 * @see #getSecurityMetric()
	 * @generated
	 */
	EReference getSecurityMetric_Securitymeasurementgoal();

	/**
	 * Returns the meta object for class '{@link symbiosisDM.BaseMeasurement <em>Base Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Measurement</em>'.
	 * @see symbiosisDM.BaseMeasurement
	 * @generated
	 */
	EClass getBaseMeasurement();

	/**
	 * Returns the meta object for the attribute '{@link symbiosisDM.BaseMeasurement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see symbiosisDM.BaseMeasurement#getDescription()
	 * @see #getBaseMeasurement()
	 * @generated
	 */
	EAttribute getBaseMeasurement_Description();

	/**
	 * Returns the meta object for class '{@link symbiosisDM.SYMBIOSIS <em>SYMBIOSIS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SYMBIOSIS</em>'.
	 * @see symbiosisDM.SYMBIOSIS
	 * @generated
	 */
	EClass getSYMBIOSIS();

	/**
	 * Returns the meta object for the containment reference list '{@link symbiosisDM.SYMBIOSIS#getBusinessobjective <em>Businessobjective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Businessobjective</em>'.
	 * @see symbiosisDM.SYMBIOSIS#getBusinessobjective()
	 * @see #getSYMBIOSIS()
	 * @generated
	 */
	EReference getSYMBIOSIS_Businessobjective();

	/**
	 * Returns the meta object for the containment reference list '{@link symbiosisDM.SYMBIOSIS#getSecuritymeasurementgoal <em>Securitymeasurementgoal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Securitymeasurementgoal</em>'.
	 * @see symbiosisDM.SYMBIOSIS#getSecuritymeasurementgoal()
	 * @see #getSYMBIOSIS()
	 * @generated
	 */
	EReference getSYMBIOSIS_Securitymeasurementgoal();

	/**
	 * Returns the meta object for the containment reference list '{@link symbiosisDM.SYMBIOSIS#getSecuritymetric <em>Securitymetric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Securitymetric</em>'.
	 * @see symbiosisDM.SYMBIOSIS#getSecuritymetric()
	 * @see #getSYMBIOSIS()
	 * @generated
	 */
	EReference getSYMBIOSIS_Securitymetric();

	/**
	 * Returns the meta object for the containment reference list '{@link symbiosisDM.SYMBIOSIS#getBasemeasurement <em>Basemeasurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Basemeasurement</em>'.
	 * @see symbiosisDM.SYMBIOSIS#getBasemeasurement()
	 * @see #getSYMBIOSIS()
	 * @generated
	 */
	EReference getSYMBIOSIS_Basemeasurement();

	/**
	 * Returns the meta object for the reference list '{@link symbiosisDM.SYMBIOSIS#getDependencyModel <em>Dependency Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependency Model</em>'.
	 * @see symbiosisDM.SYMBIOSIS#getDependencyModel()
	 * @see #getSYMBIOSIS()
	 * @generated
	 */
	EReference getSYMBIOSIS_DependencyModel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SymbiosisDMFactory getSymbiosisDMFactory();

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
		 * The meta object literal for the '{@link symbiosisDM.impl.BusinessObjectiveImpl <em>Business Objective</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see symbiosisDM.impl.BusinessObjectiveImpl
		 * @see symbiosisDM.impl.SymbiosisDMPackageImpl#getBusinessObjective()
		 * @generated
		 */
		EClass BUSINESS_OBJECTIVE = eINSTANCE.getBusinessObjective();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_OBJECTIVE__OBJECT = eINSTANCE.getBusinessObjective_Object();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_OBJECTIVE__SCOPE = eINSTANCE.getBusinessObjective_Scope();

		/**
		 * The meta object literal for the '<em><b>Purpose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_OBJECTIVE__PURPOSE = eINSTANCE.getBusinessObjective_Purpose();

		/**
		 * The meta object literal for the '<em><b>Viewpoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_OBJECTIVE__VIEWPOINT = eINSTANCE.getBusinessObjective_Viewpoint();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUSINESS_OBJECTIVE__CONTEXT = eINSTANCE.getBusinessObjective_Context();

		/**
		 * The meta object literal for the '<em><b>Related Businessobjective</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_OBJECTIVE__RELATED_BUSINESSOBJECTIVE = eINSTANCE
				.getBusinessObjective_RelatedBusinessobjective();

		/**
		 * The meta object literal for the '<em><b>Paragon</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSINESS_OBJECTIVE__PARAGON = eINSTANCE.getBusinessObjective_Paragon();

		/**
		 * The meta object literal for the '{@link symbiosisDM.impl.SecurityMeasurementGoalImpl <em>Security Measurement Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see symbiosisDM.impl.SecurityMeasurementGoalImpl
		 * @see symbiosisDM.impl.SymbiosisDMPackageImpl#getSecurityMeasurementGoal()
		 * @generated
		 */
		EClass SECURITY_MEASUREMENT_GOAL = eINSTANCE.getSecurityMeasurementGoal();

		/**
		 * The meta object literal for the '<em><b>Viewpoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_MEASUREMENT_GOAL__VIEWPOINT = eINSTANCE.getSecurityMeasurementGoal_Viewpoint();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_MEASUREMENT_GOAL__CONTEXT = eINSTANCE.getSecurityMeasurementGoal_Context();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_MEASUREMENT_GOAL__SCOPE = eINSTANCE.getSecurityMeasurementGoal_Scope();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_MEASUREMENT_GOAL__OBJECT = eINSTANCE.getSecurityMeasurementGoal_Object();

		/**
		 * The meta object literal for the '<em><b>Purpose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_MEASUREMENT_GOAL__PURPOSE = eINSTANCE.getSecurityMeasurementGoal_Purpose();

		/**
		 * The meta object literal for the '<em><b>Focus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_MEASUREMENT_GOAL__FOCUS = eINSTANCE.getSecurityMeasurementGoal_Focus();

		/**
		 * The meta object literal for the '<em><b>Criteria</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_MEASUREMENT_GOAL__CRITERIA = eINSTANCE.getSecurityMeasurementGoal_Criteria();

		/**
		 * The meta object literal for the '<em><b>Businessobjective</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_MEASUREMENT_GOAL__BUSINESSOBJECTIVE = eINSTANCE
				.getSecurityMeasurementGoal_Businessobjective();

		/**
		 * The meta object literal for the '<em><b>Paragon</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_MEASUREMENT_GOAL__PARAGON = eINSTANCE.getSecurityMeasurementGoal_Paragon();

		/**
		 * The meta object literal for the '{@link symbiosisDM.impl.SecurityMetricImpl <em>Security Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see symbiosisDM.impl.SecurityMetricImpl
		 * @see symbiosisDM.impl.SymbiosisDMPackageImpl#getSecurityMetric()
		 * @generated
		 */
		EClass SECURITY_METRIC = eINSTANCE.getSecurityMetric();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_METRIC__DESCRIPTION = eINSTANCE.getSecurityMetric_Description();

		/**
		 * The meta object literal for the '<em><b>Goal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_METRIC__GOAL = eINSTANCE.getSecurityMetric_Goal();

		/**
		 * The meta object literal for the '<em><b>Basemeasurement</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_METRIC__BASEMEASUREMENT = eINSTANCE.getSecurityMetric_Basemeasurement();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_METRIC__METHOD = eINSTANCE.getSecurityMetric_Method();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_METRIC__FUNCTION = eINSTANCE.getSecurityMetric_Function();

		/**
		 * The meta object literal for the '<em><b>Interpretation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_METRIC__INTERPRETATION = eINSTANCE.getSecurityMetric_Interpretation();

		/**
		 * The meta object literal for the '<em><b>Reporting</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_METRIC__REPORTING = eINSTANCE.getSecurityMetric_Reporting();

		/**
		 * The meta object literal for the '<em><b>Securitymeasurementgoal</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_METRIC__SECURITYMEASUREMENTGOAL = eINSTANCE.getSecurityMetric_Securitymeasurementgoal();

		/**
		 * The meta object literal for the '{@link symbiosisDM.impl.BaseMeasurementImpl <em>Base Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see symbiosisDM.impl.BaseMeasurementImpl
		 * @see symbiosisDM.impl.SymbiosisDMPackageImpl#getBaseMeasurement()
		 * @generated
		 */
		EClass BASE_MEASUREMENT = eINSTANCE.getBaseMeasurement();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_MEASUREMENT__DESCRIPTION = eINSTANCE.getBaseMeasurement_Description();

		/**
		 * The meta object literal for the '{@link symbiosisDM.impl.SYMBIOSISImpl <em>SYMBIOSIS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see symbiosisDM.impl.SYMBIOSISImpl
		 * @see symbiosisDM.impl.SymbiosisDMPackageImpl#getSYMBIOSIS()
		 * @generated
		 */
		EClass SYMBIOSIS = eINSTANCE.getSYMBIOSIS();

		/**
		 * The meta object literal for the '<em><b>Businessobjective</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMBIOSIS__BUSINESSOBJECTIVE = eINSTANCE.getSYMBIOSIS_Businessobjective();

		/**
		 * The meta object literal for the '<em><b>Securitymeasurementgoal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMBIOSIS__SECURITYMEASUREMENTGOAL = eINSTANCE.getSYMBIOSIS_Securitymeasurementgoal();

		/**
		 * The meta object literal for the '<em><b>Securitymetric</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMBIOSIS__SECURITYMETRIC = eINSTANCE.getSYMBIOSIS_Securitymetric();

		/**
		 * The meta object literal for the '<em><b>Basemeasurement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMBIOSIS__BASEMEASUREMENT = eINSTANCE.getSYMBIOSIS_Basemeasurement();

		/**
		 * The meta object literal for the '<em><b>Dependency Model</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMBIOSIS__DEPENDENCY_MODEL = eINSTANCE.getSYMBIOSIS_DependencyModel();

	}

} //SymbiosisDMPackage
