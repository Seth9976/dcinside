package androidx.compose.ui.text;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.s0;

@s0({"SMAP\nMultiParagraphIntrinsics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsicsKt\n+ 2 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,152:1\n35#2,3:153\n38#2,2:160\n40#2:163\n33#3,4:156\n38#3:162\n151#3,5:164\n38#3:169\n156#3:170\n*S KotlinDebug\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsicsKt\n*L\n141#1:153,3\n141#1:160,2\n141#1:163\n141#1:156,4\n141#1:162\n141#1:164,5\n141#1:169\n141#1:170\n*E\n"})
public final class MultiParagraphIntrinsicsKt {
    private static final List b(List list0, int v, int v1) {
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v2 = list0.size();
        for(int v4 = 0; v4 < v2; ++v4) {
            Object object0 = list0.get(v4);
            if(AnnotatedStringKt.t(v, v1, ((Range)object0).i(), ((Range)object0).g())) {
                arrayList0.add(object0);
            }
        }
        List list1 = new ArrayList(arrayList0.size());
        int v5 = arrayList0.size();
        for(int v3 = 0; v3 < v5; ++v3) {
            Range annotatedString$Range0 = (Range)arrayList0.get(v3);
            if(v > annotatedString$Range0.i() || annotatedString$Range0.g() > v1) {
                throw new IllegalArgumentException("placeholder can not overlap with paragraph.");
            }
            list1.add(new Range(annotatedString$Range0.h(), annotatedString$Range0.i() - v, annotatedString$Range0.g() - v));
        }
        return list1;
    }
}

