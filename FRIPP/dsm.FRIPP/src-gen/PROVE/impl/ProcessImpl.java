/**
 */
package PROVE.impl;

import PROVE.Artifact;
import PROVE.ArtifactStateInstance;
import PROVE.PROVEPackage;
import PROVE.Resource;
import PROVE.STATUS_ENUM;
import PROVE.ShadowNodeIncoming;
import PROVE.ShadowNodeOutgoing;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PROVE.impl.ProcessImpl#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link PROVE.impl.ProcessImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link PROVE.impl.ProcessImpl#getName <em>Name</em>}</li>
 *   <li>{@link PROVE.impl.ProcessImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link PROVE.impl.ProcessImpl#getArtifactInStateUsed <em>Artifact In State Used</em>}</li>
 *   <li>{@link PROVE.impl.ProcessImpl#getResultArtifactInState <em>Result Artifact In State</em>}</li>
 *   <li>{@link PROVE.impl.ProcessImpl#getShadownodeincoming <em>Shadownodeincoming</em>}</li>
 *   <li>{@link PROVE.impl.ProcessImpl#getShadownodeoutgoing <em>Shadownodeoutgoing</em>}</li>
 *   <li>{@link PROVE.impl.ProcessImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link PROVE.impl.ProcessImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link PROVE.impl.ProcessImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link PROVE.impl.ProcessImpl#getResourceUsed <em>Resource Used</em>}</li>
 *   <li>{@link PROVE.impl.ProcessImpl#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessImpl extends MinimalEObjectImpl.Container implements PROVE.Process {
	/**
	 * The cached value of the '{@link #getArtifact() <em>Artifact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifact()
	 * @generated
	 * @ordered
	 */
	protected EList<Artifact> artifact;

	/**
	 * The cached value of the '{@link #getProcess() <em>Process</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcess()
	 * @generated
	 * @ordered
	 */
	protected EList<PROVE.Process> process;

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
	 * The default value of the '{@link #getNotes() <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotes() <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected String notes = NOTES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArtifactInStateUsed() <em>Artifact In State Used</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactInStateUsed()
	 * @generated
	 * @ordered
	 */
	protected EList<ArtifactStateInstance> artifactInStateUsed;

	/**
	 * The cached value of the '{@link #getResultArtifactInState() <em>Result Artifact In State</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultArtifactInState()
	 * @generated
	 * @ordered
	 */
	protected EList<ArtifactStateInstance> resultArtifactInState;

	/**
	 * The cached value of the '{@link #getShadownodeincoming() <em>Shadownodeincoming</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShadownodeincoming()
	 * @generated
	 * @ordered
	 */
	protected ShadowNodeIncoming shadownodeincoming;

	/**
	 * The cached value of the '{@link #getShadownodeoutgoing() <em>Shadownodeoutgoing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShadownodeoutgoing()
	 * @generated
	 * @ordered
	 */
	protected ShadowNodeOutgoing shadownodeoutgoing;

	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date startDate = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected Date endDate = END_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> resource;

	/**
	 * The cached value of the '{@link #getResourceUsed() <em>Resource Used</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceUsed()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> resourceUsed;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final STATUS_ENUM STATUS_EDEFAULT = STATUS_ENUM.UNSPECIFIED;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected STATUS_ENUM status = STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PROVEPackage.Literals.PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Artifact> getArtifact() {
		if (artifact == null) {
			artifact = new EObjectContainmentEList<Artifact>(Artifact.class, this, PROVEPackage.PROCESS__ARTIFACT);
		}
		return artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PROVE.Process> getProcess() {
		if (process == null) {
			process = new EObjectContainmentEList<PROVE.Process>(PROVE.Process.class, this,
					PROVEPackage.PROCESS__PROCESS);
		}
		return process;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PROVEPackage.PROCESS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNotes() {
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNotes(String newNotes) {
		String oldNotes = notes;
		notes = newNotes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PROVEPackage.PROCESS__NOTES, oldNotes, notes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArtifactStateInstance> getArtifactInStateUsed() {
		if (artifactInStateUsed == null) {
			artifactInStateUsed = new EObjectWithInverseResolvingEList<ArtifactStateInstance>(
					ArtifactStateInstance.class, this, PROVEPackage.PROCESS__ARTIFACT_IN_STATE_USED,
					PROVEPackage.ARTIFACT_STATE_INSTANCE__USED_BY_ACTIVITY);
		}
		return artifactInStateUsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArtifactStateInstance> getResultArtifactInState() {
		if (resultArtifactInState == null) {
			resultArtifactInState = new EObjectWithInverseResolvingEList<ArtifactStateInstance>(
					ArtifactStateInstance.class, this, PROVEPackage.PROCESS__RESULT_ARTIFACT_IN_STATE,
					PROVEPackage.ARTIFACT_STATE_INSTANCE__ORIGINATING_ACTIVITY);
		}
		return resultArtifactInState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShadowNodeIncoming getShadownodeincoming() {
		return shadownodeincoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShadownodeincoming(ShadowNodeIncoming newShadownodeincoming,
			NotificationChain msgs) {
		ShadowNodeIncoming oldShadownodeincoming = shadownodeincoming;
		shadownodeincoming = newShadownodeincoming;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PROVEPackage.PROCESS__SHADOWNODEINCOMING, oldShadownodeincoming, newShadownodeincoming);
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
	public ShadowNodeOutgoing getShadownodeoutgoing() {
		return shadownodeoutgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShadownodeoutgoing(ShadowNodeOutgoing newShadownodeoutgoing,
			NotificationChain msgs) {
		ShadowNodeOutgoing oldShadownodeoutgoing = shadownodeoutgoing;
		shadownodeoutgoing = newShadownodeoutgoing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PROVEPackage.PROCESS__SHADOWNODEOUTGOING, oldShadownodeoutgoing, newShadownodeoutgoing);
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
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartDate(Date newStartDate) {
		Date oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PROVEPackage.PROCESS__START_DATE, oldStartDate,
					startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndDate(Date newEndDate) {
		Date oldEndDate = endDate;
		endDate = newEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PROVEPackage.PROCESS__END_DATE, oldEndDate, endDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Resource> getResource() {
		if (resource == null) {
			resource = new EObjectContainmentEList<Resource>(Resource.class, this, PROVEPackage.PROCESS__RESOURCE);
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Resource> getResourceUsed() {
		if (resourceUsed == null) {
			resourceUsed = new EObjectResolvingEList<Resource>(Resource.class, this,
					PROVEPackage.PROCESS__RESOURCE_USED);
		}
		return resourceUsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public STATUS_ENUM getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(STATUS_ENUM newStatus) {
		STATUS_ENUM oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PROVEPackage.PROCESS__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PROVEPackage.PROCESS__ARTIFACT_IN_STATE_USED:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getArtifactInStateUsed()).basicAdd(otherEnd,
					msgs);
		case PROVEPackage.PROCESS__RESULT_ARTIFACT_IN_STATE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getResultArtifactInState()).basicAdd(otherEnd,
					msgs);
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
		case PROVEPackage.PROCESS__ARTIFACT:
			return ((InternalEList<?>) getArtifact()).basicRemove(otherEnd, msgs);
		case PROVEPackage.PROCESS__PROCESS:
			return ((InternalEList<?>) getProcess()).basicRemove(otherEnd, msgs);
		case PROVEPackage.PROCESS__ARTIFACT_IN_STATE_USED:
			return ((InternalEList<?>) getArtifactInStateUsed()).basicRemove(otherEnd, msgs);
		case PROVEPackage.PROCESS__RESULT_ARTIFACT_IN_STATE:
			return ((InternalEList<?>) getResultArtifactInState()).basicRemove(otherEnd, msgs);
		case PROVEPackage.PROCESS__SHADOWNODEINCOMING:
			return basicSetShadownodeincoming(null, msgs);
		case PROVEPackage.PROCESS__SHADOWNODEOUTGOING:
			return basicSetShadownodeoutgoing(null, msgs);
		case PROVEPackage.PROCESS__RESOURCE:
			return ((InternalEList<?>) getResource()).basicRemove(otherEnd, msgs);
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
		case PROVEPackage.PROCESS__ARTIFACT:
			return getArtifact();
		case PROVEPackage.PROCESS__PROCESS:
			return getProcess();
		case PROVEPackage.PROCESS__NAME:
			return getName();
		case PROVEPackage.PROCESS__NOTES:
			return getNotes();
		case PROVEPackage.PROCESS__ARTIFACT_IN_STATE_USED:
			return getArtifactInStateUsed();
		case PROVEPackage.PROCESS__RESULT_ARTIFACT_IN_STATE:
			return getResultArtifactInState();
		case PROVEPackage.PROCESS__SHADOWNODEINCOMING:
			return getShadownodeincoming();
		case PROVEPackage.PROCESS__SHADOWNODEOUTGOING:
			return getShadownodeoutgoing();
		case PROVEPackage.PROCESS__START_DATE:
			return getStartDate();
		case PROVEPackage.PROCESS__END_DATE:
			return getEndDate();
		case PROVEPackage.PROCESS__RESOURCE:
			return getResource();
		case PROVEPackage.PROCESS__RESOURCE_USED:
			return getResourceUsed();
		case PROVEPackage.PROCESS__STATUS:
			return getStatus();
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
		case PROVEPackage.PROCESS__ARTIFACT:
			getArtifact().clear();
			getArtifact().addAll((Collection<? extends Artifact>) newValue);
			return;
		case PROVEPackage.PROCESS__PROCESS:
			getProcess().clear();
			getProcess().addAll((Collection<? extends PROVE.Process>) newValue);
			return;
		case PROVEPackage.PROCESS__NAME:
			setName((String) newValue);
			return;
		case PROVEPackage.PROCESS__NOTES:
			setNotes((String) newValue);
			return;
		case PROVEPackage.PROCESS__ARTIFACT_IN_STATE_USED:
			getArtifactInStateUsed().clear();
			getArtifactInStateUsed().addAll((Collection<? extends ArtifactStateInstance>) newValue);
			return;
		case PROVEPackage.PROCESS__RESULT_ARTIFACT_IN_STATE:
			getResultArtifactInState().clear();
			getResultArtifactInState().addAll((Collection<? extends ArtifactStateInstance>) newValue);
			return;
		case PROVEPackage.PROCESS__START_DATE:
			setStartDate((Date) newValue);
			return;
		case PROVEPackage.PROCESS__END_DATE:
			setEndDate((Date) newValue);
			return;
		case PROVEPackage.PROCESS__RESOURCE:
			getResource().clear();
			getResource().addAll((Collection<? extends Resource>) newValue);
			return;
		case PROVEPackage.PROCESS__RESOURCE_USED:
			getResourceUsed().clear();
			getResourceUsed().addAll((Collection<? extends Resource>) newValue);
			return;
		case PROVEPackage.PROCESS__STATUS:
			setStatus((STATUS_ENUM) newValue);
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
		case PROVEPackage.PROCESS__ARTIFACT:
			getArtifact().clear();
			return;
		case PROVEPackage.PROCESS__PROCESS:
			getProcess().clear();
			return;
		case PROVEPackage.PROCESS__NAME:
			setName(NAME_EDEFAULT);
			return;
		case PROVEPackage.PROCESS__NOTES:
			setNotes(NOTES_EDEFAULT);
			return;
		case PROVEPackage.PROCESS__ARTIFACT_IN_STATE_USED:
			getArtifactInStateUsed().clear();
			return;
		case PROVEPackage.PROCESS__RESULT_ARTIFACT_IN_STATE:
			getResultArtifactInState().clear();
			return;
		case PROVEPackage.PROCESS__START_DATE:
			setStartDate(START_DATE_EDEFAULT);
			return;
		case PROVEPackage.PROCESS__END_DATE:
			setEndDate(END_DATE_EDEFAULT);
			return;
		case PROVEPackage.PROCESS__RESOURCE:
			getResource().clear();
			return;
		case PROVEPackage.PROCESS__RESOURCE_USED:
			getResourceUsed().clear();
			return;
		case PROVEPackage.PROCESS__STATUS:
			setStatus(STATUS_EDEFAULT);
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
		case PROVEPackage.PROCESS__ARTIFACT:
			return artifact != null && !artifact.isEmpty();
		case PROVEPackage.PROCESS__PROCESS:
			return process != null && !process.isEmpty();
		case PROVEPackage.PROCESS__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case PROVEPackage.PROCESS__NOTES:
			return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
		case PROVEPackage.PROCESS__ARTIFACT_IN_STATE_USED:
			return artifactInStateUsed != null && !artifactInStateUsed.isEmpty();
		case PROVEPackage.PROCESS__RESULT_ARTIFACT_IN_STATE:
			return resultArtifactInState != null && !resultArtifactInState.isEmpty();
		case PROVEPackage.PROCESS__SHADOWNODEINCOMING:
			return shadownodeincoming != null;
		case PROVEPackage.PROCESS__SHADOWNODEOUTGOING:
			return shadownodeoutgoing != null;
		case PROVEPackage.PROCESS__START_DATE:
			return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
		case PROVEPackage.PROCESS__END_DATE:
			return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
		case PROVEPackage.PROCESS__RESOURCE:
			return resource != null && !resource.isEmpty();
		case PROVEPackage.PROCESS__RESOURCE_USED:
			return resourceUsed != null && !resourceUsed.isEmpty();
		case PROVEPackage.PROCESS__STATUS:
			return status != STATUS_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", notes: ");
		result.append(notes);
		result.append(", startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //ProcessImpl
