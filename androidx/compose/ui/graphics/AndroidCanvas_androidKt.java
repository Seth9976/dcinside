package androidx.compose.ui.graphics;

import android.graphics.Canvas;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nAndroidCanvas.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/AndroidCanvas_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,428:1\n1#2:429\n*E\n"})
public final class AndroidCanvas_androidKt {
    @l
    private static final Canvas a;

    static {
        AndroidCanvas_androidKt.a = new Canvas();
    }

    @l
    public static final androidx.compose.ui.graphics.Canvas a(@l ImageBitmap imageBitmap0) {
        L.p(imageBitmap0, "image");
        androidx.compose.ui.graphics.Canvas canvas0 = new AndroidCanvas();
        ((AndroidCanvas)canvas0).K(new Canvas(AndroidImageBitmap_androidKt.b(imageBitmap0)));
        return canvas0;
    }

    @l
    public static final androidx.compose.ui.graphics.Canvas b(@l Canvas canvas0) {
        L.p(canvas0, "c");
        androidx.compose.ui.graphics.Canvas canvas1 = new AndroidCanvas();
        ((AndroidCanvas)canvas1).K(canvas0);
        return canvas1;
    }

    @l
    public static final Canvas d(@l androidx.compose.ui.graphics.Canvas canvas0) {
        L.p(canvas0, "<this>");
        return ((AndroidCanvas)canvas0).I();
    }
}

