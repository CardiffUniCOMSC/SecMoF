/**
 */
package dsm.FRIPP.impl;

import dsm.FRIPP.FRIPPPackage;
import dsm.FRIPP.Organisation;
import dsm.FRIPP.PlaybookProcess;
import dsm.FRIPP.Role;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Organisation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.FRIPP.impl.OrganisationImpl#getPlaybookprocess <em>Playbookprocess</em>}</li>
 *   <li>{@link dsm.FRIPP.impl.OrganisationImpl#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrganisationImpl extends MinimalEObjectImpl.Container implements Organisation {
	/**
	 * The cached value of the '{@link #getPlaybookprocess() <em>Playbookprocess</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaybookprocess()
	 * @generated
	 * @ordered
	 */
	protected EList<PlaybookProcess> playbookprocess;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> role;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganisationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FRIPPPackage.Literals.ORGANISATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PlaybookProcess> getPlaybookprocess() {
		if (playbookprocess == null) {
			playbookprocess = new EObjectContainmentEList<PlaybookProcess>(PlaybookProcess.class, this,
					FRIPPPackage.ORGANISATION__PLAYBOOKPROCESS);
		}
		return playbookprocess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Role> getRole() {
		if (role == null) {
			role = new EObjectContainmentEList<Role>(Role.class, this, FRIPPPackage.ORGANISATION__ROLE);
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FRIPPPackage.ORGANISATION__PLAYBOOKPROCESS:
			return ((InternalEList<?>) getPlaybookprocess()).basicRemove(otherEnd, msgs);
		case FRIPPPackage.ORGANISATION__ROLE:
			return ((InternalEList<?>) getRole()).basicRemove(otherEnd, msgs);
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
		case FRIPPPackage.ORGANISATION__PLAYBOOKPROCESS:
			return getPlaybookprocess();
		case FRIPPPackage.ORGANISATION__ROLE:
			return getRole();
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
		case FRIPPPackage.ORGANISATION__PLAYBOOKPROCESS:
			getPlaybookprocess().clear();
			getPlaybookprocess().addAll((Collection<? extends PlaybookProcess>) newValue);
			return;
		case FRIPPPackage.ORGANISATION__ROLE:
			getRole().clear();
			getRole().addAll((Collection<? extends Role>) newValue);
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
		case FRIPPPackage.ORGANISATION__PLAYBOOKPROCESS:
			getPlaybookprocess().clear();
			return;
		case FRIPPPackage.ORGANISATION__ROLE:
			getRole().clear();
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
		case FRIPPPackage.ORGANISATION__PLAYBOOKPROCESS:
			return playbookprocess != null && !playbookprocess.isEmpty();
		case FRIPPPackage.ORGANISATION__ROLE:
			return role != null && !role.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OrganisationImpl
