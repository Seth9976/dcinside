package androidx.room;

import A3.o;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.e;
import kotlin.coroutines.g.b.a;
import kotlin.coroutines.g.b;
import kotlin.coroutines.g.c;
import kotlin.coroutines.g;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@RestrictTo({Scope.b})
public final class TransactionElement implements b {
    public static final class Key implements c {
        private Key() {
        }

        public Key(w w0) {
        }
    }

    @l
    private final e a;
    @l
    private final AtomicInteger b;
    @l
    public static final Key c;

    static {
        TransactionElement.c = new Key(null);
    }

    public TransactionElement(@l e e0) {
        this.a = e0;
        this.b = new AtomicInteger(0);
    }

    public final void b() {
        this.b.incrementAndGet();
    }

    @l
    public final e d() {
        return this.a;
    }

    @Override  // kotlin.coroutines.g$b
    public Object fold(Object object0, @l o o0) {
        return a.a(this, object0, o0);
    }

    public final void g() {
        if(this.b.decrementAndGet() < 0) {
            throw new IllegalStateException("Transaction was never started or was already released.");
        }
    }

    @Override  // kotlin.coroutines.g$b
    @m
    public b get(@l c g$c0) {
        return a.b(this, g$c0);
    }

    @Override  // kotlin.coroutines.g$b
    @l
    public c getKey() {
        return TransactionElement.c;
    }

    @Override  // kotlin.coroutines.g$b
    @l
    public g minusKey(@l c g$c0) {
        return a.c(this, g$c0);
    }

    @Override  // kotlin.coroutines.g
    @l
    public g plus(@l g g0) {
        return a.d(this, g0);
    }
}

