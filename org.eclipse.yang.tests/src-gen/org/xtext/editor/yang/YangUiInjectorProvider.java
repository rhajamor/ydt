/*
* generated by Xtext
*/
package org.xtext.editor.yang;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class YangUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.xtext.editor.yang.ui.internal.YangActivator.getInstance().getInjector("org.xtext.editor.yang.Yang");
	}
	
}