/**
 */
package dsm.FRIPP;

import PROVE.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actuator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.FRIPP.Actuator#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see dsm.FRIPP.FRIPPPackage#getActuator()
 * @model
 * @generated
 */
public interface Actuator extends Resource {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link dsm.FRIPP.ACTUATOR_TYPE_ENUM}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see dsm.FRIPP.ACTUATOR_TYPE_ENUM
	 * @see #setType(ACTUATOR_TYPE_ENUM)
	 * @see dsm.FRIPP.FRIPPPackage#getActuator_Type()
	 * @model default=""
	 * @generated
	 */
	ACTUATOR_TYPE_ENUM getType();

	/**
	 * Sets the value of the '{@link dsm.FRIPP.Actuator#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see dsm.FRIPP.ACTUATOR_TYPE_ENUM
	 * @see #getType()
	 * @generated
	 */
	void setType(ACTUATOR_TYPE_ENUM value);

} // Actuator
