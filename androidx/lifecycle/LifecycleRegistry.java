package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.annotation.MainThread;
import androidx.annotation.VisibleForTesting;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.arch.core.internal.FastSafeIterableMap;
import androidx.arch.core.internal.SafeIterableMap.IteratorWithAdditions;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.k;
import y4.l;
import y4.m;
import z3.n;

public class LifecycleRegistry extends Lifecycle {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @VisibleForTesting
        @l
        @n
        public final LifecycleRegistry a(@l LifecycleOwner lifecycleOwner0) {
            L.p(lifecycleOwner0, "owner");
            return new LifecycleRegistry(lifecycleOwner0, false, null);
        }

        @l
        @n
        public final State b(@l State lifecycle$State0, @m State lifecycle$State1) {
            L.p(lifecycle$State0, "state1");
            return lifecycle$State1 == null || lifecycle$State1.compareTo(lifecycle$State0) >= 0 ? lifecycle$State0 : lifecycle$State1;
        }
    }

    public static final class ObserverWithState {
        @l
        private State a;
        @l
        private LifecycleEventObserver b;

        public ObserverWithState(@m LifecycleObserver lifecycleObserver0, @l State lifecycle$State0) {
            L.p(lifecycle$State0, "initialState");
            super();
            L.m(lifecycleObserver0);
            this.b = Lifecycling.f(lifecycleObserver0);
            this.a = lifecycle$State0;
        }

        public final void a(@m LifecycleOwner lifecycleOwner0, @l Event lifecycle$Event0) {
            L.p(lifecycle$Event0, "event");
            State lifecycle$State0 = lifecycle$Event0.d();
            this.a = LifecycleRegistry.j.b(this.a, lifecycle$State0);
            LifecycleEventObserver lifecycleEventObserver0 = this.b;
            L.m(lifecycleOwner0);
            lifecycleEventObserver0.onStateChanged(lifecycleOwner0, lifecycle$Event0);
            this.a = lifecycle$State0;
        }

        @l
        public final LifecycleEventObserver b() {
            return this.b;
        }

        @l
        public final State c() {
            return this.a;
        }

        public final void d(@l LifecycleEventObserver lifecycleEventObserver0) {
            L.p(lifecycleEventObserver0, "<set-?>");
            this.b = lifecycleEventObserver0;
        }

        public final void e(@l State lifecycle$State0) {
            L.p(lifecycle$State0, "<set-?>");
            this.a = lifecycle$State0;
        }
    }

    private final boolean b;
    @l
    private FastSafeIterableMap c;
    @l
    private State d;
    @l
    private final WeakReference e;
    private int f;
    private boolean g;
    private boolean h;
    @l
    private ArrayList i;
    @l
    public static final Companion j;

    static {
        LifecycleRegistry.j = new Companion(null);
    }

    public LifecycleRegistry(@l LifecycleOwner lifecycleOwner0) {
        L.p(lifecycleOwner0, "provider");
        this(lifecycleOwner0, true);
    }

    private LifecycleRegistry(LifecycleOwner lifecycleOwner0, boolean z) {
        this.b = z;
        this.c = new FastSafeIterableMap();
        this.d = State.b;
        this.i = new ArrayList();
        this.e = new WeakReference(lifecycleOwner0);
    }

    public LifecycleRegistry(LifecycleOwner lifecycleOwner0, boolean z, w w0) {
        this(lifecycleOwner0, z);
    }

    @Override  // androidx.lifecycle.Lifecycle
    public void a(@l LifecycleObserver lifecycleObserver0) {
        L.p(lifecycleObserver0, "observer");
        this.i("addObserver");
        ObserverWithState lifecycleRegistry$ObserverWithState0 = new ObserverWithState(lifecycleObserver0, (this.d == State.a ? State.a : State.b));
        if(((ObserverWithState)this.c.h(lifecycleObserver0, lifecycleRegistry$ObserverWithState0)) != null) {
            return;
        }
        LifecycleOwner lifecycleOwner0 = (LifecycleOwner)this.e.get();
        if(lifecycleOwner0 == null) {
            return;
        }
        boolean z = this.f != 0 || this.g;
        State lifecycle$State0 = this.g(lifecycleObserver0);
        ++this.f;
        while(lifecycleRegistry$ObserverWithState0.c().compareTo(lifecycle$State0) < 0 && this.c.contains(lifecycleObserver0)) {
            this.r(lifecycleRegistry$ObserverWithState0.c());
            Event lifecycle$Event0 = Event.Companion.c(lifecycleRegistry$ObserverWithState0.c());
            if(lifecycle$Event0 == null) {
                throw new IllegalStateException("no event up from " + lifecycleRegistry$ObserverWithState0.c());
            }
            lifecycleRegistry$ObserverWithState0.a(lifecycleOwner0, lifecycle$Event0);
            this.q();
            lifecycle$State0 = this.g(lifecycleObserver0);
        }
        if(!z) {
            this.t();
        }
        --this.f;
    }

    @Override  // androidx.lifecycle.Lifecycle
    @l
    public State b() {
        return this.d;
    }

    @Override  // androidx.lifecycle.Lifecycle
    public void d(@l LifecycleObserver lifecycleObserver0) {
        L.p(lifecycleObserver0, "observer");
        this.i("removeObserver");
        this.c.i(lifecycleObserver0);
    }

    private final void f(LifecycleOwner lifecycleOwner0) {
        Iterator iterator0 = this.c.descendingIterator();
        L.o(iterator0, "observerMap.descendingIterator()");
        while(iterator0.hasNext() && !this.h) {
            Object object0 = iterator0.next();
            L.o(((Map.Entry)object0), "next()");
            LifecycleObserver lifecycleObserver0 = (LifecycleObserver)((Map.Entry)object0).getKey();
            ObserverWithState lifecycleRegistry$ObserverWithState0 = (ObserverWithState)((Map.Entry)object0).getValue();
            while(lifecycleRegistry$ObserverWithState0.c().compareTo(this.d) > 0 && !this.h && this.c.contains(lifecycleObserver0)) {
                Event lifecycle$Event0 = Event.Companion.a(lifecycleRegistry$ObserverWithState0.c());
                if(lifecycle$Event0 == null) {
                    throw new IllegalStateException("no event down from " + lifecycleRegistry$ObserverWithState0.c());
                }
                this.r(lifecycle$Event0.d());
                lifecycleRegistry$ObserverWithState0.a(lifecycleOwner0, lifecycle$Event0);
                this.q();
            }
        }
    }

    private final State g(LifecycleObserver lifecycleObserver0) {
        State lifecycle$State1;
        Map.Entry map$Entry0 = this.c.j(lifecycleObserver0);
        State lifecycle$State0 = null;
        if(map$Entry0 == null) {
            lifecycle$State1 = null;
        }
        else {
            ObserverWithState lifecycleRegistry$ObserverWithState0 = (ObserverWithState)map$Entry0.getValue();
            lifecycle$State1 = lifecycleRegistry$ObserverWithState0 == null ? null : lifecycleRegistry$ObserverWithState0.c();
        }
        if(!this.i.isEmpty()) {
            lifecycle$State0 = (State)this.i.get(this.i.size() - 1);
        }
        State lifecycle$State2 = LifecycleRegistry.j.b(this.d, lifecycle$State1);
        return LifecycleRegistry.j.b(lifecycle$State2, lifecycle$State0);
    }

    @VisibleForTesting
    @l
    @n
    public static final LifecycleRegistry h(@l LifecycleOwner lifecycleOwner0) {
        return LifecycleRegistry.j.a(lifecycleOwner0);
    }

    @SuppressLint({"RestrictedApi"})
    private final void i(String s) {
        if(this.b && !ArchTaskExecutor.h().c()) {
            throw new IllegalStateException(("Method " + s + " must be called on the main thread").toString());
        }
    }

    private final void j(LifecycleOwner lifecycleOwner0) {
        IteratorWithAdditions safeIterableMap$IteratorWithAdditions0 = this.c.c();
        L.o(safeIterableMap$IteratorWithAdditions0, "observerMap.iteratorWithAdditions()");
        while(safeIterableMap$IteratorWithAdditions0.hasNext() && !this.h) {
            Object object0 = safeIterableMap$IteratorWithAdditions0.next();
            LifecycleObserver lifecycleObserver0 = (LifecycleObserver)((Map.Entry)object0).getKey();
            ObserverWithState lifecycleRegistry$ObserverWithState0 = (ObserverWithState)((Map.Entry)object0).getValue();
            while(lifecycleRegistry$ObserverWithState0.c().compareTo(this.d) < 0 && !this.h && this.c.contains(lifecycleObserver0)) {
                this.r(lifecycleRegistry$ObserverWithState0.c());
                Event lifecycle$Event0 = Event.Companion.c(lifecycleRegistry$ObserverWithState0.c());
                if(lifecycle$Event0 == null) {
                    throw new IllegalStateException("no event up from " + lifecycleRegistry$ObserverWithState0.c());
                }
                lifecycleRegistry$ObserverWithState0.a(lifecycleOwner0, lifecycle$Event0);
                this.q();
            }
        }
    }

    public int k() {
        this.i("getObserverCount");
        return this.c.size();
    }

    public void l(@l Event lifecycle$Event0) {
        L.p(lifecycle$Event0, "event");
        this.i("handleLifecycleEvent");
        this.p(lifecycle$Event0.d());
    }

    private final boolean m() {
        if(this.c.size() == 0) {
            return true;
        }
        Map.Entry map$Entry0 = this.c.a();
        L.m(map$Entry0);
        State lifecycle$State0 = ((ObserverWithState)map$Entry0.getValue()).c();
        Map.Entry map$Entry1 = this.c.d();
        L.m(map$Entry1);
        State lifecycle$State1 = ((ObserverWithState)map$Entry1.getValue()).c();
        return lifecycle$State0 == lifecycle$State1 && this.d == lifecycle$State1;
    }

    @MainThread
    @k(message = "Override [currentState].")
    public void n(@l State lifecycle$State0) {
        L.p(lifecycle$State0, "state");
        this.i("markState");
        this.s(lifecycle$State0);
    }

    @l
    @n
    public static final State o(@l State lifecycle$State0, @m State lifecycle$State1) {
        return LifecycleRegistry.j.b(lifecycle$State0, lifecycle$State1);
    }

    private final void p(State lifecycle$State0) {
        State lifecycle$State1 = this.d;
        if(lifecycle$State1 == lifecycle$State0) {
            return;
        }
        if(lifecycle$State1 == State.b && lifecycle$State0 == State.a) {
            throw new IllegalStateException(("no event down from " + this.d + " in component " + this.e.get()).toString());
        }
        this.d = lifecycle$State0;
        if(!this.g && this.f == 0) {
            this.g = true;
            this.t();
            this.g = false;
            if(this.d == State.a) {
                this.c = new FastSafeIterableMap();
            }
            return;
        }
        this.h = true;
    }

    private final void q() {
        this.i.remove(this.i.size() - 1);
    }

    private final void r(State lifecycle$State0) {
        this.i.add(lifecycle$State0);
    }

    public void s(@l State lifecycle$State0) {
        L.p(lifecycle$State0, "state");
        this.i("setCurrentState");
        this.p(lifecycle$State0);
    }

    private final void t() {
        LifecycleOwner lifecycleOwner0 = (LifecycleOwner)this.e.get();
        if(lifecycleOwner0 == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while(!this.m()) {
            this.h = false;
            State lifecycle$State0 = this.d;
            Map.Entry map$Entry0 = this.c.a();
            L.m(map$Entry0);
            if(lifecycle$State0.compareTo(((ObserverWithState)map$Entry0.getValue()).c()) < 0) {
                this.f(lifecycleOwner0);
            }
            Map.Entry map$Entry1 = this.c.d();
            if(!this.h && map$Entry1 != null && this.d.compareTo(((ObserverWithState)map$Entry1.getValue()).c()) > 0) {
                this.j(lifecycleOwner0);
            }
        }
        this.h = false;
    }
}

