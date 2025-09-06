package androidx.compose.ui.graphics.vector;

import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class VectorKt {
    @l
    public static final String a = "";
    public static final float b = 0.0f;
    public static final float c = 0.0f;
    public static final float d = 0.0f;
    public static final float e = 1.0f;
    public static final float f = 1.0f;
    public static final float g = 0.0f;
    public static final float h = 0.0f;
    @l
    private static final List i = null;
    @l
    public static final String j = "";
    public static final float k = 0.0f;
    public static final float l = 4.0f;
    public static final float m = 0.0f;
    public static final float n = 1.0f;
    public static final float o;
    private static final int p;
    private static final int q;
    private static final int r;
    private static final long s;
    private static final int t;

    static {
        VectorKt.i = u.H();
        VectorKt.p = 0;
        VectorKt.q = 0;
        VectorKt.r = 5;
        VectorKt.s = 0L;
        VectorKt.t = 0;
    }

    @l
    public static final List a(@l Function1 function10) {
        L.p(function10, "block");
        PathBuilder pathBuilder0 = new PathBuilder();
        function10.invoke(pathBuilder0);
        return pathBuilder0.g();
    }

    @l
    public static final List b(@m String s) {
        return s == null ? VectorKt.i : new PathParser().p(s).C();
    }

    public static final int c() [...] // 潜在的解密器

    public static final int d() [...] // 潜在的解密器

    public static final int e() [...] // 潜在的解密器

    public static final int f() {
        return VectorKt.r;
    }

    public static final long g() {
        return VectorKt.s;
    }

    @l
    public static final List h() {
        return VectorKt.i;
    }
}

