package kotlinx.coroutines;

import A3.o;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import y4.l;
import y4.m;

@E0
public abstract class a extends Q0 implements d, I0, O {
    @l
    private final g c;

    public a(@l g g0, boolean z, boolean z1) {
        super(z1);
        if(z) {
            this.S0(((I0)g0.get(I0.B8)));
        }
        this.c = g0.plus(this);
    }

    protected void L1(@m Object object0) {
        this.b0(object0);
    }

    public static void M1() {
    }

    protected void N1(@l Throwable throwable0, boolean z) {
    }

    protected void O1(Object object0) {
    }

    public final void P1(@l Q q0, Object object0, @l o o0) {
        q0.c(o0, object0, this);
    }

    @Override  // kotlinx.coroutines.Q0
    public final void R0(@l Throwable throwable0) {
        L.b(this.c, throwable0);
    }

    @Override  // kotlin.coroutines.d
    @l
    public final g getContext() {
        return this.c;
    }

    @Override  // kotlinx.coroutines.O
    @l
    public g getCoroutineContext() {
        return this.c;
    }

    @Override  // kotlinx.coroutines.Q0, kotlinx.coroutines.I0
    public boolean isActive() {
        return super.isActive();
    }

    @Override  // kotlinx.coroutines.Q0
    @l
    public String k1() {
        return super.k1();
    }

    @Override  // kotlinx.coroutines.Q0
    @l
    protected String m0() {
        return U.a(this) + " was cancelled";
    }

    @Override  // kotlin.coroutines.d
    public final void resumeWith(@l Object object0) {
        Object object1 = this.i1(G.d(object0, null, 1, null));
        if(object1 == R0.b) {
            return;
        }
        this.L1(object1);
    }

    @Override  // kotlinx.coroutines.Q0
    protected final void s1(@m Object object0) {
        if(object0 instanceof C) {
            boolean z = ((C)object0).a();
            this.N1(((C)object0).a, z);
            return;
        }
        this.O1(object0);
    }
}

