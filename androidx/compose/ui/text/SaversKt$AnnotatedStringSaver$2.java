package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$AnnotatedStringSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n55#2,2:422\n55#2,2:425\n70#2:428\n55#2,2:431\n1#3:424\n1#3:427\n1#3:429\n1#3:430\n1#3:433\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$AnnotatedStringSaver$2\n*L\n86#1:422,2\n88#1:425,2\n90#1:428\n93#1:431,2\n86#1:424\n88#1:427\n90#1:429\n93#1:433\n*E\n"})
final class SaversKt.AnnotatedStringSaver.2 extends N implements Function1 {
    public static final SaversKt.AnnotatedStringSaver.2 e;

    static {
        SaversKt.AnnotatedStringSaver.2.e = new SaversKt.AnnotatedStringSaver.2();
    }

    SaversKt.AnnotatedStringSaver.2() {
        super(1);
    }

    @m
    public final AnnotatedString a(@l Object object0) {
        List list4;
        List list3;
        List list2;
        List list1;
        L.p(object0, "it");
        Object object1 = ((List)object0).get(1);
        Saver saver0 = SaversKt.b;
        List list0 = null;
        if(L.g(object1, Boolean.FALSE)) {
            list1 = null;
        }
        else if(object1 != null) {
            list1 = (List)saver0.b(object1);
        }
        else {
            list1 = null;
        }
        Object object2 = ((List)object0).get(2);
        Saver saver1 = SaversKt.b;
        if(L.g(object2, Boolean.FALSE)) {
            list2 = null;
        }
        else if(object2 != null) {
            list2 = (List)saver1.b(object2);
        }
        else {
            list2 = null;
        }
        Object object3 = ((List)object0).get(0);
        String s = object3 == null ? null : ((String)object3);
        L.m(s);
        if(list1 == null) {
            list3 = null;
        }
        else {
            Collection collection0 = list1;
            if(collection0.isEmpty()) {
                collection0 = null;
            }
            list3 = (List)collection0;
        }
        if(list2 == null) {
            list4 = null;
        }
        else {
            Collection collection1 = list2;
            if(collection1.isEmpty()) {
                collection1 = null;
            }
            list4 = (List)collection1;
        }
        Object object4 = ((List)object0).get(3);
        Saver saver2 = SaversKt.b;
        if(!L.g(object4, Boolean.FALSE) && object4 != null) {
            list0 = (List)saver2.b(object4);
        }
        return new AnnotatedString(s, list3, list4, list0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.a(object0);
    }
}

