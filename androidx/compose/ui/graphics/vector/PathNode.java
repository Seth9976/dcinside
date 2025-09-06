package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@Immutable
public abstract class PathNode {
    @Immutable
    public static final class ArcTo extends PathNode {
        private final float c;
        private final float d;
        private final float e;
        private final boolean f;
        private final boolean g;
        private final float h;
        private final float i;

        public ArcTo(float f, float f1, float f2, boolean z, boolean z1, float f3, float f4) {
            super(false, false, 3, null);
            this.c = f;
            this.d = f1;
            this.e = f2;
            this.f = z;
            this.g = z1;
            this.h = f3;
            this.i = f4;
        }

        public final float c() {
            return this.c;
        }

        public final float d() {
            return this.d;
        }

        public final float e() {
            return this.e;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof ArcTo)) {
                return false;
            }
            if(Float.compare(this.c, ((ArcTo)object0).c) != 0) {
                return false;
            }
            if(Float.compare(this.d, ((ArcTo)object0).d) != 0) {
                return false;
            }
            if(Float.compare(this.e, ((ArcTo)object0).e) != 0) {
                return false;
            }
            if(this.f != ((ArcTo)object0).f) {
                return false;
            }
            if(this.g != ((ArcTo)object0).g) {
                return false;
            }
            return Float.compare(this.h, ((ArcTo)object0).h) == 0 ? Float.compare(this.i, ((ArcTo)object0).i) == 0 : false;
        }

        public final boolean f() {
            return this.f;
        }

        public final boolean g() {
            return this.g;
        }

        public final float h() {
            return this.h;
        }

        @Override
        public int hashCode() {
            int v = Float.floatToIntBits(this.c);
            int v1 = Float.floatToIntBits(this.d);
            int v2 = Float.floatToIntBits(this.e);
            int v3 = this.f;
            int v4 = 1;
            if(v3) {
                v3 = 1;
            }
            if(!this.g) {
                v4 = false;
            }
            return (((((v * 0x1F + v1) * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + Float.floatToIntBits(this.h)) * 0x1F + Float.floatToIntBits(this.i);
        }

        public final float i() {
            return this.i;
        }

        @l
        public final ArcTo j(float f, float f1, float f2, boolean z, boolean z1, float f3, float f4) {
            return new ArcTo(f, f1, f2, z, z1, f3, f4);
        }

        public static ArcTo k(ArcTo pathNode$ArcTo0, float f, float f1, float f2, boolean z, boolean z1, float f3, float f4, int v, Object object0) {
            if((v & 1) != 0) {
                f = pathNode$ArcTo0.c;
            }
            if((v & 2) != 0) {
                f1 = pathNode$ArcTo0.d;
            }
            if((v & 4) != 0) {
                f2 = pathNode$ArcTo0.e;
            }
            if((v & 8) != 0) {
                z = pathNode$ArcTo0.f;
            }
            if((v & 16) != 0) {
                z1 = pathNode$ArcTo0.g;
            }
            if((v & 0x20) != 0) {
                f3 = pathNode$ArcTo0.h;
            }
            if((v & 0x40) != 0) {
                f4 = pathNode$ArcTo0.i;
            }
            return pathNode$ArcTo0.j(f, f1, f2, z, z1, f3, f4);
        }

        public final float l() {
            return this.h;
        }

        public final float m() {
            return this.i;
        }

        public final float n() {
            return this.c;
        }

        public final float o() {
            return this.e;
        }

        public final float p() {
            return this.d;
        }

        public final boolean q() {
            return this.f;
        }

        public final boolean r() {
            return this.g;
        }

        @Override
        @l
        public String toString() {
            return "ArcTo(horizontalEllipseRadius=" + this.c + ", verticalEllipseRadius=" + this.d + ", theta=" + this.e + ", isMoreThanHalf=" + this.f + ", isPositiveArc=" + this.g + ", arcStartX=" + this.h + ", arcStartY=" + this.i + ')';
        }
    }

    @Immutable
    public static final class Close extends PathNode {
        @l
        public static final Close c;

        static {
            Close.c = new Close();
        }

        private Close() {
            super(false, false, 3, null);
        }
    }

    @Immutable
    public static final class CurveTo extends PathNode {
        private final float c;
        private final float d;
        private final float e;
        private final float f;
        private final float g;
        private final float h;

        public CurveTo(float f, float f1, float f2, float f3, float f4, float f5) {
            super(true, false, 2, null);
            this.c = f;
            this.d = f1;
            this.e = f2;
            this.f = f3;
            this.g = f4;
            this.h = f5;
        }

        public final float c() {
            return this.c;
        }

        public final float d() {
            return this.d;
        }

        public final float e() {
            return this.e;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof CurveTo)) {
                return false;
            }
            if(Float.compare(this.c, ((CurveTo)object0).c) != 0) {
                return false;
            }
            if(Float.compare(this.d, ((CurveTo)object0).d) != 0) {
                return false;
            }
            if(Float.compare(this.e, ((CurveTo)object0).e) != 0) {
                return false;
            }
            if(Float.compare(this.f, ((CurveTo)object0).f) != 0) {
                return false;
            }
            return Float.compare(this.g, ((CurveTo)object0).g) == 0 ? Float.compare(this.h, ((CurveTo)object0).h) == 0 : false;
        }

        public final float f() {
            return this.f;
        }

        public final float g() {
            return this.g;
        }

        public final float h() {
            return this.h;
        }

        @Override
        public int hashCode() {
            return ((((Float.floatToIntBits(this.c) * 0x1F + Float.floatToIntBits(this.d)) * 0x1F + Float.floatToIntBits(this.e)) * 0x1F + Float.floatToIntBits(this.f)) * 0x1F + Float.floatToIntBits(this.g)) * 0x1F + Float.floatToIntBits(this.h);
        }

        @l
        public final CurveTo i(float f, float f1, float f2, float f3, float f4, float f5) {
            return new CurveTo(f, f1, f2, f3, f4, f5);
        }

        public static CurveTo j(CurveTo pathNode$CurveTo0, float f, float f1, float f2, float f3, float f4, float f5, int v, Object object0) {
            if((v & 1) != 0) {
                f = pathNode$CurveTo0.c;
            }
            if((v & 2) != 0) {
                f1 = pathNode$CurveTo0.d;
            }
            if((v & 4) != 0) {
                f2 = pathNode$CurveTo0.e;
            }
            if((v & 8) != 0) {
                f3 = pathNode$CurveTo0.f;
            }
            if((v & 16) != 0) {
                f4 = pathNode$CurveTo0.g;
            }
            if((v & 0x20) != 0) {
                f5 = pathNode$CurveTo0.h;
            }
            return pathNode$CurveTo0.i(f, f1, f2, f3, f4, f5);
        }

        public final float k() {
            return this.c;
        }

        public final float l() {
            return this.e;
        }

        public final float m() {
            return this.g;
        }

        public final float n() {
            return this.d;
        }

        public final float o() {
            return this.f;
        }

        public final float p() {
            return this.h;
        }

        @Override
        @l
        public String toString() {
            return "CurveTo(x1=" + this.c + ", y1=" + this.d + ", x2=" + this.e + ", y2=" + this.f + ", x3=" + this.g + ", y3=" + this.h + ')';
        }
    }

    @Immutable
    public static final class HorizontalTo extends PathNode {
        private final float c;

        public HorizontalTo(float f) {
            super(false, false, 3, null);
            this.c = f;
        }

        public final float c() {
            return this.c;
        }

        @l
        public final HorizontalTo d(float f) {
            return new HorizontalTo(f);
        }

        public static HorizontalTo e(HorizontalTo pathNode$HorizontalTo0, float f, int v, Object object0) {
            if((v & 1) != 0) {
                f = pathNode$HorizontalTo0.c;
            }
            return pathNode$HorizontalTo0.d(f);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof HorizontalTo ? Float.compare(this.c, ((HorizontalTo)object0).c) == 0 : false;
        }

        public final float f() {
            return this.c;
        }

        @Override
        public int hashCode() {
            return Float.floatToIntBits(this.c);
        }

        @Override
        @l
        public String toString() {
            return "HorizontalTo(x=" + this.c + ')';
        }
    }

    @Immutable
    public static final class LineTo extends PathNode {
        private final float c;
        private final float d;

        public LineTo(float f, float f1) {
            super(false, false, 3, null);
            this.c = f;
            this.d = f1;
        }

        public final float c() {
            return this.c;
        }

        public final float d() {
            return this.d;
        }

        @l
        public final LineTo e(float f, float f1) {
            return new LineTo(f, f1);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof LineTo)) {
                return false;
            }
            return Float.compare(this.c, ((LineTo)object0).c) == 0 ? Float.compare(this.d, ((LineTo)object0).d) == 0 : false;
        }

        public static LineTo f(LineTo pathNode$LineTo0, float f, float f1, int v, Object object0) {
            if((v & 1) != 0) {
                f = pathNode$LineTo0.c;
            }
            if((v & 2) != 0) {
                f1 = pathNode$LineTo0.d;
            }
            return pathNode$LineTo0.e(f, f1);
        }

        public final float g() {
            return this.c;
        }

        public final float h() {
            return this.d;
        }

        @Override
        public int hashCode() {
            return Float.floatToIntBits(this.c) * 0x1F + Float.floatToIntBits(this.d);
        }

        @Override
        @l
        public String toString() {
            return "LineTo(x=" + this.c + ", y=" + this.d + ')';
        }
    }

    @Immutable
    public static final class MoveTo extends PathNode {
        private final float c;
        private final float d;

        public MoveTo(float f, float f1) {
            super(false, false, 3, null);
            this.c = f;
            this.d = f1;
        }

        public final float c() {
            return this.c;
        }

        public final float d() {
            return this.d;
        }

        @l
        public final MoveTo e(float f, float f1) {
            return new MoveTo(f, f1);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof MoveTo)) {
                return false;
            }
            return Float.compare(this.c, ((MoveTo)object0).c) == 0 ? Float.compare(this.d, ((MoveTo)object0).d) == 0 : false;
        }

        public static MoveTo f(MoveTo pathNode$MoveTo0, float f, float f1, int v, Object object0) {
            if((v & 1) != 0) {
                f = pathNode$MoveTo0.c;
            }
            if((v & 2) != 0) {
                f1 = pathNode$MoveTo0.d;
            }
            return pathNode$MoveTo0.e(f, f1);
        }

        public final float g() {
            return this.c;
        }

        public final float h() {
            return this.d;
        }

        @Override
        public int hashCode() {
            return Float.floatToIntBits(this.c) * 0x1F + Float.floatToIntBits(this.d);
        }

        @Override
        @l
        public String toString() {
            return "MoveTo(x=" + this.c + ", y=" + this.d + ')';
        }
    }

    @Immutable
    public static final class QuadTo extends PathNode {
        private final float c;
        private final float d;
        private final float e;
        private final float f;

        public QuadTo(float f, float f1, float f2, float f3) {
            super(false, true, 1, null);
            this.c = f;
            this.d = f1;
            this.e = f2;
            this.f = f3;
        }

        public final float c() {
            return this.c;
        }

        public final float d() {
            return this.d;
        }

        public final float e() {
            return this.e;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof QuadTo)) {
                return false;
            }
            if(Float.compare(this.c, ((QuadTo)object0).c) != 0) {
                return false;
            }
            if(Float.compare(this.d, ((QuadTo)object0).d) != 0) {
                return false;
            }
            return Float.compare(this.e, ((QuadTo)object0).e) == 0 ? Float.compare(this.f, ((QuadTo)object0).f) == 0 : false;
        }

        public final float f() {
            return this.f;
        }

        @l
        public final QuadTo g(float f, float f1, float f2, float f3) {
            return new QuadTo(f, f1, f2, f3);
        }

        public static QuadTo h(QuadTo pathNode$QuadTo0, float f, float f1, float f2, float f3, int v, Object object0) {
            if((v & 1) != 0) {
                f = pathNode$QuadTo0.c;
            }
            if((v & 2) != 0) {
                f1 = pathNode$QuadTo0.d;
            }
            if((v & 4) != 0) {
                f2 = pathNode$QuadTo0.e;
            }
            if((v & 8) != 0) {
                f3 = pathNode$QuadTo0.f;
            }
            return pathNode$QuadTo0.g(f, f1, f2, f3);
        }

        @Override
        public int hashCode() {
            return ((Float.floatToIntBits(this.c) * 0x1F + Float.floatToIntBits(this.d)) * 0x1F + Float.floatToIntBits(this.e)) * 0x1F + Float.floatToIntBits(this.f);
        }

        public final float i() {
            return this.c;
        }

        public final float j() {
            return this.e;
        }

        public final float k() {
            return this.d;
        }

        public final float l() {
            return this.f;
        }

        @Override
        @l
        public String toString() {
            return "QuadTo(x1=" + this.c + ", y1=" + this.d + ", x2=" + this.e + ", y2=" + this.f + ')';
        }
    }

    @Immutable
    public static final class ReflectiveCurveTo extends PathNode {
        private final float c;
        private final float d;
        private final float e;
        private final float f;

        public ReflectiveCurveTo(float f, float f1, float f2, float f3) {
            super(true, false, 2, null);
            this.c = f;
            this.d = f1;
            this.e = f2;
            this.f = f3;
        }

        public final float c() {
            return this.c;
        }

        public final float d() {
            return this.d;
        }

        public final float e() {
            return this.e;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof ReflectiveCurveTo)) {
                return false;
            }
            if(Float.compare(this.c, ((ReflectiveCurveTo)object0).c) != 0) {
                return false;
            }
            if(Float.compare(this.d, ((ReflectiveCurveTo)object0).d) != 0) {
                return false;
            }
            return Float.compare(this.e, ((ReflectiveCurveTo)object0).e) == 0 ? Float.compare(this.f, ((ReflectiveCurveTo)object0).f) == 0 : false;
        }

        public final float f() {
            return this.f;
        }

        @l
        public final ReflectiveCurveTo g(float f, float f1, float f2, float f3) {
            return new ReflectiveCurveTo(f, f1, f2, f3);
        }

        public static ReflectiveCurveTo h(ReflectiveCurveTo pathNode$ReflectiveCurveTo0, float f, float f1, float f2, float f3, int v, Object object0) {
            if((v & 1) != 0) {
                f = pathNode$ReflectiveCurveTo0.c;
            }
            if((v & 2) != 0) {
                f1 = pathNode$ReflectiveCurveTo0.d;
            }
            if((v & 4) != 0) {
                f2 = pathNode$ReflectiveCurveTo0.e;
            }
            if((v & 8) != 0) {
                f3 = pathNode$ReflectiveCurveTo0.f;
            }
            return pathNode$ReflectiveCurveTo0.g(f, f1, f2, f3);
        }

        @Override
        public int hashCode() {
            return ((Float.floatToIntBits(this.c) * 0x1F + Float.floatToIntBits(this.d)) * 0x1F + Float.floatToIntBits(this.e)) * 0x1F + Float.floatToIntBits(this.f);
        }

        public final float i() {
            return this.c;
        }

        public final float j() {
            return this.e;
        }

        public final float k() {
            return this.d;
        }

        public final float l() {
            return this.f;
        }

        @Override
        @l
        public String toString() {
            return "ReflectiveCurveTo(x1=" + this.c + ", y1=" + this.d + ", x2=" + this.e + ", y2=" + this.f + ')';
        }
    }

    @Immutable
    public static final class ReflectiveQuadTo extends PathNode {
        private final float c;
        private final float d;

        public ReflectiveQuadTo(float f, float f1) {
            super(false, true, 1, null);
            this.c = f;
            this.d = f1;
        }

        public final float c() {
            return this.c;
        }

        public final float d() {
            return this.d;
        }

        @l
        public final ReflectiveQuadTo e(float f, float f1) {
            return new ReflectiveQuadTo(f, f1);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof ReflectiveQuadTo)) {
                return false;
            }
            return Float.compare(this.c, ((ReflectiveQuadTo)object0).c) == 0 ? Float.compare(this.d, ((ReflectiveQuadTo)object0).d) == 0 : false;
        }

        public static ReflectiveQuadTo f(ReflectiveQuadTo pathNode$ReflectiveQuadTo0, float f, float f1, int v, Object object0) {
            if((v & 1) != 0) {
                f = pathNode$ReflectiveQuadTo0.c;
            }
            if((v & 2) != 0) {
                f1 = pathNode$ReflectiveQuadTo0.d;
            }
            return pathNode$ReflectiveQuadTo0.e(f, f1);
        }

        public final float g() {
            return this.c;
        }

        public final float h() {
            return this.d;
        }

        @Override
        public int hashCode() {
            return Float.floatToIntBits(this.c) * 0x1F + Float.floatToIntBits(this.d);
        }

        @Override
        @l
        public String toString() {
            return "ReflectiveQuadTo(x=" + this.c + ", y=" + this.d + ')';
        }
    }

    @Immutable
    public static final class RelativeArcTo extends PathNode {
        private final float c;
        private final float d;
        private final float e;
        private final boolean f;
        private final boolean g;
        private final float h;
        private final float i;

        public RelativeArcTo(float f, float f1, float f2, boolean z, boolean z1, float f3, float f4) {
            super(false, false, 3, null);
            this.c = f;
            this.d = f1;
            this.e = f2;
            this.f = z;
            this.g = z1;
            this.h = f3;
            this.i = f4;
        }

        public final float c() {
            return this.c;
        }

        public final float d() {
            return this.d;
        }

        public final float e() {
            return this.e;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof RelativeArcTo)) {
                return false;
            }
            if(Float.compare(this.c, ((RelativeArcTo)object0).c) != 0) {
                return false;
            }
            if(Float.compare(this.d, ((RelativeArcTo)object0).d) != 0) {
                return false;
            }
            if(Float.compare(this.e, ((RelativeArcTo)object0).e) != 0) {
                return false;
            }
            if(this.f != ((RelativeArcTo)object0).f) {
                return false;
            }
            if(this.g != ((RelativeArcTo)object0).g) {
                return false;
            }
            return Float.compare(this.h, ((RelativeArcTo)object0).h) == 0 ? Float.compare(this.i, ((RelativeArcTo)object0).i) == 0 : false;
        }

        public final boolean f() {
            return this.f;
        }

        public final boolean g() {
            return this.g;
        }

        public final float h() {
            return this.h;
        }

        @Override
        public int hashCode() {
            int v = Float.floatToIntBits(this.c);
            int v1 = Float.floatToIntBits(this.d);
            int v2 = Float.floatToIntBits(this.e);
            int v3 = this.f;
            int v4 = 1;
            if(v3) {
                v3 = 1;
            }
            if(!this.g) {
                v4 = false;
            }
            return (((((v * 0x1F + v1) * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + Float.floatToIntBits(this.h)) * 0x1F + Float.floatToIntBits(this.i);
        }

        public final float i() {
            return this.i;
        }

        @l
        public final RelativeArcTo j(float f, float f1, float f2, boolean z, boolean z1, float f3, float f4) {
            return new RelativeArcTo(f, f1, f2, z, z1, f3, f4);
        }

        public static RelativeArcTo k(RelativeArcTo pathNode$RelativeArcTo0, float f, float f1, float f2, boolean z, boolean z1, float f3, float f4, int v, Object object0) {
            if((v & 1) != 0) {
                f = pathNode$RelativeArcTo0.c;
            }
            if((v & 2) != 0) {
                f1 = pathNode$RelativeArcTo0.d;
            }
            if((v & 4) != 0) {
                f2 = pathNode$RelativeArcTo0.e;
            }
            if((v & 8) != 0) {
                z = pathNode$RelativeArcTo0.f;
            }
            if((v & 16) != 0) {
                z1 = pathNode$RelativeArcTo0.g;
            }
            if((v & 0x20) != 0) {
                f3 = pathNode$RelativeArcTo0.h;
            }
            if((v & 0x40) != 0) {
                f4 = pathNode$RelativeArcTo0.i;
            }
            return pathNode$RelativeArcTo0.j(f, f1, f2, z, z1, f3, f4);
        }

        public final float l() {
            return this.h;
        }

        public final float m() {
            return this.i;
        }

        public final float n() {
            return this.c;
        }

        public final float o() {
            return this.e;
        }

        public final float p() {
            return this.d;
        }

        public final boolean q() {
            return this.f;
        }

        public final boolean r() {
            return this.g;
        }

        @Override
        @l
        public String toString() {
            return "RelativeArcTo(horizontalEllipseRadius=" + this.c + ", verticalEllipseRadius=" + this.d + ", theta=" + this.e + ", isMoreThanHalf=" + this.f + ", isPositiveArc=" + this.g + ", arcStartDx=" + this.h + ", arcStartDy=" + this.i + ')';
        }
    }

    @Immutable
    public static final class RelativeCurveTo extends PathNode {
        private final float c;
        private final float d;
        private final float e;
        private final float f;
        private final float g;
        private final float h;

        public RelativeCurveTo(float f, float f1, float f2, float f3, float f4, float f5) {
            super(true, false, 2, null);
            this.c = f;
            this.d = f1;
            this.e = f2;
            this.f = f3;
            this.g = f4;
            this.h = f5;
        }

        public final float c() {
            return this.c;
        }

        public final float d() {
            return this.d;
        }

        public final float e() {
            return this.e;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof RelativeCurveTo)) {
                return false;
            }
            if(Float.compare(this.c, ((RelativeCurveTo)object0).c) != 0) {
                return false;
            }
            if(Float.compare(this.d, ((RelativeCurveTo)object0).d) != 0) {
                return false;
            }
            if(Float.compare(this.e, ((RelativeCurveTo)object0).e) != 0) {
                return false;
            }
            if(Float.compare(this.f, ((RelativeCurveTo)object0).f) != 0) {
                return false;
            }
            return Float.compare(this.g, ((RelativeCurveTo)object0).g) == 0 ? Float.compare(this.h, ((RelativeCurveTo)object0).h) == 0 : false;
        }

        public final float f() {
            return this.f;
        }

        public final float g() {
            return this.g;
        }

        public final float h() {
            return this.h;
        }

        @Override
        public int hashCode() {
            return ((((Float.floatToIntBits(this.c) * 0x1F + Float.floatToIntBits(this.d)) * 0x1F + Float.floatToIntBits(this.e)) * 0x1F + Float.floatToIntBits(this.f)) * 0x1F + Float.floatToIntBits(this.g)) * 0x1F + Float.floatToIntBits(this.h);
        }

        @l
        public final RelativeCurveTo i(float f, float f1, float f2, float f3, float f4, float f5) {
            return new RelativeCurveTo(f, f1, f2, f3, f4, f5);
        }

        public static RelativeCurveTo j(RelativeCurveTo pathNode$RelativeCurveTo0, float f, float f1, float f2, float f3, float f4, float f5, int v, Object object0) {
            if((v & 1) != 0) {
                f = pathNode$RelativeCurveTo0.c;
            }
            if((v & 2) != 0) {
                f1 = pathNode$RelativeCurveTo0.d;
            }
            if((v & 4) != 0) {
                f2 = pathNode$RelativeCurveTo0.e;
            }
            if((v & 8) != 0) {
                f3 = pathNode$RelativeCurveTo0.f;
            }
            if((v & 16) != 0) {
                f4 = pathNode$RelativeCurveTo0.g;
            }
            if((v & 0x20) != 0) {
                f5 = pathNode$RelativeCurveTo0.h;
            }
            return pathNode$RelativeCurveTo0.i(f, f1, f2, f3, f4, f5);
        }

        public final float k() {
            return this.c;
        }

        public final float l() {
            return this.e;
        }

        public final float m() {
            return this.g;
        }

        public final float n() {
            return this.d;
        }

        public final float o() {
            return this.f;
        }

        public final float p() {
            return this.h;
        }

        @Override
        @l
        public String toString() {
            return "RelativeCurveTo(dx1=" + this.c + ", dy1=" + this.d + ", dx2=" + this.e + ", dy2=" + this.f + ", dx3=" + this.g + ", dy3=" + this.h + ')';
        }
    }

    @Immutable
    public static final class RelativeHorizontalTo extends PathNode {
        private final float c;

        public RelativeHorizontalTo(float f) {
            super(false, false, 3, null);
            this.c = f;
        }

        public final float c() {
            return this.c;
        }

        @l
        public final RelativeHorizontalTo d(float f) {
            return new RelativeHorizontalTo(f);
        }

        public static RelativeHorizontalTo e(RelativeHorizontalTo pathNode$RelativeHorizontalTo0, float f, int v, Object object0) {
            if((v & 1) != 0) {
                f = pathNode$RelativeHorizontalTo0.c;
            }
            return pathNode$RelativeHorizontalTo0.d(f);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof RelativeHorizontalTo ? Float.compare(this.c, ((RelativeHorizontalTo)object0).c) == 0 : false;
        }

        public final float f() {
            return this.c;
        }

        @Override
        public int hashCode() {
            return Float.floatToIntBits(this.c);
        }

        @Override
        @l
        public String toString() {
            return "RelativeHorizontalTo(dx=" + this.c + ')';
        }
    }

    @Immutable
    public static final class RelativeLineTo extends PathNode {
        private final float c;
        private final float d;

        public RelativeLineTo(float f, float f1) {
            super(false, false, 3, null);
            this.c = f;
            this.d = f1;
        }

        public final float c() {
            return this.c;
        }

        public final float d() {
            return this.d;
        }

        @l
        public final RelativeLineTo e(float f, float f1) {
            return new RelativeLineTo(f, f1);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof RelativeLineTo)) {
                return false;
            }
            return Float.compare(this.c, ((RelativeLineTo)object0).c) == 0 ? Float.compare(this.d, ((RelativeLineTo)object0).d) == 0 : false;
        }

        public static RelativeLineTo f(RelativeLineTo pathNode$RelativeLineTo0, float f, float f1, int v, Object object0) {
            if((v & 1) != 0) {
                f = pathNode$RelativeLineTo0.c;
            }
            if((v & 2) != 0) {
                f1 = pathNode$RelativeLineTo0.d;
            }
            return pathNode$RelativeLineTo0.e(f, f1);
        }

        public final float g() {
            return this.c;
        }

        public final float h() {
            return this.d;
        }

        @Override
        public int hashCode() {
            return Float.floatToIntBits(this.c) * 0x1F + Float.floatToIntBits(this.d);
        }

        @Override
        @l
        public String toString() {
            return "RelativeLineTo(dx=" + this.c + ", dy=" + this.d + ')';
        }
    }

    @Immutable
    public static final class RelativeMoveTo extends PathNode {
        private final float c;
        private final float d;

        public RelativeMoveTo(float f, float f1) {
            super(false, false, 3, null);
            this.c = f;
            this.d = f1;
        }

        public final float c() {
            return this.c;
        }

        public final float d() {
            return this.d;
        }

        @l
        public final RelativeMoveTo e(float f, float f1) {
            return new RelativeMoveTo(f, f1);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof RelativeMoveTo)) {
                return false;
            }
            return Float.compare(this.c, ((RelativeMoveTo)object0).c) == 0 ? Float.compare(this.d, ((RelativeMoveTo)object0).d) == 0 : false;
        }

        public static RelativeMoveTo f(RelativeMoveTo pathNode$RelativeMoveTo0, float f, float f1, int v, Object object0) {
            if((v & 1) != 0) {
                f = pathNode$RelativeMoveTo0.c;
            }
            if((v & 2) != 0) {
                f1 = pathNode$RelativeMoveTo0.d;
            }
            return pathNode$RelativeMoveTo0.e(f, f1);
        }

        public final float g() {
            return this.c;
        }

        public final float h() {
            return this.d;
        }

        @Override
        public int hashCode() {
            return Float.floatToIntBits(this.c) * 0x1F + Float.floatToIntBits(this.d);
        }

        @Override
        @l
        public String toString() {
            return "RelativeMoveTo(dx=" + this.c + ", dy=" + this.d + ')';
        }
    }

    @Immutable
    public static final class RelativeQuadTo extends PathNode {
        private final float c;
        private final float d;
        private final float e;
        private final float f;

        public RelativeQuadTo(float f, float f1, float f2, float f3) {
            super(false, true, 1, null);
            this.c = f;
            this.d = f1;
            this.e = f2;
            this.f = f3;
        }

        public final float c() {
            return this.c;
        }

        public final float d() {
            return this.d;
        }

        public final float e() {
            return this.e;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof RelativeQuadTo)) {
                return false;
            }
            if(Float.compare(this.c, ((RelativeQuadTo)object0).c) != 0) {
                return false;
            }
            if(Float.compare(this.d, ((RelativeQuadTo)object0).d) != 0) {
                return false;
            }
            return Float.compare(this.e, ((RelativeQuadTo)object0).e) == 0 ? Float.compare(this.f, ((RelativeQuadTo)object0).f) == 0 : false;
        }

        public final float f() {
            return this.f;
        }

        @l
        public final RelativeQuadTo g(float f, float f1, float f2, float f3) {
            return new RelativeQuadTo(f, f1, f2, f3);
        }

        public static RelativeQuadTo h(RelativeQuadTo pathNode$RelativeQuadTo0, float f, float f1, float f2, float f3, int v, Object object0) {
            if((v & 1) != 0) {
                f = pathNode$RelativeQuadTo0.c;
            }
            if((v & 2) != 0) {
                f1 = pathNode$RelativeQuadTo0.d;
            }
            if((v & 4) != 0) {
                f2 = pathNode$RelativeQuadTo0.e;
            }
            if((v & 8) != 0) {
                f3 = pathNode$RelativeQuadTo0.f;
            }
            return pathNode$RelativeQuadTo0.g(f, f1, f2, f3);
        }

        @Override
        public int hashCode() {
            return ((Float.floatToIntBits(this.c) * 0x1F + Float.floatToIntBits(this.d)) * 0x1F + Float.floatToIntBits(this.e)) * 0x1F + Float.floatToIntBits(this.f);
        }

        public final float i() {
            return this.c;
        }

        public final float j() {
            return this.e;
        }

        public final float k() {
            return this.d;
        }

        public final float l() {
            return this.f;
        }

        @Override
        @l
        public String toString() {
            return "RelativeQuadTo(dx1=" + this.c + ", dy1=" + this.d + ", dx2=" + this.e + ", dy2=" + this.f + ')';
        }
    }

    @Immutable
    public static final class RelativeReflectiveCurveTo extends PathNode {
        private final float c;
        private final float d;
        private final float e;
        private final float f;

        public RelativeReflectiveCurveTo(float f, float f1, float f2, float f3) {
            super(true, false, 2, null);
            this.c = f;
            this.d = f1;
            this.e = f2;
            this.f = f3;
        }

        public final float c() {
            return this.c;
        }

        public final float d() {
            return this.d;
        }

        public final float e() {
            return this.e;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof RelativeReflectiveCurveTo)) {
                return false;
            }
            if(Float.compare(this.c, ((RelativeReflectiveCurveTo)object0).c) != 0) {
                return false;
            }
            if(Float.compare(this.d, ((RelativeReflectiveCurveTo)object0).d) != 0) {
                return false;
            }
            return Float.compare(this.e, ((RelativeReflectiveCurveTo)object0).e) == 0 ? Float.compare(this.f, ((RelativeReflectiveCurveTo)object0).f) == 0 : false;
        }

        public final float f() {
            return this.f;
        }

        @l
        public final RelativeReflectiveCurveTo g(float f, float f1, float f2, float f3) {
            return new RelativeReflectiveCurveTo(f, f1, f2, f3);
        }

        public static RelativeReflectiveCurveTo h(RelativeReflectiveCurveTo pathNode$RelativeReflectiveCurveTo0, float f, float f1, float f2, float f3, int v, Object object0) {
            if((v & 1) != 0) {
                f = pathNode$RelativeReflectiveCurveTo0.c;
            }
            if((v & 2) != 0) {
                f1 = pathNode$RelativeReflectiveCurveTo0.d;
            }
            if((v & 4) != 0) {
                f2 = pathNode$RelativeReflectiveCurveTo0.e;
            }
            if((v & 8) != 0) {
                f3 = pathNode$RelativeReflectiveCurveTo0.f;
            }
            return pathNode$RelativeReflectiveCurveTo0.g(f, f1, f2, f3);
        }

        @Override
        public int hashCode() {
            return ((Float.floatToIntBits(this.c) * 0x1F + Float.floatToIntBits(this.d)) * 0x1F + Float.floatToIntBits(this.e)) * 0x1F + Float.floatToIntBits(this.f);
        }

        public final float i() {
            return this.c;
        }

        public final float j() {
            return this.e;
        }

        public final float k() {
            return this.d;
        }

        public final float l() {
            return this.f;
        }

        @Override
        @l
        public String toString() {
            return "RelativeReflectiveCurveTo(dx1=" + this.c + ", dy1=" + this.d + ", dx2=" + this.e + ", dy2=" + this.f + ')';
        }
    }

    @Immutable
    public static final class RelativeReflectiveQuadTo extends PathNode {
        private final float c;
        private final float d;

        public RelativeReflectiveQuadTo(float f, float f1) {
            super(false, true, 1, null);
            this.c = f;
            this.d = f1;
        }

        public final float c() {
            return this.c;
        }

        public final float d() {
            return this.d;
        }

        @l
        public final RelativeReflectiveQuadTo e(float f, float f1) {
            return new RelativeReflectiveQuadTo(f, f1);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof RelativeReflectiveQuadTo)) {
                return false;
            }
            return Float.compare(this.c, ((RelativeReflectiveQuadTo)object0).c) == 0 ? Float.compare(this.d, ((RelativeReflectiveQuadTo)object0).d) == 0 : false;
        }

        public static RelativeReflectiveQuadTo f(RelativeReflectiveQuadTo pathNode$RelativeReflectiveQuadTo0, float f, float f1, int v, Object object0) {
            if((v & 1) != 0) {
                f = pathNode$RelativeReflectiveQuadTo0.c;
            }
            if((v & 2) != 0) {
                f1 = pathNode$RelativeReflectiveQuadTo0.d;
            }
            return pathNode$RelativeReflectiveQuadTo0.e(f, f1);
        }

        public final float g() {
            return this.c;
        }

        public final float h() {
            return this.d;
        }

        @Override
        public int hashCode() {
            return Float.floatToIntBits(this.c) * 0x1F + Float.floatToIntBits(this.d);
        }

        @Override
        @l
        public String toString() {
            return "RelativeReflectiveQuadTo(dx=" + this.c + ", dy=" + this.d + ')';
        }
    }

    @Immutable
    public static final class RelativeVerticalTo extends PathNode {
        private final float c;

        public RelativeVerticalTo(float f) {
            super(false, false, 3, null);
            this.c = f;
        }

        public final float c() {
            return this.c;
        }

        @l
        public final RelativeVerticalTo d(float f) {
            return new RelativeVerticalTo(f);
        }

        public static RelativeVerticalTo e(RelativeVerticalTo pathNode$RelativeVerticalTo0, float f, int v, Object object0) {
            if((v & 1) != 0) {
                f = pathNode$RelativeVerticalTo0.c;
            }
            return pathNode$RelativeVerticalTo0.d(f);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof RelativeVerticalTo ? Float.compare(this.c, ((RelativeVerticalTo)object0).c) == 0 : false;
        }

        public final float f() {
            return this.c;
        }

        @Override
        public int hashCode() {
            return Float.floatToIntBits(this.c);
        }

        @Override
        @l
        public String toString() {
            return "RelativeVerticalTo(dy=" + this.c + ')';
        }
    }

    @Immutable
    public static final class VerticalTo extends PathNode {
        private final float c;

        public VerticalTo(float f) {
            super(false, false, 3, null);
            this.c = f;
        }

        public final float c() {
            return this.c;
        }

        @l
        public final VerticalTo d(float f) {
            return new VerticalTo(f);
        }

        public static VerticalTo e(VerticalTo pathNode$VerticalTo0, float f, int v, Object object0) {
            if((v & 1) != 0) {
                f = pathNode$VerticalTo0.c;
            }
            return pathNode$VerticalTo0.d(f);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof VerticalTo ? Float.compare(this.c, ((VerticalTo)object0).c) == 0 : false;
        }

        public final float f() {
            return this.c;
        }

        @Override
        public int hashCode() {
            return Float.floatToIntBits(this.c);
        }

        @Override
        @l
        public String toString() {
            return "VerticalTo(y=" + this.c + ')';
        }
    }

    private final boolean a;
    private final boolean b;

    private PathNode(boolean z, boolean z1) {
        this.a = z;
        this.b = z1;
    }

    public PathNode(boolean z, boolean z1, int v, w w0) {
        if((v & 1) != 0) {
            z = false;
        }
        if((v & 2) != 0) {
            z1 = false;
        }
        this(z, z1, null);
    }

    public PathNode(boolean z, boolean z1, w w0) {
        this(z, z1);
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }
}

