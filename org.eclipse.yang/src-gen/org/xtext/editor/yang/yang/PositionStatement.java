/**
 */
package org.xtext.editor.yang.yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Position Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.editor.yang.yang.PositionStatement#getIntarg <em>Intarg</em>}</li>
 *   <li>{@link org.xtext.editor.yang.yang.PositionStatement#getPositionunknownstatements <em>Positionunknownstatements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.editor.yang.yang.YangPackage#getPositionStatement()
 * @model
 * @generated
 */
public interface PositionStatement extends BitSubstatement
{
  /**
   * Returns the value of the '<em><b>Intarg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Intarg</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Intarg</em>' attribute.
   * @see #setIntarg(String)
   * @see org.xtext.editor.yang.yang.YangPackage#getPositionStatement_Intarg()
   * @model
   * @generated
   */
  String getIntarg();

  /**
   * Sets the value of the '{@link org.xtext.editor.yang.yang.PositionStatement#getIntarg <em>Intarg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Intarg</em>' attribute.
   * @see #getIntarg()
   * @generated
   */
  void setIntarg(String value);

  /**
   * Returns the value of the '<em><b>Positionunknownstatements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.editor.yang.yang.UnknownStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Positionunknownstatements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Positionunknownstatements</em>' containment reference list.
   * @see org.xtext.editor.yang.yang.YangPackage#getPositionStatement_Positionunknownstatements()
   * @model containment="true"
   * @generated
   */
  EList<UnknownStatement> getPositionunknownstatements();

} // PositionStatement
