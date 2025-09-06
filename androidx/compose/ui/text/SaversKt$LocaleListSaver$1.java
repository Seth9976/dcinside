package androidx.compose.ui.text;

import A3.o;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$LocaleListSaver$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,421:1\n151#2,3:422\n33#2,4:425\n154#2,2:429\n38#2:431\n156#2:432\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$LocaleListSaver$1\n*L\n404#1:422,3\n404#1:425,4\n404#1:429,2\n404#1:431\n404#1:432\n*E\n"})
final class SaversKt.LocaleListSaver.1 extends N implements o {
    public static final SaversKt.LocaleListSaver.1 e;

    static {
        SaversKt.LocaleListSaver.1.e = new SaversKt.LocaleListSaver.1();
    }

    SaversKt.LocaleListSaver.1() {
        super(2);
    }

    @m
    public final Object a(@l SaverScope saverScope0, @l LocaleList localeList0) {
        L.p(saverScope0, "$this$Saver");
        L.p(localeList0, "it");
        List list0 = localeList0.d();
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            arrayList0.add(SaversKt.z(((Locale)list0.get(v1)), SaversKt.m(Locale.b), saverScope0));
        }
        return arrayList0;
    }

    @Override  // A3.o
    public Object invoke(Object object0, Object object1) {
        return this.a(((SaverScope)object0), ((LocaleList)object1));
    }
}

