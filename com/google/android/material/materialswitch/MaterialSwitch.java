package com.google.android.material.materialswitch;

import I1.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.drawable.DrawableCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.drawable.f;
import com.google.android.material.internal.D;
import com.google.android.material.internal.M;

public class MaterialSwitch extends SwitchCompat {
    @Nullable
    private Drawable X8;
    @Nullable
    private Drawable Y8;
    @Px
    private int Z8;
    @Nullable
    private Drawable a9;
    @Nullable
    private Drawable b9;
    @Nullable
    private ColorStateList c9;
    @Nullable
    private ColorStateList d9;
    @NonNull
    private PorterDuff.Mode e9;
    @Nullable
    private ColorStateList f9;
    @Nullable
    private ColorStateList g9;
    @NonNull
    private PorterDuff.Mode h9;
    private int[] i9;
    private int[] j9;
    private static final int k9;
    private static final int[] l9;

    static {
        MaterialSwitch.k9 = style.Widget_Material3_CompoundButton_MaterialSwitch;
        MaterialSwitch.l9 = new int[]{attr.state_with_icon};
    }

    public MaterialSwitch(@NonNull Context context0) {
        this(context0, null);
    }

    public MaterialSwitch(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.materialSwitchStyle);
    }

    public MaterialSwitch(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(a.c(context0, attributeSet0, v, MaterialSwitch.k9), attributeSet0, v);
        this.Z8 = -1;
        Context context1 = this.getContext();
        this.X8 = super.getThumbDrawable();
        this.c9 = super.getThumbTintList();
        super.setThumbTintList(null);
        this.a9 = super.getTrackDrawable();
        this.f9 = super.getTrackTintList();
        super.setTrackTintList(null);
        TintTypedArray tintTypedArray0 = D.l(context1, attributeSet0, styleable.MaterialSwitch, v, MaterialSwitch.k9, new int[0]);
        this.Y8 = tintTypedArray0.h(styleable.MaterialSwitch_thumbIcon);
        this.Z8 = tintTypedArray0.g(styleable.MaterialSwitch_thumbIconSize, -1);
        this.d9 = tintTypedArray0.d(styleable.MaterialSwitch_thumbIconTint);
        int v1 = tintTypedArray0.o(styleable.MaterialSwitch_thumbIconTintMode, -1);
        PorterDuff.Mode porterDuff$Mode0 = PorterDuff.Mode.SRC_IN;
        this.e9 = M.u(v1, porterDuff$Mode0);
        this.b9 = tintTypedArray0.h(styleable.MaterialSwitch_trackDecoration);
        this.g9 = tintTypedArray0.d(styleable.MaterialSwitch_trackDecorationTint);
        this.h9 = M.u(tintTypedArray0.o(styleable.MaterialSwitch_trackDecorationTintMode, -1), porterDuff$Mode0);
        tintTypedArray0.I();
        this.setEnforceSwitchWidth(false);
        this.s();
        this.t();
    }

    @Override  // androidx.appcompat.widget.SwitchCompat
    @Nullable
    public Drawable getThumbDrawable() {
        return this.X8;
    }

    @Nullable
    public Drawable getThumbIconDrawable() {
        return this.Y8;
    }

    @Px
    public int getThumbIconSize() {
        return this.Z8;
    }

    @Nullable
    public ColorStateList getThumbIconTintList() {
        return this.d9;
    }

    @NonNull
    public PorterDuff.Mode getThumbIconTintMode() {
        return this.e9;
    }

    @Override  // androidx.appcompat.widget.SwitchCompat
    @Nullable
    public ColorStateList getThumbTintList() {
        return this.c9;
    }

    @Nullable
    public Drawable getTrackDecorationDrawable() {
        return this.b9;
    }

    @Nullable
    public ColorStateList getTrackDecorationTintList() {
        return this.g9;
    }

    @NonNull
    public PorterDuff.Mode getTrackDecorationTintMode() {
        return this.h9;
    }

    @Override  // androidx.appcompat.widget.SwitchCompat
    @Nullable
    public Drawable getTrackDrawable() {
        return this.a9;
    }

    @Override  // androidx.appcompat.widget.SwitchCompat
    @Nullable
    public ColorStateList getTrackTintList() {
        return this.f9;
    }

    @Override  // android.view.View
    public void invalidate() {
        this.v();
        super.invalidate();
    }

    @Override  // androidx.appcompat.widget.SwitchCompat
    protected int[] onCreateDrawableState(int v) {
        int[] arr_v = super.onCreateDrawableState(v + 1);
        if(this.Y8 != null) {
            View.mergeDrawableStates(arr_v, MaterialSwitch.l9);
        }
        this.i9 = f.j(arr_v);
        this.j9 = f.f(arr_v);
        return arr_v;
    }

    private void s() {
        this.X8 = f.c(this.X8, this.c9, this.getThumbTintMode());
        this.Y8 = f.c(this.Y8, this.d9, this.e9);
        this.v();
        super.setThumbDrawable(f.b(this.X8, this.Y8, this.Z8, this.Z8));
        this.refreshDrawableState();
    }

    @Override  // androidx.appcompat.widget.SwitchCompat
    public void setThumbDrawable(@Nullable Drawable drawable0) {
        this.X8 = drawable0;
        this.s();
    }

    public void setThumbIconDrawable(@Nullable Drawable drawable0) {
        this.Y8 = drawable0;
        this.s();
    }

    public void setThumbIconResource(@DrawableRes int v) {
        this.setThumbIconDrawable(AppCompatResources.b(this.getContext(), v));
    }

    public void setThumbIconSize(@Px int v) {
        if(this.Z8 != v) {
            this.Z8 = v;
            this.s();
        }
    }

    public void setThumbIconTintList(@Nullable ColorStateList colorStateList0) {
        this.d9 = colorStateList0;
        this.s();
    }

    public void setThumbIconTintMode(@NonNull PorterDuff.Mode porterDuff$Mode0) {
        this.e9 = porterDuff$Mode0;
        this.s();
    }

    @Override  // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintList(@Nullable ColorStateList colorStateList0) {
        this.c9 = colorStateList0;
        this.s();
    }

    @Override  // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        super.setThumbTintMode(porterDuff$Mode0);
        this.s();
    }

    public void setTrackDecorationDrawable(@Nullable Drawable drawable0) {
        this.b9 = drawable0;
        this.t();
    }

    public void setTrackDecorationResource(@DrawableRes int v) {
        this.setTrackDecorationDrawable(AppCompatResources.b(this.getContext(), v));
    }

    public void setTrackDecorationTintList(@Nullable ColorStateList colorStateList0) {
        this.g9 = colorStateList0;
        this.t();
    }

    public void setTrackDecorationTintMode(@NonNull PorterDuff.Mode porterDuff$Mode0) {
        this.h9 = porterDuff$Mode0;
        this.t();
    }

    @Override  // androidx.appcompat.widget.SwitchCompat
    public void setTrackDrawable(@Nullable Drawable drawable0) {
        this.a9 = drawable0;
        this.t();
    }

    @Override  // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintList(@Nullable ColorStateList colorStateList0) {
        this.f9 = colorStateList0;
        this.t();
    }

    @Override  // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        super.setTrackTintMode(porterDuff$Mode0);
        this.t();
    }

    private void t() {
        this.a9 = f.c(this.a9, this.f9, this.getTrackTintMode());
        this.b9 = f.c(this.b9, this.g9, this.h9);
        this.v();
        Drawable drawable0 = this.a9;
        if(drawable0 != null && this.b9 != null) {
            drawable0 = new LayerDrawable(new Drawable[]{this.a9, this.b9});
        }
        else if(drawable0 == null) {
            drawable0 = this.b9;
        }
        if(drawable0 != null) {
            this.setSwitchMinWidth(drawable0.getIntrinsicWidth());
        }
        super.setTrackDrawable(drawable0);
    }

    private static void u(@Nullable Drawable drawable0, @Nullable ColorStateList colorStateList0, @NonNull int[] arr_v, @NonNull int[] arr_v1, float f) {
        if(drawable0 != null && colorStateList0 != null) {
            DrawableCompat.n(drawable0, ColorUtils.j(colorStateList0.getColorForState(arr_v, 0), colorStateList0.getColorForState(arr_v1, 0), f));
        }
    }

    private void v() {
        if(this.c9 == null && this.d9 == null && this.f9 == null && this.g9 == null) {
            return;
        }
        float f = this.getThumbPosition();
        ColorStateList colorStateList0 = this.c9;
        if(colorStateList0 != null) {
            MaterialSwitch.u(this.X8, colorStateList0, this.i9, this.j9, f);
        }
        ColorStateList colorStateList1 = this.d9;
        if(colorStateList1 != null) {
            MaterialSwitch.u(this.Y8, colorStateList1, this.i9, this.j9, f);
        }
        ColorStateList colorStateList2 = this.f9;
        if(colorStateList2 != null) {
            MaterialSwitch.u(this.a9, colorStateList2, this.i9, this.j9, f);
        }
        ColorStateList colorStateList3 = this.g9;
        if(colorStateList3 != null) {
            MaterialSwitch.u(this.b9, colorStateList3, this.i9, this.j9, f);
        }
    }
}

