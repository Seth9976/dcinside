package kotlinx.coroutines.channels;

import kotlin.k;
import kotlin.m;
import kotlinx.coroutines.Z0;
import kotlinx.coroutines.internal.V;
import y4.l;

public final class f {
    @l
    private static final V a;

    static {
        f.a = new V("NO_ELEMENT");
    }

    @k(level = m.a, message = "BroadcastChannel is deprecated in the favour of SharedFlow and StateFlow, and is no longer supported")
    @Z0
    @l
    public static final d a(int v) {
        if(v != -2) {
            switch(v) {
                case -1: {
                    return new x();
                }
                case 0: {
                    throw new IllegalArgumentException("Unsupported 0 capacity for BroadcastChannel");
                }
                default: {
                    if(v == 0x7FFFFFFF) {
                        throw new IllegalArgumentException("Unsupported UNLIMITED capacity for BroadcastChannel");
                    }
                    return new e(v);
                }
            }
        }
        return new e(0x40);
    }
}

