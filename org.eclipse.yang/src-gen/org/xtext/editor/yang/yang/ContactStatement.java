/**
 */
package org.xtext.editor.yang.yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contact Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.editor.yang.yang.ContactStatement#getContact <em>Contact</em>}</li>
 *   <li>{@link org.xtext.editor.yang.yang.ContactStatement#getContactunknownstatements <em>Contactunknownstatements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.editor.yang.yang.YangPackage#getContactStatement()
 * @model
 * @generated
 */
public interface ContactStatement extends ModuleStatement, SubmoduleStatement
{
  /**
   * Returns the value of the '<em><b>Contact</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contact</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contact</em>' attribute.
   * @see #setContact(String)
   * @see org.xtext.editor.yang.yang.YangPackage#getContactStatement_Contact()
   * @model
   * @generated
   */
  String getContact();

  /**
   * Sets the value of the '{@link org.xtext.editor.yang.yang.ContactStatement#getContact <em>Contact</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Contact</em>' attribute.
   * @see #getContact()
   * @generated
   */
  void setContact(String value);

  /**
   * Returns the value of the '<em><b>Contactunknownstatements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.editor.yang.yang.UnknownStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contactunknownstatements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contactunknownstatements</em>' containment reference list.
   * @see org.xtext.editor.yang.yang.YangPackage#getContactStatement_Contactunknownstatements()
   * @model containment="true"
   * @generated
   */
  EList<UnknownStatement> getContactunknownstatements();

} // ContactStatement
