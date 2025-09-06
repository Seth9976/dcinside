package androidx.compose.ui.text;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$UrlAnnotationSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n70#2:422\n1#3:423\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$UrlAnnotationSaver$2\n*L\n198#1:422\n198#1:423\n*E\n"})
final class SaversKt.UrlAnnotationSaver.2 extends N implements Function1 {
    public static final SaversKt.UrlAnnotationSaver.2 e;

    static {
        SaversKt.UrlAnnotationSaver.2.e = new SaversKt.UrlAnnotationSaver.2();
    }

    SaversKt.UrlAnnotationSaver.2() {
        super(1);
    }

    @m
    public final UrlAnnotation a(@l Object object0) {
        L.p(object0, "it");
        return new UrlAnnotation(((String)object0));
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.a(object0);
    }
}

