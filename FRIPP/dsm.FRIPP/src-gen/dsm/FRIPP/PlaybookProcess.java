/**
 */
package dsm.FRIPP;

import dependencyModel.Paragon;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Playbook Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.FRIPP.PlaybookProcess#getObjectives <em>Objectives</em>}</li>
 *   <li>{@link dsm.FRIPP.PlaybookProcess#getActionType <em>Action Type</em>}</li>
 *   <li>{@link dsm.FRIPP.PlaybookProcess#getRelatedreferences <em>Relatedreferences</em>}</li>
 *   <li>{@link dsm.FRIPP.PlaybookProcess#getExternalreferences <em>Externalreferences</em>}</li>
 *   <li>{@link dsm.FRIPP.PlaybookProcess#getParagon <em>Paragon</em>}</li>
 *   <li>{@link dsm.FRIPP.PlaybookProcess#getActivityimpact <em>Activityimpact</em>}</li>
 *   <li>{@link dsm.FRIPP.PlaybookProcess#getAssociatedRole <em>Associated Role</em>}</li>
 * </ul>
 *
 * @see dsm.FRIPP.FRIPPPackage#getPlaybookProcess()
 * @model
 * @generated
 */
public interface PlaybookProcess extends dsm.PROVE.Process {
	/**
	 * Returns the value of the '<em><b>Objectives</b></em>' attribute list.
	 * The list contents are of type {@link dsm.FRIPP.OBJECTIVES_ENUM}.
	 * The literals are from the enumeration {@link dsm.FRIPP.OBJECTIVES_ENUM}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objectives</em>' attribute list.
	 * @see dsm.FRIPP.OBJECTIVES_ENUM
	 * @see dsm.FRIPP.FRIPPPackage#getPlaybookProcess_Objectives()
	 * @model
	 * @generated
	 */
	EList<OBJECTIVES_ENUM> getObjectives();

	/**
	 * Returns the value of the '<em><b>Action Type</b></em>' attribute.
	 * The default value is <code>"MANUAL"</code>.
	 * The literals are from the enumeration {@link dsm.FRIPP.ACTION_TYPE_ENUM}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Type</em>' attribute.
	 * @see dsm.FRIPP.ACTION_TYPE_ENUM
	 * @see #setActionType(ACTION_TYPE_ENUM)
	 * @see dsm.FRIPP.FRIPPPackage#getPlaybookProcess_ActionType()
	 * @model default="MANUAL"
	 * @generated
	 */
	ACTION_TYPE_ENUM getActionType();

	/**
	 * Sets the value of the '{@link dsm.FRIPP.PlaybookProcess#getActionType <em>Action Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Type</em>' attribute.
	 * @see dsm.FRIPP.ACTION_TYPE_ENUM
	 * @see #getActionType()
	 * @generated
	 */
	void setActionType(ACTION_TYPE_ENUM value);

	/**
	 * Returns the value of the '<em><b>Relatedreferences</b></em>' reference list.
	 * The list contents are of type {@link dsm.FRIPP.ExternalReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relatedreferences</em>' reference list.
	 * @see dsm.FRIPP.FRIPPPackage#getPlaybookProcess_Relatedreferences()
	 * @model
	 * @generated
	 */
	EList<ExternalReference> getRelatedreferences();

	/**
	 * Returns the value of the '<em><b>Externalreferences</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.FRIPP.ExternalReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Externalreferences</em>' containment reference list.
	 * @see dsm.FRIPP.FRIPPPackage#getPlaybookProcess_Externalreferences()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExternalReference> getExternalreferences();

	/**
	 * Returns the value of the '<em><b>Paragon</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paragon</em>' reference.
	 * @see #setParagon(Paragon)
	 * @see dsm.FRIPP.FRIPPPackage#getPlaybookProcess_Paragon()
	 * @model
	 * @generated
	 */
	Paragon getParagon();

	/**
	 * Sets the value of the '{@link dsm.FRIPP.PlaybookProcess#getParagon <em>Paragon</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paragon</em>' reference.
	 * @see #getParagon()
	 * @generated
	 */
	void setParagon(Paragon value);

	/**
	 * Returns the value of the '<em><b>Activityimpact</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.FRIPP.ActivityImpact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activityimpact</em>' containment reference list.
	 * @see dsm.FRIPP.FRIPPPackage#getPlaybookProcess_Activityimpact()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActivityImpact> getActivityimpact();

	/**
	 * Returns the value of the '<em><b>Associated Role</b></em>' reference list.
	 * The list contents are of type {@link dsm.FRIPP.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associated Role</em>' reference list.
	 * @see dsm.FRIPP.FRIPPPackage#getPlaybookProcess_AssociatedRole()
	 * @model
	 * @generated
	 */
	EList<Role> getAssociatedRole();

} // PlaybookProcess
