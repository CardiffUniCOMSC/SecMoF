/**
 */
package dsm.FRIPP;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.FRIPP.Organisation#getPlaybookprocess <em>Playbookprocess</em>}</li>
 *   <li>{@link dsm.FRIPP.Organisation#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see dsm.FRIPP.FRIPPPackage#getOrganisation()
 * @model
 * @generated
 */
public interface Organisation extends EObject {
	/**
	 * Returns the value of the '<em><b>Playbookprocess</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.FRIPP.PlaybookProcess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Playbookprocess</em>' containment reference list.
	 * @see dsm.FRIPP.FRIPPPackage#getOrganisation_Playbookprocess()
	 * @model containment="true"
	 * @generated
	 */
	EList<PlaybookProcess> getPlaybookprocess();

	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.FRIPP.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' containment reference list.
	 * @see dsm.FRIPP.FRIPPPackage#getOrganisation_Role()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role> getRole();

} // Organisation
