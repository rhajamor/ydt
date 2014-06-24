/**
 */
package org.xtext.editor.yang.yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identity Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.editor.yang.yang.IdentityStatement#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.editor.yang.yang.IdentityStatement#getIdentitysubstatements <em>Identitysubstatements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.editor.yang.yang.YangPackage#getIdentityStatement()
 * @model
 * @generated
 */
public interface IdentityStatement extends ModuleStatement, SubmoduleStatement
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.editor.yang.yang.YangPackage#getIdentityStatement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.editor.yang.yang.IdentityStatement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Identitysubstatements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.editor.yang.yang.IdentitySubstatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identitysubstatements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identitysubstatements</em>' containment reference list.
   * @see org.xtext.editor.yang.yang.YangPackage#getIdentityStatement_Identitysubstatements()
   * @model containment="true"
   * @generated
   */
  EList<IdentitySubstatement> getIdentitysubstatements();

} // IdentityStatement
