package androidx.compose.ui.text;

import A3.o;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;
import y4.m;

final class SaversKt.AnnotatedStringSaver.1 extends N implements o {
    public static final SaversKt.AnnotatedStringSaver.1 e;

    static {
        SaversKt.AnnotatedStringSaver.1.e = new SaversKt.AnnotatedStringSaver.1();
    }

    SaversKt.AnnotatedStringSaver.1() {
        super(2);
    }

    @m
    public final Object a(@l SaverScope saverScope0, @l AnnotatedString annotatedString0) {
        L.p(saverScope0, "$this$Saver");
        L.p(annotatedString0, "it");
        return u.s(new Object[]{SaversKt.y(annotatedString0.j()), SaversKt.z(annotatedString0.f(), SaversKt.b, saverScope0), SaversKt.z(annotatedString0.d(), SaversKt.b, saverScope0), SaversKt.z(annotatedString0.b(), SaversKt.b, saverScope0)});
    }

    @Override  // A3.o
    public Object invoke(Object object0, Object object1) {
        return this.a(((SaverScope)object0), ((AnnotatedString)object1));
    }
}

