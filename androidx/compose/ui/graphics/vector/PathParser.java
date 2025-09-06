package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nPathParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParser\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,645:1\n107#2:646\n79#2,22:647\n33#3,6:669\n*S KotlinDebug\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParser\n*L\n81#1:646\n81#1:647,22\n112#1:669,6\n*E\n"})
public final class PathParser {
    static final class ExtractFloatResult {
        private int a;
        private boolean b;

        public ExtractFloatResult() {
            this(0, false, 3, null);
        }

        public ExtractFloatResult(int v, boolean z) {
            this.a = v;
            this.b = z;
        }

        public ExtractFloatResult(int v, boolean z, int v1, w w0) {
            if((v1 & 1) != 0) {
                v = 0;
            }
            if((v1 & 2) != 0) {
                z = false;
            }
            this(v, z);
        }

        public final int a() {
            return this.a;
        }

        public final boolean b() {
            return this.b;
        }

        @l
        public final ExtractFloatResult c(int v, boolean z) {
            return new ExtractFloatResult(v, z);
        }

        public static ExtractFloatResult d(ExtractFloatResult pathParser$ExtractFloatResult0, int v, boolean z, int v1, Object object0) {
            if((v1 & 1) != 0) {
                v = pathParser$ExtractFloatResult0.a;
            }
            if((v1 & 2) != 0) {
                z = pathParser$ExtractFloatResult0.b;
            }
            return pathParser$ExtractFloatResult0.c(v, z);
        }

