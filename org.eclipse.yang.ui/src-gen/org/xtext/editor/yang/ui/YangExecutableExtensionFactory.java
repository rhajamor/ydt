/*
 * generated by Xtext
 */
package org.xtext.editor.yang.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.xtext.editor.yang.ui.internal.YangActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class YangExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return YangActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return YangActivator.getInstance().getInjector(YangActivator.ORG_XTEXT_EDITOR_YANG_YANG);
	}
	
}