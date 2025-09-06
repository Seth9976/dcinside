package kotlinx.coroutines.tasks;

import A3.o;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.h;
import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.k;
import kotlinx.coroutines.E0;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.X;
import kotlinx.coroutines.k0;
import kotlinx.coroutines.p;
import kotlinx.coroutines.selects.e;
import kotlinx.coroutines.selects.g;
import kotlinx.coroutines.u;
import kotlinx.coroutines.w;
import kotlinx.coroutines.x0;
import kotlinx.coroutines.x;
import kotlinx.coroutines.z;
import y4.l;
import y4.m;

@s0({"SMAP\nTasks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tasks.kt\nkotlinx/coroutines/tasks/TasksKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,163:1\n318#2,11:164\n*S KotlinDebug\n*F\n+ 1 Tasks.kt\nkotlinx/coroutines/tasks/TasksKt\n*L\n135#1:164,11\n*E\n"})
public final class c {
    public static final Object b(Task task0, CancellationTokenSource cancellationTokenSource0, d d0) {
        return c.j(task0, cancellationTokenSource0, d0);
    }

    @l
    public static final X c(@l Task task0) {
        return c.e(task0, null);
    }

    @x0
    @l
    public static final X d(@l Task task0, @l CancellationTokenSource cancellationTokenSource0) {
        return c.e(task0, cancellationTokenSource0);
    }

