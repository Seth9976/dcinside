package androidx.compose.runtime;

import kotlin.jvm.internal.L;
import y4.l;

final class SnapshotStateKt__SnapshotMutationPolicyKt {
    @l
    public static final SnapshotMutationPolicy a() {
        L.n(NeverEqualPolicy.a, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy>");
        return NeverEqualPolicy.a;
    }

    @l
    public static final SnapshotMutationPolicy b() {
        L.n(ReferentialEqualityPolicy.a, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy>");
        return ReferentialEqualityPolicy.a;
    }

    @l
    public static final SnapshotMutationPolicy c() {
        L.n(StructuralEqualityPolicy.a, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        return StructuralEqualityPolicy.a;
    }
}

