package androidx.compose.runtime;

import A3.o;
import kotlin.coroutines.g;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.I0.a;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;

public final class LaunchedEffectImpl implements RememberObserver {
    @l
    private final o a;
    @l
    private final O b;
    @m
    private I0 c;

    public LaunchedEffectImpl(@l g g0, @l o o0) {
        L.p(g0, "parentCoroutineContext");
        L.p(o0, "task");
        super();
        this.a = o0;
        this.b = P.a(g0);
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public void a() {
        I0 i00 = this.c;
        if(i00 != null) {
            O0.j(i00, "Old job was still running!", null, 2, null);
        }
        this.c = k.f(this.b, null, null, this.a, 3, null);
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public void c() {
        I0 i00 = this.c;
        if(i00 != null) {
            a.b(i00, null, 1, null);
        }
        this.c = null;
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public void d() {
        I0 i00 = this.c;
        if(i00 != null) {
            a.b(i00, null, 1, null);
        }
        this.c = null;
    }
}

