/**
 */
package dsm.FRIPP;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>OBJECTIVES ENUM</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see dsm.FRIPP.FRIPPPackage#getOBJECTIVES_ENUM()
 * @model
 * @generated
 */
public enum OBJECTIVES_ENUM implements Enumerator {
	/**
	 * The '<em><b>INVESTIGATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INVESTIGATION_VALUE
	 * @generated
	 * @ordered
	 */
	INVESTIGATION(0, "INVESTIGATION", "INVESTIGATION"),

	/**
	 * The '<em><b>MITIGATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MITIGATION_VALUE
	 * @generated
	 * @ordered
	 */
	MITIGATION(1, "MITIGATION", "MITIGATION"),

	/**
	 * The '<em><b>REMEDIATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMEDIATION_VALUE
	 * @generated
	 * @ordered
	 */
	REMEDIATION(2, "REMEDIATION", "REMEDIATION"),

	/**
	 * The '<em><b>PREVENTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREVENTION_VALUE
	 * @generated
	 * @ordered
	 */
	PREVENTION(3, "PREVENTION", "PREVENTION");

	/**
	 * The '<em><b>INVESTIGATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INVESTIGATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INVESTIGATION_VALUE = 0;

	/**
	 * The '<em><b>MITIGATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MITIGATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MITIGATION_VALUE = 1;

	/**
	 * The '<em><b>REMEDIATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMEDIATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REMEDIATION_VALUE = 2;

	/**
	 * The '<em><b>PREVENTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREVENTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PREVENTION_VALUE = 3;

	/**
	 * An array of all the '<em><b>OBJECTIVES ENUM</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OBJECTIVES_ENUM[] VALUES_ARRAY = new OBJECTIVES_ENUM[] { INVESTIGATION, MITIGATION,
			REMEDIATION, PREVENTION, };

	/**
	 * A public read-only list of all the '<em><b>OBJECTIVES ENUM</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OBJECTIVES_ENUM> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>OBJECTIVES ENUM</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OBJECTIVES_ENUM get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OBJECTIVES_ENUM result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>OBJECTIVES ENUM</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OBJECTIVES_ENUM getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OBJECTIVES_ENUM result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>OBJECTIVES ENUM</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OBJECTIVES_ENUM get(int value) {
		switch (value) {
		case INVESTIGATION_VALUE:
			return INVESTIGATION;
		case MITIGATION_VALUE:
			return MITIGATION;
		case REMEDIATION_VALUE:
			return REMEDIATION;
		case PREVENTION_VALUE:
			return PREVENTION;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private OBJECTIVES_ENUM(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //OBJECTIVES_ENUM
