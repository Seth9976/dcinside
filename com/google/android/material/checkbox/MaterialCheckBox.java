package com.google.android.material.checkbox;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View.BaseSavedState;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton.OnCheckedChangeListener;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.widget.CompoundButtonCompat;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import c.e;
import com.google.android.material.R.attr;
import com.google.android.material.R.drawable;
import com.google.android.material.R.id;
import com.google.android.material.R.string;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.color.v;
import com.google.android.material.drawable.f;
import com.google.android.material.internal.D;
import com.google.android.material.internal.M;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.LinkedHashSet;

public class MaterialCheckBox extends AppCompatCheckBox {
    static class SavedState extends View.BaseSavedState {
        class a implements Parcelable.Creator {
            a() {
                super();
            }

            public SavedState a(Parcel parcel0) {
                return new SavedState(parcel0, null);
            }

            public SavedState[] b(int v) {
                return new SavedState[v];
            }

            @Override  // android.os.Parcelable$Creator
            public Object createFromParcel(Parcel parcel0) {
                return this.a(parcel0);
            }

            @Override  // android.os.Parcelable$Creator
            public Object[] newArray(int v) {
                return this.b(v);
            }
        }

        @NonNull
        public static final Parcelable.Creator CREATOR;
        int a;

        static {
            SavedState.CREATOR = new a();
        }

        private SavedState(Parcel parcel0) {
            super(parcel0);
            this.a = (int)(((Integer)parcel0.readValue(this.getClass().getClassLoader())));
        }

        SavedState(Parcel parcel0, com.google.android.material.checkbox.MaterialCheckBox.a materialCheckBox$a0) {
            this(parcel0);
        }

        SavedState(Parcelable parcelable0) {
            super(parcelable0);
        }

        @NonNull
        private String a() {
            switch(this.a) {
                case 1: {
                    return "checked";
                }
                case 2: {
                    return "indeterminate";
                }
                default: {
                    return "unchecked";
                }
            }
        }

        @Override
        @NonNull
        public String toString() {
            return "MaterialCheckBox.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " CheckedState=" + this.a() + "}";
        }

