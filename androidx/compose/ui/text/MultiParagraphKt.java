package androidx.compose.ui.text;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nMultiParagraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraphKt\n*L\n1#1,980:1\n850#1,16:981\n850#1,16:997\n850#1,16:1013\n*S KotlinDebug\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraphKt\n*L\n800#1:981,16\n820#1:997,16\n840#1:1013,16\n*E\n"})
public final class MultiParagraphKt {
    private static final int a(List list0, Function1 function10) {
        int v = list0.size() - 1;
        int v1 = 0;
        while(v1 <= v) {
            int v2 = v1 + v >>> 1;
            int v3 = ((Number)function10.invoke(list0.get(v2))).intValue();
            if(v3 < 0) {
                v1 = v2 + 1;
                continue;
            }
            if(v3 > 0) {
                v = v2 - 1;
                continue;
            }
            return v2;
        }
        return -(v1 + 1);
    }

    // This method was un-flattened
    public static final int b(@l List list0, int v) {
        int v4;
        L.p(list0, "paragraphInfoList");
        int v1 = list0.size() - 1;
        int v2 = 0;
        while(v2 <= v1) {
            int v3 = v2 + v1 >>> 1;
            ParagraphInfo paragraphInfo0 = (ParagraphInfo)list0.get(v3);
            if(paragraphInfo0.o() > v) {
                v4 = 1;
            }
            else if(paragraphInfo0.k() <= v) {
                v4 = -1;
                v2 = v3 + 1;
                continue;
            }
            if(v4 > 0) {
                v1 = v3 - 1;
                continue;
            }
            return v3;
        }
        return -(v2 + 1);
    }

    // This method was un-flattened
    public static final int c(@l List list0, int v) {
        int v4;
        L.p(list0, "paragraphInfoList");
        int v1 = list0.size() - 1;
        int v2 = 0;
        while(v2 <= v1) {
            int v3 = v2 + v1 >>> 1;
            ParagraphInfo paragraphInfo0 = (ParagraphInfo)list0.get(v3);
            if(paragraphInfo0.p() > v) {
                v4 = 1;
            }
            else if(paragraphInfo0.l() <= v) {
                v4 = -1;
                v2 = v3 + 1;
                continue;
            }
            if(v4 > 0) {
                v1 = v3 - 1;
                continue;
            }
            return v3;
        }
        return -(v2 + 1);
    }

    // This method was un-flattened
    public static final int d(@l List list0, float f) {
        int v3;
        L.p(list0, "paragraphInfoList");
        int v = list0.size() - 1;
        int v1 = 0;
        while(v1 <= v) {
            int v2 = v1 + v >>> 1;
            ParagraphInfo paragraphInfo0 = (ParagraphInfo)list0.get(v2);
            if(paragraphInfo0.q() > f) {
                v3 = 1;
            }
            else if(paragraphInfo0.j() <= f) {
                v3 = -1;
                v1 = v2 + 1;
                continue;
            }
            if(v3 > 0) {
                v = v2 - 1;
                continue;
            }
            return v2;
        }
        return -(v1 + 1);
    }
}

