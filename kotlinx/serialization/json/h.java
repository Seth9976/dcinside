package kotlinx.serialization.json;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlinx.serialization.f;
import y4.l;

public final class h {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    @l
    private final String g;
    private final boolean h;
    private final boolean i;
    @l
    private final String j;
    private final boolean k;
    private final boolean l;

    public h() {
        this(false, false, false, false, false, false, null, false, false, null, false, false, 0xFFF, null);
    }

    public h(boolean z, boolean z1, boolean z2, boolean z3, boolean z4, boolean z5, @l String s, boolean z6, boolean z7, @l String s1, boolean z8, boolean z9) {
        L.p(s, "prettyPrintIndent");
        L.p(s1, "classDiscriminator");
        super();
        this.a = z;
        this.b = z1;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = s;
        this.h = z6;
        this.i = z7;
        this.j = s1;
        this.k = z8;
        this.l = z9;
    }

    public h(boolean z, boolean z1, boolean z2, boolean z3, boolean z4, boolean z5, String s, boolean z6, boolean z7, String s1, boolean z8, boolean z9, int v, w w0) {
        boolean z10 = false;
        boolean z11 = true;
        if((v & 0x400) == 0) {
            z10 = z8;
        }
        if((v & 0x800) == 0) {
            z11 = z9;
        }
        this(((v & 1) == 0 ? z : false), ((v & 2) == 0 ? z1 : false), ((v & 4) == 0 ? z2 : false), ((v & 8) == 0 ? z3 : false), ((v & 16) == 0 ? z4 : false), ((v & 0x20) == 0 ? z5 : true), ((v & 0x40) == 0 ? s : "    "), ((v & 0x80) == 0 ? z6 : false), ((v & 0x100) == 0 ? z7 : false), ((v & 0x200) == 0 ? s1 : "type"), z10, z11);
    }

    public final boolean a() {
        return this.k;
    }

    public final boolean b() {
        return this.d;
    }

    @l
    public final String c() [...] // 潜在的解密器

    public final boolean d() {
        return this.h;
    }

    public final boolean e() {
        return this.a;
    }

    public final boolean f() {
        return this.f;
    }

    @f
    public static void g() {
    }

    public final boolean h() {
        return this.b;
    }

    public final boolean i() {
        return this.e;
    }

    @l
    public final String j() [...] // 潜在的解密器

    @f
    public static void k() {
    }

    public final boolean l() {
        return this.l;
    }

    public final boolean m() {
        return this.i;
    }

    public final boolean n() {
        return this.c;
    }

    @Override
    @l
    public String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.a + ", ignoreUnknownKeys=" + this.b + ", isLenient=" + this.c + ", allowStructuredMapKeys=" + this.d + ", prettyPrint=" + this.e + ", explicitNulls=" + this.f + ", prettyPrintIndent=\'" + this.g + "\', coerceInputValues=" + this.h + ", useArrayPolymorphism=" + this.i + ", classDiscriminator=\'" + this.j + "\', allowSpecialFloatingPointValues=" + this.k + ')';
    }
}

