package androidx.compose.ui.text;

import androidx.compose.ui.text.style.TextGeometricTransform;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;
import y4.m;

final class SaversKt.TextGeometricTransformSaver.2 extends N implements Function1 {
    public static final SaversKt.TextGeometricTransformSaver.2 e;

    static {
        SaversKt.TextGeometricTransformSaver.2.e = new SaversKt.TextGeometricTransformSaver.2();
    }

    SaversKt.TextGeometricTransformSaver.2() {
        super(1);
    }

    @m
    public final TextGeometricTransform a(@l Object object0) {
        L.p(object0, "it");
        return new TextGeometricTransform(((Number)((List)object0).get(0)).floatValue(), ((Number)((List)object0).get(1)).floatValue());
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.a(object0);
    }
}

