/**
 */
package symbiosisDM.impl;

import dependencyModel.Paragon;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import symbiosisDM.BusinessObjective;
import symbiosisDM.SymbiosisDMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Objective</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link symbiosisDM.impl.BusinessObjectiveImpl#getObject <em>Object</em>}</li>
 *   <li>{@link symbiosisDM.impl.BusinessObjectiveImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link symbiosisDM.impl.BusinessObjectiveImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link symbiosisDM.impl.BusinessObjectiveImpl#getViewpoint <em>Viewpoint</em>}</li>
 *   <li>{@link symbiosisDM.impl.BusinessObjectiveImpl#getContext <em>Context</em>}</li>
 *   <li>{@link symbiosisDM.impl.BusinessObjectiveImpl#getRelatedBusinessobjective <em>Related Businessobjective</em>}</li>
 *   <li>{@link symbiosisDM.impl.BusinessObjectiveImpl#getParagon <em>Paragon</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusinessObjectiveImpl extends MinimalEObjectImpl.Container implements BusinessObjective {
	/**
	 * The default value of the '{@link #getObject() <em>Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected String object = OBJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected static final String SCOPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected String scope = SCOPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected static final String PURPOSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected String purpose = PURPOSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getViewpoint() <em>Viewpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewpoint()
	 * @generated
	 * @ordered
	 */
	protected static final String VIEWPOINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getViewpoint() <em>Viewpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewpoint()
	 * @generated
	 * @ordered
	 */
	protected String viewpoint = VIEWPOINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected String context = CONTEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRelatedBusinessobjective() <em>Related Businessobjective</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedBusinessobjective()
	 * @generated
	 * @ordered
	 */
	protected EList<BusinessObjective> relatedBusinessobjective;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessObjectiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymbiosisDMPackage.Literals.BUSINESS_OBJECTIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObject() {
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObject(String newObject) {
		String oldObject = object;
		object = newObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymbiosisDMPackage.BUSINESS_OBJECTIVE__OBJECT,
					oldObject, object));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope(String newScope) {
		String oldScope = scope;
		scope = newScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymbiosisDMPackage.BUSINESS_OBJECTIVE__SCOPE,
					oldScope, scope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPurpose() {
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPurpose(String newPurpose) {
		String oldPurpose = purpose;
		purpose = newPurpose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymbiosisDMPackage.BUSINESS_OBJECTIVE__PURPOSE,
					oldPurpose, purpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getViewpoint() {
		return viewpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewpoint(String newViewpoint) {
		String oldViewpoint = viewpoint;
		viewpoint = newViewpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymbiosisDMPackage.BUSINESS_OBJECTIVE__VIEWPOINT,
					oldViewpoint, viewpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(String newContext) {
		String oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymbiosisDMPackage.BUSINESS_OBJECTIVE__CONTEXT,
					oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BusinessObjective> getRelatedBusinessobjective() {
		if (relatedBusinessobjective == null) {
			relatedBusinessobjective = new EObjectResolvingEList<BusinessObjective>(BusinessObjective.class, this,
					SymbiosisDMPackage.BUSINESS_OBJECTIVE__RELATED_BUSINESSOBJECTIVE);
		}
		return relatedBusinessobjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paragon getParagon() {
		if (paragon != null && paragon.eIsProxy()) {
			InternalEObject oldParagon = (InternalEObject) paragon;
			paragon = (Paragon) eResolveProxy(oldParagon);
			if (paragon != oldParagon) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SymbiosisDMPackage.BUSINESS_OBJECTIVE__PARAGON, oldParagon, paragon));
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
	public void setParagon(Paragon newParagon) {
		Paragon oldParagon = paragon;
		paragon = newParagon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymbiosisDMPackage.BUSINESS_OBJECTIVE__PARAGON,
					oldParagon, paragon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SymbiosisDMPackage.BUSINESS_OBJECTIVE__OBJECT:
			return getObject();
		case SymbiosisDMPackage.BUSINESS_OBJECTIVE__SCOPE:
			return getScope();
		case SymbiosisDMPackage.BUSINESS_OBJECTIVE__PURPOSE:
			return getPurpose();
		case SymbiosisDMPackage.BUSINESS_OBJECTIVE__VIEWPOINT:
			return getViewpoint();
		case SymbiosisDMPackage.BUSINESS_OBJECTIVE__CONTEXT:
			return getContext();
		case SymbiosisDMPackage.BUSINESS_OBJECTIVE__RELATED_BUSINESSOBJECTIVE:
			return getRelatedBusinessobjective();
		case SymbiosisDMPackage.BUSINESS_OBJECTIVE__PARAGON:
			if (resolve)
				return getParagon();
			return basicGetParagon();
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
		case SymbiosisDMPackage.BUSINESS_OBJECTIVE__OBJECT:
			setObject((String) newValue);
			return;
		case SymbiosisDMPackage.BUSINESS_OBJECTIVE__SCOPE:
			setScope((String) newValue);
			return;
		case SymbiosisDMPackage.BUSINESS_OBJECTIVE__PURPOSE:
			setPurpose((String) newValue);
			return;
		case SymbiosisDMPackage.BUSINESS_OBJECTIVE__VIEWPOINT:
			setViewpoint((String) newValue);
			return;
		case SymbiosisDMPackage.BUSINESS_OBJECTIVE__CONTEXT:
			setContext((String) newValue);
			return;
		case SymbiosisDMPackage.BUSINESS_OBJECTIVE__RELATED_BUSINESSOBJECTIVE:
			getRelatedBusinessobjective().clear();
			getRelatedBusinessobjective().addAll((Collection<? extends BusinessObjective>) newValue);
			return;
		case SymbiosisDMPackage.BUSINESS_OBJECTIVE__PARAGON:
			setParagon((Paragon) newValue);
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
		case SymbiosisDMPackage.BUSINESS_OBJECTIVE__OBJECT:
			setObject(OBJECT_EDEFAULT);
			return;
		case SymbiosisDMPackage.BUSINESS_OBJECTIVE__SCOPE:
			setScope(SCOPE_EDEFAULT);
			return;
		case SymbiosisDMPackage.BUSINESS_OBJECTIVE__PURPOSE:
			setPurpose(PURPOSE_EDEFAULT);
			return;
		case SymbiosisDMPackage.BUSINESS_OBJECTIVE__VIEWPOINT:
			setViewpoint(VIEWPOINT_EDEFAULT);
			return;
		case SymbiosisDMPackage.BUSINESS_OBJECTIVE__CONTEXT:
			setContext(CONTEXT_EDEFAULT);
			return;
		case SymbiosisDMPackage.BUSINESS_OBJECTIVE__RELATED_BUSINESSOBJECTIVE:
			getRelatedBusinessobjective().clear();
			return;
		case SymbiosisDMPackage.BUSINESS_OBJECTIVE__PARAGON:
			setParagon((Paragon) null);
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
		case SymbiosisDMPackage.BUSINESS_OBJECTIVE__OBJECT:
			return OBJECT_EDEFAULT == null ? object != null : !OBJECT_EDEFAULT.equals(object);
		case SymbiosisDMPackage.BUSINESS_OBJECTIVE__SCOPE:
			return SCOPE_EDEFAULT == null ? scope != null : !SCOPE_EDEFAULT.equals(scope);
		case SymbiosisDMPackage.BUSINESS_OBJECTIVE__PURPOSE:
			return PURPOSE_EDEFAULT == null ? purpose != null : !PURPOSE_EDEFAULT.equals(purpose);
		case SymbiosisDMPackage.BUSINESS_OBJECTIVE__VIEWPOINT:
			return VIEWPOINT_EDEFAULT == null ? viewpoint != null : !VIEWPOINT_EDEFAULT.equals(viewpoint);
		case SymbiosisDMPackage.BUSINESS_OBJECTIVE__CONTEXT:
			return CONTEXT_EDEFAULT == null ? context != null : !CONTEXT_EDEFAULT.equals(context);
		case SymbiosisDMPackage.BUSINESS_OBJECTIVE__RELATED_BUSINESSOBJECTIVE:
			return relatedBusinessobjective != null && !relatedBusinessobjective.isEmpty();
		case SymbiosisDMPackage.BUSINESS_OBJECTIVE__PARAGON:
			return paragon != null;
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
		result.append(" (object: ");
		result.append(object);
		result.append(", scope: ");
		result.append(scope);
		result.append(", purpose: ");
		result.append(purpose);
		result.append(", viewpoint: ");
		result.append(viewpoint);
		result.append(", context: ");
		result.append(context);
		result.append(')');
		return result.toString();
	}

} //BusinessObjectiveImpl
