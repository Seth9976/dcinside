package androidx.compose.ui.text;

import A3.o;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;
import y4.m;

final class SaversKt.UrlAnnotationSaver.1 extends N implements o {
    public static final SaversKt.UrlAnnotationSaver.1 e;

    static {
        SaversKt.UrlAnnotationSaver.1.e = new SaversKt.UrlAnnotationSaver.1();
    }

    SaversKt.UrlAnnotationSaver.1() {
        super(2);
    }

    @m
    public final Object a(@l SaverScope saverScope0, @l UrlAnnotation urlAnnotation0) {
        L.p(saverScope0, "$this$Saver");
        L.p(urlAnnotation0, "it");
        return SaversKt.y(urlAnnotation0.a());
    }

    @Override  // A3.o
    public Object invoke(Object object0, Object object1) {
        return this.a(((SaverScope)object0), ((UrlAnnotation)object1));
    }
}

