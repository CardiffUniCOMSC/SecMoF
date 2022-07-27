/**
 */
package PROVE;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PROVE.ArtifactState#isAchievedStatus <em>Achieved Status</em>}</li>
 *   <li>{@link PROVE.ArtifactState#getArtifactName <em>Artifact Name</em>}</li>
 *   <li>{@link PROVE.ArtifactState#getArtifactstateinstance <em>Artifactstateinstance</em>}</li>
 *   <li>{@link PROVE.ArtifactState#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see PROVE.PROVEPackage#getArtifactState()
 * @model
 * @generated
 */
public interface ArtifactState extends EObject {
	/**
	 * Returns the value of the '<em><b>Achieved Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Achieved Status</em>' attribute.
	 * @see #setAchievedStatus(boolean)
	 * @see PROVE.PROVEPackage#getArtifactState_AchievedStatus()
	 * @model
	 * @generated
	 */
	boolean isAchievedStatus();

	/**
	 * Sets the value of the '{@link PROVE.ArtifactState#isAchievedStatus <em>Achieved Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Achieved Status</em>' attribute.
	 * @see #isAchievedStatus()
	 * @generated
	 */
	void setAchievedStatus(boolean value);

	/**
	 * Returns the value of the '<em><b>Artifact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Name</em>' attribute.
	 * @see #setArtifactName(String)
	 * @see PROVE.PROVEPackage#getArtifactState_ArtifactName()
	 * @model
	 * @generated
	 */
	String getArtifactName();

	/**
	 * Sets the value of the '{@link PROVE.ArtifactState#getArtifactName <em>Artifact Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact Name</em>' attribute.
	 * @see #getArtifactName()
	 * @generated
	 */
	void setArtifactName(String value);

	/**
	 * Returns the value of the '<em><b>Artifactstateinstance</b></em>' containment reference list.
	 * The list contents are of type {@link PROVE.ArtifactStateInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifactstateinstance</em>' containment reference list.
	 * @see PROVE.PROVEPackage#getArtifactState_Artifactstateinstance()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArtifactStateInstance> getArtifactstateinstance();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see PROVE.PROVEPackage#getArtifactState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link PROVE.ArtifactState#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ArtifactState
