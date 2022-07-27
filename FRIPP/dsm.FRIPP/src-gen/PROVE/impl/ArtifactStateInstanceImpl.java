/**
 */
package PROVE.impl;

import PROVE.ArtifactStateInstance;
import PROVE.PROVEPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact State Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PROVE.impl.ArtifactStateInstanceImpl#getUsedByActivity <em>Used By Activity</em>}</li>
 *   <li>{@link PROVE.impl.ArtifactStateInstanceImpl#getOriginatingActivity <em>Originating Activity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArtifactStateInstanceImpl extends MinimalEObjectImpl.Container implements ArtifactStateInstance {
	/**
	 * The cached value of the '{@link #getUsedByActivity() <em>Used By Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedByActivity()
	 * @generated
	 * @ordered
	 */
	protected PROVE.Process usedByActivity;

	/**
	 * The cached value of the '{@link #getOriginatingActivity() <em>Originating Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginatingActivity()
	 * @generated
	 * @ordered
	 */
	protected PROVE.Process originatingActivity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactStateInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PROVEPackage.Literals.ARTIFACT_STATE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PROVE.Process getUsedByActivity() {
		if (usedByActivity != null && usedByActivity.eIsProxy()) {
			InternalEObject oldUsedByActivity = (InternalEObject) usedByActivity;
			usedByActivity = (PROVE.Process) eResolveProxy(oldUsedByActivity);
			if (usedByActivity != oldUsedByActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							PROVEPackage.ARTIFACT_STATE_INSTANCE__USED_BY_ACTIVITY, oldUsedByActivity, usedByActivity));
			}
		}
		return usedByActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROVE.Process basicGetUsedByActivity() {
		return usedByActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsedByActivity(PROVE.Process newUsedByActivity, NotificationChain msgs) {
		PROVE.Process oldUsedByActivity = usedByActivity;
		usedByActivity = newUsedByActivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PROVEPackage.ARTIFACT_STATE_INSTANCE__USED_BY_ACTIVITY, oldUsedByActivity, newUsedByActivity);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsedByActivity(PROVE.Process newUsedByActivity) {
		if (newUsedByActivity != usedByActivity) {
			NotificationChain msgs = null;
			if (usedByActivity != null)
				msgs = ((InternalEObject) usedByActivity).eInverseRemove(this,
						PROVEPackage.PROCESS__ARTIFACT_IN_STATE_USED, PROVE.Process.class, msgs);
			if (newUsedByActivity != null)
				msgs = ((InternalEObject) newUsedByActivity).eInverseAdd(this,
						PROVEPackage.PROCESS__ARTIFACT_IN_STATE_USED, PROVE.Process.class, msgs);
			msgs = basicSetUsedByActivity(newUsedByActivity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PROVEPackage.ARTIFACT_STATE_INSTANCE__USED_BY_ACTIVITY, newUsedByActivity, newUsedByActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PROVE.Process getOriginatingActivity() {
		if (originatingActivity != null && originatingActivity.eIsProxy()) {
			InternalEObject oldOriginatingActivity = (InternalEObject) originatingActivity;
			originatingActivity = (PROVE.Process) eResolveProxy(oldOriginatingActivity);
			if (originatingActivity != oldOriginatingActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							PROVEPackage.ARTIFACT_STATE_INSTANCE__ORIGINATING_ACTIVITY, oldOriginatingActivity,
							originatingActivity));
			}
		}
		return originatingActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROVE.Process basicGetOriginatingActivity() {
		return originatingActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOriginatingActivity(PROVE.Process newOriginatingActivity, NotificationChain msgs) {
		PROVE.Process oldOriginatingActivity = originatingActivity;
		originatingActivity = newOriginatingActivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PROVEPackage.ARTIFACT_STATE_INSTANCE__ORIGINATING_ACTIVITY, oldOriginatingActivity,
					newOriginatingActivity);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginatingActivity(PROVE.Process newOriginatingActivity) {
		if (newOriginatingActivity != originatingActivity) {
			NotificationChain msgs = null;
			if (originatingActivity != null)
				msgs = ((InternalEObject) originatingActivity).eInverseRemove(this,
						PROVEPackage.PROCESS__RESULT_ARTIFACT_IN_STATE, PROVE.Process.class, msgs);
			if (newOriginatingActivity != null)
				msgs = ((InternalEObject) newOriginatingActivity).eInverseAdd(this,
						PROVEPackage.PROCESS__RESULT_ARTIFACT_IN_STATE, PROVE.Process.class, msgs);
			msgs = basicSetOriginatingActivity(newOriginatingActivity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PROVEPackage.ARTIFACT_STATE_INSTANCE__ORIGINATING_ACTIVITY, newOriginatingActivity,
					newOriginatingActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PROVEPackage.ARTIFACT_STATE_INSTANCE__USED_BY_ACTIVITY:
			if (usedByActivity != null)
				msgs = ((InternalEObject) usedByActivity).eInverseRemove(this,
						PROVEPackage.PROCESS__ARTIFACT_IN_STATE_USED, PROVE.Process.class, msgs);
			return basicSetUsedByActivity((PROVE.Process) otherEnd, msgs);
		case PROVEPackage.ARTIFACT_STATE_INSTANCE__ORIGINATING_ACTIVITY:
			if (originatingActivity != null)
				msgs = ((InternalEObject) originatingActivity).eInverseRemove(this,
						PROVEPackage.PROCESS__RESULT_ARTIFACT_IN_STATE, PROVE.Process.class, msgs);
			return basicSetOriginatingActivity((PROVE.Process) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PROVEPackage.ARTIFACT_STATE_INSTANCE__USED_BY_ACTIVITY:
			return basicSetUsedByActivity(null, msgs);
		case PROVEPackage.ARTIFACT_STATE_INSTANCE__ORIGINATING_ACTIVITY:
			return basicSetOriginatingActivity(null, msgs);
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
		case PROVEPackage.ARTIFACT_STATE_INSTANCE__USED_BY_ACTIVITY:
			if (resolve)
				return getUsedByActivity();
			return basicGetUsedByActivity();
		case PROVEPackage.ARTIFACT_STATE_INSTANCE__ORIGINATING_ACTIVITY:
			if (resolve)
				return getOriginatingActivity();
			return basicGetOriginatingActivity();
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
		case PROVEPackage.ARTIFACT_STATE_INSTANCE__USED_BY_ACTIVITY:
			setUsedByActivity((PROVE.Process) newValue);
			return;
		case PROVEPackage.ARTIFACT_STATE_INSTANCE__ORIGINATING_ACTIVITY:
			setOriginatingActivity((PROVE.Process) newValue);
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
		case PROVEPackage.ARTIFACT_STATE_INSTANCE__USED_BY_ACTIVITY:
			setUsedByActivity((PROVE.Process) null);
			return;
		case PROVEPackage.ARTIFACT_STATE_INSTANCE__ORIGINATING_ACTIVITY:
			setOriginatingActivity((PROVE.Process) null);
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
		case PROVEPackage.ARTIFACT_STATE_INSTANCE__USED_BY_ACTIVITY:
			return usedByActivity != null;
		case PROVEPackage.ARTIFACT_STATE_INSTANCE__ORIGINATING_ACTIVITY:
			return originatingActivity != null;
		}
		return super.eIsSet(featureID);
	}

} //ArtifactStateInstanceImpl
