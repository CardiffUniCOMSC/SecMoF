/**
 */
package symbiosisDM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link symbiosisDM.BaseMeasurement#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see symbiosisDM.SymbiosisDMPackage#getBaseMeasurement()
 * @model
 * @generated
 */
public interface BaseMeasurement extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see symbiosisDM.SymbiosisDMPackage#getBaseMeasurement_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link symbiosisDM.BaseMeasurement#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // BaseMeasurement
