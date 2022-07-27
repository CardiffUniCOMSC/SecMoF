/**
 */
package dsm.FRIPP.impl;

import dependencyModel.PARAGON_COMPOSITION_ENUM;
import dependencyModel.Paragon;

import dsm.FRIPP.ActivityImpact;
import dsm.FRIPP.FRIPPPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Impact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.FRIPP.impl.ActivityImpactImpl#getParagon <em>Paragon</em>}</li>
 *   <li>{@link dsm.FRIPP.impl.ActivityImpactImpl#getNewValue <em>New Value</em>}</li>
 *   <li>{@link dsm.FRIPP.impl.ActivityImpactImpl#getOriginalType <em>Original Type</em>}</li>
 *   <li>{@link dsm.FRIPP.impl.ActivityImpactImpl#getOriginalProbability <em>Original Probability</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityImpactImpl extends MinimalEObjectImpl.Container implements ActivityImpact {
	/**
	 * The cached value of the '{@link #getParagon() <em>Paragon</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParagon()
	 * @generated
	 * @ordered
	 */
	protected Paragon paragon;

	/**
	 * The default value of the '{@link #getNewValue() <em>New Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewValue()
	 * @generated
	 * @ordered
	 */
	protected static final double NEW_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getNewValue() <em>New Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewValue()
	 * @generated
	 * @ordered
	 */
	protected double newValue = NEW_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOriginalType() <em>Original Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalType()
	 * @generated
	 * @ordered
	 */
	protected static final PARAGON_COMPOSITION_ENUM ORIGINAL_TYPE_EDEFAULT = PARAGON_COMPOSITION_ENUM.AND;

	/**
	 * The cached value of the '{@link #getOriginalType() <em>Original Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalType()
	 * @generated
	 * @ordered
	 */
	protected PARAGON_COMPOSITION_ENUM originalType = ORIGINAL_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOriginalProbability() <em>Original Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalProbability()
	 * @generated
	 * @ordered
	 */
	protected static final double ORIGINAL_PROBABILITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOriginalProbability() <em>Original Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalProbability()
	 * @generated
	 * @ordered
	 */
	protected double originalProbability = ORIGINAL_PROBABILITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityImpactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FRIPPPackage.Literals.ACTIVITY_IMPACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Paragon getParagon() {
		if (paragon != null && paragon.eIsProxy()) {
			InternalEObject oldParagon = (InternalEObject) paragon;
			paragon = (Paragon) eResolveProxy(oldParagon);
			if (paragon != oldParagon) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FRIPPPackage.ACTIVITY_IMPACT__PARAGON,
							oldParagon, paragon));
			}
		}
		return paragon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paragon basicGetParagon() {
		return paragon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParagon(Paragon newParagon) {
		Paragon oldParagon = paragon;
		paragon = newParagon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FRIPPPackage.ACTIVITY_IMPACT__PARAGON, oldParagon,
					paragon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getNewValue() {
		return newValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNewValue(double newNewValue) {
		double oldNewValue = newValue;
		newValue = newNewValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FRIPPPackage.ACTIVITY_IMPACT__NEW_VALUE, oldNewValue,
					newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PARAGON_COMPOSITION_ENUM getOriginalType() {
		return originalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginalType(PARAGON_COMPOSITION_ENUM newOriginalType) {
		PARAGON_COMPOSITION_ENUM oldOriginalType = originalType;
		originalType = newOriginalType == null ? ORIGINAL_TYPE_EDEFAULT : newOriginalType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FRIPPPackage.ACTIVITY_IMPACT__ORIGINAL_TYPE,
					oldOriginalType, originalType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getOriginalProbability() {
		return originalProbability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginalProbability(double newOriginalProbability) {
		double oldOriginalProbability = originalProbability;
		originalProbability = newOriginalProbability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FRIPPPackage.ACTIVITY_IMPACT__ORIGINAL_PROBABILITY,
					oldOriginalProbability, originalProbability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FRIPPPackage.ACTIVITY_IMPACT__PARAGON:
			if (resolve)
				return getParagon();
			return basicGetParagon();
		case FRIPPPackage.ACTIVITY_IMPACT__NEW_VALUE:
			return getNewValue();
		case FRIPPPackage.ACTIVITY_IMPACT__ORIGINAL_TYPE:
			return getOriginalType();
		case FRIPPPackage.ACTIVITY_IMPACT__ORIGINAL_PROBABILITY:
			return getOriginalProbability();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case FRIPPPackage.ACTIVITY_IMPACT__PARAGON:
			setParagon((Paragon) newValue);
			return;
		case FRIPPPackage.ACTIVITY_IMPACT__NEW_VALUE:
			setNewValue((Double) newValue);
			return;
		case FRIPPPackage.ACTIVITY_IMPACT__ORIGINAL_TYPE:
			setOriginalType((PARAGON_COMPOSITION_ENUM) newValue);
			return;
		case FRIPPPackage.ACTIVITY_IMPACT__ORIGINAL_PROBABILITY:
			setOriginalProbability((Double) newValue);
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
		case FRIPPPackage.ACTIVITY_IMPACT__PARAGON:
			setParagon((Paragon) null);
			return;
		case FRIPPPackage.ACTIVITY_IMPACT__NEW_VALUE:
			setNewValue(NEW_VALUE_EDEFAULT);
			return;
		case FRIPPPackage.ACTIVITY_IMPACT__ORIGINAL_TYPE:
			setOriginalType(ORIGINAL_TYPE_EDEFAULT);
			return;
		case FRIPPPackage.ACTIVITY_IMPACT__ORIGINAL_PROBABILITY:
			setOriginalProbability(ORIGINAL_PROBABILITY_EDEFAULT);
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
		case FRIPPPackage.ACTIVITY_IMPACT__PARAGON:
			return paragon != null;
		case FRIPPPackage.ACTIVITY_IMPACT__NEW_VALUE:
			return newValue != NEW_VALUE_EDEFAULT;
		case FRIPPPackage.ACTIVITY_IMPACT__ORIGINAL_TYPE:
			return originalType != ORIGINAL_TYPE_EDEFAULT;
		case FRIPPPackage.ACTIVITY_IMPACT__ORIGINAL_PROBABILITY:
			return originalProbability != ORIGINAL_PROBABILITY_EDEFAULT;
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
		result.append(" (newValue: ");
		result.append(newValue);
		result.append(", originalType: ");
		result.append(originalType);
		result.append(", originalProbability: ");
		result.append(originalProbability);
		result.append(')');
		return result.toString();
	}

} //ActivityImpactImpl
