/**
 */
package symbiosisDM.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import symbiosisDM.SYMBIOSIS;
import symbiosisDM.SymbiosisDMFactory;
import symbiosisDM.SymbiosisDMPackage;

/**
 * This is the item provider adapter for a {@link symbiosisDM.SYMBIOSIS} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SYMBIOSISItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SYMBIOSISItemProvider(AdapterFactory adapterFactory) {
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

			addDependencyModelPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Dependency Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDependencyModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_SYMBIOSIS_dependencyModel_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_SYMBIOSIS_dependencyModel_feature",
								"_UI_SYMBIOSIS_type"),
						SymbiosisDMPackage.Literals.SYMBIOSIS__DEPENDENCY_MODEL, true, false, true, null, null, null));
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
			childrenFeatures.add(SymbiosisDMPackage.Literals.SYMBIOSIS__BUSINESSOBJECTIVE);
			childrenFeatures.add(SymbiosisDMPackage.Literals.SYMBIOSIS__SECURITYMEASUREMENTGOAL);
			childrenFeatures.add(SymbiosisDMPackage.Literals.SYMBIOSIS__SECURITYMETRIC);
			childrenFeatures.add(SymbiosisDMPackage.Literals.SYMBIOSIS__BASEMEASUREMENT);
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
	 * This returns SYMBIOSIS.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SYMBIOSIS"));
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
		return getString("_UI_SYMBIOSIS_type");
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

		switch (notification.getFeatureID(SYMBIOSIS.class)) {
		case SymbiosisDMPackage.SYMBIOSIS__BUSINESSOBJECTIVE:
		case SymbiosisDMPackage.SYMBIOSIS__SECURITYMEASUREMENTGOAL:
		case SymbiosisDMPackage.SYMBIOSIS__SECURITYMETRIC:
		case SymbiosisDMPackage.SYMBIOSIS__BASEMEASUREMENT:
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

		newChildDescriptors.add(createChildParameter(SymbiosisDMPackage.Literals.SYMBIOSIS__BUSINESSOBJECTIVE,
				SymbiosisDMFactory.eINSTANCE.createBusinessObjective()));

		newChildDescriptors.add(createChildParameter(SymbiosisDMPackage.Literals.SYMBIOSIS__SECURITYMEASUREMENTGOAL,
				SymbiosisDMFactory.eINSTANCE.createSecurityMeasurementGoal()));

		newChildDescriptors.add(createChildParameter(SymbiosisDMPackage.Literals.SYMBIOSIS__SECURITYMETRIC,
				SymbiosisDMFactory.eINSTANCE.createSecurityMetric()));

		newChildDescriptors.add(createChildParameter(SymbiosisDMPackage.Literals.SYMBIOSIS__BASEMEASUREMENT,
				SymbiosisDMFactory.eINSTANCE.createBaseMeasurement()));
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
