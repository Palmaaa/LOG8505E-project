/**
 */
package system.capability.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import system.capability.Capability;
import system.capability.CapabilityPackage;
import system.capability.InvolvableElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link system.capability.impl.CapabilityImpl#getIncludes <em>Includes</em>}</li>
 *   <li>{@link system.capability.impl.CapabilityImpl#getIsIncludedIn <em>Is Included In</em>}</li>
 *   <li>{@link system.capability.impl.CapabilityImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link system.capability.impl.CapabilityImpl#getIsExtendedBy <em>Is Extended By</em>}</li>
 *   <li>{@link system.capability.impl.CapabilityImpl#getInvolves <em>Involves</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityImpl extends SpecializableElementImpl implements Capability {
	/**
	 * The cached value of the '{@link #getIncludes() <em>Includes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludes()
	 * @generated
	 * @ordered
	 */
	protected EList<Capability> includes;

	/**
	 * The cached value of the '{@link #getIsIncludedIn() <em>Is Included In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsIncludedIn()
	 * @generated
	 * @ordered
	 */
	protected Capability isIncludedIn;

	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected EList<Capability> extends_;

	/**
	 * The cached value of the '{@link #getIsExtendedBy() <em>Is Extended By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsExtendedBy()
	 * @generated
	 * @ordered
	 */
	protected Capability isExtendedBy;

	/**
	 * The cached value of the '{@link #getInvolves() <em>Involves</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvolves()
	 * @generated
	 * @ordered
	 */
	protected EList<InvolvableElement> involves;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapabilityPackage.Literals.CAPABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Capability> getIncludes() {
		if (includes == null) {
			includes = new EObjectWithInverseResolvingEList<Capability>(Capability.class, this,
					CapabilityPackage.CAPABILITY__INCLUDES, CapabilityPackage.CAPABILITY__IS_INCLUDED_IN);
		}
		return includes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capability getIsIncludedIn() {
		if (isIncludedIn != null && isIncludedIn.eIsProxy()) {
			InternalEObject oldIsIncludedIn = (InternalEObject) isIncludedIn;
			isIncludedIn = (Capability) eResolveProxy(oldIsIncludedIn);
			if (isIncludedIn != oldIsIncludedIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CapabilityPackage.CAPABILITY__IS_INCLUDED_IN, oldIsIncludedIn, isIncludedIn));
			}
		}
		return isIncludedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capability basicGetIsIncludedIn() {
		return isIncludedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsIncludedIn(Capability newIsIncludedIn, NotificationChain msgs) {
		Capability oldIsIncludedIn = isIncludedIn;
		isIncludedIn = newIsIncludedIn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CapabilityPackage.CAPABILITY__IS_INCLUDED_IN, oldIsIncludedIn, newIsIncludedIn);
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
	public void setIsIncludedIn(Capability newIsIncludedIn) {
		if (newIsIncludedIn != isIncludedIn) {
			NotificationChain msgs = null;
			if (isIncludedIn != null)
				msgs = ((InternalEObject) isIncludedIn).eInverseRemove(this, CapabilityPackage.CAPABILITY__INCLUDES,
						Capability.class, msgs);
			if (newIsIncludedIn != null)
				msgs = ((InternalEObject) newIsIncludedIn).eInverseAdd(this, CapabilityPackage.CAPABILITY__INCLUDES,
						Capability.class, msgs);
			msgs = basicSetIsIncludedIn(newIsIncludedIn, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapabilityPackage.CAPABILITY__IS_INCLUDED_IN,
					newIsIncludedIn, newIsIncludedIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Capability> getExtends() {
		if (extends_ == null) {
			extends_ = new EObjectWithInverseResolvingEList<Capability>(Capability.class, this,
					CapabilityPackage.CAPABILITY__EXTENDS, CapabilityPackage.CAPABILITY__IS_EXTENDED_BY);
		}
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capability getIsExtendedBy() {
		if (isExtendedBy != null && isExtendedBy.eIsProxy()) {
			InternalEObject oldIsExtendedBy = (InternalEObject) isExtendedBy;
			isExtendedBy = (Capability) eResolveProxy(oldIsExtendedBy);
			if (isExtendedBy != oldIsExtendedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CapabilityPackage.CAPABILITY__IS_EXTENDED_BY, oldIsExtendedBy, isExtendedBy));
			}
		}
		return isExtendedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capability basicGetIsExtendedBy() {
		return isExtendedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsExtendedBy(Capability newIsExtendedBy, NotificationChain msgs) {
		Capability oldIsExtendedBy = isExtendedBy;
		isExtendedBy = newIsExtendedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CapabilityPackage.CAPABILITY__IS_EXTENDED_BY, oldIsExtendedBy, newIsExtendedBy);
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
	public void setIsExtendedBy(Capability newIsExtendedBy) {
		if (newIsExtendedBy != isExtendedBy) {
			NotificationChain msgs = null;
			if (isExtendedBy != null)
				msgs = ((InternalEObject) isExtendedBy).eInverseRemove(this, CapabilityPackage.CAPABILITY__EXTENDS,
						Capability.class, msgs);
			if (newIsExtendedBy != null)
				msgs = ((InternalEObject) newIsExtendedBy).eInverseAdd(this, CapabilityPackage.CAPABILITY__EXTENDS,
						Capability.class, msgs);
			msgs = basicSetIsExtendedBy(newIsExtendedBy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapabilityPackage.CAPABILITY__IS_EXTENDED_BY,
					newIsExtendedBy, newIsExtendedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InvolvableElement> getInvolves() {
		if (involves == null) {
			involves = new EObjectWithInverseResolvingEList.ManyInverse<InvolvableElement>(InvolvableElement.class,
					this, CapabilityPackage.CAPABILITY__INVOLVES, CapabilityPackage.INVOLVABLE_ELEMENT__IS_INVOLVED_IN);
		}
		return involves;
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
		case CapabilityPackage.CAPABILITY__INCLUDES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIncludes()).basicAdd(otherEnd, msgs);
		case CapabilityPackage.CAPABILITY__IS_INCLUDED_IN:
			if (isIncludedIn != null)
				msgs = ((InternalEObject) isIncludedIn).eInverseRemove(this, CapabilityPackage.CAPABILITY__INCLUDES,
						Capability.class, msgs);
			return basicSetIsIncludedIn((Capability) otherEnd, msgs);
		case CapabilityPackage.CAPABILITY__EXTENDS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getExtends()).basicAdd(otherEnd, msgs);
		case CapabilityPackage.CAPABILITY__IS_EXTENDED_BY:
			if (isExtendedBy != null)
				msgs = ((InternalEObject) isExtendedBy).eInverseRemove(this, CapabilityPackage.CAPABILITY__EXTENDS,
						Capability.class, msgs);
			return basicSetIsExtendedBy((Capability) otherEnd, msgs);
		case CapabilityPackage.CAPABILITY__INVOLVES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getInvolves()).basicAdd(otherEnd, msgs);
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
		case CapabilityPackage.CAPABILITY__INCLUDES:
			return ((InternalEList<?>) getIncludes()).basicRemove(otherEnd, msgs);
		case CapabilityPackage.CAPABILITY__IS_INCLUDED_IN:
			return basicSetIsIncludedIn(null, msgs);
		case CapabilityPackage.CAPABILITY__EXTENDS:
			return ((InternalEList<?>) getExtends()).basicRemove(otherEnd, msgs);
		case CapabilityPackage.CAPABILITY__IS_EXTENDED_BY:
			return basicSetIsExtendedBy(null, msgs);
		case CapabilityPackage.CAPABILITY__INVOLVES:
			return ((InternalEList<?>) getInvolves()).basicRemove(otherEnd, msgs);
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
		case CapabilityPackage.CAPABILITY__INCLUDES:
			return getIncludes();
		case CapabilityPackage.CAPABILITY__IS_INCLUDED_IN:
			if (resolve)
				return getIsIncludedIn();
			return basicGetIsIncludedIn();
		case CapabilityPackage.CAPABILITY__EXTENDS:
			return getExtends();
		case CapabilityPackage.CAPABILITY__IS_EXTENDED_BY:
			if (resolve)
				return getIsExtendedBy();
			return basicGetIsExtendedBy();
		case CapabilityPackage.CAPABILITY__INVOLVES:
			return getInvolves();
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
		case CapabilityPackage.CAPABILITY__INCLUDES:
			getIncludes().clear();
			getIncludes().addAll((Collection<? extends Capability>) newValue);
			return;
		case CapabilityPackage.CAPABILITY__IS_INCLUDED_IN:
			setIsIncludedIn((Capability) newValue);
			return;
		case CapabilityPackage.CAPABILITY__EXTENDS:
			getExtends().clear();
			getExtends().addAll((Collection<? extends Capability>) newValue);
			return;
		case CapabilityPackage.CAPABILITY__IS_EXTENDED_BY:
			setIsExtendedBy((Capability) newValue);
			return;
		case CapabilityPackage.CAPABILITY__INVOLVES:
			getInvolves().clear();
			getInvolves().addAll((Collection<? extends InvolvableElement>) newValue);
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
		case CapabilityPackage.CAPABILITY__INCLUDES:
			getIncludes().clear();
			return;
		case CapabilityPackage.CAPABILITY__IS_INCLUDED_IN:
			setIsIncludedIn((Capability) null);
			return;
		case CapabilityPackage.CAPABILITY__EXTENDS:
			getExtends().clear();
			return;
		case CapabilityPackage.CAPABILITY__IS_EXTENDED_BY:
			setIsExtendedBy((Capability) null);
			return;
		case CapabilityPackage.CAPABILITY__INVOLVES:
			getInvolves().clear();
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
		case CapabilityPackage.CAPABILITY__INCLUDES:
			return includes != null && !includes.isEmpty();
		case CapabilityPackage.CAPABILITY__IS_INCLUDED_IN:
			return isIncludedIn != null;
		case CapabilityPackage.CAPABILITY__EXTENDS:
			return extends_ != null && !extends_.isEmpty();
		case CapabilityPackage.CAPABILITY__IS_EXTENDED_BY:
			return isExtendedBy != null;
		case CapabilityPackage.CAPABILITY__INVOLVES:
			return involves != null && !involves.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CapabilityImpl
