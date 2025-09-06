package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.R.dimen;
import com.google.android.material.R.id;
import com.google.android.material.R.layout;
import com.google.android.material.R.string;
import com.google.android.material.R.styleable;
import com.google.android.material.internal.C;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.M;
import java.util.LinkedHashSet;

@SuppressLint({"ViewConstructor"})
class r extends LinearLayout {
    class a extends C {
        final r a;

        @Override  // com.google.android.material.internal.C
        public void afterTextChanged(Editable editable0) {
            r.this.o().a(editable0);
        }

        @Override  // com.google.android.material.internal.C
        public void beforeTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
            r.this.o().b(charSequence0, v, v1, v2);
        }
    }

    class b implements h {
        final r a;

        @Override  // com.google.android.material.textfield.TextInputLayout$h
        public void a(@NonNull TextInputLayout textInputLayout0) {
            if(r.this.s == textInputLayout0.getEditText()) {
                return;
            }
            if(r.this.s != null) {
                r.this.s.removeTextChangedListener(r.this.v);
                if(r.this.s.getOnFocusChangeListener() == r.this.o().e()) {
                    r.this.s.setOnFocusChangeListener(null);
                }
            }
            r.this.s = textInputLayout0.getEditText();
            if(r.this.s != null) {
                r.this.s.addTextChangedListener(r.this.v);
            }
            r.this.o().n(r.this.s);
            s s0 = r.this.o();
            r.this.m0(s0);
        }
    }

    static class d {
        private final SparseArray a;
        private final r b;
        private final int c;
        private final int d;

        d(r r0, TintTypedArray tintTypedArray0) {
            this.a = new SparseArray();
            this.b = r0;
            this.c = tintTypedArray0.u(styleable.TextInputLayout_endIconDrawable, 0);
            this.d = tintTypedArray0.u(styleable.TextInputLayout_passwordToggleDrawable, 0);
        }

        private s b(int v) {
            switch(v) {
                case -1: {
                    return new g(this.b);
                }
                case 0: {
                    return new v(this.b);
                }
                case 1: {
                    return new x(this.b, this.d);
                }
                case 2: {
                    return new f(this.b);
                }
                case 3: {
                    return new p(this.b);
                }
                default: {
                    throw new IllegalArgumentException("Invalid end icon mode: " + v);
                }
            }
        }

        s c(int v) {
            s s0 = (s)this.a.get(v);
            if(s0 == null) {
                s0 = this.b(v);
                this.a.append(v, s0);
            }
            return s0;
        }
    }

    final TextInputLayout a;
    @NonNull
    private final FrameLayout b;
    @NonNull
    private final CheckableImageButton c;
    private ColorStateList d;
    private PorterDuff.Mode e;
    private View.OnLongClickListener f;
    @NonNull
    private final CheckableImageButton g;
    private final d h;
    private int i;
    private final LinkedHashSet j;
    private ColorStateList k;
    private PorterDuff.Mode l;
    private int m;
    @NonNull
    private ImageView.ScaleType n;
    private View.OnLongClickListener o;
    @Nullable
    private CharSequence p;
    @NonNull
    private final TextView q;
    private boolean r;
    private EditText s;
    @Nullable
    private final AccessibilityManager t;
    @Nullable
    private TouchExplorationStateChangeListener u;
    private final TextWatcher v;
    private final h w;

    r(TextInputLayout textInputLayout0, TintTypedArray tintTypedArray0) {
        class c implements View.OnAttachStateChangeListener {
            final r a;

            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view0) {
                r.this.h();
            }

            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view0) {
                r.this.R();
            }
        }

        super(textInputLayout0.getContext());
        this.i = 0;
        this.j = new LinkedHashSet();
        this.v = new a(this);
        b r$b0 = new b(this);
        this.w = r$b0;
        this.t = (AccessibilityManager)this.getContext().getSystemService("accessibility");
        this.a = textInputLayout0;
        this.setVisibility(8);
        this.setOrientation(0);
        this.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 0x800005));
        FrameLayout frameLayout0 = new FrameLayout(this.getContext());
        this.b = frameLayout0;
        frameLayout0.setVisibility(8);
        frameLayout0.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflater0 = LayoutInflater.from(this.getContext());
        CheckableImageButton checkableImageButton0 = this.k(this, layoutInflater0, id.text_input_error_icon);
        this.c = checkableImageButton0;
        CheckableImageButton checkableImageButton1 = this.k(frameLayout0, layoutInflater0, id.text_input_end_icon);
        this.g = checkableImageButton1;
        this.h = new d(this, tintTypedArray0);
        AppCompatTextView appCompatTextView0 = new AppCompatTextView(this.getContext());
        this.q = appCompatTextView0;
        this.E(tintTypedArray0);
        this.D(tintTypedArray0);
        this.F(tintTypedArray0);
        frameLayout0.addView(checkableImageButton1);
        this.addView(appCompatTextView0);
        this.addView(frameLayout0);
        this.addView(checkableImageButton0);
        textInputLayout0.i(r$b0);
        this.addOnAttachStateChangeListener(new c(this));
    }

    int A() {
        if(!this.I() && !this.J()) {
            return ViewCompat.o0(this) + ViewCompat.o0(this.q);
        }
        int v = this.g.getMeasuredWidth() + MarginLayoutParamsCompat.c(((ViewGroup.MarginLayoutParams)this.g.getLayoutParams()));
        return ViewCompat.o0(this) + ViewCompat.o0(this.q) + v;
    }

    void A0(boolean z) {
        if(this.i == 1) {
            this.g.performClick();
            if(z) {
                this.g.jumpDrawablesToCurrentState();
            }
        }
    }

    TextView B() {
        return this.q;
    }

    private void B0() {
        int v = 8;
        int v1 = this.g.getVisibility() != 0 || this.J() ? 8 : 0;
        this.b.setVisibility(v1);
        int v2 = this.p == null || this.r ? 8 : 0;
        if(this.I() || this.J() || v2 == 0) {
            v = 0;
        }
        this.setVisibility(v);
    }

    boolean C() {
        return this.i != 0;
    }

    private void C0() {
        int v = 0;
        boolean z = this.u() != null && this.a.T() && this.a.x0();
        CheckableImageButton checkableImageButton0 = this.c;
        if(!z) {
            v = 8;
        }
        checkableImageButton0.setVisibility(v);
        this.B0();
        this.D0();
        if(!this.C()) {
            this.a.I0();
        }
    }

    private void D(TintTypedArray tintTypedArray0) {
        if(!tintTypedArray0.C(styleable.TextInputLayout_passwordToggleEnabled)) {
            if(tintTypedArray0.C(styleable.TextInputLayout_endIconTint)) {
                this.k = com.google.android.material.resources.d.b(this.getContext(), tintTypedArray0, 0x20);
            }
            if(tintTypedArray0.C(styleable.TextInputLayout_endIconTintMode)) {
                this.l = M.u(tintTypedArray0.o(33, -1), null);
            }
        }
        if(tintTypedArray0.C(styleable.TextInputLayout_endIconMode)) {
            this.Z(tintTypedArray0.o(30, 0));
            if(tintTypedArray0.C(styleable.TextInputLayout_endIconContentDescription)) {
                this.V(tintTypedArray0.x(27));
            }
            this.T(tintTypedArray0.a(styleable.TextInputLayout_endIconCheckable, true));
        }
        else if(tintTypedArray0.C(53)) {
            if(tintTypedArray0.C(styleable.TextInputLayout_passwordToggleTint)) {
                this.k = com.google.android.material.resources.d.b(this.getContext(), tintTypedArray0, 54);
            }
            if(tintTypedArray0.C(styleable.TextInputLayout_passwordToggleTintMode)) {
                this.l = M.u(tintTypedArray0.o(55, -1), null);
            }
            this.Z(((int)tintTypedArray0.a(53, false)));
            this.V(tintTypedArray0.x(styleable.TextInputLayout_passwordToggleContentDescription));
        }
        int v = this.getResources().getDimensionPixelSize(dimen.mtrl_min_touch_target_size);
        this.Y(tintTypedArray0.g(styleable.TextInputLayout_endIconMinSize, v));
        if(tintTypedArray0.C(styleable.TextInputLayout_endIconScaleType)) {
            this.c0(t.b(tintTypedArray0.o(0x1F, -1)));
        }
    }

    void D0() {
        if(this.a.d == null) {
            return;
        }
        int v = this.I() || this.J() ? 0 : ViewCompat.o0(this.a.d);
        int v1 = this.getContext().getResources().getDimensionPixelSize(dimen.material_input_text_to_prefix_suffix_padding);
        int v2 = this.a.d.getPaddingTop();
        int v3 = this.a.d.getPaddingBottom();
        ViewCompat.p2(this.q, v1, v2, v, v3);
    }

    private void E(TintTypedArray tintTypedArray0) {
        if(tintTypedArray0.C(styleable.TextInputLayout_errorIconTint)) {
            this.d = com.google.android.material.resources.d.b(this.getContext(), tintTypedArray0, 38);
        }
        if(tintTypedArray0.C(styleable.TextInputLayout_errorIconTintMode)) {
            this.e = M.u(tintTypedArray0.o(39, -1), null);
        }
        if(tintTypedArray0.C(styleable.TextInputLayout_errorIconDrawable)) {
            this.h0(tintTypedArray0.h(37));
        }
        CharSequence charSequence0 = this.getResources().getText(string.error_icon_content_description);
        this.c.setContentDescription(charSequence0);
        ViewCompat.b2(this.c, 2);
        this.c.setClickable(false);
        this.c.setPressable(false);
        this.c.setFocusable(false);
    }

    private void E0() {
        int v = this.q.getVisibility();
        boolean z = false;
        int v1 = this.p == null || this.r ? 8 : 0;
        if(v != v1) {
            s s0 = this.o();
            if(v1 == 0) {
                z = true;
            }
            s0.q(z);
        }
        this.B0();
        this.q.setVisibility(v1);
        this.a.I0();
    }

    private void F(TintTypedArray tintTypedArray0) {
        this.q.setVisibility(8);
        this.q.setId(id.textinput_suffix_text);
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-2, -2, 80.0f);
        this.q.setLayoutParams(linearLayout$LayoutParams0);
        ViewCompat.L1(this.q, 1);
        this.v0(tintTypedArray0.u(styleable.TextInputLayout_suffixTextAppearance, 0));
        if(tintTypedArray0.C(styleable.TextInputLayout_suffixTextColor)) {
            this.w0(tintTypedArray0.d(73));
        }
        this.u0(tintTypedArray0.x(styleable.TextInputLayout_suffixText));
    }

    boolean G() {
        return this.g.a();
    }

    // 去混淆评级： 低(20)
    boolean H() {
        return this.C() && this.g.isChecked();
    }

    boolean I() {
        return this.b.getVisibility() == 0 && this.g.getVisibility() == 0;
    }

    boolean J() {
        return this.c.getVisibility() == 0;
    }

    boolean K() {
        return this.i == 1;
    }

    void L(boolean z) {
        this.r = z;
        this.E0();
    }

    void M() {
        this.C0();
        this.O();
        this.N();
        if(this.o().t()) {
            this.z0(this.a.x0());
        }
    }

    void N() {
        t.d(this.a, this.g, this.k);
    }

    void O() {
        t.d(this.a, this.c, this.d);
    }

    void P(boolean z) {
        int v1;
        s s0 = this.o();
        int v = 1;
        if(s0.l()) {
            boolean z1 = this.g.isChecked();
            if(z1 == s0.m()) {
                v1 = 0;
            }
            else {
                this.g.setChecked(!z1);
                v1 = 1;
            }
        }
        else {
            v1 = 0;
        }
        if(s0.j()) {
            boolean z2 = this.g.isActivated();
            if(z2 == s0.k()) {
                v = v1;
            }
            else {
                this.S(!z2);
            }
        }
        else {
            v = v1;
        }
        if(z || v != 0) {
            this.N();
        }
    }

    void Q(@NonNull i textInputLayout$i0) {
        this.j.remove(textInputLayout$i0);
    }

    private void R() {
        TouchExplorationStateChangeListener accessibilityManagerCompat$TouchExplorationStateChangeListener0 = this.u;
        if(accessibilityManagerCompat$TouchExplorationStateChangeListener0 != null) {
            AccessibilityManager accessibilityManager0 = this.t;
            if(accessibilityManager0 != null) {
                AccessibilityManagerCompat.h(accessibilityManager0, accessibilityManagerCompat$TouchExplorationStateChangeListener0);
            }
        }
    }

    void S(boolean z) {
        this.g.setActivated(z);
    }

    void T(boolean z) {
        this.g.setCheckable(z);
    }

    void U(@StringRes int v) {
        this.V((v == 0 ? null : this.getResources().getText(v)));
    }

    void V(@Nullable CharSequence charSequence0) {
        if(this.n() != charSequence0) {
            this.g.setContentDescription(charSequence0);
        }
    }

    void W(@DrawableRes int v) {
        this.X((v == 0 ? null : AppCompatResources.b(this.getContext(), v)));
    }

    void X(@Nullable Drawable drawable0) {
        this.g.setImageDrawable(drawable0);
        if(drawable0 != null) {
            t.a(this.a, this.g, this.k, this.l);
            this.N();
        }
    }

    void Y(@Px int v) {
        if(v < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if(v != this.m) {
            this.m = v;
            t.g(this.g, v);
            t.g(this.c, v);
        }
    }

    void Z(int v) {
        if(this.i == v) {
            return;
        }
        this.y0(this.o());
        int v1 = this.i;
        this.i = v;
        this.l(v1);
        this.f0(v != 0);
        s s0 = this.o();
        this.W(this.v(s0));
        this.U(s0.c());
        this.T(s0.l());
        if(!s0.i(this.a.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + this.a.getBoxBackgroundMode() + " is not supported by the end icon mode " + v);
        }
        this.x0(s0);
        this.a0(s0.f());
        EditText editText0 = this.s;
        if(editText0 != null) {
            s0.n(editText0);
            this.m0(s0);
        }
        t.a(this.a, this.g, this.k, this.l);
        this.P(true);
    }

    void a0(@Nullable View.OnClickListener view$OnClickListener0) {
        t.h(this.g, view$OnClickListener0, this.o);
    }

    void b0(@Nullable View.OnLongClickListener view$OnLongClickListener0) {
        this.o = view$OnLongClickListener0;
        t.i(this.g, view$OnLongClickListener0);
    }

    void c0(@NonNull ImageView.ScaleType imageView$ScaleType0) {
        this.n = imageView$ScaleType0;
        t.j(this.g, imageView$ScaleType0);
        t.j(this.c, imageView$ScaleType0);
    }

    void d0(@Nullable ColorStateList colorStateList0) {
        if(this.k != colorStateList0) {
            this.k = colorStateList0;
            t.a(this.a, this.g, colorStateList0, this.l);
        }
    }

    void e0(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        if(this.l != porterDuff$Mode0) {
            this.l = porterDuff$Mode0;
            t.a(this.a, this.g, this.k, porterDuff$Mode0);
        }
    }

    void f0(boolean z) {
        if(this.I() != z) {
            this.g.setVisibility((z ? 0 : 8));
            this.B0();
            this.D0();
            this.a.I0();
        }
    }

    void g(@NonNull i textInputLayout$i0) {
        this.j.add(textInputLayout$i0);
    }

    void g0(@DrawableRes int v) {
        this.h0((v == 0 ? null : AppCompatResources.b(this.getContext(), v)));
        this.O();
    }

    private void h() {
        if(this.u != null && this.t != null && ViewCompat.T0(this)) {
            AccessibilityManagerCompat.b(this.t, this.u);
        }
    }

    void h0(@Nullable Drawable drawable0) {
        this.c.setImageDrawable(drawable0);
        this.C0();
        t.a(this.a, this.c, this.d, this.e);
    }

    void i() {
        this.g.performClick();
        this.g.jumpDrawablesToCurrentState();
    }

    void i0(@Nullable View.OnClickListener view$OnClickListener0) {
        t.h(this.c, view$OnClickListener0, this.f);
    }

    void j() {
        this.j.clear();
    }

    void j0(@Nullable View.OnLongClickListener view$OnLongClickListener0) {
        this.f = view$OnLongClickListener0;
        t.i(this.c, view$OnLongClickListener0);
    }

    private CheckableImageButton k(ViewGroup viewGroup0, LayoutInflater layoutInflater0, @IdRes int v) {
        CheckableImageButton checkableImageButton0 = (CheckableImageButton)layoutInflater0.inflate(layout.design_text_input_end_icon, viewGroup0, false);
        checkableImageButton0.setId(v);
        t.e(checkableImageButton0);
        if(com.google.android.material.resources.d.j(this.getContext())) {
            MarginLayoutParamsCompat.h(((ViewGroup.MarginLayoutParams)checkableImageButton0.getLayoutParams()), 0);
        }
        return checkableImageButton0;
    }

    void k0(@Nullable ColorStateList colorStateList0) {
        if(this.d != colorStateList0) {
            this.d = colorStateList0;
            t.a(this.a, this.c, colorStateList0, this.e);
        }
    }

    private void l(int v) {
        for(Object object0: this.j) {
            ((i)object0).a(this.a, v);
        }
    }

    void l0(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        if(this.e != porterDuff$Mode0) {
            this.e = porterDuff$Mode0;
            t.a(this.a, this.c, this.d, porterDuff$Mode0);
        }
    }

    @Nullable
    CheckableImageButton m() {
        if(this.J()) {
            return this.c;
        }
        return !this.C() || !this.I() ? null : this.g;
    }

    private void m0(s s0) {
        if(this.s == null) {
            return;
        }
        if(s0.e() != null) {
            this.s.setOnFocusChangeListener(s0.e());
        }
        if(s0.g() != null) {
            this.g.setOnFocusChangeListener(s0.g());
        }
    }

    @Nullable
    CharSequence n() {
        return this.g.getContentDescription();
    }

    void n0(@StringRes int v) {
        this.o0((v == 0 ? null : this.getResources().getText(v)));
    }

    s o() {
        return this.h.c(this.i);
    }

    void o0(@Nullable CharSequence charSequence0) {
        this.g.setContentDescription(charSequence0);
    }

    @Nullable
    Drawable p() {
        return this.g.getDrawable();
    }

    void p0(@DrawableRes int v) {
        this.q0((v == 0 ? null : AppCompatResources.b(this.getContext(), v)));
    }

    int q() {
        return this.m;
    }

    void q0(@Nullable Drawable drawable0) {
        this.g.setImageDrawable(drawable0);
    }

    int r() {
        return this.i;
    }

    void r0(boolean z) {
        if(z && this.i != 1) {
            this.Z(1);
            return;
        }
        if(!z) {
            this.Z(0);
        }
    }

    @NonNull
    ImageView.ScaleType s() {
        return this.n;
    }

    void s0(@Nullable ColorStateList colorStateList0) {
        this.k = colorStateList0;
        t.a(this.a, this.g, colorStateList0, this.l);
    }

    CheckableImageButton t() {
        return this.g;
    }

    void t0(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        this.l = porterDuff$Mode0;
        t.a(this.a, this.g, this.k, porterDuff$Mode0);
    }

    Drawable u() {
        return this.c.getDrawable();
    }

    void u0(@Nullable CharSequence charSequence0) {
        this.p = TextUtils.isEmpty(charSequence0) ? null : charSequence0;
        this.q.setText(charSequence0);
        this.E0();
    }

    private int v(s s0) {
        int v = this.h.c;
        return v == 0 ? s0.d() : v;
    }

    void v0(@StyleRes int v) {
        TextViewCompat.D(this.q, v);
    }

    @Nullable
    CharSequence w() {
        return this.g.getContentDescription();
    }

    void w0(@NonNull ColorStateList colorStateList0) {
        this.q.setTextColor(colorStateList0);
    }

    @Nullable
    Drawable x() {
        return this.g.getDrawable();
    }

    private void x0(@NonNull s s0) {
        s0.s();
        this.u = s0.h();
        this.h();
    }

    @Nullable
    CharSequence y() {
        return this.p;
    }

    private void y0(@NonNull s s0) {
        this.R();
        this.u = null;
        s0.u();
    }

    @Nullable
    ColorStateList z() {
        return this.q.getTextColors();
    }

    private void z0(boolean z) {
        if(z && this.p() != null) {
            Drawable drawable0 = DrawableCompat.r(this.p()).mutate();
            DrawableCompat.n(drawable0, this.a.getErrorCurrentTextColors());
            this.g.setImageDrawable(drawable0);
            return;
        }
        t.a(this.a, this.g, this.k, this.l);
    }
}

