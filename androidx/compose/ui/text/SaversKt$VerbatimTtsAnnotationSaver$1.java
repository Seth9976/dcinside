package androidx.compose.ui.text;

import A3.o;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;
import y4.m;

final class SaversKt.VerbatimTtsAnnotationSaver.1 extends N implements o {
    public static final SaversKt.VerbatimTtsAnnotationSaver.1 e;

    static {
        SaversKt.VerbatimTtsAnnotationSaver.1.e = new SaversKt.VerbatimTtsAnnotationSaver.1();
    }

    SaversKt.VerbatimTtsAnnotationSaver.1() {
        super(2);
    }

    @m
    public final Object a(@l SaverScope saverScope0, @l VerbatimTtsAnnotation verbatimTtsAnnotation0) {
        L.p(saverScope0, "$this$Saver");
        L.p(verbatimTtsAnnotation0, "it");
        return SaversKt.y(verbatimTtsAnnotation0.a());
    }

    @Override  // A3.o
    public Object invoke(Object object0, Object object1) {
        return this.a(((SaverScope)object0), ((VerbatimTtsAnnotation)object1));
    }
}

