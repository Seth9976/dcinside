package androidx.compose.ui.graphics;

import kotlin.jvm.internal.L;
import y4.l;

public final class AndroidPathEffect implements PathEffect {
    @l
    private final android.graphics.PathEffect b;

    public AndroidPathEffect(@l android.graphics.PathEffect pathEffect0) {
        L.p(pathEffect0, "nativePathEffect");
        super();
        this.b = pathEffect0;
    }

    @l
    public final android.graphics.PathEffect a() {
        return this.b;
    }
}

