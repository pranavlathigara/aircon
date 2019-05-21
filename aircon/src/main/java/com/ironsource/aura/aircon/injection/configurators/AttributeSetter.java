package com.ironsource.aura.aircon.injection.configurators;

import android.view.View;

import com.ironsource.aura.aircon.injection.AttributeResolver;

/**
 * Created on 14/1/19.
 */
public interface AttributeSetter {

	void set(final View view, final Integer attrValueInt, final String attrValueName, final AttributeResolver attributeResolver);
}
