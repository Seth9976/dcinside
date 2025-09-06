package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.text.Layout.Alignment;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R.attr;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.internal.D;
import com.google.android.material.internal.M;
import com.google.android.material.resources.d;
import com.google.android.material.shape.l;
import com.google.android.material.shape.p;
import com.google.android.material.shape.t;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.LinkedHashSet;

public class MaterialButton extends AppCompatButton implements Checkable, t {
    static class SavedState extends AbsSavedState {
        class a implements Parcelable.ClassLoaderCreator {
            a() {
                super();
            }

            @NonNull
            public SavedState a(@NonNull Parcel parcel0) {
                return new SavedState(parcel0, null);
            }

            @NonNull
            public SavedState b(@NonNull Parcel parcel0, ClassLoader classLoader0) {
                return new SavedState(parcel0, classLoader0);
            }

            @NonNull
            public SavedState[] c(int v) {
                return new SavedState[v];
            }

            @Override  // android.os.Parcelable$Creator
            @NonNull
            public Object createFromParcel(@NonNull Parcel parcel0) {
                return this.a(parcel0);
            }

            @Override  // android.os.Parcelable$ClassLoaderCreator
            @NonNull
            public Object createFromParcel(@NonNull Parcel parcel0, ClassLoader classLoader0) {
                return this.b(parcel0, classLoader0);
            }

            @Override  // android.os.Parcelable$Creator
            @NonNull
            public Object[] newArray(int v) {
                return this.c(v);
            }
        }

        public static final Parcelable.Creator CREATOR;
        boolean c;

        static {
            SavedState.CREATOR = new a();
        }

        public SavedState(@NonNull Parcel parcel0, ClassLoader classLoader0) {
            super(parcel0, classLoader0);
            if(classLoader0 == null) {
                this.getClass().getClassLoader();
            }
            this.c(parcel0);
        }

        public SavedState(Parcelable parcelable0) {
            super(parcelable0);
        }

        private void c(@NonNull Parcel parcel0) {
            this.c = parcel0.readInt() == 1;
        }

        @Override  // androidx.customview.view.AbsSavedState
        public void writeToParcel(@NonNull Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            parcel0.writeInt(((int)this.c));
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface com.google.android.material.button.MaterialButton.a {
    }

    public interface b {
        void a(MaterialButton arg1, boolean arg2);
    }

    interface c {
        void a(MaterialButton arg1, boolean arg2);
    }

    private static final int A = 0;
    @NonNull
    private final com.google.android.material.button.b d;
    @NonNull
    private final LinkedHashSet e;
    @Nullable
    private c f;
    @Nullable
    private PorterDuff.Mode g;
    @Nullable
    private ColorStateList h;
    @Nullable
    private Drawable i;
    @Nullable
    private String j;
    @Px
    private int k;
    @Px
    private int l;
    @Px
    private int m;
    @Px
    private int n;
    private boolean o;
    private boolean p;
    private int q;
    private static final int[] r = null;
    private static final int[] s = null;
    public static final int t = 1;
    public static final int u = 2;
    public static final int v = 3;
    public static final int w = 4;
    public static final int x = 16;
    public static final int y = 0x20;
    private static final String z = "MaterialButton";

    static {
        MaterialButton.r = new int[]{0x101009F};
        MaterialButton.s = new int[]{0x10100A0};
        MaterialButton.A = style.Widget_MaterialComponents_Button;
    }

    public MaterialButton(@NonNull Context context0) {
        this(context0, null);
    }

    public MaterialButton(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.materialButtonStyle);
    }

