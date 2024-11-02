/**
 */
package system.capability.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import system.capability.Capability;
import system.capability.CapabilityPackage;
import system.capability.InvolvableElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Involvable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link system.capability.impl.InvolvableElementImpl#getIsInvolvedIn <em>Is Involved In</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InvolvableElementImpl extends SpecializableElementImpl implements InvolvableElement {
	/**
	 * The cached value of the '{@link #getIsInvolvedIn() <em>Is Involved In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsInvolvedIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Capability> isInvolvedIn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvolvableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapabilityPackage.Literals.INVOLVABLE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Capability> getIsInvolvedIn() {
		if (isInvolvedIn == null) {
			isInvolvedIn = new EObjectWithInverseResolvingEList.ManyInverse<Capability>(Capability.class, this,
					CapabilityPackage.INVOLVABLE_ELEMENT__IS_INVOLVED_IN, CapabilityPackage.CAPABILITY__INVOLVES);
		}
		return isInvolvedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CapabilityPackage.INVOLVABLE_ELEMENT__IS_INVOLVED_IN:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIsInvolvedIn()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CapabilityPackage.INVOLVABLE_ELEMENT__IS_INVOLVED_IN:
			return ((InternalEList<?>) getIsInvolvedIn()).basicRemove(otherEnd, msgs);
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
		case CapabilityPackage.INVOLVABLE_ELEMENT__IS_INVOLVED_IN:
			return getIsInvolvedIn();
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
		case CapabilityPackage.INVOLVABLE_ELEMENT__IS_INVOLVED_IN:
			getIsInvolvedIn().clear();
			getIsInvolvedIn().addAll((Collection<? extends Capability>) newValue);
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
		case CapabilityPackage.INVOLVABLE_ELEMENT__IS_INVOLVED_IN:
			getIsInvolvedIn().clear();
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
		case CapabilityPackage.INVOLVABLE_ELEMENT__IS_INVOLVED_IN:
			return isInvolvedIn != null && !isInvolvedIn.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InvolvableElementImpl
