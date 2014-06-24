/**
 */
package org.xtext.editor.yang.yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Revision Date Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.editor.yang.yang.RevisionDateStatement#getDate <em>Date</em>}</li>
 *   <li>{@link org.xtext.editor.yang.yang.RevisionDateStatement#getRevisiondateunknownstatements <em>Revisiondateunknownstatements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.editor.yang.yang.YangPackage#getRevisionDateStatement()
 * @model
 * @generated
 */
public interface RevisionDateStatement extends ImportSubstatements, IncludeSubstatements
{
  /**
   * Returns the value of the '<em><b>Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Date</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Date</em>' attribute.
   * @see #setDate(String)
   * @see org.xtext.editor.yang.yang.YangPackage#getRevisionDateStatement_Date()
   * @model
   * @generated
   */
  String getDate();

  /**
   * Sets the value of the '{@link org.xtext.editor.yang.yang.RevisionDateStatement#getDate <em>Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Date</em>' attribute.
   * @see #getDate()
   * @generated
   */
  void setDate(String value);

  /**
   * Returns the value of the '<em><b>Revisiondateunknownstatements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.editor.yang.yang.UnknownStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Revisiondateunknownstatements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Revisiondateunknownstatements</em>' containment reference list.
   * @see org.xtext.editor.yang.yang.YangPackage#getRevisionDateStatement_Revisiondateunknownstatements()
   * @model containment="true"
   * @generated
   */
  EList<UnknownStatement> getRevisiondateunknownstatements();

} // RevisionDateStatement
