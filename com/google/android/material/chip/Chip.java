package com.google.android.material.chip;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;
import android.widget.TextView.BufferType;
import androidx.annotation.AnimatorRes;
import androidx.annotation.BoolRes;
import androidx.annotation.CallSuper;
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
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.google.android.material.R.attr;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.animation.i;
import com.google.android.material.internal.D;
import com.google.android.material.internal.M;
import com.google.android.material.internal.m;
import com.google.android.material.resources.d;
import com.google.android.material.resources.e;
import com.google.android.material.resources.g;
import com.google.android.material.shape.l;
import com.google.android.material.shape.p;
import com.google.android.material.shape.t;
import java.util.List;

public class Chip extends AppCompatCheckBox implements a, m, t {
    class com.google.android.material.chip.Chip.a extends g {
        final Chip a;

        @Override  // com.google.android.material.resources.g
        public void a(int v) {
        }

        @Override  // com.google.android.material.resources.g
        public void b(@NonNull Typeface typeface0, boolean z) {
            CharSequence charSequence0 = Chip.this.e.L3() ? Chip.this.e.Q1() : Chip.this.getText();
            Chip.this.setText(charSequence0);
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    class c extends ExploreByTouchHelper {
        final Chip t;

        c(Chip chip1) {
            super(chip1);
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.customview.widget.ExploreByTouchHelper
        protected int C(float f, float f1) {
            return !Chip.this.o() || !Chip.this.getCloseIconTouchBounds().contains(f, f1) ? 0 : 1;
        }

        @Override  // androidx.customview.widget.ExploreByTouchHelper
        protected void D(@NonNull List list0) {
            list0.add(0);
            if(Chip.this.o() && Chip.this.y() && Chip.this.h != null) {
                list0.add(1);
            }
        }

        @Override  // androidx.customview.widget.ExploreByTouchHelper
        protected boolean N(int v, int v1, Bundle bundle0) {
            if(v1 == 16) {
                if(v == 0) {
                    return Chip.this.performClick();
                }
                return v == 1 ? Chip.this.A() : false;
            }
            return false;
        }

        @Override  // androidx.customview.widget.ExploreByTouchHelper
        protected void Q(@NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
            accessibilityNodeInfoCompat0.i1(Chip.this.s());
            accessibilityNodeInfoCompat0.l1(Chip.this.isClickable());
            accessibilityNodeInfoCompat0.k1(Chip.this.getAccessibilityClassName());
            CharSequence charSequence0 = Chip.this.getText();
            if(Build.VERSION.SDK_INT >= 23) {
                accessibilityNodeInfoCompat0.f2(charSequence0);
                return;
            }
            accessibilityNodeInfoCompat0.p1(charSequence0);
        }

        @Override  // androidx.customview.widget.ExploreByTouchHelper
        protected void R(int v, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
            CharSequence charSequence0 = "";
            if(v == 1) {
                CharSequence charSequence1 = Chip.this.getCloseIconContentDescription();
                if(charSequence1 == null) {
                    CharSequence charSequence2 = Chip.this.getText();
                    Context context0 = Chip.this.getContext();
                    if(!TextUtils.isEmpty(charSequence2)) {
                        charSequence0 = charSequence2;
                    }
                    accessibilityNodeInfoCompat0.p1(context0.getString(0x7F15069D, new Object[]{charSequence0}).trim());  // string:mtrl_chip_close_icon_content_description "Remove %1$s"
                }
                else {
                    accessibilityNodeInfoCompat0.p1(charSequence1);
                }
                accessibilityNodeInfoCompat0.e1(Chip.this.getCloseIconTouchBoundsInt());
                accessibilityNodeInfoCompat0.b(AccessibilityActionCompat.j);
                accessibilityNodeInfoCompat0.v1(Chip.this.isEnabled());
                return;
            }
            accessibilityNodeInfoCompat0.p1("");
            accessibilityNodeInfoCompat0.e1(Chip.B);
        }

        @Override  // androidx.customview.widget.ExploreByTouchHelper
        protected void S(int v, boolean z) {
            if(v == 1) {
                Chip.this.n = z;
                Chip.this.refreshDrawableState();
            }
        }
    }

    private static final int A = 1;
    private static final Rect B = null;
    private static final int[] C = null;
    private static final int[] D = null;
    private static final String E = "http://schemas.android.com/apk/res/android";
    private static final int F = 0x30;
    private static final String G = "android.widget.Button";
    private static final String H = "android.widget.RadioButton";
    private static final String I = "android.view.View";
    @Nullable
    private b e;
    @Nullable
    private InsetDrawable f;
    @Nullable
    private RippleDrawable g;
    @Nullable
    private View.OnClickListener h;
    @Nullable
    private CompoundButton.OnCheckedChangeListener i;
    @Nullable
    private com.google.android.material.internal.m.a j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private int p;
    @Dimension(unit = 1)
    private int q;
    @Nullable
    private CharSequence r;
    @NonNull
    private final c s;
    private boolean t;
    private final Rect u;
    private final RectF v;
    private final g w;
    private static final String x = "Chip";
    private static final int y;
    private static final int z;

    static {
        Chip.y = style.Widget_MaterialComponents_Chip_Action;
        Chip.B = new Rect();
        Chip.C = new int[]{0x10100A1};
        Chip.D = new int[]{0x101009F};
    }

    public Chip(Context context0) {
        this(context0, null);
    }

    public Chip(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.chipStyle);
    }

    public Chip(Context context0, AttributeSet attributeSet0, int v) {
        super(I1.a.c(context0, attributeSet0, v, Chip.y), attributeSet0, v);
        this.u = new Rect();
        this.v = new RectF();
        this.w = new com.google.android.material.chip.Chip.a(this);
        Context context1 = this.getContext();
        this.J(attributeSet0);
        b b0 = b.b1(context1, attributeSet0, v, Chip.y);
        this.p(context1, attributeSet0, v);
        this.setChipDrawable(b0);
        b0.o0(ViewCompat.V(this));
        TypedArray typedArray0 = D.k(context1, attributeSet0, styleable.Chip, v, Chip.y, new int[0]);
        if(Build.VERSION.SDK_INT < 23) {
            this.setTextColor(d.a(context1, typedArray0, styleable.Chip_android_textColor));
        }
        boolean z = typedArray0.hasValue(styleable.Chip_shapeAppearance);
        typedArray0.recycle();
        this.s = new c(this, this);
        this.E();
        if(!z) {
            this.q();
        }
        this.setChecked(this.k);
        this.setText(b0.Q1());
        this.setEllipsize(b0.J1());
        this.I();
        if(!this.e.L3()) {
            this.setLines(1);
            this.setHorizontallyScrolling(true);
        }
        this.setGravity(0x800013);
        this.H();
        if(this.C()) {
            this.setMinHeight(this.q);
        }
        this.p = ViewCompat.e0(this);
        super.setOnCheckedChangeListener((CompoundButton compoundButton0, boolean z) -> {
            com.google.android.material.internal.m.a m$a0 = this.j;
            if(m$a0 != null) {
                m$a0.a(this, z);
            }
            CompoundButton.OnCheckedChangeListener compoundButton$OnCheckedChangeListener0 = this.i;
            if(compoundButton$OnCheckedChangeListener0 != null) {
                compoundButton$OnCheckedChangeListener0.onCheckedChanged(compoundButton0, z);
            }
        });
    }

    @CallSuper
    public boolean A() {
        boolean z = false;
        this.playSoundEffect(0);
        View.OnClickListener view$OnClickListener0 = this.h;
        if(view$OnClickListener0 != null) {
            view$OnClickListener0.onClick(this);
            z = true;
        }
        if(this.t) {
            this.s.Y(1, 1);
        }
        return z;
    }

    private void B() {
        if(this.f != null) {
            this.f = null;
            this.setMinWidth(0);
            this.setMinHeight(((int)this.getChipMinHeight()));
            this.F();
        }
    }

    public boolean C() {
        return this.o;
    }

    private void D(@Nullable b b0) {
        if(b0 != null) {
            b0.l3(null);
        }
    }

    private void E() {
        if(this.o() && this.y() && this.h != null) {
            ViewCompat.J1(this, this.s);
            this.t = true;
            return;
        }
        ViewCompat.J1(this, null);
        this.t = false;
    }

    private void F() {
        if(com.google.android.material.ripple.b.a) {
            this.G();
            return;
        }
        this.e.K3(true);
        ViewCompat.R1(this, this.getBackgroundDrawable());
        this.H();
        this.n();
    }

    private void G() {
        this.g = new RippleDrawable(com.google.android.material.ripple.b.e(this.e.O1()), this.getBackgroundDrawable(), null);
        this.e.K3(false);
        ViewCompat.R1(this, this.g);
        this.H();
    }

    private void H() {
        if(!TextUtils.isEmpty(this.getText())) {
            b b0 = this.e;
            if(b0 != null) {
                int v = (int)(b0.q1() + this.e.S1() + this.e.W0());
                int v1 = (int)(this.e.v1() + this.e.T1() + this.e.S0());
                if(this.f != null) {
                    Rect rect0 = new Rect();
                    this.f.getPadding(rect0);
                    v1 += rect0.left;
                    v += rect0.right;
                }
                ViewCompat.p2(this, v1, this.getPaddingTop(), v, this.getPaddingBottom());
            }
        }
    }

    private void I() {
        TextPaint textPaint0 = this.getPaint();
        b b0 = this.e;
        if(b0 != null) {
            textPaint0.drawableState = b0.getState();
        }
        e e0 = this.getTextAppearance();
        if(e0 != null) {
            e0.n(this.getContext(), textPaint0, this.w);
        }
    }

    private void J(@Nullable AttributeSet attributeSet0) {
        if(attributeSet0 == null) {
            return;
        }
        if(attributeSet0.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
        if(attributeSet0.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if(attributeSet0.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if(attributeSet0.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null || attributeSet0.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if(!attributeSet0.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet0.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet0.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet0.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        if(attributeSet0.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 0x800013) != 0x800013) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        }
    }

    @Override  // com.google.android.material.chip.b$a
    public void b() {
        this.m(this.q);
        this.requestLayout();
        this.invalidateOutline();
    }

    // 去混淆评级： 低(30)
    @Override  // android.view.View
    protected boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent0) {
        return this.t ? this.s.v(motionEvent0) || super.dispatchHoverEvent(motionEvent0) : super.dispatchHoverEvent(motionEvent0);
    }

    @Override  // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent0) {
        if(!this.t) {
            return super.dispatchKeyEvent(keyEvent0);
        }
        return !this.s.w(keyEvent0) || this.s.B() == 0x80000000 ? super.dispatchKeyEvent(keyEvent0) : true;
    }

    @Override  // androidx.appcompat.widget.AppCompatCheckBox
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if((this.e == null || !this.e.d2() ? false : this.e.g3(this.l()))) {
            this.invalidate();
        }
    }

    @Override  // android.widget.CheckBox
    @NonNull
    public CharSequence getAccessibilityClassName() {
        if(!TextUtils.isEmpty(this.r)) {
            return this.r;
        }
        if(this.s()) {
            ViewParent viewParent0 = this.getParent();
            return !(viewParent0 instanceof ChipGroup) || !((ChipGroup)viewParent0).l() ? "android.widget.Button" : "android.widget.RadioButton";
        }
        return this.isClickable() ? "android.widget.Button" : "android.view.View";
    }

    @Nullable
    public Drawable getBackgroundDrawable() {
        Drawable drawable0 = this.f;
        return drawable0 == null ? this.e : drawable0;
    }

    @Nullable
    public Drawable getCheckedIcon() {
        return this.e == null ? null : this.e.m1();
    }

    @Nullable
    public ColorStateList getCheckedIconTint() {
        return this.e == null ? null : this.e.n1();
    }

    @Nullable
    public ColorStateList getChipBackgroundColor() {
        return this.e == null ? null : this.e.o1();
    }

    public float getChipCornerRadius() {
        return this.e == null ? 0.0f : Math.max(0.0f, this.e.p1());
    }

    public Drawable getChipDrawable() {
        return this.e;
    }

    public float getChipEndPadding() {
        return this.e == null ? 0.0f : this.e.q1();
    }

    @Nullable
    public Drawable getChipIcon() {
        return this.e == null ? null : this.e.r1();
    }

    public float getChipIconSize() {
        return this.e == null ? 0.0f : this.e.s1();
    }

    @Nullable
    public ColorStateList getChipIconTint() {
        return this.e == null ? null : this.e.t1();
    }

    public float getChipMinHeight() {
        return this.e == null ? 0.0f : this.e.u1();
    }

    public float getChipStartPadding() {
        return this.e == null ? 0.0f : this.e.v1();
    }

    @Nullable
    public ColorStateList getChipStrokeColor() {
        return this.e == null ? null : this.e.w1();
    }

    public float getChipStrokeWidth() {
        return this.e == null ? 0.0f : this.e.x1();
    }

    @Deprecated
    public CharSequence getChipText() {
        return this.getText();
    }

    @Nullable
    public Drawable getCloseIcon() {
        return this.e == null ? null : this.e.z1();
    }

    @Nullable
    public CharSequence getCloseIconContentDescription() {
        return this.e == null ? null : this.e.A1();
    }

    public float getCloseIconEndPadding() {
        return this.e == null ? 0.0f : this.e.B1();
    }

    public float getCloseIconSize() {
        return this.e == null ? 0.0f : this.e.C1();
    }

    public float getCloseIconStartPadding() {
        return this.e == null ? 0.0f : this.e.D1();
    }

    @Nullable
    public ColorStateList getCloseIconTint() {
        return this.e == null ? null : this.e.F1();
    }

    @NonNull
    private RectF getCloseIconTouchBounds() {
        this.v.setEmpty();
        if(this.o() && this.h != null) {
            this.e.G1(this.v);
        }
        return this.v;
    }

    @NonNull
    private Rect getCloseIconTouchBoundsInt() {
        RectF rectF0 = this.getCloseIconTouchBounds();
        this.u.set(((int)rectF0.left), ((int)rectF0.top), ((int)rectF0.right), ((int)rectF0.bottom));
        return this.u;
    }

    @Override  // android.widget.TextView
    @Nullable
    public TextUtils.TruncateAt getEllipsize() {
        return this.e == null ? null : this.e.J1();
    }

    @Override  // android.widget.TextView
    public void getFocusedRect(@NonNull Rect rect0) {
        if(this.t && (this.s.B() == 1 || this.s.x() == 1)) {
            rect0.set(this.getCloseIconTouchBoundsInt());
            return;
        }
        super.getFocusedRect(rect0);
    }

    @Nullable
    public i getHideMotionSpec() {
        return this.e == null ? null : this.e.K1();
    }

    public float getIconEndPadding() {
        return this.e == null ? 0.0f : this.e.L1();
    }

    public float getIconStartPadding() {
        return this.e == null ? 0.0f : this.e.M1();
    }

    @Nullable
    public ColorStateList getRippleColor() {
        return this.e == null ? null : this.e.O1();
    }

    @Override  // com.google.android.material.shape.t
    @NonNull
    public p getShapeAppearanceModel() {
        return this.e.getShapeAppearanceModel();
    }

    @Nullable
    public i getShowMotionSpec() {
        return this.e == null ? null : this.e.P1();
    }

    @Nullable
    private e getTextAppearance() {
        return this.e == null ? null : this.e.R1();
    }

    public float getTextEndPadding() {
        return this.e == null ? 0.0f : this.e.S1();
    }

    public float getTextStartPadding() {
        return this.e == null ? 0.0f : this.e.T1();
    }

    private void k(@NonNull b b0) {
        b0.l3(this);
    }

    @NonNull
    private int[] l() {
        int v = this.isEnabled();
        if(this.n) {
            ++v;
        }
        if(this.m) {
            ++v;
        }
        if(this.l) {
            ++v;
        }
        if(this.isChecked()) {
            ++v;
        }
        int[] arr_v = new int[v];
        int v1 = 0;
        if(this.isEnabled()) {
            arr_v[0] = 0x101009E;
            v1 = 1;
        }
        if(this.n) {
            arr_v[v1] = 0x101009C;
            ++v1;
        }
        if(this.m) {
            arr_v[v1] = 0x1010367;
            ++v1;
        }
        if(this.l) {
            arr_v[v1] = 0x10100A7;
            ++v1;
        }
        if(this.isChecked()) {
            arr_v[v1] = 0x10100A1;
        }
        return arr_v;
    }

    public boolean m(@Dimension int v) {
        this.q = v;
        int v1 = 0;
        if(!this.C()) {
            if(this.f != null) {
                this.B();
                return false;
            }
            this.F();
            return false;
        }
        int v2 = Math.max(0, v - this.e.getIntrinsicHeight());
        int v3 = Math.max(0, v - this.e.getIntrinsicWidth());
        if(v3 <= 0 && v2 <= 0) {
            if(this.f != null) {
                this.B();
                return false;
            }
            this.F();
            return false;
        }
        int v4 = v3 <= 0 ? 0 : v3 / 2;
        if(v2 > 0) {
            v1 = v2 / 2;
        }
        if(this.f != null) {
            Rect rect0 = new Rect();
            this.f.getPadding(rect0);
            if(rect0.top == v1 && rect0.bottom == v1 && rect0.left == v4 && rect0.right == v4) {
                this.F();
                return true;
            }
        }
        if(this.getMinHeight() != v) {
            this.setMinHeight(v);
        }
        if(this.getMinWidth() != v) {
            this.setMinWidth(v);
        }
        this.r(v4, v1, v4, v1);
        this.F();
        return true;
    }

    private void n() {
        if(this.getBackgroundDrawable() == this.f && this.e.getCallback() == null) {
            this.e.setCallback(this.f);
        }
    }

    private boolean o() {
        return this.e != null && this.e.z1() != null;
    }

    @Override  // android.widget.TextView
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        l.f(this, this.e);
    }

