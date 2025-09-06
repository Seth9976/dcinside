package com.google.android.material.switchmaterial;

import F1.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.dimen;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.color.v;
import com.google.android.material.internal.D;
import com.google.android.material.internal.M;

public class SwitchMaterial extends SwitchCompat {
    @NonNull
    private final a X8;
    @Nullable
    private ColorStateList Y8;
    @Nullable
    private ColorStateList Z8;
    private boolean a9;
    private static final int b9;
    private static final int[][] c9;

    static {
        SwitchMaterial.b9 = style.Widget_MaterialComponents_CompoundButton_Switch;
        SwitchMaterial.c9 = new int[][]{new int[]{0x101009E, 0x10100A0}, new int[]{0x101009E, 0xFEFEFF60}, new int[]{0xFEFEFF62, 0x10100A0}, new int[]{0xFEFEFF62, 0xFEFEFF60}};
    }

    public SwitchMaterial(@NonNull Context context0) {
        this(context0, null);
    }

    public SwitchMaterial(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.switchStyle);
    }

    public SwitchMaterial(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(I1.a.c(context0, attributeSet0, v, SwitchMaterial.b9), attributeSet0, v);
        Context context1 = this.getContext();
        this.X8 = new a(context1);
        TypedArray typedArray0 = D.k(context1, attributeSet0, styleable.SwitchMaterial, v, SwitchMaterial.b9, new int[0]);
        this.a9 = typedArray0.getBoolean(styleable.SwitchMaterial_useMaterialThemeColors, false);
        typedArray0.recycle();
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if(this.Y8 == null) {
            int v = v.d(this, attr.colorSurface);
            int v1 = v.d(this, attr.colorControlActivated);
            float f = this.getResources().getDimension(dimen.mtrl_switch_thumb_elevation);
            if(this.X8.l()) {
                f += M.p(this);
            }
            int v2 = this.X8.e(v, f);
            int[] arr_v = new int[SwitchMaterial.c9.length];
            arr_v[0] = v.t(v, v1, 1.0f);
            arr_v[1] = v2;
            arr_v[2] = v.t(v, v1, 0.38f);
            arr_v[3] = v2;
            this.Y8 = new ColorStateList(SwitchMaterial.c9, arr_v);
        }
        return this.Y8;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if(this.Z8 == null) {
            int[] arr_v = new int[SwitchMaterial.c9.length];
            int v = v.d(this, attr.colorSurface);
            int v1 = v.d(this, attr.colorControlActivated);
            int v2 = v.d(this, attr.colorOnSurface);
            arr_v[0] = v.t(v, v1, 0.54f);
            arr_v[1] = v.t(v, v2, 0.32f);
            arr_v[2] = v.t(v, v1, 0.12f);
            arr_v[3] = v.t(v, v2, 0.12f);
            this.Z8 = new ColorStateList(SwitchMaterial.c9, arr_v);
        }
        return this.Z8;
    }

    @Override  // android.widget.TextView
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if(this.a9 && this.getThumbTintList() == null) {
            this.setThumbTintList(this.getMaterialThemeColorsThumbTintList());
        }
        if(this.a9 && this.getTrackTintList() == null) {
            this.setTrackTintList(this.getMaterialThemeColorsTrackTintList());
        }
    }

    public boolean s() {
        return this.a9;
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.a9 = z;
        if(z) {
            this.setThumbTintList(this.getMaterialThemeColorsThumbTintList());
            this.setTrackTintList(this.getMaterialThemeColorsTrackTintList());
            return;
        }
        this.setThumbTintList(null);
        this.setTrackTintList(null);
    }
}