        public final int e() {
            return this.a;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof ExtractFloatResult)) {
                return false;
            }
            return this.a == ((ExtractFloatResult)object0).a ? this.b == ((ExtractFloatResult)object0).b : false;
        }

        public final boolean f() {
            return this.b;
        }

        public final void g(int v) {
            this.a = v;
        }

        public final void h(boolean z) {
            this.b = z;
        }

        @Override
        public int hashCode() {
            int v = this.a * 0x1F;
            int v1 = this.b;
            if(v1) {
                v1 = 1;
            }
            return v + v1;
        }

        @Override
        @l
        public String toString() {
            return "ExtractFloatResult(endPosition=" + this.a + ", endWithNegativeOrDot=" + this.b + ')';
        }
    }

    static final class PathPoint {
        private float a;
        private float b;

        public PathPoint() {
            this(0.0f, 0.0f, 3, null);
        }

        public PathPoint(float f, float f1) {
            this.a = f;
            this.b = f1;
        }

        public PathPoint(float f, float f1, int v, w w0) {
            if((v & 1) != 0) {
                f = 0.0f;
            }
            if((v & 2) != 0) {
                f1 = 0.0f;
            }
            this(f, f1);
        }

        public final float a() {
            return this.a;
        }

        public final float b() {
            return this.b;
        }

        @l
        public final PathPoint c(float f, float f1) {
            return new PathPoint(f, f1);
        }

        public static PathPoint d(PathPoint pathParser$PathPoint0, float f, float f1, int v, Object object0) {
            if((v & 1) != 0) {
                f = pathParser$PathPoint0.a;
            }
            if((v & 2) != 0) {
                f1 = pathParser$PathPoint0.b;
            }
            return pathParser$PathPoint0.c(f, f1);
        }

        public final float e() {
            return this.a;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof PathPoint)) {
                return false;
            }
            return Float.compare(this.a, ((PathPoint)object0).a) == 0 ? Float.compare(this.b, ((PathPoint)object0).b) == 0 : false;
        }

        public final float f() {
            return this.b;
        }

        public final void g() {
            this.a = 0.0f;
            this.b = 0.0f;
        }

        public final void h(float f) {
            this.a = f;
        }

        @Override
        public int hashCode() {
            return Float.floatToIntBits(this.a) * 0x1F + Float.floatToIntBits(this.b);
        }

        public final void i(float f) {
            this.b = f;
        }

        @Override
        @l
        public String toString() {
            return "PathPoint(x=" + this.a + ", y=" + this.b + ')';
        }
    }

    @l
    private final List a;
    @l
    private final PathPoint b;
    @l
    private final PathPoint c;
    @l
    private final PathPoint d;
    @l
    private final PathPoint e;

    public PathParser() {
        this.a = new ArrayList();
        this.b = new PathPoint(0.0f, 0.0f, 3, null);
        this.c = new PathPoint(0.0f, 0.0f, 3, null);
        this.d = new PathPoint(0.0f, 0.0f, 3, null);
        this.e = new PathPoint(0.0f, 0.0f, 3, null);
    }

    private final void A(RelativeReflectiveQuadTo pathNode$RelativeReflectiveQuadTo0, boolean z, Path path0) {
        if(z) {
            this.e.h(this.b.e() - this.c.e());
            this.e.i(this.b.f() - this.c.f());
        }
        else {
            this.e.g();
        }
        path0.d(this.e.e(), this.e.f(), pathNode$RelativeReflectiveQuadTo0.g(), pathNode$RelativeReflectiveQuadTo0.h());
        this.c.h(this.b.e() + this.e.e());
        this.c.i(this.b.f() + this.e.f());
        this.b.h(this.b.e() + pathNode$RelativeReflectiveQuadTo0.g());
        this.b.i(this.b.f() + pathNode$RelativeReflectiveQuadTo0.h());
    }

    private final void B(RelativeVerticalTo pathNode$RelativeVerticalTo0, Path path0) {
        path0.u(0.0f, pathNode$RelativeVerticalTo0.f());
        this.b.i(this.b.f() + pathNode$RelativeVerticalTo0.f());
    }

    @l
    public final List C() {
        return this.a;
    }

    @l
    public final Path D(@l Path path0) {
        L.p(path0, "target");
        path0.reset();
        this.b.g();
        this.c.g();
        this.d.g();
        this.e.g();
        List list0 = this.a;
        int v = list0.size();
        int v1 = 0;
        for(PathNode pathNode0 = null; v1 < v; pathNode0 = pathNode1) {
            PathNode pathNode1 = (PathNode)list0.get(v1);
            if(pathNode0 == null) {
                pathNode0 = pathNode1;
            }
            if(pathNode1 instanceof Close) {
                this.f(path0);
            }
            else if(pathNode1 instanceof RelativeMoveTo) {
                this.x(((RelativeMoveTo)pathNode1), path0);
            }
            else if(pathNode1 instanceof MoveTo) {
                this.n(((MoveTo)pathNode1), path0);
            }
            else if(pathNode1 instanceof RelativeLineTo) {
                this.w(((RelativeLineTo)pathNode1), path0);
            }
            else if(pathNode1 instanceof LineTo) {
                this.m(((LineTo)pathNode1), path0);
            }
            else if(pathNode1 instanceof RelativeHorizontalTo) {
                this.v(((RelativeHorizontalTo)pathNode1), path0);
            }
            else if(pathNode1 instanceof HorizontalTo) {
                this.l(((HorizontalTo)pathNode1), path0);
            }
            else if(pathNode1 instanceof RelativeVerticalTo) {
                this.B(((RelativeVerticalTo)pathNode1), path0);
            }
            else if(pathNode1 instanceof VerticalTo) {
                this.H(((VerticalTo)pathNode1), path0);
            }
            else if(pathNode1 instanceof RelativeCurveTo) {
                this.u(((RelativeCurveTo)pathNode1), path0);
            }
            else if(pathNode1 instanceof CurveTo) {
                this.h(((CurveTo)pathNode1), path0);
            }
            else if(pathNode1 instanceof RelativeReflectiveCurveTo) {
                L.m(pathNode0);
                this.z(((RelativeReflectiveCurveTo)pathNode1), pathNode0.a(), path0);
            }
            else if(pathNode1 instanceof ReflectiveCurveTo) {
                L.m(pathNode0);
                this.r(((ReflectiveCurveTo)pathNode1), pathNode0.a(), path0);
            }
            else if(pathNode1 instanceof RelativeQuadTo) {
                this.y(((RelativeQuadTo)pathNode1), path0);
            }
            else if(pathNode1 instanceof QuadTo) {
                this.q(((QuadTo)pathNode1), path0);
            }
            else if(pathNode1 instanceof RelativeReflectiveQuadTo) {
                L.m(pathNode0);
                this.A(((RelativeReflectiveQuadTo)pathNode1), pathNode0.b(), path0);
            }
            else if(pathNode1 instanceof ReflectiveQuadTo) {
                L.m(pathNode0);
                this.s(((ReflectiveQuadTo)pathNode1), pathNode0.b(), path0);
            }
            else if(pathNode1 instanceof RelativeArcTo) {
                this.t(((RelativeArcTo)pathNode1), path0);
            }
            else if(pathNode1 instanceof ArcTo) {
                this.c(((ArcTo)pathNode1), path0);
            }
            ++v1;
        }
        return path0;
    }

    public static Path E(PathParser pathParser0, Path path0, int v, Object object0) {
        if((v & 1) != 0) {
            path0 = AndroidPath_androidKt.a();
        }
        return pathParser0.D(path0);
    }

    private final double F(double f) [...] // Inlined contents

    private final float G(float f) {
        return f / 180.0f * 3.141593f;
    }

    private final void H(VerticalTo pathNode$VerticalTo0, Path path0) {
        path0.m(this.b.e(), pathNode$VerticalTo0.f());
        this.b.i(pathNode$VerticalTo0.f());
    }

    private final void a(char c, float[] arr_f) {
        Collection collection0 = PathNodeKt.b(c, arr_f);
        this.a.addAll(collection0);
    }

    @l
    public final PathParser b(@l List list0) {
        L.p(list0, "nodes");
        this.a.addAll(list0);
        return this;
    }

    private final void c(ArcTo pathNode$ArcTo0, Path path0) {
        this.i(path0, ((double)this.b.e()), ((double)this.b.f()), ((double)pathNode$ArcTo0.l()), ((double)pathNode$ArcTo0.m()), ((double)pathNode$ArcTo0.n()), ((double)pathNode$ArcTo0.p()), ((double)pathNode$ArcTo0.o()), pathNode$ArcTo0.q(), pathNode$ArcTo0.r());
        this.b.h(pathNode$ArcTo0.l());
        this.b.i(pathNode$ArcTo0.m());
        this.c.h(this.b.e());
        this.c.i(this.b.f());
    }

    private final void d(Path path0, double f, double f1, double f2, double f3, double f4, double f5, double f6, double f7, double f8) {
        int v = (int)Math.ceil(Math.abs(f8 * 4.0 / 3.141593));
        double f9 = Math.cos(f6);
        double f10 = Math.sin(f6);
        double f11 = Math.cos(f7);
        double f12 = Math.sin(f7);
        double f13 = -f2 * f9;
        double f14 = f3 * f10;
        double f15 = -f2 * f10;
        double f16 = f3 * f9;
        double f17 = f4;
        double f18 = f7;
        double f19 = f12 * f15 + f11 * f16;
        double f20 = f13 * f12 - f14 * f11;
        int v1 = 0;
        for(double f21 = f5; v1 < v; f21 = f26) {
            double f22 = f18 + f8 / ((double)v);
            double f23 = Math.sin(f22);
            double f24 = Math.cos(f22);
            double f25 = f + f2 * f9 * f24 - f14 * f23;
            double f26 = f1 + f2 * f10 * f24 + f16 * f23;
            double f27 = f13 * f23 - f14 * f24;
            double f28 = f23 * f15 + f24 * f16;
            double f29 = f22 - f18;
            double f30 = Math.tan(f29 / 2.0);
            double f31 = Math.sin(f29) * (Math.sqrt(4.0 + 3.0 * f30 * f30) - 1.0) / 3.0;
            path0.s(((float)(f17 + f20 * f31)), ((float)(f21 + f19 * f31)), ((float)(f25 - f31 * f27)), ((float)(f26 - f31 * f28)), ((float)f25), ((float)f26));
            ++v1;
            f17 = f25;
            f18 = f22;
            f19 = f28;
            f20 = f27;
        }
    }

    public final void e() {
        this.a.clear();
    }

    private final void f(Path path0) {
        this.b.h(this.d.e());
        this.b.i(this.d.f());
        this.c.h(this.d.e());
        this.c.i(this.d.f());
        path0.close();
        path0.i(this.b.e(), this.b.f());
    }

    private final float[] g(float[] arr_f, int v, int v1) {
        if(v > v1) {
            throw new IllegalArgumentException();
        }
        if(v < 0 || v > arr_f.length) {
            throw new IndexOutOfBoundsException();
        }
        int v2 = v1 - v;
        float[] arr_f1 = new float[v2];
        kotlin.collections.l.y0(arr_f, arr_f1, 0, v, Math.min(v2, arr_f.length - v) + v);
        return arr_f1;
    }

    private final void h(CurveTo pathNode$CurveTo0, Path path0) {
        path0.s(pathNode$CurveTo0.k(), pathNode$CurveTo0.n(), pathNode$CurveTo0.l(), pathNode$CurveTo0.o(), pathNode$CurveTo0.m(), pathNode$CurveTo0.p());
        this.c.h(pathNode$CurveTo0.l());
        this.c.i(pathNode$CurveTo0.o());
        this.b.h(pathNode$CurveTo0.m());
        this.b.i(pathNode$CurveTo0.p());
    }

    private final void i(Path path0, double f, double f1, double f2, double f3, double f4, double f5, double f6, boolean z, boolean z1) {
        double f25;
        double f24;
        double f7 = f6 / 180.0 * 3.141593;
        double f8 = Math.cos(f7);
        double f9 = Math.sin(f7);
        double f10 = (f * f8 + f1 * f9) / f4;
        double f11 = (-f * f9 + f1 * f8) / f5;
        double f12 = (f2 * f8 + f3 * f9) / f4;
        double f13 = (-f2 * f9 + f3 * f8) / f5;
        double f14 = f10 - f12;
        double f15 = f11 - f13;
        double f16 = (f10 + f12) / 2.0;
        double f17 = (f11 + f13) / 2.0;
        double f18 = f14 * f14 + f15 * f15;
        if(f18 == 0.0) {
            return;
        }
        double f19 = 1.0 / f18 - 0.25;
        if(f19 < 0.0) {
            double f20 = (double)(((float)(Math.sqrt(f18) / 1.99999)));
            this.i(path0, f, f1, f2, f3, f4 * f20, f5 * f20, f6, z, z1);
            return;
        }
        double f21 = Math.sqrt(f19);
        double f22 = f14 * f21;
        double f23 = f21 * f15;
        if(z == z1) {
            f24 = f16 - f23;
            f25 = f17 + f22;
        }
        else {
            f24 = f16 + f23;
            f25 = f17 - f22;
        }
        double f26 = Math.atan2(f11 - f25, f10 - f24);
        double f27 = Math.atan2(f13 - f25, f12 - f24) - f26;
        int v = Double.compare(f27, 0.0);
        if(z1 != v >= 0) {
            f27 = v <= 0 ? f27 + 6.283185 : f27 - 6.283185;
        }
        this.d(path0, f24 * f4 * f8 - f25 * f5 * f9, f24 * f4 * f9 + f25 * f5 * f8, f4, f5, f, f1, f7, f26, f27);
    }

    private final void j(String s, int v, ExtractFloatResult pathParser$ExtractFloatResult0) {
        pathParser$ExtractFloatResult0.h(false);
        int v1 = v;
        boolean z = false;
        boolean z1 = false;
        boolean z2 = false;
        while(v1 < s.length()) {
            switch(s.charAt(v1)) {
                case 0x20: 
                case 44: {
                    z = false;
                    z2 = true;
                    break;
                }
                case 45: {
                    if(v1 == v || z) {
                        z = false;
                    }
                    else {
                        pathParser$ExtractFloatResult0.h(true);
                        z = false;
                        z2 = true;
                    }
                    break;
                }
                case 46: {
                    if(z1) {
                        pathParser$ExtractFloatResult0.h(true);
                        z = false;
                        z2 = true;
                    }
                    else {
                        z = false;
                        z1 = true;
                    }
                    break;
                }
                case 69: 
                case 101: {
                    z = true;
                    break;
                }
                default: {
                    z = false;
                }
            }
            if(z2) {
                break;
            }
            ++v1;
        }
        pathParser$ExtractFloatResult0.g(v1);
    }

    private final float[] k(String s) {
        switch(s.charAt(0)) {
            case 90: 
            case 0x7A: {
                return new float[0];
            }
            default: {
                float[] arr_f = new float[s.length()];
                ExtractFloatResult pathParser$ExtractFloatResult0 = new ExtractFloatResult(0, false, 3, null);
                int v = s.length();
                int v2 = 0;
                for(int v1 = 1; v1 < v; v1 = pathParser$ExtractFloatResult0.f() ? v3 : v3 + 1) {
                    this.j(s, v1, pathParser$ExtractFloatResult0);
                    int v3 = pathParser$ExtractFloatResult0.e();
                    if(v1 < v3) {
                        String s1 = s.substring(v1, v3);
                        L.o(s1, "this as java.lang.String…ing(startIndex, endIndex)");
                        arr_f[v2] = Float.parseFloat(s1);
                        ++v2;
                    }
                }
                return this.g(arr_f, 0, v2);
            }
        }
    }

    private final void l(HorizontalTo pathNode$HorizontalTo0, Path path0) {
        path0.m(pathNode$HorizontalTo0.f(), this.b.f());
        this.b.h(pathNode$HorizontalTo0.f());
    }

    private final void m(LineTo pathNode$LineTo0, Path path0) {
        path0.m(pathNode$LineTo0.g(), pathNode$LineTo0.h());
        this.b.h(pathNode$LineTo0.g());
        this.b.i(pathNode$LineTo0.h());
    }

    private final void n(MoveTo pathNode$MoveTo0, Path path0) {
        this.b.h(pathNode$MoveTo0.g());
        this.b.i(pathNode$MoveTo0.h());
        path0.i(pathNode$MoveTo0.g(), pathNode$MoveTo0.h());
        this.d.h(this.b.e());
        this.d.i(this.b.f());
    }

    private final int o(String s, int v) {
        while(v < s.length()) {
            int v1 = s.charAt(v);
            if(((v1 - 65) * (v1 - 90) <= 0 || (v1 - 97) * (v1 - 0x7A) <= 0) && v1 != 101 && v1 != 69) {
                return v;
            }
            ++v;
        }
        return v;
    }

    @l
    public final PathParser p(@l String s) {
        L.p(s, "pathData");
        this.a.clear();
        int v = 1;
        int v1 = 0;
        while(v < s.length()) {
            int v2 = this.o(s, v);
            String s1 = s.substring(v1, v2);
            L.o(s1, "this as java.lang.String…ing(startIndex, endIndex)");
            int v3 = s1.length() - 1;
            int v4 = 0;
            boolean z = false;
            while(v4 <= v3) {
                boolean z1 = L.t(s1.charAt((z ? v3 : v4)), 0x20) <= 0;
                if(z) {
                    if(!z1) {
                        break;
                    }
                    --v3;
                }
                else if(z1) {
                    ++v4;
                }
                else {
                    z = true;
                }
            }
            String s2 = s1.subSequence(v4, v3 + 1).toString();
            if(s2.length() > 0) {
                this.a(s2.charAt(0), this.k(s2));
            }
            v1 = v2;
            v = v2 + 1;
        }
        if(v - v1 == 1 && v1 < s.length()) {
            this.a(s.charAt(v1), new float[0]);
        }
        return this;
    }

    private final void q(QuadTo pathNode$QuadTo0, Path path0) {
        path0.o(pathNode$QuadTo0.i(), pathNode$QuadTo0.k(), pathNode$QuadTo0.j(), pathNode$QuadTo0.l());
        this.c.h(pathNode$QuadTo0.i());
        this.c.i(pathNode$QuadTo0.k());
        this.b.h(pathNode$QuadTo0.j());
        this.b.i(pathNode$QuadTo0.l());
    }

    private final void r(ReflectiveCurveTo pathNode$ReflectiveCurveTo0, boolean z, Path path0) {
        if(z) {
            this.e.h(this.b.e() * 2.0f - this.c.e());
            this.e.i(2.0f * this.b.f() - this.c.f());
        }
        else {
            this.e.h(this.b.e());
            this.e.i(this.b.f());
        }
        path0.s(this.e.e(), this.e.f(), pathNode$ReflectiveCurveTo0.i(), pathNode$ReflectiveCurveTo0.k(), pathNode$ReflectiveCurveTo0.j(), pathNode$ReflectiveCurveTo0.l());
        this.c.h(pathNode$ReflectiveCurveTo0.i());
        this.c.i(pathNode$ReflectiveCurveTo0.k());
        this.b.h(pathNode$ReflectiveCurveTo0.j());
        this.b.i(pathNode$ReflectiveCurveTo0.l());
    }

    private final void s(ReflectiveQuadTo pathNode$ReflectiveQuadTo0, boolean z, Path path0) {
        if(z) {
            this.e.h(this.b.e() * 2.0f - this.c.e());
            this.e.i(2.0f * this.b.f() - this.c.f());
        }
        else {
            this.e.h(this.b.e());
            this.e.i(this.b.f());
        }
        path0.o(this.e.e(), this.e.f(), pathNode$ReflectiveQuadTo0.g(), pathNode$ReflectiveQuadTo0.h());
        this.c.h(this.e.e());
        this.c.i(this.e.f());
        this.b.h(pathNode$ReflectiveQuadTo0.g());
        this.b.i(pathNode$ReflectiveQuadTo0.h());
    }

    private final void t(RelativeArcTo pathNode$RelativeArcTo0, Path path0) {
        float f = pathNode$RelativeArcTo0.l() + this.b.e();
        float f1 = pathNode$RelativeArcTo0.m() + this.b.f();
        this.i(path0, ((double)this.b.e()), ((double)this.b.f()), ((double)f), ((double)f1), ((double)pathNode$RelativeArcTo0.n()), ((double)pathNode$RelativeArcTo0.p()), ((double)pathNode$RelativeArcTo0.o()), pathNode$RelativeArcTo0.q(), pathNode$RelativeArcTo0.r());
        this.b.h(f);
        this.b.i(f1);
        this.c.h(this.b.e());
        this.c.i(this.b.f());
    }

    private final void u(RelativeCurveTo pathNode$RelativeCurveTo0, Path path0) {
        path0.c(pathNode$RelativeCurveTo0.k(), pathNode$RelativeCurveTo0.n(), pathNode$RelativeCurveTo0.l(), pathNode$RelativeCurveTo0.o(), pathNode$RelativeCurveTo0.m(), pathNode$RelativeCurveTo0.p());
        this.c.h(this.b.e() + pathNode$RelativeCurveTo0.l());
        this.c.i(this.b.f() + pathNode$RelativeCurveTo0.o());
        this.b.h(this.b.e() + pathNode$RelativeCurveTo0.m());
        this.b.i(this.b.f() + pathNode$RelativeCurveTo0.p());
    }

    private final void v(RelativeHorizontalTo pathNode$RelativeHorizontalTo0, Path path0) {
        path0.u(pathNode$RelativeHorizontalTo0.f(), 0.0f);
        this.b.h(this.b.e() + pathNode$RelativeHorizontalTo0.f());
    }

    private final void w(RelativeLineTo pathNode$RelativeLineTo0, Path path0) {
        path0.u(pathNode$RelativeLineTo0.g(), pathNode$RelativeLineTo0.h());
        this.b.h(this.b.e() + pathNode$RelativeLineTo0.g());
        this.b.i(this.b.f() + pathNode$RelativeLineTo0.h());
    }

    private final void x(RelativeMoveTo pathNode$RelativeMoveTo0, Path path0) {
        this.b.h(this.b.e() + pathNode$RelativeMoveTo0.g());
        this.b.i(this.b.f() + pathNode$RelativeMoveTo0.h());
        path0.b(pathNode$RelativeMoveTo0.g(), pathNode$RelativeMoveTo0.h());
        this.d.h(this.b.e());
        this.d.i(this.b.f());
    }

    private final void y(RelativeQuadTo pathNode$RelativeQuadTo0, Path path0) {
        path0.d(pathNode$RelativeQuadTo0.i(), pathNode$RelativeQuadTo0.k(), pathNode$RelativeQuadTo0.j(), pathNode$RelativeQuadTo0.l());
        this.c.h(this.b.e() + pathNode$RelativeQuadTo0.i());
        this.c.i(this.b.f() + pathNode$RelativeQuadTo0.k());
        this.b.h(this.b.e() + pathNode$RelativeQuadTo0.j());
        this.b.i(this.b.f() + pathNode$RelativeQuadTo0.l());
    }

    private final void z(RelativeReflectiveCurveTo pathNode$RelativeReflectiveCurveTo0, boolean z, Path path0) {
        if(z) {
            this.e.h(this.b.e() - this.c.e());
            this.e.i(this.b.f() - this.c.f());
        }
        else {
            this.e.g();
        }
        path0.c(this.e.e(), this.e.f(), pathNode$RelativeReflectiveCurveTo0.i(), pathNode$RelativeReflectiveCurveTo0.k(), pathNode$RelativeReflectiveCurveTo0.j(), pathNode$RelativeReflectiveCurveTo0.l());
        this.c.h(this.b.e() + pathNode$RelativeReflectiveCurveTo0.i());
        this.c.i(this.b.f() + pathNode$RelativeReflectiveCurveTo0.k());
        this.b.h(this.b.e() + pathNode$RelativeReflectiveCurveTo0.j());
        this.b.i(this.b.f() + pathNode$RelativeReflectiveCurveTo0.l());
    }
}

