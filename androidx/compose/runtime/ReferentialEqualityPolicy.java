package androidx.compose.runtime;

import y4.l;
import y4.m;

final class ReferentialEqualityPolicy implements SnapshotMutationPolicy {
    @l
    public static final ReferentialEqualityPolicy a;

    static {
        ReferentialEqualityPolicy.a = new ReferentialEqualityPolicy();
    }

    @Override  // androidx.compose.runtime.SnapshotMutationPolicy
    public boolean a(@m Object object0, @m Object object1) {
        return object0 == object1;
    }

    @Override  // androidx.compose.runtime.SnapshotMutationPolicy
    public Object b(Object object0, Object object1, Object object2) {
        return null;
    }

    @Override
    @l
    public String toString() {
        return "ReferentialEqualityPolicy";
    }
}

