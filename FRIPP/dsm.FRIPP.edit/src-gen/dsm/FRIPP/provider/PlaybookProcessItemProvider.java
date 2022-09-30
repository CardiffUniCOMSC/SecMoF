/**
 */
package dsm.FRIPP.provider;

import PROVE.provider.ProcessItemProvider;

import dsm.FRIPP.FRIPPFactory;
import dsm.FRIPP.FRIPPPackage;
import dsm.FRIPP.PlaybookProcess;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link dsm.FRIPP.PlaybookProcess} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PlaybookProcessItemProvider extends ProcessItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaybookProcessItemProvider(AdapterFactory adapterFactory) {
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

			addObjectivesPropertyDescriptor(object);
			addActionTypePropertyDescriptor(object);
			addRelatedreferencesPropertyDescriptor(object);
			addParagonPropertyDescriptor(object);
			addAssociatedRolePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Objectives feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addObjectivesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_PlaybookProcess_objectives_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_PlaybookProcess_objectives_feature",
								"_UI_PlaybookProcess_type"),
						FRIPPPackage.Literals.PLAYBOOK_PROCESS__OBJECTIVES, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Action Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActionTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_PlaybookProcess_actionType_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_PlaybookProcess_actionType_feature",
								"_UI_PlaybookProcess_type"),
						FRIPPPackage.Literals.PLAYBOOK_PROCESS__ACTION_TYPE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Relatedreferences feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRelatedreferencesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_PlaybookProcess_relatedreferences_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_PlaybookProcess_relatedreferences_feature",
								"_UI_PlaybookProcess_type"),
						FRIPPPackage.Literals.PLAYBOOK_PROCESS__RELATEDREFERENCES, true, false, true, null, null,
						null));
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
						getResourceLocator(), getString("_UI_PlaybookProcess_paragon_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_PlaybookProcess_paragon_feature",
								"_UI_PlaybookProcess_type"),
						FRIPPPackage.Literals.PLAYBOOK_PROCESS__PARAGON, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Associated Role feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssociatedRolePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_PlaybookProcess_associatedRole_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_PlaybookProcess_associatedRole_feature",
								"_UI_PlaybookProcess_type"),
						FRIPPPackage.Literals.PLAYBOOK_PROCESS__ASSOCIATED_ROLE, true, false, true, null, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(FRIPPPackage.Literals.PLAYBOOK_PROCESS__EXTERNALREFERENCES);
			childrenFeatures.add(FRIPPPackage.Literals.PLAYBOOK_PROCESS__ACTIVITYIMPACT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns PlaybookProcess.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PlaybookProcess"));
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
		String label = ((PlaybookProcess) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_PlaybookProcess_type")
				: getString("_UI_PlaybookProcess_type") + " " + label;
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

		switch (notification.getFeatureID(PlaybookProcess.class)) {
		case FRIPPPackage.PLAYBOOK_PROCESS__OBJECTIVES:
		case FRIPPPackage.PLAYBOOK_PROCESS__ACTION_TYPE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case FRIPPPackage.PLAYBOOK_PROCESS__EXTERNALREFERENCES:
		case FRIPPPackage.PLAYBOOK_PROCESS__ACTIVITYIMPACT:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add(createChildParameter(FRIPPPackage.Literals.PLAYBOOK_PROCESS__EXTERNALREFERENCES,
				FRIPPFactory.eINSTANCE.createExternalReference()));

		newChildDescriptors.add(createChildParameter(FRIPPPackage.Literals.PLAYBOOK_PROCESS__ACTIVITYIMPACT,
				FRIPPFactory.eINSTANCE.createActivityImpact()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return FRIPPEditPlugin.INSTANCE;
	}

}
