/**
 */
package dependencyModel.impl;

import dependencyModel.DependencyModelPackage;
import dependencyModel.PARAGON_COMPOSITION_ENUM;
import dependencyModel.Paragon;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Paragon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dependencyModel.impl.ParagonImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link dependencyModel.impl.ParagonImpl#getProbability <em>Probability</em>}</li>
 *   <li>{@link dependencyModel.impl.ParagonImpl#getParagon <em>Paragon</em>}</li>
 *   <li>{@link dependencyModel.impl.ParagonImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParagonImpl extends MinimalEObjectImpl.Container implements Paragon {
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
	 * The default value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected static final double PROBABILITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected double probability = PROBABILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParagon() <em>Paragon</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParagon()
	 * @generated
	 * @ordered
	 */
	protected EList<Paragon> paragon;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final PARAGON_COMPOSITION_ENUM TYPE_EDEFAULT = PARAGON_COMPOSITION_ENUM.UNCONTROLLABLE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected PARAGON_COMPOSITION_ENUM type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParagonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DependencyModelPackage.Literals.PARAGON;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DependencyModelPackage.PARAGON__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getProbability() {
		return probability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProbability(double newProbability) {
		double oldProbability = probability;
		probability = newProbability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependencyModelPackage.PARAGON__PROBABILITY,
					oldProbability, probability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Paragon> getParagon() {
		if (paragon == null) {
			paragon = new EObjectContainmentEList<Paragon>(Paragon.class, this,
					DependencyModelPackage.PARAGON__PARAGON);
		}
		return paragon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PARAGON_COMPOSITION_ENUM getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(PARAGON_COMPOSITION_ENUM newType) {
		PARAGON_COMPOSITION_ENUM oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependencyModelPackage.PARAGON__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DependencyModelPackage.PARAGON__PARAGON:
			return ((InternalEList<?>) getParagon()).basicRemove(otherEnd, msgs);
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
		case DependencyModelPackage.PARAGON__DESCRIPTION:
			return getDescription();
		case DependencyModelPackage.PARAGON__PROBABILITY:
			return getProbability();
		case DependencyModelPackage.PARAGON__PARAGON:
			return getParagon();
		case DependencyModelPackage.PARAGON__TYPE:
			return getType();
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
		case DependencyModelPackage.PARAGON__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case DependencyModelPackage.PARAGON__PROBABILITY:
			setProbability((Double) newValue);
			return;
		case DependencyModelPackage.PARAGON__PARAGON:
			getParagon().clear();
			getParagon().addAll((Collection<? extends Paragon>) newValue);
			return;
		case DependencyModelPackage.PARAGON__TYPE:
			setType((PARAGON_COMPOSITION_ENUM) newValue);
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
		case DependencyModelPackage.PARAGON__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case DependencyModelPackage.PARAGON__PROBABILITY:
			setProbability(PROBABILITY_EDEFAULT);
			return;
		case DependencyModelPackage.PARAGON__PARAGON:
			getParagon().clear();
			return;
		case DependencyModelPackage.PARAGON__TYPE:
			setType(TYPE_EDEFAULT);
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
		case DependencyModelPackage.PARAGON__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case DependencyModelPackage.PARAGON__PROBABILITY:
			return probability != PROBABILITY_EDEFAULT;
		case DependencyModelPackage.PARAGON__PARAGON:
			return paragon != null && !paragon.isEmpty();
		case DependencyModelPackage.PARAGON__TYPE:
			return type != TYPE_EDEFAULT;
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
		result.append(", probability: ");
		result.append(probability);
		result.append(", Type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ParagonImpl
