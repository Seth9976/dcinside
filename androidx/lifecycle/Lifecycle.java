package androidx.lifecycle;

import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.n;

public abstract class Lifecycle {
    public static enum Event {
        public static final class Companion {
            public final class WhenMappings {
                public static final int[] a;

                static {
                    int[] arr_v = new int[State.values().length];
                    try {
                        arr_v[State.c.ordinal()] = 1;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    try {
                        arr_v[State.d.ordinal()] = 2;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    try {
                        arr_v[State.e.ordinal()] = 3;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    try {
                        arr_v[State.a.ordinal()] = 4;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    try {
                        arr_v[State.b.ordinal()] = 5;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    WhenMappings.a = arr_v;
                }
            }

            private Companion() {
            }

            public Companion(w w0) {
            }

            @m
            @n
            public final Event a(@l State lifecycle$State0) {
                L.p(lifecycle$State0, "state");
                switch(lifecycle$State0) {
                    case 1: {
                        return Event.ON_DESTROY;
                    }
                    case 2: {
                        return Event.ON_STOP;
                    }
                    case 3: {
                        return Event.ON_PAUSE;
                    }
                    default: {
                        return null;
                    }
                }
            }

            @m
            @n
            public final Event b(@l State lifecycle$State0) {
                L.p(lifecycle$State0, "state");
                switch(lifecycle$State0) {
                    case 1: {
                        return Event.ON_STOP;
                    }
                    case 2: {
                        return Event.ON_PAUSE;
                    }
                    case 4: {
                        return Event.ON_DESTROY;
                    }
                    default: {
                        return null;
                    }
                }
            }

            @m
            @n
            public final Event c(@l State lifecycle$State0) {
                L.p(lifecycle$State0, "state");
                switch(lifecycle$State0) {
                    case 1: {
                        return Event.ON_START;
                    }
                    case 2: {
                        return Event.ON_RESUME;
                    }
                    case 5: {
                        return Event.ON_CREATE;
                    }
                    default: {
                        return null;
                    }
                }
            }

            @m
            @n
            public final Event d(@l State lifecycle$State0) {
                L.p(lifecycle$State0, "state");
                switch(lifecycle$State0) {
                    case 1: {
                        return Event.ON_CREATE;
                    }
                    case 2: {
                        return Event.ON_START;
                    }
                    case 3: {
                        return Event.ON_RESUME;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }

        public final class androidx.lifecycle.Lifecycle.Event.WhenMappings {
            public static final int[] a;

            static {
                int[] arr_v = new int[Event.values().length];
                try {
                    arr_v[Event.ON_CREATE.ordinal()] = 1;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[Event.ON_STOP.ordinal()] = 2;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[Event.ON_START.ordinal()] = 3;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[Event.ON_PAUSE.ordinal()] = 4;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[Event.ON_RESUME.ordinal()] = 5;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[Event.ON_DESTROY.ordinal()] = 6;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                try {
                    arr_v[Event.ON_ANY.ordinal()] = 7;
                }
                catch(NoSuchFieldError unused_ex) {
                }
                androidx.lifecycle.Lifecycle.Event.WhenMappings.a = arr_v;
            }
        }

        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        @l
        public static final Companion Companion;

        static {
            Event.Companion = new Companion(null);
        }

        private static final Event[] a() [...] // Inlined contents

        @m
        @n
        public static final Event b(@l State lifecycle$State0) {
            return Event.Companion.a(lifecycle$State0);
        }

        @m
        @n
        public static final Event c(@l State lifecycle$State0) {
            return Event.Companion.b(lifecycle$State0);
        }

        @l
        public final State d() {
            switch(this) {
                case 1: 
                case 2: {
                    return State.c;
                }
                case 3: 
                case 4: {
                    return State.d;
                }
                case 5: {
                    return State.e;
                }
                case 6: {
                    return State.a;
                }
                default: {
                    throw new IllegalArgumentException(this + " has no target state");
                }
            }
        }

        @m
        @n
        public static final Event e(@l State lifecycle$State0) {
            return Event.Companion.c(lifecycle$State0);
        }

        @m
        @n
        public static final Event f(@l State lifecycle$State0) {
            return Event.Companion.d(lifecycle$State0);
        }
    }

    public static enum State {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        private static final State[] a() [...] // Inlined contents

        public final boolean b(@l State lifecycle$State0) {
            L.p(lifecycle$State0, "state");
            return this.compareTo(lifecycle$State0) >= 0;
        }
    }

    @RestrictTo({Scope.b})
    @l
    private AtomicReference a;

    public Lifecycle() {
        this.a = new AtomicReference();
    }

    @MainThread
    public abstract void a(@l LifecycleObserver arg1);

    @MainThread
    @l
    public abstract State b();

    @l
    public final AtomicReference c() {
        return this.a;
    }

    @MainThread
    public abstract void d(@l LifecycleObserver arg1);

    public final void e(@l AtomicReference atomicReference0) {
        L.p(atomicReference0, "<set-?>");
        this.a = atomicReference0;
    }
}

