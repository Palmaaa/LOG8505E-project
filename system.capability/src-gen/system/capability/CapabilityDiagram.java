/**
 */
package system.capability;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link system.capability.CapabilityDiagram#getSupports <em>Supports</em>}</li>
 * </ul>
 *
 * @see system.capability.CapabilityPackage#getCapabilityDiagram()
 * @model
 * @generated
 */
public interface CapabilityDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Supports</b></em>' containment reference list.
	 * The list contents are of type {@link system.capability.SpecializableElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supports</em>' containment reference list.
	 * @see system.capability.CapabilityPackage#getCapabilityDiagram_Supports()
	 * @model containment="true"
	 * @generated
	 */
	EList<SpecializableElement> getSupports();

} // CapabilityDiagram
