/**
 */
package org.xtext.editor.yang.yang;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.editor.yang.yang.YangFactory
 * @model kind="package"
 * @generated
 */
public interface YangPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "yang";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/yang/Yang";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "yang";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  YangPackage eINSTANCE = org.xtext.editor.yang.yang.impl.YangPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.YangFileImpl <em>File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.YangFileImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getYangFile()
   * @generated
   */
  int YANG_FILE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int YANG_FILE__NAME = 0;

  /**
   * The number of structural features of the '<em>File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int YANG_FILE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.ModuleImpl <em>Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.ModuleImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getModule()
   * @generated
   */
  int MODULE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__NAME = YANG_FILE__NAME;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__STATEMENTS = YANG_FILE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_FEATURE_COUNT = YANG_FILE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.ModuleStatementImpl <em>Module Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.ModuleStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getModuleStatement()
   * @generated
   */
  int MODULE_STATEMENT = 2;

  /**
   * The number of structural features of the '<em>Module Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.SubModuleImpl <em>Sub Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.SubModuleImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getSubModule()
   * @generated
   */
  int SUB_MODULE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_MODULE__NAME = YANG_FILE__NAME;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_MODULE__STATEMENTS = YANG_FILE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Sub Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_MODULE_FEATURE_COUNT = YANG_FILE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.SubmoduleStatementImpl <em>Submodule Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.SubmoduleStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getSubmoduleStatement()
   * @generated
   */
  int SUBMODULE_STATEMENT = 4;

  /**
   * The number of structural features of the '<em>Submodule Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBMODULE_STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.DatadefStatementImpl <em>Datadef Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.DatadefStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getDatadefStatement()
   * @generated
   */
  int DATADEF_STATEMENT = 5;

  /**
   * The number of structural features of the '<em>Datadef Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATADEF_STATEMENT_FEATURE_COUNT = MODULE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.YangVersionStatementImpl <em>Version Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.YangVersionStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getYangVersionStatement()
   * @generated
   */
  int YANG_VERSION_STATEMENT = 6;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int YANG_VERSION_STATEMENT__VERSION = MODULE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Yangversionunknownstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int YANG_VERSION_STATEMENT__YANGVERSIONUNKNOWNSTATEMENTS = MODULE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Version Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int YANG_VERSION_STATEMENT_FEATURE_COUNT = MODULE_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.OrganizationStatementImpl <em>Organization Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.OrganizationStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getOrganizationStatement()
   * @generated
   */
  int ORGANIZATION_STATEMENT = 7;

  /**
   * The feature id for the '<em><b>Organization</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGANIZATION_STATEMENT__ORGANIZATION = MODULE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Organizationunknownstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGANIZATION_STATEMENT__ORGANIZATIONUNKNOWNSTATEMENTS = MODULE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Organization Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGANIZATION_STATEMENT_FEATURE_COUNT = MODULE_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.ContactStatementImpl <em>Contact Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.ContactStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getContactStatement()
   * @generated
   */
  int CONTACT_STATEMENT = 8;

  /**
   * The feature id for the '<em><b>Contact</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTACT_STATEMENT__CONTACT = MODULE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Contactunknownstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTACT_STATEMENT__CONTACTUNKNOWNSTATEMENTS = MODULE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Contact Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTACT_STATEMENT_FEATURE_COUNT = MODULE_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.DescriptionStatementImpl <em>Description Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.DescriptionStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getDescriptionStatement()
   * @generated
   */
  int DESCRIPTION_STATEMENT = 9;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION_STATEMENT__DESCRIPTION = MODULE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Descriptionunknownstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION_STATEMENT__DESCRIPTIONUNKNOWNSTATEMENTS = MODULE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Description Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION_STATEMENT_FEATURE_COUNT = MODULE_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.MultipleSubstatementImpl <em>Multiple Substatement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.MultipleSubstatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getMultipleSubstatement()
   * @generated
   */
  int MULTIPLE_SUBSTATEMENT = 41;

  /**
   * The number of structural features of the '<em>Multiple Substatement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLE_SUBSTATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.ReferenceStatementImpl <em>Reference Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.ReferenceStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getReferenceStatement()
   * @generated
   */
  int REFERENCE_STATEMENT = 10;

  /**
   * The feature id for the '<em><b>Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_STATEMENT__REFERENCE = MULTIPLE_SUBSTATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Referenceunknownstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_STATEMENT__REFERENCEUNKNOWNSTATEMENTS = MULTIPLE_SUBSTATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Reference Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_STATEMENT_FEATURE_COUNT = MULTIPLE_SUBSTATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.NamespaceStatementImpl <em>Namespace Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.NamespaceStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getNamespaceStatement()
   * @generated
   */
  int NAMESPACE_STATEMENT = 11;

  /**
   * The feature id for the '<em><b>Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_STATEMENT__URI = MODULE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Namespaceunknownstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_STATEMENT__NAMESPACEUNKNOWNSTATEMENTS = MODULE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Namespace Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_STATEMENT_FEATURE_COUNT = MODULE_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.PrefixStatementImpl <em>Prefix Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.PrefixStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getPrefixStatement()
   * @generated
   */
  int PREFIX_STATEMENT = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX_STATEMENT__NAME = MODULE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Prefixunknownstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX_STATEMENT__PREFIXUNKNOWNSTATEMENTS = MODULE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Prefix Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX_STATEMENT_FEATURE_COUNT = MODULE_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.TypeSubStatementImpl <em>Type Sub Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.TypeSubStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getTypeSubStatement()
   * @generated
   */
  int TYPE_SUB_STATEMENT = 90;

  /**
   * The number of structural features of the '<em>Type Sub Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_SUB_STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.RequireInstanceStatementImpl <em>Require Instance Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.RequireInstanceStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getRequireInstanceStatement()
   * @generated
   */
  int REQUIRE_INSTANCE_STATEMENT = 13;

  /**
   * The feature id for the '<em><b>Require</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRE_INSTANCE_STATEMENT__REQUIRE = TYPE_SUB_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Requireunknownstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRE_INSTANCE_STATEMENT__REQUIREUNKNOWNSTATEMENTS = TYPE_SUB_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Require Instance Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRE_INSTANCE_STATEMENT_FEATURE_COUNT = TYPE_SUB_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.PathStatementImpl <em>Path Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.PathStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getPathStatement()
   * @generated
   */
  int PATH_STATEMENT = 14;

  /**
   * The feature id for the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_STATEMENT__PATH = TYPE_SUB_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Pathunknownstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_STATEMENT__PATHUNKNOWNSTATEMENTS = TYPE_SUB_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Path Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_STATEMENT_FEATURE_COUNT = TYPE_SUB_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.BitSubstatementImpl <em>Bit Substatement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.BitSubstatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getBitSubstatement()
   * @generated
   */
  int BIT_SUBSTATEMENT = 92;

  /**
   * The number of structural features of the '<em>Bit Substatement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIT_SUBSTATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.PositionStatementImpl <em>Position Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.PositionStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getPositionStatement()
   * @generated
   */
  int POSITION_STATEMENT = 15;

  /**
   * The feature id for the '<em><b>Intarg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITION_STATEMENT__INTARG = BIT_SUBSTATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Positionunknownstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITION_STATEMENT__POSITIONUNKNOWNSTATEMENTS = BIT_SUBSTATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Position Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITION_STATEMENT_FEATURE_COUNT = BIT_SUBSTATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.EnumSubstatementImpl <em>Enum Substatement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.EnumSubstatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getEnumSubstatement()
   * @generated
   */
  int ENUM_SUBSTATEMENT = 94;

  /**
   * The number of structural features of the '<em>Enum Substatement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_SUBSTATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.ValueStatementImpl <em>Value Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.ValueStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getValueStatement()
   * @generated
   */
  int VALUE_STATEMENT = 16;

  /**
   * The feature id for the '<em><b>Intarg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_STATEMENT__INTARG = ENUM_SUBSTATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Valueunknownstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_STATEMENT__VALUEUNKNOWNSTATEMENTS = ENUM_SUBSTATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Value Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_STATEMENT_FEATURE_COUNT = ENUM_SUBSTATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.ErrorAppTagStatementImpl <em>Error App Tag Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.ErrorAppTagStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getErrorAppTagStatement()
   * @generated
   */
  int ERROR_APP_TAG_STATEMENT = 17;

  /**
   * The feature id for the '<em><b>Arg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_APP_TAG_STATEMENT__ARG = MULTIPLE_SUBSTATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Erroraunknownstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_APP_TAG_STATEMENT__ERRORAUNKNOWNSTATEMENTS = MULTIPLE_SUBSTATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Error App Tag Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_APP_TAG_STATEMENT_FEATURE_COUNT = MULTIPLE_SUBSTATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.ErrorMessageStatementImpl <em>Error Message Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.ErrorMessageStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getErrorMessageStatement()
   * @generated
   */
  int ERROR_MESSAGE_STATEMENT = 18;

  /**
   * The feature id for the '<em><b>Arg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_MESSAGE_STATEMENT__ARG = MULTIPLE_SUBSTATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Errormunknownstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_MESSAGE_STATEMENT__ERRORMUNKNOWNSTATEMENTS = MULTIPLE_SUBSTATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Error Message Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_MESSAGE_STATEMENT_FEATURE_COUNT = MULTIPLE_SUBSTATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.LeafSubstatementImpl <em>Leaf Substatement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.LeafSubstatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getLeafSubstatement()
   * @generated
   */
  int LEAF_SUBSTATEMENT = 57;

  /**
   * The number of structural features of the '<em>Leaf Substatement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEAF_SUBSTATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.UnitsStatementImpl <em>Units Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.UnitsStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getUnitsStatement()
   * @generated
   */
  int UNITS_STATEMENT = 19;

  /**
   * The feature id for the '<em><b>Arg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNITS_STATEMENT__ARG = LEAF_SUBSTATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Unitsunknownstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNITS_STATEMENT__UNITSUNKNOWNSTATEMENTS = LEAF_SUBSTATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Units Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNITS_STATEMENT_FEATURE_COUNT = LEAF_SUBSTATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.DefaultStatementImpl <em>Default Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.DefaultStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getDefaultStatement()
   * @generated
   */
  int DEFAULT_STATEMENT = 20;

  /**
   * The feature id for the '<em><b>Arg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_STATEMENT__ARG = LEAF_SUBSTATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Defaultunknownstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_STATEMENT__DEFAULTUNKNOWNSTATEMENTS = LEAF_SUBSTATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Default Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_STATEMENT_FEATURE_COUNT = LEAF_SUBSTATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.RpcSubstatementImpl <em>Rpc Substatement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.RpcSubstatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getRpcSubstatement()
   * @generated
   */
  int RPC_SUBSTATEMENT = 43;

  /**
   * The number of structural features of the '<em>Rpc Substatement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RPC_SUBSTATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.StatusStatementImpl <em>Status Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.StatusStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getStatusStatement()
   * @generated
   */
  int STATUS_STATEMENT = 21;

  /**
   * The feature id for the '<em><b>Status</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATUS_STATEMENT__STATUS = RPC_SUBSTATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Statusunknownstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATUS_STATEMENT__STATUSUNKNOWNSTATEMENTS = RPC_SUBSTATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Status Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATUS_STATEMENT_FEATURE_COUNT = RPC_SUBSTATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.ImportSubstatementsImpl <em>Import Substatements</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.ImportSubstatementsImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getImportSubstatements()
   * @generated
   */
  int IMPORT_SUBSTATEMENTS = 96;

  /**
   * The number of structural features of the '<em>Import Substatements</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_SUBSTATEMENTS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.RevisionDateStatementImpl <em>Revision Date Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.RevisionDateStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getRevisionDateStatement()
   * @generated
   */
  int REVISION_DATE_STATEMENT = 22;

  /**
   * The feature id for the '<em><b>Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REVISION_DATE_STATEMENT__DATE = IMPORT_SUBSTATEMENTS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Revisiondateunknownstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REVISION_DATE_STATEMENT__REVISIONDATEUNKNOWNSTATEMENTS = IMPORT_SUBSTATEMENTS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Revision Date Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REVISION_DATE_STATEMENT_FEATURE_COUNT = IMPORT_SUBSTATEMENTS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.ListSubstatementImpl <em>List Substatement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.ListSubstatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getListSubstatement()
   * @generated
   */
  int LIST_SUBSTATEMENT = 53;

  /**
   * The number of structural features of the '<em>List Substatement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_SUBSTATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.UniqueStatementImpl <em>Unique Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.UniqueStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getUniqueStatement()
   * @generated
   */
  int UNIQUE_STATEMENT = 23;

  /**
   * The feature id for the '<em><b>Arg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIQUE_STATEMENT__ARG = LIST_SUBSTATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Uniqueunknownstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIQUE_STATEMENT__UNIQUEUNKNOWNSTATEMENTS = LIST_SUBSTATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Unique Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIQUE_STATEMENT_FEATURE_COUNT = LIST_SUBSTATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.KeyStatementImpl <em>Key Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.KeyStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getKeyStatement()
   * @generated
   */
  int KEY_STATEMENT = 24;

  /**
   * The feature id for the '<em><b>Arg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_STATEMENT__ARG = LIST_SUBSTATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Keyunknownstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_STATEMENT__KEYUNKNOWNSTATEMENTS = LIST_SUBSTATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Key Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_STATEMENT_FEATURE_COUNT = LIST_SUBSTATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.OrderedbyStatementImpl <em>Orderedby Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.OrderedbyStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getOrderedbyStatement()
   * @generated
   */
  int ORDEREDBY_STATEMENT = 25;

  /**
   * The feature id for the '<em><b>Arg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDEREDBY_STATEMENT__ARG = LIST_SUBSTATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Orderedbyunknownstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDEREDBY_STATEMENT__ORDEREDBYUNKNOWNSTATEMENTS = LIST_SUBSTATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Orderedby Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDEREDBY_STATEMENT_FEATURE_COUNT = LIST_SUBSTATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.ContainerSubstatementImpl <em>Container Substatement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.ContainerSubstatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getContainerSubstatement()
   * @generated
   */
  int CONTAINER_SUBSTATEMENT = 51;

  /**
   * The number of structural features of the '<em>Container Substatement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_SUBSTATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.PresenceStatementImpl <em>Presence Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.PresenceStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getPresenceStatement()
   * @generated
   */
  int PRESENCE_STATEMENT = 26;

  /**
   * The feature id for the '<em><b>Arg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRESENCE_STATEMENT__ARG = CONTAINER_SUBSTATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Presenceunknownstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRESENCE_STATEMENT__PRESENCEUNKNOWNSTATEMENTS = CONTAINER_SUBSTATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Presence Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRESENCE_STATEMENT_FEATURE_COUNT = CONTAINER_SUBSTATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.MandatoryStatementImpl <em>Mandatory Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.MandatoryStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getMandatoryStatement()
   * @generated
   */
  int MANDATORY_STATEMENT = 27;

  /**
   * The feature id for the '<em><b>Boolarg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANDATORY_STATEMENT__BOOLARG = LEAF_SUBSTATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Mandatoryunknownstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANDATORY_STATEMENT__MANDATORYUNKNOWNSTATEMENTS = LEAF_SUBSTATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Mandatory Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANDATORY_STATEMENT_FEATURE_COUNT = LEAF_SUBSTATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.ConfigStatementImpl <em>Config Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.ConfigStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getConfigStatement()
   * @generated
   */
  int CONFIG_STATEMENT = 28;

  /**
   * The feature id for the '<em><b>Boolarg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIG_STATEMENT__BOOLARG = CONTAINER_SUBSTATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Configunknownstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIG_STATEMENT__CONFIGUNKNOWNSTATEMENTS = CONTAINER_SUBSTATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Config Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIG_STATEMENT_FEATURE_COUNT = CONTAINER_SUBSTATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.FractionDigitsStatementImpl <em>Fraction Digits Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.FractionDigitsStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getFractionDigitsStatement()
   * @generated
   */
  int FRACTION_DIGITS_STATEMENT = 29;

  /**
   * The feature id for the '<em><b>Arg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRACTION_DIGITS_STATEMENT__ARG = TYPE_SUB_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Fractiondigitsunknownstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRACTION_DIGITS_STATEMENT__FRACTIONDIGITSUNKNOWNSTATEMENTS = TYPE_SUB_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Fraction Digits Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRACTION_DIGITS_STATEMENT_FEATURE_COUNT = TYPE_SUB_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.IfFeatureStatementImpl <em>If Feature Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.IfFeatureStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getIfFeatureStatement()
   * @generated
   */
  int IF_FEATURE_STATEMENT = 30;

  /**
   * The feature id for the '<em><b>Pref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_FEATURE_STATEMENT__PREF = RPC_SUBSTATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ident</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_FEATURE_STATEMENT__IDENT = RPC_SUBSTATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Iffeatureunknownstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_FEATURE_STATEMENT__IFFEATUREUNKNOWNSTATEMENTS = RPC_SUBSTATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>If Feature Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_FEATURE_STATEMENT_FEATURE_COUNT = RPC_SUBSTATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.IdentitySubstatementImpl <em>Identity Substatement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.IdentitySubstatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getIdentitySubstatement()
   * @generated
   */
  int IDENTITY_SUBSTATEMENT = 82;

  /**
   * The number of structural features of the '<em>Identity Substatement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTITY_SUBSTATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.BaseStatementImpl <em>Base Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.BaseStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getBaseStatement()
   * @generated
   */
  int BASE_STATEMENT = 31;

  /**
   * The feature id for the '<em><b>Pref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_STATEMENT__PREF = IDENTITY_SUBSTATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ident</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_STATEMENT__IDENT = IDENTITY_SUBSTATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Baseunknownstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_STATEMENT__BASEUNKNOWNSTATEMENTS = IDENTITY_SUBSTATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Base Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_STATEMENT_FEATURE_COUNT = IDENTITY_SUBSTATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.ArgumentSubstatementImpl <em>Argument Substatement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.ArgumentSubstatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getArgumentSubstatement()
   * @generated
   */
  int ARGUMENT_SUBSTATEMENT = 80;

  /**
   * The number of structural features of the '<em>Argument Substatement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_SUBSTATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.YinElementStatementImpl <em>Yin Element Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.YinElementStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getYinElementStatement()
   * @generated
   */
  int YIN_ELEMENT_STATEMENT = 32;

  /**
   * The feature id for the '<em><b>Boolarg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int YIN_ELEMENT_STATEMENT__BOOLARG = ARGUMENT_SUBSTATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Yinelementunknownstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int YIN_ELEMENT_STATEMENT__YINELEMENTUNKNOWNSTATEMENTS = ARGUMENT_SUBSTATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Yin Element Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int YIN_ELEMENT_STATEMENT_FEATURE_COUNT = ARGUMENT_SUBSTATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.MinElementsStatementImpl <em>Min Elements Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.MinElementsStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getMinElementsStatement()
   * @generated
   */
  int MIN_ELEMENTS_STATEMENT = 33;

  /**
   * The feature id for the '<em><b>Arg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIN_ELEMENTS_STATEMENT__ARG = LIST_SUBSTATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Minelementsunknownstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIN_ELEMENTS_STATEMENT__MINELEMENTSUNKNOWNSTATEMENTS = LIST_SUBSTATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Min Elements Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIN_ELEMENTS_STATEMENT_FEATURE_COUNT = LIST_SUBSTATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.MaxElementsStatementImpl <em>Max Elements Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.MaxElementsStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getMaxElementsStatement()
   * @generated
   */
  int MAX_ELEMENTS_STATEMENT = 34;

  /**
   * The feature id for the '<em><b>Arg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAX_ELEMENTS_STATEMENT__ARG = LIST_SUBSTATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Maxelementsunknownstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAX_ELEMENTS_STATEMENT__MAXELEMENTSUNKNOWNSTATEMENTS = LIST_SUBSTATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Max Elements Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAX_ELEMENTS_STATEMENT_FEATURE_COUNT = LIST_SUBSTATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.UnknownStatementImpl <em>Unknown Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.UnknownStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getUnknownStatement()
   * @generated
   */
  int UNKNOWN_STATEMENT = 35;

  /**
   * The feature id for the '<em><b>Pref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNKNOWN_STATEMENT__PREF = MODULE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Namestat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNKNOWN_STATEMENT__NAMESTAT = MODULE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Argument</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNKNOWN_STATEMENT__ARGUMENT = MODULE_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Unknownsubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNKNOWN_STATEMENT__UNKNOWNSUBSTATEMENTS = MODULE_STATEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Unknown Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNKNOWN_STATEMENT_FEATURE_COUNT = MODULE_STATEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.UnknownSubstatementsImpl <em>Unknown Substatements</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.UnknownSubstatementsImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getUnknownSubstatements()
   * @generated
   */
  int UNKNOWN_SUBSTATEMENTS = 36;

  /**
   * The feature id for the '<em><b>Pref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNKNOWN_SUBSTATEMENTS__PREF = 0;

  /**
   * The feature id for the '<em><b>Namestat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNKNOWN_SUBSTATEMENTS__NAMESTAT = 1;

  /**
   * The feature id for the '<em><b>Argument</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNKNOWN_SUBSTATEMENTS__ARGUMENT = 2;

  /**
   * The feature id for the '<em><b>Unknownsubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNKNOWN_SUBSTATEMENTS__UNKNOWNSUBSTATEMENTS = 3;

  /**
   * The number of structural features of the '<em>Unknown Substatements</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNKNOWN_SUBSTATEMENTS_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.RangeStatementImpl <em>Range Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.RangeStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getRangeStatement()
   * @generated
   */
  int RANGE_STATEMENT = 37;

  /**
   * The feature id for the '<em><b>Range</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_STATEMENT__RANGE = TYPE_SUB_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rangesubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_STATEMENT__RANGESUBSTATEMENTS = TYPE_SUB_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Range Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_STATEMENT_FEATURE_COUNT = TYPE_SUB_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.PatternStatementImpl <em>Pattern Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.PatternStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getPatternStatement()
   * @generated
   */
  int PATTERN_STATEMENT = 38;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN_STATEMENT__NAME = TYPE_SUB_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Patternsubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN_STATEMENT__PATTERNSUBSTATEMENTS = TYPE_SUB_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Pattern Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN_STATEMENT_FEATURE_COUNT = TYPE_SUB_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.LengthStatementImpl <em>Length Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.LengthStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getLengthStatement()
   * @generated
   */
  int LENGTH_STATEMENT = 39;

  /**
   * The feature id for the '<em><b>Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENGTH_STATEMENT__LENGTH = TYPE_SUB_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Lengthsubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENGTH_STATEMENT__LENGTHSUBSTATEMENTS = TYPE_SUB_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Length Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENGTH_STATEMENT_FEATURE_COUNT = TYPE_SUB_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.MustStatementImpl <em>Must Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.MustStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getMustStatement()
   * @generated
   */
  int MUST_STATEMENT = 40;

  /**
   * The feature id for the '<em><b>Arg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUST_STATEMENT__ARG = CONTAINER_SUBSTATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Mustsubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUST_STATEMENT__MUSTSUBSTATEMENTS = CONTAINER_SUBSTATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Must Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUST_STATEMENT_FEATURE_COUNT = CONTAINER_SUBSTATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.RpcStatementImpl <em>Rpc Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.RpcStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getRpcStatement()
   * @generated
   */
  int RPC_STATEMENT = 42;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RPC_STATEMENT__NAME = MODULE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rpcsubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RPC_STATEMENT__RPCSUBSTATEMENTS = MODULE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Rpc Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RPC_STATEMENT_FEATURE_COUNT = MODULE_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.InputStatementImpl <em>Input Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.InputStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getInputStatement()
   * @generated
   */
  int INPUT_STATEMENT = 44;

  /**
   * The feature id for the '<em><b>Inputsubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_STATEMENT__INPUTSUBSTATEMENTS = RPC_SUBSTATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Input Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_STATEMENT_FEATURE_COUNT = RPC_SUBSTATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.InputSubstatementImpl <em>Input Substatement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.InputSubstatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getInputSubstatement()
   * @generated
   */
  int INPUT_SUBSTATEMENT = 45;

  /**
   * The number of structural features of the '<em>Input Substatement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_SUBSTATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.OutputStatementImpl <em>Output Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.OutputStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getOutputStatement()
   * @generated
   */
  int OUTPUT_STATEMENT = 46;

  /**
   * The feature id for the '<em><b>Outputsubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_STATEMENT__OUTPUTSUBSTATEMENTS = RPC_SUBSTATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Output Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_STATEMENT_FEATURE_COUNT = RPC_SUBSTATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.OutputSubstatementImpl <em>Output Substatement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.OutputSubstatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getOutputSubstatement()
   * @generated
   */
  int OUTPUT_SUBSTATEMENT = 47;

  /**
   * The number of structural features of the '<em>Output Substatement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_SUBSTATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.NotificationStatementImpl <em>Notification Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.NotificationStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getNotificationStatement()
   * @generated
   */
  int NOTIFICATION_STATEMENT = 48;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTIFICATION_STATEMENT__NAME = MODULE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Notificationsubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTIFICATION_STATEMENT__NOTIFICATIONSUBSTATEMENTS = MODULE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Notification Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTIFICATION_STATEMENT_FEATURE_COUNT = MODULE_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.NotificationSubstatementImpl <em>Notification Substatement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.NotificationSubstatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getNotificationSubstatement()
   * @generated
   */
  int NOTIFICATION_SUBSTATEMENT = 49;

  /**
   * The number of structural features of the '<em>Notification Substatement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTIFICATION_SUBSTATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.ContainerStatementImpl <em>Container Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.ContainerStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getContainerStatement()
   * @generated
   */
  int CONTAINER_STATEMENT = 50;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_STATEMENT__NAME = DATADEF_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Containersubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_STATEMENT__CONTAINERSUBSTATEMENTS = DATADEF_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Container Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_STATEMENT_FEATURE_COUNT = DATADEF_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.ListStatementImpl <em>List Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.ListStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getListStatement()
   * @generated
   */
  int LIST_STATEMENT = 52;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_STATEMENT__NAME = DATADEF_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Listsubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_STATEMENT__LISTSUBSTATEMENTS = DATADEF_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>List Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_STATEMENT_FEATURE_COUNT = DATADEF_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.GroupingStatementImpl <em>Grouping Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.GroupingStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getGroupingStatement()
   * @generated
   */
  int GROUPING_STATEMENT = 54;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUPING_STATEMENT__NAME = MODULE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Groupingsubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUPING_STATEMENT__GROUPINGSUBSTATEMENTS = MODULE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Grouping Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUPING_STATEMENT_FEATURE_COUNT = MODULE_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.GroupingSubstatementImpl <em>Grouping Substatement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.GroupingSubstatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getGroupingSubstatement()
   * @generated
   */
  int GROUPING_SUBSTATEMENT = 55;

  /**
   * The number of structural features of the '<em>Grouping Substatement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUPING_SUBSTATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.LeafStatementImpl <em>Leaf Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.LeafStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getLeafStatement()
   * @generated
   */
  int LEAF_STATEMENT = 56;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEAF_STATEMENT__NAME = DATADEF_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Leafsubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEAF_STATEMENT__LEAFSUBSTATEMENTS = DATADEF_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Leaf Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEAF_STATEMENT_FEATURE_COUNT = DATADEF_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.LeafListStatementImpl <em>Leaf List Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.LeafListStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getLeafListStatement()
   * @generated
   */
  int LEAF_LIST_STATEMENT = 58;

  /**
   * The feature id for the '<em><b>Arg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEAF_LIST_STATEMENT__ARG = DATADEF_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Leaflistsubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEAF_LIST_STATEMENT__LEAFLISTSUBSTATEMENTS = DATADEF_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Leaf List Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEAF_LIST_STATEMENT_FEATURE_COUNT = DATADEF_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.LeafListSubstatementImpl <em>Leaf List Substatement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.LeafListSubstatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getLeafListSubstatement()
   * @generated
   */
  int LEAF_LIST_SUBSTATEMENT = 59;

  /**
   * The number of structural features of the '<em>Leaf List Substatement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEAF_LIST_SUBSTATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.ChoiceStatementImpl <em>Choice Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.ChoiceStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getChoiceStatement()
   * @generated
   */
  int CHOICE_STATEMENT = 60;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICE_STATEMENT__NAME = DATADEF_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Choicesubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICE_STATEMENT__CHOICESUBSTATEMENTS = DATADEF_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Choice Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICE_STATEMENT_FEATURE_COUNT = DATADEF_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.ChoiceSubstatementImpl <em>Choice Substatement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.ChoiceSubstatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getChoiceSubstatement()
   * @generated
   */
  int CHOICE_SUBSTATEMENT = 61;

  /**
   * The number of structural features of the '<em>Choice Substatement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICE_SUBSTATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.CaseStatementImpl <em>Case Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.CaseStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getCaseStatement()
   * @generated
   */
  int CASE_STATEMENT = 62;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_STATEMENT__NAME = CHOICE_SUBSTATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Casesubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_STATEMENT__CASESUBSTATEMENTS = CHOICE_SUBSTATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Case Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_STATEMENT_FEATURE_COUNT = CHOICE_SUBSTATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.CaseSubstatementImpl <em>Case Substatement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.CaseSubstatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getCaseSubstatement()
   * @generated
   */
  int CASE_SUBSTATEMENT = 63;

  /**
   * The number of structural features of the '<em>Case Substatement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_SUBSTATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.AnyxmlStatementImpl <em>Anyxml Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.AnyxmlStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getAnyxmlStatement()
   * @generated
   */
  int ANYXML_STATEMENT = 64;

  /**
   * The feature id for the '<em><b>Arg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANYXML_STATEMENT__ARG = DATADEF_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Anyxmlsubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANYXML_STATEMENT__ANYXMLSUBSTATEMENTS = DATADEF_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Anyxml Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANYXML_STATEMENT_FEATURE_COUNT = DATADEF_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.AnyxmlSubstatementImpl <em>Anyxml Substatement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.AnyxmlSubstatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getAnyxmlSubstatement()
   * @generated
   */
  int ANYXML_SUBSTATEMENT = 65;

  /**
   * The number of structural features of the '<em>Anyxml Substatement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANYXML_SUBSTATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.UsesStatementImpl <em>Uses Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.UsesStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getUsesStatement()
   * @generated
   */
  int USES_STATEMENT = 66;

  /**
   * The feature id for the '<em><b>Pre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USES_STATEMENT__PRE = DATADEF_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Arg</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USES_STATEMENT__ARG = DATADEF_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Usessubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USES_STATEMENT__USESSUBSTATEMENTS = DATADEF_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Uses Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USES_STATEMENT_FEATURE_COUNT = DATADEF_STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.UsesSubstatementImpl <em>Uses Substatement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.UsesSubstatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getUsesSubstatement()
   * @generated
   */
  int USES_SUBSTATEMENT = 67;

  /**
   * The number of structural features of the '<em>Uses Substatement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USES_SUBSTATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.AugmentUsesStatementImpl <em>Augment Uses Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.AugmentUsesStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getAugmentUsesStatement()
   * @generated
   */
  int AUGMENT_USES_STATEMENT = 68;

  /**
   * The feature id for the '<em><b>Arg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUGMENT_USES_STATEMENT__ARG = USES_SUBSTATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Augmentsubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUGMENT_USES_STATEMENT__AUGMENTSUBSTATEMENTS = USES_SUBSTATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Augment Uses Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUGMENT_USES_STATEMENT_FEATURE_COUNT = USES_SUBSTATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.AugmentStatementImpl <em>Augment Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.AugmentStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getAugmentStatement()
   * @generated
   */
  int AUGMENT_STATEMENT = 69;

  /**
   * The feature id for the '<em><b>Arg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUGMENT_STATEMENT__ARG = MODULE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Augmentsubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUGMENT_STATEMENT__AUGMENTSUBSTATEMENTS = MODULE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Augment Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUGMENT_STATEMENT_FEATURE_COUNT = MODULE_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.AugmentSubstatementImpl <em>Augment Substatement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.AugmentSubstatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getAugmentSubstatement()
   * @generated
   */
  int AUGMENT_SUBSTATEMENT = 70;

  /**
   * The number of structural features of the '<em>Augment Substatement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUGMENT_SUBSTATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.RefineStatementImpl <em>Refine Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.RefineStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getRefineStatement()
   * @generated
   */
  int REFINE_STATEMENT = 71;

  /**
   * The feature id for the '<em><b>Arg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFINE_STATEMENT__ARG = USES_SUBSTATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Refinesubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFINE_STATEMENT__REFINESUBSTATEMENTS = USES_SUBSTATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Refine Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFINE_STATEMENT_FEATURE_COUNT = USES_SUBSTATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.RefineSubstatementImpl <em>Refine Substatement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.RefineSubstatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getRefineSubstatement()
   * @generated
   */
  int REFINE_SUBSTATEMENT = 72;

  /**
   * The number of structural features of the '<em>Refine Substatement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFINE_SUBSTATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.DeviationStatementImpl <em>Deviation Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.DeviationStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getDeviationStatement()
   * @generated
   */
  int DEVIATION_STATEMENT = 73;

  /**
   * The feature id for the '<em><b>Arg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVIATION_STATEMENT__ARG = MODULE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Deviationsubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVIATION_STATEMENT__DEVIATIONSUBSTATEMENTS = MODULE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Deviation Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVIATION_STATEMENT_FEATURE_COUNT = MODULE_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.DeviationSubstatementImpl <em>Deviation Substatement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.DeviationSubstatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getDeviationSubstatement()
   * @generated
   */
  int DEVIATION_SUBSTATEMENT = 74;

  /**
   * The number of structural features of the '<em>Deviation Substatement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVIATION_SUBSTATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.DeviateStatementImpl <em>Deviate Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.DeviateStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getDeviateStatement()
   * @generated
   */
  int DEVIATE_STATEMENT = 75;

  /**
   * The feature id for the '<em><b>Arg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVIATE_STATEMENT__ARG = DEVIATION_SUBSTATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Deviatesubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVIATE_STATEMENT__DEVIATESUBSTATEMENTS = DEVIATION_SUBSTATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Deviate Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVIATE_STATEMENT_FEATURE_COUNT = DEVIATION_SUBSTATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.DeviateSubstatementImpl <em>Deviate Substatement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.DeviateSubstatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getDeviateSubstatement()
   * @generated
   */
  int DEVIATE_SUBSTATEMENT = 76;

  /**
   * The number of structural features of the '<em>Deviate Substatement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVIATE_SUBSTATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.ExtensionStatementImpl <em>Extension Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.ExtensionStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getExtensionStatement()
   * @generated
   */
  int EXTENSION_STATEMENT = 77;

  /**
   * The feature id for the '<em><b>Arg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENSION_STATEMENT__ARG = MODULE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Extensionsubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENSION_STATEMENT__EXTENSIONSUBSTATEMENTS = MODULE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Extension Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENSION_STATEMENT_FEATURE_COUNT = MODULE_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.ExtensionSubstatementImpl <em>Extension Substatement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.ExtensionSubstatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getExtensionSubstatement()
   * @generated
   */
  int EXTENSION_SUBSTATEMENT = 78;

  /**
   * The number of structural features of the '<em>Extension Substatement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENSION_SUBSTATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.ArgumentStatementImpl <em>Argument Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.ArgumentStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getArgumentStatement()
   * @generated
   */
  int ARGUMENT_STATEMENT = 79;

  /**
   * The feature id for the '<em><b>Arg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_STATEMENT__ARG = EXTENSION_SUBSTATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Argumentsubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_STATEMENT__ARGUMENTSUBSTATEMENTS = EXTENSION_SUBSTATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Argument Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_STATEMENT_FEATURE_COUNT = EXTENSION_SUBSTATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.IdentityStatementImpl <em>Identity Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.IdentityStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getIdentityStatement()
   * @generated
   */
  int IDENTITY_STATEMENT = 81;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTITY_STATEMENT__NAME = MODULE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Identitysubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTITY_STATEMENT__IDENTITYSUBSTATEMENTS = MODULE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Identity Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTITY_STATEMENT_FEATURE_COUNT = MODULE_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.FeatureStatementImpl <em>Feature Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.FeatureStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getFeatureStatement()
   * @generated
   */
  int FEATURE_STATEMENT = 83;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_STATEMENT__NAME = MODULE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Featuresubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_STATEMENT__FEATURESUBSTATEMENTS = MODULE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Feature Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_STATEMENT_FEATURE_COUNT = MODULE_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.FeatureSubstatementImpl <em>Feature Substatement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.FeatureSubstatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getFeatureSubstatement()
   * @generated
   */
  int FEATURE_SUBSTATEMENT = 84;

  /**
   * The number of structural features of the '<em>Feature Substatement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_SUBSTATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.BelongsToStatementImpl <em>Belongs To Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.BelongsToStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getBelongsToStatement()
   * @generated
   */
  int BELONGS_TO_STATEMENT = 85;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BELONGS_TO_STATEMENT__NAME = SUBMODULE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Belongstosubstatement</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BELONGS_TO_STATEMENT__BELONGSTOSUBSTATEMENT = SUBMODULE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Belongs To Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BELONGS_TO_STATEMENT_FEATURE_COUNT = SUBMODULE_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.BelongsToSubstatementImpl <em>Belongs To Substatement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.BelongsToSubstatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getBelongsToSubstatement()
   * @generated
   */
  int BELONGS_TO_SUBSTATEMENT = 86;

  /**
   * The number of structural features of the '<em>Belongs To Substatement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BELONGS_TO_SUBSTATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.TypedefStatementImpl <em>Typedef Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.TypedefStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getTypedefStatement()
   * @generated
   */
  int TYPEDEF_STATEMENT = 87;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPEDEF_STATEMENT__NAME = MODULE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Typedefsubstatemnet</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPEDEF_STATEMENT__TYPEDEFSUBSTATEMNET = MODULE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Typedef Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPEDEF_STATEMENT_FEATURE_COUNT = MODULE_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.TypedefSubstatementImpl <em>Typedef Substatement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.TypedefSubstatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getTypedefSubstatement()
   * @generated
   */
  int TYPEDEF_SUBSTATEMENT = 88;

  /**
   * The number of structural features of the '<em>Typedef Substatement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPEDEF_SUBSTATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.TypeStatementImpl <em>Type Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.TypeStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getTypeStatement()
   * @generated
   */
  int TYPE_STATEMENT = 89;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_STATEMENT__TYPE = LEAF_SUBSTATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Pre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_STATEMENT__PRE = LEAF_SUBSTATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Importtype</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_STATEMENT__IMPORTTYPE = LEAF_SUBSTATEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Typesubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_STATEMENT__TYPESUBSTATEMENTS = LEAF_SUBSTATEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Type Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_STATEMENT_FEATURE_COUNT = LEAF_SUBSTATEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.BitStatementImpl <em>Bit Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.BitStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getBitStatement()
   * @generated
   */
  int BIT_STATEMENT = 91;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIT_STATEMENT__NAME = TYPE_SUB_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Bitsubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIT_STATEMENT__BITSUBSTATEMENTS = TYPE_SUB_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Bit Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIT_STATEMENT_FEATURE_COUNT = TYPE_SUB_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.EnumStatementImpl <em>Enum Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.EnumStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getEnumStatement()
   * @generated
   */
  int ENUM_STATEMENT = 93;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_STATEMENT__NAME = TYPE_SUB_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Enumsubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_STATEMENT__ENUMSUBSTATEMENTS = TYPE_SUB_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Enum Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_STATEMENT_FEATURE_COUNT = TYPE_SUB_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.ImportStatementImpl <em>Import Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.ImportStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getImportStatement()
   * @generated
   */
  int IMPORT_STATEMENT = 95;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_STATEMENT__IMPORT_URI = MODULE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Importsubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_STATEMENT__IMPORTSUBSTATEMENTS = MODULE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Import Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_STATEMENT_FEATURE_COUNT = MODULE_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.IncludeStatementImpl <em>Include Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.IncludeStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getIncludeStatement()
   * @generated
   */
  int INCLUDE_STATEMENT = 97;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_STATEMENT__IMPORT_URI = MODULE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Includesubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_STATEMENT__INCLUDESUBSTATEMENTS = MODULE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Include Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_STATEMENT_FEATURE_COUNT = MODULE_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.IncludeSubstatementsImpl <em>Include Substatements</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.IncludeSubstatementsImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getIncludeSubstatements()
   * @generated
   */
  int INCLUDE_SUBSTATEMENTS = 98;

  /**
   * The number of structural features of the '<em>Include Substatements</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_SUBSTATEMENTS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.WhenStatementImpl <em>When Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.WhenStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getWhenStatement()
   * @generated
   */
  int WHEN_STATEMENT = 99;

  /**
   * The feature id for the '<em><b>Arg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_STATEMENT__ARG = CONTAINER_SUBSTATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Whensubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_STATEMENT__WHENSUBSTATEMENTS = CONTAINER_SUBSTATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>When Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_STATEMENT_FEATURE_COUNT = CONTAINER_SUBSTATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.WhenSubstatementsImpl <em>When Substatements</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.WhenSubstatementsImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getWhenSubstatements()
   * @generated
   */
  int WHEN_SUBSTATEMENTS = 100;

  /**
   * The number of structural features of the '<em>When Substatements</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_SUBSTATEMENTS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.RevisionStatementImpl <em>Revision Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.RevisionStatementImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getRevisionStatement()
   * @generated
   */
  int REVISION_STATEMENT = 101;

  /**
   * The feature id for the '<em><b>Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REVISION_STATEMENT__DATE = MODULE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Revisionsubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REVISION_STATEMENT__REVISIONSUBSTATEMENTS = MODULE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Revision Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REVISION_STATEMENT_FEATURE_COUNT = MODULE_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.RevisionSubstatementsImpl <em>Revision Substatements</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.RevisionSubstatementsImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getRevisionSubstatements()
   * @generated
   */
  int REVISION_SUBSTATEMENTS = 102;

  /**
   * The number of structural features of the '<em>Revision Substatements</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REVISION_SUBSTATEMENTS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.editor.yang.yang.impl.BuiltInTypeImpl <em>Built In Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.editor.yang.yang.impl.BuiltInTypeImpl
   * @see org.xtext.editor.yang.yang.impl.YangPackageImpl#getBuiltInType()
   * @generated
   */
  int BUILT_IN_TYPE = 103;

  /**
   * The feature id for the '<em><b>Btype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILT_IN_TYPE__BTYPE = 0;

  /**
   * The number of structural features of the '<em>Built In Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILT_IN_TYPE_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.YangFile <em>File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>File</em>'.
   * @see org.xtext.editor.yang.yang.YangFile
   * @generated
   */
  EClass getYangFile();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.YangFile#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.editor.yang.yang.YangFile#getName()
   * @see #getYangFile()
   * @generated
   */
  EAttribute getYangFile_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.Module <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module</em>'.
   * @see org.xtext.editor.yang.yang.Module
   * @generated
   */
  EClass getModule();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.Module#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see org.xtext.editor.yang.yang.Module#getStatements()
   * @see #getModule()
   * @generated
   */
  EReference getModule_Statements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.ModuleStatement <em>Module Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module Statement</em>'.
   * @see org.xtext.editor.yang.yang.ModuleStatement
   * @generated
   */
  EClass getModuleStatement();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.SubModule <em>Sub Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Module</em>'.
   * @see org.xtext.editor.yang.yang.SubModule
   * @generated
   */
  EClass getSubModule();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.SubModule#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see org.xtext.editor.yang.yang.SubModule#getStatements()
   * @see #getSubModule()
   * @generated
   */
  EReference getSubModule_Statements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.SubmoduleStatement <em>Submodule Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Submodule Statement</em>'.
   * @see org.xtext.editor.yang.yang.SubmoduleStatement
   * @generated
   */
  EClass getSubmoduleStatement();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.DatadefStatement <em>Datadef Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Datadef Statement</em>'.
   * @see org.xtext.editor.yang.yang.DatadefStatement
   * @generated
   */
  EClass getDatadefStatement();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.YangVersionStatement <em>Version Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Version Statement</em>'.
   * @see org.xtext.editor.yang.yang.YangVersionStatement
   * @generated
   */
  EClass getYangVersionStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.YangVersionStatement#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see org.xtext.editor.yang.yang.YangVersionStatement#getVersion()
   * @see #getYangVersionStatement()
   * @generated
   */
  EAttribute getYangVersionStatement_Version();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.YangVersionStatement#getYangversionunknownstatements <em>Yangversionunknownstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Yangversionunknownstatements</em>'.
   * @see org.xtext.editor.yang.yang.YangVersionStatement#getYangversionunknownstatements()
   * @see #getYangVersionStatement()
   * @generated
   */
  EReference getYangVersionStatement_Yangversionunknownstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.OrganizationStatement <em>Organization Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Organization Statement</em>'.
   * @see org.xtext.editor.yang.yang.OrganizationStatement
   * @generated
   */
  EClass getOrganizationStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.OrganizationStatement#getOrganization <em>Organization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Organization</em>'.
   * @see org.xtext.editor.yang.yang.OrganizationStatement#getOrganization()
   * @see #getOrganizationStatement()
   * @generated
   */
  EAttribute getOrganizationStatement_Organization();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.OrganizationStatement#getOrganizationunknownstatements <em>Organizationunknownstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Organizationunknownstatements</em>'.
   * @see org.xtext.editor.yang.yang.OrganizationStatement#getOrganizationunknownstatements()
   * @see #getOrganizationStatement()
   * @generated
   */
  EReference getOrganizationStatement_Organizationunknownstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.ContactStatement <em>Contact Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Contact Statement</em>'.
   * @see org.xtext.editor.yang.yang.ContactStatement
   * @generated
   */
  EClass getContactStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.ContactStatement#getContact <em>Contact</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Contact</em>'.
   * @see org.xtext.editor.yang.yang.ContactStatement#getContact()
   * @see #getContactStatement()
   * @generated
   */
  EAttribute getContactStatement_Contact();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.ContactStatement#getContactunknownstatements <em>Contactunknownstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contactunknownstatements</em>'.
   * @see org.xtext.editor.yang.yang.ContactStatement#getContactunknownstatements()
   * @see #getContactStatement()
   * @generated
   */
  EReference getContactStatement_Contactunknownstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.DescriptionStatement <em>Description Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Description Statement</em>'.
   * @see org.xtext.editor.yang.yang.DescriptionStatement
   * @generated
   */
  EClass getDescriptionStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.DescriptionStatement#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.xtext.editor.yang.yang.DescriptionStatement#getDescription()
   * @see #getDescriptionStatement()
   * @generated
   */
  EAttribute getDescriptionStatement_Description();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.DescriptionStatement#getDescriptionunknownstatements <em>Descriptionunknownstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Descriptionunknownstatements</em>'.
   * @see org.xtext.editor.yang.yang.DescriptionStatement#getDescriptionunknownstatements()
   * @see #getDescriptionStatement()
   * @generated
   */
  EReference getDescriptionStatement_Descriptionunknownstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.ReferenceStatement <em>Reference Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference Statement</em>'.
   * @see org.xtext.editor.yang.yang.ReferenceStatement
   * @generated
   */
  EClass getReferenceStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.ReferenceStatement#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reference</em>'.
   * @see org.xtext.editor.yang.yang.ReferenceStatement#getReference()
   * @see #getReferenceStatement()
   * @generated
   */
  EAttribute getReferenceStatement_Reference();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.ReferenceStatement#getReferenceunknownstatements <em>Referenceunknownstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Referenceunknownstatements</em>'.
   * @see org.xtext.editor.yang.yang.ReferenceStatement#getReferenceunknownstatements()
   * @see #getReferenceStatement()
   * @generated
   */
  EReference getReferenceStatement_Referenceunknownstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.NamespaceStatement <em>Namespace Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Namespace Statement</em>'.
   * @see org.xtext.editor.yang.yang.NamespaceStatement
   * @generated
   */
  EClass getNamespaceStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.NamespaceStatement#getUri <em>Uri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uri</em>'.
   * @see org.xtext.editor.yang.yang.NamespaceStatement#getUri()
   * @see #getNamespaceStatement()
   * @generated
   */
  EAttribute getNamespaceStatement_Uri();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.NamespaceStatement#getNamespaceunknownstatements <em>Namespaceunknownstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Namespaceunknownstatements</em>'.
   * @see org.xtext.editor.yang.yang.NamespaceStatement#getNamespaceunknownstatements()
   * @see #getNamespaceStatement()
   * @generated
   */
  EReference getNamespaceStatement_Namespaceunknownstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.PrefixStatement <em>Prefix Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Prefix Statement</em>'.
   * @see org.xtext.editor.yang.yang.PrefixStatement
   * @generated
   */
  EClass getPrefixStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.PrefixStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.editor.yang.yang.PrefixStatement#getName()
   * @see #getPrefixStatement()
   * @generated
   */
  EAttribute getPrefixStatement_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.PrefixStatement#getPrefixunknownstatements <em>Prefixunknownstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Prefixunknownstatements</em>'.
   * @see org.xtext.editor.yang.yang.PrefixStatement#getPrefixunknownstatements()
   * @see #getPrefixStatement()
   * @generated
   */
  EReference getPrefixStatement_Prefixunknownstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.RequireInstanceStatement <em>Require Instance Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Require Instance Statement</em>'.
   * @see org.xtext.editor.yang.yang.RequireInstanceStatement
   * @generated
   */
  EClass getRequireInstanceStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.RequireInstanceStatement#getRequire <em>Require</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Require</em>'.
   * @see org.xtext.editor.yang.yang.RequireInstanceStatement#getRequire()
   * @see #getRequireInstanceStatement()
   * @generated
   */
  EAttribute getRequireInstanceStatement_Require();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.RequireInstanceStatement#getRequireunknownstatements <em>Requireunknownstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Requireunknownstatements</em>'.
   * @see org.xtext.editor.yang.yang.RequireInstanceStatement#getRequireunknownstatements()
   * @see #getRequireInstanceStatement()
   * @generated
   */
  EReference getRequireInstanceStatement_Requireunknownstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.PathStatement <em>Path Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Path Statement</em>'.
   * @see org.xtext.editor.yang.yang.PathStatement
   * @generated
   */
  EClass getPathStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.PathStatement#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Path</em>'.
   * @see org.xtext.editor.yang.yang.PathStatement#getPath()
   * @see #getPathStatement()
   * @generated
   */
  EAttribute getPathStatement_Path();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.PathStatement#getPathunknownstatements <em>Pathunknownstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pathunknownstatements</em>'.
   * @see org.xtext.editor.yang.yang.PathStatement#getPathunknownstatements()
   * @see #getPathStatement()
   * @generated
   */
  EReference getPathStatement_Pathunknownstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.PositionStatement <em>Position Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Position Statement</em>'.
   * @see org.xtext.editor.yang.yang.PositionStatement
   * @generated
   */
  EClass getPositionStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.PositionStatement#getIntarg <em>Intarg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Intarg</em>'.
   * @see org.xtext.editor.yang.yang.PositionStatement#getIntarg()
   * @see #getPositionStatement()
   * @generated
   */
  EAttribute getPositionStatement_Intarg();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.PositionStatement#getPositionunknownstatements <em>Positionunknownstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Positionunknownstatements</em>'.
   * @see org.xtext.editor.yang.yang.PositionStatement#getPositionunknownstatements()
   * @see #getPositionStatement()
   * @generated
   */
  EReference getPositionStatement_Positionunknownstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.ValueStatement <em>Value Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value Statement</em>'.
   * @see org.xtext.editor.yang.yang.ValueStatement
   * @generated
   */
  EClass getValueStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.ValueStatement#getIntarg <em>Intarg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Intarg</em>'.
   * @see org.xtext.editor.yang.yang.ValueStatement#getIntarg()
   * @see #getValueStatement()
   * @generated
   */
  EAttribute getValueStatement_Intarg();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.ValueStatement#getValueunknownstatements <em>Valueunknownstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Valueunknownstatements</em>'.
   * @see org.xtext.editor.yang.yang.ValueStatement#getValueunknownstatements()
   * @see #getValueStatement()
   * @generated
   */
  EReference getValueStatement_Valueunknownstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.ErrorAppTagStatement <em>Error App Tag Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Error App Tag Statement</em>'.
   * @see org.xtext.editor.yang.yang.ErrorAppTagStatement
   * @generated
   */
  EClass getErrorAppTagStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.ErrorAppTagStatement#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg</em>'.
   * @see org.xtext.editor.yang.yang.ErrorAppTagStatement#getArg()
   * @see #getErrorAppTagStatement()
   * @generated
   */
  EAttribute getErrorAppTagStatement_Arg();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.ErrorAppTagStatement#getErroraunknownstatements <em>Erroraunknownstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Erroraunknownstatements</em>'.
   * @see org.xtext.editor.yang.yang.ErrorAppTagStatement#getErroraunknownstatements()
   * @see #getErrorAppTagStatement()
   * @generated
   */
  EReference getErrorAppTagStatement_Erroraunknownstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.ErrorMessageStatement <em>Error Message Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Error Message Statement</em>'.
   * @see org.xtext.editor.yang.yang.ErrorMessageStatement
   * @generated
   */
  EClass getErrorMessageStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.ErrorMessageStatement#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg</em>'.
   * @see org.xtext.editor.yang.yang.ErrorMessageStatement#getArg()
   * @see #getErrorMessageStatement()
   * @generated
   */
  EAttribute getErrorMessageStatement_Arg();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.ErrorMessageStatement#getErrormunknownstatements <em>Errormunknownstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Errormunknownstatements</em>'.
   * @see org.xtext.editor.yang.yang.ErrorMessageStatement#getErrormunknownstatements()
   * @see #getErrorMessageStatement()
   * @generated
   */
  EReference getErrorMessageStatement_Errormunknownstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.UnitsStatement <em>Units Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Units Statement</em>'.
   * @see org.xtext.editor.yang.yang.UnitsStatement
   * @generated
   */
  EClass getUnitsStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.UnitsStatement#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg</em>'.
   * @see org.xtext.editor.yang.yang.UnitsStatement#getArg()
   * @see #getUnitsStatement()
   * @generated
   */
  EAttribute getUnitsStatement_Arg();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.UnitsStatement#getUnitsunknownstatements <em>Unitsunknownstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Unitsunknownstatements</em>'.
   * @see org.xtext.editor.yang.yang.UnitsStatement#getUnitsunknownstatements()
   * @see #getUnitsStatement()
   * @generated
   */
  EReference getUnitsStatement_Unitsunknownstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.DefaultStatement <em>Default Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Default Statement</em>'.
   * @see org.xtext.editor.yang.yang.DefaultStatement
   * @generated
   */
  EClass getDefaultStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.DefaultStatement#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg</em>'.
   * @see org.xtext.editor.yang.yang.DefaultStatement#getArg()
   * @see #getDefaultStatement()
   * @generated
   */
  EAttribute getDefaultStatement_Arg();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.DefaultStatement#getDefaultunknownstatements <em>Defaultunknownstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Defaultunknownstatements</em>'.
   * @see org.xtext.editor.yang.yang.DefaultStatement#getDefaultunknownstatements()
   * @see #getDefaultStatement()
   * @generated
   */
  EReference getDefaultStatement_Defaultunknownstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.StatusStatement <em>Status Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Status Statement</em>'.
   * @see org.xtext.editor.yang.yang.StatusStatement
   * @generated
   */
  EClass getStatusStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.StatusStatement#getStatus <em>Status</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Status</em>'.
   * @see org.xtext.editor.yang.yang.StatusStatement#getStatus()
   * @see #getStatusStatement()
   * @generated
   */
  EAttribute getStatusStatement_Status();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.StatusStatement#getStatusunknownstatements <em>Statusunknownstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statusunknownstatements</em>'.
   * @see org.xtext.editor.yang.yang.StatusStatement#getStatusunknownstatements()
   * @see #getStatusStatement()
   * @generated
   */
  EReference getStatusStatement_Statusunknownstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.RevisionDateStatement <em>Revision Date Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Revision Date Statement</em>'.
   * @see org.xtext.editor.yang.yang.RevisionDateStatement
   * @generated
   */
  EClass getRevisionDateStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.RevisionDateStatement#getDate <em>Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Date</em>'.
   * @see org.xtext.editor.yang.yang.RevisionDateStatement#getDate()
   * @see #getRevisionDateStatement()
   * @generated
   */
  EAttribute getRevisionDateStatement_Date();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.RevisionDateStatement#getRevisiondateunknownstatements <em>Revisiondateunknownstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Revisiondateunknownstatements</em>'.
   * @see org.xtext.editor.yang.yang.RevisionDateStatement#getRevisiondateunknownstatements()
   * @see #getRevisionDateStatement()
   * @generated
   */
  EReference getRevisionDateStatement_Revisiondateunknownstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.UniqueStatement <em>Unique Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unique Statement</em>'.
   * @see org.xtext.editor.yang.yang.UniqueStatement
   * @generated
   */
  EClass getUniqueStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.UniqueStatement#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg</em>'.
   * @see org.xtext.editor.yang.yang.UniqueStatement#getArg()
   * @see #getUniqueStatement()
   * @generated
   */
  EAttribute getUniqueStatement_Arg();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.UniqueStatement#getUniqueunknownstatements <em>Uniqueunknownstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Uniqueunknownstatements</em>'.
   * @see org.xtext.editor.yang.yang.UniqueStatement#getUniqueunknownstatements()
   * @see #getUniqueStatement()
   * @generated
   */
  EReference getUniqueStatement_Uniqueunknownstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.KeyStatement <em>Key Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Key Statement</em>'.
   * @see org.xtext.editor.yang.yang.KeyStatement
   * @generated
   */
  EClass getKeyStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.KeyStatement#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg</em>'.
   * @see org.xtext.editor.yang.yang.KeyStatement#getArg()
   * @see #getKeyStatement()
   * @generated
   */
  EAttribute getKeyStatement_Arg();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.KeyStatement#getKeyunknownstatements <em>Keyunknownstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Keyunknownstatements</em>'.
   * @see org.xtext.editor.yang.yang.KeyStatement#getKeyunknownstatements()
   * @see #getKeyStatement()
   * @generated
   */
  EReference getKeyStatement_Keyunknownstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.OrderedbyStatement <em>Orderedby Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Orderedby Statement</em>'.
   * @see org.xtext.editor.yang.yang.OrderedbyStatement
   * @generated
   */
  EClass getOrderedbyStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.OrderedbyStatement#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg</em>'.
   * @see org.xtext.editor.yang.yang.OrderedbyStatement#getArg()
   * @see #getOrderedbyStatement()
   * @generated
   */
  EAttribute getOrderedbyStatement_Arg();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.OrderedbyStatement#getOrderedbyunknownstatements <em>Orderedbyunknownstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Orderedbyunknownstatements</em>'.
   * @see org.xtext.editor.yang.yang.OrderedbyStatement#getOrderedbyunknownstatements()
   * @see #getOrderedbyStatement()
   * @generated
   */
  EReference getOrderedbyStatement_Orderedbyunknownstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.PresenceStatement <em>Presence Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Presence Statement</em>'.
   * @see org.xtext.editor.yang.yang.PresenceStatement
   * @generated
   */
  EClass getPresenceStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.PresenceStatement#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg</em>'.
   * @see org.xtext.editor.yang.yang.PresenceStatement#getArg()
   * @see #getPresenceStatement()
   * @generated
   */
  EAttribute getPresenceStatement_Arg();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.PresenceStatement#getPresenceunknownstatements <em>Presenceunknownstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Presenceunknownstatements</em>'.
   * @see org.xtext.editor.yang.yang.PresenceStatement#getPresenceunknownstatements()
   * @see #getPresenceStatement()
   * @generated
   */
  EReference getPresenceStatement_Presenceunknownstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.MandatoryStatement <em>Mandatory Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mandatory Statement</em>'.
   * @see org.xtext.editor.yang.yang.MandatoryStatement
   * @generated
   */
  EClass getMandatoryStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.MandatoryStatement#getBoolarg <em>Boolarg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Boolarg</em>'.
   * @see org.xtext.editor.yang.yang.MandatoryStatement#getBoolarg()
   * @see #getMandatoryStatement()
   * @generated
   */
  EAttribute getMandatoryStatement_Boolarg();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.MandatoryStatement#getMandatoryunknownstatements <em>Mandatoryunknownstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mandatoryunknownstatements</em>'.
   * @see org.xtext.editor.yang.yang.MandatoryStatement#getMandatoryunknownstatements()
   * @see #getMandatoryStatement()
   * @generated
   */
  EReference getMandatoryStatement_Mandatoryunknownstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.ConfigStatement <em>Config Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Config Statement</em>'.
   * @see org.xtext.editor.yang.yang.ConfigStatement
   * @generated
   */
  EClass getConfigStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.ConfigStatement#getBoolarg <em>Boolarg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Boolarg</em>'.
   * @see org.xtext.editor.yang.yang.ConfigStatement#getBoolarg()
   * @see #getConfigStatement()
   * @generated
   */
  EAttribute getConfigStatement_Boolarg();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.ConfigStatement#getConfigunknownstatements <em>Configunknownstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Configunknownstatements</em>'.
   * @see org.xtext.editor.yang.yang.ConfigStatement#getConfigunknownstatements()
   * @see #getConfigStatement()
   * @generated
   */
  EReference getConfigStatement_Configunknownstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.FractionDigitsStatement <em>Fraction Digits Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fraction Digits Statement</em>'.
   * @see org.xtext.editor.yang.yang.FractionDigitsStatement
   * @generated
   */
  EClass getFractionDigitsStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.FractionDigitsStatement#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg</em>'.
   * @see org.xtext.editor.yang.yang.FractionDigitsStatement#getArg()
   * @see #getFractionDigitsStatement()
   * @generated
   */
  EAttribute getFractionDigitsStatement_Arg();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.FractionDigitsStatement#getFractiondigitsunknownstatements <em>Fractiondigitsunknownstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fractiondigitsunknownstatements</em>'.
   * @see org.xtext.editor.yang.yang.FractionDigitsStatement#getFractiondigitsunknownstatements()
   * @see #getFractionDigitsStatement()
   * @generated
   */
  EReference getFractionDigitsStatement_Fractiondigitsunknownstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.IfFeatureStatement <em>If Feature Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Feature Statement</em>'.
   * @see org.xtext.editor.yang.yang.IfFeatureStatement
   * @generated
   */
  EClass getIfFeatureStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.IfFeatureStatement#getPref <em>Pref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pref</em>'.
   * @see org.xtext.editor.yang.yang.IfFeatureStatement#getPref()
   * @see #getIfFeatureStatement()
   * @generated
   */
  EAttribute getIfFeatureStatement_Pref();

  /**
   * Returns the meta object for the reference '{@link org.xtext.editor.yang.yang.IfFeatureStatement#getIdent <em>Ident</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ident</em>'.
   * @see org.xtext.editor.yang.yang.IfFeatureStatement#getIdent()
   * @see #getIfFeatureStatement()
   * @generated
   */
  EReference getIfFeatureStatement_Ident();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.IfFeatureStatement#getIffeatureunknownstatements <em>Iffeatureunknownstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Iffeatureunknownstatements</em>'.
   * @see org.xtext.editor.yang.yang.IfFeatureStatement#getIffeatureunknownstatements()
   * @see #getIfFeatureStatement()
   * @generated
   */
  EReference getIfFeatureStatement_Iffeatureunknownstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.BaseStatement <em>Base Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Base Statement</em>'.
   * @see org.xtext.editor.yang.yang.BaseStatement
   * @generated
   */
  EClass getBaseStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.BaseStatement#getPref <em>Pref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pref</em>'.
   * @see org.xtext.editor.yang.yang.BaseStatement#getPref()
   * @see #getBaseStatement()
   * @generated
   */
  EAttribute getBaseStatement_Pref();

  /**
   * Returns the meta object for the reference '{@link org.xtext.editor.yang.yang.BaseStatement#getIdent <em>Ident</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ident</em>'.
   * @see org.xtext.editor.yang.yang.BaseStatement#getIdent()
   * @see #getBaseStatement()
   * @generated
   */
  EReference getBaseStatement_Ident();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.BaseStatement#getBaseunknownstatements <em>Baseunknownstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Baseunknownstatements</em>'.
   * @see org.xtext.editor.yang.yang.BaseStatement#getBaseunknownstatements()
   * @see #getBaseStatement()
   * @generated
   */
  EReference getBaseStatement_Baseunknownstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.YinElementStatement <em>Yin Element Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Yin Element Statement</em>'.
   * @see org.xtext.editor.yang.yang.YinElementStatement
   * @generated
   */
  EClass getYinElementStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.YinElementStatement#getBoolarg <em>Boolarg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Boolarg</em>'.
   * @see org.xtext.editor.yang.yang.YinElementStatement#getBoolarg()
   * @see #getYinElementStatement()
   * @generated
   */
  EAttribute getYinElementStatement_Boolarg();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.YinElementStatement#getYinelementunknownstatements <em>Yinelementunknownstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Yinelementunknownstatements</em>'.
   * @see org.xtext.editor.yang.yang.YinElementStatement#getYinelementunknownstatements()
   * @see #getYinElementStatement()
   * @generated
   */
  EReference getYinElementStatement_Yinelementunknownstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.MinElementsStatement <em>Min Elements Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Min Elements Statement</em>'.
   * @see org.xtext.editor.yang.yang.MinElementsStatement
   * @generated
   */
  EClass getMinElementsStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.MinElementsStatement#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg</em>'.
   * @see org.xtext.editor.yang.yang.MinElementsStatement#getArg()
   * @see #getMinElementsStatement()
   * @generated
   */
  EAttribute getMinElementsStatement_Arg();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.MinElementsStatement#getMinelementsunknownstatements <em>Minelementsunknownstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Minelementsunknownstatements</em>'.
   * @see org.xtext.editor.yang.yang.MinElementsStatement#getMinelementsunknownstatements()
   * @see #getMinElementsStatement()
   * @generated
   */
  EReference getMinElementsStatement_Minelementsunknownstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.MaxElementsStatement <em>Max Elements Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Max Elements Statement</em>'.
   * @see org.xtext.editor.yang.yang.MaxElementsStatement
   * @generated
   */
  EClass getMaxElementsStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.MaxElementsStatement#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg</em>'.
   * @see org.xtext.editor.yang.yang.MaxElementsStatement#getArg()
   * @see #getMaxElementsStatement()
   * @generated
   */
  EAttribute getMaxElementsStatement_Arg();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.MaxElementsStatement#getMaxelementsunknownstatements <em>Maxelementsunknownstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Maxelementsunknownstatements</em>'.
   * @see org.xtext.editor.yang.yang.MaxElementsStatement#getMaxelementsunknownstatements()
   * @see #getMaxElementsStatement()
   * @generated
   */
  EReference getMaxElementsStatement_Maxelementsunknownstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.UnknownStatement <em>Unknown Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unknown Statement</em>'.
   * @see org.xtext.editor.yang.yang.UnknownStatement
   * @generated
   */
  EClass getUnknownStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.UnknownStatement#getPref <em>Pref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pref</em>'.
   * @see org.xtext.editor.yang.yang.UnknownStatement#getPref()
   * @see #getUnknownStatement()
   * @generated
   */
  EAttribute getUnknownStatement_Pref();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.UnknownStatement#getNamestat <em>Namestat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Namestat</em>'.
   * @see org.xtext.editor.yang.yang.UnknownStatement#getNamestat()
   * @see #getUnknownStatement()
   * @generated
   */
  EAttribute getUnknownStatement_Namestat();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.UnknownStatement#getArgument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Argument</em>'.
   * @see org.xtext.editor.yang.yang.UnknownStatement#getArgument()
   * @see #getUnknownStatement()
   * @generated
   */
  EAttribute getUnknownStatement_Argument();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.UnknownStatement#getUnknownsubstatements <em>Unknownsubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Unknownsubstatements</em>'.
   * @see org.xtext.editor.yang.yang.UnknownStatement#getUnknownsubstatements()
   * @see #getUnknownStatement()
   * @generated
   */
  EReference getUnknownStatement_Unknownsubstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.UnknownSubstatements <em>Unknown Substatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unknown Substatements</em>'.
   * @see org.xtext.editor.yang.yang.UnknownSubstatements
   * @generated
   */
  EClass getUnknownSubstatements();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.UnknownSubstatements#getPref <em>Pref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pref</em>'.
   * @see org.xtext.editor.yang.yang.UnknownSubstatements#getPref()
   * @see #getUnknownSubstatements()
   * @generated
   */
  EAttribute getUnknownSubstatements_Pref();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.UnknownSubstatements#getNamestat <em>Namestat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Namestat</em>'.
   * @see org.xtext.editor.yang.yang.UnknownSubstatements#getNamestat()
   * @see #getUnknownSubstatements()
   * @generated
   */
  EAttribute getUnknownSubstatements_Namestat();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.UnknownSubstatements#getArgument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Argument</em>'.
   * @see org.xtext.editor.yang.yang.UnknownSubstatements#getArgument()
   * @see #getUnknownSubstatements()
   * @generated
   */
  EAttribute getUnknownSubstatements_Argument();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.UnknownSubstatements#getUnknownsubstatements <em>Unknownsubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Unknownsubstatements</em>'.
   * @see org.xtext.editor.yang.yang.UnknownSubstatements#getUnknownsubstatements()
   * @see #getUnknownSubstatements()
   * @generated
   */
  EReference getUnknownSubstatements_Unknownsubstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.RangeStatement <em>Range Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Range Statement</em>'.
   * @see org.xtext.editor.yang.yang.RangeStatement
   * @generated
   */
  EClass getRangeStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.RangeStatement#getRange <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Range</em>'.
   * @see org.xtext.editor.yang.yang.RangeStatement#getRange()
   * @see #getRangeStatement()
   * @generated
   */
  EAttribute getRangeStatement_Range();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.RangeStatement#getRangesubstatements <em>Rangesubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rangesubstatements</em>'.
   * @see org.xtext.editor.yang.yang.RangeStatement#getRangesubstatements()
   * @see #getRangeStatement()
   * @generated
   */
  EReference getRangeStatement_Rangesubstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.PatternStatement <em>Pattern Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pattern Statement</em>'.
   * @see org.xtext.editor.yang.yang.PatternStatement
   * @generated
   */
  EClass getPatternStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.PatternStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.editor.yang.yang.PatternStatement#getName()
   * @see #getPatternStatement()
   * @generated
   */
  EAttribute getPatternStatement_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.PatternStatement#getPatternsubstatements <em>Patternsubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Patternsubstatements</em>'.
   * @see org.xtext.editor.yang.yang.PatternStatement#getPatternsubstatements()
   * @see #getPatternStatement()
   * @generated
   */
  EReference getPatternStatement_Patternsubstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.LengthStatement <em>Length Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Length Statement</em>'.
   * @see org.xtext.editor.yang.yang.LengthStatement
   * @generated
   */
  EClass getLengthStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.LengthStatement#getLength <em>Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Length</em>'.
   * @see org.xtext.editor.yang.yang.LengthStatement#getLength()
   * @see #getLengthStatement()
   * @generated
   */
  EAttribute getLengthStatement_Length();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.LengthStatement#getLengthsubstatements <em>Lengthsubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Lengthsubstatements</em>'.
   * @see org.xtext.editor.yang.yang.LengthStatement#getLengthsubstatements()
   * @see #getLengthStatement()
   * @generated
   */
  EReference getLengthStatement_Lengthsubstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.MustStatement <em>Must Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Must Statement</em>'.
   * @see org.xtext.editor.yang.yang.MustStatement
   * @generated
   */
  EClass getMustStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.MustStatement#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg</em>'.
   * @see org.xtext.editor.yang.yang.MustStatement#getArg()
   * @see #getMustStatement()
   * @generated
   */
  EAttribute getMustStatement_Arg();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.MustStatement#getMustsubstatements <em>Mustsubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mustsubstatements</em>'.
   * @see org.xtext.editor.yang.yang.MustStatement#getMustsubstatements()
   * @see #getMustStatement()
   * @generated
   */
  EReference getMustStatement_Mustsubstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.MultipleSubstatement <em>Multiple Substatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiple Substatement</em>'.
   * @see org.xtext.editor.yang.yang.MultipleSubstatement
   * @generated
   */
  EClass getMultipleSubstatement();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.RpcStatement <em>Rpc Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rpc Statement</em>'.
   * @see org.xtext.editor.yang.yang.RpcStatement
   * @generated
   */
  EClass getRpcStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.RpcStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.editor.yang.yang.RpcStatement#getName()
   * @see #getRpcStatement()
   * @generated
   */
  EAttribute getRpcStatement_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.RpcStatement#getRpcsubstatements <em>Rpcsubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rpcsubstatements</em>'.
   * @see org.xtext.editor.yang.yang.RpcStatement#getRpcsubstatements()
   * @see #getRpcStatement()
   * @generated
   */
  EReference getRpcStatement_Rpcsubstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.RpcSubstatement <em>Rpc Substatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rpc Substatement</em>'.
   * @see org.xtext.editor.yang.yang.RpcSubstatement
   * @generated
   */
  EClass getRpcSubstatement();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.InputStatement <em>Input Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input Statement</em>'.
   * @see org.xtext.editor.yang.yang.InputStatement
   * @generated
   */
  EClass getInputStatement();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.InputStatement#getInputsubstatements <em>Inputsubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Inputsubstatements</em>'.
   * @see org.xtext.editor.yang.yang.InputStatement#getInputsubstatements()
   * @see #getInputStatement()
   * @generated
   */
  EReference getInputStatement_Inputsubstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.InputSubstatement <em>Input Substatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input Substatement</em>'.
   * @see org.xtext.editor.yang.yang.InputSubstatement
   * @generated
   */
  EClass getInputSubstatement();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.OutputStatement <em>Output Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output Statement</em>'.
   * @see org.xtext.editor.yang.yang.OutputStatement
   * @generated
   */
  EClass getOutputStatement();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.OutputStatement#getOutputsubstatements <em>Outputsubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Outputsubstatements</em>'.
   * @see org.xtext.editor.yang.yang.OutputStatement#getOutputsubstatements()
   * @see #getOutputStatement()
   * @generated
   */
  EReference getOutputStatement_Outputsubstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.OutputSubstatement <em>Output Substatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output Substatement</em>'.
   * @see org.xtext.editor.yang.yang.OutputSubstatement
   * @generated
   */
  EClass getOutputSubstatement();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.NotificationStatement <em>Notification Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Notification Statement</em>'.
   * @see org.xtext.editor.yang.yang.NotificationStatement
   * @generated
   */
  EClass getNotificationStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.NotificationStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.editor.yang.yang.NotificationStatement#getName()
   * @see #getNotificationStatement()
   * @generated
   */
  EAttribute getNotificationStatement_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.NotificationStatement#getNotificationsubstatements <em>Notificationsubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Notificationsubstatements</em>'.
   * @see org.xtext.editor.yang.yang.NotificationStatement#getNotificationsubstatements()
   * @see #getNotificationStatement()
   * @generated
   */
  EReference getNotificationStatement_Notificationsubstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.NotificationSubstatement <em>Notification Substatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Notification Substatement</em>'.
   * @see org.xtext.editor.yang.yang.NotificationSubstatement
   * @generated
   */
  EClass getNotificationSubstatement();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.ContainerStatement <em>Container Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Container Statement</em>'.
   * @see org.xtext.editor.yang.yang.ContainerStatement
   * @generated
   */
  EClass getContainerStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.ContainerStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.editor.yang.yang.ContainerStatement#getName()
   * @see #getContainerStatement()
   * @generated
   */
  EAttribute getContainerStatement_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.ContainerStatement#getContainersubstatements <em>Containersubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Containersubstatements</em>'.
   * @see org.xtext.editor.yang.yang.ContainerStatement#getContainersubstatements()
   * @see #getContainerStatement()
   * @generated
   */
  EReference getContainerStatement_Containersubstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.ContainerSubstatement <em>Container Substatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Container Substatement</em>'.
   * @see org.xtext.editor.yang.yang.ContainerSubstatement
   * @generated
   */
  EClass getContainerSubstatement();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.ListStatement <em>List Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List Statement</em>'.
   * @see org.xtext.editor.yang.yang.ListStatement
   * @generated
   */
  EClass getListStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.ListStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.editor.yang.yang.ListStatement#getName()
   * @see #getListStatement()
   * @generated
   */
  EAttribute getListStatement_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.ListStatement#getListsubstatements <em>Listsubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Listsubstatements</em>'.
   * @see org.xtext.editor.yang.yang.ListStatement#getListsubstatements()
   * @see #getListStatement()
   * @generated
   */
  EReference getListStatement_Listsubstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.ListSubstatement <em>List Substatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List Substatement</em>'.
   * @see org.xtext.editor.yang.yang.ListSubstatement
   * @generated
   */
  EClass getListSubstatement();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.GroupingStatement <em>Grouping Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Grouping Statement</em>'.
   * @see org.xtext.editor.yang.yang.GroupingStatement
   * @generated
   */
  EClass getGroupingStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.GroupingStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.editor.yang.yang.GroupingStatement#getName()
   * @see #getGroupingStatement()
   * @generated
   */
  EAttribute getGroupingStatement_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.GroupingStatement#getGroupingsubstatements <em>Groupingsubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Groupingsubstatements</em>'.
   * @see org.xtext.editor.yang.yang.GroupingStatement#getGroupingsubstatements()
   * @see #getGroupingStatement()
   * @generated
   */
  EReference getGroupingStatement_Groupingsubstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.GroupingSubstatement <em>Grouping Substatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Grouping Substatement</em>'.
   * @see org.xtext.editor.yang.yang.GroupingSubstatement
   * @generated
   */
  EClass getGroupingSubstatement();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.LeafStatement <em>Leaf Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Leaf Statement</em>'.
   * @see org.xtext.editor.yang.yang.LeafStatement
   * @generated
   */
  EClass getLeafStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.LeafStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.editor.yang.yang.LeafStatement#getName()
   * @see #getLeafStatement()
   * @generated
   */
  EAttribute getLeafStatement_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.LeafStatement#getLeafsubstatements <em>Leafsubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Leafsubstatements</em>'.
   * @see org.xtext.editor.yang.yang.LeafStatement#getLeafsubstatements()
   * @see #getLeafStatement()
   * @generated
   */
  EReference getLeafStatement_Leafsubstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.LeafSubstatement <em>Leaf Substatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Leaf Substatement</em>'.
   * @see org.xtext.editor.yang.yang.LeafSubstatement
   * @generated
   */
  EClass getLeafSubstatement();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.LeafListStatement <em>Leaf List Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Leaf List Statement</em>'.
   * @see org.xtext.editor.yang.yang.LeafListStatement
   * @generated
   */
  EClass getLeafListStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.LeafListStatement#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg</em>'.
   * @see org.xtext.editor.yang.yang.LeafListStatement#getArg()
   * @see #getLeafListStatement()
   * @generated
   */
  EAttribute getLeafListStatement_Arg();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.LeafListStatement#getLeaflistsubstatements <em>Leaflistsubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Leaflistsubstatements</em>'.
   * @see org.xtext.editor.yang.yang.LeafListStatement#getLeaflistsubstatements()
   * @see #getLeafListStatement()
   * @generated
   */
  EReference getLeafListStatement_Leaflistsubstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.LeafListSubstatement <em>Leaf List Substatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Leaf List Substatement</em>'.
   * @see org.xtext.editor.yang.yang.LeafListSubstatement
   * @generated
   */
  EClass getLeafListSubstatement();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.ChoiceStatement <em>Choice Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Choice Statement</em>'.
   * @see org.xtext.editor.yang.yang.ChoiceStatement
   * @generated
   */
  EClass getChoiceStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.ChoiceStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.editor.yang.yang.ChoiceStatement#getName()
   * @see #getChoiceStatement()
   * @generated
   */
  EAttribute getChoiceStatement_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.ChoiceStatement#getChoicesubstatements <em>Choicesubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Choicesubstatements</em>'.
   * @see org.xtext.editor.yang.yang.ChoiceStatement#getChoicesubstatements()
   * @see #getChoiceStatement()
   * @generated
   */
  EReference getChoiceStatement_Choicesubstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.ChoiceSubstatement <em>Choice Substatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Choice Substatement</em>'.
   * @see org.xtext.editor.yang.yang.ChoiceSubstatement
   * @generated
   */
  EClass getChoiceSubstatement();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.CaseStatement <em>Case Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Case Statement</em>'.
   * @see org.xtext.editor.yang.yang.CaseStatement
   * @generated
   */
  EClass getCaseStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.CaseStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.editor.yang.yang.CaseStatement#getName()
   * @see #getCaseStatement()
   * @generated
   */
  EAttribute getCaseStatement_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.CaseStatement#getCasesubstatements <em>Casesubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Casesubstatements</em>'.
   * @see org.xtext.editor.yang.yang.CaseStatement#getCasesubstatements()
   * @see #getCaseStatement()
   * @generated
   */
  EReference getCaseStatement_Casesubstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.CaseSubstatement <em>Case Substatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Case Substatement</em>'.
   * @see org.xtext.editor.yang.yang.CaseSubstatement
   * @generated
   */
  EClass getCaseSubstatement();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.AnyxmlStatement <em>Anyxml Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Anyxml Statement</em>'.
   * @see org.xtext.editor.yang.yang.AnyxmlStatement
   * @generated
   */
  EClass getAnyxmlStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.AnyxmlStatement#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg</em>'.
   * @see org.xtext.editor.yang.yang.AnyxmlStatement#getArg()
   * @see #getAnyxmlStatement()
   * @generated
   */
  EAttribute getAnyxmlStatement_Arg();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.AnyxmlStatement#getAnyxmlsubstatements <em>Anyxmlsubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Anyxmlsubstatements</em>'.
   * @see org.xtext.editor.yang.yang.AnyxmlStatement#getAnyxmlsubstatements()
   * @see #getAnyxmlStatement()
   * @generated
   */
  EReference getAnyxmlStatement_Anyxmlsubstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.AnyxmlSubstatement <em>Anyxml Substatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Anyxml Substatement</em>'.
   * @see org.xtext.editor.yang.yang.AnyxmlSubstatement
   * @generated
   */
  EClass getAnyxmlSubstatement();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.UsesStatement <em>Uses Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Uses Statement</em>'.
   * @see org.xtext.editor.yang.yang.UsesStatement
   * @generated
   */
  EClass getUsesStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.UsesStatement#getPre <em>Pre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pre</em>'.
   * @see org.xtext.editor.yang.yang.UsesStatement#getPre()
   * @see #getUsesStatement()
   * @generated
   */
  EAttribute getUsesStatement_Pre();

  /**
   * Returns the meta object for the reference '{@link org.xtext.editor.yang.yang.UsesStatement#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Arg</em>'.
   * @see org.xtext.editor.yang.yang.UsesStatement#getArg()
   * @see #getUsesStatement()
   * @generated
   */
  EReference getUsesStatement_Arg();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.UsesStatement#getUsessubstatements <em>Usessubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Usessubstatements</em>'.
   * @see org.xtext.editor.yang.yang.UsesStatement#getUsessubstatements()
   * @see #getUsesStatement()
   * @generated
   */
  EReference getUsesStatement_Usessubstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.UsesSubstatement <em>Uses Substatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Uses Substatement</em>'.
   * @see org.xtext.editor.yang.yang.UsesSubstatement
   * @generated
   */
  EClass getUsesSubstatement();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.AugmentUsesStatement <em>Augment Uses Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Augment Uses Statement</em>'.
   * @see org.xtext.editor.yang.yang.AugmentUsesStatement
   * @generated
   */
  EClass getAugmentUsesStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.AugmentUsesStatement#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg</em>'.
   * @see org.xtext.editor.yang.yang.AugmentUsesStatement#getArg()
   * @see #getAugmentUsesStatement()
   * @generated
   */
  EAttribute getAugmentUsesStatement_Arg();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.AugmentUsesStatement#getAugmentsubstatements <em>Augmentsubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Augmentsubstatements</em>'.
   * @see org.xtext.editor.yang.yang.AugmentUsesStatement#getAugmentsubstatements()
   * @see #getAugmentUsesStatement()
   * @generated
   */
  EReference getAugmentUsesStatement_Augmentsubstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.AugmentStatement <em>Augment Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Augment Statement</em>'.
   * @see org.xtext.editor.yang.yang.AugmentStatement
   * @generated
   */
  EClass getAugmentStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.AugmentStatement#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg</em>'.
   * @see org.xtext.editor.yang.yang.AugmentStatement#getArg()
   * @see #getAugmentStatement()
   * @generated
   */
  EAttribute getAugmentStatement_Arg();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.AugmentStatement#getAugmentsubstatements <em>Augmentsubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Augmentsubstatements</em>'.
   * @see org.xtext.editor.yang.yang.AugmentStatement#getAugmentsubstatements()
   * @see #getAugmentStatement()
   * @generated
   */
  EReference getAugmentStatement_Augmentsubstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.AugmentSubstatement <em>Augment Substatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Augment Substatement</em>'.
   * @see org.xtext.editor.yang.yang.AugmentSubstatement
   * @generated
   */
  EClass getAugmentSubstatement();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.RefineStatement <em>Refine Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Refine Statement</em>'.
   * @see org.xtext.editor.yang.yang.RefineStatement
   * @generated
   */
  EClass getRefineStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.RefineStatement#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg</em>'.
   * @see org.xtext.editor.yang.yang.RefineStatement#getArg()
   * @see #getRefineStatement()
   * @generated
   */
  EAttribute getRefineStatement_Arg();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.RefineStatement#getRefinesubstatements <em>Refinesubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Refinesubstatements</em>'.
   * @see org.xtext.editor.yang.yang.RefineStatement#getRefinesubstatements()
   * @see #getRefineStatement()
   * @generated
   */
  EReference getRefineStatement_Refinesubstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.RefineSubstatement <em>Refine Substatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Refine Substatement</em>'.
   * @see org.xtext.editor.yang.yang.RefineSubstatement
   * @generated
   */
  EClass getRefineSubstatement();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.DeviationStatement <em>Deviation Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Deviation Statement</em>'.
   * @see org.xtext.editor.yang.yang.DeviationStatement
   * @generated
   */
  EClass getDeviationStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.DeviationStatement#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg</em>'.
   * @see org.xtext.editor.yang.yang.DeviationStatement#getArg()
   * @see #getDeviationStatement()
   * @generated
   */
  EAttribute getDeviationStatement_Arg();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.DeviationStatement#getDeviationsubstatements <em>Deviationsubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Deviationsubstatements</em>'.
   * @see org.xtext.editor.yang.yang.DeviationStatement#getDeviationsubstatements()
   * @see #getDeviationStatement()
   * @generated
   */
  EReference getDeviationStatement_Deviationsubstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.DeviationSubstatement <em>Deviation Substatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Deviation Substatement</em>'.
   * @see org.xtext.editor.yang.yang.DeviationSubstatement
   * @generated
   */
  EClass getDeviationSubstatement();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.DeviateStatement <em>Deviate Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Deviate Statement</em>'.
   * @see org.xtext.editor.yang.yang.DeviateStatement
   * @generated
   */
  EClass getDeviateStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.DeviateStatement#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg</em>'.
   * @see org.xtext.editor.yang.yang.DeviateStatement#getArg()
   * @see #getDeviateStatement()
   * @generated
   */
  EAttribute getDeviateStatement_Arg();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.DeviateStatement#getDeviatesubstatements <em>Deviatesubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Deviatesubstatements</em>'.
   * @see org.xtext.editor.yang.yang.DeviateStatement#getDeviatesubstatements()
   * @see #getDeviateStatement()
   * @generated
   */
  EReference getDeviateStatement_Deviatesubstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.DeviateSubstatement <em>Deviate Substatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Deviate Substatement</em>'.
   * @see org.xtext.editor.yang.yang.DeviateSubstatement
   * @generated
   */
  EClass getDeviateSubstatement();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.ExtensionStatement <em>Extension Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Extension Statement</em>'.
   * @see org.xtext.editor.yang.yang.ExtensionStatement
   * @generated
   */
  EClass getExtensionStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.ExtensionStatement#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg</em>'.
   * @see org.xtext.editor.yang.yang.ExtensionStatement#getArg()
   * @see #getExtensionStatement()
   * @generated
   */
  EAttribute getExtensionStatement_Arg();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.ExtensionStatement#getExtensionsubstatements <em>Extensionsubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Extensionsubstatements</em>'.
   * @see org.xtext.editor.yang.yang.ExtensionStatement#getExtensionsubstatements()
   * @see #getExtensionStatement()
   * @generated
   */
  EReference getExtensionStatement_Extensionsubstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.ExtensionSubstatement <em>Extension Substatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Extension Substatement</em>'.
   * @see org.xtext.editor.yang.yang.ExtensionSubstatement
   * @generated
   */
  EClass getExtensionSubstatement();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.ArgumentStatement <em>Argument Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Argument Statement</em>'.
   * @see org.xtext.editor.yang.yang.ArgumentStatement
   * @generated
   */
  EClass getArgumentStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.ArgumentStatement#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg</em>'.
   * @see org.xtext.editor.yang.yang.ArgumentStatement#getArg()
   * @see #getArgumentStatement()
   * @generated
   */
  EAttribute getArgumentStatement_Arg();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.ArgumentStatement#getArgumentsubstatements <em>Argumentsubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Argumentsubstatements</em>'.
   * @see org.xtext.editor.yang.yang.ArgumentStatement#getArgumentsubstatements()
   * @see #getArgumentStatement()
   * @generated
   */
  EReference getArgumentStatement_Argumentsubstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.ArgumentSubstatement <em>Argument Substatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Argument Substatement</em>'.
   * @see org.xtext.editor.yang.yang.ArgumentSubstatement
   * @generated
   */
  EClass getArgumentSubstatement();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.IdentityStatement <em>Identity Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Identity Statement</em>'.
   * @see org.xtext.editor.yang.yang.IdentityStatement
   * @generated
   */
  EClass getIdentityStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.IdentityStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.editor.yang.yang.IdentityStatement#getName()
   * @see #getIdentityStatement()
   * @generated
   */
  EAttribute getIdentityStatement_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.IdentityStatement#getIdentitysubstatements <em>Identitysubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Identitysubstatements</em>'.
   * @see org.xtext.editor.yang.yang.IdentityStatement#getIdentitysubstatements()
   * @see #getIdentityStatement()
   * @generated
   */
  EReference getIdentityStatement_Identitysubstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.IdentitySubstatement <em>Identity Substatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Identity Substatement</em>'.
   * @see org.xtext.editor.yang.yang.IdentitySubstatement
   * @generated
   */
  EClass getIdentitySubstatement();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.FeatureStatement <em>Feature Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature Statement</em>'.
   * @see org.xtext.editor.yang.yang.FeatureStatement
   * @generated
   */
  EClass getFeatureStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.FeatureStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.editor.yang.yang.FeatureStatement#getName()
   * @see #getFeatureStatement()
   * @generated
   */
  EAttribute getFeatureStatement_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.FeatureStatement#getFeaturesubstatements <em>Featuresubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Featuresubstatements</em>'.
   * @see org.xtext.editor.yang.yang.FeatureStatement#getFeaturesubstatements()
   * @see #getFeatureStatement()
   * @generated
   */
  EReference getFeatureStatement_Featuresubstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.FeatureSubstatement <em>Feature Substatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature Substatement</em>'.
   * @see org.xtext.editor.yang.yang.FeatureSubstatement
   * @generated
   */
  EClass getFeatureSubstatement();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.BelongsToStatement <em>Belongs To Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Belongs To Statement</em>'.
   * @see org.xtext.editor.yang.yang.BelongsToStatement
   * @generated
   */
  EClass getBelongsToStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.BelongsToStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.editor.yang.yang.BelongsToStatement#getName()
   * @see #getBelongsToStatement()
   * @generated
   */
  EAttribute getBelongsToStatement_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.BelongsToStatement#getBelongstosubstatement <em>Belongstosubstatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Belongstosubstatement</em>'.
   * @see org.xtext.editor.yang.yang.BelongsToStatement#getBelongstosubstatement()
   * @see #getBelongsToStatement()
   * @generated
   */
  EReference getBelongsToStatement_Belongstosubstatement();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.BelongsToSubstatement <em>Belongs To Substatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Belongs To Substatement</em>'.
   * @see org.xtext.editor.yang.yang.BelongsToSubstatement
   * @generated
   */
  EClass getBelongsToSubstatement();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.TypedefStatement <em>Typedef Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Typedef Statement</em>'.
   * @see org.xtext.editor.yang.yang.TypedefStatement
   * @generated
   */
  EClass getTypedefStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.TypedefStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.editor.yang.yang.TypedefStatement#getName()
   * @see #getTypedefStatement()
   * @generated
   */
  EAttribute getTypedefStatement_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.TypedefStatement#getTypedefsubstatemnet <em>Typedefsubstatemnet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Typedefsubstatemnet</em>'.
   * @see org.xtext.editor.yang.yang.TypedefStatement#getTypedefsubstatemnet()
   * @see #getTypedefStatement()
   * @generated
   */
  EReference getTypedefStatement_Typedefsubstatemnet();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.TypedefSubstatement <em>Typedef Substatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Typedef Substatement</em>'.
   * @see org.xtext.editor.yang.yang.TypedefSubstatement
   * @generated
   */
  EClass getTypedefSubstatement();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.TypeStatement <em>Type Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Statement</em>'.
   * @see org.xtext.editor.yang.yang.TypeStatement
   * @generated
   */
  EClass getTypeStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.editor.yang.yang.TypeStatement#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.editor.yang.yang.TypeStatement#getType()
   * @see #getTypeStatement()
   * @generated
   */
  EReference getTypeStatement_Type();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.TypeStatement#getPre <em>Pre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pre</em>'.
   * @see org.xtext.editor.yang.yang.TypeStatement#getPre()
   * @see #getTypeStatement()
   * @generated
   */
  EAttribute getTypeStatement_Pre();

  /**
   * Returns the meta object for the reference '{@link org.xtext.editor.yang.yang.TypeStatement#getImporttype <em>Importtype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Importtype</em>'.
   * @see org.xtext.editor.yang.yang.TypeStatement#getImporttype()
   * @see #getTypeStatement()
   * @generated
   */
  EReference getTypeStatement_Importtype();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.TypeStatement#getTypesubstatements <em>Typesubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Typesubstatements</em>'.
   * @see org.xtext.editor.yang.yang.TypeStatement#getTypesubstatements()
   * @see #getTypeStatement()
   * @generated
   */
  EReference getTypeStatement_Typesubstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.TypeSubStatement <em>Type Sub Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Sub Statement</em>'.
   * @see org.xtext.editor.yang.yang.TypeSubStatement
   * @generated
   */
  EClass getTypeSubStatement();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.BitStatement <em>Bit Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bit Statement</em>'.
   * @see org.xtext.editor.yang.yang.BitStatement
   * @generated
   */
  EClass getBitStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.BitStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.editor.yang.yang.BitStatement#getName()
   * @see #getBitStatement()
   * @generated
   */
  EAttribute getBitStatement_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.BitStatement#getBitsubstatements <em>Bitsubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Bitsubstatements</em>'.
   * @see org.xtext.editor.yang.yang.BitStatement#getBitsubstatements()
   * @see #getBitStatement()
   * @generated
   */
  EReference getBitStatement_Bitsubstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.BitSubstatement <em>Bit Substatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bit Substatement</em>'.
   * @see org.xtext.editor.yang.yang.BitSubstatement
   * @generated
   */
  EClass getBitSubstatement();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.EnumStatement <em>Enum Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Statement</em>'.
   * @see org.xtext.editor.yang.yang.EnumStatement
   * @generated
   */
  EClass getEnumStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.EnumStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.editor.yang.yang.EnumStatement#getName()
   * @see #getEnumStatement()
   * @generated
   */
  EAttribute getEnumStatement_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.EnumStatement#getEnumsubstatements <em>Enumsubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Enumsubstatements</em>'.
   * @see org.xtext.editor.yang.yang.EnumStatement#getEnumsubstatements()
   * @see #getEnumStatement()
   * @generated
   */
  EReference getEnumStatement_Enumsubstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.EnumSubstatement <em>Enum Substatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Substatement</em>'.
   * @see org.xtext.editor.yang.yang.EnumSubstatement
   * @generated
   */
  EClass getEnumSubstatement();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.ImportStatement <em>Import Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import Statement</em>'.
   * @see org.xtext.editor.yang.yang.ImportStatement
   * @generated
   */
  EClass getImportStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.ImportStatement#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see org.xtext.editor.yang.yang.ImportStatement#getImportURI()
   * @see #getImportStatement()
   * @generated
   */
  EAttribute getImportStatement_ImportURI();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.ImportStatement#getImportsubstatements <em>Importsubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Importsubstatements</em>'.
   * @see org.xtext.editor.yang.yang.ImportStatement#getImportsubstatements()
   * @see #getImportStatement()
   * @generated
   */
  EReference getImportStatement_Importsubstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.ImportSubstatements <em>Import Substatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import Substatements</em>'.
   * @see org.xtext.editor.yang.yang.ImportSubstatements
   * @generated
   */
  EClass getImportSubstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.IncludeStatement <em>Include Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Include Statement</em>'.
   * @see org.xtext.editor.yang.yang.IncludeStatement
   * @generated
   */
  EClass getIncludeStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.IncludeStatement#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see org.xtext.editor.yang.yang.IncludeStatement#getImportURI()
   * @see #getIncludeStatement()
   * @generated
   */
  EAttribute getIncludeStatement_ImportURI();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.IncludeStatement#getIncludesubstatements <em>Includesubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Includesubstatements</em>'.
   * @see org.xtext.editor.yang.yang.IncludeStatement#getIncludesubstatements()
   * @see #getIncludeStatement()
   * @generated
   */
  EReference getIncludeStatement_Includesubstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.IncludeSubstatements <em>Include Substatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Include Substatements</em>'.
   * @see org.xtext.editor.yang.yang.IncludeSubstatements
   * @generated
   */
  EClass getIncludeSubstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.WhenStatement <em>When Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>When Statement</em>'.
   * @see org.xtext.editor.yang.yang.WhenStatement
   * @generated
   */
  EClass getWhenStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.WhenStatement#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg</em>'.
   * @see org.xtext.editor.yang.yang.WhenStatement#getArg()
   * @see #getWhenStatement()
   * @generated
   */
  EAttribute getWhenStatement_Arg();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.WhenStatement#getWhensubstatements <em>Whensubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Whensubstatements</em>'.
   * @see org.xtext.editor.yang.yang.WhenStatement#getWhensubstatements()
   * @see #getWhenStatement()
   * @generated
   */
  EReference getWhenStatement_Whensubstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.WhenSubstatements <em>When Substatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>When Substatements</em>'.
   * @see org.xtext.editor.yang.yang.WhenSubstatements
   * @generated
   */
  EClass getWhenSubstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.RevisionStatement <em>Revision Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Revision Statement</em>'.
   * @see org.xtext.editor.yang.yang.RevisionStatement
   * @generated
   */
  EClass getRevisionStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.RevisionStatement#getDate <em>Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Date</em>'.
   * @see org.xtext.editor.yang.yang.RevisionStatement#getDate()
   * @see #getRevisionStatement()
   * @generated
   */
  EAttribute getRevisionStatement_Date();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.editor.yang.yang.RevisionStatement#getRevisionsubstatements <em>Revisionsubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Revisionsubstatements</em>'.
   * @see org.xtext.editor.yang.yang.RevisionStatement#getRevisionsubstatements()
   * @see #getRevisionStatement()
   * @generated
   */
  EReference getRevisionStatement_Revisionsubstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.RevisionSubstatements <em>Revision Substatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Revision Substatements</em>'.
   * @see org.xtext.editor.yang.yang.RevisionSubstatements
   * @generated
   */
  EClass getRevisionSubstatements();

  /**
   * Returns the meta object for class '{@link org.xtext.editor.yang.yang.BuiltInType <em>Built In Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Built In Type</em>'.
   * @see org.xtext.editor.yang.yang.BuiltInType
   * @generated
   */
  EClass getBuiltInType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.editor.yang.yang.BuiltInType#getBtype <em>Btype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Btype</em>'.
   * @see org.xtext.editor.yang.yang.BuiltInType#getBtype()
   * @see #getBuiltInType()
   * @generated
   */
  EAttribute getBuiltInType_Btype();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  YangFactory getYangFactory();

} //YangPackage
