package androidx.activity;

import A3.a;
import android.os.Build.VERSION;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.DoNotInline;
import androidx.annotation.MainThread;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Consumer;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.Collection;
import java.util.ListIterator;
import kotlin.S0;
import kotlin.collections.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

@s0({"SMAP\nOnBackPressedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnBackPressedDispatcher.kt\nandroidx/activity/OnBackPressedDispatcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,433:1\n1747#2,3:434\n533#2,6:437\n533#2,6:443\n533#2,6:449\n533#2,6:455\n*S KotlinDebug\n*F\n+ 1 OnBackPressedDispatcher.kt\nandroidx/activity/OnBackPressedDispatcher\n*L\n114#1:434,3\n233#1:437,6\n254#1:443,6\n274#1:449,6\n293#1:455,6\n*E\n"})
public final class OnBackPressedDispatcher {
    @RequiresApi(33)
    public static final class Api33Impl {
        @l
        public static final Api33Impl a;

        static {
            Api33Impl.a = new Api33Impl();
        }

        @DoNotInline
        @l
        public final OnBackInvokedCallback b(@l a a0) {
            L.p(a0, "onBackInvoked");
            return () -> {
                L.p(a0, "$onBackInvoked");
                a0.invoke();
            };
        }

        // 检测为 Lambda 实现
        private static final void c(a a0) [...]

        @DoNotInline
        public final void d(@l Object object0, int v, @l Object object1) {
            L.p(object0, "dispatcher");
            L.p(object1, "callback");
            ((OnBackInvokedDispatcher)object0).registerOnBackInvokedCallback(v, ((OnBackInvokedCallback)object1));
        }

        @DoNotInline
        public final void e(@l Object object0, @l Object object1) {
            L.p(object0, "dispatcher");
            L.p(object1, "callback");
            ((OnBackInvokedDispatcher)object0).unregisterOnBackInvokedCallback(((OnBackInvokedCallback)object1));
        }
    }

    @RequiresApi(34)
    public static final class Api34Impl {
        @l
        public static final Api34Impl a;

        static {
            Api34Impl.a = new Api34Impl();
        }

        @DoNotInline
        @l
        public final OnBackInvokedCallback a(@l Function1 function10, @l Function1 function11, @l a a0, @l a a1) {
            L.p(function10, "onBackStarted");
            L.p(function11, "onBackProgressed");
            L.p(a0, "onBackInvoked");
            L.p(a1, "onBackCancelled");
            return new OnBackAnimationCallback() {
                @Override  // android.window.OnBackAnimationCallback
                public void onBackCancelled() {
                    this.d.invoke();
                }

                @Override  // android.window.OnBackInvokedCallback
                public void onBackInvoked() {
                    a1.invoke();
                }

                @Override  // android.window.OnBackAnimationCallback
                public void onBackProgressed(@l BackEvent backEvent0) {
                    L.p(backEvent0, "backEvent");
                    BackEventCompat backEventCompat0 = new BackEventCompat(backEvent0);
                    a0.invoke(backEventCompat0);
                }

                @Override  // android.window.OnBackAnimationCallback
                public void onBackStarted(@l BackEvent backEvent0) {
                    L.p(backEvent0, "backEvent");
                    BackEventCompat backEventCompat0 = new BackEventCompat(backEvent0);
                    function11.invoke(backEventCompat0);
                }
            };
        }
    }

    final class LifecycleOnBackPressedCancellable implements Cancellable, LifecycleEventObserver {
        @l
        private final Lifecycle a;
        @l
        private final OnBackPressedCallback b;
        @m
        private Cancellable c;
        final OnBackPressedDispatcher d;

        public LifecycleOnBackPressedCancellable(@l Lifecycle lifecycle0, @l OnBackPressedCallback onBackPressedCallback0) {
            L.p(lifecycle0, "lifecycle");
            L.p(onBackPressedCallback0, "onBackPressedCallback");
            this.d = onBackPressedDispatcher0;
            super();
            this.a = lifecycle0;
            this.b = onBackPressedCallback0;
            lifecycle0.a(this);
        }

