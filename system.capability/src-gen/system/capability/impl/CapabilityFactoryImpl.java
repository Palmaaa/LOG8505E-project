/**
 */
package system.capability.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import system.capability.*;
import system.capability.Actor;
import system.capability.Capability;
import system.capability.CapabilityFactory;
import system.capability.CapabilityPackage;
import system.capability.Entity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CapabilityFactoryImpl extends EFactoryImpl implements CapabilityFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CapabilityFactory init() {
		try {
			CapabilityFactory theCapabilityFactory = (CapabilityFactory) EPackage.Registry.INSTANCE
					.getEFactory(CapabilityPackage.eNS_URI);
			if (theCapabilityFactory != null) {
				return theCapabilityFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CapabilityFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityFactoryImpl() {
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
		case CapabilityPackage.CAPABILITY:
			return createCapability();
		case CapabilityPackage.ACTOR:
			return createActor();
		case CapabilityPackage.ENTITY:
			return createEntity();
		case CapabilityPackage.CAPABILITY_DIAGRAM:
			return createCapabilityDiagram();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capability createCapability() {
		CapabilityImpl capability = new CapabilityImpl();
		return capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityDiagram createCapabilityDiagram() {
		CapabilityDiagramImpl capabilityDiagram = new CapabilityDiagramImpl();
		return capabilityDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityPackage getCapabilityPackage() {
		return (CapabilityPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CapabilityPackage getPackage() {
		return CapabilityPackage.eINSTANCE;
	}

} //CapabilityFactoryImpl
