/**
 */
package dependencyModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>PARAGON COMPOSITION ENUM</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see dependencyModel.DependencyModelPackage#getPARAGON_COMPOSITION_ENUM()
 * @model
 * @generated
 */
public enum PARAGON_COMPOSITION_ENUM implements Enumerator {
	/**
	 * The '<em><b>AND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AND_VALUE
	 * @generated
	 * @ordered
	 */
	AND(0, "AND", "AND"),

	/**
	 * The '<em><b>OR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OR_VALUE
	 * @generated
	 * @ordered
	 */
	OR(1, "OR", "OR"),
	/**
	 * The '<em><b>UNCONTROLLABLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #UNCONTROLLABLE_VALUE
	 * @generated
	 * @ordered
	 */
	UNCONTROLLABLE(2, "UNCONTROLLABLE", "UNCONTROLLABLE"),
	/**
	 * The '<em><b>TEMP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #TEMP_VALUE
	 * @generated
	 * @ordered
	 */
	TEMP(3, "TEMP", "TEMP");

	/**
	 * The '<em><b>AND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AND_VALUE = 0;

	/**
	 * The '<em><b>OR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OR_VALUE = 1;

	/**
	 * The '<em><b>UNCONTROLLABLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNCONTROLLABLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNCONTROLLABLE_VALUE = 2;

	/**
	 * The '<em><b>TEMP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEMP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TEMP_VALUE = 3;

	/**
	 * An array of all the '<em><b>PARAGON COMPOSITION ENUM</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PARAGON_COMPOSITION_ENUM[] VALUES_ARRAY = new PARAGON_COMPOSITION_ENUM[] { AND, OR,
			UNCONTROLLABLE, TEMP, };

	/**
	 * A public read-only list of all the '<em><b>PARAGON COMPOSITION ENUM</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PARAGON_COMPOSITION_ENUM> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>PARAGON COMPOSITION ENUM</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PARAGON_COMPOSITION_ENUM get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PARAGON_COMPOSITION_ENUM result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>PARAGON COMPOSITION ENUM</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PARAGON_COMPOSITION_ENUM getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PARAGON_COMPOSITION_ENUM result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>PARAGON COMPOSITION ENUM</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PARAGON_COMPOSITION_ENUM get(int value) {
		switch (value) {
		case AND_VALUE:
			return AND;
		case OR_VALUE:
			return OR;
		case UNCONTROLLABLE_VALUE:
			return UNCONTROLLABLE;
		case TEMP_VALUE:
			return TEMP;
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
	private PARAGON_COMPOSITION_ENUM(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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

} //PARAGON_COMPOSITION_ENUM
