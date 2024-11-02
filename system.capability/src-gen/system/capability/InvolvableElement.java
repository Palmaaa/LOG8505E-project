/**
 */
package system.capability;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Involvable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link system.capability.InvolvableElement#getIsInvolvedIn <em>Is Involved In</em>}</li>
 * </ul>
 *
 * @see system.capability.CapabilityPackage#getInvolvableElement()
 * @model abstract="true"
 * @generated
 */
public interface InvolvableElement extends SpecializableElement {
	/**
	 * Returns the value of the '<em><b>Is Involved In</b></em>' reference list.
	 * The list contents are of type {@link system.capability.Capability}.
	 * It is bidirectional and its opposite is '{@link system.capability.Capability#getInvolves <em>Involves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Involved In</em>' reference list.
	 * @see system.capability.CapabilityPackage#getInvolvableElement_IsInvolvedIn()
	 * @see system.capability.Capability#getInvolves
	 * @model opposite="involves" required="true"
	 * @generated
	 */
	EList<Capability> getIsInvolvedIn();

} // InvolvableElement
