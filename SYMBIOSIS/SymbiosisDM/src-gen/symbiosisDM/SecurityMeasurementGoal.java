/**
 */
package symbiosisDM;

import dependencyModel.Paragon;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Measurement Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link symbiosisDM.SecurityMeasurementGoal#getObject <em>Object</em>}</li>
 *   <li>{@link symbiosisDM.SecurityMeasurementGoal#getViewpoint <em>Viewpoint</em>}</li>
 *   <li>{@link symbiosisDM.SecurityMeasurementGoal#getContext <em>Context</em>}</li>
 *   <li>{@link symbiosisDM.SecurityMeasurementGoal#getScope <em>Scope</em>}</li>
 *   <li>{@link symbiosisDM.SecurityMeasurementGoal#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link symbiosisDM.SecurityMeasurementGoal#getFocus <em>Focus</em>}</li>
 *   <li>{@link symbiosisDM.SecurityMeasurementGoal#getCriteria <em>Criteria</em>}</li>
 *   <li>{@link symbiosisDM.SecurityMeasurementGoal#getBusinessobjective <em>Businessobjective</em>}</li>
 *   <li>{@link symbiosisDM.SecurityMeasurementGoal#getParagon <em>Paragon</em>}</li>
 * </ul>
 *
 * @see symbiosisDM.SymbiosisDMPackage#getSecurityMeasurementGoal()
 * @model
 * @generated
 */
public interface SecurityMeasurementGoal extends EObject {
	/**
	 * Returns the value of the '<em><b>Viewpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Viewpoint</em>' attribute.
	 * @see #setViewpoint(String)
	 * @see symbiosisDM.SymbiosisDMPackage#getSecurityMeasurementGoal_Viewpoint()
	 * @model unique="false"
	 * @generated
	 */
	String getViewpoint();

	/**
	 * Sets the value of the '{@link symbiosisDM.SecurityMeasurementGoal#getViewpoint <em>Viewpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Viewpoint</em>' attribute.
	 * @see #getViewpoint()
	 * @generated
	 */
	void setViewpoint(String value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' attribute.
	 * @see #setContext(String)
	 * @see symbiosisDM.SymbiosisDMPackage#getSecurityMeasurementGoal_Context()
	 * @model
	 * @generated
	 */
	String getContext();

	/**
	 * Sets the value of the '{@link symbiosisDM.SecurityMeasurementGoal#getContext <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' attribute.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(String value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see #setScope(String)
	 * @see symbiosisDM.SymbiosisDMPackage#getSecurityMeasurementGoal_Scope()
	 * @model
	 * @generated
	 */
	String getScope();

	/**
	 * Sets the value of the '{@link symbiosisDM.SecurityMeasurementGoal#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(String value);

	/**
	 * Returns the value of the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' attribute.
	 * @see #setObject(String)
	 * @see symbiosisDM.SymbiosisDMPackage#getSecurityMeasurementGoal_Object()
	 * @model id="true" derived="true"
	 * @generated
	 */
	String getObject();

	/**
	 * Sets the value of the '{@link symbiosisDM.SecurityMeasurementGoal#getObject <em>Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' attribute.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(String value);

	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purpose</em>' attribute.
	 * @see #setPurpose(String)
	 * @see symbiosisDM.SymbiosisDMPackage#getSecurityMeasurementGoal_Purpose()
	 * @model
	 * @generated
	 */
	String getPurpose();

	/**
	 * Sets the value of the '{@link symbiosisDM.SecurityMeasurementGoal#getPurpose <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' attribute.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(String value);

	/**
	 * Returns the value of the '<em><b>Focus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Focus</em>' attribute.
	 * @see #setFocus(String)
	 * @see symbiosisDM.SymbiosisDMPackage#getSecurityMeasurementGoal_Focus()
	 * @model
	 * @generated
	 */
	String getFocus();

	/**
	 * Sets the value of the '{@link symbiosisDM.SecurityMeasurementGoal#getFocus <em>Focus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Focus</em>' attribute.
	 * @see #getFocus()
	 * @generated
	 */
	void setFocus(String value);

	/**
	 * Returns the value of the '<em><b>Criteria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criteria</em>' attribute.
	 * @see #setCriteria(String)
	 * @see symbiosisDM.SymbiosisDMPackage#getSecurityMeasurementGoal_Criteria()
	 * @model
	 * @generated
	 */
	String getCriteria();

	/**
	 * Sets the value of the '{@link symbiosisDM.SecurityMeasurementGoal#getCriteria <em>Criteria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criteria</em>' attribute.
	 * @see #getCriteria()
	 * @generated
	 */
	void setCriteria(String value);

	/**
	 * Returns the value of the '<em><b>Businessobjective</b></em>' reference list.
	 * The list contents are of type {@link symbiosisDM.BusinessObjective}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Businessobjective</em>' reference list.
	 * @see symbiosisDM.SymbiosisDMPackage#getSecurityMeasurementGoal_Businessobjective()
	 * @model
	 * @generated
	 */
	EList<BusinessObjective> getBusinessobjective();

	/**
	 * Returns the value of the '<em><b>Paragon</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paragon</em>' reference.
	 * @see #setParagon(Paragon)
	 * @see symbiosisDM.SymbiosisDMPackage#getSecurityMeasurementGoal_Paragon()
	 * @model
	 * @generated
	 */
	Paragon getParagon();

	/**
	 * Sets the value of the '{@link symbiosisDM.SecurityMeasurementGoal#getParagon <em>Paragon</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paragon</em>' reference.
	 * @see #getParagon()
	 * @generated
	 */
	void setParagon(Paragon value);

} // SecurityMeasurementGoal
