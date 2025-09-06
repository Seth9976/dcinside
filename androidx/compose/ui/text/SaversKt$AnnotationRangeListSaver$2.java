package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$AnnotationRangeListSaver$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n151#2,3:422\n33#2,4:425\n154#2:429\n155#2:433\n38#2:434\n156#2:435\n55#3,2:430\n1#4:432\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$AnnotationRangeListSaver$2\n*L\n107#1:422,3\n107#1:425,4\n107#1:429\n107#1:433\n107#1:434\n107#1:435\n108#1:430,2\n108#1:432\n*E\n"})
final class SaversKt.AnnotationRangeListSaver.2 extends N implements Function1 {
    public static final SaversKt.AnnotationRangeListSaver.2 e;

    static {
        SaversKt.AnnotationRangeListSaver.2.e = new SaversKt.AnnotationRangeListSaver.2();
    }

    SaversKt.AnnotationRangeListSaver.2() {
        super(1);
    }

    @m
    public final List a(@l Object object0) {
        L.p(object0, "it");
        List list0 = new ArrayList(((List)object0).size());
        int v = ((List)object0).size();
        for(int v1 = 0; v1 < v; ++v1) {
            Object object1 = ((List)object0).get(v1);
            Saver saver0 = SaversKt.c;
            Range annotatedString$Range0 = null;
            if(!L.g(object1, Boolean.FALSE) && object1 != null) {
                annotatedString$Range0 = (Range)saver0.b(object1);
            }
            L.m(annotatedString$Range0);
            list0.add(annotatedString$Range0);
        }
        return list0;
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.a(object0);
    }
}

