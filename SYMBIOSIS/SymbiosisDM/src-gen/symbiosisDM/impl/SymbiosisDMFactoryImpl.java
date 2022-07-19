/**
 */
package symbiosisDM.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import symbiosisDM.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SymbiosisDMFactoryImpl extends EFactoryImpl implements SymbiosisDMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SymbiosisDMFactory init() {
		try {
			SymbiosisDMFactory theSymbiosisDMFactory = (SymbiosisDMFactory) EPackage.Registry.INSTANCE
					.getEFactory(SymbiosisDMPackage.eNS_URI);
			if (theSymbiosisDMFactory != null) {
				return theSymbiosisDMFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SymbiosisDMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbiosisDMFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case SymbiosisDMPackage.BUSINESS_OBJECTIVE:
			return createBusinessObjective();
		case SymbiosisDMPackage.SECURITY_MEASUREMENT_GOAL:
			return createSecurityMeasurementGoal();
		case SymbiosisDMPackage.SECURITY_METRIC:
			return createSecurityMetric();
		case SymbiosisDMPackage.BASE_MEASUREMENT:
			return createBaseMeasurement();
		case SymbiosisDMPackage.SYMBIOSIS:
			return createSYMBIOSIS();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessObjective createBusinessObjective() {
		BusinessObjectiveImpl businessObjective = new BusinessObjectiveImpl();
		return businessObjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityMeasurementGoal createSecurityMeasurementGoal() {
		SecurityMeasurementGoalImpl securityMeasurementGoal = new SecurityMeasurementGoalImpl();
		return securityMeasurementGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityMetric createSecurityMetric() {
		SecurityMetricImpl securityMetric = new SecurityMetricImpl();
		return securityMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseMeasurement createBaseMeasurement() {
		BaseMeasurementImpl baseMeasurement = new BaseMeasurementImpl();
		return baseMeasurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SYMBIOSIS createSYMBIOSIS() {
		SYMBIOSISImpl symbiosis = new SYMBIOSISImpl();
		return symbiosis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbiosisDMPackage getSymbiosisDMPackage() {
		return (SymbiosisDMPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SymbiosisDMPackage getPackage() {
		return SymbiosisDMPackage.eINSTANCE;
	}

} //SymbiosisDMFactoryImpl
