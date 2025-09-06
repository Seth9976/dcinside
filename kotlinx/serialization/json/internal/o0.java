package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.L;
import kotlinx.serialization.descriptors.b;
import kotlinx.serialization.descriptors.d;
import kotlinx.serialization.descriptors.e;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.descriptors.j.a;
import kotlinx.serialization.descriptors.j;
import kotlinx.serialization.descriptors.k.c;
import y4.l;

public final class o0 {
    @l
    public static final f a(@l f f0, @l kotlinx.serialization.modules.f f1) {
        L.p(f0, "<this>");
        L.p(f1, "module");
        if(L.g(f0.getKind(), a.a)) {
            f f2 = b.c(f1, f0);
            if(f2 != null) {
                f f3 = o0.a(f2, f1);
                return f3 == null ? f0 : f3;
            }
            return f0;
        }
        return f0.isInline() ? o0.a(f0.d(0), f1) : f0;
    }

    public static final Object b(@l kotlinx.serialization.json.b b0, @l f f0, @l A3.a a0, @l A3.a a1) {
        L.p(b0, "<this>");
        L.p(f0, "mapDescriptor");
        L.p(a0, "ifMap");
        L.p(a1, "ifList");
        f f1 = o0.a(f0.d(0), b0.a());
        j j0 = f1.getKind();
        if(!(j0 instanceof e) && !L.g(j0, kotlinx.serialization.descriptors.j.b.a)) {
            if(!b0.h().b()) {
                throw E.d(f1);
            }
            return a1.invoke();
        }
        return a0.invoke();
    }

    @l
    public static final n0 c(@l kotlinx.serialization.json.b b0, @l f f0) {
        L.p(b0, "<this>");
        L.p(f0, "desc");
        j j0 = f0.getKind();
        if(j0 instanceof d) {
            return n0.f;
        }
        if(L.g(j0, kotlinx.serialization.descriptors.k.b.a)) {
            return n0.d;
        }
        if(L.g(j0, c.a)) {
            f f1 = o0.a(f0.d(0), b0.a());
            j j1 = f1.getKind();
            if(!(j1 instanceof e) && !L.g(j1, kotlinx.serialization.descriptors.j.b.a)) {
                if(!b0.h().b()) {
                    throw E.d(f1);
                }
                return n0.d;
            }
            return n0.e;
        }
        return n0.c;
    }
}

