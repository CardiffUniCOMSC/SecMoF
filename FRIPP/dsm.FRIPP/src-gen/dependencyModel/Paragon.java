/**
 */
package dependencyModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Paragon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dependencyModel.Paragon#getDescription <em>Description</em>}</li>
 *   <li>{@link dependencyModel.Paragon#getProbability <em>Probability</em>}</li>
 *   <li>{@link dependencyModel.Paragon#getParagon <em>Paragon</em>}</li>
 *   <li>{@link dependencyModel.Paragon#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see dependencyModel.DependencyModelPackage#getParagon()
 * @model
 * @generated
 */
public interface Paragon extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see dependencyModel.DependencyModelPackage#getParagon_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link dependencyModel.Paragon#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Probability</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' attribute.
	 * @see #setProbability(double)
	 * @see dependencyModel.DependencyModelPackage#getParagon_Probability()
	 * @model default="0.0" required="true" derived="true"
	 * @generated
	 */
	double getProbability();

	/**
	 * Sets the value of the '{@link dependencyModel.Paragon#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probability</em>' attribute.
	 * @see #getProbability()
	 * @generated
	 */
	void setProbability(double value);

	/**
	 * Returns the value of the '<em><b>Paragon</b></em>' containment reference list.
	 * The list contents are of type {@link dependencyModel.Paragon}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paragon</em>' containment reference list.
	 * @see dependencyModel.DependencyModelPackage#getParagon_Paragon()
	 * @model containment="true"
	 * @generated
	 */
	EList<Paragon> getParagon();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"UNCONTROLLABLE"</code>.
	 * The literals are from the enumeration {@link dependencyModel.PARAGON_COMPOSITION_ENUM}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see dependencyModel.PARAGON_COMPOSITION_ENUM
	 * @see #setType(PARAGON_COMPOSITION_ENUM)
	 * @see dependencyModel.DependencyModelPackage#getParagon_Type()
	 * @model default="UNCONTROLLABLE"
	 * @generated
	 */
	PARAGON_COMPOSITION_ENUM getType();

	/**
	 * Sets the value of the '{@link dependencyModel.Paragon#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see dependencyModel.PARAGON_COMPOSITION_ENUM
	 * @see #getType()
	 * @generated
	 */
	void setType(PARAGON_COMPOSITION_ENUM value);

} // Paragon
