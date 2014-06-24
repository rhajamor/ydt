/**
 */
package org.xtext.editor.yang.yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organization Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.editor.yang.yang.OrganizationStatement#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.xtext.editor.yang.yang.OrganizationStatement#getOrganizationunknownstatements <em>Organizationunknownstatements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.editor.yang.yang.YangPackage#getOrganizationStatement()
 * @model
 * @generated
 */
public interface OrganizationStatement extends ModuleStatement, SubmoduleStatement
{
  /**
   * Returns the value of the '<em><b>Organization</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Organization</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Organization</em>' attribute.
   * @see #setOrganization(String)
   * @see org.xtext.editor.yang.yang.YangPackage#getOrganizationStatement_Organization()
   * @model
   * @generated
   */
  String getOrganization();

  /**
   * Sets the value of the '{@link org.xtext.editor.yang.yang.OrganizationStatement#getOrganization <em>Organization</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Organization</em>' attribute.
   * @see #getOrganization()
   * @generated
   */
  void setOrganization(String value);

  /**
   * Returns the value of the '<em><b>Organizationunknownstatements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.editor.yang.yang.UnknownStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Organizationunknownstatements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Organizationunknownstatements</em>' containment reference list.
   * @see org.xtext.editor.yang.yang.YangPackage#getOrganizationStatement_Organizationunknownstatements()
   * @model containment="true"
   * @generated
   */
  EList<UnknownStatement> getOrganizationunknownstatements();

} // OrganizationStatement