    public MaterialButton(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(I1.a.c(context0, attributeSet0, v, MaterialButton.A), attributeSet0, v);
        this.e = new LinkedHashSet();
        boolean z = false;
        this.o = false;
        this.p = false;
        Context context1 = this.getContext();
        TypedArray typedArray0 = D.k(context1, attributeSet0, styleable.MaterialButton, v, MaterialButton.A, new int[0]);
        this.n = typedArray0.getDimensionPixelSize(styleable.MaterialButton_iconPadding, 0);
        this.g = M.u(typedArray0.getInt(styleable.MaterialButton_iconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.h = d.a(this.getContext(), typedArray0, styleable.MaterialButton_iconTint);
        this.i = d.e(this.getContext(), typedArray0, styleable.MaterialButton_icon);
        this.q = typedArray0.getInteger(styleable.MaterialButton_iconGravity, 1);
        this.k = typedArray0.getDimensionPixelSize(styleable.MaterialButton_iconSize, 0);
        com.google.android.material.button.b b0 = new com.google.android.material.button.b(this, p.e(context1, attributeSet0, v, MaterialButton.A).m());
        this.d = b0;
        b0.r(typedArray0);
        typedArray0.recycle();
        this.setCompoundDrawablePadding(this.n);
        if(this.i != null) {
            z = true;
        }
        this.m(z);
    }

    public void b(@NonNull b materialButton$b0) {
        this.e.add(materialButton$b0);
    }

    public void c() {
        this.e.clear();
    }

    public boolean d() {
        return this.d != null && this.d.p();
    }

    private boolean e() {
        return this.q == 3 || this.q == 4;
    }

    private boolean f() {
        return this.q == 1 || this.q == 2;
    }

    private boolean g() {
        return this.q == 16 || this.q == 0x20;
    }

    // 去混淆评级： 低(23)
    @NonNull
    String getA11yClassName() {
        if(!TextUtils.isEmpty(this.j)) {
            return this.j;
        }
        return this.d() ? "android.widget.CompoundButton" : "android.widget.Button";
    }

    private Layout.Alignment getActualTextAlignment() {
        switch(this.getTextAlignment()) {
            case 1: {
                return this.getGravityTextAlignment();
            }
            case 4: {
                return Layout.Alignment.ALIGN_CENTER;
            }
            case 3: 
            case 6: {
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            default: {
                return Layout.Alignment.ALIGN_NORMAL;
            }
        }
    }

    @Override  // android.view.View
    @Nullable
    public ColorStateList getBackgroundTintList() {
        return this.getSupportBackgroundTintList();
    }

    @Override  // android.view.View
    @Nullable
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.getSupportBackgroundTintMode();
    }

    // 去混淆评级： 低(20)
    @Px
    public int getCornerRadius() {
        return this.j() ? this.d.b() : 0;
    }

    private Layout.Alignment getGravityTextAlignment() {
        switch(this.getGravity() & 0x800007) {
            case 1: {
                return Layout.Alignment.ALIGN_CENTER;
            }
            case 5: 
            case 0x800005: {
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            default: {
                return Layout.Alignment.ALIGN_NORMAL;
            }
        }
    }

    public Drawable getIcon() {
        return this.i;
    }

    public int getIconGravity() {
        return this.q;
    }

    @Px
    public int getIconPadding() {
        return this.n;
    }

    @Px
    public int getIconSize() {
        return this.k;
    }

    public ColorStateList getIconTint() {
        return this.h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.g;
    }

    @Dimension
    public int getInsetBottom() {
        return this.d.c();
    }

    @Dimension
    public int getInsetTop() {
        return this.d.d();
    }

    // 去混淆评级： 低(20)
    @Nullable
    public ColorStateList getRippleColor() {
        return this.j() ? this.d.h() : null;
    }

    @Override  // com.google.android.material.shape.t
    @NonNull
    public p getShapeAppearanceModel() {
        if(!this.j()) {
            throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        }
        return this.d.i();
    }

    // 去混淆评级： 低(20)
    public ColorStateList getStrokeColor() {
        return this.j() ? this.d.j() : null;
    }

    // 去混淆评级： 低(20)
    @Px
    public int getStrokeWidth() {
        return this.j() ? this.d.k() : 0;
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.appcompat.widget.AppCompatButton
    @Nullable
    @RestrictTo({Scope.b})
    public ColorStateList getSupportBackgroundTintList() {
        return this.j() ? this.d.l() : super.getSupportBackgroundTintList();
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.appcompat.widget.AppCompatButton
    @Nullable
    @RestrictTo({Scope.b})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return this.j() ? this.d.m() : super.getSupportBackgroundTintMode();
    }

    private int getTextHeight() {
        if(this.getLineCount() > 1) {
            return this.getLayout().getHeight();
        }
        TextPaint textPaint0 = this.getPaint();
        String s = this.getText().toString();
        if(this.getTransformationMethod() != null) {
            s = this.getTransformationMethod().getTransformation(s, this).toString();
        }
        Rect rect0 = new Rect();
        textPaint0.getTextBounds(s, 0, s.length(), rect0);
        return Math.min(rect0.height(), this.getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int v = this.getLineCount();
        float f = 0.0f;
        for(int v1 = 0; v1 < v; ++v1) {
            f = Math.max(f, this.getLayout().getLineWidth(v1));
        }
        return (int)Math.ceil(f);
    }

    private boolean h() {
        return ViewCompat.e0(this) == 1;
    }

    public boolean i() {
        return this.d.q();
    }

    @Override  // android.widget.Checkable
    public boolean isChecked() {
        return this.o;
    }

    private boolean j() {
        return this.d != null && !this.d.o();
    }

    public void k(@NonNull b materialButton$b0) {
        this.e.remove(materialButton$b0);
    }

    private void l() {
        if(this.f()) {
            TextViewCompat.u(this, this.i, null, null, null);
            return;
        }
        if(this.e()) {
            TextViewCompat.u(this, null, null, this.i, null);
            return;
        }
        if(this.g()) {
            TextViewCompat.u(this, null, this.i, null, null);
        }
    }

    private void m(boolean z) {
        Drawable drawable0 = this.i;
        if(drawable0 != null) {
            Drawable drawable1 = DrawableCompat.r(drawable0).mutate();
            this.i = drawable1;
            DrawableCompat.o(drawable1, this.h);
            PorterDuff.Mode porterDuff$Mode0 = this.g;
            if(porterDuff$Mode0 != null) {
                DrawableCompat.p(this.i, porterDuff$Mode0);
            }
            int v = this.k == 0 ? this.i.getIntrinsicWidth() : this.k;
            int v1 = this.k == 0 ? this.i.getIntrinsicHeight() : this.k;
            this.i.setBounds(this.l, this.m, v + this.l, v1 + this.m);
            this.i.setVisible(true, z);
        }
        if(z) {
            this.l();
            return;
        }
        Drawable[] arr_drawable = TextViewCompat.h(this);
        if(this.f() && arr_drawable[0] != this.i || this.e() && arr_drawable[2] != this.i || this.g() && arr_drawable[1] != this.i) {
            this.l();
        }
    }

    private void n(int v, int v1) {
        if(this.i != null && this.getLayout() != null) {
            if(!this.f() && !this.e()) {
                if(!this.g()) {
                    return;
                }
                this.l = 0;
                if(this.q == 16) {
                    this.m = 0;
                    this.m(false);
                    return;
                }
                int v2 = this.k == 0 ? this.i.getIntrinsicHeight() : this.k;
                int v3 = Math.max(0, (v1 - this.getTextHeight() - this.getPaddingTop() - v2 - this.n - this.getPaddingBottom()) / 2);
                if(this.m == v3) {
                    return;
                }
                this.m = v3;
                this.m(false);
                return;
            }
            this.m = 0;
            Layout.Alignment layout$Alignment0 = this.getActualTextAlignment();
            int v4 = this.q;
            boolean z = true;
            switch(v4) {
                case 2: {
                    if(layout$Alignment0 != Layout.Alignment.ALIGN_NORMAL) {
                    label_21:
                        if(v4 != 4 || layout$Alignment0 != Layout.Alignment.ALIGN_OPPOSITE) {
                            int v5 = this.k == 0 ? this.i.getIntrinsicWidth() : this.k;
                            int v6 = v - this.getTextLayoutWidth() - ViewCompat.o0(this) - v5 - this.n - ViewCompat.p0(this);
                            if(layout$Alignment0 == Layout.Alignment.ALIGN_CENTER) {
                                v6 /= 2;
                            }
                            boolean z1 = this.h();
                            if(this.q != 4) {
                                z = false;
                            }
                            if(z1 != z) {
                                v6 = -v6;
                            }
                            if(this.l != v6) {
                                this.l = v6;
                                this.m(false);
                            }
                            return;
                        }
                    }
                    break;
                }
                case 1: 
                case 3: {
                    break;
                }
                default: {
                    goto label_21;
                }
            }
            this.l = 0;
            this.m(false);
        }
    }

    @Override  // android.widget.TextView
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if(this.j()) {
            l.f(this, this.d.f());
        }
    }

    @Override  // android.widget.TextView
    protected int[] onCreateDrawableState(int v) {
        int[] arr_v = super.onCreateDrawableState(v + 2);
        if(this.d()) {
            View.mergeDrawableStates(arr_v, MaterialButton.r);
        }
        if(this.isChecked()) {
            View.mergeDrawableStates(arr_v, MaterialButton.s);
        }
        return arr_v;
    }

    @Override  // androidx.appcompat.widget.AppCompatButton
    public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent0) {
        super.onInitializeAccessibilityEvent(accessibilityEvent0);
        accessibilityEvent0.setClassName(this.getA11yClassName());
        accessibilityEvent0.setChecked(this.isChecked());
    }

    @Override  // androidx.appcompat.widget.AppCompatButton
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo0) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
        accessibilityNodeInfo0.setClassName(this.getA11yClassName());
        accessibilityNodeInfo0.setCheckable(this.d());
        accessibilityNodeInfo0.setChecked(this.isChecked());
        accessibilityNodeInfo0.setClickable(this.isClickable());
    }

    @Override  // androidx.appcompat.widget.AppCompatButton
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        if(Build.VERSION.SDK_INT == 21) {
            com.google.android.material.button.b b0 = this.d;
            if(b0 != null) {
                b0.J(v3 - v1, v2 - v);
            }
        }
        this.n(this.getMeasuredWidth(), this.getMeasuredHeight());
    }

