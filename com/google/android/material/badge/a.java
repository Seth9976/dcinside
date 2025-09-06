package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint.Align;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.PluralsRes;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.XmlRes;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.id;
import com.google.android.material.R.string;
import com.google.android.material.R.style;
import com.google.android.material.internal.A.b;
import com.google.android.material.internal.A;
import com.google.android.material.internal.D;
import com.google.android.material.resources.d;
import com.google.android.material.shape.k;
import com.google.android.material.shape.p;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.Locale;

@OptIn(markerClass = {e.class})
public class a extends Drawable implements b {
    @Retention(RetentionPolicy.SOURCE)
    public @interface com.google.android.material.badge.a.b {
    }

    private static final float A = 0.3f;
    @NonNull
    private final WeakReference a;
    @NonNull
    private final k b;
    @NonNull
    private final A c;
    @NonNull
    private final Rect d;
    @NonNull
    private final BadgeState e;
    private float f;
    private float g;
    private int h;
    private float i;
    private float j;
    private float k;
    @Nullable
    private WeakReference l;
    @Nullable
    private WeakReference m;
    private static final String n = "Badge";
    public static final int o = 0x800035;
    public static final int p = 0x800033;
    @Deprecated
    public static final int q = 0x800055;
    @Deprecated
    public static final int r = 0x800053;
    @StyleRes
    private static final int s = 0;
    @AttrRes
    private static final int t = 0;
    static final String u = "+";
    static final String v = "…";
    static final int w = 0;
    static final int x = 1;
    static final int y = -1;
    public static final int z = -2;

    static {
        a.s = style.Widget_MaterialComponents_Badge;
        a.t = attr.badgeStyle;
    }

    private a(@NonNull Context context0, @XmlRes int v, @AttrRes int v1, @StyleRes int v2, @Nullable State badgeState$State0) {
        this.a = new WeakReference(context0);
        D.c(context0);
        this.d = new Rect();
        A a0 = new A(this);
        this.c = a0;
        a0.g().setTextAlign(Paint.Align.CENTER);
        BadgeState badgeState0 = new BadgeState(context0, v, v1, v2, badgeState$State0);
        this.e = badgeState0;
        this.b = new k(p.b(context0, (this.R() ? badgeState0.o() : badgeState0.k()), (this.R() ? badgeState0.n() : badgeState0.j())).m());
        this.g0();
    }

    public int A() {
        return this.e.w();
    }

    public void A0(@Px int v) {
        this.e.d0(v);
        this.Q0();
    }

    public int B() {
        return this.e.x();
    }

    public void B0(int v) {
        if(this.e.w() != v) {
            this.e.e0(v);
            this.c0();
        }
    }

    // 去混淆评级： 低(20)
    public int C() {
        return this.e.F() ? this.e.y() : 0;
    }

    public void C0(int v) {
        if(this.e.x() != v) {
            this.e.f0(v);
            this.c0();
        }
    }

    @NonNull
    private String D() {
        if(this.h != -2 && this.C() > this.h) {
            Context context0 = (Context)this.a.get();
            return context0 == null ? "" : String.format(this.e.z(), context0.getString(string.mtrl_exceed_max_badge_number_suffix), this.h, "+");
        }
        return NumberFormat.getInstance(this.e.z()).format(((long)this.C()));
    }

    public void D0(int v) {
        int v1 = Math.max(0, v);
        if(this.e.y() != v1) {
            this.e.g0(v1);
            this.d0();
        }
    }

    @Nullable
    private String E() {
        if(this.e.s() != 0) {
            Context context0 = (Context)this.a.get();
            if(context0 == null) {
                return null;
            }
            return this.h == -2 || this.C() <= this.h ? context0.getResources().getQuantityString(this.e.s(), this.C(), new Object[]{this.C()}) : context0.getString(this.e.p(), new Object[]{this.h});
        }
        return null;
    }

    public void E0(@Nullable String s) {
        if(!TextUtils.equals(this.e.B(), s)) {
            this.e.i0(s);
            this.e0();
        }
    }

    private float F(View view0, float f) {
        if(view0.getParent() instanceof View) {
            View view1 = (View)view0.getParent();
            return this.f + this.j - (((float)view1.getWidth()) - view0.getX()) + f;
        }
        return 0.0f;
    }

