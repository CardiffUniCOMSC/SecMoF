/**
 */
package symbiosisDM;

import dependencyModel.Paragon;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SYMBIOSIS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link symbiosisDM.SYMBIOSIS#getBusinessobjective <em>Businessobjective</em>}</li>
 *   <li>{@link symbiosisDM.SYMBIOSIS#getSecuritymeasurementgoal <em>Securitymeasurementgoal</em>}</li>
 *   <li>{@link symbiosisDM.SYMBIOSIS#getSecuritymetric <em>Securitymetric</em>}</li>
 *   <li>{@link symbiosisDM.SYMBIOSIS#getBasemeasurement <em>Basemeasurement</em>}</li>
 *   <li>{@link symbiosisDM.SYMBIOSIS#getDependencyModel <em>Dependency Model</em>}</li>
 * </ul>
 *
 * @see symbiosisDM.SymbiosisDMPackage#getSYMBIOSIS()
 * @model
 * @generated
 */
public interface SYMBIOSIS extends EObject {
	/**
	 * Returns the value of the '<em><b>Businessobjective</b></em>' containment reference list.
	 * The list contents are of type {@link symbiosisDM.BusinessObjective}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Businessobjective</em>' containment reference list.
	 * @see symbiosisDM.SymbiosisDMPackage#getSYMBIOSIS_Businessobjective()
	 * @model containment="true"
	 * @generated
	 */
	EList<BusinessObjective> getBusinessobjective();

	/**
	 * Returns the value of the '<em><b>Securitymeasurementgoal</b></em>' containment reference list.
	 * The list contents are of type {@link symbiosisDM.SecurityMeasurementGoal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Securitymeasurementgoal</em>' containment reference list.
	 * @see symbiosisDM.SymbiosisDMPackage#getSYMBIOSIS_Securitymeasurementgoal()
	 * @model containment="true"
	 * @generated
	 */
	EList<SecurityMeasurementGoal> getSecuritymeasurementgoal();

	/**
	 * Returns the value of the '<em><b>Securitymetric</b></em>' containment reference list.
	 * The list contents are of type {@link symbiosisDM.SecurityMetric}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Securitymetric</em>' containment reference list.
	 * @see symbiosisDM.SymbiosisDMPackage#getSYMBIOSIS_Securitymetric()
	 * @model containment="true"
	 * @generated
	 */
	EList<SecurityMetric> getSecuritymetric();

	/**
	 * Returns the value of the '<em><b>Basemeasurement</b></em>' containment reference list.
	 * The list contents are of type {@link symbiosisDM.BaseMeasurement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basemeasurement</em>' containment reference list.
	 * @see symbiosisDM.SymbiosisDMPackage#getSYMBIOSIS_Basemeasurement()
	 * @model containment="true"
	 * @generated
	 */
	EList<BaseMeasurement> getBasemeasurement();

	/**
	 * Returns the value of the '<em><b>Dependency Model</b></em>' reference list.
	 * The list contents are of type {@link dependencyModel.Paragon}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency Model</em>' reference list.
	 * @see symbiosisDM.SymbiosisDMPackage#getSYMBIOSIS_DependencyModel()
	 * @model
	 * @generated
	 */
	EList<Paragon> getDependencyModel();

} // SYMBIOSIS
