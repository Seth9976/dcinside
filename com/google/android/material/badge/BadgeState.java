package com.google.android.material.badge;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.PluralsRes;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.StyleableRes;
import androidx.annotation.XmlRes;
import com.google.android.material.R.dimen;
import com.google.android.material.R.plurals;
import com.google.android.material.R.string;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.drawable.f;
import com.google.android.material.internal.D;
import com.google.android.material.resources.d;
import com.google.android.material.resources.e;
import java.util.Locale.Category;
import java.util.Locale;

@RestrictTo({Scope.b})
public final class BadgeState {
    public static final class State implements Parcelable {
        class a implements Parcelable.Creator {
            a() {
                super();
            }

            @NonNull
            public State a(@NonNull Parcel parcel0) {
                return new State(parcel0);
            }

            @NonNull
            public State[] b(int v) {
                return new State[v];
            }

            @Override  // android.os.Parcelable$Creator
            @NonNull
            public Object createFromParcel(@NonNull Parcel parcel0) {
                return this.a(parcel0);
            }

            @Override  // android.os.Parcelable$Creator
            @NonNull
            public Object[] newArray(int v) {
                return this.b(v);
            }
        }

        @Dimension(unit = 1)
        private Integer A;
        @Dimension(unit = 1)
        private Integer B;
        @Dimension(unit = 1)
        private Integer C;
        public static final Parcelable.Creator CREATOR = null;
        private Boolean D;
        private static final int E = -1;
        private static final int F = -2;
        @XmlRes
        private int a;
        @ColorInt
        private Integer b;
        @ColorInt
        private Integer c;
        @StyleRes
        private Integer d;
        @StyleRes
        private Integer e;
        @StyleRes
        private Integer f;
        @StyleRes
        private Integer g;
        @StyleRes
        private Integer h;
        private int i;
        @Nullable
        private String j;
        private int k;
        private int l;
        private int m;
        private Locale n;
        @Nullable
        private CharSequence o;
        @Nullable
        private CharSequence p;
        @PluralsRes
        private int q;
        @StringRes
        private int r;
        private Integer s;
        private Boolean t;
        @Px
        private Integer u;
        @Px
        private Integer v;
        @Dimension(unit = 1)
        private Integer w;
        @Dimension(unit = 1)
        private Integer x;
        @Dimension(unit = 1)
        private Integer y;
        @Dimension(unit = 1)
        private Integer z;

        static {
            State.CREATOR = new a();
        }

        public State() {
            this.i = 0xFF;
            this.k = -2;
            this.l = -2;
            this.m = -2;
            this.t = Boolean.TRUE;
        }

