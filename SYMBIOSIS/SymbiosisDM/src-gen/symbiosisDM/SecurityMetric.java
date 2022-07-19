/**
 */
package symbiosisDM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link symbiosisDM.SecurityMetric#getDescription <em>Description</em>}</li>
 *   <li>{@link symbiosisDM.SecurityMetric#getGoal <em>Goal</em>}</li>
 *   <li>{@link symbiosisDM.SecurityMetric#getBasemeasurement <em>Basemeasurement</em>}</li>
 *   <li>{@link symbiosisDM.SecurityMetric#getMethod <em>Method</em>}</li>
 *   <li>{@link symbiosisDM.SecurityMetric#getFunction <em>Function</em>}</li>
 *   <li>{@link symbiosisDM.SecurityMetric#getInterpretation <em>Interpretation</em>}</li>
 *   <li>{@link symbiosisDM.SecurityMetric#getReporting <em>Reporting</em>}</li>
 *   <li>{@link symbiosisDM.SecurityMetric#getSecuritymeasurementgoal <em>Securitymeasurementgoal</em>}</li>
 * </ul>
 *
 * @see symbiosisDM.SymbiosisDMPackage#getSecurityMetric()
 * @model
 * @generated
 */
public interface SecurityMetric extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see symbiosisDM.SymbiosisDMPackage#getSecurityMetric_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link symbiosisDM.SecurityMetric#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Goal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal</em>' attribute.
	 * @see #setGoal(String)
	 * @see symbiosisDM.SymbiosisDMPackage#getSecurityMetric_Goal()
	 * @model
	 * @generated
	 */
	String getGoal();

	/**
	 * Sets the value of the '{@link symbiosisDM.SecurityMetric#getGoal <em>Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal</em>' attribute.
	 * @see #getGoal()
	 * @generated
	 */
	void setGoal(String value);

	/**
	 * Returns the value of the '<em><b>Basemeasurement</b></em>' reference list.
	 * The list contents are of type {@link symbiosisDM.BaseMeasurement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basemeasurement</em>' reference list.
	 * @see symbiosisDM.SymbiosisDMPackage#getSecurityMetric_Basemeasurement()
	 * @model
	 * @generated
	 */
	EList<BaseMeasurement> getBasemeasurement();

	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see #setMethod(String)
	 * @see symbiosisDM.SymbiosisDMPackage#getSecurityMetric_Method()
	 * @model
	 * @generated
	 */
	String getMethod();

	/**
	 * Sets the value of the '{@link symbiosisDM.SecurityMetric#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(String value);

	/**
	 * Returns the value of the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' attribute.
	 * @see #setFunction(String)
	 * @see symbiosisDM.SymbiosisDMPackage#getSecurityMetric_Function()
	 * @model
	 * @generated
	 */
	String getFunction();

	/**
	 * Sets the value of the '{@link symbiosisDM.SecurityMetric#getFunction <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' attribute.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(String value);

	/**
	 * Returns the value of the '<em><b>Interpretation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interpretation</em>' attribute.
	 * @see #setInterpretation(String)
	 * @see symbiosisDM.SymbiosisDMPackage#getSecurityMetric_Interpretation()
	 * @model
	 * @generated
	 */
	String getInterpretation();

	/**
	 * Sets the value of the '{@link symbiosisDM.SecurityMetric#getInterpretation <em>Interpretation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpretation</em>' attribute.
	 * @see #getInterpretation()
	 * @generated
	 */
	void setInterpretation(String value);

	/**
	 * Returns the value of the '<em><b>Reporting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reporting</em>' attribute.
	 * @see #setReporting(String)
	 * @see symbiosisDM.SymbiosisDMPackage#getSecurityMetric_Reporting()
	 * @model
	 * @generated
	 */
	String getReporting();

	/**
	 * Sets the value of the '{@link symbiosisDM.SecurityMetric#getReporting <em>Reporting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reporting</em>' attribute.
	 * @see #getReporting()
	 * @generated
	 */
	void setReporting(String value);

	/**
	 * Returns the value of the '<em><b>Securitymeasurementgoal</b></em>' reference list.
	 * The list contents are of type {@link symbiosisDM.SecurityMeasurementGoal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Securitymeasurementgoal</em>' reference list.
	 * @see symbiosisDM.SymbiosisDMPackage#getSecurityMetric_Securitymeasurementgoal()
	 * @model
	 * @generated
	 */
	EList<SecurityMeasurementGoal> getSecuritymeasurementgoal();

} // SecurityMetric
