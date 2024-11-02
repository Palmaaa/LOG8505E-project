/**
 */
package system.capability.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import system.capability.CapabilityPackage;
import system.capability.SpecializableElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specializable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link system.capability.impl.SpecializableElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link system.capability.impl.SpecializableElementImpl#getSpecializes <em>Specializes</em>}</li>
 *   <li>{@link system.capability.impl.SpecializableElementImpl#getIsSpecializedBy <em>Is Specialized By</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SpecializableElementImpl extends MinimalEObjectImpl.Container implements SpecializableElement {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSpecializes() <em>Specializes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecializes()
	 * @generated
	 * @ordered
	 */
	protected SpecializableElement specializes;
	/**
	 * The cached value of the '{@link #getIsSpecializedBy() <em>Is Specialized By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSpecializedBy()
	 * @generated
	 * @ordered
	 */
	protected SpecializableElement isSpecializedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecializableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapabilityPackage.Literals.SPECIALIZABLE_ELEMENT;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapabilityPackage.SPECIALIZABLE_ELEMENT__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecializableElement getSpecializes() {
		if (specializes != null && specializes.eIsProxy()) {
			InternalEObject oldSpecializes = (InternalEObject) specializes;
			specializes = (SpecializableElement) eResolveProxy(oldSpecializes);
			if (specializes != oldSpecializes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CapabilityPackage.SPECIALIZABLE_ELEMENT__SPECIALIZES, oldSpecializes, specializes));
			}
		}
		return specializes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecializableElement basicGetSpecializes() {
		return specializes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecializes(SpecializableElement newSpecializes, NotificationChain msgs) {
		SpecializableElement oldSpecializes = specializes;
		specializes = newSpecializes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CapabilityPackage.SPECIALIZABLE_ELEMENT__SPECIALIZES, oldSpecializes, newSpecializes);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecializes(SpecializableElement newSpecializes) {
		if (newSpecializes != specializes) {
			NotificationChain msgs = null;
			if (specializes != null)
				msgs = ((InternalEObject) specializes).eInverseRemove(this,
						CapabilityPackage.SPECIALIZABLE_ELEMENT__IS_SPECIALIZED_BY, SpecializableElement.class, msgs);
			if (newSpecializes != null)
				msgs = ((InternalEObject) newSpecializes).eInverseAdd(this,
						CapabilityPackage.SPECIALIZABLE_ELEMENT__IS_SPECIALIZED_BY, SpecializableElement.class, msgs);
			msgs = basicSetSpecializes(newSpecializes, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapabilityPackage.SPECIALIZABLE_ELEMENT__SPECIALIZES,
					newSpecializes, newSpecializes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecializableElement getIsSpecializedBy() {
		if (isSpecializedBy != null && isSpecializedBy.eIsProxy()) {
			InternalEObject oldIsSpecializedBy = (InternalEObject) isSpecializedBy;
			isSpecializedBy = (SpecializableElement) eResolveProxy(oldIsSpecializedBy);
			if (isSpecializedBy != oldIsSpecializedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CapabilityPackage.SPECIALIZABLE_ELEMENT__IS_SPECIALIZED_BY, oldIsSpecializedBy,
							isSpecializedBy));
			}
		}
		return isSpecializedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecializableElement basicGetIsSpecializedBy() {
		return isSpecializedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsSpecializedBy(SpecializableElement newIsSpecializedBy, NotificationChain msgs) {
		SpecializableElement oldIsSpecializedBy = isSpecializedBy;
		isSpecializedBy = newIsSpecializedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CapabilityPackage.SPECIALIZABLE_ELEMENT__IS_SPECIALIZED_BY, oldIsSpecializedBy, newIsSpecializedBy);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSpecializedBy(SpecializableElement newIsSpecializedBy) {
		if (newIsSpecializedBy != isSpecializedBy) {
			NotificationChain msgs = null;
			if (isSpecializedBy != null)
				msgs = ((InternalEObject) isSpecializedBy).eInverseRemove(this,
						CapabilityPackage.SPECIALIZABLE_ELEMENT__SPECIALIZES, SpecializableElement.class, msgs);
			if (newIsSpecializedBy != null)
				msgs = ((InternalEObject) newIsSpecializedBy).eInverseAdd(this,
						CapabilityPackage.SPECIALIZABLE_ELEMENT__SPECIALIZES, SpecializableElement.class, msgs);
			msgs = basicSetIsSpecializedBy(newIsSpecializedBy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CapabilityPackage.SPECIALIZABLE_ELEMENT__IS_SPECIALIZED_BY, newIsSpecializedBy,
					newIsSpecializedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CapabilityPackage.SPECIALIZABLE_ELEMENT__SPECIALIZES:
			if (specializes != null)
				msgs = ((InternalEObject) specializes).eInverseRemove(this,
						CapabilityPackage.SPECIALIZABLE_ELEMENT__IS_SPECIALIZED_BY, SpecializableElement.class, msgs);
			return basicSetSpecializes((SpecializableElement) otherEnd, msgs);
		case CapabilityPackage.SPECIALIZABLE_ELEMENT__IS_SPECIALIZED_BY:
			if (isSpecializedBy != null)
				msgs = ((InternalEObject) isSpecializedBy).eInverseRemove(this,
						CapabilityPackage.SPECIALIZABLE_ELEMENT__SPECIALIZES, SpecializableElement.class, msgs);
			return basicSetIsSpecializedBy((SpecializableElement) otherEnd, msgs);
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
		case CapabilityPackage.SPECIALIZABLE_ELEMENT__SPECIALIZES:
			return basicSetSpecializes(null, msgs);
		case CapabilityPackage.SPECIALIZABLE_ELEMENT__IS_SPECIALIZED_BY:
			return basicSetIsSpecializedBy(null, msgs);
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
		case CapabilityPackage.SPECIALIZABLE_ELEMENT__NAME:
			return getName();
		case CapabilityPackage.SPECIALIZABLE_ELEMENT__SPECIALIZES:
			if (resolve)
				return getSpecializes();
			return basicGetSpecializes();
		case CapabilityPackage.SPECIALIZABLE_ELEMENT__IS_SPECIALIZED_BY:
			if (resolve)
				return getIsSpecializedBy();
			return basicGetIsSpecializedBy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CapabilityPackage.SPECIALIZABLE_ELEMENT__NAME:
			setName((String) newValue);
			return;
		case CapabilityPackage.SPECIALIZABLE_ELEMENT__SPECIALIZES:
			setSpecializes((SpecializableElement) newValue);
			return;
		case CapabilityPackage.SPECIALIZABLE_ELEMENT__IS_SPECIALIZED_BY:
			setIsSpecializedBy((SpecializableElement) newValue);
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
		case CapabilityPackage.SPECIALIZABLE_ELEMENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case CapabilityPackage.SPECIALIZABLE_ELEMENT__SPECIALIZES:
			setSpecializes((SpecializableElement) null);
			return;
		case CapabilityPackage.SPECIALIZABLE_ELEMENT__IS_SPECIALIZED_BY:
			setIsSpecializedBy((SpecializableElement) null);
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
		case CapabilityPackage.SPECIALIZABLE_ELEMENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case CapabilityPackage.SPECIALIZABLE_ELEMENT__SPECIALIZES:
			return specializes != null;
		case CapabilityPackage.SPECIALIZABLE_ELEMENT__IS_SPECIALIZED_BY:
			return isSpecializedBy != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SpecializableElementImpl
