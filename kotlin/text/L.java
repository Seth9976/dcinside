package kotlin.text;

import kotlin.h0;
import kotlin.internal.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.r;

@s0({"SMAP\nHexFormat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HexFormat.kt\nkotlin/text/HexFormatKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,441:1\n1088#2,2:442\n*S KotlinDebug\n*F\n+ 1 HexFormat.kt\nkotlin/text/HexFormatKt\n*L\n440#1:442,2\n*E\n"})
public final class l {
    @h0(version = "1.9")
    @f
    @r
    private static final k a(Function1 function10) {
        L.p(function10, "builderAction");
        a k$a0 = new a();
        function10.invoke(k$a0);
        return k$a0.a();
    }

    private static final boolean c(String s) {
        int v = 0;
        while(v < s.length()) {
            int v1 = s.charAt(v);
            if(L.t(v1, 0x80) < 0 && !Character.isLetter(((char)v1))) {
                ++v;
                continue;
            }
            return true;
        }
        return false;
    }
}

