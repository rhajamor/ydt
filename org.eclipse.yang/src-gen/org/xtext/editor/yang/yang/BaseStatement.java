/**
 */
package org.xtext.editor.yang.yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.editor.yang.yang.BaseStatement#getPref <em>Pref</em>}</li>
 *   <li>{@link org.xtext.editor.yang.yang.BaseStatement#getIdent <em>Ident</em>}</li>
 *   <li>{@link org.xtext.editor.yang.yang.BaseStatement#getBaseunknownstatements <em>Baseunknownstatements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.editor.yang.yang.YangPackage#getBaseStatement()
 * @model
 * @generated
 */
public interface BaseStatement extends IdentitySubstatement, TypeSubStatement
{
  /**
   * Returns the value of the '<em><b>Pref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pref</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pref</em>' attribute.
   * @see #setPref(String)
   * @see org.xtext.editor.yang.yang.YangPackage#getBaseStatement_Pref()
   * @model
   * @generated
   */
  String getPref();

  /**
   * Sets the value of the '{@link org.xtext.editor.yang.yang.BaseStatement#getPref <em>Pref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pref</em>' attribute.
   * @see #getPref()
   * @generated
   */
  void setPref(String value);

  /**
   * Returns the value of the '<em><b>Ident</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ident</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ident</em>' reference.
   * @see #setIdent(IdentityStatement)
   * @see org.xtext.editor.yang.yang.YangPackage#getBaseStatement_Ident()
   * @model
   * @generated
   */
  IdentityStatement getIdent();

  /**
   * Sets the value of the '{@link org.xtext.editor.yang.yang.BaseStatement#getIdent <em>Ident</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ident</em>' reference.
   * @see #getIdent()
   * @generated
   */
  void setIdent(IdentityStatement value);

  /**
   * Returns the value of the '<em><b>Baseunknownstatements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.editor.yang.yang.UnknownStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Baseunknownstatements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Baseunknownstatements</em>' containment reference list.
   * @see org.xtext.editor.yang.yang.YangPackage#getBaseStatement_Baseunknownstatements()
   * @model containment="true"
   * @generated
   */
  EList<UnknownStatement> getBaseunknownstatements();

} // BaseStatement
