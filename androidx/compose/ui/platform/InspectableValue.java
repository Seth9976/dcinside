package androidx.compose.ui.platform;

import kotlin.sequences.m;
import y4.l;

public interface InspectableValue {
    public static final class DefaultImpls {
        @Deprecated
        @l
        public static m a(@l InspectableValue inspectableValue0) {
            return v.a(inspectableValue0);
        }

        @Deprecated
        @y4.m
        public static String b(@l InspectableValue inspectableValue0) {
            return v.e(inspectableValue0);
        }

        @Deprecated
        @y4.m
        public static Object c(@l InspectableValue inspectableValue0) {
            return v.f(inspectableValue0);
        }
    }

    @y4.m
    Object b();

    @l
    m d();

    @y4.m
    String i();
}