        State(@NonNull Parcel parcel0) {
            this.i = 0xFF;
            this.k = -2;
            this.l = -2;
            this.m = -2;
            this.t = Boolean.TRUE;
            this.a = parcel0.readInt();
            this.b = (Integer)parcel0.readSerializable();
            this.c = (Integer)parcel0.readSerializable();
            this.d = (Integer)parcel0.readSerializable();
            this.e = (Integer)parcel0.readSerializable();
            this.f = (Integer)parcel0.readSerializable();
            this.g = (Integer)parcel0.readSerializable();
            this.h = (Integer)parcel0.readSerializable();
            this.i = parcel0.readInt();
            this.j = parcel0.readString();
            this.k = parcel0.readInt();
            this.l = parcel0.readInt();
            this.m = parcel0.readInt();
            this.o = parcel0.readString();
            this.p = parcel0.readString();
            this.q = parcel0.readInt();
            this.s = (Integer)parcel0.readSerializable();
            this.u = (Integer)parcel0.readSerializable();
            this.v = (Integer)parcel0.readSerializable();
            this.w = (Integer)parcel0.readSerializable();
            this.x = (Integer)parcel0.readSerializable();
            this.y = (Integer)parcel0.readSerializable();
            this.z = (Integer)parcel0.readSerializable();
            this.C = (Integer)parcel0.readSerializable();
            this.A = (Integer)parcel0.readSerializable();
            this.B = (Integer)parcel0.readSerializable();
            this.t = (Boolean)parcel0.readSerializable();
            this.n = (Locale)parcel0.readSerializable();
            this.D = (Boolean)parcel0.readSerializable();
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel0, int v) {
            parcel0.writeInt(this.a);
            parcel0.writeSerializable(this.b);
            parcel0.writeSerializable(this.c);
            parcel0.writeSerializable(this.d);
            parcel0.writeSerializable(this.e);
            parcel0.writeSerializable(this.f);
            parcel0.writeSerializable(this.g);
            parcel0.writeSerializable(this.h);
            parcel0.writeInt(this.i);
            parcel0.writeString(this.j);
            parcel0.writeInt(this.k);
            parcel0.writeInt(this.l);
            parcel0.writeInt(this.m);
            String s = null;
            parcel0.writeString((this.o == null ? null : this.o.toString()));
            CharSequence charSequence0 = this.p;
            if(charSequence0 != null) {
                s = charSequence0.toString();
            }
            parcel0.writeString(s);
            parcel0.writeInt(this.q);
            parcel0.writeSerializable(this.s);
            parcel0.writeSerializable(this.u);
            parcel0.writeSerializable(this.v);
            parcel0.writeSerializable(this.w);
            parcel0.writeSerializable(this.x);
            parcel0.writeSerializable(this.y);
            parcel0.writeSerializable(this.z);
            parcel0.writeSerializable(this.C);
            parcel0.writeSerializable(this.A);
            parcel0.writeSerializable(this.B);
            parcel0.writeSerializable(this.t);
            parcel0.writeSerializable(this.n);
            parcel0.writeSerializable(this.D);
        }
    }

    private final State a;
    private final State b;
    final float c;
    final float d;
    final float e;
    final float f;
    final float g;
    final float h;
    final int i;
    final int j;
    int k;
    private static final String l = "badge";

