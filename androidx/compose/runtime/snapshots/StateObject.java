package androidx.compose.runtime.snapshots;

import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public interface StateObject {
    public static final class DefaultImpls {
        @Deprecated
        @m
        public static StateRecord a(@l StateObject stateObject0, @l StateRecord stateRecord0, @l StateRecord stateRecord1, @l StateRecord stateRecord2) {
            L.p(stateRecord0, "previous");
            L.p(stateRecord1, "current");
            L.p(stateRecord2, "applied");
            return a.a(stateObject0, stateRecord0, stateRecord1, stateRecord2);
        }
    }

    void d(@l StateRecord arg1);

    @m
    StateRecord g(@l StateRecord arg1, @l StateRecord arg2, @l StateRecord arg3);

    @l
    StateRecord h();
}

