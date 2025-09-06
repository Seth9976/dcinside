package androidx.window.embedding;

import android.app.Activity;
import android.content.Context;
import androidx.core.util.Consumer;
import androidx.window.core.ExperimentalWindowApi;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.k0;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.n;

@ExperimentalWindowApi
public final class SplitController {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        @n
        public final SplitController a() {
            if(SplitController.d == null) {
                ReentrantLock reentrantLock0 = SplitController.e;
                reentrantLock0.lock();
                try {
                    if(SplitController.d == null) {
                        SplitController.d = new SplitController(null);
                    }
                }
                finally {
                    reentrantLock0.unlock();
                }
            }
            SplitController splitController0 = SplitController.d;
            L.m(splitController0);
            return splitController0;
        }

        @n
        public final void b(@l Context context0, int v) {
            L.p(context0, "context");
            Set set0 = new SplitRuleParser().g(context0, v);
            SplitController splitController0 = this.a();
            if(set0 == null) {
                set0 = k0.k();
            }
            splitController0.m(set0);
        }
    }

    @l
    private final EmbeddingBackend a;
    @l
    private Set b;
    @l
    public static final Companion c = null;
    @m
    private static volatile SplitController d = null;
    @l
    private static final ReentrantLock e = null;
    public static final boolean f = false;

    static {
        SplitController.c = new Companion(null);
        SplitController.e = new ReentrantLock();
    }

    private SplitController() {
        this.a = ExtensionEmbeddingBackend.e.a();
        this.b = k0.k();
    }

    public SplitController(w w0) {
    }

    public final void e(@l Activity activity0, @l Executor executor0, @l Consumer consumer0) {
        L.p(activity0, "activity");
        L.p(executor0, "executor");
        L.p(consumer0, "consumer");
        this.a.c(activity0, executor0, consumer0);
    }

    public final void f() {
        this.a.a(this.b);
    }

    @l
    @n
    public static final SplitController g() {
        return SplitController.c.a();
    }

    @l
    public final Set h() {
        return u.a6(this.a.b());
    }

    @n
    public static final void i(@l Context context0, int v) {
        SplitController.c.b(context0, v);
    }

    public final boolean j() {
        return this.a.e();
    }

    public final void k(@l EmbeddingRule embeddingRule0) {
        L.p(embeddingRule0, "rule");
        this.a.g(embeddingRule0);
    }

    public final void l(@l Consumer consumer0) {
        L.p(consumer0, "consumer");
        this.a.d(consumer0);
    }

    private final void m(Set set0) {
        this.b = set0;
        this.a.a(set0);
    }

    public final void n(@l EmbeddingRule embeddingRule0) {
        L.p(embeddingRule0, "rule");
        this.a.f(embeddingRule0);
    }
}

