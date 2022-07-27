/**
 */
package dsm.FRIPP;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.FRIPP.ExternalReference#getReferenceType <em>Reference Type</em>}</li>
 *   <li>{@link dsm.FRIPP.ExternalReference#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see dsm.FRIPP.FRIPPPackage#getExternalReference()
 * @model
 * @generated
 */
public interface ExternalReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Reference Type</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link dsm.FRIPP.REFERENCE_TYPE_ENUM}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Type</em>' attribute.
	 * @see dsm.FRIPP.REFERENCE_TYPE_ENUM
	 * @see #setReferenceType(REFERENCE_TYPE_ENUM)
	 * @see dsm.FRIPP.FRIPPPackage#getExternalReference_ReferenceType()
	 * @model default=""
	 * @generated
	 */
	REFERENCE_TYPE_ENUM getReferenceType();

	/**
	 * Sets the value of the '{@link dsm.FRIPP.ExternalReference#getReferenceType <em>Reference Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Type</em>' attribute.
	 * @see dsm.FRIPP.REFERENCE_TYPE_ENUM
	 * @see #getReferenceType()
	 * @generated
	 */
	void setReferenceType(REFERENCE_TYPE_ENUM value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dsm.FRIPP.FRIPPPackage#getExternalReference_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dsm.FRIPP.ExternalReference#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ExternalReference
