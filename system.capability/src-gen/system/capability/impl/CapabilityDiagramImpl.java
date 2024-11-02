/**
 */
package system.capability.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import system.capability.CapabilityDiagram;
import system.capability.CapabilityPackage;
import system.capability.SpecializableElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link system.capability.impl.CapabilityDiagramImpl#getSupports <em>Supports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityDiagramImpl extends MinimalEObjectImpl.Container implements CapabilityDiagram {
	/**
	 * The cached value of the '{@link #getSupports() <em>Supports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupports()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecializableElement> supports;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapabilityPackage.Literals.CAPABILITY_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecializableElement> getSupports() {
		if (supports == null) {
			supports = new EObjectContainmentEList<SpecializableElement>(SpecializableElement.class, this,
					CapabilityPackage.CAPABILITY_DIAGRAM__SUPPORTS);
		}
		return supports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CapabilityPackage.CAPABILITY_DIAGRAM__SUPPORTS:
			return ((InternalEList<?>) getSupports()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CapabilityPackage.CAPABILITY_DIAGRAM__SUPPORTS:
			return getSupports();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CapabilityPackage.CAPABILITY_DIAGRAM__SUPPORTS:
			getSupports().clear();
			getSupports().addAll((Collection<? extends SpecializableElement>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case CapabilityPackage.CAPABILITY_DIAGRAM__SUPPORTS:
			getSupports().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case CapabilityPackage.CAPABILITY_DIAGRAM__SUPPORTS:
			return supports != null && !supports.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CapabilityDiagramImpl
