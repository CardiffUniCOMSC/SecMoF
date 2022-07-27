/**
 */
package PROVE.impl;

import PROVE.ArtifactState;
import PROVE.ArtifactStateInstance;
import PROVE.PROVEPackage;

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
 * An implementation of the model object '<em><b>Artifact State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PROVE.impl.ArtifactStateImpl#isAchievedStatus <em>Achieved Status</em>}</li>
 *   <li>{@link PROVE.impl.ArtifactStateImpl#getArtifactName <em>Artifact Name</em>}</li>
 *   <li>{@link PROVE.impl.ArtifactStateImpl#getArtifactstateinstance <em>Artifactstateinstance</em>}</li>
 *   <li>{@link PROVE.impl.ArtifactStateImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArtifactStateImpl extends MinimalEObjectImpl.Container implements ArtifactState {
	/**
	 * The default value of the '{@link #isAchievedStatus() <em>Achieved Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAchievedStatus()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACHIEVED_STATUS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAchievedStatus() <em>Achieved Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAchievedStatus()
	 * @generated
	 * @ordered
	 */
	protected boolean achievedStatus = ACHIEVED_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getArtifactName() <em>Artifact Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactName()
	 * @generated
	 * @ordered
	 */
	protected static final String ARTIFACT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArtifactName() <em>Artifact Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactName()
	 * @generated
	 * @ordered
	 */
	protected String artifactName = ARTIFACT_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArtifactstateinstance() <em>Artifactstateinstance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactstateinstance()
	 * @generated
	 * @ordered
	 */
	protected EList<ArtifactStateInstance> artifactstateinstance;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PROVEPackage.Literals.ARTIFACT_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAchievedStatus() {
		return achievedStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAchievedStatus(boolean newAchievedStatus) {
		boolean oldAchievedStatus = achievedStatus;
		achievedStatus = newAchievedStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PROVEPackage.ARTIFACT_STATE__ACHIEVED_STATUS,
					oldAchievedStatus, achievedStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getArtifactName() {
		return artifactName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArtifactName(String newArtifactName) {
		String oldArtifactName = artifactName;
		artifactName = newArtifactName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PROVEPackage.ARTIFACT_STATE__ARTIFACT_NAME,
					oldArtifactName, artifactName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArtifactStateInstance> getArtifactstateinstance() {
		if (artifactstateinstance == null) {
			artifactstateinstance = new EObjectContainmentEList<ArtifactStateInstance>(ArtifactStateInstance.class,
					this, PROVEPackage.ARTIFACT_STATE__ARTIFACTSTATEINSTANCE);
		}
		return artifactstateinstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PROVEPackage.ARTIFACT_STATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PROVEPackage.ARTIFACT_STATE__ARTIFACTSTATEINSTANCE:
			return ((InternalEList<?>) getArtifactstateinstance()).basicRemove(otherEnd, msgs);
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
		case PROVEPackage.ARTIFACT_STATE__ACHIEVED_STATUS:
			return isAchievedStatus();
		case PROVEPackage.ARTIFACT_STATE__ARTIFACT_NAME:
			return getArtifactName();
		case PROVEPackage.ARTIFACT_STATE__ARTIFACTSTATEINSTANCE:
			return getArtifactstateinstance();
		case PROVEPackage.ARTIFACT_STATE__NAME:
			return getName();
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
		case PROVEPackage.ARTIFACT_STATE__ACHIEVED_STATUS:
			setAchievedStatus((Boolean) newValue);
			return;
		case PROVEPackage.ARTIFACT_STATE__ARTIFACT_NAME:
			setArtifactName((String) newValue);
			return;
		case PROVEPackage.ARTIFACT_STATE__ARTIFACTSTATEINSTANCE:
			getArtifactstateinstance().clear();
			getArtifactstateinstance().addAll((Collection<? extends ArtifactStateInstance>) newValue);
			return;
		case PROVEPackage.ARTIFACT_STATE__NAME:
			setName((String) newValue);
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
		case PROVEPackage.ARTIFACT_STATE__ACHIEVED_STATUS:
			setAchievedStatus(ACHIEVED_STATUS_EDEFAULT);
			return;
		case PROVEPackage.ARTIFACT_STATE__ARTIFACT_NAME:
			setArtifactName(ARTIFACT_NAME_EDEFAULT);
			return;
		case PROVEPackage.ARTIFACT_STATE__ARTIFACTSTATEINSTANCE:
			getArtifactstateinstance().clear();
			return;
		case PROVEPackage.ARTIFACT_STATE__NAME:
			setName(NAME_EDEFAULT);
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
		case PROVEPackage.ARTIFACT_STATE__ACHIEVED_STATUS:
			return achievedStatus != ACHIEVED_STATUS_EDEFAULT;
		case PROVEPackage.ARTIFACT_STATE__ARTIFACT_NAME:
			return ARTIFACT_NAME_EDEFAULT == null ? artifactName != null : !ARTIFACT_NAME_EDEFAULT.equals(artifactName);
		case PROVEPackage.ARTIFACT_STATE__ARTIFACTSTATEINSTANCE:
			return artifactstateinstance != null && !artifactstateinstance.isEmpty();
		case PROVEPackage.ARTIFACT_STATE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (achievedStatus: ");
		result.append(achievedStatus);
		result.append(", artifactName: ");
		result.append(artifactName);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ArtifactStateImpl
