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

import symbiosisDM.BusinessObjective;
import symbiosisDM.SymbiosisDMPackage;

/**
 * This is the item provider adapter for a {@link symbiosisDM.BusinessObjective} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BusinessObjectiveItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessObjectiveItemProvider(AdapterFactory adapterFactory) {
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
			addScopePropertyDescriptor(object);
			addPurposePropertyDescriptor(object);
			addViewpointPropertyDescriptor(object);
			addContextPropertyDescriptor(object);
			addRelatedBusinessobjectivePropertyDescriptor(object);
			addParagonPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
						getResourceLocator(), getString("_UI_BusinessObjective_object_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_BusinessObjective_object_feature",
								"_UI_BusinessObjective_type"),
						SymbiosisDMPackage.Literals.BUSINESS_OBJECTIVE__OBJECT, true, false, false,
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
						getResourceLocator(), getString("_UI_BusinessObjective_scope_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_BusinessObjective_scope_feature",
								"_UI_BusinessObjective_type"),
						SymbiosisDMPackage.Literals.BUSINESS_OBJECTIVE__SCOPE, true, false, false,
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
						getResourceLocator(), getString("_UI_BusinessObjective_purpose_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_BusinessObjective_purpose_feature",
								"_UI_BusinessObjective_type"),
						SymbiosisDMPackage.Literals.BUSINESS_OBJECTIVE__PURPOSE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Viewpoint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addViewpointPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_BusinessObjective_viewpoint_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_BusinessObjective_viewpoint_feature",
						"_UI_BusinessObjective_type"),
				SymbiosisDMPackage.Literals.BUSINESS_OBJECTIVE__VIEWPOINT, true, false, false,
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
						getResourceLocator(), getString("_UI_BusinessObjective_context_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_BusinessObjective_context_feature",
								"_UI_BusinessObjective_type"),
						SymbiosisDMPackage.Literals.BUSINESS_OBJECTIVE__CONTEXT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Related Businessobjective feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRelatedBusinessobjectivePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_BusinessObjective_relatedBusinessobjective_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_BusinessObjective_relatedBusinessobjective_feature", "_UI_BusinessObjective_type"),
						SymbiosisDMPackage.Literals.BUSINESS_OBJECTIVE__RELATED_BUSINESSOBJECTIVE, true, false, true,
						null, null, null));
	}

	/**
	 * This adds a property descriptor for the Paragon feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParagonPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_BusinessObjective_paragon_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_BusinessObjective_paragon_feature",
								"_UI_BusinessObjective_type"),
						SymbiosisDMPackage.Literals.BUSINESS_OBJECTIVE__PARAGON, true, false, true, null, null, null));
	}

	/**
	 * This returns BusinessObjective.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BusinessObjective"));
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
		String label = ((BusinessObjective) object).getObject();
		return label == null || label.length() == 0 ? getString("_UI_BusinessObjective_type")
				: getString("_UI_BusinessObjective_type") + " " + label;
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

		switch (notification.getFeatureID(BusinessObjective.class)) {
		case SymbiosisDMPackage.BUSINESS_OBJECTIVE__OBJECT:
		case SymbiosisDMPackage.BUSINESS_OBJECTIVE__SCOPE:
		case SymbiosisDMPackage.BUSINESS_OBJECTIVE__PURPOSE:
		case SymbiosisDMPackage.BUSINESS_OBJECTIVE__VIEWPOINT:
		case SymbiosisDMPackage.BUSINESS_OBJECTIVE__CONTEXT:
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
