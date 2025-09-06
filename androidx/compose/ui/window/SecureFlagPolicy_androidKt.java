package androidx.compose.ui.window;

import kotlin.J;
import kotlin.jvm.internal.L;
import y4.l;

public final class SecureFlagPolicy_androidKt {
    public final class WhenMappings {
        public static final int[] a;

        static {
            int[] arr_v = new int[SecureFlagPolicy.values().length];
            try {
                arr_v[SecureFlagPolicy.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[SecureFlagPolicy.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[SecureFlagPolicy.a.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.a = arr_v;
        }
    }

    public static final boolean a(@l SecureFlagPolicy secureFlagPolicy0, boolean z) {
        L.p(secureFlagPolicy0, "<this>");
        switch(secureFlagPolicy0) {
            case 1: {
                return false;
            }
            case 2: {
                return true;
            }
            case 3: {
                return z;
            }
            default: {
                throw new J();
            }
        }
    }
}

