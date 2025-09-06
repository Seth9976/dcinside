package androidx.compose.ui.text;

import A3.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nTempListUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,289:1\n33#2,6:290\n33#2,6:296\n33#2,6:302\n33#2,6:308\n33#2,6:314\n33#2,6:320\n1#3:326\n*S KotlinDebug\n*F\n+ 1 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n*L\n37#1:290,6\n59#1:296,6\n110#1:302,6\n129#1:308,6\n148#1:314,6\n164#1:320,6\n*E\n"})
public final class TempListUtilsKt {
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

    @l
    public static final List b(@l List list0, @l Function1 function10) {
        L.p(list0, "<this>");
        L.p(function10, "selector");
        HashSet hashSet0 = new HashSet(list0.size());
        List list1 = new ArrayList(list0.size());
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = list0.get(v1);
            if(hashSet0.add(function10.invoke(object0))) {
                list1.add(object0);
            }
        }
        return list1;
    }

    @l
    public static final List c(@l List list0, int v) {
        L.p(list0, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("Requested element count " + v + " is less than zero.").toString());
        }
        if(v == 0) {
            return list0;
        }
        int v1 = list0.size() - v;
        if(v1 <= 0) {
            return u.H();
        }
        if(v1 == 1) {
            return u.k(u.p3(list0));
        }
        List list1 = new ArrayList(v1);
        int v2 = list0.size();
        while(v < v2) {
            list1.add(list0.get(v));
            ++v;
        }
        return list1;
    }

    @l
    public static final List d(@l List list0, @l Function1 function10) {
        L.p(list0, "<this>");
        L.p(function10, "predicate");
        List list1 = new ArrayList(list0.size());
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = list0.get(v1);
            if(((Boolean)function10.invoke(object0)).booleanValue()) {
                list1.add(object0);
            }
        }
        return list1;
    }

    @l
    public static final List e(@l List list0, @l Function1 function10) {
        L.p(list0, "<this>");
        L.p(function10, "predicate");
        List list1 = new ArrayList(list0.size());
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = list0.get(v1);
            if(!((Boolean)function10.invoke(object0)).booleanValue()) {
                list1.add(object0);
            }
        }
        return list1;
    }

    @l
    public static final List f(@l List list0) {
        L.p(list0, "<this>");
        List list1 = new ArrayList(list0.size());
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = list0.get(v1);
            if(object0 != null) {
                list1.add(object0);
            }
        }
        return list1;
    }

    @l
    public static final List g(@l List list0, @l Function1 function10) {
        L.p(list0, "<this>");
        L.p(function10, "transform");
        List list1 = new ArrayList(list0.size());
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            u.q0(list1, ((Iterable)function10.invoke(list0.get(v1))));
        }
        return list1;
    }

    public static final Object h(@l List list0, Object object0, @l o o0) {
        L.p(list0, "<this>");
        L.p(o0, "operation");
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            object0 = o0.invoke(object0, list0.get(v1));
        }
        return object0;
    }

    private static final Appendable i(List list0, Appendable appendable0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10) {
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
            TempListUtilsKt.a(appendable0, object0, function10);
        }
        if(v >= 0 && v3 > v) {
            appendable0.append(charSequence3);
        }
        appendable0.append(charSequence2);
        return appendable0;
    }

    static Appendable j(List list0, Appendable appendable0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10, int v1, Object object0) {
        CharSequence charSequence4 = (v1 & 2) == 0 ? charSequence0 : ", ";
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (v1 & 4) == 0 ? charSequence1 : "";
        if((v1 & 8) == 0) {
            charSequence5 = charSequence2;
        }
        int v2 = (v1 & 16) == 0 ? v : -1;
        if((v1 & 0x20) != 0) {
            return (v1 & 0x40) == 0 ? TempListUtilsKt.i(list0, appendable0, charSequence4, charSequence6, charSequence5, v2, "...", function10) : TempListUtilsKt.i(list0, appendable0, charSequence4, charSequence6, charSequence5, v2, "...", null);
        }
        return (v1 & 0x40) == 0 ? TempListUtilsKt.i(list0, appendable0, charSequence4, charSequence6, charSequence5, v2, charSequence3, function10) : TempListUtilsKt.i(list0, appendable0, charSequence4, charSequence6, charSequence5, v2, charSequence3, null);
    }

    @l
    public static final String k(@l List list0, @l CharSequence charSequence0, @l CharSequence charSequence1, @l CharSequence charSequence2, int v, @l CharSequence charSequence3, @m Function1 function10) {
        L.p(list0, "<this>");
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        L.p(charSequence2, "postfix");
        L.p(charSequence3, "truncated");
        String s = ((StringBuilder)TempListUtilsKt.i(list0, new StringBuilder(), charSequence0, charSequence1, charSequence2, v, charSequence3, function10)).toString();
        L.o(s, "fastJoinTo(StringBuilder…form)\n        .toString()");
        return s;
    }

    public static String l(List list0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10, int v1, Object object0) {
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
        return TempListUtilsKt.k(list0, charSequence0, charSequence5, charSequence4, ((v1 & 8) == 0 ? v : -1), charSequence3, function10);
    }

    @m
    public static final Object m(@l List list0, @l Function1 function10) {
        L.p(list0, "<this>");
        L.p(function10, "selector");
        if(list0.isEmpty()) {
            return null;
        }
        Object object0 = list0.get(0);
        Comparable comparable0 = (Comparable)function10.invoke(object0);
        int v = u.J(list0);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = list0.get(v1);
                Comparable comparable1 = (Comparable)function10.invoke(object1);
                if(comparable0.compareTo(comparable1) > 0) {
                    object0 = object1;
                    comparable0 = comparable1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return object0;
    }

    @l
    public static final List n(@l List list0, @l Function1 function10) {
        L.p(list0, "<this>");
        L.p(function10, "predicate");
        List list1 = new ArrayList(list0.size());
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = list0.get(v1);
            if(!((Boolean)function10.invoke(object0)).booleanValue()) {
                break;
            }
            list1.add(object0);
        }
        return list1;
    }
}