    public void F0(@StyleRes int v) {
        this.e.j0(v);
        this.a0();
    }

    @NonNull
    State G() {
        return this.e.A();
    }

    public void G0(int v) {
        this.I0(v);
        this.H0(v);
    }

    @Nullable
    public String H() {
        return this.e.B();
    }

    public void H0(@Px int v) {
        this.e.k0(v);
        this.Q0();
    }

    @Nullable
    private String I() {
        String s = this.H();
        int v = this.A();
        if(v == -2) {
            return s;
        }
        if(s != null && s.length() > v) {
            Context context0 = (Context)this.a.get();
            return context0 == null ? "" : String.format(context0.getString(string.m3_exceed_max_badge_text_suffix), s.substring(0, v - 1), "…");
        }
        return s;
    }

    public void I0(@Px int v) {
        this.e.l0(v);
        this.Q0();
    }

    @Nullable
    private CharSequence J() {
        CharSequence charSequence0 = this.e.q();
        return charSequence0 != null ? charSequence0 : this.H();
    }

    public void J0(@Px int v) {
        if(v != this.e.m()) {
            this.e.U(v);
            this.Q0();
        }
    }

    private float K(View view0, float f) {
        return this.g - this.k + view0.getY() + f;
    }

    public void K0(boolean z) {
        this.e.m0(z);
        this.f0();
    }

    private int L() {
        int v = this.R() ? this.e.t() : this.e.u();
        if(this.e.k == 1) {
            v += (this.R() ? this.e.j : this.e.i);
        }
        return v + this.e.d();
    }

    private void L0(View view0) {
        class com.google.android.material.badge.a.a implements Runnable {
            final View a;
            final FrameLayout b;
            final a c;

            com.google.android.material.badge.a.a(View view0, FrameLayout frameLayout0) {
                this.a = view0;
                this.b = frameLayout0;
                super();
            }

            @Override
            public void run() {
                a.this.P0(this.a, this.b);
            }
        }

        ViewGroup viewGroup0 = (ViewGroup)view0.getParent();
        if(viewGroup0 != null && viewGroup0.getId() == id.mtrl_anchor_parent || this.m != null && this.m.get() == viewGroup0) {
            return;
        }
        a.M0(view0);
        FrameLayout frameLayout0 = new FrameLayout(view0.getContext());
        frameLayout0.setId(id.mtrl_anchor_parent);
        frameLayout0.setClipChildren(false);
        frameLayout0.setClipToPadding(false);
        frameLayout0.setLayoutParams(view0.getLayoutParams());
        frameLayout0.setMinimumWidth(view0.getWidth());
        frameLayout0.setMinimumHeight(view0.getHeight());
        int v = viewGroup0.indexOfChild(view0);
        viewGroup0.removeViewAt(v);
        view0.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout0.addView(view0);
        viewGroup0.addView(frameLayout0, v);
        this.m = new WeakReference(frameLayout0);
        frameLayout0.post(new com.google.android.material.badge.a.a(this, view0, frameLayout0));
    }

    private int M() {
        int v = this.e.E();
        if(this.R()) {
            v = this.e.D();
            Context context0 = (Context)this.a.get();
            if(context0 != null) {
                float f = com.google.android.material.animation.b.b(0.0f, 1.0f, 0.3f, 1.0f, d.f(context0) - 1.0f);
                v = com.google.android.material.animation.b.c(v, v - this.e.v(), f);
            }
        }
        if(this.e.k == 0) {
            v -= Math.round(this.k);
        }
        return v + this.e.e();
    }

    private static void M0(View view0) {
        ViewGroup viewGroup0 = (ViewGroup)view0.getParent();
        viewGroup0.setClipChildren(false);
        viewGroup0.setClipToPadding(false);
    }

    public int N() {
        return this.e.E();
    }

    public void N0(@NonNull View view0) {
        this.P0(view0, null);
    }

    @Px
    public int O() {
        return this.e.D();
    }

    @Deprecated
    public void O0(@NonNull View view0, @Nullable ViewGroup viewGroup0) {
        if(!(viewGroup0 instanceof FrameLayout)) {
            throw new IllegalArgumentException("customBadgeParent must be a FrameLayout");
        }
        this.P0(view0, ((FrameLayout)viewGroup0));
    }

