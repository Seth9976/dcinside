package kotlinx.serialization.json;

import kotlin.jvm.internal.L;
import y4.l;

public final class f {
    private boolean a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    @l
    private String g;
    private boolean h;
    private boolean i;
    @l
    private String j;
    private boolean k;
    private boolean l;
    @l
    private kotlinx.serialization.modules.f m;

    public f(@l b b0) {
        L.p(b0, "json");
        super();
        this.a = b0.h().e();
        this.b = b0.h().f();
        this.c = b0.h().h();
        this.d = b0.h().n();
        this.e = b0.h().b();
        this.f = b0.h().i();
        this.g = "    ";
        this.h = b0.h().d();
        this.i = b0.h().m();
        this.j = "type";
        this.k = b0.h().a();
        this.l = b0.h().l();
        this.m = b0.a();
    }

    public final void A(@l kotlinx.serialization.modules.f f0) {
        L.p(f0, "<set-?>");
        this.m = f0;
    }

    public final void B(boolean z) {
        this.l = z;
    }

    public final void C(boolean z) {
        this.i = z;
    }

    @l
    public final h a() {
        if(this.i && !L.g(this.j, "type")) {
            throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified");
        }
        if(!this.f) {
            if(!L.g(this.g, "    ")) {
                throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
            }
        }
        else if(!L.g(this.g, "    ")) {
            String s = this.g;
            int v = 0;
            while(v < s.length()) {
                switch(s.charAt(v)) {
                    case 9: 
                    case 10: 
                    case 13: 
                    case 0x20: {
                        ++v;
                        continue;
                    }
                    default: {
                        throw new IllegalArgumentException(("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had " + this.g).toString());
                    }
                }
            }
        }
        return new h(this.a, this.c, this.d, this.e, this.f, this.b, this.g, this.h, this.i, this.j, this.k, this.l);
    }

    public final boolean b() {
        return this.k;
    }

    public final boolean c() {
        return this.e;
    }

    @l
    public final String d() {
        return this.j;
    }

    public final boolean e() {
        return this.h;
    }

    public final boolean f() {
        return this.a;
    }

    public final boolean g() {
        return this.b;
    }

    @kotlinx.serialization.f
    public static void h() {
    }

    public final boolean i() {
        return this.c;
    }

    public final boolean j() {
        return this.f;
    }

    @l
    public final String k() {
        return this.g;
    }

    @kotlinx.serialization.f
    public static void l() {
    }

    @l
    public final kotlinx.serialization.modules.f m() {
        return this.m;
    }

    public final boolean n() {
        return this.l;
    }

    public final boolean o() {
        return this.i;
    }

    public final boolean p() {
        return this.d;
    }

    public final void q(boolean z) {
        this.k = z;
    }

    public final void r(boolean z) {
        this.e = z;
    }

    public final void s(@l String s) {
        L.p(s, "<set-?>");
        this.j = s;
    }

    public final void t(boolean z) {
        this.h = z;
    }

    public final void u(boolean z) {
        this.a = z;
    }

    public final void v(boolean z) {
        this.b = z;
    }

    public final void w(boolean z) {
        this.c = z;
    }

    public final void x(boolean z) {
        this.d = z;
    }

    public final void y(boolean z) {
        this.f = z;
    }

    public final void z(@l String s) {
        L.p(s, "<set-?>");
        this.g = s;
    }
}

