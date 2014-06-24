/**
 */
package org.xtext.editor.yang.yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Leaf List Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.editor.yang.yang.LeafListStatement#getArg <em>Arg</em>}</li>
 *   <li>{@link org.xtext.editor.yang.yang.LeafListStatement#getLeaflistsubstatements <em>Leaflistsubstatements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.editor.yang.yang.YangPackage#getLeafListStatement()
 * @model
 * @generated
 */
public interface LeafListStatement extends DatadefStatement, ChoiceSubstatement
{
  /**
   * Returns the value of the '<em><b>Arg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arg</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arg</em>' attribute.
   * @see #setArg(String)
   * @see org.xtext.editor.yang.yang.YangPackage#getLeafListStatement_Arg()
   * @model
   * @generated
   */
  String getArg();

  /**
   * Sets the value of the '{@link org.xtext.editor.yang.yang.LeafListStatement#getArg <em>Arg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arg</em>' attribute.
   * @see #getArg()
   * @generated
   */
  void setArg(String value);

  /**
   * Returns the value of the '<em><b>Leaflistsubstatements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.editor.yang.yang.LeafListSubstatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Leaflistsubstatements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Leaflistsubstatements</em>' containment reference list.
   * @see org.xtext.editor.yang.yang.YangPackage#getLeafListStatement_Leaflistsubstatements()
   * @model containment="true"
   * @generated
   */
  EList<LeafListSubstatement> getLeaflistsubstatements();

} // LeafListStatement
