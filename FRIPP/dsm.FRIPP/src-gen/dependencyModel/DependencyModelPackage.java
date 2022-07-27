/**
 */
package dependencyModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dependencyModel.DependencyModelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface DependencyModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dependencyModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/dependencyModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dependencyModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DependencyModelPackage eINSTANCE = dependencyModel.impl.DependencyModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link dependencyModel.impl.ParagonImpl <em>Paragon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependencyModel.impl.ParagonImpl
	 * @see dependencyModel.impl.DependencyModelPackageImpl#getParagon()
	 * @generated
	 */
	int PARAGON = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGON__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGON__PROBABILITY = 1;

	/**
	 * The feature id for the '<em><b>Paragon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGON__PARAGON = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGON__TYPE = 3;

	/**
	 * The number of structural features of the '<em>Paragon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGON_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Paragon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dependencyModel.PARAGON_COMPOSITION_ENUM <em>PARAGON COMPOSITION ENUM</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dependencyModel.PARAGON_COMPOSITION_ENUM
	 * @see dependencyModel.impl.DependencyModelPackageImpl#getPARAGON_COMPOSITION_ENUM()
	 * @generated
	 */
	int PARAGON_COMPOSITION_ENUM = 1;

	/**
	 * Returns the meta object for class '{@link dependencyModel.Paragon <em>Paragon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paragon</em>'.
	 * @see dependencyModel.Paragon
	 * @generated
	 */
	EClass getParagon();

	/**
	 * Returns the meta object for the attribute '{@link dependencyModel.Paragon#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see dependencyModel.Paragon#getDescription()
	 * @see #getParagon()
	 * @generated
	 */
	EAttribute getParagon_Description();

	/**
	 * Returns the meta object for the attribute '{@link dependencyModel.Paragon#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see dependencyModel.Paragon#getProbability()
	 * @see #getParagon()
	 * @generated
	 */
	EAttribute getParagon_Probability();

	/**
	 * Returns the meta object for the containment reference list '{@link dependencyModel.Paragon#getParagon <em>Paragon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paragon</em>'.
	 * @see dependencyModel.Paragon#getParagon()
	 * @see #getParagon()
	 * @generated
	 */
	EReference getParagon_Paragon();

	/**
	 * Returns the meta object for the attribute '{@link dependencyModel.Paragon#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see dependencyModel.Paragon#getType()
	 * @see #getParagon()
	 * @generated
	 */
	EAttribute getParagon_Type();

	/**
	 * Returns the meta object for enum '{@link dependencyModel.PARAGON_COMPOSITION_ENUM <em>PARAGON COMPOSITION ENUM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>PARAGON COMPOSITION ENUM</em>'.
	 * @see dependencyModel.PARAGON_COMPOSITION_ENUM
	 * @generated
	 */
	EEnum getPARAGON_COMPOSITION_ENUM();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DependencyModelFactory getDependencyModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link dependencyModel.impl.ParagonImpl <em>Paragon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependencyModel.impl.ParagonImpl
		 * @see dependencyModel.impl.DependencyModelPackageImpl#getParagon()
		 * @generated
		 */
		EClass PARAGON = eINSTANCE.getParagon();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAGON__DESCRIPTION = eINSTANCE.getParagon_Description();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAGON__PROBABILITY = eINSTANCE.getParagon_Probability();

		/**
		 * The meta object literal for the '<em><b>Paragon</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAGON__PARAGON = eINSTANCE.getParagon_Paragon();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAGON__TYPE = eINSTANCE.getParagon_Type();

		/**
		 * The meta object literal for the '{@link dependencyModel.PARAGON_COMPOSITION_ENUM <em>PARAGON COMPOSITION ENUM</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dependencyModel.PARAGON_COMPOSITION_ENUM
		 * @see dependencyModel.impl.DependencyModelPackageImpl#getPARAGON_COMPOSITION_ENUM()
		 * @generated
		 */
		EEnum PARAGON_COMPOSITION_ENUM = eINSTANCE.getPARAGON_COMPOSITION_ENUM();

	}

} //DependencyModelPackage
