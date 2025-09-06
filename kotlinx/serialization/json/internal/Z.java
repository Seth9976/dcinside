package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.L;
import kotlin.text.M;
import kotlin.y;
import kotlinx.serialization.encoding.a;
import kotlinx.serialization.json.b;
import kotlinx.serialization.modules.f;
import y4.l;

public final class z extends a {
    @l
    private final kotlinx.serialization.json.internal.a d;
    @l
    private final f e;

    public z(@l kotlinx.serialization.json.internal.a a0, @l b b0) {
        L.p(a0, "lexer");
        L.p(b0, "json");
        super();
        this.d = a0;
        this.e = b0.a();
    }

    @Override  // kotlinx.serialization.encoding.a
    public byte H() {
        kotlinx.serialization.json.internal.a a0 = this.d;
        String s = a0.s();
        try {
            return M.e(s);
        }
        catch(IllegalArgumentException unused_ex) {
            kotlinx.serialization.json.internal.a.y(a0, "Failed to parse type \'UByte\' for input \'" + s + '\'', 0, null, 6, null);
            throw new y();
        }
    }

    @Override  // kotlinx.serialization.encoding.e, kotlinx.serialization.encoding.c
    @l
    public f a() {
        return this.e;
    }

    @Override  // kotlinx.serialization.encoding.a
    public long h() {
        kotlinx.serialization.json.internal.a a0 = this.d;
        String s = a0.s();
        try {
            return M.m(s);
        }
        catch(IllegalArgumentException unused_ex) {
            kotlinx.serialization.json.internal.a.y(a0, "Failed to parse type \'ULong\' for input \'" + s + '\'', 0, null, 6, null);
            throw new y();
        }
    }

    @Override  // kotlinx.serialization.encoding.a
    public short m() {
        kotlinx.serialization.json.internal.a a0 = this.d;
        String s = a0.s();
        try {
            return M.q(s);
        }
        catch(IllegalArgumentException unused_ex) {
            kotlinx.serialization.json.internal.a.y(a0, "Failed to parse type \'UShort\' for input \'" + s + '\'', 0, null, 6, null);
            throw new y();
        }
    }

    @Override  // kotlinx.serialization.encoding.a
    public int u() {
        kotlinx.serialization.json.internal.a a0 = this.d;
        String s = a0.s();
        try {
            return M.i(s);
        }
        catch(IllegalArgumentException unused_ex) {
            kotlinx.serialization.json.internal.a.y(a0, "Failed to parse type \'UInt\' for input \'" + s + '\'', 0, null, 6, null);
            throw new y();
        }
    }

    @Override  // kotlinx.serialization.encoding.c
    public int w(@l kotlinx.serialization.descriptors.f f0) {
        L.p(f0, "descriptor");
        throw new IllegalStateException("unsupported");
    }
}

