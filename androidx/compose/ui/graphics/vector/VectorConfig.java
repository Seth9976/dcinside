package androidx.compose.ui.graphics.vector;

import kotlin.jvm.internal.L;
import y4.l;

public interface VectorConfig {
    public static final class DefaultImpls {
        @Deprecated
        public static Object a(@l VectorConfig vectorConfig0, @l VectorProperty vectorProperty0, Object object0) {
            L.p(vectorProperty0, "property");
            return a.a(vectorConfig0, vectorProperty0, object0);
        }
    }

    Object a(@l VectorProperty arg1, Object arg2);
}

