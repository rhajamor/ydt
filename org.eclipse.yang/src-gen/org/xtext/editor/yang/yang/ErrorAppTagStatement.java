/**
 */
package org.xtext.editor.yang.yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error App Tag Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.editor.yang.yang.ErrorAppTagStatement#getArg <em>Arg</em>}</li>
 *   <li>{@link org.xtext.editor.yang.yang.ErrorAppTagStatement#getErroraunknownstatements <em>Erroraunknownstatements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.editor.yang.yang.YangPackage#getErrorAppTagStatement()
 * @model
 * @generated
 */
public interface ErrorAppTagStatement extends MultipleSubstatement
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
   * @see org.xtext.editor.yang.yang.YangPackage#getErrorAppTagStatement_Arg()
   * @model
   * @generated
   */
  String getArg();

  /**
   * Sets the value of the '{@link org.xtext.editor.yang.yang.ErrorAppTagStatement#getArg <em>Arg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arg</em>' attribute.
   * @see #getArg()
   * @generated
   */
  void setArg(String value);

  /**
   * Returns the value of the '<em><b>Erroraunknownstatements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.editor.yang.yang.UnknownStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Erroraunknownstatements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Erroraunknownstatements</em>' containment reference list.
   * @see org.xtext.editor.yang.yang.YangPackage#getErrorAppTagStatement_Erroraunknownstatements()
   * @model containment="true"
   * @generated
   */
  EList<UnknownStatement> getErroraunknownstatements();

} // ErrorAppTagStatement
