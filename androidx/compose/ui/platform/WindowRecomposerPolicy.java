package androidx.compose.ui.platform;

import A3.o;
import android.os.Handler;
import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import androidx.compose.animation.core.d;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.InternalComposeUiApi;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.S0;
import kotlin.b0;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.I0.a;
import kotlinx.coroutines.O;
import kotlinx.coroutines.android.e;
import kotlinx.coroutines.android.g;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
@InternalComposeUiApi
public final class WindowRecomposerPolicy {
    @l
    public static final WindowRecomposerPolicy a;
    @l
    private static final AtomicReference b;
    public static final int c;

    static {
        WindowRecomposerPolicy.a = new WindowRecomposerPolicy();
        WindowRecomposerPolicy.b = new AtomicReference(WindowRecomposerFactory.a.a());
        WindowRecomposerPolicy.c = 8;
    }

    @b0
    public final boolean a(@l WindowRecomposerFactory windowRecomposerFactory0, @l WindowRecomposerFactory windowRecomposerFactory1) {
        L.p(windowRecomposerFactory0, "expected");
        L.p(windowRecomposerFactory1, "factory");
        return d.a(WindowRecomposerPolicy.b, windowRecomposerFactory0, windowRecomposerFactory1);
    }

    @l
    public final Recomposer b(@l View view0) {
        L.p(view0, "rootView");
        Recomposer recomposer0 = ((WindowRecomposerFactory)WindowRecomposerPolicy.b.get()).a(view0);
        WindowRecomposer_androidKt.j(view0, recomposer0);
        Handler handler0 = view0.getHandler();
        L.o(handler0, "rootView.handler");
        e e0 = g.i(handler0, "windowRecomposer cleanup").Q1();
        androidx.compose.ui.platform.WindowRecomposerPolicy.createAndInstallWindowRecomposer.unsetJob.1 windowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$10 = new o(view0, null) {
            int k;
            final Recomposer l;
            final View m;

            {
                this.l = recomposer0;
                this.m = view0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new androidx.compose.ui.platform.WindowRecomposerPolicy.createAndInstallWindowRecomposer.unsetJob.1(this.l, this.m, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((androidx.compose.ui.platform.WindowRecomposerPolicy.createAndInstallWindowRecomposer.unsetJob.1)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        try {
                            this.k = 1;
                            if(this.l.x0(this) == object1) {
                                return object1;
                            label_7:
                                f0.n(object0);
                            }
                            break;
                        }
                        catch(Throwable throwable0) {
                            goto label_10;
                        }
                    }
                    case 1: {
                        goto label_7;
                    label_10:
                        if(WindowRecomposer_androidKt.f(this.m) == this.l) {
                            WindowRecomposer_androidKt.j(this.m, null);
                        }
                        throw throwable0;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                if(WindowRecomposer_androidKt.f(this.m) == this.l) {
                    WindowRecomposer_androidKt.j(this.m, null);
                }
                return S0.a;
            }
        };
        view0.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewAttachedToWindow(@l View view0) {
                L.p(view0, "v");
            }

            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewDetachedFromWindow(@l View view0) {
                L.p(view0, "v");
                view0.removeOnAttachStateChangeListener(this);
                a.b(this.a, null, 1, null);
            }
        });
        return recomposer0;
    }

    @b0
    @l
    public final WindowRecomposerFactory c(@l WindowRecomposerFactory windowRecomposerFactory0) {
        L.p(windowRecomposerFactory0, "factory");
        Object object0 = WindowRecomposerPolicy.b.getAndSet(windowRecomposerFactory0);
        L.o(object0, "factory.getAndSet(factory)");
        return (WindowRecomposerFactory)object0;
    }

    public final void d(@l WindowRecomposerFactory windowRecomposerFactory0) {
        L.p(windowRecomposerFactory0, "factory");
        WindowRecomposerPolicy.b.set(windowRecomposerFactory0);
    }

    public final Object e(@l WindowRecomposerFactory windowRecomposerFactory0, @l A3.a a0) {
        Object object0;
        L.p(windowRecomposerFactory0, "factory");
        L.p(a0, "block");
        WindowRecomposerFactory windowRecomposerFactory1 = this.c(windowRecomposerFactory0);
        try {
            object0 = a0.invoke();
        }
        catch(Throwable throwable0) {
            if(this.a(windowRecomposerFactory0, windowRecomposerFactory1)) {
                throw throwable0;
            }
            kotlin.o.a(throwable0, new IllegalStateException("WindowRecomposerFactory was set to unexpected value; cannot safely restore old state"));
            throw throwable0;
        }
        if(!this.a(windowRecomposerFactory0, windowRecomposerFactory1)) {
            throw new IllegalStateException("WindowRecomposerFactory was set to unexpected value; cannot safely restore old state");
        }
        return object0;
    }
}

