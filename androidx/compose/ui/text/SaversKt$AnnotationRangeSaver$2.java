package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import java.util.List;
import kotlin.J;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$AnnotationRangeSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n70#2:422\n70#2:424\n70#2:426\n70#2:428\n55#2,2:430\n55#2,2:433\n55#2,2:436\n55#2,2:439\n70#2:442\n1#3:423\n1#3:425\n1#3:427\n1#3:429\n1#3:432\n1#3:435\n1#3:438\n1#3:441\n1#3:443\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$AnnotationRangeSaver$2\n*L\n160#1:422\n161#1:424\n162#1:426\n163#1:428\n167#1:430,2\n171#1:433,2\n175#1:436,2\n179#1:439,2\n183#1:442\n160#1:423\n161#1:425\n162#1:427\n163#1:429\n167#1:432\n171#1:435\n175#1:438\n179#1:441\n183#1:443\n*E\n"})
final class SaversKt.AnnotationRangeSaver.2 extends N implements Function1 {
    public final class WhenMappings {
        public static final int[] a;

        static {
            int[] arr_v = new int[AnnotationType.values().length];
            try {
                arr_v[AnnotationType.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[AnnotationType.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[AnnotationType.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[AnnotationType.d.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[AnnotationType.e.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.a = arr_v;
        }
    }

    public static final SaversKt.AnnotationRangeSaver.2 e;

    static {
        SaversKt.AnnotationRangeSaver.2.e = new SaversKt.AnnotationRangeSaver.2();
    }

    SaversKt.AnnotationRangeSaver.2() {
        super(1);
    }

    @m
    public final Range a(@l Object object0) {
        L.p(object0, "it");
        Object object1 = ((List)object0).get(0);
        Object object2 = null;
        AnnotationType annotationType0 = object1 == null ? null : ((AnnotationType)object1);
        L.m(annotationType0);
        Object object3 = ((List)object0).get(2);
        Integer integer0 = object3 == null ? null : ((Integer)object3);
        L.m(integer0);
        int v = integer0.intValue();
        Object object4 = ((List)object0).get(3);
        Integer integer1 = object4 == null ? null : ((Integer)object4);
        L.m(integer1);
        int v1 = integer1.intValue();
        Object object5 = ((List)object0).get(4);
        String s = object5 == null ? null : ((String)object5);
        L.m(s);
        int v2 = WhenMappings.a[annotationType0.ordinal()];
        switch(v2) {
            case 1: {
                Object object7 = ((List)object0).get(1);
                Saver saver0 = SaversKt.g();
                if(!L.g(object7, Boolean.FALSE) && object7 != null) {
                    object2 = (ParagraphStyle)saver0.b(object7);
                }
                L.m(object2);
                return new Range(object2, v, v1, s);
            }
            case 2: {
                Object object8 = ((List)object0).get(1);
                Saver saver1 = SaversKt.t();
                if(!L.g(object8, Boolean.FALSE) && object8 != null) {
                    object2 = (SpanStyle)saver1.b(object8);
                }
                L.m(object2);
                return new Range(object2, v, v1, s);
            }
            case 3: {
                Object object9 = ((List)object0).get(1);
                Saver saver2 = SaversKt.d;
                if(!L.g(object9, Boolean.FALSE) && object9 != null) {
                    object2 = (VerbatimTtsAnnotation)saver2.b(object9);
                }
                L.m(object2);
                return new Range(object2, v, v1, s);
            }
            case 4: {
                Object object10 = ((List)object0).get(1);
                Saver saver3 = SaversKt.e;
                if(!L.g(object10, Boolean.FALSE) && object10 != null) {
                    object2 = (UrlAnnotation)saver3.b(object10);
                }
                L.m(object2);
                return new Range(object2, v, v1, s);
            }
            default: {
                if(v2 != 5) {
                    throw new J();
                }
                Object object6 = ((List)object0).get(1);
                if(object6 != null) {
                    object2 = (String)object6;
                }
                L.m(object2);
                return new Range(object2, v, v1, s);
            }
        }
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.a(object0);
    }
}

