package androidx.compose.animation.core;

import java.util.concurrent.atomic.AtomicReference;

public final class d {
    public static boolean a(AtomicReference atomicReference0, Object object0, Object object1) {
        do {
            if(atomicReference0.compareAndSet(object0, object1)) {
                return true;
            }
        }
        while(atomicReference0.get() == object0);
        return false;
    }
}

