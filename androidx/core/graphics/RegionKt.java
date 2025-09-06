package androidx.core.graphics;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.Region;
import android.graphics.RegionIterator;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nRegion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Region.kt\nandroidx/core/graphics/RegionKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,117:1\n51#1:119\n31#1:121\n36#1:123\n1#2:118\n1#2:120\n1#2:122\n1#2:124\n*S KotlinDebug\n*F\n+ 1 Region.kt\nandroidx/core/graphics/RegionKt\n*L\n55#1:119\n58#1:121\n61#1:123\n55#1:120\n58#1:122\n61#1:124\n*E\n"})
public final class RegionKt {
    @l
    public static final Region a(@l Region region0, @l Rect rect0) {
        Region region1 = new Region(region0);
        region1.op(rect0, Region.Op.INTERSECT);
        return region1;
    }

    @l
    public static final Region b(@l Region region0, @l Region region1) {
        Region region2 = new Region(region0);
        region2.op(region1, Region.Op.INTERSECT);
        return region2;
    }

    public static final boolean c(@l Region region0, @l Point point0) {
        return region0.contains(point0.x, point0.y);
    }

    public static final void d(@l Region region0, @l Function1 function10) {
        RegionIterator regionIterator0 = new RegionIterator(region0);
        while(true) {
            Rect rect0 = new Rect();
            if(!regionIterator0.next(rect0)) {
                break;
            }
            function10.invoke(rect0);
        }
    }

    @l
    public static final Iterator e(@l Region region0) {
        return new Object() {
            private final RegionIterator a;
            private final Rect b;
            private boolean c;

            {
                Region region0 = region0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                RegionIterator regionIterator0 = new RegionIterator(region0);
                this.a = regionIterator0;
                Rect rect0 = new Rect();
                this.b = rect0;
                this.c = regionIterator0.next(rect0);
            }

            public Rect a() {
                if(!this.c) {
                    throw new IndexOutOfBoundsException();
                }
                Rect rect0 = new Rect(this.b);
                this.c = this.a.next(this.b);
                return rect0;
            }

            @Override
            public boolean hasNext() {
                return this.c;
            }

            @Override
            public Object next() {
                return this.a();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        };
    }

    @l
    public static final Region f(@l Region region0, @l Rect rect0) {
        Region region1 = new Region(region0);
        region1.op(rect0, Region.Op.DIFFERENCE);
        return region1;
    }

    @l
    public static final Region g(@l Region region0, @l Region region1) {
        Region region2 = new Region(region0);
        region2.op(region1, Region.Op.DIFFERENCE);
        return region2;
    }

    @l
    public static final Region h(@l Region region0) {
        Region region1 = new Region(region0.getBounds());
        region1.op(region0, Region.Op.DIFFERENCE);
        return region1;
    }

    @l
    public static final Region i(@l Region region0, @l Rect rect0) {
        Region region1 = new Region(region0);
        region1.union(rect0);
        return region1;
    }

    @l
    public static final Region j(@l Region region0, @l Region region1) {
        Region region2 = new Region(region0);
        region2.op(region1, Region.Op.UNION);
        return region2;
    }

    @l
    public static final Region k(@l Region region0, @l Rect rect0) {
        Region region1 = new Region(region0);
        region1.union(rect0);
        return region1;
    }

    @l
    public static final Region l(@l Region region0, @l Region region1) {
        Region region2 = new Region(region0);
        region2.op(region1, Region.Op.UNION);
        return region2;
    }

    @l
    public static final Region m(@l Region region0) {
        Region region1 = new Region(region0.getBounds());
        region1.op(region0, Region.Op.DIFFERENCE);
        return region1;
    }

    @l
    public static final Region n(@l Region region0, @l Rect rect0) {
        Region region1 = new Region(region0);
        region1.op(rect0, Region.Op.XOR);
        return region1;
    }

    @l
    public static final Region o(@l Region region0, @l Region region1) {
        Region region2 = new Region(region0);
        region2.op(region1, Region.Op.XOR);
        return region2;
    }
}

