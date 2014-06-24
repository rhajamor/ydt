/**
 */
package org.xtext.editor.yang.yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deviation Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.editor.yang.yang.DeviationStatement#getArg <em>Arg</em>}</li>
 *   <li>{@link org.xtext.editor.yang.yang.DeviationStatement#getDeviationsubstatements <em>Deviationsubstatements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.editor.yang.yang.YangPackage#getDeviationStatement()
 * @model
 * @generated
 */
public interface DeviationStatement extends ModuleStatement, SubmoduleStatement
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
   * @see org.xtext.editor.yang.yang.YangPackage#getDeviationStatement_Arg()
   * @model
   * @generated
   */
  String getArg();

  /**
   * Sets the value of the '{@link org.xtext.editor.yang.yang.DeviationStatement#getArg <em>Arg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arg</em>' attribute.
   * @see #getArg()
   * @generated
   */
  void setArg(String value);

  /**
   * Returns the value of the '<em><b>Deviationsubstatements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.editor.yang.yang.DeviationSubstatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Deviationsubstatements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Deviationsubstatements</em>' containment reference list.
   * @see org.xtext.editor.yang.yang.YangPackage#getDeviationStatement_Deviationsubstatements()
   * @model containment="true"
   * @generated
   */
  EList<DeviationSubstatement> getDeviationsubstatements();

} // DeviationStatement
