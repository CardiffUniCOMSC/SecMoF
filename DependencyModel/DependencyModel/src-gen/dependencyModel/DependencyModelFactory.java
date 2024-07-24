/**
 */
package dependencyModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see dependencyModel.DependencyModelPackage
 * @generated
 */
public interface DependencyModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DependencyModelFactory eINSTANCE = dependencyModel.impl.DependencyModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Paragon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Paragon</em>'.
	 * @generated
	 */
	Paragon createParagon();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DependencyModelPackage getDependencyModelPackage();

} //DependencyModelFactory