    @Override  // android.widget.TextView
    public void onRestoreInstanceState(@Nullable Parcelable parcelable0) {
        if(!(parcelable0 instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((SavedState)parcelable0).a());
        this.setChecked(((SavedState)parcelable0).c);
    }

    @Override  // android.widget.TextView
    @NonNull
    public Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new SavedState(super.onSaveInstanceState());
        parcelable0.c = this.o;
        return parcelable0;
    }

    @Override  // androidx.appcompat.widget.AppCompatButton
    protected void onTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
        super.onTextChanged(charSequence0, v, v1, v2);
        this.n(this.getMeasuredWidth(), this.getMeasuredHeight());
    }

    @Override  // android.view.View
    public boolean performClick() {
        if(this.d.q()) {
            this.toggle();
        }
        return super.performClick();
    }

    @Override  // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if(this.i != null) {
            int[] arr_v = this.getDrawableState();
            if(this.i.setState(arr_v)) {
                this.invalidate();
            }
        }
    }

    void setA11yClassName(@Nullable String s) {
        this.j = s;
    }

    @Override  // android.view.View
    public void setBackground(@NonNull Drawable drawable0) {
        this.setBackgroundDrawable(drawable0);
    }

    @Override  // android.view.View
    public void setBackgroundColor(@ColorInt int v) {
        if(this.j()) {
            this.d.s(v);
            return;
        }
        super.setBackgroundColor(v);
    }

    @Override  // androidx.appcompat.widget.AppCompatButton
    public void setBackgroundDrawable(@NonNull Drawable drawable0) {
        if(this.j()) {
            if(drawable0 != this.getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                this.d.t();
                super.setBackgroundDrawable(drawable0);
                return;
            }
            this.getBackground().setState(drawable0.getState());
            return;
        }
        super.setBackgroundDrawable(drawable0);
    }

    @Override  // androidx.appcompat.widget.AppCompatButton
    public void setBackgroundResource(@DrawableRes int v) {
        this.setBackgroundDrawable((v == 0 ? null : AppCompatResources.b(this.getContext(), v)));
    }

    @Override  // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList0) {
        this.setSupportBackgroundTintList(colorStateList0);
    }

    @Override  // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        this.setSupportBackgroundTintMode(porterDuff$Mode0);
    }

    public void setCheckable(boolean z) {
        if(this.j()) {
            this.d.u(z);
        }
    }

    @Override  // android.widget.Checkable
    public void setChecked(boolean z) {
        if(this.d() && this.isEnabled() && this.o != z) {
            this.o = z;
            this.refreshDrawableState();
            if(this.getParent() instanceof MaterialButtonToggleGroup) {
                ((MaterialButtonToggleGroup)this.getParent()).p(this, this.o);
            }
            if(this.p) {
                return;
            }
            this.p = true;
            for(Object object0: this.e) {
                ((b)object0).a(this, this.o);
            }
            this.p = false;
        }
    }

    public void setCornerRadius(@Px int v) {
        if(this.j()) {
            this.d.v(v);
        }
    }

    public void setCornerRadiusResource(@DimenRes int v) {
        if(this.j()) {
            this.setCornerRadius(this.getResources().getDimensionPixelSize(v));
        }
    }

    @Override  // android.view.View
    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        if(this.j()) {
            this.d.f().o0(f);
        }
    }

    public void setIcon(@Nullable Drawable drawable0) {
        if(this.i != drawable0) {
            this.i = drawable0;
            this.m(true);
            this.n(this.getMeasuredWidth(), this.getMeasuredHeight());
        }
    }

    public void setIconGravity(int v) {
        if(this.q != v) {
            this.q = v;
            this.n(this.getMeasuredWidth(), this.getMeasuredHeight());
        }
    }

    public void setIconPadding(@Px int v) {
        if(this.n != v) {
            this.n = v;
            this.setCompoundDrawablePadding(v);
        }
    }

    public void setIconResource(@DrawableRes int v) {
        this.setIcon((v == 0 ? null : AppCompatResources.b(this.getContext(), v)));
    }

    public void setIconSize(@Px int v) {
        if(v < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if(this.k != v) {
            this.k = v;
            this.m(true);
        }
    }

    public void setIconTint(@Nullable ColorStateList colorStateList0) {
        if(this.h != colorStateList0) {
            this.h = colorStateList0;
            this.m(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode porterDuff$Mode0) {
        if(this.g != porterDuff$Mode0) {
            this.g = porterDuff$Mode0;
            this.m(false);
        }
    }

    public void setIconTintResource(@ColorRes int v) {
        this.setIconTint(AppCompatResources.a(this.getContext(), v));
    }

    public void setInsetBottom(@Dimension int v) {
        this.d.w(v);
    }

    public void setInsetTop(@Dimension int v) {
        this.d.x(v);
    }

    void setInternalBackground(Drawable drawable0) {
        super.setBackgroundDrawable(drawable0);
    }

    void setOnPressedChangeListenerInternal(@Nullable c materialButton$c0) {
        this.f = materialButton$c0;
    }

    @Override  // android.view.View
    public void setPressed(boolean z) {
        c materialButton$c0 = this.f;
        if(materialButton$c0 != null) {
            materialButton$c0.a(this, z);
        }
        super.setPressed(z);
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList0) {
        if(this.j()) {
            this.d.y(colorStateList0);
        }
    }

    public void setRippleColorResource(@ColorRes int v) {
        if(this.j()) {
            this.setRippleColor(AppCompatResources.a(this.getContext(), v));
        }
    }

    @Override  // com.google.android.material.shape.t
    public void setShapeAppearanceModel(@NonNull p p0) {
        if(!this.j()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.d.z(p0);
    }

    void setShouldDrawSurfaceColorStroke(boolean z) {
        if(this.j()) {
            this.d.A(z);
        }
    }

    public void setStrokeColor(@Nullable ColorStateList colorStateList0) {
        if(this.j()) {
            this.d.B(colorStateList0);
        }
    }

    public void setStrokeColorResource(@ColorRes int v) {
        if(this.j()) {
            this.setStrokeColor(AppCompatResources.a(this.getContext(), v));
        }
    }

    public void setStrokeWidth(@Px int v) {
        if(this.j()) {
            this.d.C(v);
        }
    }

    public void setStrokeWidthResource(@DimenRes int v) {
        if(this.j()) {
            this.setStrokeWidth(this.getResources().getDimensionPixelSize(v));
        }
    }

    @Override  // androidx.appcompat.widget.AppCompatButton
    @RestrictTo({Scope.b})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList0) {
        if(this.j()) {
            this.d.D(colorStateList0);
            return;
        }
        super.setSupportBackgroundTintList(colorStateList0);
    }

    @Override  // androidx.appcompat.widget.AppCompatButton
    @RestrictTo({Scope.b})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        if(this.j()) {
            this.d.E(porterDuff$Mode0);
            return;
        }
        super.setSupportBackgroundTintMode(porterDuff$Mode0);
    }

    @Override  // android.view.View
    @RequiresApi(17)
    public void setTextAlignment(int v) {
        super.setTextAlignment(v);
        this.n(this.getMeasuredWidth(), this.getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.d.F(z);
    }

    @Override  // android.widget.Checkable
    public void toggle() {
        this.setChecked(!this.o);
    }
}

