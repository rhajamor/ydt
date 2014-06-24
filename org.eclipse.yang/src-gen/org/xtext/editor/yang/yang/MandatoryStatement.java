/**
 */
package org.xtext.editor.yang.yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mandatory Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.editor.yang.yang.MandatoryStatement#getBoolarg <em>Boolarg</em>}</li>
 *   <li>{@link org.xtext.editor.yang.yang.MandatoryStatement#getMandatoryunknownstatements <em>Mandatoryunknownstatements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.editor.yang.yang.YangPackage#getMandatoryStatement()
 * @model
 * @generated
 */
public interface MandatoryStatement extends LeafSubstatement, ChoiceSubstatement, AnyxmlSubstatement, RefineSubstatement, DeviateSubstatement
{
  /**
   * Returns the value of the '<em><b>Boolarg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Boolarg</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Boolarg</em>' attribute.
   * @see #setBoolarg(String)
   * @see org.xtext.editor.yang.yang.YangPackage#getMandatoryStatement_Boolarg()
   * @model
   * @generated
   */
  String getBoolarg();

  /**
   * Sets the value of the '{@link org.xtext.editor.yang.yang.MandatoryStatement#getBoolarg <em>Boolarg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Boolarg</em>' attribute.
   * @see #getBoolarg()
   * @generated
   */
  void setBoolarg(String value);

  /**
   * Returns the value of the '<em><b>Mandatoryunknownstatements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.editor.yang.yang.UnknownStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mandatoryunknownstatements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mandatoryunknownstatements</em>' containment reference list.
   * @see org.xtext.editor.yang.yang.YangPackage#getMandatoryStatement_Mandatoryunknownstatements()
   * @model containment="true"
   * @generated
   */
  EList<UnknownStatement> getMandatoryunknownstatements();

} // MandatoryStatement
