/**
 */
package org.xtext.editor.yang.yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Version Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.editor.yang.yang.YangVersionStatement#getVersion <em>Version</em>}</li>
 *   <li>{@link org.xtext.editor.yang.yang.YangVersionStatement#getYangversionunknownstatements <em>Yangversionunknownstatements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.editor.yang.yang.YangPackage#getYangVersionStatement()
 * @model
 * @generated
 */
public interface YangVersionStatement extends ModuleStatement, SubmoduleStatement
{
  /**
   * Returns the value of the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Version</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version</em>' attribute.
   * @see #setVersion(String)
   * @see org.xtext.editor.yang.yang.YangPackage#getYangVersionStatement_Version()
   * @model
   * @generated
   */
  String getVersion();

  /**
   * Sets the value of the '{@link org.xtext.editor.yang.yang.YangVersionStatement#getVersion <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' attribute.
   * @see #getVersion()
   * @generated
   */
  void setVersion(String value);

  /**
   * Returns the value of the '<em><b>Yangversionunknownstatements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.editor.yang.yang.UnknownStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Yangversionunknownstatements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Yangversionunknownstatements</em>' containment reference list.
   * @see org.xtext.editor.yang.yang.YangPackage#getYangVersionStatement_Yangversionunknownstatements()
   * @model containment="true"
   * @generated
   */
  EList<UnknownStatement> getYangversionunknownstatements();

} // YangVersionStatement