    @Px
    public int P() {
        return this.e.E();
    }

    public void P0(@NonNull View view0, @Nullable FrameLayout frameLayout0) {
        this.l = new WeakReference(view0);
        boolean z = com.google.android.material.badge.d.a;
        if(!z || frameLayout0 != null) {
            this.m = new WeakReference(frameLayout0);
        }
        else {
            this.L0(view0);
        }
        if(!z) {
            a.M0(view0);
        }
        this.Q0();
        this.invalidateSelf();
    }

    @Px
    public int Q() {
        return this.e.m();
    }

    private void Q0() {
        Context context0 = (Context)this.a.get();
        ViewGroup viewGroup0 = null;
        View view0 = this.l == null ? null : ((View)this.l.get());
        if(context0 != null && view0 != null) {
            Rect rect0 = new Rect();
            rect0.set(this.d);
            Rect rect1 = new Rect();
            view0.getDrawingRect(rect1);
            WeakReference weakReference0 = this.m;
            if(weakReference0 != null) {
                viewGroup0 = (ViewGroup)weakReference0.get();
            }
            if(viewGroup0 != null || com.google.android.material.badge.d.a) {
                if(viewGroup0 == null) {
                    viewGroup0 = (ViewGroup)view0.getParent();
                }
                viewGroup0.offsetDescendantRectToMyCoords(view0, rect1);
            }
            this.c(rect1, view0);
            com.google.android.material.badge.d.o(this.d, this.f, this.g, this.j, this.k);
            float f = this.i;
            if(f != -1.0f) {
                this.b.l0(f);
            }
            if(!rect0.equals(this.d)) {
                this.b.setBounds(this.d);
            }
        }
    }

    // 去混淆评级： 低(20)
    private boolean R() {
        return this.T() || this.S();
    }

    private void R0() {
        if(this.A() != -2) {
            this.h = ((int)Math.pow(10.0, ((double)this.A()) - 1.0)) - 1;
            return;
        }
        this.h = this.B();
    }

    // 去混淆评级： 低(20)
    public boolean S() {
        return !this.e.G() && this.e.F();
    }

    public boolean T() {
        return this.e.G();
    }

    private boolean U() {
        FrameLayout frameLayout0 = this.s();
        return frameLayout0 != null && frameLayout0.getId() == id.mtrl_anchor_parent;
    }

    private void V() {
        int v = this.getAlpha();
        this.c.g().setAlpha(v);
        this.invalidateSelf();
    }

    private void W() {
        ColorStateList colorStateList0 = ColorStateList.valueOf(this.e.g());
        if(this.b.z() != colorStateList0) {
            this.b.p0(colorStateList0);
            this.invalidateSelf();
        }
    }

    private void X() {
        this.c.m(true);
        this.Z();
        this.Q0();
        this.invalidateSelf();
    }

    private void Y() {
        if(this.l != null && this.l.get() != null) {
            this.P0(((View)this.l.get()), (this.m == null ? null : ((FrameLayout)this.m.get())));
        }
    }

    private void Z() {
        Context context0 = (Context)this.a.get();
        if(context0 == null) {
            return;
        }
        int v = this.R() ? this.e.o() : this.e.k();
        this.b.setShapeAppearanceModel(p.b(context0, v, (this.R() ? this.e.n() : this.e.j())).m());
        this.invalidateSelf();
    }

    @Override  // com.google.android.material.internal.A$b
    @RestrictTo({Scope.b})
    public void a() {
        this.invalidateSelf();
    }

    private void a0() {
        Context context0 = (Context)this.a.get();
        if(context0 == null) {
            return;
        }
        com.google.android.material.resources.e e0 = new com.google.android.material.resources.e(context0, this.e.C());
        if(this.c.e() == e0) {
            return;
        }
        this.c.l(e0, context0);
        this.b0();
        this.Q0();
        this.invalidateSelf();
    }

