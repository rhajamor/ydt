/**
 */
package org.xtext.editor.yang.yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Include Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.editor.yang.yang.IncludeStatement#getImportURI <em>Import URI</em>}</li>
 *   <li>{@link org.xtext.editor.yang.yang.IncludeStatement#getIncludesubstatements <em>Includesubstatements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.editor.yang.yang.YangPackage#getIncludeStatement()
 * @model
 * @generated
 */
public interface IncludeStatement extends ModuleStatement, SubmoduleStatement
{
  /**
   * Returns the value of the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Import URI</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Import URI</em>' attribute.
   * @see #setImportURI(String)
   * @see org.xtext.editor.yang.yang.YangPackage#getIncludeStatement_ImportURI()
   * @model
   * @generated
   */
  String getImportURI();

  /**
   * Sets the value of the '{@link org.xtext.editor.yang.yang.IncludeStatement#getImportURI <em>Import URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Import URI</em>' attribute.
   * @see #getImportURI()
   * @generated
   */
  void setImportURI(String value);

  /**
   * Returns the value of the '<em><b>Includesubstatements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.editor.yang.yang.IncludeSubstatements}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Includesubstatements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Includesubstatements</em>' containment reference list.
   * @see org.xtext.editor.yang.yang.YangPackage#getIncludeStatement_Includesubstatements()
   * @model containment="true"
   * @generated
   */
  EList<IncludeSubstatements> getIncludesubstatements();

} // IncludeStatement
