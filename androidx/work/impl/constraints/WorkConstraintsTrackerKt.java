package androidx.work.impl.constraints;

import A3.o;
import android.content.Context;
import android.net.ConnectivityManager;
import androidx.annotation.RequiresApi;
import androidx.work.impl.model.WorkSpec;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.K;
import kotlinx.coroutines.O0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.k;
import y4.l;

public final class WorkConstraintsTrackerKt {
    @l
    private static final String a;
    private static final long b;

    static {
        L.o("WM-WorkConstraintsTrack", "tagWithPrefix(\"WorkConstraintsTracker\")");
        WorkConstraintsTrackerKt.a = "WM-WorkConstraintsTrack";
        WorkConstraintsTrackerKt.b = 1000L;
    }

    @RequiresApi(28)
    @l
    public static final NetworkRequestConstraintController a(@l Context context0) {
        L.p(context0, "context");
        Object object0 = context0.getSystemService("connectivity");
        L.n(object0, "null cannot be cast to non-null type android.net.ConnectivityManager");
        return new NetworkRequestConstraintController(((ConnectivityManager)object0), 0L, 2, null);
    }

    public static final long b() [...] // 潜在的解密器

    // 去混淆评级： 低(20)
    public static final String c() [...] // 潜在的解密器

    @l
    public static final I0 d(@l WorkConstraintsTracker workConstraintsTracker0, @l WorkSpec workSpec0, @l K k0, @l OnConstraintsStateChangedListener onConstraintsStateChangedListener0) {
        L.p(workConstraintsTracker0, "<this>");
        L.p(workSpec0, "spec");
        L.p(k0, "dispatcher");
        L.p(onConstraintsStateChangedListener0, "listener");
        I0 i00 = O0.c(null, 1, null);
        k.f(P.a(k0.plus(i00)), null, null, new o(workConstraintsTracker0, workSpec0, onConstraintsStateChangedListener0, null) {
            int k;
            final WorkConstraintsTracker l;
            final WorkSpec m;
            final OnConstraintsStateChangedListener n;

            {
                this.l = workConstraintsTracker0;
                this.m = workSpec0;
                this.n = onConstraintsStateChangedListener0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final d create(Object object0, d d0) {
                return new androidx.work.impl.constraints.WorkConstraintsTrackerKt.listen.1(this.l, this.m, this.n, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            public final Object invoke(O o0, d d0) {
                return ((androidx.work.impl.constraints.WorkConstraintsTrackerKt.listen.1)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object object0) {
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        i i0 = this.l.b(this.m);
                        androidx.work.impl.constraints.WorkConstraintsTrackerKt.listen.1.1 workConstraintsTrackerKt$listen$1$10 = new j() {
                            public final Object a(ConstraintsState constraintsState0, d d0) {
                                this.m.e(this.b, constraintsState0);
                                return S0.a;
                            }

                            @Override  // kotlinx.coroutines.flow.j
                            public Object emit(Object object0, d d0) {
                                return this.a(((ConstraintsState)object0), d0);
                            }
                        };
                        this.k = 1;
                        return i0.collect(workConstraintsTrackerKt$listen$1$10, this) == object1 ? object1 : S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }, 3, null);
        return i00;
    }
}

