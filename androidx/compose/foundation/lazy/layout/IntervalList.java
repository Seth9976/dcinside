package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s0;
import y4.l;

@ExperimentalFoundationApi
public interface IntervalList {
    @StabilityInferred(parameters = 1)
    @s0({"SMAP\nIntervalList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/IntervalList$Interval\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,216:1\n1#2:217\n*E\n"})
    public static final class Interval {
        private final int a;
        private final int b;
        private final Object c;
        public static final int d;

        static {
        }

        public Interval(int v, int v1, Object object0) {
            this.a = v;
            this.b = v1;
            this.c = object0;
            if(v < 0) {
                throw new IllegalArgumentException(("startIndex should be >= 0, but was " + v).toString());
            }
            if(v1 <= 0) {
                throw new IllegalArgumentException(("size should be >0, but was " + v1).toString());
            }
        }

        public final int a() {
            return this.b;
        }

        public final int b() {
            return this.a;
        }

        public final Object c() {
            return this.c;
        }
    }

    void a(int arg1, int arg2, @l Function1 arg3);

    @l
    Interval get(int arg1);

    int getSize();
}

