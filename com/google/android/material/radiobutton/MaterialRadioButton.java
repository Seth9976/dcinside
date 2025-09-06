package com.google.android.material.radiobutton;

import I1.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.core.widget.CompoundButtonCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.color.v;
import com.google.android.material.internal.D;
import com.google.android.material.resources.d;

public class MaterialRadioButton extends AppCompatRadioButton {
    @Nullable
    private ColorStateList e;
    private boolean f;
    private static final int g;
    private static final int[][] h;

    static {
        MaterialRadioButton.g = style.Widget_MaterialComponents_CompoundButton_RadioButton;
        MaterialRadioButton.h = new int[][]{new int[]{0x101009E, 0x10100A0}, new int[]{0x101009E, 0xFEFEFF60}, new int[]{0xFEFEFF62, 0x10100A0}, new int[]{0xFEFEFF62, 0xFEFEFF60}};
    }

    public MaterialRadioButton(@NonNull Context context0) {
        this(context0, null);
    }

    public MaterialRadioButton(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.radioButtonStyle);
    }

    public MaterialRadioButton(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(a.c(context0, attributeSet0, v, MaterialRadioButton.g), attributeSet0, v);
        Context context1 = this.getContext();
        TypedArray typedArray0 = D.k(context1, attributeSet0, styleable.MaterialRadioButton, v, MaterialRadioButton.g, new int[0]);
        if(typedArray0.hasValue(styleable.MaterialRadioButton_buttonTint)) {
            CompoundButtonCompat.d(this, d.a(context1, typedArray0, 0));
        }
        this.f = typedArray0.getBoolean(styleable.MaterialRadioButton_useMaterialThemeColors, false);
        typedArray0.recycle();
    }

    public boolean b() {
        return this.f;
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if(this.e == null) {
            int v = v.d(this, attr.colorControlActivated);
            int v1 = v.d(this, attr.colorOnSurface);
            int v2 = v.d(this, attr.colorSurface);
            int[] arr_v = new int[MaterialRadioButton.h.length];
            arr_v[0] = v.t(v2, v, 1.0f);
            arr_v[1] = v.t(v2, v1, 0.54f);
            arr_v[2] = v.t(v2, v1, 0.38f);
            arr_v[3] = v.t(v2, v1, 0.38f);
            this.e = new ColorStateList(MaterialRadioButton.h, arr_v);
        }
        return this.e;
    }

    @Override  // android.widget.TextView
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if(this.f && CompoundButtonCompat.b(this) == null) {
            this.setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f = z;
        if(z) {
            CompoundButtonCompat.d(this, this.getMaterialThemeColorsTintList());
            return;
        }
        CompoundButtonCompat.d(this, null);
    }
}

