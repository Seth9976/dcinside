package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.s;
import kotlin.text.v;
import y4.l;
import y4.m;

public interface SelectionAdjustment {
    public static final class Companion {
        static final Companion a;
        @l
        private static final SelectionAdjustment b;
        @l
        private static final SelectionAdjustment c;
        @l
        private static final SelectionAdjustment d;
        @l
        private static final SelectionAdjustment e;
        @l
        private static final SelectionAdjustment f;

        static {
            Companion.a = new Companion();
            Companion.b = new SelectionAdjustment.Companion.None.1();
            Companion.c = new SelectionAdjustment.Companion.Character.1();
            Companion.d = new SelectionAdjustment.Companion.Word.1();
            Companion.e = new SelectionAdjustment.Companion.Paragraph.1();
            Companion.f = new SelectionAdjustment.Companion.CharacterWithWordAccelerate.1();
        }

        private final long b(TextLayoutResult textLayoutResult0, long v, Function1 function10) {
            if(textLayoutResult0.l().n().length() == 0) {
                return 0L;
            }
            int v1 = v.j3(textLayoutResult0.l().n());
            long v2 = ((TextRange)function10.invoke(s.I(((int)(v >> 0x20)), 0, v1))).r();
            long v3 = ((TextRange)function10.invoke(s.I(((int)(v & 0xFFFFFFFFL)), 0, v1))).r();
            int v4 = TextRange.m(v) ? ((int)(v2 & 0xFFFFFFFFL)) : ((int)(v2 >> 0x20));
            return TextRange.m(v) ? TextRangeKt.b(v4, ((int)(v3 >> 0x20))) : TextRangeKt.b(v4, ((int)(v3 & 0xFFFFFFFFL)));
        }

        @l
        public final SelectionAdjustment c() {
            return Companion.c;
        }

        @l
        public final SelectionAdjustment d() {
            return Companion.f;
        }

        @l
        public final SelectionAdjustment e() {
            return Companion.b;
        }

        @l
        public final SelectionAdjustment f() {
            return Companion.e;
        }

        @l
        public final SelectionAdjustment g() {
            return Companion.d;
        }
    }

    @l
    public static final Companion a;

    static {
        SelectionAdjustment.a = Companion.a;
    }

    long a(@l TextLayoutResult arg1, long arg2, int arg3, boolean arg4, @m TextRange arg5);
}

