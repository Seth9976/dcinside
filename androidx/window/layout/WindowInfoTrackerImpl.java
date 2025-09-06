package androidx.window.layout;

import A3.o;
import android.app.Activity;
import androidx.core.util.Consumer;
import androidx.media3.exoplayer.dash.offline.a;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.channels.n;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.k;
import y4.l;
import y4.m;

public final class WindowInfoTrackerImpl implements WindowInfoTracker {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    @l
    private final WindowMetricsCalculator b;
    @l
    private final WindowBackend c;
    @l
    public static final Companion d = null;
    private static final int e = 10;

    static {
        WindowInfoTrackerImpl.d = new Companion(null);
    }

    public WindowInfoTrackerImpl(@l WindowMetricsCalculator windowMetricsCalculator0, @l WindowBackend windowBackend0) {
        L.p(windowMetricsCalculator0, "windowMetricsCalculator");
        L.p(windowBackend0, "windowBackend");
        super();
        this.b = windowMetricsCalculator0;
        this.c = windowBackend0;
    }

    @Override  // androidx.window.layout.WindowInfoTracker
    @l
    public i a(@l Activity activity0) {
        L.p(activity0, "activity");
        return k.I0(new o(activity0, null) {
            Object k;
            Object l;
            int m;
            private Object n;
            final WindowInfoTrackerImpl o;
            final Activity p;

            {
                this.o = windowInfoTrackerImpl0;
                this.p = activity0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.window.layout.WindowInfoTrackerImpl.windowLayoutInfo.1(this.o, this.p, d0);
                d1.n = object0;
                return d1;
            }

            // 检测为 Lambda 实现
            private static final void f(kotlinx.coroutines.channels.l l0, WindowLayoutInfo windowLayoutInfo0) [...]

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((j)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l j j0, @m d d0) {
                return ((androidx.window.layout.WindowInfoTrackerImpl.windowLayoutInfo.1)this.create(j0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                j j1;
                n n0;
                Consumer consumer0;
                j j0;
                Object object1 = b.l();
                switch(this.m) {
                    case 0: {
                        f0.n(object0);
                        j0 = (j)this.n;
                        kotlinx.coroutines.channels.l l0 = kotlinx.coroutines.channels.o.d(10, kotlinx.coroutines.channels.i.b, null, 4, null);
                        consumer0 = (WindowLayoutInfo windowLayoutInfo0) -> {
                            L.o(windowLayoutInfo0, "info");
                            l0.l(windowLayoutInfo0);
                        };
                        a a0 = new a();
                        this.o.c.a(this.p, a0, consumer0);
                        try {
                            n0 = l0.iterator();
                            goto label_21;
                        }
                        catch(Throwable throwable0) {
                            break;
                        }
                    }
                    case 1: {
                        n0 = (n)this.l;
                        consumer0 = (Consumer)this.k;
                        j1 = (j)this.n;
                        try {
                            f0.n(object0);
                            goto label_30;
                        }
                        catch(Throwable throwable0) {
                            break;
                        }
                    }
                    case 2: {
                        n0 = (n)this.l;
                        consumer0 = (Consumer)this.k;
                        j1 = (j)this.n;
                        try {
                            f0.n(object0);
                            while(true) {
                                j0 = j1;
                            label_21:
                                this.n = j0;
                                this.k = consumer0;
                                this.l = n0;
                                this.m = 1;
                                Object object2 = n0.b(this);
                                if(object2 == object1) {
                                    return object1;
                                }
                                j1 = j0;
                                object0 = object2;
                            label_30:
                                if(!((Boolean)object0).booleanValue()) {
                                    goto label_42;
                                }
                                WindowLayoutInfo windowLayoutInfo0 = (WindowLayoutInfo)n0.next();
                                this.n = j1;
                                this.k = consumer0;
                                this.l = n0;
                                this.m = 2;
                                if(j1.emit(windowLayoutInfo0, this) != object1) {
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
                this.o.c.b(consumer0);
                throw throwable0;
            label_42:
                this.o.c.b(consumer0);
                return S0.a;
            }
        });
    }
}

