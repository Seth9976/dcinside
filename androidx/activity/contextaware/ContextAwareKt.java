package androidx.activity.contextaware;

import android.content.Context;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.h;
import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.o;
import kotlinx.coroutines.p;
import y4.l;
import y4.m;

@s0({"SMAP\nContextAware.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextAware.kt\nandroidx/activity/contextaware/ContextAwareKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,94:1\n314#2,11:95\n*S KotlinDebug\n*F\n+ 1 ContextAware.kt\nandroidx/activity/contextaware/ContextAwareKt\n*L\n81#1:95,11\n*E\n"})
public final class ContextAwareKt {
    @m
    public static final Object a(@l ContextAware contextAware0, @l Function1 function10, @l d d0) {
        Context context0 = contextAware0.peekAvailableContext();
        if(context0 != null) {
            return function10.invoke(context0);
        }
        p p0 = new p(b.e(d0), 1);
        p0.c0();
        androidx.activity.contextaware.ContextAwareKt.withContextAvailable.2.listener.1 contextAwareKt$withContextAvailable$2$listener$10 = new OnContextAvailableListener() {
            @Override  // androidx.activity.contextaware.OnContextAvailableListener
            public void a(@l Context context0) {
                Object object0;
                L.p(context0, "context");
                o o0 = p0;
                try {
                    object0 = e0.b(function10.invoke(context0));
                }
                catch(Throwable throwable0) {
                    object0 = e0.b(f0.a(throwable0));
                }
                o0.resumeWith(object0);
            }
        };
        contextAware0.addOnContextAvailableListener(contextAwareKt$withContextAvailable$2$listener$10);
        p0.K(new Function1(contextAware0, contextAwareKt$withContextAvailable$2$listener$10) {
            final ContextAware e;
            final androidx.activity.contextaware.ContextAwareKt.withContextAvailable.2.listener.1 f;

            {
                this.e = contextAware0;
                this.f = contextAwareKt$withContextAvailable$2$listener$10;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Throwable)object0));
                return S0.a;
            }

            public final void invoke(@m Throwable throwable0) {
                this.e.removeOnContextAvailableListener(this.f);
            }
        });
        Object object0 = p0.x();
        if(object0 == b.l()) {
            h.c(d0);
        }
        return object0;
    }

    private static final Object b(ContextAware contextAware0, Function1 function10, d d0) {
        Context context0 = contextAware0.peekAvailableContext();
        if(context0 != null) {
            return function10.invoke(context0);
        }
        p p0 = new p(b.e(d0), 1);
        p0.c0();
        androidx.activity.contextaware.ContextAwareKt.withContextAvailable.2.listener.1 contextAwareKt$withContextAvailable$2$listener$10 = new androidx.activity.contextaware.ContextAwareKt.withContextAvailable.2.listener.1(p0, function10);
        contextAware0.addOnContextAvailableListener(contextAwareKt$withContextAvailable$2$listener$10);
        p0.K(new androidx.activity.contextaware.ContextAwareKt.withContextAvailable.2.1(contextAware0, contextAwareKt$withContextAvailable$2$listener$10));
        Object object0 = p0.x();
        if(object0 == b.l()) {
            h.c(d0);
        }
        return object0;
    }
}