    private void b(@NonNull View view0) {
        float f2;
        float f1;
        View view1 = this.s();
        if(view1 == null) {
            if(!(view0.getParent() instanceof View)) {
                return;
            }
            float f = view0.getY();
            f1 = view0.getX();
            view1 = (View)view0.getParent();
            f2 = f;
        }
        else if(this.U()) {
            if(!(view1.getParent() instanceof View)) {
                return;
            }
            f2 = view1.getY();
            f1 = view1.getX();
            view1 = (View)view1.getParent();
        }
        else {
            f2 = 0.0f;
            f1 = 0.0f;
        }
        float f3 = this.K(view1, f2);
        float f4 = this.z(view1, f1);
        float f5 = this.q(view1, f2);
        float f6 = this.F(view1, f1);
        if(f3 < 0.0f) {
            this.g += Math.abs(f3);
        }
        if(f4 < 0.0f) {
            this.f += Math.abs(f4);
        }
        if(f5 > 0.0f) {
            this.g -= Math.abs(f5);
        }
        if(f6 > 0.0f) {
            this.f -= Math.abs(f6);
        }
    }

    private void b0() {
        int v = this.e.l();
        this.c.g().setColor(v);
        this.invalidateSelf();
    }

    private void c(@NonNull Rect rect0, @NonNull View view0) {
        float f = this.R() ? this.e.d : this.e.c;
        this.i = f;
        if(f == -1.0f) {
            this.j = (float)Math.round((this.R() ? this.e.g : this.e.e) / 2.0f);
            this.k = (float)Math.round((this.R() ? this.e.h : this.e.f) / 2.0f);
        }
        else {
            this.j = f;
            this.k = f;
        }
        if(this.R()) {
            String s = this.m();
            this.j = Math.max(this.j, this.c.h(s) / 2.0f + ((float)this.e.i()));
            float f1 = Math.max(this.k, this.c.f(s) / 2.0f + ((float)this.e.m()));
            this.k = f1;
            this.j = Math.max(this.j, f1);
        }
        int v = this.M();
        switch(this.e.h()) {
            case 0x800053: 
            case 0x800055: {
                this.g = (float)(rect0.bottom - v);
                break;
            }
            default: {
                this.g = (float)(rect0.top + v);
            }
        }
        int v1 = this.L();
        switch(this.e.h()) {
            case 0x800033: 
            case 0x800053: {
                this.f = ViewCompat.e0(view0) == 0 ? ((float)rect0.left) - this.j + ((float)v1) : ((float)rect0.right) + this.j - ((float)v1);
                break;
            }
            default: {
                this.f = ViewCompat.e0(view0) == 0 ? ((float)rect0.right) + this.j - ((float)v1) : ((float)rect0.left) - this.j + ((float)v1);
            }
        }
        if(this.e.H()) {
            this.b(view0);
        }
    }

    private void c0() {
        this.R0();
        this.c.m(true);
        this.Q0();
        this.invalidateSelf();
    }

    public void d() {
        if(this.e.F()) {
            this.e.a();
            this.d0();
        }
    }

