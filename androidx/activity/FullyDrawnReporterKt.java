package androidx.activity;

import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import y4.l;
import y4.m;

public final class FullyDrawnReporterKt {
    @m
    public static final Object a(@l FullyDrawnReporter fullyDrawnReporter0, @l Function1 function10, @l d d0) {
        androidx.activity.FullyDrawnReporterKt.reportWhenComplete.1 fullyDrawnReporterKt$reportWhenComplete$10;
        if(d0 instanceof androidx.activity.FullyDrawnReporterKt.reportWhenComplete.1) {
            fullyDrawnReporterKt$reportWhenComplete$10 = (androidx.activity.FullyDrawnReporterKt.reportWhenComplete.1)d0;
            int v = fullyDrawnReporterKt$reportWhenComplete$10.m;
            if((v & 0x80000000) == 0) {
                fullyDrawnReporterKt$reportWhenComplete$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                    Object k;
                    Object l;
                    int m;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.l = object0;
                        this.m |= 0x80000000;
                        return FullyDrawnReporterKt.a(null, null, this);
                    }
                };
            }
            else {
                fullyDrawnReporterKt$reportWhenComplete$10.m = v ^ 0x80000000;
            }
        }
        else {
            fullyDrawnReporterKt$reportWhenComplete$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                Object k;
                Object l;
                int m;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.l = object0;
                    this.m |= 0x80000000;
                    return FullyDrawnReporterKt.a(null, null, this);
                }
            };
        }
        Object object0 = fullyDrawnReporterKt$reportWhenComplete$10.l;
        Object object1 = b.l();
        switch(fullyDrawnReporterKt$reportWhenComplete$10.m) {
            case 0: {
                f0.n(object0);
                fullyDrawnReporter0.c();
                if(fullyDrawnReporter0.e()) {
                    return S0.a;
                }
                try {
                    fullyDrawnReporterKt$reportWhenComplete$10.k = fullyDrawnReporter0;
                    fullyDrawnReporterKt$reportWhenComplete$10.m = 1;
                    if(function10.invoke(fullyDrawnReporterKt$reportWhenComplete$10) == object1) {
                        return object1;
                    }
                    break;
                }
                catch(Throwable throwable0) {
                    fullyDrawnReporter0.h();
                    throw throwable0;
                }
            }
            case 1: {
                fullyDrawnReporter0 = (FullyDrawnReporter)fullyDrawnReporterKt$reportWhenComplete$10.k;
                try {
                    f0.n(object0);
                    break;
                }
                catch(Throwable throwable0) {
                    fullyDrawnReporter0.h();
                    throw throwable0;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        fullyDrawnReporter0.h();
        return S0.a;
    }

    private static final Object b(FullyDrawnReporter fullyDrawnReporter0, Function1 function10, d d0) {
        fullyDrawnReporter0.c();
        if(fullyDrawnReporter0.e()) {
            return S0.a;
        }
        try {
            function10.invoke(d0);
            return S0.a;
        }
        finally {
            fullyDrawnReporter0.h();
        }
    }
}

