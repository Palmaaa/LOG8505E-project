/**
 */
package system.capability;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specializable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link system.capability.SpecializableElement#getName <em>Name</em>}</li>
 *   <li>{@link system.capability.SpecializableElement#getSpecializes <em>Specializes</em>}</li>
 *   <li>{@link system.capability.SpecializableElement#getIsSpecializedBy <em>Is Specialized By</em>}</li>
 * </ul>
 *
 * @see system.capability.CapabilityPackage#getSpecializableElement()
 * @model abstract="true"
 * @generated
 */
public interface SpecializableElement extends EObject {

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see system.capability.CapabilityPackage#getSpecializableElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link system.capability.SpecializableElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Specializes</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link system.capability.SpecializableElement#getIsSpecializedBy <em>Is Specialized By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specializes</em>' reference.
	 * @see #setSpecializes(SpecializableElement)
	 * @see system.capability.CapabilityPackage#getSpecializableElement_Specializes()
	 * @see system.capability.SpecializableElement#getIsSpecializedBy
	 * @model opposite="isSpecializedBy"
	 * @generated
	 */
	SpecializableElement getSpecializes();

	/**
	 * Sets the value of the '{@link system.capability.SpecializableElement#getSpecializes <em>Specializes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specializes</em>' reference.
	 * @see #getSpecializes()
	 * @generated
	 */
	void setSpecializes(SpecializableElement value);

	/**
	 * Returns the value of the '<em><b>Is Specialized By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link system.capability.SpecializableElement#getSpecializes <em>Specializes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Specialized By</em>' reference.
	 * @see #setIsSpecializedBy(SpecializableElement)
	 * @see system.capability.CapabilityPackage#getSpecializableElement_IsSpecializedBy()
	 * @see system.capability.SpecializableElement#getSpecializes
	 * @model opposite="specializes"
	 * @generated
	 */
	SpecializableElement getIsSpecializedBy();

	/**
	 * Sets the value of the '{@link system.capability.SpecializableElement#getIsSpecializedBy <em>Is Specialized By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Specialized By</em>' reference.
	 * @see #getIsSpecializedBy()
	 * @generated
	 */
	void setIsSpecializedBy(SpecializableElement value);
} // SpecializableElement