    private static final X e(Task task0, CancellationTokenSource cancellationTokenSource0) {
        static final class a extends N implements Function1 {
            final CancellationTokenSource e;

            a(CancellationTokenSource cancellationTokenSource0) {
                this.e = cancellationTokenSource0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Throwable)object0));
                return S0.a;
            }

            public final void invoke(@m Throwable throwable0) {
                this.e.cancel();
            }
        }


        public static final class b implements X {
            private final x a;

            b(x x0) {
                this.a = x0;
            }

            @Override  // kotlinx.coroutines.I0
            @E0
            @l
            public k0 E0(boolean z, boolean z1, @l Function1 function10) {
                return this.a.E0(z, z1, function10);
            }

            @Override  // kotlinx.coroutines.I0
            @E0
            @l
            public CancellationException L0() {
                return this.a.L0();
            }

            @Override  // kotlinx.coroutines.I0
            @l
            public e T() {
                return this.a.T();
            }

            @Override  // kotlinx.coroutines.X
            @l
            public g a1() {
                return this.a.a1();
            }

            @Override  // kotlinx.coroutines.I0
            @k(level = kotlin.m.c, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
            public boolean c(Throwable throwable0) {
                return this.a.c(throwable0);
            }

            @Override  // kotlinx.coroutines.I0
            @m
            public Object c1(@l d d0) {
                return this.a.c1(d0);
            }

            @Override  // kotlinx.coroutines.I0
            @k(level = kotlin.m.c, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
            public void cancel() {
                this.a.cancel();
            }

            @Override  // kotlinx.coroutines.I0
            public void e(@m CancellationException cancellationException0) {
                this.a.e(cancellationException0);
            }

            @Override  // kotlinx.coroutines.I0
            @E0
            @l
            public u e0(@l w w0) {
                return this.a.e0(w0);
            }

            @Override  // kotlin.coroutines.g$b
            public Object fold(Object object0, @l o o0) {
                return this.a.fold(object0, o0);
            }

            @Override  // kotlin.coroutines.g$b
            @m
            public kotlin.coroutines.g.b get(@l kotlin.coroutines.g.c g$c0) {
                return this.a.get(g$c0);
            }

            @Override  // kotlin.coroutines.g$b
            @l
            public kotlin.coroutines.g.c getKey() {
                return this.a.getKey();
            }

            @Override  // kotlinx.coroutines.I0
            @m
            public I0 getParent() {
                return this.a.getParent();
            }

            @Override  // kotlinx.coroutines.I0
            public boolean isActive() {
                return this.a.isActive();
            }

            @Override  // kotlinx.coroutines.I0
            public boolean isCancelled() {
                return this.a.isCancelled();
            }

            @Override  // kotlinx.coroutines.X
            @x0
            public Object j() {
                return this.a.j();
            }

            @Override  // kotlinx.coroutines.I0
            public boolean k() {
                return this.a.k();
            }

            @Override  // kotlin.coroutines.g$b
            @l
            public kotlin.coroutines.g minusKey(@l kotlin.coroutines.g.c g$c0) {
                return this.a.minusKey(g$c0);
            }

            @Override  // kotlinx.coroutines.X
            @m
            public Object o(@l d d0) {
                return this.a.o(d0);
            }

            @Override  // kotlin.coroutines.g
            @l
            public kotlin.coroutines.g plus(@l kotlin.coroutines.g g0) {
                return this.a.plus(g0);
            }

            @Override  // kotlinx.coroutines.I0
            @k(level = kotlin.m.b, message = "Operator \'+\' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
            @l
            public I0 q(@l I0 i00) {
                return this.a.q(i00);
            }

            @Override  // kotlinx.coroutines.I0
            public boolean start() {
                return this.a.start();
            }

            @Override  // kotlinx.coroutines.I0
            @l
            public kotlin.sequences.m u0() {
                return this.a.u0();
            }

            @Override  // kotlinx.coroutines.I0
            @l
            public k0 w(@l Function1 function10) {
                return this.a.w(function10);
            }

            @Override  // kotlinx.coroutines.X
            @x0
            @m
            public Throwable x0() {
                return this.a.x0();
            }
        }

        x x0 = z.c(null, 1, null);
        if(task0.isComplete()) {
            Exception exception0 = task0.getException();
            if(exception0 != null) {
                x0.f(exception0);
            }
            else if(task0.isCanceled()) {
                kotlinx.coroutines.I0.a.b(x0, null, 1, null);
            }
            else {
                x0.Q(task0.getResult());
            }
        }
        else {
            kotlinx.coroutines.tasks.b b0 = (Task task0) -> {
                Exception exception0 = task0.getException();
                if(exception0 == null) {
                    if(task0.isCanceled()) {
                        kotlinx.coroutines.I0.a.b(x0, null, 1, null);
                        return;
                    }
                    x0.Q(task0.getResult());
                    return;
                }
                x0.f(exception0);
            };
            task0.addOnCompleteListener((kotlinx.coroutines.tasks.a this) -> runnable0.run(), b0);
        }
        if(cancellationTokenSource0 != null) {
            x0.w(new a(cancellationTokenSource0));
        }
        return new b(x0);
    }

    // 检测为 Lambda 实现
    private static final void f(x x0, Task task0) [...]

    @l
    public static final Task g(@l X x0) {
        static final class kotlinx.coroutines.tasks.c.c extends N implements Function1 {
            final CancellationTokenSource e;
            final X f;
            final TaskCompletionSource g;

            kotlinx.coroutines.tasks.c.c(CancellationTokenSource cancellationTokenSource0, X x0, TaskCompletionSource taskCompletionSource0) {
                this.e = cancellationTokenSource0;
                this.f = x0;
                this.g = taskCompletionSource0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Throwable)object0));
                return S0.a;
            }

            public final void invoke(@m Throwable throwable0) {
                if(throwable0 instanceof CancellationException) {
                    this.e.cancel();
                    return;
                }
                Throwable throwable1 = this.f.x0();
                if(throwable1 == null) {
                    Object object0 = this.f.j();
                    this.g.setResult(object0);
                    return;
                }
                TaskCompletionSource taskCompletionSource0 = this.g;
                Exception exception0 = throwable1 instanceof Exception ? ((Exception)throwable1) : null;
                if(exception0 == null) {
                    exception0 = new RuntimeExecutionException(throwable1);
                }
                taskCompletionSource0.setException(exception0);
            }
        }

        CancellationTokenSource cancellationTokenSource0 = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource(cancellationTokenSource0.getToken());
        x0.w(new kotlinx.coroutines.tasks.c.c(cancellationTokenSource0, x0, taskCompletionSource0));
        return taskCompletionSource0.getTask();
    }

    @x0
    @m
    public static final Object h(@l Task task0, @l CancellationTokenSource cancellationTokenSource0, @l d d0) {
        return c.j(task0, cancellationTokenSource0, d0);
    }

    @m
    public static final Object i(@l Task task0, @l d d0) {
        return c.j(task0, null, d0);
    }

    private static final Object j(Task task0, CancellationTokenSource cancellationTokenSource0, d d0) {
        static final class kotlinx.coroutines.tasks.c.d implements OnCompleteListener {
            final kotlinx.coroutines.o a;

            kotlinx.coroutines.tasks.c.d(kotlinx.coroutines.o o0) {
                this.a = o0;
                super();
            }

            @Override  // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(@l Task task0) {
                Exception exception0 = task0.getException();
                if(exception0 == null) {
                    if(task0.isCanceled()) {
                        kotlinx.coroutines.o.a.a(this.a, null, 1, null);
                        return;
                    }
                    Object object0 = e0.b(task0.getResult());
                    this.a.resumeWith(object0);
                    return;
                }
                Object object1 = e0.b(f0.a(exception0));
                this.a.resumeWith(object1);
            }
        }


        static final class kotlinx.coroutines.tasks.c.e extends N implements Function1 {
            final CancellationTokenSource e;

            kotlinx.coroutines.tasks.c.e(CancellationTokenSource cancellationTokenSource0) {
                this.e = cancellationTokenSource0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Throwable)object0));
                return S0.a;
            }

            public final void invoke(@m Throwable throwable0) {
                this.e.cancel();
            }
        }

        if(task0.isComplete()) {
            Exception exception0 = task0.getException();
            if(exception0 != null) {
                throw exception0;
            }
            if(task0.isCanceled()) {
                throw new CancellationException("Task " + task0 + " was cancelled normally.");
            }
            return task0.getResult();
        }
        p p0 = new p(kotlin.coroutines.intrinsics.b.e(d0), 1);
        p0.c0();
        kotlinx.coroutines.tasks.c.d c$d0 = new kotlinx.coroutines.tasks.c.d(p0);
        task0.addOnCompleteListener((kotlinx.coroutines.tasks.a this) -> runnable0.run(), c$d0);
        if(cancellationTokenSource0 != null) {
            p0.K(new kotlinx.coroutines.tasks.c.e(cancellationTokenSource0));
        }
        Object object0 = p0.x();
        if(object0 == kotlin.coroutines.intrinsics.b.l()) {
            h.c(d0);
        }
        return object0;
    }
}