        @Override  // androidx.activity.Cancellable
        public void cancel() {
            this.a.d(this);
            this.b.l(this);
            Cancellable cancellable0 = this.c;
            if(cancellable0 != null) {
                cancellable0.cancel();
            }
            this.c = null;
        }

        @Override  // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(@l LifecycleOwner lifecycleOwner0, @l Event lifecycle$Event0) {
            L.p(lifecycleOwner0, "source");
            L.p(lifecycle$Event0, "event");
            if(lifecycle$Event0 == Event.ON_START) {
                this.c = this.d.j(this.b);
                return;
            }
            if(lifecycle$Event0 == Event.ON_STOP) {
                Cancellable cancellable0 = this.c;
                if(cancellable0 != null) {
                    cancellable0.cancel();
                }
            }
            else if(lifecycle$Event0 == Event.ON_DESTROY) {
                this.cancel();
            }
        }
    }

    final class OnBackPressedCancellable implements Cancellable {
        @l
        private final OnBackPressedCallback a;
        final OnBackPressedDispatcher b;

        public OnBackPressedCancellable(@l OnBackPressedCallback onBackPressedCallback0) {
            L.p(onBackPressedCallback0, "onBackPressedCallback");
            this.b = onBackPressedDispatcher0;
            super();
            this.a = onBackPressedCallback0;
        }

        @Override  // androidx.activity.Cancellable
        public void cancel() {
            this.b.c.remove(this.a);
            if(L.g(this.b.d, this.a)) {
                this.b.d = null;
            }
            this.a.l(this);
            a a0 = this.a.e();
            if(a0 != null) {
                a0.invoke();
            }
            this.a.n(null);
        }
    }

    @m
    private final Runnable a;
    @m
    private final Consumer b;
    @l
    private final k c;
    @m
    private OnBackPressedCallback d;
    @m
    private OnBackInvokedCallback e;
    @m
    private OnBackInvokedDispatcher f;
    private boolean g;
    private boolean h;

    @j
    public OnBackPressedDispatcher() {
        this(null, 1, null);
    }

    @j
    public OnBackPressedDispatcher(@m Runnable runnable0) {
        this(runnable0, null);
    }

    public OnBackPressedDispatcher(Runnable runnable0, int v, w w0) {
        if((v & 1) != 0) {
            runnable0 = null;
        }
        this(runnable0);
    }

    public OnBackPressedDispatcher(@m Runnable runnable0, @m Consumer consumer0) {
        OnBackInvokedCallback onBackInvokedCallback0;
        this.a = runnable0;
        this.b = consumer0;
        this.c = new k();
        int v = Build.VERSION.SDK_INT;
        if(v >= 33) {
            if(v >= 34) {
                androidx.activity.OnBackPressedDispatcher.1 onBackPressedDispatcher$10 = new Function1() {
                    final OnBackPressedDispatcher e;

                    {
                        this.e = onBackPressedDispatcher0;
                        super(1);
                    }

                    public final void a(@l BackEventCompat backEventCompat0) {
                        L.p(backEventCompat0, "backEvent");
                        this.e.r(backEventCompat0);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((BackEventCompat)object0));
                        return S0.a;
                    }
                };
                androidx.activity.OnBackPressedDispatcher.2 onBackPressedDispatcher$20 = new Function1() {
                    final OnBackPressedDispatcher e;

                    {
                        this.e = onBackPressedDispatcher0;
                        super(1);
                    }

                    public final void a(@l BackEventCompat backEventCompat0) {
                        L.p(backEventCompat0, "backEvent");
                        this.e.q(backEventCompat0);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((BackEventCompat)object0));
                        return S0.a;
                    }
                };
                androidx.activity.OnBackPressedDispatcher.3 onBackPressedDispatcher$30 = new a() {
                    final OnBackPressedDispatcher e;

                    {
                        this.e = onBackPressedDispatcher0;
                        super(0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        this.invoke();
                        return S0.a;
                    }

                    public final void invoke() {
                        this.e.p();
                    }
                };
                androidx.activity.OnBackPressedDispatcher.4 onBackPressedDispatcher$40 = new a() {
                    final OnBackPressedDispatcher e;

                    {
                        this.e = onBackPressedDispatcher0;
                        super(0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        this.invoke();
                        return S0.a;
                    }

                    public final void invoke() {
                        this.e.o();
                    }
                };
                onBackInvokedCallback0 = Api34Impl.a.a(onBackPressedDispatcher$10, onBackPressedDispatcher$20, onBackPressedDispatcher$30, onBackPressedDispatcher$40);
            }
            else {
                androidx.activity.OnBackPressedDispatcher.5 onBackPressedDispatcher$50 = new a() {
                    final OnBackPressedDispatcher e;

                    {
                        this.e = onBackPressedDispatcher0;
                        super(0);
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        this.invoke();
                        return S0.a;
                    }

                    public final void invoke() {
                        this.e.p();
                    }
                };
                onBackInvokedCallback0 = Api33Impl.a.b(onBackPressedDispatcher$50);
            }
            this.e = onBackInvokedCallback0;
        }
    }

    @MainThread
    public final void h(@l OnBackPressedCallback onBackPressedCallback0) {
        L.p(onBackPressedCallback0, "onBackPressedCallback");
        this.j(onBackPressedCallback0);
    }

    @MainThread
    public final void i(@l LifecycleOwner lifecycleOwner0, @l OnBackPressedCallback onBackPressedCallback0) {
        L.p(lifecycleOwner0, "owner");
        L.p(onBackPressedCallback0, "onBackPressedCallback");
        Lifecycle lifecycle0 = lifecycleOwner0.getLifecycle();
        if(lifecycle0.b() == State.a) {
            return;
        }
        onBackPressedCallback0.d(new LifecycleOnBackPressedCancellable(this, lifecycle0, onBackPressedCallback0));
        this.u();
        onBackPressedCallback0.n(new a() {
            {
                super(0, object0, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
            }

            public final void e() {
                ((OnBackPressedDispatcher)this.receiver).u();
            }

            @Override  // A3.a
            public Object invoke() {
                this.e();
                return S0.a;
            }
        });
    }

    @MainThread
    @l
    public final Cancellable j(@l OnBackPressedCallback onBackPressedCallback0) {
        L.p(onBackPressedCallback0, "onBackPressedCallback");
        this.c.add(onBackPressedCallback0);
        Cancellable cancellable0 = new OnBackPressedCancellable(this, onBackPressedCallback0);
        onBackPressedCallback0.d(cancellable0);
        this.u();
        onBackPressedCallback0.n(new a() {
            {
                super(0, object0, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
            }

            public final void e() {
                ((OnBackPressedDispatcher)this.receiver).u();
            }

            @Override  // A3.a
            public Object invoke() {
                this.e();
                return S0.a;
            }
        });
        return cancellable0;
    }

    @MainThread
    @VisibleForTesting
    public final void k() {
        this.o();
    }

    @MainThread
    @VisibleForTesting
    public final void l(@l BackEventCompat backEventCompat0) {
        L.p(backEventCompat0, "backEvent");
        this.q(backEventCompat0);
    }

    @MainThread
    @VisibleForTesting
    public final void m(@l BackEventCompat backEventCompat0) {
        L.p(backEventCompat0, "backEvent");
        this.r(backEventCompat0);
    }

    @MainThread
    public final boolean n() {
        return this.h;
    }

    @MainThread
    private final void o() {
        if(this.d == null) {
            Object object0 = null;
            ListIterator listIterator0 = this.c.listIterator(this.c.size());
            while(listIterator0.hasPrevious()) {
                Object object1 = listIterator0.previous();
                if(((OnBackPressedCallback)object1).j()) {
                    object0 = object1;
                    break;
                }
            }
            OnBackPressedCallback onBackPressedCallback0 = (OnBackPressedCallback)object0;
        }
        this.d = null;
    }

    @MainThread
    public final void p() {
        OnBackPressedCallback onBackPressedCallback0 = this.d;
        if(onBackPressedCallback0 == null) {
            Object object0 = null;
            ListIterator listIterator0 = this.c.listIterator(this.c.size());
            while(listIterator0.hasPrevious()) {
                Object object1 = listIterator0.previous();
                if(((OnBackPressedCallback)object1).j()) {
                    object0 = object1;
                    break;
                }
            }
            onBackPressedCallback0 = (OnBackPressedCallback)object0;
        }
        this.d = null;
        if(onBackPressedCallback0 != null) {
            onBackPressedCallback0.g();
            return;
        }
        Runnable runnable0 = this.a;
        if(runnable0 != null) {
            runnable0.run();
        }
    }

    @MainThread
    private final void q(BackEventCompat backEventCompat0) {
        OnBackPressedCallback onBackPressedCallback0 = this.d;
        if(onBackPressedCallback0 == null) {
            Object object0 = null;
            ListIterator listIterator0 = this.c.listIterator(this.c.size());
            while(listIterator0.hasPrevious()) {
                Object object1 = listIterator0.previous();
                if(((OnBackPressedCallback)object1).j()) {
                    object0 = object1;
                    break;
                }
            }
            onBackPressedCallback0 = (OnBackPressedCallback)object0;
        }
        if(onBackPressedCallback0 != null) {
            onBackPressedCallback0.h(backEventCompat0);
        }
    }

    @MainThread
    private final void r(BackEventCompat backEventCompat0) {
        Object object0 = null;
        ListIterator listIterator0 = this.c.listIterator(this.c.size());
        while(listIterator0.hasPrevious()) {
            Object object1 = listIterator0.previous();
            if(((OnBackPressedCallback)object1).j()) {
                object0 = object1;
                break;
            }
        }
        if(this.d != null) {
            this.o();
        }
        this.d = (OnBackPressedCallback)object0;
        if(((OnBackPressedCallback)object0) != null) {
            ((OnBackPressedCallback)object0).i(backEventCompat0);
        }
    }

    @RequiresApi(33)
    public final void s(@l OnBackInvokedDispatcher onBackInvokedDispatcher0) {
        L.p(onBackInvokedDispatcher0, "invoker");
        this.f = onBackInvokedDispatcher0;
        this.t(this.h);
    }

    @RequiresApi(33)
    private final void t(boolean z) {
        OnBackInvokedDispatcher onBackInvokedDispatcher0 = this.f;
        OnBackInvokedCallback onBackInvokedCallback0 = this.e;
        if(onBackInvokedDispatcher0 != null && onBackInvokedCallback0 != null) {
            if(z && !this.g) {
                Api33Impl.a.d(onBackInvokedDispatcher0, 0, onBackInvokedCallback0);
                this.g = true;
                return;
            }
            if(!z && this.g) {
                Api33Impl.a.e(onBackInvokedDispatcher0, onBackInvokedCallback0);
                this.g = false;
            }
        }
    }

    private final void u() {
        boolean z = this.h;
        k k0 = this.c;
        boolean z1 = false;
        if(!(k0 instanceof Collection) || !k0.isEmpty()) {
            for(Object object0: k0) {
                if(((OnBackPressedCallback)object0).j()) {
                    z1 = true;
                    break;
                }
                if(false) {
                    break;
                }
            }
        }
        this.h = z1;
        if(z1 != z) {
            Consumer consumer0 = this.b;
            if(consumer0 != null) {
                consumer0.accept(Boolean.valueOf(z1));
            }
            if(Build.VERSION.SDK_INT >= 33) {
                this.t(z1);
            }
        }
    }
}

