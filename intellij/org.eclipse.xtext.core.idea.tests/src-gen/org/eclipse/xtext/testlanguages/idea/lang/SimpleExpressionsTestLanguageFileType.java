package org.eclipse.xtext.testlanguages.idea.lang;

import javax.swing.Icon;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NonNls;

public final class SimpleExpressionsTestLanguageFileType extends LanguageFileType {

	public static final SimpleExpressionsTestLanguageFileType INSTANCE = new SimpleExpressionsTestLanguageFileType();
	
	@NonNls 
	public static final String DEFAULT_EXTENSION = "simpleexpressionstestlanguage";

	private SimpleExpressionsTestLanguageFileType() {
		super(SimpleExpressionsTestLanguageLanguage.INSTANCE);
	}

	@Override
	public String getDefaultExtension() {
		return DEFAULT_EXTENSION;
	}

	@Override
	public String getDescription() {
		return "SimpleExpressionsTestLanguage files";
	}

	@Override
	public Icon getIcon() {
		return null;
	}

	@Override
	public String getName() {
		return "SimpleExpressionsTestLanguage";
	}

}
