package androidx.activity;

import A3.a;
import androidx.annotation.GuardedBy;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nFullyDrawnReporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,190:1\n1#2:191\n1855#3,2:192\n*S KotlinDebug\n*F\n+ 1 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporter\n*L\n154#1:192,2\n*E\n"})
public final class FullyDrawnReporter {
    @l
    private final Executor a;
    @l
    private final a b;
    @l
    private final Object c;
    @GuardedBy("lock")
    private int d;
    @GuardedBy("lock")
    private boolean e;
    @GuardedBy("lock")
    private boolean f;
    @GuardedBy("lock")
    @l
    private final List g;
    @l
    private final Runnable h;

    public FullyDrawnReporter(@l Executor executor0, @l a a0) {
        L.p(executor0, "executor");
        L.p(a0, "reportFullyDrawn");
        super();
        this.a = executor0;
        this.b = a0;
        this.c = new Object();
        this.g = new ArrayList();
        this.h = () -> {
            L.p(this, "this$0");
            synchronized(this.c) {
                this.e = false;
                if(this.d == 0 && !this.f) {
                    this.b.invoke();
                    this.d();
                }
            }
        };
    }

    public final void b(@l a a0) {
        boolean z;
        L.p(a0, "callback");
        synchronized(this.c) {
            if(this.f) {
                z = true;
            }
            else {
                this.g.add(a0);
                z = false;
            }
        }
        if(z) {
            a0.invoke();
        }
    }

    public final void c() {
        synchronized(this.c) {
            if(!this.f) {
                ++this.d;
            }
        }
    }

    @RestrictTo({Scope.b})
    public final void d() {
        synchronized(this.c) {
            this.f = true;
            for(Object object1: this.g) {
                ((a)object1).invoke();
            }
            this.g.clear();
        }
    }

    public final boolean e() {
        synchronized(this.c) {
        }
        return this.f;
    }

    private final void f() {
        if(!this.e && this.d == 0) {
            this.e = true;
            this.a.execute(this.h);
        }
    }

    public final void g(@l a a0) {
        L.p(a0, "callback");
        synchronized(this.c) {
            this.g.remove(a0);
        }
    }

    public final void h() {
        synchronized(this.c) {
            if(!this.f) {
                int v1 = this.d;
                if(v1 > 0) {
                    this.d = v1 - 1;
                    this.f();
                }
            }
        }
    }

    // 检测为 Lambda 实现
    private static final void i(FullyDrawnReporter fullyDrawnReporter0) [...]
}

