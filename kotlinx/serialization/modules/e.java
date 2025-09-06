package kotlinx.serialization.modules;

import kotlin.jvm.internal.L;
import kotlin.reflect.d;
import y4.l;

final class e extends IllegalArgumentException {
    public e(@l String s) {
        L.p(s, "msg");
        super(s);
    }

    public e(@l d d0, @l d d1) {
        L.p(d0, "baseClass");
        L.p(d1, "concreteClass");
        this("Serializer for " + d1 + " already registered in the scope of " + d0);
    }
}

