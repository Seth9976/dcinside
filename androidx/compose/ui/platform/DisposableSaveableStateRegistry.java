package androidx.compose.ui.platform;

import A3.a;
import androidx.compose.runtime.saveable.SaveableStateRegistry.Entry;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import java.util.Map;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class DisposableSaveableStateRegistry implements SaveableStateRegistry {
    @l
    private final a a;
    private final SaveableStateRegistry b;

    public DisposableSaveableStateRegistry(@l SaveableStateRegistry saveableStateRegistry0, @l a a0) {
        L.p(saveableStateRegistry0, "saveableStateRegistry");
        L.p(a0, "onDispose");
        super();
        this.a = a0;
        this.b = saveableStateRegistry0;
    }

    @Override  // androidx.compose.runtime.saveable.SaveableStateRegistry
    public boolean a(@l Object object0) {
        L.p(object0, "value");
        return this.b.a(object0);
    }

    public final void b() {
        this.a.invoke();
    }

    @Override  // androidx.compose.runtime.saveable.SaveableStateRegistry
    @l
    public Map c() {
        return this.b.c();
    }

    @Override  // androidx.compose.runtime.saveable.SaveableStateRegistry
    @l
    public Entry e(@l String s, @l a a0) {
        L.p(s, "key");
        L.p(a0, "valueProvider");
        return this.b.e(s, a0);
    }

    @Override  // androidx.compose.runtime.saveable.SaveableStateRegistry
    @m
    public Object f(@l String s) {
        L.p(s, "key");
        return this.b.f(s);
    }
}

