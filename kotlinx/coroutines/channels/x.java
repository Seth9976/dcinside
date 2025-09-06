package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.c0;
import kotlin.jvm.functions.Function1;
import kotlin.k;
import kotlin.m;
import kotlinx.coroutines.Z0;
import kotlinx.coroutines.selects.i;
import y4.l;

@k(level = m.a, message = "ConflatedBroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
@Z0
public final class x implements d {
    @l
    private final e a;

    public x() {
        this(new e(-1));
    }

    public x(Object object0) {
        this.l(object0);
    }

    private x(e e0) {
        this.a = e0;
    }

    @Override  // kotlinx.coroutines.channels.G
    public boolean A() {
        return this.a.A();
    }

    @Override  // kotlinx.coroutines.channels.G
    public boolean G(@y4.m Throwable throwable0) {
        return this.a.G(throwable0);
    }

    @Override  // kotlinx.coroutines.channels.G
    @y4.m
    public Object I(Object object0, @l kotlin.coroutines.d d0) {
        return this.a.I(object0, d0);
    }

    public final Object a() {
        return this.a.o2();
    }

    @Override  // kotlinx.coroutines.channels.d
    @k(level = m.c, message = "Binary compatibility only")
    public boolean c(Throwable throwable0) {
        return this.a.c(throwable0);
    }

    @Override  // kotlinx.coroutines.channels.G
    @l
    public i d() {
        return this.a.d();
    }

    @Override  // kotlinx.coroutines.channels.d
    public void e(@y4.m CancellationException cancellationException0) {
        this.a.e(cancellationException0);
    }

    @y4.m
    public final Object f() {
        return this.a.q2();
    }

    @Override  // kotlinx.coroutines.channels.d
    @l
    public F g() {
        return this.a.g();
    }

    @Override  // kotlinx.coroutines.channels.G
    public void h(@l Function1 function10) {
        this.a.h(function10);
    }

    @Override  // kotlinx.coroutines.channels.G
    @l
    public Object l(Object object0) {
        return this.a.l(object0);
    }

    @Override  // kotlinx.coroutines.channels.G
    @k(level = m.b, message = "Deprecated in the favour of \'trySend\' method", replaceWith = @c0(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(Object object0) {
        return this.a.offer(object0);
    }
}

