/**
 */
package org.xtext.editor.yang.yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.editor.yang.yang.InputStatement#getInputsubstatements <em>Inputsubstatements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.editor.yang.yang.YangPackage#getInputStatement()
 * @model
 * @generated
 */
public interface InputStatement extends RpcSubstatement
{
  /**
   * Returns the value of the '<em><b>Inputsubstatements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.editor.yang.yang.InputSubstatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inputsubstatements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inputsubstatements</em>' containment reference list.
   * @see org.xtext.editor.yang.yang.YangPackage#getInputStatement_Inputsubstatements()
   * @model containment="true"
   * @generated
   */
  EList<InputSubstatement> getInputsubstatements();

} // InputStatement
