package com.unity3d.services.core.extensions;

import A3.o;
import com.unity3d.services.core.log.DeviceLog;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.internal.l0.g;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.a0;
import y4.l;
import y4.m;

@s0({"SMAP\nTaskExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskExtensions.kt\ncom/unity3d/services/core/extensions/TaskExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,40:1\n1#2:41\n*E\n"})
public final class TaskExtensionsKt {
    @m
    public static final Object withRetry(long v, int v1, double f, @l Exception exception0, @l o o0, @l d d0) {
        Object object2;
        Exception exception3;
        o o3;
        g l0$g3;
        long v12;
        int v11;
        double f3;
        int v10;
        Exception exception2;
        o o2;
        g l0$g2;
        long v9;
        int v8;
        double f2;
        int v7;
        int v6;
        int v5;
        int v4;
        com.unity3d.services.core.extensions.TaskExtensionsKt.withRetry.1 taskExtensionsKt$withRetry$11;
        g l0$g1;
        o o1;
        Exception exception1;
        double f1;
        long v3;
        com.unity3d.services.core.extensions.TaskExtensionsKt.withRetry.1 taskExtensionsKt$withRetry$10;
        if(d0 instanceof com.unity3d.services.core.extensions.TaskExtensionsKt.withRetry.1) {
            taskExtensionsKt$withRetry$10 = (com.unity3d.services.core.extensions.TaskExtensionsKt.withRetry.1)d0;
            int v2 = taskExtensionsKt$withRetry$10.label;
            if((v2 & 0x80000000) == 0) {
                taskExtensionsKt$withRetry$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                    double D$0;
                    int I$0;
                    int I$1;
                    int I$2;
                    long J$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return TaskExtensionsKt.withRetry(0L, 0, 0.0, null, null, this);
                    }
                };
            }
            else {
                taskExtensionsKt$withRetry$10.label = v2 ^ 0x80000000;
            }
        }
        else {
            taskExtensionsKt$withRetry$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                double D$0;
                int I$0;
                int I$1;
                int I$2;
                long J$0;
                Object L$0;
                Object L$1;
                Object L$2;
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return TaskExtensionsKt.withRetry(0L, 0, 0.0, null, null, this);
                }
            };
        }
        Object object0 = taskExtensionsKt$withRetry$10.result;
        Object object1 = b.l();
        switch(taskExtensionsKt$withRetry$10.label) {
            case 0: {
                f0.n(object0);
                g l0$g0 = new g();
                v3 = v;
                l0$g0.a = v3;
                f1 = f;
                exception1 = exception0;
                o1 = o0;
                l0$g1 = l0$g0;
                taskExtensionsKt$withRetry$11 = taskExtensionsKt$withRetry$10;
                v4 = 0;
                v5 = v1;
                goto label_53;
            }
            case 1: {
                v6 = taskExtensionsKt$withRetry$10.I$2;
                v7 = taskExtensionsKt$withRetry$10.I$1;
                f2 = taskExtensionsKt$withRetry$10.D$0;
                v8 = taskExtensionsKt$withRetry$10.I$0;
                v9 = taskExtensionsKt$withRetry$10.J$0;
                l0$g2 = (g)taskExtensionsKt$withRetry$10.L$2;
                o2 = (o)taskExtensionsKt$withRetry$10.L$1;
                exception2 = (Exception)taskExtensionsKt$withRetry$10.L$0;
                try {
                    f0.n(object0);
                    object2 = object0;
                    goto label_91;
                }
                catch(Throwable throwable0) {
                    goto label_90;
                }
            }
            case 2: {
                v10 = taskExtensionsKt$withRetry$10.I$1;
                f3 = taskExtensionsKt$withRetry$10.D$0;
                v11 = taskExtensionsKt$withRetry$10.I$0;
                v12 = taskExtensionsKt$withRetry$10.J$0;
                l0$g3 = (g)taskExtensionsKt$withRetry$10.L$2;
                o3 = (o)taskExtensionsKt$withRetry$10.L$1;
                exception3 = (Exception)taskExtensionsKt$withRetry$10.L$0;
                f0.n(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    alab1:
        while(true) {
            l0$g3.a = (long)(((double)v12) * f3);
            taskExtensionsKt$withRetry$11 = taskExtensionsKt$withRetry$10;
            v5 = v11;
            l0$g2 = l0$g3;
            o1 = o3;
            f1 = f3;
            v3 = v12;
            while(true) {
                exception1 = exception3;
                l0$g1 = l0$g2;
                v4 = v10 + 1;
            label_53:
                if(v4 >= v5) {
                    throw new IllegalStateException("Unknown exception from withRetry");
                }
                try {
                    taskExtensionsKt$withRetry$11.L$0 = exception1;
                    taskExtensionsKt$withRetry$11.L$1 = o1;
                    taskExtensionsKt$withRetry$11.L$2 = l0$g1;
                    taskExtensionsKt$withRetry$11.J$0 = v3;
                    taskExtensionsKt$withRetry$11.I$0 = v5;
                    taskExtensionsKt$withRetry$11.D$0 = f1;
                    taskExtensionsKt$withRetry$11.I$1 = v4;
                    taskExtensionsKt$withRetry$11.I$2 = v4;
                    taskExtensionsKt$withRetry$11.label = 1;
                    object0 = o1.invoke(kotlin.coroutines.jvm.internal.b.f(v4), taskExtensionsKt$withRetry$11);
                }
                catch(Throwable throwable0) {
                    exception2 = exception1;
                    v6 = v4;
                    l0$g2 = l0$g1;
                    o2 = o1;
                    v8 = v5;
                    taskExtensionsKt$withRetry$10 = taskExtensionsKt$withRetry$11;
                    v9 = v3;
                    f2 = f1;
                    v7 = v6;
                    goto label_90;
                }
                if(object0 == object1) {
                    return object1;
                }
                exception2 = exception1;
                v6 = v4;
                l0$g2 = l0$g1;
                o2 = o1;
                v8 = v5;
                taskExtensionsKt$withRetry$10 = taskExtensionsKt$withRetry$11;
                v9 = v3;
                f2 = f1;
                v7 = v6;
                try {
                    object2 = object0;
                    goto label_91;
                }
                catch(Throwable throwable0) {
                }
            label_90:
                object2 = e0.b(f0.a(throwable0));
            label_91:
                v10 = v7;
                if(e0.j(object2)) {
                    f0.n(object2);
                    return object2;
                }
                if(e0.i(object2)) {
                    Throwable throwable1 = e0.e(object2);
                    if(throwable1 instanceof AbortRetryException) {
                        throw throwable1;
                    }
                    if(v6 + 1 == v8) {
                        break alab1;
                    }
                    DeviceLog.debug(("Unity Ads init: retrying in " + l0$g2.a + " milliseconds"));
                    taskExtensionsKt$withRetry$10.L$0 = exception2;
                    taskExtensionsKt$withRetry$10.L$1 = o2;
                    taskExtensionsKt$withRetry$10.L$2 = l0$g2;
                    taskExtensionsKt$withRetry$10.J$0 = v9;
                    taskExtensionsKt$withRetry$10.I$0 = v8;
                    taskExtensionsKt$withRetry$10.D$0 = f2;
                    taskExtensionsKt$withRetry$10.I$1 = v10;
                    taskExtensionsKt$withRetry$10.label = 2;
                    if(a0.b(l0$g2.a, taskExtensionsKt$withRetry$10) == object1) {
                        return object1;
                    }
                    f3 = f2;
                    v11 = v8;
                    v12 = v9;
                    l0$g3 = l0$g2;
                    o3 = o2;
                    exception3 = exception2;
                    break;
                }
                taskExtensionsKt$withRetry$11 = taskExtensionsKt$withRetry$10;
                v5 = v8;
                o1 = o2;
                exception3 = exception2;
                f1 = f2;
                v3 = v9;
            }
        }
        throw exception2;
    }

    public static Object withRetry$default(long v, int v1, double f, Exception exception0, o o0, d d0, int v2, Object object0) {
        long v3 = (v2 & 1) == 0 ? v : 5000L;
        int v4 = (v2 & 2) == 0 ? v1 : 6;
        return (v2 & 4) == 0 ? TaskExtensionsKt.withRetry(v3, v4, f, exception0, o0, d0) : TaskExtensionsKt.withRetry(v3, v4, 2.0, exception0, o0, d0);
    }
}

