package androidx.compose.ui.semantics;

import A3.o;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nSemanticsProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsProperties.kt\nandroidx/compose/ui/semantics/SemanticsProperties$ContentDescription$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1195:1\n1#2:1196\n*E\n"})
final class SemanticsProperties.ContentDescription.1 extends N implements o {
    public static final SemanticsProperties.ContentDescription.1 e;

    static {
        SemanticsProperties.ContentDescription.1.e = new SemanticsProperties.ContentDescription.1();
    }

    SemanticsProperties.ContentDescription.1() {
        super(2);
    }

    @m
    public final List a(@m List list0, @l List list1) {
        L.p(list1, "childValue");
        if(list0 != null) {
            List list2 = u.Y5(list0);
            if(list2 != null) {
                list2.addAll(list1);
                return list2;
            }
        }
        return list1;
    }

    @Override  // A3.o
    public Object invoke(Object object0, Object object1) {
        return this.a(((List)object0), ((List)object1));
    }
}

