package T2;

import kotlin.jvm.internal.w;
import y4.l;

public enum g {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        public final g fromCost$vungle_ads_release(int v) {
            g g0;
            g[] arr_g = g.values();
            for(int v1 = 0; true; ++v1) {
                g0 = null;
                if(v1 >= arr_g.length) {
                    break;
                }
                g0 = arr_g[v1];
                kotlin.ranges.l l0 = g0.getRange();
                if(v <= l0.h() && l0.g() <= v) {
                    break;
                }
            }
            return g0 == null ? g.UNDER_500 : g0;
        }
    }

    UNDER_500(0, new kotlin.ranges.l(0x80000000, 500)),
    FROM_500_TO_1000(1, new kotlin.ranges.l(501, 1000)),
    FROM_1000_TO_1500(2, new kotlin.ranges.l(1001, 1500)),
    FROM_1500_TO_2000(3, new kotlin.ranges.l(1501, 2000)),
    FROM_2000_TO_2500(4, new kotlin.ranges.l(2001, 2500)),
    FROM_2500_TO_3000(5, new kotlin.ranges.l(2501, 3000)),
    FROM_3000_TO_3500(6, new kotlin.ranges.l(3001, 3500)),
    FROM_3500_TO_4000(7, new kotlin.ranges.l(3501, 4000)),
    FROM_4000_TO_4500(8, new kotlin.ranges.l(4001, 4500)),
    OVER_4500(9, new kotlin.ranges.l(4501, 0x7FFFFFFF));

    @l
    public static final a Companion;
    private final int id;
    @l
    private final kotlin.ranges.l range;

    private static final g[] $values() [...] // Inlined contents

    static {
        g.Companion = new a(null);
    }

    private g(int v1, kotlin.ranges.l l0) {
        this.id = v1;
        this.range = l0;
    }

    public final int getId() {
        return this.id;
    }

    @l
    public final kotlin.ranges.l getRange() {
        return this.range;
    }
}

