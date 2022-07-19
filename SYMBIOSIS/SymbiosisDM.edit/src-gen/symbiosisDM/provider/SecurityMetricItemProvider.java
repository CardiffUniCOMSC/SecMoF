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

import symbiosisDM.SecurityMetric;
import symbiosisDM.SymbiosisDMPackage;

/**
 * This is the item provider adapter for a {@link symbiosisDM.SecurityMetric} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SecurityMetricItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityMetricItemProvider(AdapterFactory adapterFactory) {
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

			addDescriptionPropertyDescriptor(object);
			addGoalPropertyDescriptor(object);
			addBasemeasurementPropertyDescriptor(object);
			addMethodPropertyDescriptor(object);
			addFunctionPropertyDescriptor(object);
			addInterpretationPropertyDescriptor(object);
			addReportingPropertyDescriptor(object);
			addSecuritymeasurementgoalPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_SecurityMetric_description_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_SecurityMetric_description_feature",
								"_UI_SecurityMetric_type"),
						SymbiosisDMPackage.Literals.SECURITY_METRIC__DESCRIPTION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Goal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGoalPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_SecurityMetric_goal_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_SecurityMetric_goal_feature",
								"_UI_SecurityMetric_type"),
						SymbiosisDMPackage.Literals.SECURITY_METRIC__GOAL, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Basemeasurement feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBasemeasurementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_SecurityMetric_basemeasurement_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_SecurityMetric_basemeasurement_feature",
						"_UI_SecurityMetric_type"),
				SymbiosisDMPackage.Literals.SECURITY_METRIC__BASEMEASUREMENT, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Method feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMethodPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_SecurityMetric_method_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_SecurityMetric_method_feature",
								"_UI_SecurityMetric_type"),
						SymbiosisDMPackage.Literals.SECURITY_METRIC__METHOD, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Function feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFunctionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_SecurityMetric_function_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_SecurityMetric_function_feature",
								"_UI_SecurityMetric_type"),
						SymbiosisDMPackage.Literals.SECURITY_METRIC__FUNCTION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Interpretation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInterpretationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_SecurityMetric_interpretation_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_SecurityMetric_interpretation_feature",
								"_UI_SecurityMetric_type"),
						SymbiosisDMPackage.Literals.SECURITY_METRIC__INTERPRETATION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Reporting feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReportingPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_SecurityMetric_reporting_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_SecurityMetric_reporting_feature",
								"_UI_SecurityMetric_type"),
						SymbiosisDMPackage.Literals.SECURITY_METRIC__REPORTING, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Securitymeasurementgoal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecuritymeasurementgoalPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_SecurityMetric_securitymeasurementgoal_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_SecurityMetric_securitymeasurementgoal_feature", "_UI_SecurityMetric_type"),
						SymbiosisDMPackage.Literals.SECURITY_METRIC__SECURITYMEASUREMENTGOAL, true, false, true, null,
						null, null));
	}

	/**
	 * This returns SecurityMetric.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SecurityMetric"));
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
		String label = ((SecurityMetric) object).getDescription();
		return label == null || label.length() == 0 ? getString("_UI_SecurityMetric_type")
				: getString("_UI_SecurityMetric_type") + " " + label;
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

		switch (notification.getFeatureID(SecurityMetric.class)) {
		case SymbiosisDMPackage.SECURITY_METRIC__DESCRIPTION:
		case SymbiosisDMPackage.SECURITY_METRIC__GOAL:
		case SymbiosisDMPackage.SECURITY_METRIC__METHOD:
		case SymbiosisDMPackage.SECURITY_METRIC__FUNCTION:
		case SymbiosisDMPackage.SECURITY_METRIC__INTERPRETATION:
		case SymbiosisDMPackage.SECURITY_METRIC__REPORTING:
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
