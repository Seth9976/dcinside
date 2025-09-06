package kotlin.random;

import java.io.Serializable;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;

@s0({"SMAP\nXorWowRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XorWowRandom.kt\nkotlin/random/XorWowRandom\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,60:1\n1#2:61\n*E\n"})
public final class i extends f implements Serializable {
    static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    @l
    private static final a i;
    private static final long j;

    static {
        i.i = new a(null);
    }

    public i(int v, int v1) {
        this(v, v1, 0, 0, ~v, v << 10 ^ v1 >>> 4);
    }

    public i(int v, int v1, int v2, int v3, int v4, int v5) {
        this.c = v;
        this.d = v1;
        this.e = v2;
        this.f = v3;
        this.g = v4;
        this.h = v5;
        if((v | v1 | v2 | v3 | v4) == 0) {
            throw new IllegalArgumentException("Initial state must have at least one non-zero element.");
        }
        for(int v6 = 0; v6 < 0x40; ++v6) {
            this.l();
        }
    }

    @Override  // kotlin.random.f
    public int b(int v) {
        return g.j(this.l(), v);
    }

    @Override  // kotlin.random.f
    public int l() {
        int v = this.c ^ this.c >>> 2;
        this.c = this.d;
        this.d = this.e;
        this.e = this.f;
        this.f = this.g;
        int v1 = v ^ v << 1 ^ this.g ^ this.g << 4;
        this.g = v1;
        int v2 = this.h + 0x587C5;
        this.h = v2;
        return v1 + v2;
    }
}

