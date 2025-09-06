package androidx.compose.runtime.internal;

import androidx.compose.runtime.ComposeCompilerApi;
import kotlin.jvm.internal.L;
import y4.l;

public final class DecoyKt {
    @ComposeCompilerApi
    @l
    public static final Void a(@l String s) {
        L.p(s, "fName");
        throw new IllegalStateException("Function " + s + " should have been replaced by compiler.");
    }
}

