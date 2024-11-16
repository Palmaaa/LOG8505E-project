/**
 */
package system.capability;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link system.capability.Capability#getIncludes <em>Includes</em>}</li>
 *   <li>{@link system.capability.Capability#getIsIncludedIn <em>Is Included In</em>}</li>
 *   <li>{@link system.capability.Capability#getExtends <em>Extends</em>}</li>
 *   <li>{@link system.capability.Capability#getIsExtendedBy <em>Is Extended By</em>}</li>
 *   <li>{@link system.capability.Capability#getInvolves <em>Involves</em>}</li>
 * </ul>
 *
 * @see system.capability.CapabilityPackage#getCapability()
 * @model
 * @generated
 */
public interface Capability extends SpecializableElement {
	/**
	 * Returns the value of the '<em><b>Includes</b></em>' reference list.
	 * The list contents are of type {@link system.capability.Capability}.
	 * It is bidirectional and its opposite is '{@link system.capability.Capability#getIsIncludedIn <em>Is Included In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Includes</em>' reference list.
	 * @see system.capability.CapabilityPackage#getCapability_Includes()
	 * @see system.capability.Capability#getIsIncludedIn
	 * @model opposite="isIncludedIn"
	 * @generated
	 */
	EList<Capability> getIncludes();

	/**
	 * Returns the value of the '<em><b>Is Included In</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link system.capability.Capability#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Included In</em>' reference.
	 * @see #setIsIncludedIn(Capability)
	 * @see system.capability.CapabilityPackage#getCapability_IsIncludedIn()
	 * @see system.capability.Capability#getIncludes
	 * @model opposite="includes"
	 * @generated
	 */
	Capability getIsIncludedIn();

	/**
	 * Sets the value of the '{@link system.capability.Capability#getIsIncludedIn <em>Is Included In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Included In</em>' reference.
	 * @see #getIsIncludedIn()
	 * @generated
	 */
	void setIsIncludedIn(Capability value);

	/**
	 * Returns the value of the '<em><b>Extends</b></em>' reference list.
	 * The list contents are of type {@link system.capability.Capability}.
	 * It is bidirectional and its opposite is '{@link system.capability.Capability#getIsExtendedBy <em>Is Extended By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' reference list.
	 * @see system.capability.CapabilityPackage#getCapability_Extends()
	 * @see system.capability.Capability#getIsExtendedBy
	 * @model opposite="isExtendedBy"
	 * @generated
	 */
	EList<Capability> getExtends();

	/**
	 * Returns the value of the '<em><b>Is Extended By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link system.capability.Capability#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Extended By</em>' reference.
	 * @see #setIsExtendedBy(Capability)
	 * @see system.capability.CapabilityPackage#getCapability_IsExtendedBy()
	 * @see system.capability.Capability#getExtends
	 * @model opposite="extends"
	 * @generated
	 */
	Capability getIsExtendedBy();

	/**
	 * Sets the value of the '{@link system.capability.Capability#getIsExtendedBy <em>Is Extended By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Extended By</em>' reference.
	 * @see #getIsExtendedBy()
	 * @generated
	 */
	void setIsExtendedBy(Capability value);

	/**
	 * Returns the value of the '<em><b>Involves</b></em>' reference list.
	 * The list contents are of type {@link system.capability.InvolvableElement}.
	 * It is bidirectional and its opposite is '{@link system.capability.InvolvableElement#getIsInvolvedIn <em>Is Involved In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Involves</em>' reference list.
	 * @see system.capability.CapabilityPackage#getCapability_Involves()
	 * @see system.capability.InvolvableElement#getIsInvolvedIn
	 * @model opposite="isInvolvedIn" required="true"
	 * @generated
	 */
	EList<InvolvableElement> getInvolves();

} // Capability
