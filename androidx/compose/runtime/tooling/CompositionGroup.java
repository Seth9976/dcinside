package androidx.compose.runtime.tooling;

import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public interface CompositionGroup extends CompositionData {
    public static final class DefaultImpls {
        @Deprecated
        @m
        public static CompositionGroup a(@l CompositionGroup compositionGroup0, @l Object object0) {
            L.p(object0, "identityToFind");
            return a.a(compositionGroup0, object0);
        }

        @Deprecated
        public static int b(@l CompositionGroup compositionGroup0) {
            return b.e(compositionGroup0);
        }

        @Deprecated
        @m
        public static Object c(@l CompositionGroup compositionGroup0) {
            return b.f(compositionGroup0);
        }

        @Deprecated
        public static int d(@l CompositionGroup compositionGroup0) {
            return b.g(compositionGroup0);
        }
    }

    @m
    String S();

    int U();

    @m
    Object V();

    int W();

    @l
    Iterable getData();

    @l
    Object getKey();

    @m
    Object getNode();
}

