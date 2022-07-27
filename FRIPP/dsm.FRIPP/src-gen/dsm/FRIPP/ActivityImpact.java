/**
 */
package dsm.FRIPP;

import dependencyModel.PARAGON_COMPOSITION_ENUM;
import dependencyModel.Paragon;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Impact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.FRIPP.ActivityImpact#getParagon <em>Paragon</em>}</li>
 *   <li>{@link dsm.FRIPP.ActivityImpact#getNewValue <em>New Value</em>}</li>
 *   <li>{@link dsm.FRIPP.ActivityImpact#getOriginalType <em>Original Type</em>}</li>
 *   <li>{@link dsm.FRIPP.ActivityImpact#getOriginalProbability <em>Original Probability</em>}</li>
 * </ul>
 *
 * @see dsm.FRIPP.FRIPPPackage#getActivityImpact()
 * @model
 * @generated
 */
public interface ActivityImpact extends EObject {
	/**
	 * Returns the value of the '<em><b>Paragon</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paragon</em>' reference.
	 * @see #setParagon(Paragon)
	 * @see dsm.FRIPP.FRIPPPackage#getActivityImpact_Paragon()
	 * @model
	 * @generated
	 */
	Paragon getParagon();

	/**
	 * Sets the value of the '{@link dsm.FRIPP.ActivityImpact#getParagon <em>Paragon</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paragon</em>' reference.
	 * @see #getParagon()
	 * @generated
	 */
	void setParagon(Paragon value);

	/**
	 * Returns the value of the '<em><b>New Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Value</em>' attribute.
	 * @see #setNewValue(double)
	 * @see dsm.FRIPP.FRIPPPackage#getActivityImpact_NewValue()
	 * @model
	 * @generated
	 */
	double getNewValue();

	/**
	 * Sets the value of the '{@link dsm.FRIPP.ActivityImpact#getNewValue <em>New Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Value</em>' attribute.
	 * @see #getNewValue()
	 * @generated
	 */
	void setNewValue(double value);

	/**
	 * Returns the value of the '<em><b>Original Type</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link dependencyModel.PARAGON_COMPOSITION_ENUM}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Type</em>' attribute.
	 * @see dependencyModel.PARAGON_COMPOSITION_ENUM
	 * @see #setOriginalType(PARAGON_COMPOSITION_ENUM)
	 * @see dsm.FRIPP.FRIPPPackage#getActivityImpact_OriginalType()
	 * @model default="" derived="true"
	 * @generated
	 */
	PARAGON_COMPOSITION_ENUM getOriginalType();

	/**
	 * Sets the value of the '{@link dsm.FRIPP.ActivityImpact#getOriginalType <em>Original Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Type</em>' attribute.
	 * @see dependencyModel.PARAGON_COMPOSITION_ENUM
	 * @see #getOriginalType()
	 * @generated
	 */
	void setOriginalType(PARAGON_COMPOSITION_ENUM value);

	/**
	 * Returns the value of the '<em><b>Original Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Probability</em>' attribute.
	 * @see #setOriginalProbability(double)
	 * @see dsm.FRIPP.FRIPPPackage#getActivityImpact_OriginalProbability()
	 * @model derived="true"
	 * @generated
	 */
	double getOriginalProbability();

	/**
	 * Sets the value of the '{@link dsm.FRIPP.ActivityImpact#getOriginalProbability <em>Original Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Probability</em>' attribute.
	 * @see #getOriginalProbability()
	 * @generated
	 */
	void setOriginalProbability(double value);

} // ActivityImpact
