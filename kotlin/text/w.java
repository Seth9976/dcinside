package kotlin.text;

import kotlin.h0;
import kotlin.internal.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

class w {
    @l
    public static final Appendable a(@l Appendable appendable0, @l CharSequence[] arr_charSequence) {
        L.p(appendable0, "<this>");
        L.p(arr_charSequence, "value");
        for(int v = 0; v < arr_charSequence.length; ++v) {
            appendable0.append(arr_charSequence[v]);
        }
        return appendable0;
    }

    public static void b(@l Appendable appendable0, Object object0, @m Function1 function10) {
        L.p(appendable0, "<this>");
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

    @h0(version = "1.4")
    @f
    private static final Appendable c(Appendable appendable0) {
        L.p(appendable0, "<this>");
        Appendable appendable1 = appendable0.append('\n');
        L.o(appendable1, "append(...)");
        return appendable1;
    }

    @h0(version = "1.4")
    @f
    private static final Appendable d(Appendable appendable0, char c) {
        L.p(appendable0, "<this>");
        Appendable appendable1 = appendable0.append(c);
        L.o(appendable1, "append(...)");
        Appendable appendable2 = appendable1.append('\n');
        L.o(appendable2, "append(...)");
        return appendable2;
    }

    @h0(version = "1.4")
    @f
    private static final Appendable e(Appendable appendable0, CharSequence charSequence0) {
        L.p(appendable0, "<this>");
        Appendable appendable1 = appendable0.append(charSequence0);
        L.o(appendable1, "append(...)");
        Appendable appendable2 = appendable1.append('\n');
        L.o(appendable2, "append(...)");
        return appendable2;
    }

    @h0(version = "1.4")
    @l
    public static final Appendable f(@l Appendable appendable0, @l CharSequence charSequence0, int v, int v1) {
        L.p(appendable0, "<this>");
        L.p(charSequence0, "value");
        Appendable appendable1 = appendable0.append(charSequence0, v, v1);
        L.n(appendable1, "null cannot be cast to non-null type T of kotlin.text.StringsKt__AppendableKt.appendRange");
        return appendable1;
    }
}

