package androidx.savedstate;

import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.n;

public final class SavedStateRegistryController {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        @n
        public final SavedStateRegistryController a(@l SavedStateRegistryOwner savedStateRegistryOwner0) {
            L.p(savedStateRegistryOwner0, "owner");
            return new SavedStateRegistryController(savedStateRegistryOwner0, null);
        }
    }

    @l
    private final SavedStateRegistryOwner a;
    @l
    private final SavedStateRegistry b;
    private boolean c;
    @l
    public static final Companion d;

    static {
        SavedStateRegistryController.d = new Companion(null);
    }

    private SavedStateRegistryController(SavedStateRegistryOwner savedStateRegistryOwner0) {
        this.a = savedStateRegistryOwner0;
        this.b = new SavedStateRegistry();
    }

    public SavedStateRegistryController(SavedStateRegistryOwner savedStateRegistryOwner0, w w0) {
        this(savedStateRegistryOwner0);
    }

    @l
    @n
    public static final SavedStateRegistryController a(@l SavedStateRegistryOwner savedStateRegistryOwner0) {
        return SavedStateRegistryController.d.a(savedStateRegistryOwner0);
    }

    @l
    public final SavedStateRegistry b() {
        return this.b;
    }

    @MainThread
    public final void c() {
        Lifecycle lifecycle0 = this.a.getLifecycle();
        if(lifecycle0.b() != State.b) {
            throw new IllegalStateException("Restarter must be created only during owner\'s initialization stage");
        }
        lifecycle0.a(new Recreator(this.a));
        this.b.g(lifecycle0);
        this.c = true;
    }

    @MainThread
    public final void d(@m Bundle bundle0) {
        if(!this.c) {
            this.c();
        }
        Lifecycle lifecycle0 = this.a.getLifecycle();
        if(lifecycle0.b().b(State.d)) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle0.b()).toString());
        }
        this.b.h(bundle0);
    }

    @MainThread
    public final void e(@l Bundle bundle0) {
        L.p(bundle0, "outBundle");
        this.b.i(bundle0);
    }
}

