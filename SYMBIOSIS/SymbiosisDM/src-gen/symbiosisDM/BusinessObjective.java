/**
 */
package symbiosisDM;

import dependencyModel.Paragon;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Objective</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link symbiosisDM.BusinessObjective#getObject <em>Object</em>}</li>
 *   <li>{@link symbiosisDM.BusinessObjective#getScope <em>Scope</em>}</li>
 *   <li>{@link symbiosisDM.BusinessObjective#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link symbiosisDM.BusinessObjective#getViewpoint <em>Viewpoint</em>}</li>
 *   <li>{@link symbiosisDM.BusinessObjective#getContext <em>Context</em>}</li>
 *   <li>{@link symbiosisDM.BusinessObjective#getRelatedBusinessobjective <em>Related Businessobjective</em>}</li>
 *   <li>{@link symbiosisDM.BusinessObjective#getParagon <em>Paragon</em>}</li>
 * </ul>
 *
 * @see symbiosisDM.SymbiosisDMPackage#getBusinessObjective()
 * @model
 * @generated
 */
public interface BusinessObjective extends EObject {
	/**
	 * Returns the value of the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' attribute.
	 * @see #setObject(String)
	 * @see symbiosisDM.SymbiosisDMPackage#getBusinessObjective_Object()
	 * @model derived="true"
	 * @generated
	 */
	String getObject();

	/**
	 * Sets the value of the '{@link symbiosisDM.BusinessObjective#getObject <em>Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' attribute.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(String value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see #setScope(String)
	 * @see symbiosisDM.SymbiosisDMPackage#getBusinessObjective_Scope()
	 * @model
	 * @generated
	 */
	String getScope();

	/**
	 * Sets the value of the '{@link symbiosisDM.BusinessObjective#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(String value);

	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purpose</em>' attribute.
	 * @see #setPurpose(String)
	 * @see symbiosisDM.SymbiosisDMPackage#getBusinessObjective_Purpose()
	 * @model
	 * @generated
	 */
	String getPurpose();

	/**
	 * Sets the value of the '{@link symbiosisDM.BusinessObjective#getPurpose <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' attribute.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(String value);

	/**
	 * Returns the value of the '<em><b>Viewpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Viewpoint</em>' attribute.
	 * @see #setViewpoint(String)
	 * @see symbiosisDM.SymbiosisDMPackage#getBusinessObjective_Viewpoint()
	 * @model
	 * @generated
	 */
	String getViewpoint();

	/**
	 * Sets the value of the '{@link symbiosisDM.BusinessObjective#getViewpoint <em>Viewpoint</em>}' attribute.
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
	 * @see symbiosisDM.SymbiosisDMPackage#getBusinessObjective_Context()
	 * @model
	 * @generated
	 */
	String getContext();

	/**
	 * Sets the value of the '{@link symbiosisDM.BusinessObjective#getContext <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' attribute.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(String value);

	/**
	 * Returns the value of the '<em><b>Related Businessobjective</b></em>' reference list.
	 * The list contents are of type {@link symbiosisDM.BusinessObjective}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Businessobjective</em>' reference list.
	 * @see symbiosisDM.SymbiosisDMPackage#getBusinessObjective_RelatedBusinessobjective()
	 * @model
	 * @generated
	 */
	EList<BusinessObjective> getRelatedBusinessobjective();

	/**
	 * Returns the value of the '<em><b>Paragon</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paragon</em>' reference.
	 * @see #setParagon(Paragon)
	 * @see symbiosisDM.SymbiosisDMPackage#getBusinessObjective_Paragon()
	 * @model
	 * @generated
	 */
	Paragon getParagon();

	/**
	 * Sets the value of the '{@link symbiosisDM.BusinessObjective#getParagon <em>Paragon</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paragon</em>' reference.
	 * @see #getParagon()
	 * @generated
	 */
	void setParagon(Paragon value);

} // BusinessObjective
