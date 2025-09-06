package androidx.compose.runtime.external.kotlinx.collections.immutable;

import java.util.List;
import y4.l;

public final class a {
    @l
    public static ImmutableList a(ImmutableList immutableList0, int v, int v1) {
        return new SubList(immutableList0, v, v1);
    }

    public static List b(ImmutableList immutableList0, int v, int v1) {
        return immutableList0.subList(v, v1);
    }
}

