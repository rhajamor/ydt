/**
 */
package org.xtext.editor.yang.yang.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xtext.editor.yang.yang.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.editor.yang.yang.YangPackage
 * @generated
 */
public class YangAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static YangPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public YangAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = YangPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected YangSwitch<Adapter> modelSwitch =
    new YangSwitch<Adapter>()
    {
      @Override
      public Adapter caseYangFile(YangFile object)
      {
        return createYangFileAdapter();
      }
      @Override
      public Adapter caseModule(Module object)
      {
        return createModuleAdapter();
      }
      @Override
      public Adapter caseModuleStatement(ModuleStatement object)
      {
        return createModuleStatementAdapter();
      }
      @Override
      public Adapter caseSubModule(SubModule object)
      {
        return createSubModuleAdapter();
      }
      @Override
      public Adapter caseSubmoduleStatement(SubmoduleStatement object)
      {
        return createSubmoduleStatementAdapter();
      }
      @Override
      public Adapter caseDatadefStatement(DatadefStatement object)
      {
        return createDatadefStatementAdapter();
      }
      @Override
      public Adapter caseYangVersionStatement(YangVersionStatement object)
      {
        return createYangVersionStatementAdapter();
      }
      @Override
      public Adapter caseOrganizationStatement(OrganizationStatement object)
      {
        return createOrganizationStatementAdapter();
      }
      @Override
      public Adapter caseContactStatement(ContactStatement object)
      {
        return createContactStatementAdapter();
      }
      @Override
      public Adapter caseDescriptionStatement(DescriptionStatement object)
      {
        return createDescriptionStatementAdapter();
      }
      @Override
      public Adapter caseReferenceStatement(ReferenceStatement object)
      {
        return createReferenceStatementAdapter();
      }
      @Override
      public Adapter caseNamespaceStatement(NamespaceStatement object)
      {
        return createNamespaceStatementAdapter();
      }
      @Override
      public Adapter casePrefixStatement(PrefixStatement object)
      {
        return createPrefixStatementAdapter();
      }
      @Override
      public Adapter caseRequireInstanceStatement(RequireInstanceStatement object)
      {
        return createRequireInstanceStatementAdapter();
      }
      @Override
      public Adapter casePathStatement(PathStatement object)
      {
        return createPathStatementAdapter();
      }
      @Override
      public Adapter casePositionStatement(PositionStatement object)
      {
        return createPositionStatementAdapter();
      }
      @Override
      public Adapter caseValueStatement(ValueStatement object)
      {
        return createValueStatementAdapter();
      }
      @Override
      public Adapter caseErrorAppTagStatement(ErrorAppTagStatement object)
      {
        return createErrorAppTagStatementAdapter();
      }
      @Override
      public Adapter caseErrorMessageStatement(ErrorMessageStatement object)
      {
        return createErrorMessageStatementAdapter();
      }
      @Override
      public Adapter caseUnitsStatement(UnitsStatement object)
      {
        return createUnitsStatementAdapter();
      }
      @Override
      public Adapter caseDefaultStatement(DefaultStatement object)
      {
        return createDefaultStatementAdapter();
      }
      @Override
      public Adapter caseStatusStatement(StatusStatement object)
      {
        return createStatusStatementAdapter();
      }
      @Override
      public Adapter caseRevisionDateStatement(RevisionDateStatement object)
      {
        return createRevisionDateStatementAdapter();
      }
      @Override
      public Adapter caseUniqueStatement(UniqueStatement object)
      {
        return createUniqueStatementAdapter();
      }
      @Override
      public Adapter caseKeyStatement(KeyStatement object)
      {
        return createKeyStatementAdapter();
      }
      @Override
      public Adapter caseOrderedbyStatement(OrderedbyStatement object)
      {
        return createOrderedbyStatementAdapter();
      }
      @Override
      public Adapter casePresenceStatement(PresenceStatement object)
      {
        return createPresenceStatementAdapter();
      }
      @Override
      public Adapter caseMandatoryStatement(MandatoryStatement object)
      {
        return createMandatoryStatementAdapter();
      }
      @Override
      public Adapter caseConfigStatement(ConfigStatement object)
      {
        return createConfigStatementAdapter();
      }
      @Override
      public Adapter caseFractionDigitsStatement(FractionDigitsStatement object)
      {
        return createFractionDigitsStatementAdapter();
      }
      @Override
      public Adapter caseIfFeatureStatement(IfFeatureStatement object)
      {
        return createIfFeatureStatementAdapter();
      }
      @Override
      public Adapter caseBaseStatement(BaseStatement object)
      {
        return createBaseStatementAdapter();
      }
      @Override
      public Adapter caseYinElementStatement(YinElementStatement object)
      {
        return createYinElementStatementAdapter();
      }
      @Override
      public Adapter caseMinElementsStatement(MinElementsStatement object)
      {
        return createMinElementsStatementAdapter();
      }
      @Override
      public Adapter caseMaxElementsStatement(MaxElementsStatement object)
      {
        return createMaxElementsStatementAdapter();
      }
      @Override
      public Adapter caseUnknownStatement(UnknownStatement object)
      {
        return createUnknownStatementAdapter();
      }
      @Override
      public Adapter caseUnknownSubstatements(UnknownSubstatements object)
      {
        return createUnknownSubstatementsAdapter();
      }
      @Override
      public Adapter caseRangeStatement(RangeStatement object)
      {
        return createRangeStatementAdapter();
      }
      @Override
      public Adapter casePatternStatement(PatternStatement object)
      {
        return createPatternStatementAdapter();
      }
      @Override
      public Adapter caseLengthStatement(LengthStatement object)
      {
        return createLengthStatementAdapter();
      }
      @Override
      public Adapter caseMustStatement(MustStatement object)
      {
        return createMustStatementAdapter();
      }
      @Override
      public Adapter caseMultipleSubstatement(MultipleSubstatement object)
      {
        return createMultipleSubstatementAdapter();
      }
      @Override
      public Adapter caseRpcStatement(RpcStatement object)
      {
        return createRpcStatementAdapter();
      }
      @Override
      public Adapter caseRpcSubstatement(RpcSubstatement object)
      {
        return createRpcSubstatementAdapter();
      }
      @Override
      public Adapter caseInputStatement(InputStatement object)
      {
        return createInputStatementAdapter();
      }
      @Override
      public Adapter caseInputSubstatement(InputSubstatement object)
      {
        return createInputSubstatementAdapter();
      }
      @Override
      public Adapter caseOutputStatement(OutputStatement object)
      {
        return createOutputStatementAdapter();
      }
      @Override
      public Adapter caseOutputSubstatement(OutputSubstatement object)
      {
        return createOutputSubstatementAdapter();
      }
      @Override
      public Adapter caseNotificationStatement(NotificationStatement object)
      {
        return createNotificationStatementAdapter();
      }
      @Override
      public Adapter caseNotificationSubstatement(NotificationSubstatement object)
      {
        return createNotificationSubstatementAdapter();
      }
      @Override
      public Adapter caseContainerStatement(ContainerStatement object)
      {
        return createContainerStatementAdapter();
      }
      @Override
      public Adapter caseContainerSubstatement(ContainerSubstatement object)
      {
        return createContainerSubstatementAdapter();
      }
      @Override
      public Adapter caseListStatement(ListStatement object)
      {
        return createListStatementAdapter();
      }
      @Override
      public Adapter caseListSubstatement(ListSubstatement object)
      {
        return createListSubstatementAdapter();
      }
      @Override
      public Adapter caseGroupingStatement(GroupingStatement object)
      {
        return createGroupingStatementAdapter();
      }
      @Override
      public Adapter caseGroupingSubstatement(GroupingSubstatement object)
      {
        return createGroupingSubstatementAdapter();
      }
      @Override
      public Adapter caseLeafStatement(LeafStatement object)
      {
        return createLeafStatementAdapter();
      }
      @Override
      public Adapter caseLeafSubstatement(LeafSubstatement object)
      {
        return createLeafSubstatementAdapter();
      }
      @Override
      public Adapter caseLeafListStatement(LeafListStatement object)
      {
        return createLeafListStatementAdapter();
      }
      @Override
      public Adapter caseLeafListSubstatement(LeafListSubstatement object)
      {
        return createLeafListSubstatementAdapter();
      }
      @Override
      public Adapter caseChoiceStatement(ChoiceStatement object)
      {
        return createChoiceStatementAdapter();
      }
      @Override
      public Adapter caseChoiceSubstatement(ChoiceSubstatement object)
      {
        return createChoiceSubstatementAdapter();
      }
      @Override
      public Adapter caseCaseStatement(CaseStatement object)
      {
        return createCaseStatementAdapter();
      }
      @Override
      public Adapter caseCaseSubstatement(CaseSubstatement object)
      {
        return createCaseSubstatementAdapter();
      }
      @Override
      public Adapter caseAnyxmlStatement(AnyxmlStatement object)
      {
        return createAnyxmlStatementAdapter();
      }
      @Override
      public Adapter caseAnyxmlSubstatement(AnyxmlSubstatement object)
      {
        return createAnyxmlSubstatementAdapter();
      }
      @Override
      public Adapter caseUsesStatement(UsesStatement object)
      {
        return createUsesStatementAdapter();
      }
      @Override
      public Adapter caseUsesSubstatement(UsesSubstatement object)
      {
        return createUsesSubstatementAdapter();
      }
      @Override
      public Adapter caseAugmentUsesStatement(AugmentUsesStatement object)
      {
        return createAugmentUsesStatementAdapter();
      }
      @Override
      public Adapter caseAugmentStatement(AugmentStatement object)
      {
        return createAugmentStatementAdapter();
      }
      @Override
      public Adapter caseAugmentSubstatement(AugmentSubstatement object)
      {
        return createAugmentSubstatementAdapter();
      }
      @Override
      public Adapter caseRefineStatement(RefineStatement object)
      {
        return createRefineStatementAdapter();
      }
      @Override
      public Adapter caseRefineSubstatement(RefineSubstatement object)
      {
        return createRefineSubstatementAdapter();
      }
      @Override
      public Adapter caseDeviationStatement(DeviationStatement object)
      {
        return createDeviationStatementAdapter();
      }
      @Override
      public Adapter caseDeviationSubstatement(DeviationSubstatement object)
      {
        return createDeviationSubstatementAdapter();
      }
      @Override
      public Adapter caseDeviateStatement(DeviateStatement object)
      {
        return createDeviateStatementAdapter();
      }
      @Override
      public Adapter caseDeviateSubstatement(DeviateSubstatement object)
      {
        return createDeviateSubstatementAdapter();
      }
      @Override
      public Adapter caseExtensionStatement(ExtensionStatement object)
      {
        return createExtensionStatementAdapter();
      }
      @Override
      public Adapter caseExtensionSubstatement(ExtensionSubstatement object)
      {
        return createExtensionSubstatementAdapter();
      }
      @Override
      public Adapter caseArgumentStatement(ArgumentStatement object)
      {
        return createArgumentStatementAdapter();
      }
      @Override
      public Adapter caseArgumentSubstatement(ArgumentSubstatement object)
      {
        return createArgumentSubstatementAdapter();
      }
      @Override
      public Adapter caseIdentityStatement(IdentityStatement object)
      {
        return createIdentityStatementAdapter();
      }
      @Override
      public Adapter caseIdentitySubstatement(IdentitySubstatement object)
      {
        return createIdentitySubstatementAdapter();
      }
      @Override
      public Adapter caseFeatureStatement(FeatureStatement object)
      {
        return createFeatureStatementAdapter();
      }
      @Override
      public Adapter caseFeatureSubstatement(FeatureSubstatement object)
      {
        return createFeatureSubstatementAdapter();
      }
      @Override
      public Adapter caseBelongsToStatement(BelongsToStatement object)
      {
        return createBelongsToStatementAdapter();
      }
      @Override
      public Adapter caseBelongsToSubstatement(BelongsToSubstatement object)
      {
        return createBelongsToSubstatementAdapter();
      }
      @Override
      public Adapter caseTypedefStatement(TypedefStatement object)
      {
        return createTypedefStatementAdapter();
      }
      @Override
      public Adapter caseTypedefSubstatement(TypedefSubstatement object)
      {
        return createTypedefSubstatementAdapter();
      }
      @Override
      public Adapter caseTypeStatement(TypeStatement object)
      {
        return createTypeStatementAdapter();
      }
      @Override
      public Adapter caseTypeSubStatement(TypeSubStatement object)
      {
        return createTypeSubStatementAdapter();
      }
      @Override
      public Adapter caseBitStatement(BitStatement object)
      {
        return createBitStatementAdapter();
      }
      @Override
      public Adapter caseBitSubstatement(BitSubstatement object)
      {
        return createBitSubstatementAdapter();
      }
      @Override
      public Adapter caseEnumStatement(EnumStatement object)
      {
        return createEnumStatementAdapter();
      }
      @Override
      public Adapter caseEnumSubstatement(EnumSubstatement object)
      {
        return createEnumSubstatementAdapter();
      }
      @Override
      public Adapter caseImportStatement(ImportStatement object)
      {
        return createImportStatementAdapter();
      }
      @Override
      public Adapter caseImportSubstatements(ImportSubstatements object)
      {
        return createImportSubstatementsAdapter();
      }
      @Override
      public Adapter caseIncludeStatement(IncludeStatement object)
      {
        return createIncludeStatementAdapter();
      }
      @Override
      public Adapter caseIncludeSubstatements(IncludeSubstatements object)
      {
        return createIncludeSubstatementsAdapter();
      }
      @Override
      public Adapter caseWhenStatement(WhenStatement object)
      {
        return createWhenStatementAdapter();
      }
      @Override
      public Adapter caseWhenSubstatements(WhenSubstatements object)
      {
        return createWhenSubstatementsAdapter();
      }
      @Override
      public Adapter caseRevisionStatement(RevisionStatement object)
      {
        return createRevisionStatementAdapter();
      }
      @Override
      public Adapter caseRevisionSubstatements(RevisionSubstatements object)
      {
        return createRevisionSubstatementsAdapter();
      }
      @Override
      public Adapter caseBuiltInType(BuiltInType object)
      {
        return createBuiltInTypeAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.YangFile <em>File</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.YangFile
   * @generated
   */
  public Adapter createYangFileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.Module <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.Module
   * @generated
   */
  public Adapter createModuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.ModuleStatement <em>Module Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.ModuleStatement
   * @generated
   */
  public Adapter createModuleStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.SubModule <em>Sub Module</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.SubModule
   * @generated
   */
  public Adapter createSubModuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.SubmoduleStatement <em>Submodule Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.SubmoduleStatement
   * @generated
   */
  public Adapter createSubmoduleStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.DatadefStatement <em>Datadef Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.DatadefStatement
   * @generated
   */
  public Adapter createDatadefStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.YangVersionStatement <em>Version Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.YangVersionStatement
   * @generated
   */
  public Adapter createYangVersionStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.OrganizationStatement <em>Organization Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.OrganizationStatement
   * @generated
   */
  public Adapter createOrganizationStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.ContactStatement <em>Contact Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.ContactStatement
   * @generated
   */
  public Adapter createContactStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.DescriptionStatement <em>Description Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.DescriptionStatement
   * @generated
   */
  public Adapter createDescriptionStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.ReferenceStatement <em>Reference Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.ReferenceStatement
   * @generated
   */
  public Adapter createReferenceStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.NamespaceStatement <em>Namespace Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.NamespaceStatement
   * @generated
   */
  public Adapter createNamespaceStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.PrefixStatement <em>Prefix Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.PrefixStatement
   * @generated
   */
  public Adapter createPrefixStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.RequireInstanceStatement <em>Require Instance Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.RequireInstanceStatement
   * @generated
   */
  public Adapter createRequireInstanceStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.PathStatement <em>Path Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.PathStatement
   * @generated
   */
  public Adapter createPathStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.PositionStatement <em>Position Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.PositionStatement
   * @generated
   */
  public Adapter createPositionStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.ValueStatement <em>Value Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.ValueStatement
   * @generated
   */
  public Adapter createValueStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.ErrorAppTagStatement <em>Error App Tag Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.ErrorAppTagStatement
   * @generated
   */
  public Adapter createErrorAppTagStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.ErrorMessageStatement <em>Error Message Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.ErrorMessageStatement
   * @generated
   */
  public Adapter createErrorMessageStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.UnitsStatement <em>Units Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.UnitsStatement
   * @generated
   */
  public Adapter createUnitsStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.DefaultStatement <em>Default Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.DefaultStatement
   * @generated
   */
  public Adapter createDefaultStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.StatusStatement <em>Status Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.StatusStatement
   * @generated
   */
  public Adapter createStatusStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.RevisionDateStatement <em>Revision Date Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.RevisionDateStatement
   * @generated
   */
  public Adapter createRevisionDateStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.UniqueStatement <em>Unique Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.UniqueStatement
   * @generated
   */
  public Adapter createUniqueStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.KeyStatement <em>Key Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.KeyStatement
   * @generated
   */
  public Adapter createKeyStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.OrderedbyStatement <em>Orderedby Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.OrderedbyStatement
   * @generated
   */
  public Adapter createOrderedbyStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.PresenceStatement <em>Presence Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.PresenceStatement
   * @generated
   */
  public Adapter createPresenceStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.MandatoryStatement <em>Mandatory Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.MandatoryStatement
   * @generated
   */
  public Adapter createMandatoryStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.ConfigStatement <em>Config Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.ConfigStatement
   * @generated
   */
  public Adapter createConfigStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.FractionDigitsStatement <em>Fraction Digits Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.FractionDigitsStatement
   * @generated
   */
  public Adapter createFractionDigitsStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.IfFeatureStatement <em>If Feature Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.IfFeatureStatement
   * @generated
   */
  public Adapter createIfFeatureStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.BaseStatement <em>Base Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.BaseStatement
   * @generated
   */
  public Adapter createBaseStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.YinElementStatement <em>Yin Element Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.YinElementStatement
   * @generated
   */
  public Adapter createYinElementStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.MinElementsStatement <em>Min Elements Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.MinElementsStatement
   * @generated
   */
  public Adapter createMinElementsStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.MaxElementsStatement <em>Max Elements Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.MaxElementsStatement
   * @generated
   */
  public Adapter createMaxElementsStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.UnknownStatement <em>Unknown Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.UnknownStatement
   * @generated
   */
  public Adapter createUnknownStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.UnknownSubstatements <em>Unknown Substatements</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.UnknownSubstatements
   * @generated
   */
  public Adapter createUnknownSubstatementsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.RangeStatement <em>Range Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.RangeStatement
   * @generated
   */
  public Adapter createRangeStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.PatternStatement <em>Pattern Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.PatternStatement
   * @generated
   */
  public Adapter createPatternStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.LengthStatement <em>Length Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.LengthStatement
   * @generated
   */
  public Adapter createLengthStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.MustStatement <em>Must Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.MustStatement
   * @generated
   */
  public Adapter createMustStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.MultipleSubstatement <em>Multiple Substatement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.MultipleSubstatement
   * @generated
   */
  public Adapter createMultipleSubstatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.RpcStatement <em>Rpc Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.RpcStatement
   * @generated
   */
  public Adapter createRpcStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.RpcSubstatement <em>Rpc Substatement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.RpcSubstatement
   * @generated
   */
  public Adapter createRpcSubstatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.InputStatement <em>Input Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.InputStatement
   * @generated
   */
  public Adapter createInputStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.InputSubstatement <em>Input Substatement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.InputSubstatement
   * @generated
   */
  public Adapter createInputSubstatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.OutputStatement <em>Output Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.OutputStatement
   * @generated
   */
  public Adapter createOutputStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.OutputSubstatement <em>Output Substatement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.OutputSubstatement
   * @generated
   */
  public Adapter createOutputSubstatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.NotificationStatement <em>Notification Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.NotificationStatement
   * @generated
   */
  public Adapter createNotificationStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.NotificationSubstatement <em>Notification Substatement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.NotificationSubstatement
   * @generated
   */
  public Adapter createNotificationSubstatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.ContainerStatement <em>Container Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.ContainerStatement
   * @generated
   */
  public Adapter createContainerStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.ContainerSubstatement <em>Container Substatement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.ContainerSubstatement
   * @generated
   */
  public Adapter createContainerSubstatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.ListStatement <em>List Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.ListStatement
   * @generated
   */
  public Adapter createListStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.ListSubstatement <em>List Substatement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.ListSubstatement
   * @generated
   */
  public Adapter createListSubstatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.GroupingStatement <em>Grouping Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.GroupingStatement
   * @generated
   */
  public Adapter createGroupingStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.GroupingSubstatement <em>Grouping Substatement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.GroupingSubstatement
   * @generated
   */
  public Adapter createGroupingSubstatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.LeafStatement <em>Leaf Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.LeafStatement
   * @generated
   */
  public Adapter createLeafStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.LeafSubstatement <em>Leaf Substatement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.LeafSubstatement
   * @generated
   */
  public Adapter createLeafSubstatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.LeafListStatement <em>Leaf List Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.LeafListStatement
   * @generated
   */
  public Adapter createLeafListStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.LeafListSubstatement <em>Leaf List Substatement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.LeafListSubstatement
   * @generated
   */
  public Adapter createLeafListSubstatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.ChoiceStatement <em>Choice Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.ChoiceStatement
   * @generated
   */
  public Adapter createChoiceStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.ChoiceSubstatement <em>Choice Substatement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.ChoiceSubstatement
   * @generated
   */
  public Adapter createChoiceSubstatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.CaseStatement <em>Case Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.CaseStatement
   * @generated
   */
  public Adapter createCaseStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.CaseSubstatement <em>Case Substatement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.CaseSubstatement
   * @generated
   */
  public Adapter createCaseSubstatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.AnyxmlStatement <em>Anyxml Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.AnyxmlStatement
   * @generated
   */
  public Adapter createAnyxmlStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.AnyxmlSubstatement <em>Anyxml Substatement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.AnyxmlSubstatement
   * @generated
   */
  public Adapter createAnyxmlSubstatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.UsesStatement <em>Uses Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.UsesStatement
   * @generated
   */
  public Adapter createUsesStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.UsesSubstatement <em>Uses Substatement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.UsesSubstatement
   * @generated
   */
  public Adapter createUsesSubstatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.AugmentUsesStatement <em>Augment Uses Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.AugmentUsesStatement
   * @generated
   */
  public Adapter createAugmentUsesStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.AugmentStatement <em>Augment Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.AugmentStatement
   * @generated
   */
  public Adapter createAugmentStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.AugmentSubstatement <em>Augment Substatement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.AugmentSubstatement
   * @generated
   */
  public Adapter createAugmentSubstatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.RefineStatement <em>Refine Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.RefineStatement
   * @generated
   */
  public Adapter createRefineStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.RefineSubstatement <em>Refine Substatement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.RefineSubstatement
   * @generated
   */
  public Adapter createRefineSubstatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.DeviationStatement <em>Deviation Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.DeviationStatement
   * @generated
   */
  public Adapter createDeviationStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.DeviationSubstatement <em>Deviation Substatement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.DeviationSubstatement
   * @generated
   */
  public Adapter createDeviationSubstatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.DeviateStatement <em>Deviate Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.DeviateStatement
   * @generated
   */
  public Adapter createDeviateStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.DeviateSubstatement <em>Deviate Substatement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.DeviateSubstatement
   * @generated
   */
  public Adapter createDeviateSubstatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.ExtensionStatement <em>Extension Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.ExtensionStatement
   * @generated
   */
  public Adapter createExtensionStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.ExtensionSubstatement <em>Extension Substatement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.ExtensionSubstatement
   * @generated
   */
  public Adapter createExtensionSubstatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.ArgumentStatement <em>Argument Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.ArgumentStatement
   * @generated
   */
  public Adapter createArgumentStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.ArgumentSubstatement <em>Argument Substatement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.ArgumentSubstatement
   * @generated
   */
  public Adapter createArgumentSubstatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.IdentityStatement <em>Identity Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.IdentityStatement
   * @generated
   */
  public Adapter createIdentityStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.IdentitySubstatement <em>Identity Substatement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.IdentitySubstatement
   * @generated
   */
  public Adapter createIdentitySubstatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.FeatureStatement <em>Feature Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.FeatureStatement
   * @generated
   */
  public Adapter createFeatureStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.FeatureSubstatement <em>Feature Substatement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.FeatureSubstatement
   * @generated
   */
  public Adapter createFeatureSubstatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.BelongsToStatement <em>Belongs To Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.BelongsToStatement
   * @generated
   */
  public Adapter createBelongsToStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.BelongsToSubstatement <em>Belongs To Substatement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.BelongsToSubstatement
   * @generated
   */
  public Adapter createBelongsToSubstatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.TypedefStatement <em>Typedef Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.TypedefStatement
   * @generated
   */
  public Adapter createTypedefStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.TypedefSubstatement <em>Typedef Substatement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.TypedefSubstatement
   * @generated
   */
  public Adapter createTypedefSubstatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.TypeStatement <em>Type Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.TypeStatement
   * @generated
   */
  public Adapter createTypeStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.TypeSubStatement <em>Type Sub Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.TypeSubStatement
   * @generated
   */
  public Adapter createTypeSubStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.BitStatement <em>Bit Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.BitStatement
   * @generated
   */
  public Adapter createBitStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.BitSubstatement <em>Bit Substatement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.BitSubstatement
   * @generated
   */
  public Adapter createBitSubstatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.EnumStatement <em>Enum Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.EnumStatement
   * @generated
   */
  public Adapter createEnumStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.EnumSubstatement <em>Enum Substatement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.EnumSubstatement
   * @generated
   */
  public Adapter createEnumSubstatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.ImportStatement <em>Import Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.ImportStatement
   * @generated
   */
  public Adapter createImportStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.ImportSubstatements <em>Import Substatements</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.ImportSubstatements
   * @generated
   */
  public Adapter createImportSubstatementsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.IncludeStatement <em>Include Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.IncludeStatement
   * @generated
   */
  public Adapter createIncludeStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.IncludeSubstatements <em>Include Substatements</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.IncludeSubstatements
   * @generated
   */
  public Adapter createIncludeSubstatementsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.WhenStatement <em>When Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.WhenStatement
   * @generated
   */
  public Adapter createWhenStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.WhenSubstatements <em>When Substatements</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.WhenSubstatements
   * @generated
   */
  public Adapter createWhenSubstatementsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.RevisionStatement <em>Revision Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.RevisionStatement
   * @generated
   */
  public Adapter createRevisionStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.RevisionSubstatements <em>Revision Substatements</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.RevisionSubstatements
   * @generated
   */
  public Adapter createRevisionSubstatementsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.editor.yang.yang.BuiltInType <em>Built In Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.editor.yang.yang.BuiltInType
   * @generated
   */
  public Adapter createBuiltInTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //YangAdapterFactory
