package androidx.core.util;

import android.util.Range;
import androidx.annotation.RequiresApi;
import kotlin.ranges.g.a;
import kotlin.ranges.g;
import y4.l;

public final class RangeKt {
    @RequiresApi(21)
    @l
    public static final Range a(@l Range range0, @l Range range1) {
        return range0.intersect(range1);
    }

    @RequiresApi(21)
    @l
    public static final Range b(@l Range range0, @l Range range1) {
        return range0.extend(range1);
    }

    @RequiresApi(21)
    @l
    public static final Range c(@l Range range0, @l Comparable comparable0) {
        return range0.extend(comparable0);
    }

    @RequiresApi(21)
    @l
    public static final Range d(@l Comparable comparable0, @l Comparable comparable1) {
        return new Range(comparable0, comparable1);
    }

    @RequiresApi(21)
    @l
    public static final g e(@l Range range0) {
        return new g() {
            @Override  // kotlin.ranges.g
            public boolean a(Comparable comparable0) {
                return a.a(this, comparable0);
            }

            @Override  // kotlin.ranges.g
            public Comparable d() {
                return range0.getUpper();
            }

            @Override  // kotlin.ranges.g
            public Comparable getStart() {
                return range0.getLower();
            }

            @Override  // kotlin.ranges.g
            public boolean isEmpty() {
                return a.b(this);
            }
        };
    }

    @RequiresApi(21)
    @l
    public static final Range f(@l g g0) {
        return new Range(g0.getStart(), g0.d());
    }
}

