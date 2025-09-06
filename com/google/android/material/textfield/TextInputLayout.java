package com.google.android.material.textfield;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.text.BidiFormatter;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import androidx.customview.view.AbsSavedState;
import androidx.transition.Fade;
import androidx.transition.TransitionManager;
import com.google.android.material.R.attr;
import com.google.android.material.R.color;
import com.google.android.material.R.dimen;
import com.google.android.material.R.id;
import com.google.android.material.R.string;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.color.v;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.D;
import com.google.android.material.internal.M;
import com.google.android.material.internal.b;
import com.google.android.material.motion.j;
import com.google.android.material.shape.k;
import com.google.android.material.shape.p;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.LinkedHashSet;

public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    static class SavedState extends AbsSavedState {
        class a implements Parcelable.ClassLoaderCreator {
            a() {
                super();
            }

            @Nullable
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
            @Nullable
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
        @Nullable
        CharSequence c;
        boolean d;

        static {
            SavedState.CREATOR = new a();
        }

        SavedState(@NonNull Parcel parcel0, ClassLoader classLoader0) {
            super(parcel0, classLoader0);
            this.c = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel0);
            this.d = parcel0.readInt() == 1;
        }

        SavedState(Parcelable parcelable0) {
            super(parcelable0);
        }

        @Override
        @NonNull
        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + this.c + "}";
        }

        @Override  // androidx.customview.view.AbsSavedState
        public void writeToParcel(@NonNull Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            TextUtils.writeToParcel(this.c, parcel0, v);
            parcel0.writeInt(((int)this.d));
        }
    }

    public static class d extends AccessibilityDelegateCompat {
        private final TextInputLayout d;

        public d(@NonNull TextInputLayout textInputLayout0) {
            this.d = textInputLayout0;
        }

        @Override  // androidx.core.view.AccessibilityDelegateCompat
        public void g(@NonNull View view0, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
            super.g(view0, accessibilityNodeInfoCompat0);
            EditText editText0 = this.d.getEditText();
            Editable editable0 = editText0 == null ? null : editText0.getText();
            CharSequence charSequence0 = this.d.getHint();
            CharSequence charSequence1 = this.d.getError();
            CharSequence charSequence2 = this.d.getPlaceholderText();
            int v = this.d.getCounterMaxLength();
            CharSequence charSequence3 = this.d.getCounterOverflowDescription();
            boolean z = TextUtils.isEmpty(editable0);
            boolean z1 = TextUtils.isEmpty(charSequence0);
            boolean z2 = this.d.Z();
            boolean z3 = TextUtils.isEmpty(charSequence1);
            boolean z4 = !z3 || !TextUtils.isEmpty(charSequence3);
            String s = z1 ? "" : charSequence0.toString();
            this.d.b.B(accessibilityNodeInfoCompat0);
            if(!z) {
                accessibilityNodeInfoCompat0.f2(editable0);
            }
            else if(!TextUtils.isEmpty(s)) {
                accessibilityNodeInfoCompat0.f2(s);
                if(!z2 && charSequence2 != null) {
                    accessibilityNodeInfoCompat0.f2(s + ", " + charSequence2);
                }
            }
            else if(charSequence2 != null) {
                accessibilityNodeInfoCompat0.f2(charSequence2);
            }
            if(!TextUtils.isEmpty(s)) {
                if(Build.VERSION.SDK_INT >= 26) {
                    accessibilityNodeInfoCompat0.C1(s);
                }
                else {
                    if(!z) {
                        s = editable0 + ", " + s;
                    }
                    accessibilityNodeInfoCompat0.f2(s);
                }
                accessibilityNodeInfoCompat0.b2(z);
            }
            if(editable0 == null || editable0.length() != v) {
                v = -1;
            }
            accessibilityNodeInfoCompat0.L1(v);
            if(z4) {
                if(z3) {
                    charSequence1 = charSequence3;
                }
                accessibilityNodeInfoCompat0.w1(charSequence1);
            }
            View view1 = this.d.j.u();
            if(view1 != null) {
                accessibilityNodeInfoCompat0.F1(view1);
            }
            this.d.c.o().o(view0, accessibilityNodeInfoCompat0);
        }

        @Override  // androidx.core.view.AccessibilityDelegateCompat
        public void h(@NonNull View view0, @NonNull AccessibilityEvent accessibilityEvent0) {
            super.h(view0, accessibilityEvent0);
            this.d.c.o().p(view0, accessibilityEvent0);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    @RestrictTo({Scope.b})
    @Retention(RetentionPolicy.SOURCE)
    public @interface f {
    }

    public interface g {
        int a(@Nullable Editable arg1);
    }

    public interface h {
        void a(@NonNull TextInputLayout arg1);
    }

    public interface i {
        void a(@NonNull TextInputLayout arg1, int arg2);
    }

    @Nullable
    private ColorStateList A;
    private static final int[][] A9 = null;
    @Nullable
    private ColorStateList B;
    private static final String B9 = "TextInputLayout";
    private boolean C;
    public static final int C9 = 0;
    private CharSequence D;
    public static final int D9 = 1;
    private boolean E;
    public static final int E9 = 2;
    @Nullable
    private k F;
    public static final int F9 = -1;
    private k G;
    public static final int G9 = 0;
    private StateListDrawable H;
    public static final int H9 = 1;
    private boolean I;
    public static final int I9 = 2;
    @Nullable
    private k J;
    public static final int J9 = 3;
    @Nullable
    private k K;
    @NonNull
    private p L;
    private boolean M;
    private int M8;
    private final int N;
    private int N8;
    private int O;
    @ColorInt
    private int O8;
    private int P;
    @ColorInt
    private int P8;
    private int Q;
    private final Rect Q8;
    private final Rect R8;
    private final RectF S8;
    private Typeface T8;
    @Nullable
    private Drawable U8;
    private int V8;
    private final LinkedHashSet W8;
    @Nullable
    private Drawable X8;
    private int Y8;
    private Drawable Z8;
    @NonNull
    private final FrameLayout a;
    private ColorStateList a9;
    @NonNull
    private final y b;
    private ColorStateList b9;
    @NonNull
    private final r c;
    @ColorInt
    private int c9;
    EditText d;
    @ColorInt
    private int d9;
    private CharSequence e;
    @ColorInt
    private int e9;
    private int f;
    private ColorStateList f9;
    private int g;
    @ColorInt
    private int g9;
    private int h;
    @ColorInt
    private int h9;
    private int i;
    @ColorInt
    private int i9;
    private final u j;
    @ColorInt
    private int j9;
    boolean k;
    @ColorInt
    private int k9;
    private int l;
    int l9;
    private boolean m;
    private boolean m9;
    @NonNull
    private g n;
    final b n9;
    @Nullable
    private TextView o;
    private boolean o9;
    private int p;
    private boolean p9;
    private int q;
    private ValueAnimator q9;
    private CharSequence r;
    private boolean r9;
    private boolean s;
    private boolean s9;
    private TextView t;
    private boolean t9;
    @Nullable
    private ColorStateList u;
    private static final int u9 = 0;
    private int v;
    private static final int v9 = 0xA7;
    @Nullable
    private Fade w;
    private static final int w9 = 87;
    @Nullable
    private Fade x;
    private static final int x9 = 67;
    @Nullable
    private ColorStateList y;
    private static final int y9 = -1;
    @Nullable
    private ColorStateList z;
    private static final int z9 = -1;

    static {
        TextInputLayout.u9 = style.Widget_Design_TextInputLayout;
        TextInputLayout.A9 = new int[][]{new int[]{0x10100A7}, new int[0]};
    }

    public TextInputLayout(@NonNull Context context0) {
        this(context0, null);
    }

    public TextInputLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.textInputStyle);
    }

    public TextInputLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        int v1 = TextInputLayout.u9;
        super(I1.a.c(context0, attributeSet0, v, v1), attributeSet0, v);
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = new u(this);
        this.n = (Editable editable0) -> (editable0 == null ? 0 : editable0.length());
        this.Q8 = new Rect();
        this.R8 = new Rect();
        this.S8 = new RectF();
        this.W8 = new LinkedHashSet();
        b b0 = new b(this);
        this.n9 = b0;
        this.t9 = false;
        Context context1 = this.getContext();
        this.setOrientation(1);
        this.setWillNotDraw(false);
        this.setAddStatesFromChildren(true);
        FrameLayout frameLayout0 = new FrameLayout(context1);
        this.a = frameLayout0;
        frameLayout0.setAddStatesFromChildren(true);
        b0.N0(com.google.android.material.animation.b.a);
        b0.I0(com.google.android.material.animation.b.a);
        b0.l0(0x800033);
        TintTypedArray tintTypedArray0 = D.l(context1, attributeSet0, styleable.TextInputLayout, v, v1, new int[]{styleable.TextInputLayout_counterTextAppearance, styleable.TextInputLayout_counterOverflowTextAppearance, styleable.TextInputLayout_errorTextAppearance, styleable.TextInputLayout_helperTextTextAppearance, styleable.TextInputLayout_hintTextAppearance});
        y y0 = new y(this, tintTypedArray0);
        this.b = y0;
        this.C = tintTypedArray0.a(styleable.TextInputLayout_hintEnabled, true);
        this.setHint(tintTypedArray0.x(styleable.TextInputLayout_android_hint));
        this.p9 = tintTypedArray0.a(styleable.TextInputLayout_hintAnimationEnabled, true);
        this.o9 = tintTypedArray0.a(styleable.TextInputLayout_expandedHintEnabled, true);
        if(tintTypedArray0.C(styleable.TextInputLayout_android_minEms)) {
            this.setMinEms(tintTypedArray0.o(6, -1));
        }
        else if(tintTypedArray0.C(styleable.TextInputLayout_android_minWidth)) {
            this.setMinWidth(tintTypedArray0.g(3, -1));
        }
        if(tintTypedArray0.C(styleable.TextInputLayout_android_maxEms)) {
            this.setMaxEms(tintTypedArray0.o(5, -1));
        }
        else if(tintTypedArray0.C(styleable.TextInputLayout_android_maxWidth)) {
            this.setMaxWidth(tintTypedArray0.g(2, -1));
        }
        this.L = p.e(context1, attributeSet0, v, v1).m();
        this.N = context1.getResources().getDimensionPixelOffset(dimen.mtrl_textinput_box_label_cutout_padding);
        this.P = tintTypedArray0.f(styleable.TextInputLayout_boxCollapsedPaddingTop, 0);
        int v2 = context1.getResources().getDimensionPixelSize(dimen.mtrl_textinput_box_stroke_width_default);
        this.M8 = tintTypedArray0.g(styleable.TextInputLayout_boxStrokeWidth, v2);
        int v3 = context1.getResources().getDimensionPixelSize(dimen.mtrl_textinput_box_stroke_width_focused);
        this.N8 = tintTypedArray0.g(styleable.TextInputLayout_boxStrokeWidthFocused, v3);
        this.Q = this.M8;
        float f = tintTypedArray0.e(styleable.TextInputLayout_boxCornerRadiusTopStart, -1.0f);
        float f1 = tintTypedArray0.e(styleable.TextInputLayout_boxCornerRadiusTopEnd, -1.0f);
        float f2 = tintTypedArray0.e(styleable.TextInputLayout_boxCornerRadiusBottomEnd, -1.0f);
        float f3 = tintTypedArray0.e(styleable.TextInputLayout_boxCornerRadiusBottomStart, -1.0f);
        com.google.android.material.shape.p.b p$b0 = this.L.v();
        if(f >= 0.0f) {
            p$b0.K(f);
        }
        if(f1 >= 0.0f) {
            p$b0.P(f1);
        }
        if(f2 >= 0.0f) {
            p$b0.C(f2);
        }
        if(f3 >= 0.0f) {
            p$b0.x(f3);
        }
        this.L = p$b0.m();
        ColorStateList colorStateList0 = com.google.android.material.resources.d.b(context1, tintTypedArray0, styleable.TextInputLayout_boxBackgroundColor);
        if(colorStateList0 == null) {
            this.P8 = 0;
            this.g9 = 0;
            this.h9 = 0;
            this.i9 = 0;
            this.j9 = 0;
        }
        else {
            int v4 = colorStateList0.getDefaultColor();
            this.g9 = v4;
            this.P8 = v4;
            if(colorStateList0.isStateful()) {
                this.h9 = colorStateList0.getColorForState(new int[]{0xFEFEFF62}, -1);
                this.i9 = colorStateList0.getColorForState(new int[]{0x101009C, 0x101009E}, -1);
                this.j9 = colorStateList0.getColorForState(new int[]{0x1010367, 0x101009E}, -1);
            }
            else {
                this.i9 = this.g9;
                ColorStateList colorStateList1 = AppCompatResources.a(context1, color.mtrl_filled_background_color);
                this.h9 = colorStateList1.getColorForState(new int[]{0xFEFEFF62}, -1);
                this.j9 = colorStateList1.getColorForState(new int[]{0x1010367}, -1);
            }
        }
        if(tintTypedArray0.C(styleable.TextInputLayout_android_textColorHint)) {
            ColorStateList colorStateList2 = tintTypedArray0.d(1);
            this.b9 = colorStateList2;
            this.a9 = colorStateList2;
        }
        ColorStateList colorStateList3 = com.google.android.material.resources.d.b(context1, tintTypedArray0, styleable.TextInputLayout_boxStrokeColor);
        this.e9 = tintTypedArray0.c(styleable.TextInputLayout_boxStrokeColor, 0);
        this.c9 = ContextCompat.getColor(context1, color.mtrl_textinput_default_box_stroke_color);
        this.k9 = ContextCompat.getColor(context1, color.mtrl_textinput_disabled_color);
        this.d9 = ContextCompat.getColor(context1, color.mtrl_textinput_hovered_box_stroke_color);
        if(colorStateList3 != null) {
            this.setBoxStrokeColorStateList(colorStateList3);
        }
        if(tintTypedArray0.C(styleable.TextInputLayout_boxStrokeErrorColor)) {
            this.setBoxStrokeErrorColor(com.google.android.material.resources.d.b(context1, tintTypedArray0, 15));
        }
        if(tintTypedArray0.u(49, -1) != -1) {
            this.setHintTextAppearance(tintTypedArray0.u(49, 0));
        }
        this.A = tintTypedArray0.d(styleable.TextInputLayout_cursorColor);
        this.B = tintTypedArray0.d(styleable.TextInputLayout_cursorErrorColor);
        int v5 = tintTypedArray0.u(40, 0);
        CharSequence charSequence0 = tintTypedArray0.x(styleable.TextInputLayout_errorContentDescription);
        int v6 = tintTypedArray0.o(styleable.TextInputLayout_errorAccessibilityLiveRegion, 1);
        boolean z = tintTypedArray0.a(styleable.TextInputLayout_errorEnabled, false);
        int v7 = tintTypedArray0.u(45, 0);
        boolean z1 = tintTypedArray0.a(styleable.TextInputLayout_helperTextEnabled, false);
        CharSequence charSequence1 = tintTypedArray0.x(styleable.TextInputLayout_helperText);
        int v8 = tintTypedArray0.u(styleable.TextInputLayout_placeholderTextAppearance, 0);
        CharSequence charSequence2 = tintTypedArray0.x(styleable.TextInputLayout_placeholderText);
        boolean z2 = tintTypedArray0.a(styleable.TextInputLayout_counterEnabled, false);
        this.setCounterMaxLength(tintTypedArray0.o(styleable.TextInputLayout_counterMaxLength, -1));
        this.q = tintTypedArray0.u(22, 0);
        this.p = tintTypedArray0.u(20, 0);
        this.setBoxBackgroundMode(tintTypedArray0.o(styleable.TextInputLayout_boxBackgroundMode, 0));
        this.setErrorContentDescription(charSequence0);
        this.setErrorAccessibilityLiveRegion(v6);
        this.setCounterOverflowTextAppearance(this.p);
        this.setHelperTextTextAppearance(v7);
        this.setErrorTextAppearance(v5);
        this.setCounterTextAppearance(this.q);
        this.setPlaceholderText(charSequence2);
        this.setPlaceholderTextAppearance(v8);
        if(tintTypedArray0.C(styleable.TextInputLayout_errorTextColor)) {
            this.setErrorTextColor(tintTypedArray0.d(41));
        }
        if(tintTypedArray0.C(styleable.TextInputLayout_helperTextTextColor)) {
            this.setHelperTextColor(tintTypedArray0.d(46));
        }
        if(tintTypedArray0.C(styleable.TextInputLayout_hintTextColor)) {
            this.setHintTextColor(tintTypedArray0.d(50));
        }
        if(tintTypedArray0.C(styleable.TextInputLayout_counterTextColor)) {
            this.setCounterTextColor(tintTypedArray0.d(23));
        }
        if(tintTypedArray0.C(styleable.TextInputLayout_counterOverflowTextColor)) {
            this.setCounterOverflowTextColor(tintTypedArray0.d(21));
        }
        if(tintTypedArray0.C(styleable.TextInputLayout_placeholderTextColor)) {
            this.setPlaceholderTextColor(tintTypedArray0.d(58));
        }
        r r0 = new r(this, tintTypedArray0);
        this.c = r0;
        boolean z3 = tintTypedArray0.a(styleable.TextInputLayout_android_enabled, true);
        tintTypedArray0.I();
        ViewCompat.b2(this, 2);
        if(Build.VERSION.SDK_INT >= 26) {
            ViewCompat.d2(this, 1);
        }
        frameLayout0.addView(y0);
        frameLayout0.addView(r0);
        this.addView(frameLayout0);
        this.setEnabled(z3);
        this.setHelperTextEnabled(z1);
        this.setErrorEnabled(z);
        this.setCounterEnabled(z2);
        this.setHelperText(charSequence1);
    }

    public void A() {
        this.c.j();
    }

    private void A0() {
        if(this.t != null && this.s && !TextUtils.isEmpty(this.r)) {
            this.t.setText(this.r);
            TransitionManager.b(this.a, this.w);
            this.t.setVisibility(0);
            this.t.bringToFront();
            this.announceForAccessibility(this.r);
        }
    }

    private void B() {
        if(this.E()) {
            ((com.google.android.material.textfield.h)this.F).U0();
        }
    }

    private void B0() {
        if(this.O == 1) {
            if(com.google.android.material.resources.d.k(this.getContext())) {
                this.P = this.getResources().getDimensionPixelSize(dimen.material_font_2_0_box_collapsed_padding_top);
                return;
            }
            if(com.google.android.material.resources.d.j(this.getContext())) {
                this.P = this.getResources().getDimensionPixelSize(dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
    }

    private void C(boolean z) {
        if(this.q9 != null && this.q9.isRunning()) {
            this.q9.cancel();
        }
        if(!z || !this.p9) {
            this.n9.A0(1.0f);
        }
        else {
            this.m(1.0f);
        }
        this.m9 = false;
        if(this.E()) {
            this.j0();
        }
        this.R0();
        this.b.m(false);
        this.c.L(false);
    }

    private void C0(@NonNull Rect rect0) {
        k k0 = this.J;
        if(k0 != null) {
            k0.setBounds(rect0.left, rect0.bottom - this.M8, rect0.right, rect0.bottom);
        }
        k k1 = this.K;
        if(k1 != null) {
            k1.setBounds(rect0.left, rect0.bottom - this.N8, rect0.right, rect0.bottom);
        }
    }

    private Fade D() {
        Fade fade0 = new Fade();
        fade0.C0(((long)j.f(this.getContext(), attr.motionDurationShort2, 87)));
        fade0.E0(j.g(this.getContext(), attr.motionEasingLinearInterpolator, com.google.android.material.animation.b.a));
        return fade0;
    }

    private void D0() {
        if(this.o != null) {
            this.E0((this.d == null ? null : this.d.getText()));
        }
    }

    // 去混淆评级： 低(30)
    private boolean E() {
        return this.C && !TextUtils.isEmpty(this.D) && this.F instanceof com.google.android.material.textfield.h;
    }

    void E0(@Nullable Editable editable0) {
        int v = this.n.a(editable0);
        boolean z = this.m;
        int v1 = this.l;
        if(v1 == -1) {
            this.o.setText(String.valueOf(v));
            this.o.setContentDescription(null);
            this.m = false;
        }
        else {
            this.m = v > v1;
            TextInputLayout.F0(this.getContext(), this.o, v, this.l, this.m);
            if(z != this.m) {
                this.G0();
            }
            BidiFormatter bidiFormatter0 = BidiFormatter.c();
            this.o.setText(bidiFormatter0.q(this.getContext().getString(string.character_counter_pattern, new Object[]{v, this.l})));
        }
        if(this.d != null && z != this.m) {
            this.O0(false);
            this.U0();
            this.J0();
        }
    }

    // 去混淆评级： 低(20)
    @VisibleForTesting
    boolean F() {
        return this.E() && ((com.google.android.material.textfield.h)this.F).T0();
    }

    private static void F0(@NonNull Context context0, @NonNull TextView textView0, int v, int v1, boolean z) {
        textView0.setContentDescription(context0.getString((z ? string.character_counter_overflowed_content_description : string.character_counter_content_description), new Object[]{v, v1}));
    }

    private void G() {
        for(Object object0: this.W8) {
            ((h)object0).a(this);
        }
    }

    private void G0() {
        TextView textView0 = this.o;
        if(textView0 != null) {
            this.w0(textView0, (this.m ? this.p : this.q));
            if(!this.m) {
                ColorStateList colorStateList0 = this.y;
                if(colorStateList0 != null) {
                    this.o.setTextColor(colorStateList0);
                }
            }
            if(this.m) {
                ColorStateList colorStateList1 = this.z;
                if(colorStateList1 != null) {
                    this.o.setTextColor(colorStateList1);
                }
            }
        }
    }

    private void H(Canvas canvas0) {
        if(this.K != null) {
            k k0 = this.J;
            if(k0 != null) {
                k0.draw(canvas0);
                if(this.d.isFocused()) {
                    Rect rect0 = this.K.getBounds();
                    Rect rect1 = this.J.getBounds();
                    float f = this.n9.G();
                    int v = rect1.centerX();
                    rect0.left = com.google.android.material.animation.b.c(v, rect1.left, f);
                    rect0.right = com.google.android.material.animation.b.c(v, rect1.right, f);
                    this.K.draw(canvas0);
                }
            }
        }
    }

    @RequiresApi(29)
    private void H0() {
        ColorStateList colorStateList0 = this.A == null ? v.l(this.getContext(), attr.colorControlActivated) : this.A;
        if(this.d != null && this.d.getTextCursorDrawable() != null) {
            Drawable drawable0 = DrawableCompat.r(this.d.getTextCursorDrawable()).mutate();
            if(this.a0()) {
                ColorStateList colorStateList1 = this.B;
                if(colorStateList1 != null) {
                    colorStateList0 = colorStateList1;
                }
            }
            DrawableCompat.o(drawable0, colorStateList0);
        }
    }

    private void I(@NonNull Canvas canvas0) {
        if(this.C) {
            this.n9.l(canvas0);
        }
    }

    boolean I0() {
        boolean z1;
        boolean z = true;
        if(this.d == null) {
            return false;
        }
        if(this.z0()) {
            int v = this.b.getMeasuredWidth() - this.d.getPaddingLeft();
            if(this.U8 == null || this.V8 != v) {
                ColorDrawable colorDrawable0 = new ColorDrawable();
                this.U8 = colorDrawable0;
                this.V8 = v;
                colorDrawable0.setBounds(0, 0, v, 1);
            }
            Drawable[] arr_drawable = TextViewCompat.h(this.d);
            Drawable drawable0 = this.U8;
            if(arr_drawable[0] == drawable0) {
                z1 = false;
            }
            else {
                TextViewCompat.u(this.d, drawable0, arr_drawable[1], arr_drawable[2], arr_drawable[3]);
                z1 = true;
            }
        }
        else if(this.U8 == null) {
            z1 = false;
        }
        else {
            Drawable[] arr_drawable1 = TextViewCompat.h(this.d);
            TextViewCompat.u(this.d, null, arr_drawable1[1], arr_drawable1[2], arr_drawable1[3]);
            this.U8 = null;
            z1 = true;
        }
        if(this.y0()) {
            int v1 = this.c.B().getMeasuredWidth() - this.d.getPaddingRight();
            CheckableImageButton checkableImageButton0 = this.c.m();
            if(checkableImageButton0 != null) {
                v1 = v1 + checkableImageButton0.getMeasuredWidth() + MarginLayoutParamsCompat.c(((ViewGroup.MarginLayoutParams)checkableImageButton0.getLayoutParams()));
            }
            Drawable[] arr_drawable2 = TextViewCompat.h(this.d);
            Drawable drawable1 = this.X8;
            if(drawable1 != null && this.Y8 != v1) {
                this.Y8 = v1;
                drawable1.setBounds(0, 0, v1, 1);
                TextViewCompat.u(this.d, arr_drawable2[0], arr_drawable2[1], this.X8, arr_drawable2[3]);
                return true;
            }
            if(drawable1 == null) {
                ColorDrawable colorDrawable1 = new ColorDrawable();
                this.X8 = colorDrawable1;
                this.Y8 = v1;
                colorDrawable1.setBounds(0, 0, v1, 1);
            }
            Drawable drawable2 = arr_drawable2[2];
            Drawable drawable3 = this.X8;
            if(drawable2 != drawable3) {
                this.Z8 = drawable2;
                TextViewCompat.u(this.d, arr_drawable2[0], arr_drawable2[1], drawable3, arr_drawable2[3]);
                return true;
            }
            return z1;
        }
        if(this.X8 != null) {
            Drawable[] arr_drawable3 = TextViewCompat.h(this.d);
            if(arr_drawable3[2] == this.X8) {
                TextViewCompat.u(this.d, arr_drawable3[0], arr_drawable3[1], this.Z8, arr_drawable3[3]);
            }
            else {
                z = z1;
            }
            this.X8 = null;
            return z;
        }
        return z1;
    }

    private void J(boolean z) {
        if(this.q9 != null && this.q9.isRunning()) {
            this.q9.cancel();
        }
        if(!z || !this.p9) {
            this.n9.A0(0.0f);
        }
        else {
            this.m(0.0f);
        }
        if(this.E() && ((com.google.android.material.textfield.h)this.F).T0()) {
            this.B();
        }
        this.m9 = true;
        this.P();
        this.b.m(true);
        this.c.L(true);
    }

    void J0() {
        EditText editText0 = this.d;
        if(editText0 != null && this.O == 0) {
            Drawable drawable0 = editText0.getBackground();
            if(drawable0 == null) {
                return;
            }
            drawable0 = drawable0.mutate();
            if(this.x0()) {
                drawable0.setColorFilter(AppCompatDrawableManager.e(this.getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
                return;
            }
            if(this.m) {
                TextView textView0 = this.o;
                if(textView0 != null) {
                    drawable0.setColorFilter(AppCompatDrawableManager.e(textView0.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
                    return;
                }
            }
            DrawableCompat.c(drawable0);
            this.d.refreshDrawableState();
        }
    }

    private k K(boolean z) {
        float f = (float)this.getResources().getDimensionPixelOffset(dimen.mtrl_shape_corner_size_small_component);
        float f1 = this.d instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView)this.d).getPopupElevation() : ((float)this.getResources().getDimensionPixelOffset(dimen.m3_comp_outlined_autocomplete_menu_container_elevation));
        int v = this.getResources().getDimensionPixelOffset(dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        p p0 = p.a().K((z ? f : 0.0f)).P((z ? f : 0.0f)).x(f).C(f).m();
        ColorStateList colorStateList0 = this.d instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView)this.d).getDropDownBackgroundTintList() : null;
        k k0 = k.o(this.getContext(), f1, colorStateList0);
        k0.setShapeAppearanceModel(p0);
        k0.r0(0, v, 0, v);
        return k0;
    }

    private void K0() {
        Drawable drawable0 = this.getEditTextBoxBackground();
        ViewCompat.R1(this.d, drawable0);
    }

    private static Drawable L(k k0, int v, int v1, int[][] arr2_v) {
        return new RippleDrawable(new ColorStateList(arr2_v, new int[]{v.t(v1, v, 0.1f), v}), k0, k0);
    }

    void L0() {
        if(this.d != null && this.F != null && (this.I || this.d.getBackground() == null) && this.O != 0) {
            this.K0();
            this.I = true;
        }
    }

    private int M(int v, boolean z) {
        if(!z && this.getPrefixText() != null) {
            return v + this.b.c();
        }
        return !z || this.getSuffixText() == null ? v + this.d.getCompoundPaddingLeft() : v + this.c.A();
    }

    private boolean M0() {
        if(this.d == null) {
            return false;
        }
        int v = Math.max(this.c.getMeasuredHeight(), this.b.getMeasuredHeight());
        if(this.d.getMeasuredHeight() < v) {
            this.d.setMinimumHeight(v);
            return true;
        }
        return false;
    }

    private int N(int v, boolean z) {
        if(!z && this.getSuffixText() != null) {
            return v - this.c.A();
        }
        return !z || this.getPrefixText() == null ? v - this.d.getCompoundPaddingRight() : v - this.b.c();
    }

    private void N0() {
        if(this.O != 1) {
            LinearLayout.LayoutParams linearLayout$LayoutParams0 = (LinearLayout.LayoutParams)this.a.getLayoutParams();
            int v = this.w();
            if(v != linearLayout$LayoutParams0.topMargin) {
                linearLayout$LayoutParams0.topMargin = v;
                this.a.requestLayout();
            }
        }
    }

    private static Drawable O(Context context0, k k0, int v, int[][] arr2_v) {
        int v1 = v.c(context0, attr.colorSurface, "TextInputLayout");
        k k1 = new k(k0.getShapeAppearanceModel());
        int v2 = v.t(v, v1, 0.1f);
        k1.p0(new ColorStateList(arr2_v, new int[]{v2, 0}));
        k1.setTint(v1);
        ColorStateList colorStateList0 = new ColorStateList(arr2_v, new int[]{v2, v1});
        k k2 = new k(k0.getShapeAppearanceModel());
        k2.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList0, k1, k2), k0});
    }

    void O0(boolean z) {
        this.P0(z, false);
    }

    private void P() {
        TextView textView0 = this.t;
        if(textView0 != null && this.s) {
            textView0.setText(null);
            TransitionManager.b(this.a, this.x);
            this.t.setVisibility(4);
        }
    }

    private void P0(boolean z, boolean z1) {
        boolean z2 = this.isEnabled();
        boolean z3 = false;
        boolean z4 = this.d != null && !TextUtils.isEmpty(this.d.getText());
        if(this.d != null && this.d.hasFocus()) {
            z3 = true;
        }
        ColorStateList colorStateList0 = this.a9;
        if(colorStateList0 != null) {
            this.n9.f0(colorStateList0);
        }
        if(!z2) {
            ColorStateList colorStateList1 = ColorStateList.valueOf((this.a9 == null ? this.k9 : this.a9.getColorForState(new int[]{0xFEFEFF62}, this.k9)));
            this.n9.f0(colorStateList1);
        }
        else if(this.x0()) {
            ColorStateList colorStateList2 = this.j.s();
            this.n9.f0(colorStateList2);
        }
        else if(this.m) {
            TextView textView0 = this.o;
            if(textView0 != null) {
                ColorStateList colorStateList3 = textView0.getTextColors();
                this.n9.f0(colorStateList3);
                goto label_26;
            }
            goto label_22;
        }
        else {
        label_22:
            if(z3) {
                ColorStateList colorStateList4 = this.b9;
                if(colorStateList4 != null) {
                    this.n9.k0(colorStateList4);
                }
            }
        }
    label_26:
        if(!z4 && this.o9 && (!this.isEnabled() || !z3)) {
            if(z1 || !this.m9) {
                this.J(z);
            }
        }
        else if(z1 || this.m9) {
            this.C(z);
        }
    }

    public boolean Q() {
        return this.k;
    }

    private void Q0() {
        if(this.t != null) {
            EditText editText0 = this.d;
            if(editText0 != null) {
                int v = editText0.getGravity();
                this.t.setGravity(v);
                this.t.setPadding(this.d.getCompoundPaddingLeft(), this.d.getCompoundPaddingTop(), this.d.getCompoundPaddingRight(), this.d.getCompoundPaddingBottom());
            }
        }
    }

    public boolean R() {
        return this.c.G();
    }

    private void R0() {
        this.S0((this.d == null ? null : this.d.getText()));
    }

    public boolean S() {
        return this.c.I();
    }

    private void S0(@Nullable Editable editable0) {
        if(this.n.a(editable0) == 0 && !this.m9) {
            this.A0();
            return;
        }
        this.P();
    }

    public boolean T() {
        return this.j.F();
    }

    private void T0(boolean z, boolean z1) {
        int v = this.f9.getDefaultColor();
        int v1 = this.f9.getColorForState(new int[]{0x1010367, 0x101009E}, v);
        int v2 = this.f9.getColorForState(new int[]{0x10102FE, 0x101009E}, v);
        if(z) {
            this.O8 = v2;
            return;
        }
        if(z1) {
            this.O8 = v1;
            return;
        }
        this.O8 = v;
    }

    public boolean U() {
        return this.o9;
    }

    void U0() {
        boolean z = false;
        if(this.F != null && this.O != 0) {
            boolean z1 = this.isFocused() || this.d != null && this.d.hasFocus();
            if(this.isHovered() || this.d != null && this.d.isHovered()) {
                z = true;
            }
            if(!this.isEnabled()) {
                this.O8 = this.k9;
            }
            else if(!this.x0()) {
                if(this.m) {
                    TextView textView0 = this.o;
                    if(textView0 == null) {
                        goto label_22;
                    }
                    else if(this.f9 != null) {
                        this.T0(z1, z);
                    }
                    else {
                        this.O8 = textView0.getCurrentTextColor();
                    }
                }
                else {
                label_22:
                    if(z1) {
                        this.O8 = this.e9;
                    }
                    else if(z) {
                        this.O8 = this.d9;
                    }
                    else {
                        this.O8 = this.c9;
                    }
                }
            }
            else if(this.f9 != null) {
                this.T0(z1, z);
            }
            else {
                this.O8 = this.getErrorCurrentTextColors();
            }
            if(Build.VERSION.SDK_INT >= 29) {
                this.H0();
            }
            this.c.M();
            this.p0();
            if(this.O == 2) {
                int v = this.Q;
                this.Q = !z1 || !this.isEnabled() ? this.M8 : this.N8;
                if(this.Q != v) {
                    this.l0();
                }
            }
            if(this.O == 1) {
                if(!this.isEnabled()) {
                    this.P8 = this.h9;
                }
                else if(z && !z1) {
                    this.P8 = this.j9;
                }
                else if(z1) {
                    this.P8 = this.i9;
                }
                else {
                    this.P8 = this.g9;
                }
            }
            this.n();
        }
    }

    @VisibleForTesting
    final boolean V() {
        return this.j.y();
    }

    public boolean W() {
        return this.j.G();
    }

    public boolean X() {
        return this.p9;
    }

    public boolean Y() {
        return this.C;
    }

    final boolean Z() {
        return this.m9;
    }

    // 去混淆评级： 低(30)
    private boolean a0() {
        return this.x0() || this.o != null && this.m;
    }

    @Override  // android.view.ViewGroup
    public void addView(@NonNull View view0, int v, @NonNull ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        if(view0 instanceof EditText) {
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(viewGroup$LayoutParams0);
            frameLayout$LayoutParams0.gravity = frameLayout$LayoutParams0.gravity & 0xFFFFFF8F | 16;
            this.a.addView(view0, frameLayout$LayoutParams0);
            this.a.setLayoutParams(viewGroup$LayoutParams0);
            this.N0();
            this.setEditText(((EditText)view0));
            return;
        }
        super.addView(view0, v, viewGroup$LayoutParams0);
    }

    @Deprecated
    public boolean b0() {
        return this.c.K();
    }

    @RestrictTo({Scope.b})
    public boolean c0() {
        return this.E;
    }

    private boolean d0() {
        return this.O == 1 && this.d.getMinLines() <= 1;
    }

    @Override  // android.view.ViewGroup
    @TargetApi(26)
    public void dispatchProvideAutofillStructure(@NonNull ViewStructure viewStructure0, int v) {
        EditText editText0 = this.d;
        if(editText0 == null) {
            super.dispatchProvideAutofillStructure(viewStructure0, v);
            return;
        }
        if(this.e != null) {
            boolean z = this.E;
            this.E = false;
            CharSequence charSequence0 = editText0.getHint();
            this.d.setHint(this.e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure0, v);
            }
            finally {
                this.d.setHint(charSequence0);
                this.E = z;
            }
            return;
        }
        viewStructure0.setAutofillId(this.getAutofillId());
        this.onProvideAutofillStructure(viewStructure0, v);
        this.onProvideAutofillVirtualStructure(viewStructure0, v);
        viewStructure0.setChildCount(this.a.getChildCount());
        for(int v1 = 0; v1 < this.a.getChildCount(); ++v1) {
            View view0 = this.a.getChildAt(v1);
            ViewStructure viewStructure1 = viewStructure0.newChild(v1);
            view0.dispatchProvideAutofillStructure(viewStructure1, v);
            if(view0 == this.d) {
                viewStructure1.setHint(this.getHint());
            }
        }
    }

    @Override  // android.view.ViewGroup
    protected void dispatchRestoreInstanceState(@NonNull SparseArray sparseArray0) {
        this.s9 = true;
        super.dispatchRestoreInstanceState(sparseArray0);
        this.s9 = false;
    }

    @Override  // android.view.View
    public void draw(@NonNull Canvas canvas0) {
        super.draw(canvas0);
        this.I(canvas0);
        this.H(canvas0);
    }

    @Override  // android.view.ViewGroup
    protected void drawableStateChanged() {
        if(this.r9) {
            return;
        }
        boolean z = true;
        this.r9 = true;
        super.drawableStateChanged();
        int[] arr_v = this.getDrawableState();
        boolean z1 = this.n9 == null ? false : this.n9.K0(arr_v);
        if(this.d != null) {
            if(!ViewCompat.a1(this) || !this.isEnabled()) {
                z = false;
            }
            this.O0(z);
        }
        this.J0();
        this.U0();
        if(z1) {
            this.invalidate();
        }
        this.r9 = false;
    }

    public boolean e0() {
        return this.b.k();
    }

    public boolean f0() {
        return this.b.l();
    }

    // 检测为 Lambda 实现
    private static int g0(Editable editable0) [...]

    @Override  // android.widget.LinearLayout
    public int getBaseline() {
        EditText editText0 = this.d;
        return editText0 == null ? super.getBaseline() : editText0.getBaseline() + this.getPaddingTop() + this.w();
    }

    @NonNull
    k getBoxBackground() {
        if(this.O != 1 && this.O != 2) {
            throw new IllegalStateException();
        }
        return this.F;
    }

    public int getBoxBackgroundColor() {
        return this.P8;
    }

    public int getBoxBackgroundMode() {
        return this.O;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.P;
    }

    // 去混淆评级： 低(20)
    public float getBoxCornerRadiusBottomEnd() {
        return M.s(this) ? this.L.j().a(this.S8) : this.L.l().a(this.S8);
    }

    // 去混淆评级： 低(20)
    public float getBoxCornerRadiusBottomStart() {
        return M.s(this) ? this.L.l().a(this.S8) : this.L.j().a(this.S8);
    }

    // 去混淆评级： 低(20)
    public float getBoxCornerRadiusTopEnd() {
        return M.s(this) ? this.L.r().a(this.S8) : this.L.t().a(this.S8);
    }

    // 去混淆评级： 低(20)
    public float getBoxCornerRadiusTopStart() {
        return M.s(this) ? this.L.t().a(this.S8) : this.L.r().a(this.S8);
    }

    public int getBoxStrokeColor() {
        return this.e9;
    }

    @Nullable
    public ColorStateList getBoxStrokeErrorColor() {
        return this.f9;
    }

    public int getBoxStrokeWidth() {
        return this.M8;
    }

    public int getBoxStrokeWidthFocused() {
        return this.N8;
    }

    public int getCounterMaxLength() {
        return this.l;
    }

    @Nullable
    CharSequence getCounterOverflowDescription() {
        if(this.k && this.m) {
            return this.o == null ? null : this.o.getContentDescription();
        }
        return null;
    }

    @Nullable
    public ColorStateList getCounterOverflowTextColor() {
        return this.z;
    }

    @Nullable
    public ColorStateList getCounterTextColor() {
        return this.y;
    }

    @Nullable
    @RequiresApi(29)
    public ColorStateList getCursorColor() {
        return this.A;
    }

    @Nullable
    @RequiresApi(29)
    public ColorStateList getCursorErrorColor() {
        return this.B;
    }

    @Nullable
    public ColorStateList getDefaultHintTextColor() {
        return this.a9;
    }

    @Nullable
    public EditText getEditText() {
        return this.d;
    }

    @Nullable
    private Drawable getEditTextBoxBackground() {
        if(this.d instanceof AutoCompleteTextView && !q.a(this.d)) {
            int v = v.d(this.d, attr.colorControlHighlight);
            int v1 = this.O;
            if(v1 == 2) {
                return TextInputLayout.O(this.getContext(), this.F, v, TextInputLayout.A9);
            }
            return v1 == 1 ? TextInputLayout.L(this.F, this.P8, v, TextInputLayout.A9) : null;
        }
        return this.F;
    }

    @Nullable
    public CharSequence getEndIconContentDescription() {
        return this.c.n();
    }

    @Nullable
    public Drawable getEndIconDrawable() {
        return this.c.p();
    }

    public int getEndIconMinSize() {
        return this.c.q();
    }

    public int getEndIconMode() {
        return this.c.r();
    }

    @NonNull
    public ImageView.ScaleType getEndIconScaleType() {
        return this.c.s();
    }

    @NonNull
    CheckableImageButton getEndIconView() {
        return this.c.t();
    }

    // 去混淆评级： 低(20)
    @Nullable
    public CharSequence getError() {
        return this.j.F() ? this.j.q() : null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.j.o();
    }

    @Nullable
    public CharSequence getErrorContentDescription() {
        return this.j.p();
    }

    @ColorInt
    public int getErrorCurrentTextColors() {
        return this.j.r();
    }

    @Nullable
    public Drawable getErrorIconDrawable() {
        return this.c.u();
    }

    // 去混淆评级： 低(20)
    @Nullable
    public CharSequence getHelperText() {
        return this.j.G() ? this.j.t() : null;
    }

    @ColorInt
    public int getHelperTextCurrentTextColor() {
        return this.j.w();
    }

    // 去混淆评级： 低(20)
    @Nullable
    public CharSequence getHint() {
        return this.C ? this.D : null;
    }

    @VisibleForTesting
    final float getHintCollapsedTextHeight() {
        return this.n9.r();
    }

    @VisibleForTesting
    final int getHintCurrentCollapsedTextColor() {
        return this.n9.w();
    }

    @Nullable
    public ColorStateList getHintTextColor() {
        return this.b9;
    }

    @NonNull
    public g getLengthCounter() {
        return this.n;
    }

    public int getMaxEms() {
        return this.g;
    }

    @Px
    public int getMaxWidth() {
        return this.i;
    }

    public int getMinEms() {
        return this.f;
    }

    @Px
    public int getMinWidth() {
        return this.h;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if(this.H == null) {
            StateListDrawable stateListDrawable0 = new StateListDrawable();
            this.H = stateListDrawable0;
            Drawable drawable0 = this.getOrCreateOutlinedDropDownMenuBackground();
            stateListDrawable0.addState(new int[]{0x10100AA}, drawable0);
            StateListDrawable stateListDrawable1 = this.H;
            k k0 = this.K(false);
            stateListDrawable1.addState(new int[0], k0);
        }
        return this.H;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if(this.G == null) {
            this.G = this.K(true);
        }
        return this.G;
    }

    @Nullable
    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.c.w();
    }

    @Nullable
    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.c.x();
    }

    // 去混淆评级： 低(20)
    @Nullable
    public CharSequence getPlaceholderText() {
        return this.s ? this.r : null;
    }

    @StyleRes
    public int getPlaceholderTextAppearance() {
        return this.v;
    }

    @Nullable
    public ColorStateList getPlaceholderTextColor() {
        return this.u;
    }

    @Nullable
    public CharSequence getPrefixText() {
        return this.b.a();
    }

    @Nullable
    public ColorStateList getPrefixTextColor() {
        return this.b.b();
    }

    @NonNull
    public TextView getPrefixTextView() {
        return this.b.d();
    }

    @NonNull
    public p getShapeAppearanceModel() {
        return this.L;
    }

    @Nullable
    public CharSequence getStartIconContentDescription() {
        return this.b.e();
    }

    @Nullable
    public Drawable getStartIconDrawable() {
        return this.b.f();
    }

    public int getStartIconMinSize() {
        return this.b.g();
    }

    @NonNull
    public ImageView.ScaleType getStartIconScaleType() {
        return this.b.h();
    }

    @Nullable
    public CharSequence getSuffixText() {
        return this.c.y();
    }

    @Nullable
    public ColorStateList getSuffixTextColor() {
        return this.c.z();
    }

    @NonNull
    public TextView getSuffixTextView() {
        return this.c.B();
    }

    @Nullable
    public Typeface getTypeface() {
        return this.T8;
    }

    // 检测为 Lambda 实现
    private void h0() [...]

    public void i(@NonNull h textInputLayout$h0) {
        this.W8.add(textInputLayout$h0);
        if(this.d != null) {
            textInputLayout$h0.a(this);
        }
    }

    private void i0() {
        this.q();
        this.L0();
        this.U0();
        this.B0();
        this.l();
        if(this.O != 0) {
            this.N0();
        }
        this.v0();
    }

    public void j(@NonNull i textInputLayout$i0) {
        this.c.g(textInputLayout$i0);
    }

    private void j0() {
        if(!this.E()) {
            return;
        }
        RectF rectF0 = this.S8;
        int v = this.d.getWidth();
        int v1 = this.d.getGravity();
        this.n9.o(rectF0, v, v1);
        if(rectF0.width() > 0.0f && rectF0.height() > 0.0f) {
            this.p(rectF0);
            rectF0.offset(((float)(-this.getPaddingLeft())), ((float)(-this.getPaddingTop())) - rectF0.height() / 2.0f + ((float)this.Q));
            ((com.google.android.material.textfield.h)this.F).W0(rectF0);
        }
    }

    private void k() {
        TextView textView0 = this.t;
        if(textView0 != null) {
            this.a.addView(textView0);
            this.t.setVisibility(0);
        }
    }

    @Deprecated
    public void k0(boolean z) {
        this.c.A0(z);
    }

    private void l() {
        if(this.d != null && this.O == 1) {
            if(com.google.android.material.resources.d.k(this.getContext())) {
                ViewCompat.p2(this.d, ViewCompat.p0(this.d), this.getResources().getDimensionPixelSize(dimen.material_filled_edittext_font_2_0_padding_top), ViewCompat.o0(this.d), this.getResources().getDimensionPixelSize(dimen.material_filled_edittext_font_2_0_padding_bottom));
                return;
            }
            if(com.google.android.material.resources.d.j(this.getContext())) {
                ViewCompat.p2(this.d, ViewCompat.p0(this.d), this.getResources().getDimensionPixelSize(dimen.material_filled_edittext_font_1_3_padding_top), ViewCompat.o0(this.d), this.getResources().getDimensionPixelSize(dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
    }

    private void l0() {
        if(this.E() && !this.m9) {
            this.B();
            this.j0();
        }
    }

    @VisibleForTesting
    void m(float f) {
        class c implements ValueAnimator.AnimatorUpdateListener {
            final TextInputLayout a;

            @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
            public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator0) {
                float f = (float)(((Float)valueAnimator0.getAnimatedValue()));
                TextInputLayout.this.n9.A0(f);
            }
        }

        if(this.n9.G() == f) {
            return;
        }
        if(this.q9 == null) {
            ValueAnimator valueAnimator0 = new ValueAnimator();
            this.q9 = valueAnimator0;
            valueAnimator0.setInterpolator(j.g(this.getContext(), attr.motionEasingEmphasizedInterpolator, com.google.android.material.animation.b.b));
            this.q9.setDuration(((long)j.f(this.getContext(), attr.motionDurationMedium4, 0xA7)));
            this.q9.addUpdateListener(new c(this));
        }
        this.q9.setFloatValues(new float[]{this.n9.G(), f});
        this.q9.start();
    }

    private static void m0(@NonNull ViewGroup viewGroup0, boolean z) {
        int v = viewGroup0.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = viewGroup0.getChildAt(v1);
            view0.setEnabled(z);
            if(view0 instanceof ViewGroup) {
                TextInputLayout.m0(((ViewGroup)view0), z);
            }
        }
    }

    private void n() {
        k k0 = this.F;
        if(k0 == null) {
            return;
        }
        p p0 = this.L;
        if(k0.getShapeAppearanceModel() != p0) {
            this.F.setShapeAppearanceModel(p0);
        }
        if(this.x()) {
            this.F.E0(((float)this.Q), this.O8);
        }
        int v = this.r();
        this.P8 = v;
        this.F.p0(ColorStateList.valueOf(v));
        this.o();
        this.L0();
    }

    public void n0() {
        this.c.N();
    }

    private void o() {
        if(this.J != null && this.K != null) {
            if(this.y()) {
                this.J.p0((this.d.isFocused() ? ColorStateList.valueOf(this.c9) : ColorStateList.valueOf(this.O8)));
                this.K.p0(ColorStateList.valueOf(this.O8));
            }
            this.invalidate();
        }
    }

    public void o0() {
        this.c.O();
    }

    @Override  // android.view.View
    protected void onConfigurationChanged(@NonNull Configuration configuration0) {
        super.onConfigurationChanged(configuration0);
        this.n9.a0(configuration0);
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.t9 = false;
        if(this.M0() || this.I0()) {
            this.d.post(() -> this.d.requestLayout());
        }
    }

    @Override  // android.widget.LinearLayout
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        EditText editText0 = this.d;
        if(editText0 != null) {
            Rect rect0 = this.Q8;
            com.google.android.material.internal.d.a(this, editText0, rect0);
            this.C0(rect0);
            if(this.C) {
                float f = this.d.getTextSize();
                this.n9.x0(f);
                int v4 = this.d.getGravity();
                this.n9.l0(v4 & 0xFFFFFF8F | 0x30);
                this.n9.w0(v4);
                Rect rect1 = this.s(rect0);
                this.n9.h0(rect1);
                Rect rect2 = this.v(rect0);
                this.n9.r0(rect2);
                this.n9.c0();
                if(this.E() && !this.m9) {
                    this.j0();
                }
            }
        }
    }

    @Override  // android.widget.LinearLayout
    protected void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        if(!this.t9) {
            this.c.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.t9 = true;
        }
        this.Q0();
        this.c.D0();
    }

    @Override  // android.view.View
    protected void onRestoreInstanceState(@Nullable Parcelable parcelable0) {
        class com.google.android.material.textfield.TextInputLayout.b implements Runnable {
            final TextInputLayout a;

            @Override
            public void run() {
                TextInputLayout.this.c.i();
            }
        }

        if(!(parcelable0 instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((SavedState)parcelable0).a());
        this.setError(((SavedState)parcelable0).c);
        if(((SavedState)parcelable0).d) {
            this.post(new com.google.android.material.textfield.TextInputLayout.b(this));
        }
        this.requestLayout();
    }

    @Override  // android.widget.LinearLayout
    public void onRtlPropertiesChanged(int v) {
        super.onRtlPropertiesChanged(v);
        if(v == 1 != this.M) {
            float f = this.L.r().a(this.S8);
            float f1 = this.L.t().a(this.S8);
            float f2 = this.L.j().a(this.S8);
            float f3 = this.L.l().a(this.S8);
            com.google.android.material.shape.f f4 = this.L.q();
            com.google.android.material.shape.f f5 = this.L.s();
            com.google.android.material.shape.f f6 = this.L.i();
            com.google.android.material.shape.f f7 = this.L.k();
            p p0 = p.a().J(f5).O(f4).w(f7).B(f6).K(f1).P(f).x(f3).C(f2).m();
            this.M = v == 1;
            this.setShapeAppearanceModel(p0);
        }
    }

    @Override  // android.view.View
    @Nullable
    public Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new SavedState(super.onSaveInstanceState());
        if(this.x0()) {
            parcelable0.c = this.getError();
        }
        parcelable0.d = this.c.H();
        return parcelable0;
    }

    private void p(@NonNull RectF rectF0) {
        rectF0.left -= (float)this.N;
        rectF0.right += (float)this.N;
    }

    public void p0() {
        this.b.n();
    }

    private void q() {
        switch(this.O) {
            case 0: {
                this.F = null;
                this.J = null;
                this.K = null;
                return;
            }
            case 1: {
                this.F = new k(this.L);
                this.J = new k();
                this.K = new k();
                return;
            }
            case 2: {
                this.F = !this.C || this.F instanceof com.google.android.material.textfield.h ? new k(this.L) : com.google.android.material.textfield.h.R0(this.L);
                this.J = null;
                this.K = null;
                return;
            }
            default: {
                throw new IllegalArgumentException(this.O + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
        }
    }

    public void q0(@NonNull h textInputLayout$h0) {
        this.W8.remove(textInputLayout$h0);
    }

    private int r() {
        return this.O == 1 ? v.s(v.e(this, attr.colorSurface, 0), this.P8) : this.P8;
    }

    public void r0(@NonNull i textInputLayout$i0) {
        this.c.Q(textInputLayout$i0);
    }

    @NonNull
    private Rect s(@NonNull Rect rect0) {
        if(this.d != null) {
            Rect rect1 = this.R8;
            boolean z = M.s(this);
            rect1.bottom = rect0.bottom;
            switch(this.O) {
                case 1: {
                    rect1.left = this.M(rect0.left, z);
                    rect1.top = rect0.top + this.P;
                    rect1.right = this.N(rect0.right, z);
                    return rect1;
                }
                case 2: {
                    rect1.left = rect0.left + this.d.getPaddingLeft();
                    rect1.top = rect0.top - this.w();
                    rect1.right = rect0.right - this.d.getPaddingRight();
                    return rect1;
                }
                default: {
                    rect1.left = this.M(rect0.left, z);
                    rect1.top = this.getPaddingTop();
                    rect1.right = this.N(rect0.right, z);
                    return rect1;
                }
            }
        }
        throw new IllegalStateException();
    }

    private void s0() {
        TextView textView0 = this.t;
        if(textView0 != null) {
            textView0.setVisibility(8);
        }
    }

    public void setBoxBackgroundColor(@ColorInt int v) {
        if(this.P8 != v) {
            this.P8 = v;
            this.g9 = v;
            this.i9 = v;
            this.j9 = v;
            this.n();
        }
    }

    public void setBoxBackgroundColorResource(@ColorRes int v) {
        this.setBoxBackgroundColor(ContextCompat.getColor(this.getContext(), v));
    }

    public void setBoxBackgroundColorStateList(@NonNull ColorStateList colorStateList0) {
        int v = colorStateList0.getDefaultColor();
        this.g9 = v;
        this.P8 = v;
        this.h9 = colorStateList0.getColorForState(new int[]{0xFEFEFF62}, -1);
        this.i9 = colorStateList0.getColorForState(new int[]{0x101009C, 0x101009E}, -1);
        this.j9 = colorStateList0.getColorForState(new int[]{0x1010367, 0x101009E}, -1);
        this.n();
    }

    public void setBoxBackgroundMode(int v) {
        if(v == this.O) {
            return;
        }
        this.O = v;
        if(this.d != null) {
            this.i0();
        }
    }

    public void setBoxCollapsedPaddingTop(int v) {
        this.P = v;
    }

    public void setBoxCornerFamily(int v) {
        this.L = this.L.v().I(v, this.L.r()).N(v, this.L.t()).v(v, this.L.j()).A(v, this.L.l()).m();
        this.n();
    }

    public void setBoxStrokeColor(@ColorInt int v) {
        if(this.e9 != v) {
            this.e9 = v;
            this.U0();
        }
    }

    public void setBoxStrokeColorStateList(@NonNull ColorStateList colorStateList0) {
        if(colorStateList0.isStateful()) {
            this.c9 = colorStateList0.getDefaultColor();
            this.k9 = colorStateList0.getColorForState(new int[]{0xFEFEFF62}, -1);
            this.d9 = colorStateList0.getColorForState(new int[]{0x1010367, 0x101009E}, -1);
            this.e9 = colorStateList0.getColorForState(new int[]{0x101009C, 0x101009E}, -1);
        }
        else if(this.e9 != colorStateList0.getDefaultColor()) {
            this.e9 = colorStateList0.getDefaultColor();
        }
        this.U0();
    }

    public void setBoxStrokeErrorColor(@Nullable ColorStateList colorStateList0) {
        if(this.f9 != colorStateList0) {
            this.f9 = colorStateList0;
            this.U0();
        }
    }

    public void setBoxStrokeWidth(int v) {
        this.M8 = v;
        this.U0();
    }

    public void setBoxStrokeWidthFocused(int v) {
        this.N8 = v;
        this.U0();
    }

    public void setBoxStrokeWidthFocusedResource(@DimenRes int v) {
        this.setBoxStrokeWidthFocused(this.getResources().getDimensionPixelSize(v));
    }

    public void setBoxStrokeWidthResource(@DimenRes int v) {
        this.setBoxStrokeWidth(this.getResources().getDimensionPixelSize(v));
    }

    public void setCounterEnabled(boolean z) {
        if(this.k != z) {
            if(z) {
                AppCompatTextView appCompatTextView0 = new AppCompatTextView(this.getContext());
                this.o = appCompatTextView0;
                appCompatTextView0.setId(id.textinput_counter);
                Typeface typeface0 = this.T8;
                if(typeface0 != null) {
                    this.o.setTypeface(typeface0);
                }
                this.o.setMaxLines(1);
                this.j.e(this.o, 2);
                MarginLayoutParamsCompat.h(((ViewGroup.MarginLayoutParams)this.o.getLayoutParams()), this.getResources().getDimensionPixelOffset(dimen.mtrl_textinput_counter_margin_start));
                this.G0();
                this.D0();
            }
            else {
                this.j.H(this.o, 2);
                this.o = null;
            }
            this.k = z;
        }
    }

    public void setCounterMaxLength(int v) {
        if(this.l != v) {
            this.l = v > 0 ? v : -1;
            if(this.k) {
                this.D0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int v) {
        if(this.p != v) {
            this.p = v;
            this.G0();
        }
    }

    public void setCounterOverflowTextColor(@Nullable ColorStateList colorStateList0) {
        if(this.z != colorStateList0) {
            this.z = colorStateList0;
            this.G0();
        }
    }

    public void setCounterTextAppearance(int v) {
        if(this.q != v) {
            this.q = v;
            this.G0();
        }
    }

    public void setCounterTextColor(@Nullable ColorStateList colorStateList0) {
        if(this.y != colorStateList0) {
            this.y = colorStateList0;
            this.G0();
        }
    }

    @RequiresApi(29)
    public void setCursorColor(@Nullable ColorStateList colorStateList0) {
        if(this.A != colorStateList0) {
            this.A = colorStateList0;
            this.H0();
        }
    }

    @RequiresApi(29)
    public void setCursorErrorColor(@Nullable ColorStateList colorStateList0) {
        if(this.B != colorStateList0) {
            this.B = colorStateList0;
            if(this.a0()) {
                this.H0();
            }
        }
    }

    public void setDefaultHintTextColor(@Nullable ColorStateList colorStateList0) {
        this.a9 = colorStateList0;
        this.b9 = colorStateList0;
        if(this.d != null) {
            this.O0(false);
        }
    }

    private void setEditText(EditText editText0) {
        class com.google.android.material.textfield.TextInputLayout.a implements TextWatcher {
            int a;
            final EditText b;
            final TextInputLayout c;

            com.google.android.material.textfield.TextInputLayout.a(EditText editText0) {
                this.b = editText0;
                super();
                this.a = editText0.getLineCount();
            }

            @Override  // android.text.TextWatcher
            public void afterTextChanged(@NonNull Editable editable0) {
                TextInputLayout.this.O0(!TextInputLayout.this.s9);
                TextInputLayout textInputLayout0 = TextInputLayout.this;
                if(textInputLayout0.k) {
                    textInputLayout0.E0(editable0);
                }
                if(TextInputLayout.this.s) {
                    TextInputLayout.this.S0(editable0);
                }
                int v = this.b.getLineCount();
                int v1 = this.a;
                if(v != v1) {
                    if(v < v1) {
                        int v2 = ViewCompat.j0(this.b);
                        int v3 = TextInputLayout.this.l9;
                        if(v2 != v3) {
                            this.b.setMinimumHeight(v3);
                        }
                    }
                    this.a = v;
                }
            }

            @Override  // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
            }

            @Override  // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
            }
        }

        if(this.d != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if(this.getEndIconMode() != 3 && !(editText0 instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.d = editText0;
        int v = this.f;
        if(v == -1) {
            this.setMinWidth(this.h);
        }
        else {
            this.setMinEms(v);
        }
        int v1 = this.g;
        if(v1 == -1) {
            this.setMaxWidth(this.i);
        }
        else {
            this.setMaxEms(v1);
        }
        this.I = false;
        this.i0();
        this.setTextInputAccessibilityDelegate(new d(this));
        Typeface typeface0 = this.d.getTypeface();
        this.n9.P0(typeface0);
        float f = this.d.getTextSize();
        this.n9.x0(f);
        int v2 = Build.VERSION.SDK_INT;
        float f1 = this.d.getLetterSpacing();
        this.n9.s0(f1);
        int v3 = this.d.getGravity();
        this.n9.l0(v3 & 0xFFFFFF8F | 0x30);
        this.n9.w0(v3);
        this.l9 = ViewCompat.j0(editText0);
        this.d.addTextChangedListener(new com.google.android.material.textfield.TextInputLayout.a(this, editText0));
        if(this.a9 == null) {
            this.a9 = this.d.getHintTextColors();
        }
        if(this.C) {
            if(TextUtils.isEmpty(this.D)) {
                CharSequence charSequence0 = this.d.getHint();
                this.e = charSequence0;
                this.setHint(charSequence0);
                this.d.setHint(null);
            }
            this.E = true;
        }
        if(v2 >= 29) {
            this.H0();
        }
        if(this.o != null) {
            this.E0(this.d.getText());
        }
        this.J0();
        this.j.f();
        this.b.bringToFront();
        this.c.bringToFront();
        this.G();
        this.c.D0();
        if(!this.isEnabled()) {
            editText0.setEnabled(false);
        }
        this.P0(false, true);
    }

    @Override  // android.view.View
    public void setEnabled(boolean z) {
        TextInputLayout.m0(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.c.S(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.c.T(z);
    }

    public void setEndIconContentDescription(@StringRes int v) {
        this.c.U(v);
    }

    public void setEndIconContentDescription(@Nullable CharSequence charSequence0) {
        this.c.V(charSequence0);
    }

    public void setEndIconDrawable(@DrawableRes int v) {
        this.c.W(v);
    }

    public void setEndIconDrawable(@Nullable Drawable drawable0) {
        this.c.X(drawable0);
    }

    public void setEndIconMinSize(@IntRange(from = 0L) int v) {
        this.c.Y(v);
    }

    public void setEndIconMode(int v) {
        this.c.Z(v);
    }

    public void setEndIconOnClickListener(@Nullable View.OnClickListener view$OnClickListener0) {
        this.c.a0(view$OnClickListener0);
    }

    public void setEndIconOnLongClickListener(@Nullable View.OnLongClickListener view$OnLongClickListener0) {
        this.c.b0(view$OnLongClickListener0);
    }

    public void setEndIconScaleType(@NonNull ImageView.ScaleType imageView$ScaleType0) {
        this.c.c0(imageView$ScaleType0);
    }

    public void setEndIconTintList(@Nullable ColorStateList colorStateList0) {
        this.c.d0(colorStateList0);
    }

    public void setEndIconTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        this.c.e0(porterDuff$Mode0);
    }

    public void setEndIconVisible(boolean z) {
        this.c.f0(z);
    }

    public void setError(@Nullable CharSequence charSequence0) {
        if(!this.j.F()) {
            if(TextUtils.isEmpty(charSequence0)) {
                return;
            }
            this.setErrorEnabled(true);
        }
        if(!TextUtils.isEmpty(charSequence0)) {
            this.j.V(charSequence0);
            return;
        }
        this.j.A();
    }

    public void setErrorAccessibilityLiveRegion(int v) {
        this.j.J(v);
    }

    public void setErrorContentDescription(@Nullable CharSequence charSequence0) {
        this.j.K(charSequence0);
    }

    public void setErrorEnabled(boolean z) {
        this.j.L(z);
    }

    public void setErrorIconDrawable(@DrawableRes int v) {
        this.c.g0(v);
    }

    public void setErrorIconDrawable(@Nullable Drawable drawable0) {
        this.c.h0(drawable0);
    }

    public void setErrorIconOnClickListener(@Nullable View.OnClickListener view$OnClickListener0) {
        this.c.i0(view$OnClickListener0);
    }

    public void setErrorIconOnLongClickListener(@Nullable View.OnLongClickListener view$OnLongClickListener0) {
        this.c.j0(view$OnLongClickListener0);
    }

    public void setErrorIconTintList(@Nullable ColorStateList colorStateList0) {
        this.c.k0(colorStateList0);
    }

    public void setErrorIconTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        this.c.l0(porterDuff$Mode0);
    }

    public void setErrorTextAppearance(@StyleRes int v) {
        this.j.M(v);
    }

    public void setErrorTextColor(@Nullable ColorStateList colorStateList0) {
        this.j.N(colorStateList0);
    }

    public void setExpandedHintEnabled(boolean z) {
        if(this.o9 != z) {
            this.o9 = z;
            this.O0(false);
        }
    }

    public void setHelperText(@Nullable CharSequence charSequence0) {
        if(!TextUtils.isEmpty(charSequence0)) {
            if(!this.W()) {
                this.setHelperTextEnabled(true);
            }
            this.j.W(charSequence0);
        }
        else if(this.W()) {
            this.setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(@Nullable ColorStateList colorStateList0) {
        this.j.Q(colorStateList0);
    }

    public void setHelperTextEnabled(boolean z) {
        this.j.P(z);
    }

    public void setHelperTextTextAppearance(@StyleRes int v) {
        this.j.O(v);
    }

    public void setHint(@StringRes int v) {
        this.setHint((v == 0 ? null : this.getResources().getText(v)));
    }

    public void setHint(@Nullable CharSequence charSequence0) {
        if(this.C) {
            this.setHintInternal(charSequence0);
            this.sendAccessibilityEvent(0x800);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.p9 = z;
    }

    public void setHintEnabled(boolean z) {
        if(z != this.C) {
            this.C = z;
            if(z) {
                CharSequence charSequence0 = this.d.getHint();
                if(!TextUtils.isEmpty(charSequence0)) {
                    if(TextUtils.isEmpty(this.D)) {
                        this.setHint(charSequence0);
                    }
                    this.d.setHint(null);
                }
                this.E = true;
            }
            else {
                this.E = false;
                if(!TextUtils.isEmpty(this.D) && TextUtils.isEmpty(this.d.getHint())) {
                    this.d.setHint(this.D);
                }
                this.setHintInternal(null);
            }
            if(this.d != null) {
                this.N0();
            }
        }
    }

    private void setHintInternal(CharSequence charSequence0) {
        if(!TextUtils.equals(charSequence0, this.D)) {
            this.D = charSequence0;
            this.n9.M0(charSequence0);
            if(!this.m9) {
                this.j0();
            }
        }
    }

    public void setHintTextAppearance(@StyleRes int v) {
        this.n9.i0(v);
        this.b9 = this.n9.p();
        if(this.d != null) {
            this.O0(false);
            this.N0();
        }
    }

    public void setHintTextColor(@Nullable ColorStateList colorStateList0) {
        if(this.b9 != colorStateList0) {
            if(this.a9 == null) {
                this.n9.k0(colorStateList0);
            }
            this.b9 = colorStateList0;
            if(this.d != null) {
                this.O0(false);
            }
        }
    }

    public void setLengthCounter(@NonNull g textInputLayout$g0) {
        this.n = textInputLayout$g0;
    }

    public void setMaxEms(int v) {
        this.g = v;
        EditText editText0 = this.d;
        if(editText0 != null && v != -1) {
            editText0.setMaxEms(v);
        }
    }

    public void setMaxWidth(@Px int v) {
        this.i = v;
        EditText editText0 = this.d;
        if(editText0 != null && v != -1) {
            editText0.setMaxWidth(v);
        }
    }

    public void setMaxWidthResource(@DimenRes int v) {
        this.setMaxWidth(this.getContext().getResources().getDimensionPixelSize(v));
    }

    public void setMinEms(int v) {
        this.f = v;
        EditText editText0 = this.d;
        if(editText0 != null && v != -1) {
            editText0.setMinEms(v);
        }
    }

    public void setMinWidth(@Px int v) {
        this.h = v;
        EditText editText0 = this.d;
        if(editText0 != null && v != -1) {
            editText0.setMinWidth(v);
        }
    }

    public void setMinWidthResource(@DimenRes int v) {
        this.setMinWidth(this.getContext().getResources().getDimensionPixelSize(v));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@StringRes int v) {
        this.c.n0(v);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@Nullable CharSequence charSequence0) {
        this.c.o0(charSequence0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@DrawableRes int v) {
        this.c.p0(v);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@Nullable Drawable drawable0) {
        this.c.q0(drawable0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        this.c.r0(z);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(@Nullable ColorStateList colorStateList0) {
        this.c.s0(colorStateList0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        this.c.t0(porterDuff$Mode0);
    }

    public void setPlaceholderText(@Nullable CharSequence charSequence0) {
        if(this.t == null) {
            AppCompatTextView appCompatTextView0 = new AppCompatTextView(this.getContext());
            this.t = appCompatTextView0;
            appCompatTextView0.setId(id.textinput_placeholder);
            ViewCompat.b2(this.t, 2);
            Fade fade0 = this.D();
            this.w = fade0;
            fade0.I0(67L);
            this.x = this.D();
            this.setPlaceholderTextAppearance(this.v);
            this.setPlaceholderTextColor(this.u);
        }
        if(TextUtils.isEmpty(charSequence0)) {
            this.setPlaceholderTextEnabled(false);
        }
        else {
            if(!this.s) {
                this.setPlaceholderTextEnabled(true);
            }
            this.r = charSequence0;
        }
        this.R0();
    }

    public void setPlaceholderTextAppearance(@StyleRes int v) {
        this.v = v;
        TextView textView0 = this.t;
        if(textView0 != null) {
            TextViewCompat.D(textView0, v);
        }
    }

    public void setPlaceholderTextColor(@Nullable ColorStateList colorStateList0) {
        if(this.u != colorStateList0) {
            this.u = colorStateList0;
            TextView textView0 = this.t;
            if(textView0 != null && colorStateList0 != null) {
                textView0.setTextColor(colorStateList0);
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if(this.s == z) {
            return;
        }
        if(z) {
            this.k();
        }
        else {
            this.s0();
            this.t = null;
        }
        this.s = z;
    }

    public void setPrefixText(@Nullable CharSequence charSequence0) {
        this.b.o(charSequence0);
    }

    public void setPrefixTextAppearance(@StyleRes int v) {
        this.b.p(v);
    }

    public void setPrefixTextColor(@NonNull ColorStateList colorStateList0) {
        this.b.q(colorStateList0);
    }

    public void setShapeAppearanceModel(@NonNull p p0) {
        if(this.F != null && this.F.getShapeAppearanceModel() != p0) {
            this.L = p0;
            this.n();
        }
    }

    public void setStartIconCheckable(boolean z) {
        this.b.r(z);
    }

    public void setStartIconContentDescription(@StringRes int v) {
        this.setStartIconContentDescription((v == 0 ? null : this.getResources().getText(v)));
    }

    public void setStartIconContentDescription(@Nullable CharSequence charSequence0) {
        this.b.s(charSequence0);
    }

    public void setStartIconDrawable(@DrawableRes int v) {
        this.setStartIconDrawable((v == 0 ? null : AppCompatResources.b(this.getContext(), v)));
    }

    public void setStartIconDrawable(@Nullable Drawable drawable0) {
        this.b.t(drawable0);
    }

    public void setStartIconMinSize(@IntRange(from = 0L) int v) {
        this.b.u(v);
    }

    public void setStartIconOnClickListener(@Nullable View.OnClickListener view$OnClickListener0) {
        this.b.v(view$OnClickListener0);
    }

    public void setStartIconOnLongClickListener(@Nullable View.OnLongClickListener view$OnLongClickListener0) {
        this.b.w(view$OnLongClickListener0);
    }

    public void setStartIconScaleType(@NonNull ImageView.ScaleType imageView$ScaleType0) {
        this.b.x(imageView$ScaleType0);
    }

    public void setStartIconTintList(@Nullable ColorStateList colorStateList0) {
        this.b.y(colorStateList0);
    }

    public void setStartIconTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        this.b.z(porterDuff$Mode0);
    }

    public void setStartIconVisible(boolean z) {
        this.b.A(z);
    }

    public void setSuffixText(@Nullable CharSequence charSequence0) {
        this.c.u0(charSequence0);
    }

    public void setSuffixTextAppearance(@StyleRes int v) {
        this.c.v0(v);
    }

    public void setSuffixTextColor(@NonNull ColorStateList colorStateList0) {
        this.c.w0(colorStateList0);
    }

    public void setTextInputAccessibilityDelegate(@Nullable d textInputLayout$d0) {
        EditText editText0 = this.d;
        if(editText0 != null) {
            ViewCompat.J1(editText0, textInputLayout$d0);
        }
    }

    public void setTypeface(@Nullable Typeface typeface0) {
        if(typeface0 != this.T8) {
            this.T8 = typeface0;
            this.n9.P0(typeface0);
            this.j.S(typeface0);
            TextView textView0 = this.o;
            if(textView0 != null) {
                textView0.setTypeface(typeface0);
            }
        }
    }

    // 去混淆评级： 低(20)
    private int t(@NonNull Rect rect0, @NonNull Rect rect1, float f) {
        return this.d0() ? ((int)(((float)rect1.top) + f)) : rect0.bottom - this.d.getCompoundPaddingBottom();
    }

    public void t0(float f, float f1, float f2, float f3) {
        boolean z = M.s(this);
        this.M = z;
        float f4 = z ? f1 : f;
        if(!z) {
            f = f1;
        }
        float f5 = z ? f3 : f2;
        if(!z) {
            f2 = f3;
        }
        if(this.F == null || this.F.T() != f4 || this.F.U() != f || this.F.u() != f5 || this.F.v() != f2) {
            this.L = this.L.v().K(f4).P(f).x(f5).C(f2).m();
            this.n();
        }
    }

    // 去混淆评级： 低(20)
    private int u(@NonNull Rect rect0, float f) {
        return this.d0() ? ((int)(((float)rect0.centerY()) - f / 2.0f)) : rect0.top + this.d.getCompoundPaddingTop();
    }

    public void u0(@DimenRes int v, @DimenRes int v1, @DimenRes int v2, @DimenRes int v3) {
        this.t0(this.getContext().getResources().getDimension(v), this.getContext().getResources().getDimension(v1), this.getContext().getResources().getDimension(v3), this.getContext().getResources().getDimension(v2));
    }

    @NonNull
    private Rect v(@NonNull Rect rect0) {
        if(this.d == null) {
            throw new IllegalStateException();
        }
        float f = this.n9.D();
        this.R8.left = rect0.left + this.d.getCompoundPaddingLeft();
        this.R8.top = this.u(rect0, f);
        this.R8.right = rect0.right - this.d.getCompoundPaddingRight();
        this.R8.bottom = this.t(rect0, this.R8, f);
        return this.R8;
    }

    private void v0() {
        EditText editText0 = this.d;
        if(!(editText0 instanceof AutoCompleteTextView)) {
            return;
        }
        if(((AutoCompleteTextView)editText0).getDropDownBackground() == null) {
            int v = this.O;
            if(v == 2) {
                ((AutoCompleteTextView)editText0).setDropDownBackgroundDrawable(this.getOrCreateOutlinedDropDownMenuBackground());
                return;
            }
            if(v == 1) {
                ((AutoCompleteTextView)editText0).setDropDownBackgroundDrawable(this.getOrCreateFilledDropDownMenuBackground());
            }
        }
    }

    private int w() {
        if(!this.C) {
            return 0;
        }
        switch(this.O) {
            case 0: {
                return (int)this.n9.r();
            }
            case 2: {
                return (int)(this.n9.r() / 2.0f);
            }
            default: {
                return 0;
            }
        }
    }

    void w0(@NonNull TextView textView0, @StyleRes int v) {
        try {
            TextViewCompat.D(textView0, v);
            if(Build.VERSION.SDK_INT >= 23 && textView0.getTextColors().getDefaultColor() == 0xFFFF00FF) {
                goto label_3;
            }
            return;
        }
        catch(Exception unused_ex) {
        }
    label_3:
        TextViewCompat.D(textView0, style.TextAppearance_AppCompat_Caption);
        textView0.setTextColor(ContextCompat.getColor(this.getContext(), color.design_error));
    }

    private boolean x() {
        return this.O == 2 && this.y();
    }

    boolean x0() {
        return this.j.m();
    }

    private boolean y() {
        return this.Q > -1 && this.O8 != 0;
    }

    // 去混淆评级： 低(30)
    private boolean y0() {
        return (this.c.J() || this.c.C() && this.S() || this.c.y() != null) && this.c.getMeasuredWidth() > 0;
    }

    public void z() {
        this.W8.clear();
    }

    private boolean z0() {
        return (this.getStartIconDrawable() != null || this.getPrefixText() != null && this.getPrefixTextView().getVisibility() == 0) && this.b.getMeasuredWidth() > 0;
    }
}

