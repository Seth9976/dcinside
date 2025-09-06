package T2;

import kotlin.jvm.internal.w;
import y4.l;

public enum f {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        public final f fromPrice$vungle_ads_release(int v) {
            f f0;
            f[] arr_f = f.values();
            for(int v1 = 0; true; ++v1) {
                f0 = null;
                if(v1 >= arr_f.length) {
                    break;
                }
                f0 = arr_f[v1];
                kotlin.ranges.l l0 = f0.getRange();
                if(v <= l0.h() && l0.g() <= v) {
                    break;
                }
            }
            return f0 == null ? f.UNDER_100K : f0;
        }
    }

    UNDER_100K(0, new kotlin.ranges.l(0x80000000, 100000)),
    FROM_100K_TO_300K(1, new kotlin.ranges.l(100001, 300000)),
    FROM_300K_TO_500K(2, new kotlin.ranges.l(300001, 500000)),
    FROM_500K_TO_700K(3, new kotlin.ranges.l(500001, 700000)),
    FROM_700K_TO_900K(4, new kotlin.ranges.l(700001, 900000)),
    FROM_900K_TO_1M1(5, new kotlin.ranges.l(900001, 1100000)),
    FROM_1M1_TO_1M3(6, new kotlin.ranges.l(1100001, 1300000)),
    FROM_1M3_TO_1M5(7, new kotlin.ranges.l(1300001, 1500000)),
    FROM_1M5_TO_1M7(8, new kotlin.ranges.l(1500001, 1700000)),
    OVER_1M7(9, new kotlin.ranges.l(1700001, 0x7FFFFFFF));

    @l
    public static final a Companion;
    private final int id;
    @l
    private final kotlin.ranges.l range;

    private static final f[] $values() [...] // Inlined contents

    static {
        f.Companion = new a(null);
    }

    private f(int v1, kotlin.ranges.l l0) {
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

