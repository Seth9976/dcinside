package androidx.media3.common.text;

import O1.a;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.Layout.Alignment;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import com.google.common.base.B;
import java.io.ByteArrayOutputStream;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import w4.d;

public final class Cue {
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    public @interface AnchorType {
    }

    @UnstableApi
    public static final class Builder {
        @Nullable
        private CharSequence a;
        @Nullable
        private Bitmap b;
        @Nullable
        private Layout.Alignment c;
        @Nullable
        private Layout.Alignment d;
        private float e;
        private int f;
        private int g;
        private float h;
        private int i;
        private int j;
        private float k;
        private float l;
        private float m;
        private boolean n;
        @ColorInt
        private int o;
        private int p;
        private float q;

        public Builder() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = -3.402823E+38f;
            this.f = 0x80000000;
            this.g = 0x80000000;
            this.h = -3.402823E+38f;
            this.i = 0x80000000;
            this.j = 0x80000000;
            this.k = -3.402823E+38f;
            this.l = -3.402823E+38f;
            this.m = -3.402823E+38f;
            this.n = false;
            this.o = 0xFF000000;
            this.p = 0x80000000;
        }

        private Builder(Cue cue0) {
            this.a = cue0.a;
            this.b = cue0.d;
            this.c = cue0.b;
            this.d = cue0.c;
            this.e = cue0.e;
            this.f = cue0.f;
            this.g = cue0.g;
            this.h = cue0.h;
            this.i = cue0.i;
            this.j = cue0.n;
            this.k = cue0.o;
            this.l = cue0.j;
            this.m = cue0.k;
            this.n = cue0.l;
            this.o = cue0.m;
            this.p = cue0.p;
            this.q = cue0.q;
        }

        Builder(Cue cue0, androidx.media3.common.text.Cue.1 cue$10) {
            this(cue0);
        }

        @a
        public Builder A(CharSequence charSequence0) {
            this.a = charSequence0;
            return this;
        }

        @a
        public Builder B(@Nullable Layout.Alignment layout$Alignment0) {
            this.c = layout$Alignment0;
            return this;
        }

        @a
        public Builder C(float f, int v) {
            this.k = f;
            this.j = v;
            return this;
        }

        @a
        public Builder D(int v) {
            this.p = v;
            return this;
        }

        @a
        public Builder E(@ColorInt int v) {
            this.o = v;
            this.n = true;
            return this;
        }

        public Cue a() {
            return new Cue(this.a, this.c, this.d, this.b, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, null);
        }

        @a
        public Builder b() {
            this.n = false;
            return this;
        }

        @Nullable
        @d
        public Bitmap c() {
            return this.b;
        }

        @d
        public float d() {
            return this.m;
        }

        @d
        public float e() {
            return this.e;
        }

        @d
        public int f() {
            return this.g;
        }

        @d
        public int g() {
            return this.f;
        }

        @d
        public float h() {
            return this.h;
        }

        @d
        public int i() {
            return this.i;
        }

        @d
        public float j() {
            return this.l;
        }

        @Nullable
        @d
        public CharSequence k() {
            return this.a;
        }

        @Nullable
        @d
        public Layout.Alignment l() {
            return this.c;
        }

        @d
        public float m() {
            return this.k;
        }

        @d
        public int n() {
            return this.j;
        }

        @d
        public int o() {
            return this.p;
        }

        @ColorInt
        @d
        public int p() {
            return this.o;
        }

        public boolean q() {
            return this.n;
        }

        @a
        public Builder r(Bitmap bitmap0) {
            this.b = bitmap0;
            return this;
        }

        @a
        public Builder s(float f) {
            this.m = f;
            return this;
        }

        @a
        public Builder t(float f, int v) {
            this.e = f;
            this.f = v;
            return this;
        }

        @a
        public Builder u(int v) {
            this.g = v;
            return this;
        }

        @a
        public Builder v(@Nullable Layout.Alignment layout$Alignment0) {
            this.d = layout$Alignment0;
            return this;
        }

        @a
        public Builder w(float f) {
            this.h = f;
            return this;
        }

        @a
        public Builder x(int v) {
            this.i = v;
            return this;
        }

        @a
        public Builder y(float f) {
            this.q = f;
            return this;
        }

