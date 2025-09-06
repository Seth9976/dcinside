package androidx.compose.runtime;

import y4.l;
import y4.m;

public interface SnapshotMutationPolicy {
    public static final class DefaultImpls {
        @Deprecated
        @m
        public static Object a(@l SnapshotMutationPolicy snapshotMutationPolicy0, Object object0, Object object1, Object object2) {
            return d.b(snapshotMutationPolicy0, object0, object1, object2);
        }
    }

    boolean a(Object arg1, Object arg2);

    @m
    Object b(Object arg1, Object arg2, Object arg3);
}