    @Override  // android.widget.CompoundButton
    protected int[] onCreateDrawableState(int v) {
        int[] arr_v = super.onCreateDrawableState(v + 2);
        if(this.isChecked()) {
            View.mergeDrawableStates(arr_v, Chip.C);
        }
        if(this.s()) {
            View.mergeDrawableStates(arr_v, Chip.D);
        }
        return arr_v;
    }

    @Override  // android.widget.TextView
    protected void onFocusChanged(boolean z, int v, Rect rect0) {
        super.onFocusChanged(z, v, rect0);
        if(this.t) {
            this.s.M(z, v, rect0);
        }
    }

    @Override  // android.view.View
    public boolean onHoverEvent(@NonNull MotionEvent motionEvent0) {
        switch(motionEvent0.getActionMasked()) {
            case 7: {
                this.setCloseIconHovered(this.getCloseIconTouchBounds().contains(motionEvent0.getX(), motionEvent0.getY()));
                return super.onHoverEvent(motionEvent0);
            }
            case 10: {
                this.setCloseIconHovered(false);
                return super.onHoverEvent(motionEvent0);
            }
            default: {
                return super.onHoverEvent(motionEvent0);
            }
        }
    }

    @Override  // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo0) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
        accessibilityNodeInfo0.setClassName(this.getAccessibilityClassName());
        accessibilityNodeInfo0.setCheckable(this.s());
        accessibilityNodeInfo0.setClickable(this.isClickable());
        if(this.getParent() instanceof ChipGroup) {
            ChipGroup chipGroup0 = (ChipGroup)this.getParent();
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0 = AccessibilityNodeInfoCompat.t2(accessibilityNodeInfo0);
            int v = chipGroup0.c() ? chipGroup0.i(this) : -1;
            accessibilityNodeInfoCompat0.n1(CollectionItemInfoCompat.j(chipGroup0.b(this), 1, v, 1, false, this.isChecked()));
        }
    }

