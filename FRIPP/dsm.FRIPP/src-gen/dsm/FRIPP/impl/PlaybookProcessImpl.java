/**
 */
package dsm.FRIPP.impl;

import PROVE.impl.ProcessImpl;

import dependencyModel.Paragon;

import dsm.FRIPP.ACTION_TYPE_ENUM;
import dsm.FRIPP.ActivityImpact;
import dsm.FRIPP.ExternalReference;
import dsm.FRIPP.FRIPPPackage;
import dsm.FRIPP.OBJECTIVES_ENUM;
import dsm.FRIPP.PlaybookProcess;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Playbook Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.FRIPP.impl.PlaybookProcessImpl#getObjectives <em>Objectives</em>}</li>
 *   <li>{@link dsm.FRIPP.impl.PlaybookProcessImpl#getActionType <em>Action Type</em>}</li>
 *   <li>{@link dsm.FRIPP.impl.PlaybookProcessImpl#getRelatedreferences <em>Relatedreferences</em>}</li>
 *   <li>{@link dsm.FRIPP.impl.PlaybookProcessImpl#getExternalreferences <em>Externalreferences</em>}</li>
 *   <li>{@link dsm.FRIPP.impl.PlaybookProcessImpl#getParagon <em>Paragon</em>}</li>
 *   <li>{@link dsm.FRIPP.impl.PlaybookProcessImpl#getActivityimpact <em>Activityimpact</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlaybookProcessImpl extends ProcessImpl implements PlaybookProcess {
	/**
	 * The cached value of the '{@link #getObjectives() <em>Objectives</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectives()
	 * @generated
	 * @ordered
	 */
	protected EList<OBJECTIVES_ENUM> objectives;

	/**
	 * The default value of the '{@link #getActionType() <em>Action Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionType()
	 * @generated
	 * @ordered
	 */
	protected static final ACTION_TYPE_ENUM ACTION_TYPE_EDEFAULT = ACTION_TYPE_ENUM.MANUAL;

	/**
	 * The cached value of the '{@link #getActionType() <em>Action Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionType()
	 * @generated
	 * @ordered
	 */
	protected ACTION_TYPE_ENUM actionType = ACTION_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRelatedreferences() <em>Relatedreferences</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedreferences()
	 * @generated
	 * @ordered
	 */
	protected EList<ExternalReference> relatedreferences;

	/**
	 * The cached value of the '{@link #getExternalreferences() <em>Externalreferences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalreferences()
	 * @generated
	 * @ordered
	 */
	protected EList<ExternalReference> externalreferences;

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
	 * The cached value of the '{@link #getActivityimpact() <em>Activityimpact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityimpact()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityImpact> activityimpact;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaybookProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FRIPPPackage.Literals.PLAYBOOK_PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OBJECTIVES_ENUM> getObjectives() {
		if (objectives == null) {
			objectives = new EDataTypeUniqueEList<OBJECTIVES_ENUM>(OBJECTIVES_ENUM.class, this,
					FRIPPPackage.PLAYBOOK_PROCESS__OBJECTIVES);
		}
		return objectives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ACTION_TYPE_ENUM getActionType() {
		return actionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActionType(ACTION_TYPE_ENUM newActionType) {
		ACTION_TYPE_ENUM oldActionType = actionType;
		actionType = newActionType == null ? ACTION_TYPE_EDEFAULT : newActionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FRIPPPackage.PLAYBOOK_PROCESS__ACTION_TYPE,
					oldActionType, actionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExternalReference> getRelatedreferences() {
		if (relatedreferences == null) {
			relatedreferences = new EObjectResolvingEList<ExternalReference>(ExternalReference.class, this,
					FRIPPPackage.PLAYBOOK_PROCESS__RELATEDREFERENCES);
		}
		return relatedreferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExternalReference> getExternalreferences() {
		if (externalreferences == null) {
			externalreferences = new EObjectContainmentEList<ExternalReference>(ExternalReference.class, this,
					FRIPPPackage.PLAYBOOK_PROCESS__EXTERNALREFERENCES);
		}
		return externalreferences;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FRIPPPackage.PLAYBOOK_PROCESS__PARAGON,
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
			eNotify(new ENotificationImpl(this, Notification.SET, FRIPPPackage.PLAYBOOK_PROCESS__PARAGON, oldParagon,
					paragon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ActivityImpact> getActivityimpact() {
		if (activityimpact == null) {
			activityimpact = new EObjectContainmentEList<ActivityImpact>(ActivityImpact.class, this,
					FRIPPPackage.PLAYBOOK_PROCESS__ACTIVITYIMPACT);
		}
		return activityimpact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FRIPPPackage.PLAYBOOK_PROCESS__EXTERNALREFERENCES:
			return ((InternalEList<?>) getExternalreferences()).basicRemove(otherEnd, msgs);
		case FRIPPPackage.PLAYBOOK_PROCESS__ACTIVITYIMPACT:
			return ((InternalEList<?>) getActivityimpact()).basicRemove(otherEnd, msgs);
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
		case FRIPPPackage.PLAYBOOK_PROCESS__OBJECTIVES:
			return getObjectives();
		case FRIPPPackage.PLAYBOOK_PROCESS__ACTION_TYPE:
			return getActionType();
		case FRIPPPackage.PLAYBOOK_PROCESS__RELATEDREFERENCES:
			return getRelatedreferences();
		case FRIPPPackage.PLAYBOOK_PROCESS__EXTERNALREFERENCES:
			return getExternalreferences();
		case FRIPPPackage.PLAYBOOK_PROCESS__PARAGON:
			if (resolve)
				return getParagon();
			return basicGetParagon();
		case FRIPPPackage.PLAYBOOK_PROCESS__ACTIVITYIMPACT:
			return getActivityimpact();
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
		case FRIPPPackage.PLAYBOOK_PROCESS__OBJECTIVES:
			getObjectives().clear();
			getObjectives().addAll((Collection<? extends OBJECTIVES_ENUM>) newValue);
			return;
		case FRIPPPackage.PLAYBOOK_PROCESS__ACTION_TYPE:
			setActionType((ACTION_TYPE_ENUM) newValue);
			return;
		case FRIPPPackage.PLAYBOOK_PROCESS__RELATEDREFERENCES:
			getRelatedreferences().clear();
			getRelatedreferences().addAll((Collection<? extends ExternalReference>) newValue);
			return;
		case FRIPPPackage.PLAYBOOK_PROCESS__EXTERNALREFERENCES:
			getExternalreferences().clear();
			getExternalreferences().addAll((Collection<? extends ExternalReference>) newValue);
			return;
		case FRIPPPackage.PLAYBOOK_PROCESS__PARAGON:
			setParagon((Paragon) newValue);
			return;
		case FRIPPPackage.PLAYBOOK_PROCESS__ACTIVITYIMPACT:
			getActivityimpact().clear();
			getActivityimpact().addAll((Collection<? extends ActivityImpact>) newValue);
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
		case FRIPPPackage.PLAYBOOK_PROCESS__OBJECTIVES:
			getObjectives().clear();
			return;
		case FRIPPPackage.PLAYBOOK_PROCESS__ACTION_TYPE:
			setActionType(ACTION_TYPE_EDEFAULT);
			return;
		case FRIPPPackage.PLAYBOOK_PROCESS__RELATEDREFERENCES:
			getRelatedreferences().clear();
			return;
		case FRIPPPackage.PLAYBOOK_PROCESS__EXTERNALREFERENCES:
			getExternalreferences().clear();
			return;
		case FRIPPPackage.PLAYBOOK_PROCESS__PARAGON:
			setParagon((Paragon) null);
			return;
		case FRIPPPackage.PLAYBOOK_PROCESS__ACTIVITYIMPACT:
			getActivityimpact().clear();
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
		case FRIPPPackage.PLAYBOOK_PROCESS__OBJECTIVES:
			return objectives != null && !objectives.isEmpty();
		case FRIPPPackage.PLAYBOOK_PROCESS__ACTION_TYPE:
			return actionType != ACTION_TYPE_EDEFAULT;
		case FRIPPPackage.PLAYBOOK_PROCESS__RELATEDREFERENCES:
			return relatedreferences != null && !relatedreferences.isEmpty();
		case FRIPPPackage.PLAYBOOK_PROCESS__EXTERNALREFERENCES:
			return externalreferences != null && !externalreferences.isEmpty();
		case FRIPPPackage.PLAYBOOK_PROCESS__PARAGON:
			return paragon != null;
		case FRIPPPackage.PLAYBOOK_PROCESS__ACTIVITYIMPACT:
			return activityimpact != null && !activityimpact.isEmpty();
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
		result.append(" (objectives: ");
		result.append(objectives);
		result.append(", actionType: ");
		result.append(actionType);
		result.append(')');
		return result.toString();
	}

} //PlaybookProcessImpl
