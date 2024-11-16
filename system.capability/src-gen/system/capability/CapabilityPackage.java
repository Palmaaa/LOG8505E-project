/**
 */
package system.capability;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see system.capability.CapabilityFactory
 * @model kind="package"
 * @generated
 */
public interface CapabilityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "capability";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/capability";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "capability";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CapabilityPackage eINSTANCE = system.capability.impl.CapabilityPackageImpl.init();

	/**
	 * The meta object id for the '{@link system.capability.impl.SpecializableElementImpl <em>Specializable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see system.capability.impl.SpecializableElementImpl
	 * @see system.capability.impl.CapabilityPackageImpl#getSpecializableElement()
	 * @generated
	 */
	int SPECIALIZABLE_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZABLE_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Specializes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZABLE_ELEMENT__SPECIALIZES = 1;

	/**
	 * The feature id for the '<em><b>Is Specialized By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZABLE_ELEMENT__IS_SPECIALIZED_BY = 2;

	/**
	 * The number of structural features of the '<em>Specializable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZABLE_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Specializable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZABLE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link system.capability.impl.CapabilityImpl <em>Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see system.capability.impl.CapabilityImpl
	 * @see system.capability.impl.CapabilityPackageImpl#getCapability()
	 * @generated
	 */
	int CAPABILITY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__NAME = SPECIALIZABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Specializes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__SPECIALIZES = SPECIALIZABLE_ELEMENT__SPECIALIZES;

	/**
	 * The feature id for the '<em><b>Is Specialized By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__IS_SPECIALIZED_BY = SPECIALIZABLE_ELEMENT__IS_SPECIALIZED_BY;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__INCLUDES = SPECIALIZABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Included In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__IS_INCLUDED_IN = SPECIALIZABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__EXTENDS = SPECIALIZABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Extended By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__IS_EXTENDED_BY = SPECIALIZABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Involves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__INVOLVES = SPECIALIZABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_FEATURE_COUNT = SPECIALIZABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_OPERATION_COUNT = SPECIALIZABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link system.capability.impl.InvolvableElementImpl <em>Involvable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see system.capability.impl.InvolvableElementImpl
	 * @see system.capability.impl.CapabilityPackageImpl#getInvolvableElement()
	 * @generated
	 */
	int INVOLVABLE_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOLVABLE_ELEMENT__NAME = SPECIALIZABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Specializes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOLVABLE_ELEMENT__SPECIALIZES = SPECIALIZABLE_ELEMENT__SPECIALIZES;

	/**
	 * The feature id for the '<em><b>Is Specialized By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOLVABLE_ELEMENT__IS_SPECIALIZED_BY = SPECIALIZABLE_ELEMENT__IS_SPECIALIZED_BY;

	/**
	 * The feature id for the '<em><b>Is Involved In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOLVABLE_ELEMENT__IS_INVOLVED_IN = SPECIALIZABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Involvable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOLVABLE_ELEMENT_FEATURE_COUNT = SPECIALIZABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Involvable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOLVABLE_ELEMENT_OPERATION_COUNT = SPECIALIZABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link system.capability.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see system.capability.impl.ActorImpl
	 * @see system.capability.impl.CapabilityPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = INVOLVABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Specializes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__SPECIALIZES = INVOLVABLE_ELEMENT__SPECIALIZES;

	/**
	 * The feature id for the '<em><b>Is Specialized By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__IS_SPECIALIZED_BY = INVOLVABLE_ELEMENT__IS_SPECIALIZED_BY;

	/**
	 * The feature id for the '<em><b>Is Involved In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__IS_INVOLVED_IN = INVOLVABLE_ELEMENT__IS_INVOLVED_IN;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = INVOLVABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_OPERATION_COUNT = INVOLVABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link system.capability.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see system.capability.impl.EntityImpl
	 * @see system.capability.impl.CapabilityPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = INVOLVABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Specializes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__SPECIALIZES = INVOLVABLE_ELEMENT__SPECIALIZES;

	/**
	 * The feature id for the '<em><b>Is Specialized By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__IS_SPECIALIZED_BY = INVOLVABLE_ELEMENT__IS_SPECIALIZED_BY;

	/**
	 * The feature id for the '<em><b>Is Involved In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__IS_INVOLVED_IN = INVOLVABLE_ELEMENT__IS_INVOLVED_IN;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = INVOLVABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = INVOLVABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link system.capability.impl.CapabilityDiagramImpl <em>Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see system.capability.impl.CapabilityDiagramImpl
	 * @see system.capability.impl.CapabilityPackageImpl#getCapabilityDiagram()
	 * @generated
	 */
	int CAPABILITY_DIAGRAM = 5;

	/**
	 * The feature id for the '<em><b>Supports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DIAGRAM__SUPPORTS = 0;

	/**
	 * The number of structural features of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DIAGRAM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DIAGRAM_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link system.capability.Capability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability</em>'.
	 * @see system.capability.Capability
	 * @generated
	 */
	EClass getCapability();

	/**
	 * Returns the meta object for the reference list '{@link system.capability.Capability#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Includes</em>'.
	 * @see system.capability.Capability#getIncludes()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_Includes();

	/**
	 * Returns the meta object for the reference '{@link system.capability.Capability#getIsIncludedIn <em>Is Included In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Included In</em>'.
	 * @see system.capability.Capability#getIsIncludedIn()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_IsIncludedIn();

	/**
	 * Returns the meta object for the reference list '{@link system.capability.Capability#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extends</em>'.
	 * @see system.capability.Capability#getExtends()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_Extends();

	/**
	 * Returns the meta object for the reference '{@link system.capability.Capability#getIsExtendedBy <em>Is Extended By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Extended By</em>'.
	 * @see system.capability.Capability#getIsExtendedBy()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_IsExtendedBy();

	/**
	 * Returns the meta object for the reference list '{@link system.capability.Capability#getInvolves <em>Involves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Involves</em>'.
	 * @see system.capability.Capability#getInvolves()
	 * @see #getCapability()
	 * @generated
	 */
	EReference getCapability_Involves();

	/**
	 * Returns the meta object for class '{@link system.capability.SpecializableElement <em>Specializable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specializable Element</em>'.
	 * @see system.capability.SpecializableElement
	 * @generated
	 */
	EClass getSpecializableElement();

	/**
	 * Returns the meta object for the attribute '{@link system.capability.SpecializableElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see system.capability.SpecializableElement#getName()
	 * @see #getSpecializableElement()
	 * @generated
	 */
	EAttribute getSpecializableElement_Name();

	/**
	 * Returns the meta object for the reference '{@link system.capability.SpecializableElement#getSpecializes <em>Specializes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specializes</em>'.
	 * @see system.capability.SpecializableElement#getSpecializes()
	 * @see #getSpecializableElement()
	 * @generated
	 */
	EReference getSpecializableElement_Specializes();

	/**
	 * Returns the meta object for the reference '{@link system.capability.SpecializableElement#getIsSpecializedBy <em>Is Specialized By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Specialized By</em>'.
	 * @see system.capability.SpecializableElement#getIsSpecializedBy()
	 * @see #getSpecializableElement()
	 * @generated
	 */
	EReference getSpecializableElement_IsSpecializedBy();

	/**
	 * Returns the meta object for class '{@link system.capability.InvolvableElement <em>Involvable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Involvable Element</em>'.
	 * @see system.capability.InvolvableElement
	 * @generated
	 */
	EClass getInvolvableElement();

	/**
	 * Returns the meta object for the reference list '{@link system.capability.InvolvableElement#getIsInvolvedIn <em>Is Involved In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Involved In</em>'.
	 * @see system.capability.InvolvableElement#getIsInvolvedIn()
	 * @see #getInvolvableElement()
	 * @generated
	 */
	EReference getInvolvableElement_IsInvolvedIn();

	/**
	 * Returns the meta object for class '{@link system.capability.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see system.capability.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for class '{@link system.capability.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see system.capability.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for class '{@link system.capability.CapabilityDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram</em>'.
	 * @see system.capability.CapabilityDiagram
	 * @generated
	 */
	EClass getCapabilityDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link system.capability.CapabilityDiagram#getSupports <em>Supports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Supports</em>'.
	 * @see system.capability.CapabilityDiagram#getSupports()
	 * @see #getCapabilityDiagram()
	 * @generated
	 */
	EReference getCapabilityDiagram_Supports();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CapabilityFactory getCapabilityFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link system.capability.impl.CapabilityImpl <em>Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see system.capability.impl.CapabilityImpl
		 * @see system.capability.impl.CapabilityPackageImpl#getCapability()
		 * @generated
		 */
		EClass CAPABILITY = eINSTANCE.getCapability();

		/**
		 * The meta object literal for the '<em><b>Includes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__INCLUDES = eINSTANCE.getCapability_Includes();

		/**
		 * The meta object literal for the '<em><b>Is Included In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__IS_INCLUDED_IN = eINSTANCE.getCapability_IsIncludedIn();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__EXTENDS = eINSTANCE.getCapability_Extends();

		/**
		 * The meta object literal for the '<em><b>Is Extended By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__IS_EXTENDED_BY = eINSTANCE.getCapability_IsExtendedBy();

		/**
		 * The meta object literal for the '<em><b>Involves</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY__INVOLVES = eINSTANCE.getCapability_Involves();

		/**
		 * The meta object literal for the '{@link system.capability.impl.SpecializableElementImpl <em>Specializable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see system.capability.impl.SpecializableElementImpl
		 * @see system.capability.impl.CapabilityPackageImpl#getSpecializableElement()
		 * @generated
		 */
		EClass SPECIALIZABLE_ELEMENT = eINSTANCE.getSpecializableElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIALIZABLE_ELEMENT__NAME = eINSTANCE.getSpecializableElement_Name();

		/**
		 * The meta object literal for the '<em><b>Specializes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALIZABLE_ELEMENT__SPECIALIZES = eINSTANCE.getSpecializableElement_Specializes();

		/**
		 * The meta object literal for the '<em><b>Is Specialized By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALIZABLE_ELEMENT__IS_SPECIALIZED_BY = eINSTANCE.getSpecializableElement_IsSpecializedBy();

		/**
		 * The meta object literal for the '{@link system.capability.impl.InvolvableElementImpl <em>Involvable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see system.capability.impl.InvolvableElementImpl
		 * @see system.capability.impl.CapabilityPackageImpl#getInvolvableElement()
		 * @generated
		 */
		EClass INVOLVABLE_ELEMENT = eINSTANCE.getInvolvableElement();

		/**
		 * The meta object literal for the '<em><b>Is Involved In</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOLVABLE_ELEMENT__IS_INVOLVED_IN = eINSTANCE.getInvolvableElement_IsInvolvedIn();

		/**
		 * The meta object literal for the '{@link system.capability.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see system.capability.impl.ActorImpl
		 * @see system.capability.impl.CapabilityPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '{@link system.capability.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see system.capability.impl.EntityImpl
		 * @see system.capability.impl.CapabilityPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '{@link system.capability.impl.CapabilityDiagramImpl <em>Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see system.capability.impl.CapabilityDiagramImpl
		 * @see system.capability.impl.CapabilityPackageImpl#getCapabilityDiagram()
		 * @generated
		 */
		EClass CAPABILITY_DIAGRAM = eINSTANCE.getCapabilityDiagram();

		/**
		 * The meta object literal for the '<em><b>Supports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY_DIAGRAM__SUPPORTS = eINSTANCE.getCapabilityDiagram_Supports();

	}

} //CapabilityPackage