    // 去混淆评级： 低(20)
    @Override  // android.widget.Button
    @TargetApi(24)
    @Nullable
    public PointerIcon onResolvePointerIcon(@NonNull MotionEvent motionEvent0, int v) {
        return !this.getCloseIconTouchBounds().contains(motionEvent0.getX(), motionEvent0.getY()) || !this.isEnabled() ? super.onResolvePointerIcon(motionEvent0, v) : PointerIcon.getSystemIcon(this.getContext(), 1002);
    }

    @Override  // android.widget.TextView
    @TargetApi(17)
    public void onRtlPropertiesChanged(int v) {
        super.onRtlPropertiesChanged(v);
        if(this.p != v) {
            this.p = v;
            this.H();
        }
    }

    @Override  // android.widget.TextView
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent0) {
        boolean z1;
        int v = motionEvent0.getActionMasked();
        boolean z = this.getCloseIconTouchBounds().contains(motionEvent0.getX(), motionEvent0.getY());
        switch(v) {
            case 0: {
                if(!z) {
                    return super.onTouchEvent(motionEvent0);
                }
                this.setCloseIconPressed(true);
                return true;
            }
            case 1: {
                if(this.l) {
                    this.A();
                    z1 = true;
                }
                else {
                    z1 = false;
                }
                break;
            }
            case 2: {
                if(this.l) {
                    if(!z) {
                        this.setCloseIconPressed(false);
                    }
                    return true;
                }
                return super.onTouchEvent(motionEvent0);
            }
            case 3: {
                z1 = false;
                break;
            }
            default: {
                return super.onTouchEvent(motionEvent0);
            }
        }
        this.setCloseIconPressed(false);
        return z1 || super.onTouchEvent(motionEvent0);
    }

    private void p(Context context0, @Nullable AttributeSet attributeSet0, int v) {
        TypedArray typedArray0 = D.k(context0, attributeSet0, styleable.Chip, v, Chip.y, new int[0]);
        this.o = typedArray0.getBoolean(styleable.Chip_ensureMinTouchTargetSize, false);
        float f = (float)Math.ceil(M.i(this.getContext(), 0x30));
        this.q = (int)Math.ceil(typedArray0.getDimension(styleable.Chip_chipMinTouchTargetSize, f));
        typedArray0.recycle();
    }

    private void q() {
        class com.google.android.material.chip.Chip.b extends ViewOutlineProvider {
            final Chip a;

            @Override  // android.view.ViewOutlineProvider
            @TargetApi(21)
            public void getOutline(View view0, @NonNull Outline outline0) {
                if(Chip.this.e != null) {
                    Chip.this.e.getOutline(outline0);
                    return;
                }
                outline0.setAlpha(0.0f);
            }
        }

        this.setOutlineProvider(new com.google.android.material.chip.Chip.b(this));
    }

    private void r(int v, int v1, int v2, int v3) {
        this.f = new InsetDrawable(this.e, v, v1, v2, v3);
    }

    public boolean s() {
        return this.e != null && this.e.X1();
    }

    public void setAccessibilityClassName(@Nullable CharSequence charSequence0) {
        this.r = charSequence0;
    }

    @Override  // android.view.View
    public void setBackground(Drawable drawable0) {
        if(drawable0 != this.getBackgroundDrawable() && drawable0 != this.g) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            return;
        }
        super.setBackground(drawable0);
    }

    @Override  // android.view.View
    public void setBackgroundColor(int v) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override  // androidx.appcompat.widget.AppCompatCheckBox
    public void setBackgroundDrawable(Drawable drawable0) {
        if(drawable0 != this.getBackgroundDrawable() && drawable0 != this.g) {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
            return;
        }
        super.setBackgroundDrawable(drawable0);
    }

    @Override  // androidx.appcompat.widget.AppCompatCheckBox
    public void setBackgroundResource(int v) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override  // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList0) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override  // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        b b0 = this.e;
        if(b0 != null) {
            b0.m2(z);
        }
    }

    public void setCheckableResource(@BoolRes int v) {
        b b0 = this.e;
        if(b0 != null) {
            b0.n2(v);
        }
    }

    @Override  // android.widget.Checkable, android.widget.CompoundButton
    public void setChecked(boolean z) {
        b b0 = this.e;
        if(b0 == null) {
            this.k = z;
            return;
        }
        if(b0.X1()) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(@Nullable Drawable drawable0) {
        b b0 = this.e;
        if(b0 != null) {
            b0.o2(drawable0);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        this.setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(@BoolRes int v) {
        this.setCheckedIconVisible(v);
    }

    public void setCheckedIconResource(@DrawableRes int v) {
        b b0 = this.e;
        if(b0 != null) {
            b0.r2(v);
        }
    }

    public void setCheckedIconTint(@Nullable ColorStateList colorStateList0) {
        b b0 = this.e;
        if(b0 != null) {
            b0.s2(colorStateList0);
        }
    }

    public void setCheckedIconTintResource(@ColorRes int v) {
        b b0 = this.e;
        if(b0 != null) {
            b0.t2(v);
        }
    }

    public void setCheckedIconVisible(@BoolRes int v) {
        b b0 = this.e;
        if(b0 != null) {
            b0.u2(v);
        }
    }

    public void setCheckedIconVisible(boolean z) {
        b b0 = this.e;
        if(b0 != null) {
            b0.v2(z);
        }
    }

    public void setChipBackgroundColor(@Nullable ColorStateList colorStateList0) {
        b b0 = this.e;
        if(b0 != null) {
            b0.w2(colorStateList0);
        }
    }

    public void setChipBackgroundColorResource(@ColorRes int v) {
        b b0 = this.e;
        if(b0 != null) {
            b0.x2(v);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        b b0 = this.e;
        if(b0 != null) {
            b0.y2(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(@DimenRes int v) {
        b b0 = this.e;
        if(b0 != null) {
            b0.z2(v);
        }
    }

    public void setChipDrawable(@NonNull b b0) {
        b b1 = this.e;
        if(b1 != b0) {
            this.D(b1);
            this.e = b0;
            b0.w3(false);
            this.k(this.e);
            this.m(this.q);
        }
    }

    public void setChipEndPadding(float f) {
        b b0 = this.e;
        if(b0 != null) {
            b0.A2(f);
        }
    }

    public void setChipEndPaddingResource(@DimenRes int v) {
        b b0 = this.e;
        if(b0 != null) {
            b0.B2(v);
        }
    }

    public void setChipIcon(@Nullable Drawable drawable0) {
        b b0 = this.e;
        if(b0 != null) {
            b0.C2(drawable0);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        this.setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(@BoolRes int v) {
        this.setChipIconVisible(v);
    }

    public void setChipIconResource(@DrawableRes int v) {
        b b0 = this.e;
        if(b0 != null) {
            b0.F2(v);
        }
    }

    public void setChipIconSize(float f) {
        b b0 = this.e;
        if(b0 != null) {
            b0.G2(f);
        }
    }

    public void setChipIconSizeResource(@DimenRes int v) {
        b b0 = this.e;
        if(b0 != null) {
            b0.H2(v);
        }
    }

    public void setChipIconTint(@Nullable ColorStateList colorStateList0) {
        b b0 = this.e;
        if(b0 != null) {
            b0.I2(colorStateList0);
        }
    }

    public void setChipIconTintResource(@ColorRes int v) {
        b b0 = this.e;
        if(b0 != null) {
            b0.J2(v);
        }
    }

    public void setChipIconVisible(@BoolRes int v) {
        b b0 = this.e;
        if(b0 != null) {
            b0.K2(v);
        }
    }

    public void setChipIconVisible(boolean z) {
        b b0 = this.e;
        if(b0 != null) {
            b0.L2(z);
        }
    }

    public void setChipMinHeight(float f) {
        b b0 = this.e;
        if(b0 != null) {
            b0.M2(f);
        }
    }

    public void setChipMinHeightResource(@DimenRes int v) {
        b b0 = this.e;
        if(b0 != null) {
            b0.N2(v);
        }
    }

    public void setChipStartPadding(float f) {
        b b0 = this.e;
        if(b0 != null) {
            b0.O2(f);
        }
    }

    public void setChipStartPaddingResource(@DimenRes int v) {
        b b0 = this.e;
        if(b0 != null) {
            b0.P2(v);
        }
    }

    public void setChipStrokeColor(@Nullable ColorStateList colorStateList0) {
        b b0 = this.e;
        if(b0 != null) {
            b0.Q2(colorStateList0);
        }
    }

    public void setChipStrokeColorResource(@ColorRes int v) {
        b b0 = this.e;
        if(b0 != null) {
            b0.R2(v);
        }
    }

    public void setChipStrokeWidth(float f) {
        b b0 = this.e;
        if(b0 != null) {
            b0.S2(f);
        }
    }

    public void setChipStrokeWidthResource(@DimenRes int v) {
        b b0 = this.e;
        if(b0 != null) {
            b0.T2(v);
        }
    }

    @Deprecated
    public void setChipText(@Nullable CharSequence charSequence0) {
        this.setText(charSequence0);
    }

    @Deprecated
    public void setChipTextResource(@StringRes int v) {
        this.setText(this.getResources().getString(v));
    }

    public void setCloseIcon(@Nullable Drawable drawable0) {
        b b0 = this.e;
        if(b0 != null) {
            b0.V2(drawable0);
        }
        this.E();
    }

    public void setCloseIconContentDescription(@Nullable CharSequence charSequence0) {
        b b0 = this.e;
        if(b0 != null) {
            b0.W2(charSequence0);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        this.setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(@BoolRes int v) {
        this.setCloseIconVisible(v);
    }

    public void setCloseIconEndPadding(float f) {
        b b0 = this.e;
        if(b0 != null) {
            b0.Z2(f);
        }
    }

    public void setCloseIconEndPaddingResource(@DimenRes int v) {
        b b0 = this.e;
        if(b0 != null) {
            b0.a3(v);
        }
    }

    private void setCloseIconHovered(boolean z) {
        if(this.m != z) {
            this.m = z;
            this.refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if(this.l != z) {
            this.l = z;
            this.refreshDrawableState();
        }
    }

    public void setCloseIconResource(@DrawableRes int v) {
        b b0 = this.e;
        if(b0 != null) {
            b0.b3(v);
        }
        this.E();
    }

    public void setCloseIconSize(float f) {
        b b0 = this.e;
        if(b0 != null) {
            b0.c3(f);
        }
    }

    public void setCloseIconSizeResource(@DimenRes int v) {
        b b0 = this.e;
        if(b0 != null) {
            b0.d3(v);
        }
    }

    public void setCloseIconStartPadding(float f) {
        b b0 = this.e;
        if(b0 != null) {
            b0.e3(f);
        }
    }

    public void setCloseIconStartPaddingResource(@DimenRes int v) {
        b b0 = this.e;
        if(b0 != null) {
            b0.f3(v);
        }
    }

    public void setCloseIconTint(@Nullable ColorStateList colorStateList0) {
        b b0 = this.e;
        if(b0 != null) {
            b0.h3(colorStateList0);
        }
    }

    public void setCloseIconTintResource(@ColorRes int v) {
        b b0 = this.e;
        if(b0 != null) {
            b0.i3(v);
        }
    }

    public void setCloseIconVisible(@BoolRes int v) {
        this.setCloseIconVisible(this.getResources().getBoolean(v));
    }

    public void setCloseIconVisible(boolean z) {
        b b0 = this.e;
        if(b0 != null) {
            b0.k3(z);
        }
        this.E();
    }

    @Override  // androidx.appcompat.widget.AppCompatCheckBox
    public void setCompoundDrawables(@Nullable Drawable drawable0, @Nullable Drawable drawable1, @Nullable Drawable drawable2, @Nullable Drawable drawable3) {
        if(drawable0 != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if(drawable2 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(null, drawable1, null, drawable3);
    }

    @Override  // androidx.appcompat.widget.AppCompatCheckBox
    @RequiresApi(17)
    public void setCompoundDrawablesRelative(@Nullable Drawable drawable0, @Nullable Drawable drawable1, @Nullable Drawable drawable2, @Nullable Drawable drawable3) {
        if(drawable0 != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if(drawable2 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(null, drawable1, null, drawable3);
    }

    @Override  // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int v, int v1, int v2, int v3) {
        if(v != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if(v2 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(0, v1, 0, v3);
    }

    @Override  // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@Nullable Drawable drawable0, @Nullable Drawable drawable1, @Nullable Drawable drawable2, @Nullable Drawable drawable3) {
        if(drawable0 != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if(drawable2 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(null, drawable1, null, drawable3);
    }

    @Override  // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int v, int v1, int v2, int v3) {
        if(v != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if(v2 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(0, v1, 0, v3);
    }

    @Override  // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(@Nullable Drawable drawable0, @Nullable Drawable drawable1, @Nullable Drawable drawable2, @Nullable Drawable drawable3) {
        if(drawable0 != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if(drawable2 != null) {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(null, drawable1, null, drawable3);
    }

    @Override  // android.view.View
    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        b b0 = this.e;
        if(b0 != null) {
            b0.o0(f);
        }
    }

    @Override  // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt textUtils$TruncateAt0) {
        if(this.e == null) {
            return;
        }
        if(textUtils$TruncateAt0 == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(textUtils$TruncateAt0);
        b b0 = this.e;
        if(b0 != null) {
            b0.m3(textUtils$TruncateAt0);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.o = z;
        this.m(this.q);
    }

    @Override  // android.widget.TextView
    public void setGravity(int v) {
        if(v != 0x800013) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
            return;
        }
        super.setGravity(0x800013);
    }

    public void setHideMotionSpec(@Nullable i i0) {
        b b0 = this.e;
        if(b0 != null) {
            b0.n3(i0);
        }
    }

    public void setHideMotionSpecResource(@AnimatorRes int v) {
        b b0 = this.e;
        if(b0 != null) {
            b0.o3(v);
        }
    }

    public void setIconEndPadding(float f) {
        b b0 = this.e;
        if(b0 != null) {
            b0.p3(f);
        }
    }

    public void setIconEndPaddingResource(@DimenRes int v) {
        b b0 = this.e;
        if(b0 != null) {
            b0.q3(v);
        }
    }

    public void setIconStartPadding(float f) {
        b b0 = this.e;
        if(b0 != null) {
            b0.r3(f);
        }
    }

    public void setIconStartPaddingResource(@DimenRes int v) {
        b b0 = this.e;
        if(b0 != null) {
            b0.s3(v);
        }
    }

    @Override  // com.google.android.material.internal.m
    @RestrictTo({Scope.b})
    public void setInternalOnCheckedChangeListener(@Nullable com.google.android.material.internal.m.a m$a0) {
        this.j = m$a0;
    }

    @Override  // android.view.View
    public void setLayoutDirection(int v) {
        if(this.e == null) {
            return;
        }
        super.setLayoutDirection(v);
    }

    @Override  // android.widget.TextView
    public void setLines(int v) {
        if(v > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(v);
    }

    @Override  // android.widget.TextView
    public void setMaxLines(int v) {
        if(v > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(v);
    }

    @Override  // android.widget.TextView
    public void setMaxWidth(@Px int v) {
        super.setMaxWidth(v);
        b b0 = this.e;
        if(b0 != null) {
            b0.t3(v);
        }
    }

    @Override  // android.widget.TextView
    public void setMinLines(int v) {
        if(v > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(v);
    }

    @Override  // android.widget.CompoundButton
    public void setOnCheckedChangeListener(@Nullable CompoundButton.OnCheckedChangeListener compoundButton$OnCheckedChangeListener0) {
        this.i = compoundButton$OnCheckedChangeListener0;
    }

    public void setOnCloseIconClickListener(View.OnClickListener view$OnClickListener0) {
        this.h = view$OnClickListener0;
        this.E();
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList0) {
        b b0 = this.e;
        if(b0 != null) {
            b0.u3(colorStateList0);
        }
        if(!this.e.V1()) {
            this.G();
        }
    }

    public void setRippleColorResource(@ColorRes int v) {
        b b0 = this.e;
        if(b0 != null) {
            b0.v3(v);
            if(!this.e.V1()) {
                this.G();
            }
        }
    }

    @Override  // com.google.android.material.shape.t
    public void setShapeAppearanceModel(@NonNull p p0) {
        this.e.setShapeAppearanceModel(p0);
    }

    public void setShowMotionSpec(@Nullable i i0) {
        b b0 = this.e;
        if(b0 != null) {
            b0.x3(i0);
        }
    }

    public void setShowMotionSpecResource(@AnimatorRes int v) {
        b b0 = this.e;
        if(b0 != null) {
            b0.y3(v);
        }
    }

    @Override  // android.widget.TextView
    public void setSingleLine(boolean z) {
        if(!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(true);
    }

    @Override  // android.widget.TextView
    public void setText(CharSequence charSequence0, TextView.BufferType textView$BufferType0) {
        b b0 = this.e;
        if(b0 == null) {
            return;
        }
        if(charSequence0 == null) {
            charSequence0 = "";
        }
        super.setText((b0.L3() ? null : charSequence0), textView$BufferType0);
        b b1 = this.e;
        if(b1 != null) {
            b1.z3(charSequence0);
        }
    }

    @Override  // android.widget.TextView
    public void setTextAppearance(int v) {
        super.setTextAppearance(v);
        b b0 = this.e;
        if(b0 != null) {
            b0.B3(v);
        }
        this.I();
    }

    @Override  // android.widget.TextView
    public void setTextAppearance(Context context0, int v) {
        super.setTextAppearance(context0, v);
        b b0 = this.e;
        if(b0 != null) {
            b0.B3(v);
        }
        this.I();
    }

    public void setTextAppearance(@Nullable e e0) {
        b b0 = this.e;
        if(b0 != null) {
            b0.A3(e0);
        }
        this.I();
    }

    public void setTextAppearanceResource(@StyleRes int v) {
        this.setTextAppearance(this.getContext(), v);
    }

    public void setTextEndPadding(float f) {
        b b0 = this.e;
        if(b0 != null) {
            b0.E3(f);
        }
    }

    public void setTextEndPaddingResource(@DimenRes int v) {
        b b0 = this.e;
        if(b0 != null) {
            b0.F3(v);
        }
    }

    @Override  // android.widget.TextView
    public void setTextSize(int v, float f) {
        super.setTextSize(v, f);
        b b0 = this.e;
        if(b0 != null) {
            b0.H3(TypedValue.applyDimension(v, f, this.getResources().getDisplayMetrics()));
        }
        this.I();
    }

    public void setTextStartPadding(float f) {
        b b0 = this.e;
        if(b0 != null) {
            b0.I3(f);
        }
    }

    public void setTextStartPaddingResource(@DimenRes int v) {
        b b0 = this.e;
        if(b0 != null) {
            b0.J3(v);
        }
    }

    @Deprecated
    public boolean t() {
        return this.u();
    }

    public boolean u() {
        return this.e != null && this.e.Z1();
    }

    @Deprecated
    public boolean v() {
        return this.w();
    }

    public boolean w() {
        return this.e != null && this.e.b2();
    }

    @Deprecated
    public boolean x() {
        return this.y();
    }

    public boolean y() {
        return this.e != null && this.e.e2();
    }

    // 检测为 Lambda 实现
    private void z(CompoundButton compoundButton0, boolean z) [...]
}

