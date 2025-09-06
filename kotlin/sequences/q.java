package kotlin.sequences;

import A3.o;
import java.util.Iterator;
import kotlin.b;
import kotlin.coroutines.d;
import kotlin.h0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

class q {
    private static final int a = 0;
    private static final int b = 1;
    private static final int c = 2;
    private static final int d = 3;
    private static final int e = 4;
    private static final int f = 5;

    @h0(version = "1.3")
    @l
    public static Iterator a(@b @l o o0) {
        L.p(o0, "block");
        Iterator iterator0 = new n();
        ((n)iterator0).j(kotlin.coroutines.intrinsics.b.b(o0, iterator0, ((d)iterator0)));
        return iterator0;
    }

    @h0(version = "1.3")
    @l
    public static m b(@b @l o o0) {
        @s0({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 SequenceBuilder.kt\nkotlin/sequences/SequencesKt__SequenceBuilderKt\n*L\n1#1,22:1\n26#2:23\n*E\n"})
        public static final class a implements m {
            final o a;

            public a(o o0) {
                this.a = o0;
                super();
            }

            @Override  // kotlin.sequences.m
            public Iterator iterator() {
                return p.a(this.a);
            }
        }

        L.p(o0, "block");
        return new a(o0);
    }
}

