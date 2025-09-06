package androidx.compose.ui.text.platform;

import A3.a;
import kotlin.jvm.internal.L;
import y4.l;

public final class Synchronization_jvmKt {
    @l
    public static final SynchronizedObject a() {
        return new SynchronizedObject();
    }

    public static final Object b(@l SynchronizedObject synchronizedObject0, @l a a0) {
        L.p(synchronizedObject0, "lock");
        L.p(a0, "block");
        synchronized(synchronizedObject0) {
            return a0.invoke();
        }
    }
}

