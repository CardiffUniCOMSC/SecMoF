/**
 */
package symbiosisDM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see symbiosisDM.SymbiosisDMPackage
 * @generated
 */
public interface SymbiosisDMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SymbiosisDMFactory eINSTANCE = symbiosisDM.impl.SymbiosisDMFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Business Objective</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Objective</em>'.
	 * @generated
	 */
	BusinessObjective createBusinessObjective();

	/**
	 * Returns a new object of class '<em>Security Measurement Goal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Measurement Goal</em>'.
	 * @generated
	 */
	SecurityMeasurementGoal createSecurityMeasurementGoal();

	/**
	 * Returns a new object of class '<em>Security Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Metric</em>'.
	 * @generated
	 */
	SecurityMetric createSecurityMetric();

	/**
	 * Returns a new object of class '<em>Base Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Base Measurement</em>'.
	 * @generated
	 */
	BaseMeasurement createBaseMeasurement();

	/**
	 * Returns a new object of class '<em>SYMBIOSIS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SYMBIOSIS</em>'.
	 * @generated
	 */
	SYMBIOSIS createSYMBIOSIS();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SymbiosisDMPackage getSymbiosisDMPackage();

} //SymbiosisDMFactory
