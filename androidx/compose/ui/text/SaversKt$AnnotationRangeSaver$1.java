package androidx.compose.ui.text;

import A3.o;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.J;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;
import y4.m;

final class SaversKt.AnnotationRangeSaver.1 extends N implements o {
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

    public static final SaversKt.AnnotationRangeSaver.1 e;

    static {
        SaversKt.AnnotationRangeSaver.1.e = new SaversKt.AnnotationRangeSaver.1();
    }

    SaversKt.AnnotationRangeSaver.1() {
        super(2);
    }

    @m
    public final Object a(@l SaverScope saverScope0, @l Range annotatedString$Range0) {
        AnnotationType annotationType0;
        L.p(saverScope0, "$this$Saver");
        L.p(annotatedString$Range0, "it");
        Object object0 = annotatedString$Range0.h();
        if(object0 instanceof ParagraphStyle) {
            annotationType0 = AnnotationType.a;
        }
        else if(object0 instanceof SpanStyle) {
            annotationType0 = AnnotationType.b;
        }
        else if(object0 instanceof VerbatimTtsAnnotation) {
            annotationType0 = AnnotationType.c;
        }
        else {
            annotationType0 = object0 instanceof UrlAnnotation ? AnnotationType.d : AnnotationType.e;
        }
        switch(annotationType0) {
            case 1: {
                Object object4 = annotatedString$Range0.h();
                L.n(object4, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                return u.s(new Object[]{annotationType0, SaversKt.z(((ParagraphStyle)object4), SaversKt.g(), saverScope0), annotatedString$Range0.i(), annotatedString$Range0.g(), annotatedString$Range0.j()});
            }
            case 2: {
                Object object3 = annotatedString$Range0.h();
                L.n(object3, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                return u.s(new Object[]{annotationType0, SaversKt.z(((SpanStyle)object3), SaversKt.t(), saverScope0), annotatedString$Range0.i(), annotatedString$Range0.g(), annotatedString$Range0.j()});
            }
            case 3: {
                Object object2 = annotatedString$Range0.h();
                L.n(object2, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                return u.s(new Object[]{annotationType0, SaversKt.z(((VerbatimTtsAnnotation)object2), SaversKt.d, saverScope0), annotatedString$Range0.i(), annotatedString$Range0.g(), annotatedString$Range0.j()});
            }
            case 4: {
                Object object1 = annotatedString$Range0.h();
                L.n(object1, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                return u.s(new Object[]{annotationType0, SaversKt.z(((UrlAnnotation)object1), SaversKt.e, saverScope0), annotatedString$Range0.i(), annotatedString$Range0.g(), annotatedString$Range0.j()});
            }
            case 5: {
                return u.s(new Object[]{annotationType0, annotatedString$Range0.h(), annotatedString$Range0.i(), annotatedString$Range0.g(), annotatedString$Range0.j()});
            }
            default: {
                throw new J();
            }
        }
    }

    @Override  // A3.o
    public Object invoke(Object object0, Object object1) {
        return this.a(((SaverScope)object0), ((Range)object1));
    }
}

