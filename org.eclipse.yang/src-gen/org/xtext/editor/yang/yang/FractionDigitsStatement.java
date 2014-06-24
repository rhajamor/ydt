/**
 */
package org.xtext.editor.yang.yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fraction Digits Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.editor.yang.yang.FractionDigitsStatement#getArg <em>Arg</em>}</li>
 *   <li>{@link org.xtext.editor.yang.yang.FractionDigitsStatement#getFractiondigitsunknownstatements <em>Fractiondigitsunknownstatements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.editor.yang.yang.YangPackage#getFractionDigitsStatement()
 * @model
 * @generated
 */
public interface FractionDigitsStatement extends TypeSubStatement
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
   * @see org.xtext.editor.yang.yang.YangPackage#getFractionDigitsStatement_Arg()
   * @model
   * @generated
   */
  String getArg();

  /**
   * Sets the value of the '{@link org.xtext.editor.yang.yang.FractionDigitsStatement#getArg <em>Arg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arg</em>' attribute.
   * @see #getArg()
   * @generated
   */
  void setArg(String value);

  /**
   * Returns the value of the '<em><b>Fractiondigitsunknownstatements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.editor.yang.yang.UnknownStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fractiondigitsunknownstatements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fractiondigitsunknownstatements</em>' containment reference list.
   * @see org.xtext.editor.yang.yang.YangPackage#getFractionDigitsStatement_Fractiondigitsunknownstatements()
   * @model containment="true"
   * @generated
   */
  EList<UnknownStatement> getFractiondigitsunknownstatements();

} // FractionDigitsStatement
