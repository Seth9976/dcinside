package androidx.compose.ui.text;

import A3.o;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.style.TextGeometricTransform;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;
import y4.m;

final class SaversKt.TextGeometricTransformSaver.1 extends N implements o {
    public static final SaversKt.TextGeometricTransformSaver.1 e;

    static {
        SaversKt.TextGeometricTransformSaver.1.e = new SaversKt.TextGeometricTransformSaver.1();
    }

    SaversKt.TextGeometricTransformSaver.1() {
        super(2);
    }

    @m
    public final Object a(@l SaverScope saverScope0, @l TextGeometricTransform textGeometricTransform0) {
        L.p(saverScope0, "$this$Saver");
        L.p(textGeometricTransform0, "it");
        return u.s(new Float[]{textGeometricTransform0.d(), textGeometricTransform0.e()});
    }

    @Override  // A3.o
    public Object invoke(Object object0, Object object1) {
        return this.a(((SaverScope)object0), ((TextGeometricTransform)object1));
    }
}

