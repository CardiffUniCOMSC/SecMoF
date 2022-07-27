/**
 */
package dsm.FRIPP;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>REFERENCE TYPE ENUM</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see dsm.FRIPP.FRIPPPackage#getREFERENCE_TYPE_ENUM()
 * @model
 * @generated
 */
public enum REFERENCE_TYPE_ENUM implements Enumerator {
	/**
	 * The '<em><b>BEST PRACTICE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEST_PRACTICE_VALUE
	 * @generated
	 * @ordered
	 */
	BEST_PRACTICE(0, "BEST_PRACTICE", "BEST_PRACTICE"),

	/**
	 * The '<em><b>POLICY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POLICY_VALUE
	 * @generated
	 * @ordered
	 */
	POLICY(1, "POLICY", "POLICY"),

	/**
	 * The '<em><b>REGULATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGULATION_VALUE
	 * @generated
	 * @ordered
	 */
	REGULATION(2, "REGULATION", "REGULATION");

	/**
	 * The '<em><b>BEST PRACTICE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEST_PRACTICE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BEST_PRACTICE_VALUE = 0;

	/**
	 * The '<em><b>POLICY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POLICY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int POLICY_VALUE = 1;

	/**
	 * The '<em><b>REGULATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGULATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REGULATION_VALUE = 2;

	/**
	 * An array of all the '<em><b>REFERENCE TYPE ENUM</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final REFERENCE_TYPE_ENUM[] VALUES_ARRAY = new REFERENCE_TYPE_ENUM[] { BEST_PRACTICE, POLICY,
			REGULATION, };

	/**
	 * A public read-only list of all the '<em><b>REFERENCE TYPE ENUM</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<REFERENCE_TYPE_ENUM> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>REFERENCE TYPE ENUM</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static REFERENCE_TYPE_ENUM get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			REFERENCE_TYPE_ENUM result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>REFERENCE TYPE ENUM</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static REFERENCE_TYPE_ENUM getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			REFERENCE_TYPE_ENUM result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>REFERENCE TYPE ENUM</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static REFERENCE_TYPE_ENUM get(int value) {
		switch (value) {
		case BEST_PRACTICE_VALUE:
			return BEST_PRACTICE;
		case POLICY_VALUE:
			return POLICY;
		case REGULATION_VALUE:
			return REGULATION;
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
	private REFERENCE_TYPE_ENUM(int value, String name, String literal) {
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

} //REFERENCE_TYPE_ENUM
