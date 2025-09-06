package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

public final class Recreator implements LifecycleEventObserver {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    public static final class SavedStateProvider implements androidx.savedstate.SavedStateRegistry.SavedStateProvider {
        @l
        private final Set a;

        public SavedStateProvider(@l SavedStateRegistry savedStateRegistry0) {
            L.p(savedStateRegistry0, "registry");
            super();
            this.a = new LinkedHashSet();
            savedStateRegistry0.j("androidx.savedstate.Restarter", this);
        }

        @Override  // androidx.savedstate.SavedStateRegistry$SavedStateProvider
        @l
        public Bundle a() {
            Bundle bundle0 = new Bundle();
            bundle0.putStringArrayList("classes_to_restore", new ArrayList(this.a));
            return bundle0;
        }

        public final void b(@l String s) {
            L.p(s, "className");
            this.a.add(s);
        }
    }

    @l
    private final SavedStateRegistryOwner a;
    @l
    public static final Companion b = null;
    @l
    public static final String c = "classes_to_restore";
    @l
    public static final String d = "androidx.savedstate.Restarter";

    static {
        Recreator.b = new Companion(null);
    }

    public Recreator(@l SavedStateRegistryOwner savedStateRegistryOwner0) {
        L.p(savedStateRegistryOwner0, "owner");
        super();
        this.a = savedStateRegistryOwner0;
    }

    private final void a(String s) {
        AutoRecreated savedStateRegistry$AutoRecreated0;
        Constructor constructor0;
        Class class0;
        try {
            class0 = Class.forName(s, false, Recreator.class.getClassLoader()).asSubclass(AutoRecreated.class);
            L.o(class0, "{\n                Class.…class.java)\n            }");
        }
        catch(ClassNotFoundException classNotFoundException0) {
            throw new RuntimeException("Class " + s + " wasn\'t found", classNotFoundException0);
        }
        try {
            constructor0 = class0.getDeclaredConstructor(null);
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            throw new IllegalStateException("Class " + class0.getSimpleName() + " must have default constructor in order to be automatically recreated", noSuchMethodException0);
        }
        constructor0.setAccessible(true);
        try {
            Object object0 = constructor0.newInstance(null);
            L.o(object0, "{\n                constr…wInstance()\n            }");
            savedStateRegistry$AutoRecreated0 = (AutoRecreated)object0;
        }
        catch(Exception exception0) {
            throw new RuntimeException("Failed to instantiate " + s, exception0);
        }
        savedStateRegistry$AutoRecreated0.a(this.a);
    }

    @Override  // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@l LifecycleOwner lifecycleOwner0, @l Event lifecycle$Event0) {
        L.p(lifecycleOwner0, "source");
        L.p(lifecycle$Event0, "event");
        if(lifecycle$Event0 != Event.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        lifecycleOwner0.getLifecycle().d(this);
        Bundle bundle0 = this.a.getSavedStateRegistry().b("androidx.savedstate.Restarter");
        if(bundle0 == null) {
            return;
        }
        ArrayList arrayList0 = bundle0.getStringArrayList("classes_to_restore");
        if(arrayList0 == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for(Object object0: arrayList0) {
            this.a(((String)object0));
        }
    }
}