    private void d0() {
        if(!this.T()) {
            this.X();
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas0) {
        if(!this.getBounds().isEmpty() && this.getAlpha() != 0 && this.isVisible()) {
            this.b.draw(canvas0);
            if(this.R()) {
                this.i(canvas0);
            }
        }
    }

    public void e() {
        if(this.e.G()) {
            this.e.b();
            this.e0();
        }
    }

    private void e0() {
        this.X();
    }

    @NonNull
    public static a f(@NonNull Context context0) {
        return new a(context0, 0, a.t, a.s, null);
    }

    private void f0() {
        boolean z = this.e.I();
        this.setVisible(z, false);
        if(com.google.android.material.badge.d.a && this.s() != null && !z) {
            ((ViewGroup)this.s().getParent()).invalidate();
        }
    }

    @NonNull
    public static a g(@NonNull Context context0, @XmlRes int v) {
        return new a(context0, v, a.t, a.s, null);
    }

    private void g0() {
        this.Z();
        this.a0();
        this.c0();
        this.X();
        this.V();
        this.W();
        this.b0();
        this.Y();
        this.Q0();
        this.f0();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.e.f();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.d.height();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.d.width();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @NonNull
    static a h(@NonNull Context context0, @NonNull State badgeState$State0) {
        return new a(context0, 0, a.t, a.s, badgeState$State0);
    }

    void h0(int v) {
        this.e.K(v);
        this.Q0();
    }

    private void i(Canvas canvas0) {
        String s = this.m();
        if(s != null) {
            Rect rect0 = new Rect();
            this.c.g().getTextBounds(s, 0, s.length(), rect0);
            float f = this.g - rect0.exactCenterY();
            canvas0.drawText(s, this.f, ((float)(rect0.bottom > 0 ? Math.round(f) : ((int)f))), this.c.g());
        }
    }

    void i0(@Px int v) {
        this.e.L(v);
        this.Q0();
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    int j() {
        return this.e.d();
    }

    public void j0(boolean z) {
        if(this.e.H() == z) {
            return;
        }
        this.e.N(z);
        if(this.l != null && this.l.get() != null) {
            this.b(((View)this.l.get()));
        }
    }

    @Px
    int k() {
        return this.e.e();
    }

    public void k0(@ColorInt int v) {
        this.e.O(v);
        this.W();
    }

    @ColorInt
    public int l() {
        return this.b.z().getDefaultColor();
    }

    public void l0(int v) {
        if(v == 0x800053 || v == 0x800055) {
            Log.w("Badge", "Bottom badge gravities are deprecated; please use a top gravity instead.");
        }
        if(this.e.h() != v) {
            this.e.P(v);
            this.Y();
        }
    }

    @Nullable
    private String m() {
        if(this.T()) {
            return this.I();
        }
        return this.S() ? this.D() : null;
    }

    public void m0(@NonNull Locale locale0) {
        if(!locale0.equals(this.e.z())) {
            this.e.h0(locale0);
            this.invalidateSelf();
        }
    }

    public int n() {
        return this.e.h();
    }

    public void n0(@ColorInt int v) {
        if(this.c.g().getColor() != v) {
            this.e.T(v);
            this.b0();
        }
    }

    @NonNull
    public Locale o() {
        return this.e.z();
    }

    public void o0(@StyleRes int v) {
        this.e.W(v);
        this.Z();
    }

    @Override  // android.graphics.drawable.Drawable, com.google.android.material.internal.A$b
    public boolean onStateChange(int[] arr_v) {
        return super.onStateChange(arr_v);
    }

    @ColorInt
    public int p() {
        return this.c.g().getColor();
    }

    public void p0(@StyleRes int v) {
        this.e.V(v);
        this.Z();
    }

    private float q(View view0, float f) {
        if(view0.getParent() instanceof View) {
            View view1 = (View)view0.getParent();
            return this.g + this.k - (((float)view1.getHeight()) - view0.getY()) + f;
        }
        return 0.0f;
    }

    public void q0(@StyleRes int v) {
        this.e.S(v);
        this.Z();
    }

    @Nullable
    public CharSequence r() {
        if(!this.isVisible()) {
            return null;
        }
        if(this.T()) {
            return this.J();
        }
        return this.S() ? this.E() : this.t();
    }

    public void r0(@StyleRes int v) {
        this.e.R(v);
        this.Z();
    }

    @Nullable
    public FrameLayout s() {
        return this.m == null ? null : ((FrameLayout)this.m.get());
    }

    public void s0(@StringRes int v) {
        this.e.X(v);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAlpha(int v) {
        this.e.M(v);
        this.V();
    }

    @Override  // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter0) {
    }

    private CharSequence t() {
        return this.e.r();
    }

    public void t0(@Nullable CharSequence charSequence0) {
        this.e.Y(charSequence0);
    }

    public int u() {
        return this.e.u();
    }

    public void u0(CharSequence charSequence0) {
        this.e.Z(charSequence0);
    }

    @Px
    public int v() {
        return this.e.t();
    }

    public void v0(@PluralsRes int v) {
        this.e.a0(v);
    }

    @Px
    public int w() {
        return this.e.u();
    }

    public void w0(int v) {
        this.y0(v);
        this.x0(v);
    }

    @Px
    public int x() {
        return this.e.i();
    }

    public void x0(@Px int v) {
        this.e.b0(v);
        this.Q0();
    }

    @Px
    public int y() {
        return this.e.v();
    }

    public void y0(@Px int v) {
        this.e.c0(v);
        this.Q0();
    }

    private float z(View view0, float f) {
        return this.f - this.j + view0.getX() + f;
    }

    public void z0(@Px int v) {
        if(v != this.e.i()) {
            this.e.Q(v);
            this.Q0();
        }
    }
}

