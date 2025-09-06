package T2;

import kotlin.jvm.internal.w;
import y4.l;

public enum d {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        public final d fromYears$vungle_ads_release(int v) {
            d d0;
            d[] arr_d = d.values();
            for(int v1 = 0; true; ++v1) {
                d0 = null;
                if(v1 >= arr_d.length) {
                    break;
                }
                d0 = arr_d[v1];
                kotlin.ranges.l l0 = d0.getRange();
                if(v <= l0.h() && l0.g() <= v) {
                    break;
                }
            }
            return d0 == null ? d.LESS_THAN_ONE_YEAR : d0;
        }
    }

    LESS_THAN_ONE_YEAR(0, new kotlin.ranges.l(0x80000000, 0)),
    ONE_TO_FIVE_YEARS(1, new kotlin.ranges.l(1, 5)),
    SIX_TO_TEN_YEARS(2, new kotlin.ranges.l(6, 10)),
    ELEVEN_TO_TWENTY_YEARS(3, new kotlin.ranges.l(11, 20)),
    TWENTY_ONE_TO_THIRTY_YEARS(4, new kotlin.ranges.l(21, 30)),
    THIRTY_ONE_TO_FORTY_YEARS(5, new kotlin.ranges.l(0x1F, 40)),
    FORTY_ONE_TO_FIFTY_YEARS(6, new kotlin.ranges.l(41, 50)),
    FIFTY_ONE_TO_SIXTY_YEARS(7, new kotlin.ranges.l(51, 60)),
    SIXTY_ONE_TO_SEVENTY_YEARS(8, new kotlin.ranges.l(61, 70)),
    OVER_SEVENTY_ONE_YEARS(9, new kotlin.ranges.l(71, 0x7FFFFFFF));

    @l
    public static final a Companion;
    private final int id;
    @l
    private final kotlin.ranges.l range;

    private static final d[] $values() [...] // Inlined contents

    static {
        d.Companion = new a(null);
    }

    private d(int v1, kotlin.ranges.l l0) {
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