        @Override  // android.view.View$BaseSavedState
        public void writeToParcel(Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            parcel0.writeValue(this.a);
        }
    }

    class com.google.android.material.checkbox.MaterialCheckBox.a extends AnimationCallback {
        final MaterialCheckBox b;

        @Override  // androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback
        public void b(Drawable drawable0) {
            super.b(drawable0);
            ColorStateList colorStateList0 = MaterialCheckBox.this.o;
            if(colorStateList0 != null) {
                DrawableCompat.o(drawable0, colorStateList0);
            }
        }

        @Override  // androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback
        public void c(Drawable drawable0) {
            super.c(drawable0);
            MaterialCheckBox materialCheckBox0 = MaterialCheckBox.this;
            ColorStateList colorStateList0 = materialCheckBox0.o;
            if(colorStateList0 != null) {
                DrawableCompat.n(drawable0, colorStateList0.getColorForState(materialCheckBox0.s, MaterialCheckBox.this.o.getDefaultColor()));
            }
        }
    }

    @RestrictTo({Scope.b})
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public interface c {
        void a(@NonNull MaterialCheckBox arg1, int arg2);
    }

    public interface d {
        void a(@NonNull MaterialCheckBox arg1, boolean arg2);
    }

    public static final int A = 1;
    public static final int B = 2;
    private static final int[] C;
    private static final int[] D;
    private static final int[][] E;
    @SuppressLint({"DiscouragedApi"})
    private static final int F;
    @NonNull
    private final LinkedHashSet e;
    @NonNull
    private final LinkedHashSet f;
    @Nullable
    private ColorStateList g;
    private boolean h;
    private boolean i;
    private boolean j;
    @Nullable
    private CharSequence k;
    @Nullable
    private Drawable l;
    @Nullable
    private Drawable m;
    private boolean n;
    @Nullable
    ColorStateList o;
    @Nullable
    ColorStateList p;
    @NonNull
    private PorterDuff.Mode q;
    private int r;
    private int[] s;
    private boolean t;
    @Nullable
    private CharSequence u;
    @Nullable
    private CompoundButton.OnCheckedChangeListener v;
    @Nullable
    private final AnimatedVectorDrawableCompat w;
    private final AnimationCallback x;
    private static final int y;
    public static final int z;

    static {
        MaterialCheckBox.y = style.Widget_MaterialComponents_CompoundButton_CheckBox;
        MaterialCheckBox.C = new int[]{attr.state_indeterminate};
        MaterialCheckBox.D = new int[]{attr.state_error};
        MaterialCheckBox.E = new int[][]{new int[]{0x101009E, attr.state_error}, new int[]{0x101009E, 0x10100A0}, new int[]{0x101009E, 0xFEFEFF60}, new int[]{0xFEFEFF62, 0x10100A0}, new int[]{0xFEFEFF62, 0xFEFEFF60}};
        MaterialCheckBox.F = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    public MaterialCheckBox(Context context0) {
        this(context0, null);
    }

    public MaterialCheckBox(Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.checkboxStyle);
    }

    public MaterialCheckBox(Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(I1.a.c(context0, attributeSet0, v, MaterialCheckBox.y), attributeSet0, v);
        this.e = new LinkedHashSet();
        this.f = new LinkedHashSet();
        this.w = AnimatedVectorDrawableCompat.c(this.getContext(), drawable.mtrl_checkbox_button_checked_unchecked);
        this.x = new com.google.android.material.checkbox.MaterialCheckBox.a(this);
        Context context1 = this.getContext();
        this.l = CompoundButtonCompat.a(this);
        this.o = this.getSuperButtonTintList();
        this.setSupportButtonTintList(null);
        TintTypedArray tintTypedArray0 = D.l(context1, attributeSet0, styleable.MaterialCheckBox, v, MaterialCheckBox.y, new int[0]);
        this.m = tintTypedArray0.h(styleable.MaterialCheckBox_buttonIcon);
        if(this.l != null && D.h(context1) && this.i(tintTypedArray0)) {
            super.setButtonDrawable(null);
            this.l = AppCompatResources.b(context1, drawable.mtrl_checkbox_button);
            this.n = true;
            if(this.m == null) {
                this.m = AppCompatResources.b(context1, drawable.mtrl_checkbox_button_icon);
            }
        }
        this.p = com.google.android.material.resources.d.b(context1, tintTypedArray0, styleable.MaterialCheckBox_buttonIconTint);
        this.q = M.u(tintTypedArray0.o(styleable.MaterialCheckBox_buttonIconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.h = tintTypedArray0.a(styleable.MaterialCheckBox_useMaterialThemeColors, false);
        this.i = tintTypedArray0.a(styleable.MaterialCheckBox_centerIfNoTextEnabled, true);
        this.j = tintTypedArray0.a(styleable.MaterialCheckBox_errorShown, false);
        this.k = tintTypedArray0.x(styleable.MaterialCheckBox_errorAccessibilityLabel);
        if(tintTypedArray0.C(styleable.MaterialCheckBox_checkedState)) {
            this.setCheckedState(tintTypedArray0.o(7, 0));
        }
        tintTypedArray0.I();
        this.n();
    }

    public void e(@NonNull c materialCheckBox$c0) {
        this.f.add(materialCheckBox$c0);
    }

    public void f(@NonNull d materialCheckBox$d0) {
        this.e.add(materialCheckBox$d0);
    }

    public void g() {
        this.f.clear();
    }

    @Override  // android.widget.CompoundButton
    @Nullable
    public Drawable getButtonDrawable() {
        return this.l;
    }

    @Nullable
    public Drawable getButtonIconDrawable() {
        return this.m;
    }

    @Nullable
    public ColorStateList getButtonIconTintList() {
        return this.p;
    }

    @NonNull
    public PorterDuff.Mode getButtonIconTintMode() {
        return this.q;
    }

    @NonNull
    private String getButtonStateDescription() {
        int v = this.r;
        if(v == 1) {
            return this.getResources().getString(string.mtrl_checkbox_state_description_checked);
        }
        return v == 0 ? this.getResources().getString(string.mtrl_checkbox_state_description_unchecked) : this.getResources().getString(string.mtrl_checkbox_state_description_indeterminate);
    }

    @Override  // android.widget.CompoundButton
    @Nullable
    public ColorStateList getButtonTintList() {
        return this.o;
    }

    public int getCheckedState() {
        return this.r;
    }

    @Nullable
    public CharSequence getErrorAccessibilityLabel() {
        return this.k;
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if(this.g == null) {
            int[] arr_v = new int[MaterialCheckBox.E.length];
            int v = v.d(this, attr.colorControlActivated);
            int v1 = v.d(this, attr.colorError);
            int v2 = v.d(this, attr.colorSurface);
            int v3 = v.d(this, attr.colorOnSurface);
            arr_v[0] = v.t(v2, v1, 1.0f);
            arr_v[1] = v.t(v2, v, 1.0f);
            arr_v[2] = v.t(v2, v3, 0.54f);
            arr_v[3] = v.t(v2, v3, 0.38f);
            arr_v[4] = v.t(v2, v3, 0.38f);
            this.g = new ColorStateList(MaterialCheckBox.E, arr_v);
        }
        return this.g;
    }

    @Nullable
    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList0 = this.o;
        if(colorStateList0 != null) {
            return colorStateList0;
        }
        return super.getButtonTintList() == null ? this.getSupportButtonTintList() : super.getButtonTintList();
    }

    public void h() {
        this.e.clear();
    }

    private boolean i(TintTypedArray tintTypedArray0) {
        int v = tintTypedArray0.u(styleable.MaterialCheckBox_android_button, 0);
        int v1 = tintTypedArray0.u(styleable.MaterialCheckBox_buttonCompat, 0);
        return v == MaterialCheckBox.F && v1 == 0;
    }

    @Override  // android.widget.CompoundButton
    public boolean isChecked() {
        return this.r == 1;
    }

    public boolean j() {
        return this.i;
    }

    public boolean k() {
        return this.j;
    }

    public boolean l() {
        return this.h;
    }

    private void m() {
        this.m.jumpToCurrentState();
    }

    private void n() {
        this.l = f.d(this.l, this.o, CompoundButtonCompat.c(this));
        this.m = f.d(this.m, this.p, this.q);
        this.r();
        this.s();
        super.setButtonDrawable(f.a(this.l, this.m));
        this.refreshDrawableState();
    }

    public void o(@NonNull c materialCheckBox$c0) {
        this.f.remove(materialCheckBox$c0);
    }

    @Override  // android.widget.TextView
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if(this.h && this.o == null && this.p == null) {
            this.setUseMaterialThemeColors(true);
        }
    }

    @Override  // android.widget.CompoundButton
    protected int[] onCreateDrawableState(int v) {
        int[] arr_v = super.onCreateDrawableState(v + 2);
        if(this.getCheckedState() == 2) {
            View.mergeDrawableStates(arr_v, MaterialCheckBox.C);
        }
        if(this.k()) {
            View.mergeDrawableStates(arr_v, MaterialCheckBox.D);
        }
        this.s = f.f(arr_v);
        return arr_v;
    }

    @Override  // android.widget.CompoundButton
    protected void onDraw(Canvas canvas0) {
        if(this.i && TextUtils.isEmpty(this.getText())) {
            Drawable drawable0 = CompoundButtonCompat.a(this);
            if(drawable0 != null) {
                int v = M.s(this) ? -1 : 1;
                int v1 = (this.getWidth() - drawable0.getIntrinsicWidth()) / 2 * v;
                int v2 = canvas0.save();
                canvas0.translate(((float)v1), 0.0f);
                super.onDraw(canvas0);
                canvas0.restoreToCount(v2);
                if(this.getBackground() != null) {
                    Rect rect0 = drawable0.getBounds();
                    DrawableCompat.l(this.getBackground(), rect0.left + v1, rect0.top, rect0.right + v1, rect0.bottom);
                }
                return;
            }
        }
        super.onDraw(canvas0);
    }

    @Override  // android.view.View
    public void onInitializeAccessibilityNodeInfo(@Nullable AccessibilityNodeInfo accessibilityNodeInfo0) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
        if(accessibilityNodeInfo0 == null) {
            return;
        }
        if(this.k()) {
            accessibilityNodeInfo0.setText(accessibilityNodeInfo0.getText() + ", " + this.k);
        }
    }

    @Override  // android.widget.CompoundButton
    public void onRestoreInstanceState(@Nullable Parcelable parcelable0) {
        if(!(parcelable0 instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((SavedState)parcelable0).getSuperState());
        this.setCheckedState(((SavedState)parcelable0).a);
    }

    @Override  // android.widget.CompoundButton
    @Nullable
    public Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new SavedState(super.onSaveInstanceState());
        parcelable0.a = this.getCheckedState();
        return parcelable0;
    }

    public void p(@NonNull d materialCheckBox$d0) {
        this.e.remove(materialCheckBox$d0);
    }

    private void q() {
        if(Build.VERSION.SDK_INT >= 30 && this.u == null) {
            super.setStateDescription(this.getButtonStateDescription());
        }
    }

    private void r() {
        if(!this.n) {
            return;
        }
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat0 = this.w;
        if(animatedVectorDrawableCompat0 != null) {
            animatedVectorDrawableCompat0.b(this.x);
            this.w.d(this.x);
        }
        if(Build.VERSION.SDK_INT >= 24) {
            Drawable drawable0 = this.l;
            if(drawable0 instanceof AnimatedStateListDrawable) {
                AnimatedVectorDrawableCompat animatedVectorDrawableCompat1 = this.w;
                if(animatedVectorDrawableCompat1 != null) {
                    ((AnimatedStateListDrawable)drawable0).addTransition(id.checked, id.unchecked, animatedVectorDrawableCompat1, false);
                    ((AnimatedStateListDrawable)this.l).addTransition(id.indeterminate, id.unchecked, this.w, false);
                }
            }
        }
    }

    private void s() {
        Drawable drawable0 = this.l;
        if(drawable0 != null) {
            ColorStateList colorStateList0 = this.o;
            if(colorStateList0 != null) {
                DrawableCompat.o(drawable0, colorStateList0);
            }
        }
        Drawable drawable1 = this.m;
        if(drawable1 != null) {
            ColorStateList colorStateList1 = this.p;
            if(colorStateList1 != null) {
                DrawableCompat.o(drawable1, colorStateList1);
            }
        }
    }

    @Override  // androidx.appcompat.widget.AppCompatCheckBox
    public void setButtonDrawable(@DrawableRes int v) {
        this.setButtonDrawable(AppCompatResources.b(this.getContext(), v));
    }

    @Override  // androidx.appcompat.widget.AppCompatCheckBox
    public void setButtonDrawable(@Nullable Drawable drawable0) {
        this.l = drawable0;
        this.n = false;
        this.n();
    }

    public void setButtonIconDrawable(@Nullable Drawable drawable0) {
        this.m = drawable0;
        this.n();
    }

    public void setButtonIconDrawableResource(@DrawableRes int v) {
        this.setButtonIconDrawable(AppCompatResources.b(this.getContext(), v));
    }

    public void setButtonIconTintList(@Nullable ColorStateList colorStateList0) {
        if(this.p == colorStateList0) {
            return;
        }
        this.p = colorStateList0;
        this.n();
    }

    public void setButtonIconTintMode(@NonNull PorterDuff.Mode porterDuff$Mode0) {
        if(this.q == porterDuff$Mode0) {
            return;
        }
        this.q = porterDuff$Mode0;
        this.n();
    }

    @Override  // android.widget.CompoundButton
    public void setButtonTintList(@Nullable ColorStateList colorStateList0) {
        if(this.o == colorStateList0) {
            return;
        }
        this.o = colorStateList0;
        this.n();
    }

    @Override  // android.widget.CompoundButton
    public void setButtonTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        this.setSupportButtonTintMode(porterDuff$Mode0);
        this.n();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.i = z;
    }

    @Override  // android.widget.CompoundButton
    public void setChecked(boolean z) {
        this.setCheckedState(((int)z));
    }

    public void setCheckedState(int v) {
        if(this.r != v) {
            this.r = v;
            super.setChecked(v == 1);
            this.refreshDrawableState();
            this.q();
            if(this.t) {
                return;
            }
            this.t = true;
            LinkedHashSet linkedHashSet0 = this.f;
            if(linkedHashSet0 != null) {
                for(Object object0: linkedHashSet0) {
                    ((c)object0).a(this, this.r);
                }
            }
            if(this.r != 2) {
                CompoundButton.OnCheckedChangeListener compoundButton$OnCheckedChangeListener0 = this.v;
                if(compoundButton$OnCheckedChangeListener0 != null) {
                    compoundButton$OnCheckedChangeListener0.onCheckedChanged(this, this.isChecked());
                }
            }
            if(Build.VERSION.SDK_INT >= 26) {
                AutofillManager autofillManager0 = e.a(this.getContext().getSystemService(AutofillManager.class));
                if(autofillManager0 != null) {
                    autofillManager0.notifyValueChanged(this);
                }
            }
            this.t = false;
        }
    }

    @Override  // android.widget.TextView
    public void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public void setErrorAccessibilityLabel(@Nullable CharSequence charSequence0) {
        this.k = charSequence0;
    }

    public void setErrorAccessibilityLabelResource(@StringRes int v) {
        this.setErrorAccessibilityLabel((v == 0 ? null : this.getResources().getText(v)));
    }

    public void setErrorShown(boolean z) {
        if(this.j == z) {
            return;
        }
        this.j = z;
        this.refreshDrawableState();
        for(Object object0: this.e) {
            ((d)object0).a(this, this.j);
        }
    }

    @Override  // android.widget.CompoundButton
    public void setOnCheckedChangeListener(@Nullable CompoundButton.OnCheckedChangeListener compoundButton$OnCheckedChangeListener0) {
        this.v = compoundButton$OnCheckedChangeListener0;
    }

    @Override  // android.widget.CompoundButton
    @RequiresApi(30)
    public void setStateDescription(@Nullable CharSequence charSequence0) {
        this.u = charSequence0;
        if(charSequence0 == null) {
            this.q();
            return;
        }
        super.setStateDescription(charSequence0);
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.h = z;
        if(z) {
            CompoundButtonCompat.d(this, this.getMaterialThemeColorsTintList());
            return;
        }
        CompoundButtonCompat.d(this, null);
    }

    private void t() {
    }

    @Override  // android.widget.CompoundButton
    public void toggle() {
        this.setChecked(!this.isChecked());
    }
}

