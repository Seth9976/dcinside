package androidx.compose.runtime;

import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

final class StructuralEqualityPolicy implements SnapshotMutationPolicy {
    @l
    public static final StructuralEqualityPolicy a;

    static {
        StructuralEqualityPolicy.a = new StructuralEqualityPolicy();
    }

    @Override  // androidx.compose.runtime.SnapshotMutationPolicy
    public boolean a(@m Object object0, @m Object object1) {
        return L.g(object0, object1);
    }

    @Override  // androidx.compose.runtime.SnapshotMutationPolicy
    public Object b(Object object0, Object object1, Object object2) {
        return null;
    }

    @Override
    @l
    public String toString() {
        return "StructuralEqualityPolicy";
    }
}

