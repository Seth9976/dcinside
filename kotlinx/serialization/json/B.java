package kotlinx.serialization.json;

import kotlin.c0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.m;
import kotlinx.serialization.C;
import kotlinx.serialization.d;
import kotlinx.serialization.json.internal.N;
import kotlinx.serialization.json.internal.P;
import kotlinx.serialization.json.internal.e0;
import kotlinx.serialization.json.internal.i0;
import kotlinx.serialization.json.internal.l0;
import kotlinx.serialization.json.internal.m0;
import kotlinx.serialization.json.internal.n0;
import kotlinx.serialization.json.internal.x;
import kotlinx.serialization.modules.f;
import y4.l;

public abstract class b implements C {
    public static final class a extends b {
        private a() {
            super(new h(false, false, false, false, false, false, null, false, false, null, false, false, 0xFFF, null), kotlinx.serialization.modules.h.a(), null);
        }

        public a(w w0) {
        }
    }

    @l
    private final h a;
    @l
    private final f b;
    @l
    private final x c;
    @l
    public static final a d;

    static {
        b.d = new a(null);
    }

    private b(h h0, f f0) {
        this.a = h0;
        this.b = f0;
        this.c = new x();
    }

    public b(h h0, f f0, w w0) {
        this(h0, f0);
    }

    @Override  // kotlinx.serialization.q
    @l
    public f a() {
        return this.b;
    }

    @Override  // kotlinx.serialization.C
    @l
    public final String c(@l kotlinx.serialization.w w0, Object object0) {
        L.p(w0, "serializer");
        P p0 = new P();
        try {
            N.f(this, p0, w0, object0);
            return "";
        }
        finally {
            p0.release();
        }
    }

    @Override  // kotlinx.serialization.C
    public final Object d(@l d d0, @l String s) {
        L.p(d0, "deserializer");
        L.p(s, "string");
        i0 i00 = new i0(s);
        kotlinx.serialization.descriptors.f f0 = d0.getDescriptor();
        Object object0 = new e0(this, n0.c, i00, f0, null).G(d0);
        i00.w();
        return object0;
    }

    public final Object f(@l d d0, @l kotlinx.serialization.json.l l0) {
        L.p(d0, "deserializer");
        L.p(l0, "element");
        return l0.a(this, l0, d0);
    }

    @l
    public final kotlinx.serialization.json.l g(@l kotlinx.serialization.w w0, Object object0) {
        L.p(w0, "serializer");
        return m0.d(this, object0, w0);
    }

    @l
    public final h h() {
        return this.a;
    }

    @l
    public final x i() {
        return this.c;
    }

    @k(level = m.b, message = "Should not be accessed directly, use Json.schemaCache accessor instead", replaceWith = @c0(expression = "schemaCache", imports = {}))
    public static void j() {
    }

    @l
    public final kotlinx.serialization.json.l k(@l String s) {
        L.p(s, "string");
        return (kotlinx.serialization.json.l)this.d(o.a, s);
    }
}

