package androidx.work.impl;

import A3.o;
import A3.q;
import android.content.Context;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.utils.PackageManagerHelper;
import androidx.work.impl.utils.ProcessUtils;
import java.util.concurrent.TimeUnit;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.O;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.k;
import y4.l;

public final class UnfinishedWorkListenerKt {
    @l
    private static final String a = null;
    private static final int b = 30000;
    private static final long c;

    static {
        L.o("WM-UnfinishedWorkListen", "tagWithPrefix(\"UnfinishedWorkListener\")");
        UnfinishedWorkListenerKt.a = "WM-UnfinishedWorkListen";
        UnfinishedWorkListenerKt.c = TimeUnit.HOURS.toMillis(1L);
    }

    public static final long a() [...] // 潜在的解密器

    // 去混淆评级： 低(20)
    public static final String b() [...] // 潜在的解密器

    public static final void c(@l O o0, @l Context context0, @l Configuration configuration0, @l WorkDatabase workDatabase0) {
        L.p(o0, "<this>");
        L.p(context0, "appContext");
        L.p(configuration0, "configuration");
        L.p(workDatabase0, "db");
        if(ProcessUtils.b(context0, configuration0)) {
            k.U0(k.e1(k.g0(k.W(k.x1(workDatabase0.Z().L(), new q(null) {
                int k;
                Object l;
                long m;

                {
                    super(4, d0);
                }

                @Override  // A3.q
                public Object T0(Object object0, Object object1, Object object2, Object object3) {
                    return this.a(((j)object0), ((Throwable)object1), ((Number)object2).longValue(), ((d)object3));
                }

                public final Object a(j j0, Throwable throwable0, long v, d d0) {
                    androidx.work.impl.UnfinishedWorkListenerKt.maybeLaunchUnfinishedWorkListener.1 unfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$10 = new androidx.work.impl.UnfinishedWorkListenerKt.maybeLaunchUnfinishedWorkListener.1(d0);
                    unfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$10.l = throwable0;
                    unfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$10.m = v;
                    return unfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$10.invokeSuspend(S0.a);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object object0) {
                    Object object1 = b.l();
                    switch(this.k) {
                        case 0: {
                            f0.n(object0);
                            Throwable throwable0 = (Throwable)this.l;
                            long v = this.m;
                            Logger.e().d("WM-UnfinishedWorkListen", "Cannot check for unfinished work", throwable0);
                            this.k = 1;
                            return a0.b(Math.min(v * 30000L, 3600000L), this) == object1 ? object1 : kotlin.coroutines.jvm.internal.b.a(true);
                        }
                        case 1: {
                            f0.n(object0);
                            return kotlin.coroutines.jvm.internal.b.a(true);
                        }
                        default: {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                    }
                }
            }))), new o(context0, null) {
                int k;
                boolean l;
                final Context m;

                {
                    this.m = context0;
                    super(2, d0);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                public final d create(Object object0, d d0) {
                    d d1 = new androidx.work.impl.UnfinishedWorkListenerKt.maybeLaunchUnfinishedWorkListener.2(this.m, d0);
                    d1.l = ((Boolean)object0).booleanValue();
                    return d1;
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.invoke(((Boolean)object0).booleanValue(), ((d)object1));
                }

                public final Object invoke(boolean z, d d0) {
                    return ((androidx.work.impl.UnfinishedWorkListenerKt.maybeLaunchUnfinishedWorkListener.2)this.create(Boolean.valueOf(z), d0)).invokeSuspend(S0.a);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object object0) {
                    if(this.k != 0) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                    f0.n(object0);
                    PackageManagerHelper.e(this.m, RescheduleReceiver.class, this.l);
                    return S0.a;
                }
            }), o0);
        }
    }
}

