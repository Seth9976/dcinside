package androidx.compose.ui.platform;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.channels.F;
import kotlinx.coroutines.channels.n;
import kotlinx.coroutines.channels.o;
import kotlinx.coroutines.channels.r;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;

public final class GlobalSnapshotManager {
    @l
    public static final GlobalSnapshotManager a;
    @l
    private static final AtomicBoolean b;

    static {
        GlobalSnapshotManager.a = new GlobalSnapshotManager();
        GlobalSnapshotManager.b = new AtomicBoolean(false);
    }

    public final void a() {
        if(GlobalSnapshotManager.b.compareAndSet(false, true)) {
            kotlinx.coroutines.channels.l l0 = o.d(-1, null, null, 6, null);
            k.f(P.a(AndroidUiDispatcher.l.b()), null, null, new A3.o(null) {
                Object k;
                Object l;
                int m;
                final kotlinx.coroutines.channels.l n;

                {
                    this.n = l0;
                    super(2, d0);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @l
                public final d create(@m Object object0, @l d d0) {
                    return new androidx.compose.ui.platform.GlobalSnapshotManager.ensureStarted.1(this.n, d0);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.invoke(((O)object0), ((d)object1));
                }

                @m
                public final Object invoke(@l O o0, @m d d0) {
                    return ((androidx.compose.ui.platform.GlobalSnapshotManager.ensureStarted.1)this.create(o0, d0)).invokeSuspend(S0.a);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    n n0;
                    F f0;
                    Object object1 = b.l();
                    switch(this.m) {
                        case 0: {
                            f0.n(object0);
                            f0 = this.n;
                            try {
                                n0 = f0.iterator();
                                goto label_13;
                            }
                            catch(Throwable throwable0) {
                                break;
                            }
                        }
                        case 1: {
                            n0 = (n)this.l;
                            f0 = (F)this.k;
                            try {
                                f0.n(object0);
                                while(true) {
                                    if(!((Boolean)object0).booleanValue()) {
                                        goto label_22;
                                    }
                                    S0 s00 = (S0)n0.next();
                                    Snapshot.e.l();
                                label_13:
                                    this.k = f0;
                                    this.l = n0;
                                    this.m = 1;
                                    object0 = n0.b(this);
                                    if(object0 != object1) {
                                        continue;
                                    }
                                    return object1;
                                }
                            }
                            catch(Throwable throwable0) {
                                break;
                            }
                        }
                        default: {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                    }
                    r.b(f0, throwable0);
                    throw throwable0;
                label_22:
                    r.b(f0, null);
                    return S0.a;
                }
            }, 3, null);
            androidx.compose.ui.platform.GlobalSnapshotManager.ensureStarted.2 globalSnapshotManager$ensureStarted$20 = new Function1() {
                final kotlinx.coroutines.channels.l e;

                {
                    this.e = l0;
                    super(1);
                }

                public final void a(@l Object object0) {
                    L.p(object0, "it");
                    this.e.l(S0.a);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.a(object0);
                    return S0.a;
                }
            };
            Snapshot.e.i(globalSnapshotManager$ensureStarted$20);
        }
    }
}

