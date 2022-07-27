/**
 */
package PROVE;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact State Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PROVE.ArtifactStateInstance#getUsedByActivity <em>Used By Activity</em>}</li>
 *   <li>{@link PROVE.ArtifactStateInstance#getOriginatingActivity <em>Originating Activity</em>}</li>
 * </ul>
 *
 * @see PROVE.PROVEPackage#getArtifactStateInstance()
 * @model
 * @generated
 */
public interface ArtifactStateInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Used By Activity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link PROVE.Process#getArtifactInStateUsed <em>Artifact In State Used</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used By Activity</em>' reference.
	 * @see #setUsedByActivity(PROVE.Process)
	 * @see PROVE.PROVEPackage#getArtifactStateInstance_UsedByActivity()
	 * @see PROVE.Process#getArtifactInStateUsed
	 * @model opposite="artifactInStateUsed"
	 * @generated
	 */
	PROVE.Process getUsedByActivity();

	/**
	 * Sets the value of the '{@link PROVE.ArtifactStateInstance#getUsedByActivity <em>Used By Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Used By Activity</em>' reference.
	 * @see #getUsedByActivity()
	 * @generated
	 */
	void setUsedByActivity(PROVE.Process value);

	/**
	 * Returns the value of the '<em><b>Originating Activity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link PROVE.Process#getResultArtifactInState <em>Result Artifact In State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Originating Activity</em>' reference.
	 * @see #setOriginatingActivity(PROVE.Process)
	 * @see PROVE.PROVEPackage#getArtifactStateInstance_OriginatingActivity()
	 * @see PROVE.Process#getResultArtifactInState
	 * @model opposite="resultArtifactInState"
	 * @generated
	 */
	PROVE.Process getOriginatingActivity();

	/**
	 * Sets the value of the '{@link PROVE.ArtifactStateInstance#getOriginatingActivity <em>Originating Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Originating Activity</em>' reference.
	 * @see #getOriginatingActivity()
	 * @generated
	 */
	void setOriginatingActivity(PROVE.Process value);

} // ArtifactStateInstance
