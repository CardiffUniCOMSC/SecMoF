/**
 */
package PROVE;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PROVE.Process#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link PROVE.Process#getProcess <em>Process</em>}</li>
 *   <li>{@link PROVE.Process#getName <em>Name</em>}</li>
 *   <li>{@link PROVE.Process#getNotes <em>Notes</em>}</li>
 *   <li>{@link PROVE.Process#getArtifactInStateUsed <em>Artifact In State Used</em>}</li>
 *   <li>{@link PROVE.Process#getResultArtifactInState <em>Result Artifact In State</em>}</li>
 *   <li>{@link PROVE.Process#getShadownodeincoming <em>Shadownodeincoming</em>}</li>
 *   <li>{@link PROVE.Process#getShadownodeoutgoing <em>Shadownodeoutgoing</em>}</li>
 *   <li>{@link PROVE.Process#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link PROVE.Process#getEndDate <em>End Date</em>}</li>
 *   <li>{@link PROVE.Process#getResource <em>Resource</em>}</li>
 *   <li>{@link PROVE.Process#getResourceUsed <em>Resource Used</em>}</li>
 *   <li>{@link PROVE.Process#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see PROVE.PROVEPackage#getProcess()
 * @model
 * @generated
 */
public interface Process extends EObject {
	/**
	 * Returns the value of the '<em><b>Artifact</b></em>' containment reference list.
	 * The list contents are of type {@link PROVE.Artifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact</em>' containment reference list.
	 * @see PROVE.PROVEPackage#getProcess_Artifact()
	 * @model containment="true"
	 * @generated
	 */
	EList<Artifact> getArtifact();

	/**
	 * Returns the value of the '<em><b>Process</b></em>' containment reference list.
	 * The list contents are of type {@link PROVE.Process}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' containment reference list.
	 * @see PROVE.PROVEPackage#getProcess_Process()
	 * @model containment="true"
	 * @generated
	 */
	EList<Process> getProcess();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see PROVE.PROVEPackage#getProcess_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link PROVE.Process#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notes</em>' attribute.
	 * @see #setNotes(String)
	 * @see PROVE.PROVEPackage#getProcess_Notes()
	 * @model
	 * @generated
	 */
	String getNotes();

	/**
	 * Sets the value of the '{@link PROVE.Process#getNotes <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' attribute.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(String value);

	/**
	 * Returns the value of the '<em><b>Artifact In State Used</b></em>' reference list.
	 * The list contents are of type {@link PROVE.ArtifactStateInstance}.
	 * It is bidirectional and its opposite is '{@link PROVE.ArtifactStateInstance#getUsedByActivity <em>Used By Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact In State Used</em>' reference list.
	 * @see PROVE.PROVEPackage#getProcess_ArtifactInStateUsed()
	 * @see PROVE.ArtifactStateInstance#getUsedByActivity
	 * @model opposite="usedByActivity"
	 * @generated
	 */
	EList<ArtifactStateInstance> getArtifactInStateUsed();

	/**
	 * Returns the value of the '<em><b>Result Artifact In State</b></em>' reference list.
	 * The list contents are of type {@link PROVE.ArtifactStateInstance}.
	 * It is bidirectional and its opposite is '{@link PROVE.ArtifactStateInstance#getOriginatingActivity <em>Originating Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Artifact In State</em>' reference list.
	 * @see PROVE.PROVEPackage#getProcess_ResultArtifactInState()
	 * @see PROVE.ArtifactStateInstance#getOriginatingActivity
	 * @model opposite="originatingActivity"
	 * @generated
	 */
	EList<ArtifactStateInstance> getResultArtifactInState();

	/**
	 * Returns the value of the '<em><b>Shadownodeincoming</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shadownodeincoming</em>' containment reference.
	 * @see PROVE.PROVEPackage#getProcess_Shadownodeincoming()
	 * @model containment="true" changeable="false"
	 * @generated
	 */
	ShadowNodeIncoming getShadownodeincoming();

	/**
	 * Returns the value of the '<em><b>Shadownodeoutgoing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shadownodeoutgoing</em>' containment reference.
	 * @see PROVE.PROVEPackage#getProcess_Shadownodeoutgoing()
	 * @model containment="true" changeable="false"
	 * @generated
	 */
	ShadowNodeOutgoing getShadownodeoutgoing();

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see PROVE.PROVEPackage#getProcess_StartDate()
	 * @model
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link PROVE.Process#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(Date)
	 * @see PROVE.PROVEPackage#getProcess_EndDate()
	 * @model
	 * @generated
	 */
	Date getEndDate();

	/**
	 * Sets the value of the '{@link PROVE.Process#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(Date value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference list.
	 * The list contents are of type {@link PROVE.Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference list.
	 * @see PROVE.PROVEPackage#getProcess_Resource()
	 * @model containment="true"
	 * @generated
	 */
	EList<Resource> getResource();

	/**
	 * Returns the value of the '<em><b>Resource Used</b></em>' reference list.
	 * The list contents are of type {@link PROVE.Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Used</em>' reference list.
	 * @see PROVE.PROVEPackage#getProcess_ResourceUsed()
	 * @model
	 * @generated
	 */
	EList<Resource> getResourceUsed();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link PROVE.STATUS_ENUM}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see PROVE.STATUS_ENUM
	 * @see #setStatus(STATUS_ENUM)
	 * @see PROVE.PROVEPackage#getProcess_Status()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	STATUS_ENUM getStatus();

	/**
	 * Sets the value of the '{@link PROVE.Process#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see PROVE.STATUS_ENUM
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(STATUS_ENUM value);

} // Process
