package androidx.core.graphics;

import android.graphics.Canvas;
import android.graphics.Picture;
import kotlin.jvm.functions.Function1;
import y4.l;

public final class PictureKt {
    @l
    public static final Picture a(@l Picture picture0, int v, int v1, @l Function1 function10) {
        Canvas canvas0 = picture0.beginRecording(v, v1);
        try {
            function10.invoke(canvas0);
            return picture0;
        }
        finally {
            picture0.endRecording();
        }
    }
}

