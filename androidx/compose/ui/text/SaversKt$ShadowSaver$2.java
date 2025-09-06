package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$ShadowSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n55#2,2:422\n55#2,2:425\n70#2:428\n1#3:424\n1#3:427\n1#3:429\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$ShadowSaver$2\n*L\n348#1:422,2\n349#1:425,2\n350#1:428\n348#1:424\n349#1:427\n350#1:429\n*E\n"})
final class SaversKt.ShadowSaver.2 extends N implements Function1 {
    public static final SaversKt.ShadowSaver.2 e;

    static {
        SaversKt.ShadowSaver.2.e = new SaversKt.ShadowSaver.2();
    }

    SaversKt.ShadowSaver.2() {
        super(1);
    }

    @m
    public final Shadow a(@l Object object0) {
        Offset offset0;
        Color color0;
        L.p(object0, "it");
        Object object1 = ((List)object0).get(0);
        Saver saver0 = SaversKt.i(Color.b);
        Float float0 = null;
        if(L.g(object1, Boolean.FALSE)) {
            color0 = null;
        }
        else if(object1 != null) {
            color0 = (Color)saver0.b(object1);
        }
        else {
            color0 = null;
        }
        L.m(color0);
        long v = color0.M();
        Object object2 = ((List)object0).get(1);
        Saver saver1 = SaversKt.h(Offset.b);
        if(L.g(object2, Boolean.FALSE)) {
            offset0 = null;
        }
        else if(object2 != null) {
            offset0 = (Offset)saver1.b(object2);
        }
        else {
            offset0 = null;
        }
        L.m(offset0);
        long v1 = offset0.A();
        Object object3 = ((List)object0).get(2);
        if(object3 != null) {
            float0 = (Float)object3;
        }
        L.m(float0);
        return new Shadow(v, v1, float0.floatValue(), null);
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.a(object0);
    }
}

