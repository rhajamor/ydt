/**
 */
package org.xtext.editor.yang.yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.editor.yang.yang.OutputStatement#getOutputsubstatements <em>Outputsubstatements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.editor.yang.yang.YangPackage#getOutputStatement()
 * @model
 * @generated
 */
public interface OutputStatement extends RpcSubstatement
{
  /**
   * Returns the value of the '<em><b>Outputsubstatements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.editor.yang.yang.OutputSubstatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Outputsubstatements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outputsubstatements</em>' containment reference list.
   * @see org.xtext.editor.yang.yang.YangPackage#getOutputStatement_Outputsubstatements()
   * @model containment="true"
   * @generated
   */
  EList<OutputSubstatement> getOutputsubstatements();

} // OutputStatement
