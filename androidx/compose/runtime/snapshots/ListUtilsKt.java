package androidx.compose.runtime.snapshots;

import A3.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nListUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,238:1\n33#1,6:239\n33#1,6:245\n33#1,6:251\n33#1,6:257\n33#1,4:263\n38#1:274\n33#1,4:275\n38#1:280\n64#1,6:281\n361#2,7:267\n1#3:279\n*S KotlinDebug\n*F\n+ 1 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n50#1:239,6\n84#1:245,6\n94#1:251,6\n111#1:257,6\n122#1:263,4\n122#1:274\n213#1:275,4\n213#1:280\n233#1:281,6\n124#1:267,7\n*E\n"})
public final class ListUtilsKt {
    private static final void a(Appendable appendable0, Object object0, Function1 function10) {
        if(function10 != null) {
            appendable0.append(((CharSequence)function10.invoke(object0)));
            return;
        }
        if((object0 == null ? true : object0 instanceof CharSequence)) {
            appendable0.append(((CharSequence)object0));
            return;
        }
        if(object0 instanceof Character) {
            appendable0.append(((Character)object0).charValue());
            return;
        }
        appendable0.append(String.valueOf(object0));
    }

    public static final boolean b(@l List list0, @l Function1 function10) {
        L.p(list0, "<this>");
        L.p(function10, "predicate");
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(!((Boolean)function10.invoke(list0.get(v1))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean c(@l List list0, @l Function1 function10) {
        L.p(list0, "<this>");
        L.p(function10, "predicate");
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(((Boolean)function10.invoke(list0.get(v1))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @l
    public static final List d(@l List list0, @l o o0) {
        L.p(list0, "<this>");
        L.p(o0, "predicate");
        List list1 = new ArrayList(list0.size());
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = list0.get(v1);
            if(((Boolean)o0.invoke(v1, object0)).booleanValue()) {
                list1.add(object0);
            }
        }
        return list1;
    }

    public static final void e(@l List list0, @l Function1 function10) {
        L.p(list0, "<this>");
        L.p(function10, "action");
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            function10.invoke(list0.get(v1));
        }
    }

    public static final void f(@l List list0, @l o o0) {
        L.p(list0, "<this>");
        L.p(o0, "action");
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            o0.invoke(v1, list0.get(v1));
        }
    }

    @l
    public static final Map g(@l List list0, @l Function1 function10) {
        L.p(list0, "<this>");
        L.p(function10, "keySelector");
        Map map0 = new HashMap(list0.size());
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = list0.get(v1);
            Object object1 = function10.invoke(object0);
            ArrayList arrayList0 = map0.get(object1);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                map0.put(object1, arrayList0);
            }
            arrayList0.add(object0);
        }
        return map0;
    }

    private static final Appendable h(List list0, Appendable appendable0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10) {
        appendable0.append(charSequence1);
        int v1 = list0.size();
        int v3 = 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            Object object0 = list0.get(v2);
            ++v3;
            if(v3 > 1) {
                appendable0.append(charSequence0);
            }
            if(v >= 0 && v3 > v) {
                break;
            }
            ListUtilsKt.a(appendable0, object0, function10);
        }
        if(v >= 0 && v3 > v) {
            appendable0.append(charSequence3);
        }
        appendable0.append(charSequence2);
        return appendable0;
    }

    static Appendable i(List list0, Appendable appendable0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10, int v1, Object object0) {
        CharSequence charSequence4 = (v1 & 2) == 0 ? charSequence0 : ", ";
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (v1 & 4) == 0 ? charSequence1 : "";
        if((v1 & 8) == 0) {
            charSequence5 = charSequence2;
        }
        int v2 = (v1 & 16) == 0 ? v : -1;
        if((v1 & 0x20) != 0) {
            return (v1 & 0x40) == 0 ? ListUtilsKt.h(list0, appendable0, charSequence4, charSequence6, charSequence5, v2, "...", function10) : ListUtilsKt.h(list0, appendable0, charSequence4, charSequence6, charSequence5, v2, "...", null);
        }
        return (v1 & 0x40) == 0 ? ListUtilsKt.h(list0, appendable0, charSequence4, charSequence6, charSequence5, v2, charSequence3, function10) : ListUtilsKt.h(list0, appendable0, charSequence4, charSequence6, charSequence5, v2, charSequence3, null);
    }

    @l
    public static final String j(@l List list0, @l CharSequence charSequence0, @l CharSequence charSequence1, @l CharSequence charSequence2, int v, @l CharSequence charSequence3, @m Function1 function10) {
        L.p(list0, "<this>");
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        L.p(charSequence2, "postfix");
        L.p(charSequence3, "truncated");
        String s = ((StringBuilder)ListUtilsKt.h(list0, new StringBuilder(), charSequence0, charSequence1, charSequence2, v, charSequence3, function10)).toString();
        L.o(s, "fastJoinTo(StringBuilder…form)\n        .toString()");
        return s;
    }

    public static String k(List list0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10, int v1, Object object0) {
        if((v1 & 1) != 0) {
            charSequence0 = ", ";
        }
        CharSequence charSequence4 = "";
        CharSequence charSequence5 = (v1 & 2) == 0 ? charSequence1 : "";
        if((v1 & 4) == 0) {
            charSequence4 = charSequence2;
        }
        if((v1 & 16) != 0) {
            charSequence3 = "...";
        }
        if((v1 & 0x20) != 0) {
            function10 = null;
        }
        return ListUtilsKt.j(list0, charSequence0, charSequence5, charSequence4, ((v1 & 8) == 0 ? v : -1), charSequence3, function10);
    }

    @l
    public static final List l(@l List list0, @l Function1 function10) {
        L.p(list0, "<this>");
        L.p(function10, "transform");
        List list1 = new ArrayList(list0.size());
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            list1.add(function10.invoke(list0.get(v1)));
        }
        return list1;
    }

    @l
    public static final List m(@l List list0, @l Function1 function10) {
        L.p(list0, "<this>");
        L.p(function10, "transform");
        List list1 = new ArrayList(list0.size());
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = function10.invoke(list0.get(v1));
            if(object0 != null) {
                list1.add(object0);
            }
        }
        return list1;
    }

    @l
    public static final Set n(@l List list0) {
        L.p(list0, "<this>");
        Set set0 = new HashSet(list0.size());
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((HashSet)set0).add(list0.get(v1));
        }
        return set0;
    }
}

