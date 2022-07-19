/**
 */
package symbiosisDM.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import symbiosisDM.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see symbiosisDM.SymbiosisDMPackage
 * @generated
 */
public class SymbiosisDMSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SymbiosisDMPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbiosisDMSwitch() {
		if (modelPackage == null) {
			modelPackage = SymbiosisDMPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case SymbiosisDMPackage.BUSINESS_OBJECTIVE: {
			BusinessObjective businessObjective = (BusinessObjective) theEObject;
			T result = caseBusinessObjective(businessObjective);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SymbiosisDMPackage.SECURITY_MEASUREMENT_GOAL: {
			SecurityMeasurementGoal securityMeasurementGoal = (SecurityMeasurementGoal) theEObject;
			T result = caseSecurityMeasurementGoal(securityMeasurementGoal);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SymbiosisDMPackage.SECURITY_METRIC: {
			SecurityMetric securityMetric = (SecurityMetric) theEObject;
			T result = caseSecurityMetric(securityMetric);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SymbiosisDMPackage.BASE_MEASUREMENT: {
			BaseMeasurement baseMeasurement = (BaseMeasurement) theEObject;
			T result = caseBaseMeasurement(baseMeasurement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SymbiosisDMPackage.SYMBIOSIS: {
			SYMBIOSIS symbiosis = (SYMBIOSIS) theEObject;
			T result = caseSYMBIOSIS(symbiosis);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Business Objective</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Objective</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBusinessObjective(BusinessObjective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Measurement Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Measurement Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityMeasurementGoal(SecurityMeasurementGoal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityMetric(SecurityMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Measurement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseMeasurement(BaseMeasurement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SYMBIOSIS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SYMBIOSIS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSYMBIOSIS(SYMBIOSIS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SymbiosisDMSwitch
