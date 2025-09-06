package T2;

import kotlin.jvm.internal.w;
import y4.l;

public enum a {
    public static final class T2.a.a {
        private T2.a.a() {
        }

        public T2.a.a(w w0) {
        }

        @l
        public final a fromAge$vungle_ads_release(int v) {
            a a0;
            a[] arr_a = a.values();
            for(int v1 = 0; true; ++v1) {
                a0 = null;
                if(v1 >= arr_a.length) {
                    break;
                }
                a0 = arr_a[v1];
                kotlin.ranges.l l0 = a0.getRange();
                if(v <= l0.h() && l0.g() <= v) {
                    break;
                }
            }
            return a0 == null ? a.OTHERS : a0;
        }
    }

    AGE_18_20(1, new kotlin.ranges.l(18, 20)),
    AGE_21_30(2, new kotlin.ranges.l(21, 30)),
    AGE_31_40(3, new kotlin.ranges.l(0x1F, 40)),
    AGE_41_50(4, new kotlin.ranges.l(41, 50)),
    AGE_51_60(5, new kotlin.ranges.l(51, 60)),
    AGE_61_70(6, new kotlin.ranges.l(61, 70)),
    AGE_71_75(7, new kotlin.ranges.l(71, 75)),
    OTHERS(0, new kotlin.ranges.l(0x80000000, 0x7FFFFFFF));

    @l
    public static final T2.a.a Companion;
    private final int id;
    @l
    private final kotlin.ranges.l range;

    private static final a[] $values() [...] // Inlined contents

    static {
        a.Companion = new T2.a.a(null);
    }

    private a(int v1, kotlin.ranges.l l0) {
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

