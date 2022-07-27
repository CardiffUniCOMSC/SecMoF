/**
 */
package dsm.FRIPP;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>GOALS ENUM</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see dsm.FRIPP.FRIPPPackage#getGOALS_ENUM()
 * @model
 * @generated
 */
public enum GOALS_ENUM implements Enumerator {
	/**
	 * The '<em><b>MAKE SYSTEM SAFE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAKE_SYSTEM_SAFE_VALUE
	 * @generated
	 * @ordered
	 */
	MAKE_SYSTEM_SAFE(0, "MAKE_SYSTEM_SAFE", "MAKE_SYSTEM_SAFE"),

	/**
	 * The '<em><b>PRESERVE EVIDENCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESERVE_EVIDENCE_VALUE
	 * @generated
	 * @ordered
	 */
	PRESERVE_EVIDENCE(1, "PRESERVE_EVIDENCE", "PRESERVE_EVIDENCE"),

	/**
	 * The '<em><b>ESTABLISH COMMUNICATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ESTABLISH_COMMUNICATION_VALUE
	 * @generated
	 * @ordered
	 */
	ESTABLISH_COMMUNICATION(2, "ESTABLISH_COMMUNICATION", "ESTABLISH_COMMUNICATION"),

	/**
	 * The '<em><b>MAKE DECISION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAKE_DECISION_VALUE
	 * @generated
	 * @ordered
	 */
	MAKE_DECISION(3, "MAKE_DECISION", "MAKE_DECISION");

	/**
	 * The '<em><b>MAKE SYSTEM SAFE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAKE_SYSTEM_SAFE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MAKE_SYSTEM_SAFE_VALUE = 0;

	/**
	 * The '<em><b>PRESERVE EVIDENCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESERVE_EVIDENCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRESERVE_EVIDENCE_VALUE = 1;

	/**
	 * The '<em><b>ESTABLISH COMMUNICATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ESTABLISH_COMMUNICATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ESTABLISH_COMMUNICATION_VALUE = 2;

	/**
	 * The '<em><b>MAKE DECISION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAKE_DECISION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MAKE_DECISION_VALUE = 3;

	/**
	 * An array of all the '<em><b>GOALS ENUM</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GOALS_ENUM[] VALUES_ARRAY = new GOALS_ENUM[] { MAKE_SYSTEM_SAFE, PRESERVE_EVIDENCE,
			ESTABLISH_COMMUNICATION, MAKE_DECISION, };

	/**
	 * A public read-only list of all the '<em><b>GOALS ENUM</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GOALS_ENUM> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>GOALS ENUM</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GOALS_ENUM get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GOALS_ENUM result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>GOALS ENUM</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GOALS_ENUM getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GOALS_ENUM result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>GOALS ENUM</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GOALS_ENUM get(int value) {
		switch (value) {
		case MAKE_SYSTEM_SAFE_VALUE:
			return MAKE_SYSTEM_SAFE;
		case PRESERVE_EVIDENCE_VALUE:
			return PRESERVE_EVIDENCE;
		case ESTABLISH_COMMUNICATION_VALUE:
			return ESTABLISH_COMMUNICATION;
		case MAKE_DECISION_VALUE:
			return MAKE_DECISION;
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
	private GOALS_ENUM(int value, String name, String literal) {
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

} //GOALS_ENUM
