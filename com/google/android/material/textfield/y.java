package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.EditText;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.R.dimen;
import com.google.android.material.R.id;
import com.google.android.material.R.layout;
import com.google.android.material.R.styleable;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.M;
import com.google.android.material.resources.d;

@SuppressLint({"ViewConstructor"})
class y extends LinearLayout {
    private final TextInputLayout a;
    private final TextView b;
    @Nullable
    private CharSequence c;
    private final CheckableImageButton d;
    private ColorStateList e;
    private PorterDuff.Mode f;
    private int g;
    @NonNull
    private ImageView.ScaleType h;
    private View.OnLongClickListener i;
    private boolean j;

    y(TextInputLayout textInputLayout0, TintTypedArray tintTypedArray0) {
        super(textInputLayout0.getContext());
        this.a = textInputLayout0;
        this.setVisibility(8);
        this.setOrientation(0);
        this.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 0x800003));
        CheckableImageButton checkableImageButton0 = (CheckableImageButton)LayoutInflater.from(this.getContext()).inflate(layout.design_text_input_start_icon, this, false);
        this.d = checkableImageButton0;
        t.e(checkableImageButton0);
        AppCompatTextView appCompatTextView0 = new AppCompatTextView(this.getContext());
        this.b = appCompatTextView0;
        this.j(tintTypedArray0);
        this.i(tintTypedArray0);
        this.addView(checkableImageButton0);
        this.addView(appCompatTextView0);
    }

    void A(boolean z) {
        if(this.l() != z) {
            this.d.setVisibility((z ? 0 : 8));
            this.C();
            this.D();
        }
    }

    void B(@NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
        if(this.b.getVisibility() == 0) {
            accessibilityNodeInfoCompat0.F1(this.b);
            accessibilityNodeInfoCompat0.l2(this.b);
            return;
        }
        accessibilityNodeInfoCompat0.l2(this.d);
    }

    void C() {
        EditText editText0 = this.a.d;
        if(editText0 == null) {
            return;
        }
        int v = this.l() ? 0 : ViewCompat.p0(editText0);
        int v1 = editText0.getCompoundPaddingTop();
        int v2 = this.getContext().getResources().getDimensionPixelSize(dimen.material_input_text_to_prefix_suffix_padding);
        int v3 = editText0.getCompoundPaddingBottom();
        ViewCompat.p2(this.b, v, v1, v2, v3);
    }

    private void D() {
        int v = 8;
        int v1 = this.c == null || this.j ? 8 : 0;
        if(this.d.getVisibility() == 0 || v1 == 0) {
            v = 0;
        }
        this.setVisibility(v);
        this.b.setVisibility(v1);
        this.a.I0();
    }

    @Nullable
    CharSequence a() {
        return this.c;
    }

    @Nullable
    ColorStateList b() {
        return this.b.getTextColors();
    }

    int c() {
        if(this.l()) {
            int v = this.d.getMeasuredWidth() + MarginLayoutParamsCompat.b(((ViewGroup.MarginLayoutParams)this.d.getLayoutParams()));
            return ViewCompat.p0(this) + ViewCompat.p0(this.b) + v;
        }
        return ViewCompat.p0(this) + ViewCompat.p0(this.b);
    }

    @NonNull
    TextView d() {
        return this.b;
    }

    @Nullable
    CharSequence e() {
        return this.d.getContentDescription();
    }

    @Nullable
    Drawable f() {
        return this.d.getDrawable();
    }

    int g() {
        return this.g;
    }

    @NonNull
    ImageView.ScaleType h() {
        return this.h;
    }

    private void i(TintTypedArray tintTypedArray0) {
        this.b.setVisibility(8);
        this.b.setId(id.textinput_prefix_text);
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-2, -2);
        this.b.setLayoutParams(linearLayout$LayoutParams0);
        ViewCompat.L1(this.b, 1);
        this.p(tintTypedArray0.u(styleable.TextInputLayout_prefixTextAppearance, 0));
        if(tintTypedArray0.C(styleable.TextInputLayout_prefixTextColor)) {
            this.q(tintTypedArray0.d(61));
        }
        this.o(tintTypedArray0.x(styleable.TextInputLayout_prefixText));
    }

    private void j(TintTypedArray tintTypedArray0) {
        if(d.j(this.getContext())) {
            MarginLayoutParamsCompat.g(((ViewGroup.MarginLayoutParams)this.d.getLayoutParams()), 0);
        }
        this.v(null);
        this.w(null);
        if(tintTypedArray0.C(styleable.TextInputLayout_startIconTint)) {
            this.e = d.b(this.getContext(), tintTypedArray0, 69);
        }
        if(tintTypedArray0.C(styleable.TextInputLayout_startIconTintMode)) {
            this.f = M.u(tintTypedArray0.o(70, -1), null);
        }
        if(tintTypedArray0.C(styleable.TextInputLayout_startIconDrawable)) {
            this.t(tintTypedArray0.h(66));
            if(tintTypedArray0.C(styleable.TextInputLayout_startIconContentDescription)) {
                this.s(tintTypedArray0.x(65));
            }
            this.r(tintTypedArray0.a(styleable.TextInputLayout_startIconCheckable, true));
        }
        int v = this.getResources().getDimensionPixelSize(dimen.mtrl_min_touch_target_size);
        this.u(tintTypedArray0.g(styleable.TextInputLayout_startIconMinSize, v));
        if(tintTypedArray0.C(styleable.TextInputLayout_startIconScaleType)) {
            this.x(t.b(tintTypedArray0.o(68, -1)));
        }
    }

    boolean k() {
        return this.d.a();
    }

    boolean l() {
        return this.d.getVisibility() == 0;
    }

    void m(boolean z) {
        this.j = z;
        this.D();
    }

    void n() {
        t.d(this.a, this.d, this.e);
    }

    void o(@Nullable CharSequence charSequence0) {
        this.c = TextUtils.isEmpty(charSequence0) ? null : charSequence0;
        this.b.setText(charSequence0);
        this.D();
    }

    @Override  // android.widget.LinearLayout
    protected void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        this.C();
    }

    void p(@StyleRes int v) {
        TextViewCompat.D(this.b, v);
    }

    void q(@NonNull ColorStateList colorStateList0) {
        this.b.setTextColor(colorStateList0);
    }

    void r(boolean z) {
        this.d.setCheckable(z);
    }

    void s(@Nullable CharSequence charSequence0) {
        if(this.e() != charSequence0) {
            this.d.setContentDescription(charSequence0);
        }
    }

    void t(@Nullable Drawable drawable0) {
        this.d.setImageDrawable(drawable0);
        if(drawable0 != null) {
            t.a(this.a, this.d, this.e, this.f);
            this.A(true);
            this.n();
            return;
        }
        this.A(false);
        this.v(null);
        this.w(null);
        this.s(null);
    }

    void u(@Px int v) {
        if(v < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if(v != this.g) {
            this.g = v;
            t.g(this.d, v);
        }
    }

    void v(@Nullable View.OnClickListener view$OnClickListener0) {
        t.h(this.d, view$OnClickListener0, this.i);
    }

    void w(@Nullable View.OnLongClickListener view$OnLongClickListener0) {
        this.i = view$OnLongClickListener0;
        t.i(this.d, view$OnLongClickListener0);
    }

    void x(@NonNull ImageView.ScaleType imageView$ScaleType0) {
        this.h = imageView$ScaleType0;
        t.j(this.d, imageView$ScaleType0);
    }

    void y(@Nullable ColorStateList colorStateList0) {
        if(this.e != colorStateList0) {
            this.e = colorStateList0;
            t.a(this.a, this.d, colorStateList0, this.f);
        }
    }

    void z(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        if(this.f != porterDuff$Mode0) {
            this.f = porterDuff$Mode0;
            t.a(this.a, this.d, this.e, porterDuff$Mode0);
        }
    }
}

