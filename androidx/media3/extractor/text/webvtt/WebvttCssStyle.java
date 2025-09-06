package androidx.media3.extractor.text.webvtt;

import O1.a;
import android.text.TextUtils;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import com.google.common.base.c;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@UnstableApi
public final class WebvttCssStyle {
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface FontSizeUnit {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface StyleFlags {
    }

    private static final int A = 1;
    private String a;
    private String b;
    private Set c;
    private String d;
    @Nullable
    private String e;
    @ColorInt
    private int f;
    private boolean g;
    private int h;
    private boolean i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private float o;
    private int p;
    private boolean q;
    public static final int r = -1;
    public static final int s = 0;
    public static final int t = 1;
    public static final int u = 2;
    public static final int v = 3;
    public static final int w = 1;
    public static final int x = 2;
    public static final int y = 3;
    private static final int z;

    public WebvttCssStyle() {
        this.a = "";
        this.b = "";
        this.c = Collections.emptySet();
        this.d = "";
        this.e = null;
        this.g = false;
        this.i = false;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.p = -1;
        this.q = false;
    }

    public void A(String s) {
        this.d = s;
    }

    @a
    public WebvttCssStyle B(boolean z) {
        this.k = z;
        return this;
    }

    private static int C(int v, String s, @Nullable String s1, int v1) {
        if(!s.isEmpty() && v != -1) {
            return s.equals(s1) ? v + v1 : -1;
        }
        return v;
    }

    public int a() {
        if(!this.i) {
            throw new IllegalStateException("Background color not defined.");
        }
        return this.h;
    }

    public boolean b() {
        return this.q;
    }

    public int c() {
        if(!this.g) {
            throw new IllegalStateException("Font color not defined");
        }
        return this.f;
    }

    @Nullable
    public String d() {
        return this.e;
    }

    public float e() {
        return this.o;
    }

    public int f() {
        return this.n;
    }

    public int g() {
        return this.p;
    }

    public int h(@Nullable String s, @Nullable String s1, Set set0, @Nullable String s2) {
        if(this.a.isEmpty() && this.b.isEmpty() && this.c.isEmpty() && this.d.isEmpty()) {
            return TextUtils.isEmpty(s1);
        }
        int v = WebvttCssStyle.C(WebvttCssStyle.C(WebvttCssStyle.C(0, this.a, s, 0x40000000), this.b, s1, 2), this.d, s2, 4);
        return v == -1 || !set0.containsAll(this.c) ? 0 : v + this.c.size() * 4;
    }

    public int i() {
        int v = 0;
        int v1 = this.l;
        if(v1 == -1 && this.m == -1) {
            return -1;
        }
        if(this.m == 1) {
            v = 2;
        }
        return (v1 == 1 ? 1 : 0) | v;
    }

    public boolean j() {
        return this.i;
    }

    public boolean k() {
        return this.g;
    }

    public boolean l() {
        return this.j == 1;
    }

    public boolean m() {
        return this.k == 1;
    }

    @a
    public WebvttCssStyle n(int v) {
        this.h = v;
        this.i = true;
        return this;
    }

    @a
    public WebvttCssStyle o(boolean z) {
        this.l = z;
        return this;
    }

    @a
    public WebvttCssStyle p(boolean z) {
        this.q = z;
        return this;
    }

    @a
    public WebvttCssStyle q(int v) {
        this.f = v;
        this.g = true;
        return this;
    }

    @a
    public WebvttCssStyle r(@Nullable String s) {
        this.e = s == null ? null : c.g(s);
        return this;
    }

    @a
    public WebvttCssStyle s(float f) {
        this.o = f;
        return this;
    }

    @a
    public WebvttCssStyle t(int v) {
        this.n = v;
        return this;
    }

    @a
    public WebvttCssStyle u(boolean z) {
        this.m = z;
        return this;
    }

    @a
    public WebvttCssStyle v(boolean z) {
        this.j = z;
        return this;
    }

    @a
    public WebvttCssStyle w(int v) {
        this.p = v;
        return this;
    }

    public void x(String[] arr_s) {
        this.c = new HashSet(Arrays.asList(arr_s));
    }

    public void y(String s) {
        this.a = s;
    }

    public void z(String s) {
        this.b = s;
    }
}

