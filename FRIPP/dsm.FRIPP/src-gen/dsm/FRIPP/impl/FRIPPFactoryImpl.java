/**
 */
package dsm.FRIPP.impl;

import dsm.FRIPP.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FRIPPFactoryImpl extends EFactoryImpl implements FRIPPFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FRIPPFactory init() {
		try {
			FRIPPFactory theFRIPPFactory = (FRIPPFactory) EPackage.Registry.INSTANCE.getEFactory(FRIPPPackage.eNS_URI);
			if (theFRIPPFactory != null) {
				return theFRIPPFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FRIPPFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FRIPPFactoryImpl() {
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
		case FRIPPPackage.PLAYBOOK_PROCESS:
			return createPlaybookProcess();
		case FRIPPPackage.ACTUATOR:
			return createActuator();
		case FRIPPPackage.EXTERNAL_REFERENCE:
			return createExternalReference();
		case FRIPPPackage.ACTIVITY_IMPACT:
			return createActivityImpact();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case FRIPPPackage.OBJECTIVES_ENUM:
			return createOBJECTIVES_ENUMFromString(eDataType, initialValue);
		case FRIPPPackage.ACTION_TYPE_ENUM:
			return createACTION_TYPE_ENUMFromString(eDataType, initialValue);
		case FRIPPPackage.ACTUATOR_TYPE_ENUM:
			return createACTUATOR_TYPE_ENUMFromString(eDataType, initialValue);
		case FRIPPPackage.ORCHESTRATION_SERVICE_CATEGORY:
			return createORCHESTRATION_SERVICE_CATEGORYFromString(eDataType, initialValue);
		case FRIPPPackage.REFERENCE_TYPE_ENUM:
			return createREFERENCE_TYPE_ENUMFromString(eDataType, initialValue);
		case FRIPPPackage.GOALS_ENUM:
			return createGOALS_ENUMFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case FRIPPPackage.OBJECTIVES_ENUM:
			return convertOBJECTIVES_ENUMToString(eDataType, instanceValue);
		case FRIPPPackage.ACTION_TYPE_ENUM:
			return convertACTION_TYPE_ENUMToString(eDataType, instanceValue);
		case FRIPPPackage.ACTUATOR_TYPE_ENUM:
			return convertACTUATOR_TYPE_ENUMToString(eDataType, instanceValue);
		case FRIPPPackage.ORCHESTRATION_SERVICE_CATEGORY:
			return convertORCHESTRATION_SERVICE_CATEGORYToString(eDataType, instanceValue);
		case FRIPPPackage.REFERENCE_TYPE_ENUM:
			return convertREFERENCE_TYPE_ENUMToString(eDataType, instanceValue);
		case FRIPPPackage.GOALS_ENUM:
			return convertGOALS_ENUMToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlaybookProcess createPlaybookProcess() {
		PlaybookProcessImpl playbookProcess = new PlaybookProcessImpl();
		return playbookProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Actuator createActuator() {
		ActuatorImpl actuator = new ActuatorImpl();
		return actuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalReference createExternalReference() {
		ExternalReferenceImpl externalReference = new ExternalReferenceImpl();
		return externalReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivityImpact createActivityImpact() {
		ActivityImpactImpl activityImpact = new ActivityImpactImpl();
		return activityImpact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBJECTIVES_ENUM createOBJECTIVES_ENUMFromString(EDataType eDataType, String initialValue) {
		OBJECTIVES_ENUM result = OBJECTIVES_ENUM.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOBJECTIVES_ENUMToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACTION_TYPE_ENUM createACTION_TYPE_ENUMFromString(EDataType eDataType, String initialValue) {
		ACTION_TYPE_ENUM result = ACTION_TYPE_ENUM.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertACTION_TYPE_ENUMToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACTUATOR_TYPE_ENUM createACTUATOR_TYPE_ENUMFromString(EDataType eDataType, String initialValue) {
		ACTUATOR_TYPE_ENUM result = ACTUATOR_TYPE_ENUM.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertACTUATOR_TYPE_ENUMToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORCHESTRATION_SERVICE_CATEGORY createORCHESTRATION_SERVICE_CATEGORYFromString(EDataType eDataType,
			String initialValue) {
		ORCHESTRATION_SERVICE_CATEGORY result = ORCHESTRATION_SERVICE_CATEGORY.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertORCHESTRATION_SERVICE_CATEGORYToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REFERENCE_TYPE_ENUM createREFERENCE_TYPE_ENUMFromString(EDataType eDataType, String initialValue) {
		REFERENCE_TYPE_ENUM result = REFERENCE_TYPE_ENUM.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertREFERENCE_TYPE_ENUMToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GOALS_ENUM createGOALS_ENUMFromString(EDataType eDataType, String initialValue) {
		GOALS_ENUM result = GOALS_ENUM.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGOALS_ENUMToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FRIPPPackage getFRIPPPackage() {
		return (FRIPPPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FRIPPPackage getPackage() {
		return FRIPPPackage.eINSTANCE;
	}

} //FRIPPFactoryImpl