    BadgeState(Context context0, @XmlRes int v, @AttrRes int v1, @StyleRes int v2, @Nullable State badgeState$State0) {
        int v6;
        int v4;
        State badgeState$State1 = new State();
        this.b = badgeState$State1;
        if(badgeState$State0 == null) {
            badgeState$State0 = new State();
        }
        if(v != 0) {
            badgeState$State0.a = v;
        }
        TypedArray typedArray0 = this.c(context0, badgeState$State0.a, v1, v2);
        Resources resources0 = context0.getResources();
        this.c = (float)typedArray0.getDimensionPixelSize(styleable.Badge_badgeRadius, -1);
        this.i = context0.getResources().getDimensionPixelSize(dimen.mtrl_badge_horizontal_edge_offset);
        this.j = context0.getResources().getDimensionPixelSize(dimen.mtrl_badge_text_horizontal_edge_offset);
        this.d = (float)typedArray0.getDimensionPixelSize(styleable.Badge_badgeWithTextRadius, -1);
        float f = resources0.getDimension(dimen.m3_badge_size);
        this.e = typedArray0.getDimension(styleable.Badge_badgeWidth, f);
        float f1 = resources0.getDimension(dimen.m3_badge_with_text_size);
        this.g = typedArray0.getDimension(styleable.Badge_badgeWithTextWidth, f1);
        float f2 = resources0.getDimension(dimen.m3_badge_size);
        this.f = typedArray0.getDimension(styleable.Badge_badgeHeight, f2);
        float f3 = resources0.getDimension(dimen.m3_badge_with_text_size);
        this.h = typedArray0.getDimension(styleable.Badge_badgeWithTextHeight, f3);
        boolean z = true;
        this.k = typedArray0.getInt(styleable.Badge_offsetAlignmentMode, 1);
        badgeState$State1.i = badgeState$State0.i == -2 ? 0xFF : badgeState$State0.i;
        if(badgeState$State0.k != -2) {
            badgeState$State1.k = badgeState$State0.k;
        }
        else if(typedArray0.hasValue(styleable.Badge_number)) {
            badgeState$State1.k = typedArray0.getInt(23, 0);
        }
        else {
            badgeState$State1.k = -1;
        }
        if(badgeState$State0.j != null) {
            badgeState$State1.j = badgeState$State0.j;
        }
        else if(typedArray0.hasValue(styleable.Badge_badgeText)) {
            badgeState$State1.j = typedArray0.getString(7);
        }
        badgeState$State1.o = badgeState$State0.o;
        CharSequence charSequence0 = badgeState$State0.p == null ? context0.getString(string.mtrl_badge_numberless_content_description) : badgeState$State0.p;
        badgeState$State1.p = charSequence0;
        badgeState$State1.q = badgeState$State0.q == 0 ? plurals.mtrl_badge_content_description : badgeState$State0.q;
        badgeState$State1.r = badgeState$State0.r == 0 ? string.mtrl_exceed_max_badge_number_content_description : badgeState$State0.r;
        if(badgeState$State0.t != null && !badgeState$State0.t.booleanValue()) {
            z = false;
        }
        badgeState$State1.t = Boolean.valueOf(z);
        badgeState$State1.l = badgeState$State0.l == -2 ? typedArray0.getInt(styleable.Badge_maxCharacterCount, -2) : badgeState$State0.l;
        badgeState$State1.m = badgeState$State0.m == -2 ? typedArray0.getInt(styleable.Badge_maxNumber, -2) : badgeState$State0.m;
        badgeState$State1.e = (int)(badgeState$State0.e == null ? typedArray0.getResourceId(styleable.Badge_badgeShapeAppearance, style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : ((int)badgeState$State0.e));
        badgeState$State1.f = (int)(badgeState$State0.f == null ? typedArray0.getResourceId(styleable.Badge_badgeShapeAppearanceOverlay, 0) : ((int)badgeState$State0.f));
        badgeState$State1.g = (int)(badgeState$State0.g == null ? typedArray0.getResourceId(styleable.Badge_badgeWithTextShapeAppearance, style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : ((int)badgeState$State0.g));
        badgeState$State1.h = (int)(badgeState$State0.h == null ? typedArray0.getResourceId(styleable.Badge_badgeWithTextShapeAppearanceOverlay, 0) : ((int)badgeState$State0.h));
        badgeState$State1.b = (int)(badgeState$State0.b == null ? BadgeState.J(context0, typedArray0, styleable.Badge_backgroundColor) : ((int)badgeState$State0.b));
        badgeState$State1.d = (int)(badgeState$State0.d == null ? typedArray0.getResourceId(styleable.Badge_badgeTextAppearance, style.TextAppearance_MaterialComponents_Badge) : ((int)badgeState$State0.d));
        if(badgeState$State0.c != null) {
            badgeState$State1.c = badgeState$State0.c;
        }
        else if(typedArray0.hasValue(styleable.Badge_badgeTextColor)) {
            badgeState$State1.c = BadgeState.J(context0, typedArray0, 9);
        }
        else {
            badgeState$State1.c = new e(context0, ((int)badgeState$State1.d)).i().getDefaultColor();
        }
        badgeState$State1.s = (int)(badgeState$State0.s == null ? typedArray0.getInt(styleable.Badge_badgeGravity, 0x800035) : ((int)badgeState$State0.s));
        if(badgeState$State0.u == null) {
            int v3 = resources0.getDimensionPixelSize(dimen.mtrl_badge_long_text_horizontal_padding);
            v4 = typedArray0.getDimensionPixelSize(styleable.Badge_badgeWidePadding, v3);
        }
        else {
            v4 = (int)badgeState$State0.u;
        }
        badgeState$State1.u = v4;
        if(badgeState$State0.v == null) {
            int v5 = resources0.getDimensionPixelSize(dimen.m3_badge_with_text_vertical_padding);
            v6 = typedArray0.getDimensionPixelSize(styleable.Badge_badgeVerticalPadding, v5);
        }
        else {
            v6 = (int)badgeState$State0.v;
        }
        badgeState$State1.v = v6;
        badgeState$State1.w = (int)(badgeState$State0.w == null ? typedArray0.getDimensionPixelOffset(styleable.Badge_horizontalOffset, 0) : ((int)badgeState$State0.w));
        badgeState$State1.x = (int)(badgeState$State0.x == null ? typedArray0.getDimensionPixelOffset(styleable.Badge_verticalOffset, 0) : ((int)badgeState$State0.x));
        badgeState$State1.y = (int)(badgeState$State0.y == null ? typedArray0.getDimensionPixelOffset(styleable.Badge_horizontalOffsetWithText, ((int)badgeState$State1.w)) : ((int)badgeState$State0.y));
        badgeState$State1.z = (int)(badgeState$State0.z == null ? typedArray0.getDimensionPixelOffset(styleable.Badge_verticalOffsetWithText, ((int)badgeState$State1.x)) : ((int)badgeState$State0.z));
        badgeState$State1.C = (int)(badgeState$State0.C == null ? typedArray0.getDimensionPixelOffset(styleable.Badge_largeFontVerticalOffsetAdjustment, 0) : ((int)badgeState$State0.C));
        badgeState$State1.A = (int)(badgeState$State0.A == null ? 0 : ((int)badgeState$State0.A));
        badgeState$State1.B = (int)(badgeState$State0.B == null ? 0 : ((int)badgeState$State0.B));
        badgeState$State1.D = Boolean.valueOf((badgeState$State0.D == null ? typedArray0.getBoolean(styleable.Badge_autoAdjustToWithinGrandparentBounds, false) : badgeState$State0.D.booleanValue()));
        typedArray0.recycle();
        if(badgeState$State0.n == null) {
            badgeState$State1.n = Build.VERSION.SDK_INT < 24 ? Locale.getDefault() : Locale.getDefault(Locale.Category.FORMAT);
        }
        else {
            badgeState$State1.n = badgeState$State0.n;
        }
        this.a = badgeState$State0;
    }

    State A() {
        return this.a;
    }

    String B() {
        return this.b.j;
    }

    @StyleRes
    int C() {
        return (int)this.b.d;
    }

    @Dimension(unit = 1)
    int D() {
        return (int)this.b.z;
    }

    @Dimension(unit = 1)
    int E() {
        return (int)this.b.x;
    }

    boolean F() {
        return this.b.k != -1;
    }

    boolean G() {
        return this.b.j != null;
    }

    boolean H() {
        return this.b.D.booleanValue();
    }

    boolean I() {
        return this.b.t.booleanValue();
    }

    private static int J(Context context0, @NonNull TypedArray typedArray0, @StyleableRes int v) {
        return d.a(context0, typedArray0, v).getDefaultColor();
    }

    void K(@Dimension(unit = 1) int v) {
        this.a.A = v;
        this.b.A = v;
    }

    void L(@Dimension(unit = 1) int v) {
        this.a.B = v;
        this.b.B = v;
    }

    void M(int v) {
        this.a.i = v;
        this.b.i = v;
    }

    void N(boolean z) {
        this.a.D = Boolean.valueOf(z);
        this.b.D = Boolean.valueOf(z);
    }

    void O(@ColorInt int v) {
        this.a.b = v;
        this.b.b = v;
    }

    void P(int v) {
        this.a.s = v;
        this.b.s = v;
    }

    void Q(@Px int v) {
        this.a.u = v;
        this.b.u = v;
    }

    void R(int v) {
        this.a.f = v;
        this.b.f = v;
    }

    void S(int v) {
        this.a.e = v;
        this.b.e = v;
    }

    void T(@ColorInt int v) {
        this.a.c = v;
        this.b.c = v;
    }

    void U(@Px int v) {
        this.a.v = v;
        this.b.v = v;
    }

    void V(int v) {
        this.a.h = v;
        this.b.h = v;
    }

    void W(int v) {
        this.a.g = v;
        this.b.g = v;
    }

    void X(@StringRes int v) {
        this.a.r = v;
        this.b.r = v;
    }

    void Y(CharSequence charSequence0) {
        this.a.o = charSequence0;
        this.b.o = charSequence0;
    }

    void Z(CharSequence charSequence0) {
        this.a.p = charSequence0;
        this.b.p = charSequence0;
    }

    void a() {
        this.g0(-1);
    }

    void a0(@PluralsRes int v) {
        this.a.q = v;
        this.b.q = v;
    }

    void b() {
        this.i0(null);
    }

    void b0(@Dimension(unit = 1) int v) {
        this.a.y = v;
        this.b.y = v;
    }

    private TypedArray c(Context context0, @XmlRes int v, @AttrRes int v1, @StyleRes int v2) {
        if(v != 0) {
            AttributeSet attributeSet0 = f.k(context0, v, "badge");
            int v3 = attributeSet0.getStyleAttribute();
            return v3 == 0 ? D.k(context0, attributeSet0, styleable.Badge, v1, v2, new int[0]) : D.k(context0, attributeSet0, styleable.Badge, v1, v3, new int[0]);
        }
        return D.k(context0, null, styleable.Badge, v1, v2, new int[0]);
    }

    void c0(@Dimension(unit = 1) int v) {
        this.a.w = v;
        this.b.w = v;
    }

    @Dimension(unit = 1)
    int d() {
        return (int)this.b.A;
    }

    void d0(@Dimension(unit = 1) int v) {
        this.a.C = v;
        this.b.C = v;
    }

    @Dimension(unit = 1)
    int e() {
        return (int)this.b.B;
    }

    void e0(int v) {
        this.a.l = v;
        this.b.l = v;
    }

    int f() {
        return this.b.i;
    }

    void f0(int v) {
        this.a.m = v;
        this.b.m = v;
    }

    @ColorInt
    int g() {
        return (int)this.b.b;
    }

    void g0(int v) {
        this.a.k = v;
        this.b.k = v;
    }

    int h() {
        return (int)this.b.s;
    }

    void h0(Locale locale0) {
        this.a.n = locale0;
        this.b.n = locale0;
    }

    @Px
    int i() {
        return (int)this.b.u;
    }

    void i0(String s) {
        this.a.j = s;
        this.b.j = s;
    }

    int j() {
        return (int)this.b.f;
    }

    void j0(@StyleRes int v) {
        this.a.d = v;
        this.b.d = v;
    }

    int k() {
        return (int)this.b.e;
    }

    void k0(@Dimension(unit = 1) int v) {
        this.a.z = v;
        this.b.z = v;
    }

    @ColorInt
    int l() {
        return (int)this.b.c;
    }

    void l0(@Dimension(unit = 1) int v) {
        this.a.x = v;
        this.b.x = v;
    }

    @Px
    int m() {
        return (int)this.b.v;
    }

    void m0(boolean z) {
        this.a.t = Boolean.valueOf(z);
        this.b.t = Boolean.valueOf(z);
    }

    int n() {
        return (int)this.b.h;
    }

    int o() {
        return (int)this.b.g;
    }

    @StringRes
    int p() {
        return this.b.r;
    }

    CharSequence q() {
        return this.b.o;
    }

    CharSequence r() {
        return this.b.p;
    }

    @PluralsRes
    int s() {
        return this.b.q;
    }

    @Dimension(unit = 1)
    int t() {
        return (int)this.b.y;
    }

    @Dimension(unit = 1)
    int u() {
        return (int)this.b.w;
    }

    @Dimension(unit = 1)
    int v() {
        return (int)this.b.C;
    }

    int w() {
        return this.b.l;
    }

    int x() {
        return this.b.m;
    }

    int y() {
        return this.b.k;
    }

    Locale z() {
        return this.b.n;
    }
}

