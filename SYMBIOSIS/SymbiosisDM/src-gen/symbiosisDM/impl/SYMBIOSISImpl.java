/**
 */
package symbiosisDM.impl;

import dependencyModel.Paragon;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import symbiosisDM.BaseMeasurement;
import symbiosisDM.BusinessObjective;
import symbiosisDM.SYMBIOSIS;
import symbiosisDM.SecurityMeasurementGoal;
import symbiosisDM.SecurityMetric;
import symbiosisDM.SymbiosisDMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SYMBIOSIS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link symbiosisDM.impl.SYMBIOSISImpl#getBusinessobjective <em>Businessobjective</em>}</li>
 *   <li>{@link symbiosisDM.impl.SYMBIOSISImpl#getSecuritymeasurementgoal <em>Securitymeasurementgoal</em>}</li>
 *   <li>{@link symbiosisDM.impl.SYMBIOSISImpl#getSecuritymetric <em>Securitymetric</em>}</li>
 *   <li>{@link symbiosisDM.impl.SYMBIOSISImpl#getBasemeasurement <em>Basemeasurement</em>}</li>
 *   <li>{@link symbiosisDM.impl.SYMBIOSISImpl#getDependencyModel <em>Dependency Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SYMBIOSISImpl extends MinimalEObjectImpl.Container implements SYMBIOSIS {
	/**
	 * The cached value of the '{@link #getBusinessobjective() <em>Businessobjective</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessobjective()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessObjective> businessobjective;

	/**
	 * The cached value of the '{@link #getSecuritymeasurementgoal() <em>Securitymeasurementgoal</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecuritymeasurementgoal()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityMeasurementGoal> securitymeasurementgoal;

	/**
	 * The cached value of the '{@link #getSecuritymetric() <em>Securitymetric</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecuritymetric()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityMetric> securitymetric;

	/**
	 * The cached value of the '{@link #getBasemeasurement() <em>Basemeasurement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasemeasurement()
	 * @generated
	 * @ordered
	 */
	protected EList<BaseMeasurement> basemeasurement;

	/**
	 * The cached value of the '{@link #getDependencyModel() <em>Dependency Model</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencyModel()
	 * @generated
	 * @ordered
	 */
	protected EList<Paragon> dependencyModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SYMBIOSISImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymbiosisDMPackage.Literals.SYMBIOSIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessObjective> getBusinessobjective() {
		if (businessobjective == null) {
			businessobjective = new EObjectContainmentEList<BusinessObjective>(BusinessObjective.class, this,
					SymbiosisDMPackage.SYMBIOSIS__BUSINESSOBJECTIVE);
		}
		return businessobjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityMeasurementGoal> getSecuritymeasurementgoal() {
		if (securitymeasurementgoal == null) {
			securitymeasurementgoal = new EObjectContainmentEList<SecurityMeasurementGoal>(
					SecurityMeasurementGoal.class, this, SymbiosisDMPackage.SYMBIOSIS__SECURITYMEASUREMENTGOAL);
		}
		return securitymeasurementgoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityMetric> getSecuritymetric() {
		if (securitymetric == null) {
			securitymetric = new EObjectContainmentEList<SecurityMetric>(SecurityMetric.class, this,
					SymbiosisDMPackage.SYMBIOSIS__SECURITYMETRIC);
		}
		return securitymetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BaseMeasurement> getBasemeasurement() {
		if (basemeasurement == null) {
			basemeasurement = new EObjectContainmentEList<BaseMeasurement>(BaseMeasurement.class, this,
					SymbiosisDMPackage.SYMBIOSIS__BASEMEASUREMENT);
		}
		return basemeasurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Paragon> getDependencyModel() {
		if (dependencyModel == null) {
			dependencyModel = new EObjectResolvingEList<Paragon>(Paragon.class, this,
					SymbiosisDMPackage.SYMBIOSIS__DEPENDENCY_MODEL);
		}
		return dependencyModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SymbiosisDMPackage.SYMBIOSIS__BUSINESSOBJECTIVE:
			return ((InternalEList<?>) getBusinessobjective()).basicRemove(otherEnd, msgs);
		case SymbiosisDMPackage.SYMBIOSIS__SECURITYMEASUREMENTGOAL:
			return ((InternalEList<?>) getSecuritymeasurementgoal()).basicRemove(otherEnd, msgs);
		case SymbiosisDMPackage.SYMBIOSIS__SECURITYMETRIC:
			return ((InternalEList<?>) getSecuritymetric()).basicRemove(otherEnd, msgs);
		case SymbiosisDMPackage.SYMBIOSIS__BASEMEASUREMENT:
			return ((InternalEList<?>) getBasemeasurement()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SymbiosisDMPackage.SYMBIOSIS__BUSINESSOBJECTIVE:
			return getBusinessobjective();
		case SymbiosisDMPackage.SYMBIOSIS__SECURITYMEASUREMENTGOAL:
			return getSecuritymeasurementgoal();
		case SymbiosisDMPackage.SYMBIOSIS__SECURITYMETRIC:
			return getSecuritymetric();
		case SymbiosisDMPackage.SYMBIOSIS__BASEMEASUREMENT:
			return getBasemeasurement();
		case SymbiosisDMPackage.SYMBIOSIS__DEPENDENCY_MODEL:
			return getDependencyModel();
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
		case SymbiosisDMPackage.SYMBIOSIS__BUSINESSOBJECTIVE:
			getBusinessobjective().clear();
			getBusinessobjective().addAll((Collection<? extends BusinessObjective>) newValue);
			return;
		case SymbiosisDMPackage.SYMBIOSIS__SECURITYMEASUREMENTGOAL:
			getSecuritymeasurementgoal().clear();
			getSecuritymeasurementgoal().addAll((Collection<? extends SecurityMeasurementGoal>) newValue);
			return;
		case SymbiosisDMPackage.SYMBIOSIS__SECURITYMETRIC:
			getSecuritymetric().clear();
			getSecuritymetric().addAll((Collection<? extends SecurityMetric>) newValue);
			return;
		case SymbiosisDMPackage.SYMBIOSIS__BASEMEASUREMENT:
			getBasemeasurement().clear();
			getBasemeasurement().addAll((Collection<? extends BaseMeasurement>) newValue);
			return;
		case SymbiosisDMPackage.SYMBIOSIS__DEPENDENCY_MODEL:
			getDependencyModel().clear();
			getDependencyModel().addAll((Collection<? extends Paragon>) newValue);
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
		case SymbiosisDMPackage.SYMBIOSIS__BUSINESSOBJECTIVE:
			getBusinessobjective().clear();
			return;
		case SymbiosisDMPackage.SYMBIOSIS__SECURITYMEASUREMENTGOAL:
			getSecuritymeasurementgoal().clear();
			return;
		case SymbiosisDMPackage.SYMBIOSIS__SECURITYMETRIC:
			getSecuritymetric().clear();
			return;
		case SymbiosisDMPackage.SYMBIOSIS__BASEMEASUREMENT:
			getBasemeasurement().clear();
			return;
		case SymbiosisDMPackage.SYMBIOSIS__DEPENDENCY_MODEL:
			getDependencyModel().clear();
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
		case SymbiosisDMPackage.SYMBIOSIS__BUSINESSOBJECTIVE:
			return businessobjective != null && !businessobjective.isEmpty();
		case SymbiosisDMPackage.SYMBIOSIS__SECURITYMEASUREMENTGOAL:
			return securitymeasurementgoal != null && !securitymeasurementgoal.isEmpty();
		case SymbiosisDMPackage.SYMBIOSIS__SECURITYMETRIC:
			return securitymetric != null && !securitymetric.isEmpty();
		case SymbiosisDMPackage.SYMBIOSIS__BASEMEASUREMENT:
			return basemeasurement != null && !basemeasurement.isEmpty();
		case SymbiosisDMPackage.SYMBIOSIS__DEPENDENCY_MODEL:
			return dependencyModel != null && !dependencyModel.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SYMBIOSISImpl
