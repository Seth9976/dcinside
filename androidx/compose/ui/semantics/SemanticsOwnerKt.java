package androidx.compose.ui.semantics;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nSemanticsOwner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsOwner.kt\nandroidx/compose/ui/semantics/SemanticsOwnerKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,72:1\n33#2,6:73\n*S KotlinDebug\n*F\n+ 1 SemanticsOwner.kt\nandroidx/compose/ui/semantics/SemanticsOwnerKt\n*L\n63#1:73,6\n*E\n"})
public final class SemanticsOwnerKt {
    @l
    public static final List a(@l SemanticsOwner semanticsOwner0, boolean z) {
        L.p(semanticsOwner0, "<this>");
        return u.V5(SemanticsOwnerKt.b(semanticsOwner0, !z).values());
    }

    @l
    public static final Map b(@l SemanticsOwner semanticsOwner0, boolean z) {
        L.p(semanticsOwner0, "<this>");
        Map map0 = new LinkedHashMap();
        SemanticsOwnerKt.d(map0, (z ? semanticsOwner0.b() : semanticsOwner0.a()));
        return map0;
    }

    public static Map c(SemanticsOwner semanticsOwner0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        return SemanticsOwnerKt.b(semanticsOwner0, z);
    }

    private static final void d(Map map0, SemanticsNode semanticsNode0) {
        map0.put(semanticsNode0.l(), semanticsNode0);
        List list0 = semanticsNode0.i();
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            SemanticsOwnerKt.d(map0, ((SemanticsNode)list0.get(v1)));
        }
    }
}

