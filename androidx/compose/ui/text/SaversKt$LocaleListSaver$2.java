package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$LocaleListSaver$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,421:1\n151#2,3:422\n33#2,4:425\n154#2:429\n155#2:433\n38#2:434\n156#2:435\n55#3,2:430\n1#4:432\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$LocaleListSaver$2\n*L\n411#1:422,3\n411#1:425,4\n411#1:429\n411#1:433\n411#1:434\n411#1:435\n411#1:430,2\n411#1:432\n*E\n"})
final class SaversKt.LocaleListSaver.2 extends N implements Function1 {
    public static final SaversKt.LocaleListSaver.2 e;

    static {
        SaversKt.LocaleListSaver.2.e = new SaversKt.LocaleListSaver.2();
    }

    SaversKt.LocaleListSaver.2() {
        super(1);
    }

    @m
    public final LocaleList a(@l Object object0) {
        L.p(object0, "it");
        ArrayList arrayList0 = new ArrayList(((List)object0).size());
        int v = ((List)object0).size();
        for(int v1 = 0; v1 < v; ++v1) {
            Object object1 = ((List)object0).get(v1);
            Saver saver0 = SaversKt.m(Locale.b);
            Locale locale0 = null;
            if(!L.g(object1, Boolean.FALSE) && object1 != null) {
                locale0 = (Locale)saver0.b(object1);
            }
            L.m(locale0);
            arrayList0.add(locale0);
        }
        return new LocaleList(arrayList0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.a(object0);
    }
}