        @a
        public Builder z(float f) {
            this.l = f;
            return this;
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    public @interface LineType {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    public @interface TextSizeType {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    public @interface VerticalType {
    }

    public static final int A = 1;
    public static final int B = 2;
    public static final int C = 1;
    public static final int D = 2;
    private static final String E = null;
    private static final String F = null;
    private static final String G = null;
    private static final String H = null;
    private static final String I = null;
    private static final String J = null;
    private static final String K = null;
    private static final String L = null;
    private static final String M = null;
    private static final String N = null;
    private static final String O = null;
    private static final String P = null;
    private static final String Q = null;
    private static final String R = null;
    private static final String S = null;
    private static final String T = null;
    private static final String U = null;
    private static final String V = null;
    private static final String W = null;
    @Nullable
    public final CharSequence a;
    @Nullable
    public final Layout.Alignment b;
    @Nullable
    public final Layout.Alignment c;
    @Nullable
    public final Bitmap d;
    public final float e;
    public final int f;
    public final int g;
    public final float h;
    public final int i;
    public final float j;
    public final float k;
    public final boolean l;
    public final int m;
    public final int n;
    public final float o;
    public final int p;
    public final float q;
    @Deprecated
    public static final Cue r = null;
    public static final float s = -3.402823E+38f;
    public static final int t = 0x80000000;
    public static final int u = 0;
    public static final int v = 1;
    public static final int w = 2;
    public static final int x = 0;
    public static final int y = 1;
    public static final int z;

    static {
        Cue.r = new Builder().A("").a();
        Cue.E = "0";
        Cue.F = "h";
        Cue.G = "1";
        Cue.H = "2";
        Cue.I = "3";
        Cue.J = "i";
        Cue.K = "4";
        Cue.L = "5";
        Cue.M = "6";
        Cue.N = "7";
        Cue.O = "8";
        Cue.P = "9";
        Cue.Q = "a";
        Cue.R = "b";
        Cue.S = "c";
        Cue.T = "d";
        Cue.U = "e";
        Cue.V = "f";
        Cue.W = "g";
    }

    private Cue(@Nullable CharSequence charSequence0, @Nullable Layout.Alignment layout$Alignment0, @Nullable Layout.Alignment layout$Alignment1, @Nullable Bitmap bitmap0, float f, int v, int v1, float f1, int v2, int v3, float f2, float f3, float f4, boolean z, int v4, int v5, float f5) {
        if(charSequence0 == null) {
            Assertions.g(bitmap0);
        }
        else {
            Assertions.a(bitmap0 == null);
        }
        if(charSequence0 instanceof Spanned) {
            this.a = SpannedString.valueOf(charSequence0);
        }
        else if(charSequence0 == null) {
            this.a = null;
        }
        else {
            this.a = charSequence0.toString();
        }
        this.b = layout$Alignment0;
        this.c = layout$Alignment1;
        this.d = bitmap0;
        this.e = f;
        this.f = v;
        this.g = v1;
        this.h = f1;
        this.i = v2;
        this.j = f3;
        this.k = f4;
        this.l = z;
        this.m = v4;
        this.n = v3;
        this.o = f2;
        this.p = v5;
        this.q = f5;
    }

    Cue(CharSequence charSequence0, Layout.Alignment layout$Alignment0, Layout.Alignment layout$Alignment1, Bitmap bitmap0, float f, int v, int v1, float f1, int v2, int v3, float f2, float f3, float f4, boolean z, int v4, int v5, float f5, androidx.media3.common.text.Cue.1 cue$10) {
        this(charSequence0, layout$Alignment0, layout$Alignment1, bitmap0, f, v, v1, f1, v2, v3, f2, f3, f4, z, v4, v5, f5);
    }

    @UnstableApi
    public Builder a() {
        return new Builder(this, null);
    }

    @UnstableApi
    public static Cue b(Bundle bundle0) {
        Builder cue$Builder0 = new Builder();
        CharSequence charSequence0 = bundle0.getCharSequence(Cue.E);
        if(charSequence0 != null) {
            cue$Builder0.A(charSequence0);
            ArrayList arrayList0 = bundle0.getParcelableArrayList(Cue.F);
            if(arrayList0 != null) {
                SpannableString spannableString0 = SpannableString.valueOf(charSequence0);
                for(Object object0: arrayList0) {
                    CustomSpanBundler.c(((Bundle)object0), spannableString0);
                }
                cue$Builder0.A(spannableString0);
            }
        }
        Layout.Alignment layout$Alignment0 = (Layout.Alignment)bundle0.getSerializable(Cue.G);
        if(layout$Alignment0 != null) {
            cue$Builder0.B(layout$Alignment0);
        }
        Layout.Alignment layout$Alignment1 = (Layout.Alignment)bundle0.getSerializable(Cue.H);
        if(layout$Alignment1 != null) {
            cue$Builder0.v(layout$Alignment1);
        }
        Bitmap bitmap0 = (Bitmap)bundle0.getParcelable(Cue.I);
        if(bitmap0 == null) {
            byte[] arr_b = bundle0.getByteArray(Cue.J);
            if(arr_b != null) {
                cue$Builder0.r(BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length));
            }
        }
        else {
            cue$Builder0.r(bitmap0);
        }
        String s = Cue.K;
        if(bundle0.containsKey(s)) {
            String s1 = Cue.L;
            if(bundle0.containsKey(s1)) {
                cue$Builder0.t(bundle0.getFloat(s), bundle0.getInt(s1));
            }
        }
        String s2 = Cue.M;
        if(bundle0.containsKey(s2)) {
            cue$Builder0.u(bundle0.getInt(s2));
        }
        String s3 = Cue.N;
        if(bundle0.containsKey(s3)) {
            cue$Builder0.w(bundle0.getFloat(s3));
        }
        String s4 = Cue.O;
        if(bundle0.containsKey(s4)) {
            cue$Builder0.x(bundle0.getInt(s4));
        }
        String s5 = Cue.Q;
        if(bundle0.containsKey(s5)) {
            String s6 = Cue.P;
            if(bundle0.containsKey(s6)) {
                cue$Builder0.C(bundle0.getFloat(s5), bundle0.getInt(s6));
            }
        }
        String s7 = Cue.R;
        if(bundle0.containsKey(s7)) {
            cue$Builder0.z(bundle0.getFloat(s7));
        }
        String s8 = Cue.S;
        if(bundle0.containsKey(s8)) {
            cue$Builder0.s(bundle0.getFloat(s8));
        }
        String s9 = Cue.T;
        if(bundle0.containsKey(s9)) {
            cue$Builder0.E(bundle0.getInt(s9));
        }
        if(!bundle0.getBoolean(Cue.U, false)) {
            cue$Builder0.b();
        }
        String s10 = Cue.V;
        if(bundle0.containsKey(s10)) {
            cue$Builder0.D(bundle0.getInt(s10));
        }
        String s11 = Cue.W;
        if(bundle0.containsKey(s11)) {
            cue$Builder0.y(bundle0.getFloat(s11));
        }
        return cue$Builder0.a();
    }

    @UnstableApi
    public Bundle c() {
        Bundle bundle0 = this.e();
        Bitmap bitmap0 = this.d;
        if(bitmap0 != null) {
            bundle0.putParcelable(Cue.I, bitmap0);
        }
        return bundle0;
    }

    @UnstableApi
    @Deprecated
    public Bundle d() {
        return this.c();
    }

    private Bundle e() {
        Bundle bundle0 = new Bundle();
        CharSequence charSequence0 = this.a;
        if(charSequence0 != null) {
            bundle0.putCharSequence(Cue.E, charSequence0);
            CharSequence charSequence1 = this.a;
            if(charSequence1 instanceof Spanned) {
                ArrayList arrayList0 = CustomSpanBundler.a(((Spanned)charSequence1));
                if(!arrayList0.isEmpty()) {
                    bundle0.putParcelableArrayList(Cue.F, arrayList0);
                }
            }
        }
        bundle0.putSerializable(Cue.G, this.b);
        bundle0.putSerializable(Cue.H, this.c);
        bundle0.putFloat(Cue.K, this.e);
        bundle0.putInt(Cue.L, this.f);
        bundle0.putInt(Cue.M, this.g);
        bundle0.putFloat(Cue.N, this.h);
        bundle0.putInt(Cue.O, this.i);
        bundle0.putInt(Cue.P, this.n);
        bundle0.putFloat(Cue.Q, this.o);
        bundle0.putFloat(Cue.R, this.j);
        bundle0.putFloat(Cue.S, this.k);
        bundle0.putBoolean(Cue.U, this.l);
        bundle0.putInt(Cue.T, this.m);
        bundle0.putInt(Cue.V, this.p);
        bundle0.putFloat(Cue.W, this.q);
        return bundle0;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(Cue.class == class0 && (TextUtils.equals(this.a, ((Cue)object0).a) && this.b == ((Cue)object0).b && this.c == ((Cue)object0).c)) {
                Bitmap bitmap0 = this.d;
                if(bitmap0 == null) {
                    return ((Cue)object0).d == null ? this.e == ((Cue)object0).e && this.f == ((Cue)object0).f && this.g == ((Cue)object0).g && this.h == ((Cue)object0).h && this.i == ((Cue)object0).i && this.j == ((Cue)object0).j && this.k == ((Cue)object0).k && this.l == ((Cue)object0).l && this.m == ((Cue)object0).m && this.n == ((Cue)object0).n && this.o == ((Cue)object0).o && this.p == ((Cue)object0).p && this.q == ((Cue)object0).q : false;
                }
                Bitmap bitmap1 = ((Cue)object0).d;
                return bitmap1 == null || !bitmap0.sameAs(bitmap1) ? false : this.e == ((Cue)object0).e && this.f == ((Cue)object0).f && this.g == ((Cue)object0).g && this.h == ((Cue)object0).h && this.i == ((Cue)object0).i && this.j == ((Cue)object0).j && this.k == ((Cue)object0).k && this.l == ((Cue)object0).l && this.m == ((Cue)object0).m && this.n == ((Cue)object0).n && this.o == ((Cue)object0).o && this.p == ((Cue)object0).p && this.q == ((Cue)object0).q;
            }
            return false;
        }
        return false;
    }

    @UnstableApi
    public Bundle f() {
        Bundle bundle0 = this.e();
        if(this.d != null) {
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            Assertions.i(this.d.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream0));
            byte[] arr_b = byteArrayOutputStream0.toByteArray();
            bundle0.putByteArray(Cue.J, arr_b);
        }
        return bundle0;
    }

    @Override
    public int hashCode() {
        return B.b(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, Boolean.valueOf(this.l), this.m, this.n, this.o, this.p, this.q});
    }

    class androidx.media3.common.text.Cue.1 {
    }

}

