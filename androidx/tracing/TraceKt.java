package androidx.tracing;

import A3.a;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class TraceKt {
    public static final Object a(@l a a0, @l a a1) {
        Object object0;
        L.p(a0, "lazyLabel");
        L.p(a1, "block");
        boolean z = Trace.i();
        if(z) {
            Trace.c(((String)a0.invoke()));
        }
        try {
            object0 = a1.invoke();
        }
        catch(Throwable throwable0) {
            if(z) {
                Trace.f();
            }
            throw throwable0;
        }
        if(z) {
            Trace.f();
        }
        return object0;
    }

    public static final Object b(@l String s, @l a a0) {
        L.p(s, "label");
        L.p(a0, "block");
        Trace.c(s);
        try {
            return a0.invoke();
        }
        finally {
            Trace.f();
        }
    }

    public static final Object c(@l a a0, @l a a1, @l a a2) {
        Object object0;
        int v;
        String s;
        L.p(a0, "lazyMethodName");
        L.p(a1, "lazyCookie");
        L.p(a2, "block");
        if(Trace.i()) {
            s = (String)a0.invoke();
            v = ((Number)a1.invoke()).intValue();
            Trace.a(s, v);
        }
        else {
            s = null;
            v = 0;
        }
        try {
            object0 = a2.invoke();
        }
        catch(Throwable throwable0) {
            if(s != null) {
                Trace.d(s, v);
            }
            throw throwable0;
        }
        if(s != null) {
            Trace.d(s, v);
        }
        return object0;
    }

    @m
    public static final Object d(@l String s, int v, @l Function1 function10, @l d d0) {
        androidx.tracing.TraceKt.traceAsync.1 traceKt$traceAsync$10;
        if(d0 instanceof androidx.tracing.TraceKt.traceAsync.1) {
            traceKt$traceAsync$10 = (androidx.tracing.TraceKt.traceAsync.1)d0;
            int v1 = traceKt$traceAsync$10.n;
            if((v1 & 0x80000000) == 0) {
                traceKt$traceAsync$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                    Object k;
                    int l;
                    Object m;
                    int n;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.m = object0;
                        this.n |= 0x80000000;
                        return TraceKt.d(null, 0, null, this);
                    }
                };
            }
            else {
                traceKt$traceAsync$10.n = v1 ^ 0x80000000;
            }
        }
        else {
            traceKt$traceAsync$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                Object k;
                int l;
                Object m;
                int n;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.m = object0;
                    this.n |= 0x80000000;
                    return TraceKt.d(null, 0, null, this);
                }
            };
        }
        Object object0 = traceKt$traceAsync$10.m;
        Object object1 = b.l();
        switch(traceKt$traceAsync$10.n) {
            case 0: {
                f0.n(object0);
                Trace.a(s, v);
                try {
                    traceKt$traceAsync$10.k = s;
                    traceKt$traceAsync$10.l = v;
                    traceKt$traceAsync$10.n = 1;
                    object0 = function10.invoke(traceKt$traceAsync$10);
                    if(object0 == object1) {
                        return object1;
                    }
                    break;
                }
                catch(Throwable throwable0) {
                    Trace.d(s, v);
                    throw throwable0;
                }
            }
            case 1: {
                v = traceKt$traceAsync$10.l;
                s = (String)traceKt$traceAsync$10.k;
                try {
                    f0.n(object0);
                    break;
                }
                catch(Throwable throwable0) {
                    Trace.d(s, v);
                    throw throwable0;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Trace.d(s, v);
        return object0;
    }

    private static final Object e(String s, int v, Function1 function10, d d0) {
        Trace.a(s, v);
        try {
            return function10.invoke(d0);
        }
        finally {
            Trace.d(s, v);
        }
    }
}

