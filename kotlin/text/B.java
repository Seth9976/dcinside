package kotlin.text;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.D;
import kotlin.E;
import kotlin.collections.Y;
import kotlin.collections.u;
import kotlin.enums.d;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.ranges.s;
import y4.l;

public enum b {
    @s0({"SMAP\nCharDirectionality.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CharDirectionality.kt\nkotlin/text/CharDirectionality$Companion$directionalityMap$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,124:1\n1202#2,2:125\n1230#2,4:127\n*S KotlinDebug\n*F\n+ 1 CharDirectionality.kt\nkotlin/text/CharDirectionality$Companion$directionalityMap$2\n*L\n118#1:125,2\n118#1:127,4\n*E\n"})
    static final class a extends N implements A3.a {
        public static final a e;

        static {
            a.e = new a();
        }

        a() {
            super(0);
        }

        public final Map b() {
            kotlin.enums.a a0 = b.c();
            Map map0 = new LinkedHashMap(s.u(Y.j(u.b0(a0, 10)), 16));
            for(Object object0: a0) {
                map0.put(((b)object0).d(), object0);
            }
            return map0;
        }

        @Override  // A3.a
        public Object invoke() {
            return this.b();
        }
    }

    public static final class kotlin.text.b.b {
        private kotlin.text.b.b() {
        }

        public kotlin.text.b.b(w w0) {
        }

        private final Map a() {
            return (Map)b.c.getValue();
        }

        @l
        public final b b(int v) {
            b b0 = (b)this.a().get(v);
            if(b0 == null) {
                throw new IllegalArgumentException("Directionality #" + v + " is not defined.");
            }
            return b0;
        }
    }

    UNDEFINED(-1),
    LEFT_TO_RIGHT(0),
    RIGHT_TO_LEFT(1),
    RIGHT_TO_LEFT_ARABIC(2),
    EUROPEAN_NUMBER(3),
    EUROPEAN_NUMBER_SEPARATOR(4),
    EUROPEAN_NUMBER_TERMINATOR(5),
    ARABIC_NUMBER(6),
    COMMON_NUMBER_SEPARATOR(7),
    NONSPACING_MARK(8),
    BOUNDARY_NEUTRAL(9),
    PARAGRAPH_SEPARATOR(10),
    SEGMENT_SEPARATOR(11),
    WHITESPACE(12),
    OTHER_NEUTRALS(13),
    LEFT_TO_RIGHT_EMBEDDING(14),
    LEFT_TO_RIGHT_OVERRIDE(15),
    RIGHT_TO_LEFT_EMBEDDING(16),
    RIGHT_TO_LEFT_OVERRIDE(17),
    POP_DIRECTIONAL_FORMAT(18);

    private final int a;
    @l
    public static final kotlin.text.b.b b;
    @l
    private static final D c;
    private static final b[] x;
    private static final kotlin.enums.a y;

    static {
        b.x = arr_b;
        L.p(arr_b, "entries");
        b.y = new d(arr_b);
        b.b = new kotlin.text.b.b(null);
        b.c = E.a(a.e);
    }

    private b(int v1) {
        this.a = v1;
    }

    private static final b[] a() [...] // Inlined contents

    @l
    public static kotlin.enums.a c() {
        return b.y;
    }

    public final int d() {
        return this.a;
    }
}

