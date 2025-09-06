package kotlin.random;

import java.util.Random;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nPlatformRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformRandom.kt\nkotlin/random/AbstractPlatformRandom\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1#2:94\n*E\n"})
public abstract class a extends f {
    @Override  // kotlin.random.f
    public int b(int v) {
        return g.j(this.r().nextInt(), v);
    }

    @Override  // kotlin.random.f
    public boolean c() {
        return this.r().nextBoolean();
    }

    @Override  // kotlin.random.f
    @l
    public byte[] e(@l byte[] arr_b) {
        L.p(arr_b, "array");
        this.r().nextBytes(arr_b);
        return arr_b;
    }

    @Override  // kotlin.random.f
    public double h() {
        return this.r().nextDouble();
    }

    @Override  // kotlin.random.f
    public float k() {
        return this.r().nextFloat();
    }

    @Override  // kotlin.random.f
    public int l() {
        return this.r().nextInt();
    }

    @Override  // kotlin.random.f
    public int m(int v) {
        return this.r().nextInt(v);
    }

    @Override  // kotlin.random.f
    public long o() {
        return this.r().nextLong();
    }

    @l
    public abstract Random r();
}

