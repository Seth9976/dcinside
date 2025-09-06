package androidx.work.impl.constraints.trackers;

import android.content.Context;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.impl.constraints.ConstraintListener;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@RestrictTo({Scope.b})
@s0({"SMAP\nConstraintTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintTracker.kt\nandroidx/work/impl/constraints/trackers/ConstraintTracker\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,113:1\n1855#2,2:114\n*S KotlinDebug\n*F\n+ 1 ConstraintTracker.kt\nandroidx/work/impl/constraints/trackers/ConstraintTracker\n*L\n90#1:114,2\n*E\n"})
public abstract class ConstraintTracker {
    @l
    private final TaskExecutor a;
    @l
    private final Context b;
    @l
    private final Object c;
    @l
    private final LinkedHashSet d;
    @m
    private Object e;

    protected ConstraintTracker(@l Context context0, @l TaskExecutor taskExecutor0) {
        L.p(context0, "context");
        L.p(taskExecutor0, "taskExecutor");
        super();
        this.a = taskExecutor0;
        Context context1 = context0.getApplicationContext();
        L.o(context1, "context.applicationContext");
        this.b = context1;
        this.c = new Object();
        this.d = new LinkedHashSet();
    }

    // 检测为 Lambda 实现
    private static final void b(List list0, ConstraintTracker constraintTracker0) [...]

    public final void c(@l ConstraintListener constraintListener0) {
        L.p(constraintListener0, "listener");
        synchronized(this.c) {
            if(this.d.add(constraintListener0)) {
                if(this.d.size() == 1) {
                    this.e = this.f();
                    Logger.e().a("WM-ConstraintTracker", this.getClass().getSimpleName() + ": initial state = " + this.e);
                    this.i();
                }
                constraintListener0.a(this.e);
            }
        }
    }

    @l
    protected final Context d() {
        return this.b;
    }

    public final Object e() {
        return this.e == null ? this.f() : this.e;
    }

    public abstract Object f();

    public final void g(@l ConstraintListener constraintListener0) {
        L.p(constraintListener0, "listener");
        synchronized(this.c) {
            if(this.d.remove(constraintListener0) && this.d.isEmpty()) {
                this.j();
            }
        }
    }

    public final void h(Object object0) {
        synchronized(this.c) {
            if(this.e != null && L.g(this.e, object0)) {
                return;
            }
            this.e = object0;
            List list0 = u.V5(this.d);
            this.a.c().execute(() -> for(Object object0: list0) {
                ((ConstraintListener)object0).a(this.e);
            });
        }
    }

    public abstract void i();

    public abstract void j();
}

