/**
 */
package symbiosisDM.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import symbiosisDM.SecurityMeasurementGoal;
import symbiosisDM.SymbiosisDMPackage;

/**
 * This is the item provider adapter for a {@link symbiosisDM.SecurityMeasurementGoal} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SecurityMeasurementGoalItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityMeasurementGoalItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addObjectPropertyDescriptor(object);
			addViewpointPropertyDescriptor(object);
			addContextPropertyDescriptor(object);
			addScopePropertyDescriptor(object);
			addPurposePropertyDescriptor(object);
			addFocusPropertyDescriptor(object);
			addCriteriaPropertyDescriptor(object);
			addBusinessobjectivePropertyDescriptor(object);
			addParagonPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Viewpoint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addViewpointPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_SecurityMeasurementGoal_viewpoint_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_SecurityMeasurementGoal_viewpoint_feature",
								"_UI_SecurityMeasurementGoal_type"),
						SymbiosisDMPackage.Literals.SECURITY_MEASUREMENT_GOAL__VIEWPOINT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Context feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContextPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_SecurityMeasurementGoal_context_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_SecurityMeasurementGoal_context_feature",
								"_UI_SecurityMeasurementGoal_type"),
						SymbiosisDMPackage.Literals.SECURITY_MEASUREMENT_GOAL__CONTEXT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Scope feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScopePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_SecurityMeasurementGoal_scope_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_SecurityMeasurementGoal_scope_feature",
								"_UI_SecurityMeasurementGoal_type"),
						SymbiosisDMPackage.Literals.SECURITY_MEASUREMENT_GOAL__SCOPE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Object feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addObjectPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_SecurityMeasurementGoal_object_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_SecurityMeasurementGoal_object_feature",
								"_UI_SecurityMeasurementGoal_type"),
						SymbiosisDMPackage.Literals.SECURITY_MEASUREMENT_GOAL__OBJECT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Purpose feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPurposePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_SecurityMeasurementGoal_purpose_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_SecurityMeasurementGoal_purpose_feature",
								"_UI_SecurityMeasurementGoal_type"),
						SymbiosisDMPackage.Literals.SECURITY_MEASUREMENT_GOAL__PURPOSE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Focus feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFocusPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_SecurityMeasurementGoal_focus_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_SecurityMeasurementGoal_focus_feature",
								"_UI_SecurityMeasurementGoal_type"),
						SymbiosisDMPackage.Literals.SECURITY_MEASUREMENT_GOAL__FOCUS, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Criteria feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCriteriaPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_SecurityMeasurementGoal_criteria_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_SecurityMeasurementGoal_criteria_feature",
								"_UI_SecurityMeasurementGoal_type"),
						SymbiosisDMPackage.Literals.SECURITY_MEASUREMENT_GOAL__CRITERIA, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Businessobjective feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBusinessobjectivePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_SecurityMeasurementGoal_businessobjective_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_SecurityMeasurementGoal_businessobjective_feature",
						"_UI_SecurityMeasurementGoal_type"),
				SymbiosisDMPackage.Literals.SECURITY_MEASUREMENT_GOAL__BUSINESSOBJECTIVE, true, false, true, null, null,
				null));
	}

	/**
	 * This adds a property descriptor for the Paragon feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParagonPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_SecurityMeasurementGoal_paragon_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_SecurityMeasurementGoal_paragon_feature",
						"_UI_SecurityMeasurementGoal_type"),
				SymbiosisDMPackage.Literals.SECURITY_MEASUREMENT_GOAL__PARAGON, true, false, true, null, null, null));
	}

	/**
	 * This returns SecurityMeasurementGoal.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SecurityMeasurementGoal"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SecurityMeasurementGoal) object).getObject();
		return label == null || label.length() == 0 ? getString("_UI_SecurityMeasurementGoal_type")
				: getString("_UI_SecurityMeasurementGoal_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(SecurityMeasurementGoal.class)) {
		case SymbiosisDMPackage.SECURITY_MEASUREMENT_GOAL__OBJECT:
		case SymbiosisDMPackage.SECURITY_MEASUREMENT_GOAL__VIEWPOINT:
		case SymbiosisDMPackage.SECURITY_MEASUREMENT_GOAL__CONTEXT:
		case SymbiosisDMPackage.SECURITY_MEASUREMENT_GOAL__SCOPE:
		case SymbiosisDMPackage.SECURITY_MEASUREMENT_GOAL__PURPOSE:
		case SymbiosisDMPackage.SECURITY_MEASUREMENT_GOAL__FOCUS:
		case SymbiosisDMPackage.SECURITY_MEASUREMENT_GOAL__CRITERIA:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SymbiosisDMEditPlugin.INSTANCE;
	}

}
