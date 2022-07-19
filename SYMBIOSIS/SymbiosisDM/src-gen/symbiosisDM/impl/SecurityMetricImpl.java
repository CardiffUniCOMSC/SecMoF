/**
 */
package symbiosisDM.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import symbiosisDM.BaseMeasurement;
import symbiosisDM.SecurityMeasurementGoal;
import symbiosisDM.SecurityMetric;
import symbiosisDM.SymbiosisDMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Metric</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link symbiosisDM.impl.SecurityMetricImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link symbiosisDM.impl.SecurityMetricImpl#getGoal <em>Goal</em>}</li>
 *   <li>{@link symbiosisDM.impl.SecurityMetricImpl#getBasemeasurement <em>Basemeasurement</em>}</li>
 *   <li>{@link symbiosisDM.impl.SecurityMetricImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link symbiosisDM.impl.SecurityMetricImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link symbiosisDM.impl.SecurityMetricImpl#getInterpretation <em>Interpretation</em>}</li>
 *   <li>{@link symbiosisDM.impl.SecurityMetricImpl#getReporting <em>Reporting</em>}</li>
 *   <li>{@link symbiosisDM.impl.SecurityMetricImpl#getSecuritymeasurementgoal <em>Securitymeasurementgoal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityMetricImpl extends MinimalEObjectImpl.Container implements SecurityMetric {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getGoal() <em>Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal()
	 * @generated
	 * @ordered
	 */
	protected static final String GOAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGoal() <em>Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal()
	 * @generated
	 * @ordered
	 */
	protected String goal = GOAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBasemeasurement() <em>Basemeasurement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasemeasurement()
	 * @generated
	 * @ordered
	 */
	protected EList<BaseMeasurement> basemeasurement;

	/**
	 * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected String method = METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected static final String FUNCTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected String function = FUNCTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterpretation() <em>Interpretation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpretation()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERPRETATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterpretation() <em>Interpretation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpretation()
	 * @generated
	 * @ordered
	 */
	protected String interpretation = INTERPRETATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getReporting() <em>Reporting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReporting()
	 * @generated
	 * @ordered
	 */
	protected static final String REPORTING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReporting() <em>Reporting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReporting()
	 * @generated
	 * @ordered
	 */
	protected String reporting = REPORTING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSecuritymeasurementgoal() <em>Securitymeasurementgoal</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecuritymeasurementgoal()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityMeasurementGoal> securitymeasurementgoal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityMetricImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymbiosisDMPackage.Literals.SECURITY_METRIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymbiosisDMPackage.SECURITY_METRIC__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGoal() {
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoal(String newGoal) {
		String oldGoal = goal;
		goal = newGoal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymbiosisDMPackage.SECURITY_METRIC__GOAL, oldGoal,
					goal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BaseMeasurement> getBasemeasurement() {
		if (basemeasurement == null) {
			basemeasurement = new EObjectResolvingEList<BaseMeasurement>(BaseMeasurement.class, this,
					SymbiosisDMPackage.SECURITY_METRIC__BASEMEASUREMENT);
		}
		return basemeasurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(String newMethod) {
		String oldMethod = method;
		method = newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymbiosisDMPackage.SECURITY_METRIC__METHOD, oldMethod,
					method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFunction() {
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunction(String newFunction) {
		String oldFunction = function;
		function = newFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymbiosisDMPackage.SECURITY_METRIC__FUNCTION,
					oldFunction, function));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInterpretation() {
		return interpretation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterpretation(String newInterpretation) {
		String oldInterpretation = interpretation;
		interpretation = newInterpretation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymbiosisDMPackage.SECURITY_METRIC__INTERPRETATION,
					oldInterpretation, interpretation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReporting() {
		return reporting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReporting(String newReporting) {
		String oldReporting = reporting;
		reporting = newReporting;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymbiosisDMPackage.SECURITY_METRIC__REPORTING,
					oldReporting, reporting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityMeasurementGoal> getSecuritymeasurementgoal() {
		if (securitymeasurementgoal == null) {
			securitymeasurementgoal = new EObjectResolvingEList<SecurityMeasurementGoal>(SecurityMeasurementGoal.class,
					this, SymbiosisDMPackage.SECURITY_METRIC__SECURITYMEASUREMENTGOAL);
		}
		return securitymeasurementgoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SymbiosisDMPackage.SECURITY_METRIC__DESCRIPTION:
			return getDescription();
		case SymbiosisDMPackage.SECURITY_METRIC__GOAL:
			return getGoal();
		case SymbiosisDMPackage.SECURITY_METRIC__BASEMEASUREMENT:
			return getBasemeasurement();
		case SymbiosisDMPackage.SECURITY_METRIC__METHOD:
			return getMethod();
		case SymbiosisDMPackage.SECURITY_METRIC__FUNCTION:
			return getFunction();
		case SymbiosisDMPackage.SECURITY_METRIC__INTERPRETATION:
			return getInterpretation();
		case SymbiosisDMPackage.SECURITY_METRIC__REPORTING:
			return getReporting();
		case SymbiosisDMPackage.SECURITY_METRIC__SECURITYMEASUREMENTGOAL:
			return getSecuritymeasurementgoal();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SymbiosisDMPackage.SECURITY_METRIC__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case SymbiosisDMPackage.SECURITY_METRIC__GOAL:
			setGoal((String) newValue);
			return;
		case SymbiosisDMPackage.SECURITY_METRIC__BASEMEASUREMENT:
			getBasemeasurement().clear();
			getBasemeasurement().addAll((Collection<? extends BaseMeasurement>) newValue);
			return;
		case SymbiosisDMPackage.SECURITY_METRIC__METHOD:
			setMethod((String) newValue);
			return;
		case SymbiosisDMPackage.SECURITY_METRIC__FUNCTION:
			setFunction((String) newValue);
			return;
		case SymbiosisDMPackage.SECURITY_METRIC__INTERPRETATION:
			setInterpretation((String) newValue);
			return;
		case SymbiosisDMPackage.SECURITY_METRIC__REPORTING:
			setReporting((String) newValue);
			return;
		case SymbiosisDMPackage.SECURITY_METRIC__SECURITYMEASUREMENTGOAL:
			getSecuritymeasurementgoal().clear();
			getSecuritymeasurementgoal().addAll((Collection<? extends SecurityMeasurementGoal>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SymbiosisDMPackage.SECURITY_METRIC__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case SymbiosisDMPackage.SECURITY_METRIC__GOAL:
			setGoal(GOAL_EDEFAULT);
			return;
		case SymbiosisDMPackage.SECURITY_METRIC__BASEMEASUREMENT:
			getBasemeasurement().clear();
			return;
		case SymbiosisDMPackage.SECURITY_METRIC__METHOD:
			setMethod(METHOD_EDEFAULT);
			return;
		case SymbiosisDMPackage.SECURITY_METRIC__FUNCTION:
			setFunction(FUNCTION_EDEFAULT);
			return;
		case SymbiosisDMPackage.SECURITY_METRIC__INTERPRETATION:
			setInterpretation(INTERPRETATION_EDEFAULT);
			return;
		case SymbiosisDMPackage.SECURITY_METRIC__REPORTING:
			setReporting(REPORTING_EDEFAULT);
			return;
		case SymbiosisDMPackage.SECURITY_METRIC__SECURITYMEASUREMENTGOAL:
			getSecuritymeasurementgoal().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SymbiosisDMPackage.SECURITY_METRIC__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case SymbiosisDMPackage.SECURITY_METRIC__GOAL:
			return GOAL_EDEFAULT == null ? goal != null : !GOAL_EDEFAULT.equals(goal);
		case SymbiosisDMPackage.SECURITY_METRIC__BASEMEASUREMENT:
			return basemeasurement != null && !basemeasurement.isEmpty();
		case SymbiosisDMPackage.SECURITY_METRIC__METHOD:
			return METHOD_EDEFAULT == null ? method != null : !METHOD_EDEFAULT.equals(method);
		case SymbiosisDMPackage.SECURITY_METRIC__FUNCTION:
			return FUNCTION_EDEFAULT == null ? function != null : !FUNCTION_EDEFAULT.equals(function);
		case SymbiosisDMPackage.SECURITY_METRIC__INTERPRETATION:
			return INTERPRETATION_EDEFAULT == null ? interpretation != null
					: !INTERPRETATION_EDEFAULT.equals(interpretation);
		case SymbiosisDMPackage.SECURITY_METRIC__REPORTING:
			return REPORTING_EDEFAULT == null ? reporting != null : !REPORTING_EDEFAULT.equals(reporting);
		case SymbiosisDMPackage.SECURITY_METRIC__SECURITYMEASUREMENTGOAL:
			return securitymeasurementgoal != null && !securitymeasurementgoal.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (description: ");
		result.append(description);
		result.append(", goal: ");
		result.append(goal);
		result.append(", method: ");
		result.append(method);
		result.append(", function: ");
		result.append(function);
		result.append(", interpretation: ");
		result.append(interpretation);
		result.append(", reporting: ");
		result.append(reporting);
		result.append(')');
		return result.toString();
	}

} //SecurityMetricImpl
