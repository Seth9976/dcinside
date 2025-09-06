package androidx.compose.ui;

import A3.o;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.V;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nTempListUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TempListUtils.kt\nandroidx/compose/ui/TempListUtilsKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,213:1\n33#2,6:214\n33#2,4:220\n38#2:225\n1#3:224\n*S KotlinDebug\n*F\n+ 1 TempListUtils.kt\nandroidx/compose/ui/TempListUtilsKt\n*L\n94#1:214,6\n137#1:220,4\n137#1:225\n*E\n"})
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
    public static final Map b(@l List list0, @l Function1 function10) {
        L.p(list0, "<this>");
        L.p(function10, "transform");
        Map map0 = new LinkedHashMap(list0.size());
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            V v2 = (V)function10.invoke(list0.get(v1));
            map0.put(v2.e(), v2.f());
        }
        return map0;
    }

    private static final Appendable c(List list0, Appendable appendable0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10) {
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

    static Appendable d(List list0, Appendable appendable0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10, int v1, Object object0) {
        CharSequence charSequence4 = (v1 & 2) == 0 ? charSequence0 : ", ";
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (v1 & 4) == 0 ? charSequence1 : "";
        if((v1 & 8) == 0) {
            charSequence5 = charSequence2;
        }
        int v2 = (v1 & 16) == 0 ? v : -1;
        if((v1 & 0x20) != 0) {
            return (v1 & 0x40) == 0 ? TempListUtilsKt.c(list0, appendable0, charSequence4, charSequence6, charSequence5, v2, "...", function10) : TempListUtilsKt.c(list0, appendable0, charSequence4, charSequence6, charSequence5, v2, "...", null);
        }
        return (v1 & 0x40) == 0 ? TempListUtilsKt.c(list0, appendable0, charSequence4, charSequence6, charSequence5, v2, charSequence3, function10) : TempListUtilsKt.c(list0, appendable0, charSequence4, charSequence6, charSequence5, v2, charSequence3, null);
    }

    @l
    public static final String e(@l List list0, @l CharSequence charSequence0, @l CharSequence charSequence1, @l CharSequence charSequence2, int v, @l CharSequence charSequence3, @m Function1 function10) {
        L.p(list0, "<this>");
        L.p(charSequence0, "separator");
        L.p(charSequence1, "prefix");
        L.p(charSequence2, "postfix");
        L.p(charSequence3, "truncated");
        String s = ((StringBuilder)TempListUtilsKt.c(list0, new StringBuilder(), charSequence0, charSequence1, charSequence2, v, charSequence3, function10)).toString();
        L.o(s, "fastJoinTo(StringBuilder…form)\n        .toString()");
        return s;
    }

    public static String f(List list0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10, int v1, Object object0) {
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
        return TempListUtilsKt.e(list0, charSequence0, charSequence5, charSequence4, ((v1 & 8) == 0 ? v : -1), charSequence3, function10);
    }

    @l
    public static final List g(@l List list0, @l Function1 function10) {
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

    public static final Object h(@l List list0, @l o o0) {
        L.p(list0, "<this>");
        L.p(o0, "operation");
        if(list0.isEmpty()) {
            throw new UnsupportedOperationException("Empty collection can\'t be reduced.");
        }
        Object object0 = u.B2(list0);
        int v = u.J(list0);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                object0 = o0.invoke(object0, list0.get(v1));
                if(v1 == v) {
                    break;
                }
            }
        }
        return object0;
    }

    @l
    public static final List i(@l List list0, @l List list1, @l o o0) {
        L.p(list0, "<this>");
        L.p(list1, "other");
        L.p(o0, "transform");
        int v = Math.min(list0.size(), list1.size());
        List list2 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            list2.add(o0.invoke(list0.get(v1), list1.get(v1)));
        }
        return list2;
    }

    @l
    public static final List j(@l List list0, @l o o0) {
        L.p(list0, "<this>");
        L.p(o0, "transform");
        switch(list0.size()) {
            case 0: 
            case 1: {
                return u.H();
            }
            default: {
                List list1 = new ArrayList();
                int v = 0;
                Object object0 = list0.get(0);
                int v1 = u.J(list0);
                while(v < v1) {
                    ++v;
                    Object object1 = list0.get(v);
                    list1.add(o0.invoke(object0, object1));
                    object0 = object1;
                }
                return list1;
            }
        }
    }
}

