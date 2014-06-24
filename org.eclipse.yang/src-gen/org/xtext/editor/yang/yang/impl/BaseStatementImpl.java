/**
 */
package org.xtext.editor.yang.yang.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.editor.yang.yang.BaseStatement;
import org.xtext.editor.yang.yang.IdentityStatement;
import org.xtext.editor.yang.yang.UnknownStatement;
import org.xtext.editor.yang.yang.YangPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.editor.yang.yang.impl.BaseStatementImpl#getPref <em>Pref</em>}</li>
 *   <li>{@link org.xtext.editor.yang.yang.impl.BaseStatementImpl#getIdent <em>Ident</em>}</li>
 *   <li>{@link org.xtext.editor.yang.yang.impl.BaseStatementImpl#getBaseunknownstatements <em>Baseunknownstatements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BaseStatementImpl extends IdentitySubstatementImpl implements BaseStatement
{
  /**
   * The default value of the '{@link #getPref() <em>Pref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPref()
   * @generated
   * @ordered
   */
  protected static final String PREF_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPref() <em>Pref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPref()
   * @generated
   * @ordered
   */
  protected String pref = PREF_EDEFAULT;

  /**
   * The cached value of the '{@link #getIdent() <em>Ident</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdent()
   * @generated
   * @ordered
   */
  protected IdentityStatement ident;

  /**
   * The cached value of the '{@link #getBaseunknownstatements() <em>Baseunknownstatements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBaseunknownstatements()
   * @generated
   * @ordered
   */
  protected EList<UnknownStatement> baseunknownstatements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BaseStatementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return YangPackage.eINSTANCE.getBaseStatement();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPref()
  {
    return pref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPref(String newPref)
  {
    String oldPref = pref;
    pref = newPref;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, YangPackage.BASE_STATEMENT__PREF, oldPref, pref));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdentityStatement getIdent()
  {
    if (ident != null && ident.eIsProxy())
    {
      InternalEObject oldIdent = (InternalEObject)ident;
      ident = (IdentityStatement)eResolveProxy(oldIdent);
      if (ident != oldIdent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, YangPackage.BASE_STATEMENT__IDENT, oldIdent, ident));
      }
    }
    return ident;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdentityStatement basicGetIdent()
  {
    return ident;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdent(IdentityStatement newIdent)
  {
    IdentityStatement oldIdent = ident;
    ident = newIdent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, YangPackage.BASE_STATEMENT__IDENT, oldIdent, ident));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UnknownStatement> getBaseunknownstatements()
  {
    if (baseunknownstatements == null)
    {
      baseunknownstatements = new EObjectContainmentEList<UnknownStatement>(UnknownStatement.class, this, YangPackage.BASE_STATEMENT__BASEUNKNOWNSTATEMENTS);
    }
    return baseunknownstatements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case YangPackage.BASE_STATEMENT__BASEUNKNOWNSTATEMENTS:
        return ((InternalEList<?>)getBaseunknownstatements()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case YangPackage.BASE_STATEMENT__PREF:
        return getPref();
      case YangPackage.BASE_STATEMENT__IDENT:
        if (resolve) return getIdent();
        return basicGetIdent();
      case YangPackage.BASE_STATEMENT__BASEUNKNOWNSTATEMENTS:
        return getBaseunknownstatements();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case YangPackage.BASE_STATEMENT__PREF:
        setPref((String)newValue);
        return;
      case YangPackage.BASE_STATEMENT__IDENT:
        setIdent((IdentityStatement)newValue);
        return;
      case YangPackage.BASE_STATEMENT__BASEUNKNOWNSTATEMENTS:
        getBaseunknownstatements().clear();
        getBaseunknownstatements().addAll((Collection<? extends UnknownStatement>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case YangPackage.BASE_STATEMENT__PREF:
        setPref(PREF_EDEFAULT);
        return;
      case YangPackage.BASE_STATEMENT__IDENT:
        setIdent((IdentityStatement)null);
        return;
      case YangPackage.BASE_STATEMENT__BASEUNKNOWNSTATEMENTS:
        getBaseunknownstatements().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case YangPackage.BASE_STATEMENT__PREF:
        return PREF_EDEFAULT == null ? pref != null : !PREF_EDEFAULT.equals(pref);
      case YangPackage.BASE_STATEMENT__IDENT:
        return ident != null;
      case YangPackage.BASE_STATEMENT__BASEUNKNOWNSTATEMENTS:
        return baseunknownstatements != null && !baseunknownstatements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (pref: ");
    result.append(pref);
    result.append(')');
    return result.toString();
  }

} //BaseStatementImpl
