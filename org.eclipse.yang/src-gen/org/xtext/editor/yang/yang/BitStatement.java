/**
 */
package org.xtext.editor.yang.yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bit Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.editor.yang.yang.BitStatement#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.editor.yang.yang.BitStatement#getBitsubstatements <em>Bitsubstatements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.editor.yang.yang.YangPackage#getBitStatement()
 * @model
 * @generated
 */
public interface BitStatement extends TypeSubStatement
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
   * @see org.xtext.editor.yang.yang.YangPackage#getBitStatement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.editor.yang.yang.BitStatement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Bitsubstatements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.editor.yang.yang.BitSubstatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bitsubstatements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bitsubstatements</em>' containment reference list.
   * @see org.xtext.editor.yang.yang.YangPackage#getBitStatement_Bitsubstatements()
   * @model containment="true"
   * @generated
   */
  EList<BitSubstatement> getBitsubstatements();

} // BitStatement
