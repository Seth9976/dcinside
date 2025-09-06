package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.arch.core.internal.SafeIterableMap.IteratorWithAdditions;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.Map.Entry;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@SuppressLint({"RestrictedApi"})
@s0({"SMAP\nSavedStateRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateRegistry.kt\nandroidx/savedstate/SavedStateRegistry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,272:1\n1#2:273\n*E\n"})
public final class SavedStateRegistry {
    public interface AutoRecreated {
        void a(@l SavedStateRegistryOwner arg1);
    }

    static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    public interface SavedStateProvider {
        @l
        Bundle a();
    }

    @l
    private final SafeIterableMap a;
    private boolean b;
    @m
    private Bundle c;
    private boolean d;
    @m
    private androidx.savedstate.Recreator.SavedStateProvider e;
    private boolean f;
    @l
    private static final Companion g = null;
    @Deprecated
    @l
    private static final String h = "androidx.lifecycle.BundlableSavedStateRegistry.key";

    static {
        SavedStateRegistry.g = new Companion(null);
    }

    public SavedStateRegistry() {
        this.a = new SafeIterableMap();
        this.f = true;
    }

    @MainThread
    @m
    public final Bundle b(@l String s) {
        L.p(s, "key");
        if(!this.d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle0 = this.c;
        if(bundle0 != null) {
            Bundle bundle1 = bundle0.getBundle(s);
            Bundle bundle2 = this.c;
            if(bundle2 != null) {
                bundle2.remove(s);
            }
            if(this.c == null || this.c.isEmpty()) {
                this.c = null;
            }
            return bundle1;
        }
        return null;
    }

    @m
    public final SavedStateProvider c(@l String s) {
        L.p(s, "key");
        for(Object object0: this.a) {
            L.o(((Map.Entry)object0), "components");
            String s1 = (String)((Map.Entry)object0).getKey();
            SavedStateProvider savedStateRegistry$SavedStateProvider0 = (SavedStateProvider)((Map.Entry)object0).getValue();
            if(L.g(s1, s)) {
                return savedStateRegistry$SavedStateProvider0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public final boolean d() {
        return this.f;
    }

    @MainThread
    public final boolean e() {
        return this.d;
    }

    // 检测为 Lambda 实现
    private static final void f(SavedStateRegistry savedStateRegistry0, LifecycleOwner lifecycleOwner0, Event lifecycle$Event0) [...]

    @MainThread
    public final void g(@l Lifecycle lifecycle0) {
        L.p(lifecycle0, "lifecycle");
        if(this.b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        lifecycle0.a((LifecycleOwner lifecycleOwner0, Event lifecycle$Event0) -> {
            L.p(this, "this$0");
            L.p(lifecycleOwner0, "<anonymous parameter 0>");
            L.p(lifecycle$Event0, "event");
            if(lifecycle$Event0 == Event.ON_START) {
                this.f = true;
                return;
            }
            if(lifecycle$Event0 == Event.ON_STOP) {
                this.f = false;
            }
        });
        this.b = true;
    }

    @MainThread
    public final void h(@m Bundle bundle0) {
        if(!this.b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if(this.d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        this.c = bundle0 == null ? null : bundle0.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
        this.d = true;
    }

    @MainThread
    public final void i(@l Bundle bundle0) {
        L.p(bundle0, "outBundle");
        Bundle bundle1 = new Bundle();
        Bundle bundle2 = this.c;
        if(bundle2 != null) {
            bundle1.putAll(bundle2);
        }
        IteratorWithAdditions safeIterableMap$IteratorWithAdditions0 = this.a.c();
        L.o(safeIterableMap$IteratorWithAdditions0, "this.components.iteratorWithAdditions()");
        while(safeIterableMap$IteratorWithAdditions0.hasNext()) {
            Object object0 = safeIterableMap$IteratorWithAdditions0.next();
            bundle1.putBundle(((String)((Map.Entry)object0).getKey()), ((SavedStateProvider)((Map.Entry)object0).getValue()).a());
        }
        if(!bundle1.isEmpty()) {
            bundle0.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle1);
        }
    }

    @MainThread
    public final void j(@l String s, @l SavedStateProvider savedStateRegistry$SavedStateProvider0) {
        L.p(s, "key");
        L.p(savedStateRegistry$SavedStateProvider0, "provider");
        if(((SavedStateProvider)this.a.h(s, savedStateRegistry$SavedStateProvider0)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    @MainThread
    public final void k(@l Class class0) {
        androidx.savedstate.Recreator.SavedStateProvider recreator$SavedStateProvider1;
        L.p(class0, "clazz");
        if(!this.f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        androidx.savedstate.Recreator.SavedStateProvider recreator$SavedStateProvider0 = this.e == null ? new androidx.savedstate.Recreator.SavedStateProvider(this) : this.e;
        try {
            this.e = recreator$SavedStateProvider0;
            class0.getDeclaredConstructor(null);
            recreator$SavedStateProvider1 = this.e;
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            throw new IllegalArgumentException("Class " + class0.getSimpleName() + " must have default constructor in order to be automatically recreated", noSuchMethodException0);
        }
        if(recreator$SavedStateProvider1 != null) {
            String s = class0.getName();
            L.o(s, "clazz.name");
            recreator$SavedStateProvider1.b(s);
        }
    }

    public final void l(boolean z) {
        this.f = z;
    }

    @MainThread
    public final void m(@l String s) {
        L.p(s, "key");
        this.a.i(s);
    }
}

