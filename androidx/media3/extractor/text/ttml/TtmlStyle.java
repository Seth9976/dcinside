package androidx.media3.extractor.text.ttml;

import O1.a;
import android.text.Layout.Alignment;
import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

final class TtmlStyle {
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface FontSizeUnit {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface RubyType {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface StyleFlags {
    }

    public static final int A = 2;
    public static final int B = 3;
    private static final int C = 0;
    private static final int D = 1;
    public static final int E = 1;
    public static final int F = 2;
    public static final int G = 3;
    public static final int H = 4;
    @Nullable
    private String a;
    private int b;
    private boolean c;
    private int d;
    private boolean e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private float k;
    @Nullable
    private String l;
    private int m;
    private int n;
    @Nullable
    private Layout.Alignment o;
    @Nullable
    private Layout.Alignment p;
    private int q;
    @Nullable
    private TextEmphasis r;
    private float s;
    public static final int t = -1;
    public static final float u = 3.402823E+38f;
    public static final int v = 0;
    public static final int w = 1;
    public static final int x = 2;
    public static final int y = 3;
    public static final int z = 1;

    public TtmlStyle() {
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.m = -1;
        this.n = -1;
        this.q = -1;
        this.s = 3.402823E+38f;
    }

    @a
    public TtmlStyle A(int v) {
        this.j = v;
        return this;
    }

    @a
    public TtmlStyle B(@Nullable String s) {
        this.l = s;
        return this;
    }

    @a
    public TtmlStyle C(boolean z) {
        this.i = z;
        return this;
    }

    @a
    public TtmlStyle D(boolean z) {
        this.f = z;
        return this;
    }

    @a
    public TtmlStyle E(@Nullable Layout.Alignment layout$Alignment0) {
        this.p = layout$Alignment0;
        return this;
    }

    @a
    public TtmlStyle F(int v) {
        this.n = v;
        return this;
    }

    @a
    public TtmlStyle G(int v) {
        this.m = v;
        return this;
    }

    @a
    public TtmlStyle H(float f) {
        this.s = f;
        return this;
    }

    @a
    public TtmlStyle I(@Nullable Layout.Alignment layout$Alignment0) {
        this.o = layout$Alignment0;
        return this;
    }

    @a
    public TtmlStyle J(boolean z) {
        this.q = z;
        return this;
    }

    @a
    public TtmlStyle K(@Nullable TextEmphasis textEmphasis0) {
        this.r = textEmphasis0;
        return this;
    }

    @a
    public TtmlStyle L(boolean z) {
        this.g = z;
        return this;
    }

    @a
    public TtmlStyle a(@Nullable TtmlStyle ttmlStyle0) {
        return this.s(ttmlStyle0, true);
    }

    public int b() {
        if(!this.e) {
            throw new IllegalStateException("Background color has not been defined.");
        }
        return this.d;
    }

    public int c() {
        if(!this.c) {
            throw new IllegalStateException("Font color has not been defined.");
        }
        return this.b;
    }

    @Nullable
    public String d() {
        return this.a;
    }

    public float e() {
        return this.k;
    }

    public int f() {
        return this.j;
    }

    @Nullable
    public String g() {
        return this.l;
    }

    @Nullable
    public Layout.Alignment h() {
        return this.p;
    }

    public int i() {
        return this.n;
    }

    public int j() {
        return this.m;
    }

    public float k() {
        return this.s;
    }

    public int l() {
        int v = 0;
        int v1 = this.h;
        if(v1 == -1 && this.i == -1) {
            return -1;
        }
        if(this.i == 1) {
            v = 2;
        }
        return (v1 == 1 ? 1 : 0) | v;
    }

    @Nullable
    public Layout.Alignment m() {
        return this.o;
    }

    public boolean n() {
        return this.q == 1;
    }

    @Nullable
    public TextEmphasis o() {
        return this.r;
    }

    public boolean p() {
        return this.e;
    }

    public boolean q() {
        return this.c;
    }

    @a
    public TtmlStyle r(@Nullable TtmlStyle ttmlStyle0) {
        return this.s(ttmlStyle0, false);
    }

    @a
    private TtmlStyle s(@Nullable TtmlStyle ttmlStyle0, boolean z) {
        if(ttmlStyle0 != null) {
            if(!this.c && ttmlStyle0.c) {
                this.x(ttmlStyle0.b);
            }
            if(this.h == -1) {
                this.h = ttmlStyle0.h;
            }
            if(this.i == -1) {
                this.i = ttmlStyle0.i;
            }
            if(this.a == null) {
                String s = ttmlStyle0.a;
                if(s != null) {
                    this.a = s;
                }
            }
            if(this.f == -1) {
                this.f = ttmlStyle0.f;
            }
            if(this.g == -1) {
                this.g = ttmlStyle0.g;
            }
            if(this.n == -1) {
                this.n = ttmlStyle0.n;
            }
            if(this.o == null) {
                Layout.Alignment layout$Alignment0 = ttmlStyle0.o;
                if(layout$Alignment0 != null) {
                    this.o = layout$Alignment0;
                }
            }
            if(this.p == null) {
                Layout.Alignment layout$Alignment1 = ttmlStyle0.p;
                if(layout$Alignment1 != null) {
                    this.p = layout$Alignment1;
                }
            }
            if(this.q == -1) {
                this.q = ttmlStyle0.q;
            }
            if(this.j == -1) {
                this.j = ttmlStyle0.j;
                this.k = ttmlStyle0.k;
            }
            if(this.r == null) {
                this.r = ttmlStyle0.r;
            }
            if(this.s == 3.402823E+38f) {
                this.s = ttmlStyle0.s;
            }
            if(z && !this.e && ttmlStyle0.e) {
                this.v(ttmlStyle0.d);
            }
            if(z && this.m == -1) {
                int v = ttmlStyle0.m;
                if(v != -1) {
                    this.m = v;
                }
            }
        }
        return this;
    }

    public boolean t() {
        return this.f == 1;
    }

    public boolean u() {
        return this.g == 1;
    }

    @a
    public TtmlStyle v(int v) {
        this.d = v;
        this.e = true;
        return this;
    }

    @a
    public TtmlStyle w(boolean z) {
        this.h = z;
        return this;
    }

    @a
    public TtmlStyle x(int v) {
        this.b = v;
        this.c = true;
        return this;
    }

    @a
    public TtmlStyle y(@Nullable String s) {
        this.a = s;
        return this;
    }

    @a
    public TtmlStyle z(float f) {
        this.k = f;
        return this;
    }
}

