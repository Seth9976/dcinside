package androidx.compose.ui.graphics.vector;

import androidx.compose.foundation.c;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.List;
import kotlin.c0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.m;
import y4.l;

@Immutable
public final class ImageVector {
    @StabilityInferred(parameters = 0)
    public static final class Builder {
        static final class GroupParams {
            @l
            private String a;
            private float b;
            private float c;
            private float d;
            private float e;
            private float f;
            private float g;
            private float h;
            @l
            private List i;
            @l
            private List j;

            public GroupParams() {
                this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 0x3FF, null);
            }

            public GroupParams(@l String s, float f, float f1, float f2, float f3, float f4, float f5, float f6, @l List list0, @l List list1) {
                L.p(s, "name");
                L.p(list0, "clipPathData");
                L.p(list1, "children");
                super();
                this.a = s;
                this.b = f;
                this.c = f1;
                this.d = f2;
                this.e = f3;
                this.f = f4;
                this.g = f5;
                this.h = f6;
                this.i = list0;
                this.j = list1;
            }

            public GroupParams(String s, float f, float f1, float f2, float f3, float f4, float f5, float f6, List list0, List list1, int v, w w0) {
                List list2 = (v & 0x100) == 0 ? list0 : VectorKt.h();
                List list3 = (v & 0x200) == 0 ? list1 : new ArrayList();
                this(((v & 1) == 0 ? s : ""), ((v & 2) == 0 ? f : 0.0f), ((v & 4) == 0 ? f1 : 0.0f), ((v & 8) == 0 ? f2 : 0.0f), ((v & 16) == 0 ? f3 : 1.0f), ((v & 0x20) == 0 ? f4 : 1.0f), ((v & 0x40) == 0 ? f5 : 0.0f), ((v & 0x80) == 0 ? f6 : 0.0f), list2, list3);
            }

            @l
            public final List a() {
                return this.j;
            }

            @l
            public final List b() {
                return this.i;
            }

            @l
            public final String c() [...] // 潜在的解密器

            public final float d() {
                return this.c;
            }

            public final float e() {
                return this.d;
            }

            public final float f() {
                return this.b;
            }

            public final float g() {
                return this.e;
            }

            public final float h() {
                return this.f;
            }

            public final float i() {
                return this.g;
            }

            public final float j() {
                return this.h;
            }

            public final void k(@l List list0) {
                L.p(list0, "<set-?>");
                this.j = list0;
            }

            public final void l(@l List list0) {
                L.p(list0, "<set-?>");
                this.i = list0;
            }

            public final void m(@l String s) {
                L.p(s, "<set-?>");
                this.a = s;
            }

            public final void n(float f) {
                this.c = f;
            }

            public final void o(float f) {
                this.d = f;
            }

            public final void p(float f) {
                this.b = f;
            }

            public final void q(float f) {
                this.e = f;
            }

            public final void r(float f) {
                this.f = f;
            }

            public final void s(float f) {
                this.g = f;
            }

            public final void t(float f) {
                this.h = f;
            }
        }

        @l
        private final String a;
        private final float b;
        private final float c;
        private final float d;
        private final float e;
        private final long f;
        private final int g;
        private final boolean h;
        @l
        private final ArrayList i;
        @l
        private GroupParams j;
        private boolean k;
        public static final int l = 8;

        static {
        }

        private Builder(String s, float f, float f1, float f2, float f3, long v, int v1) {
            this(s, f, f1, f2, f3, v, v1, false, null);
        }

        // 去混淆评级： 低(20)
        public Builder(String s, float f, float f1, float f2, float f3, long v, int v1, int v2, w w0) {
            this(((v2 & 1) == 0 ? s : ""), f, f1, f2, f3, ((v2 & 0x20) == 0 ? v : 16L), ((v2 & 0x40) == 0 ? v1 : 5), null);
        }

        @k(level = m.c, message = "Replace with ImageVector.Builder that consumes an optional auto mirror parameter", replaceWith = @c0(expression = "Builder(name, defaultWidth, defaultHeight, viewportWidth, viewportHeight, tintColor, tintBlendMode, false)", imports = {"androidx.compose.ui.graphics.vector"}))
        public Builder(String s, float f, float f1, float f2, float f3, long v, int v1, w w0) {
            this(s, f, f1, f2, f3, v, v1);
        }

        private Builder(String s, float f, float f1, float f2, float f3, long v, int v1, boolean z) {
            this.a = s;
            this.b = f;
            this.c = f1;
            this.d = f2;
            this.e = f3;
            this.f = v;
            this.g = v1;
            this.h = z;
            ArrayList arrayList0 = new ArrayList();
            this.i = arrayList0;
            GroupParams imageVector$Builder$GroupParams0 = new GroupParams(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 0x3FF, null);
            this.j = imageVector$Builder$GroupParams0;
            ImageVectorKt.j(arrayList0, imageVector$Builder$GroupParams0);
        }

        // 去混淆评级： 低(20)
        public Builder(String s, float f, float f1, float f2, float f3, long v, int v1, boolean z, int v2, w w0) {
            this(((v2 & 1) == 0 ? s : ""), f, f1, f2, f3, ((v2 & 0x20) == 0 ? v : 16L), ((v2 & 0x40) == 0 ? v1 : 5), ((v2 & 0x80) == 0 ? z : false), null);
        }

        public Builder(String s, float f, float f1, float f2, float f3, long v, int v1, boolean z, w w0) {
            this(s, f, f1, f2, f3, v, v1, z);
        }

        @l
        public final Builder a(@l String s, float f, float f1, float f2, float f3, float f4, float f5, float f6, @l List list0) {
            L.p(s, "name");
            L.p(list0, "clipPathData");
            this.h();
            GroupParams imageVector$Builder$GroupParams0 = new GroupParams(s, f, f1, f2, f3, f4, f5, f6, list0, null, 0x200, null);
            ImageVectorKt.j(this.i, imageVector$Builder$GroupParams0);
            return this;
        }

        public static Builder b(Builder imageVector$Builder0, String s, float f, float f1, float f2, float f3, float f4, float f5, float f6, List list0, int v, Object object0) {
            String s1 = (v & 1) == 0 ? s : "";
            float f7 = 0.0f;
            float f8 = (v & 2) == 0 ? f : 0.0f;
            float f9 = (v & 4) == 0 ? f1 : 0.0f;
            float f10 = (v & 8) == 0 ? f2 : 0.0f;
            float f11 = 1.0f;
            float f12 = (v & 16) == 0 ? f3 : 1.0f;
            if((v & 0x20) == 0) {
                f11 = f4;
            }
            float f13 = (v & 0x40) == 0 ? f5 : 0.0f;
            if((v & 0x80) == 0) {
                f7 = f6;
            }
            return (v & 0x100) == 0 ? imageVector$Builder0.a(s1, f8, f9, f10, f12, f11, f13, f7, list0) : imageVector$Builder0.a(s1, f8, f9, f10, f12, f11, f13, f7, VectorKt.h());
        }

        @l
        public final Builder c(@l List list0, int v, @l String s, @y4.m Brush brush0, float f, @y4.m Brush brush1, float f1, float f2, int v1, int v2, float f3, float f4, float f5, float f6) {
            L.p(list0, "pathData");
            L.p(s, "name");
            this.h();
            this.i().a().add(new VectorPath(s, list0, v, brush0, f, brush1, f1, f2, v1, v2, f3, f4, f5, f6, null));
            return this;
        }

        public static Builder d(Builder imageVector$Builder0, List list0, int v, String s, Brush brush0, float f, Brush brush1, float f1, float f2, int v1, int v2, float f3, float f4, float f5, float f6, int v3, Object object0) {
            Brush brush2 = null;
            float f7 = 1.0f;
            if((v3 & 0x20) == 0) {
                brush2 = brush1;
            }
            float f8 = 0.0f;
            if((v3 & 0x1000) == 0) {
                f7 = f5;
            }
            if((v3 & 0x2000) == 0) {
                f8 = f6;
            }
            return imageVector$Builder0.c(list0, ((v3 & 2) == 0 ? v : 0), ((v3 & 4) == 0 ? s : ""), ((v3 & 8) == 0 ? brush0 : null), ((v3 & 16) == 0 ? f : 1.0f), brush2, ((v3 & 0x40) == 0 ? f1 : 1.0f), ((v3 & 0x80) == 0 ? f2 : 0.0f), ((v3 & 0x100) == 0 ? v1 : 0), ((v3 & 0x200) == 0 ? v2 : 0), ((v3 & 0x400) == 0 ? f3 : 4.0f), ((v3 & 0x800) == 0 ? f4 : 0.0f), f7, f8);
        }

        // 去混淆评级： 低(20)
        private final VectorGroup e(GroupParams imageVector$Builder$GroupParams0) {
            return new VectorGroup("", imageVector$Builder$GroupParams0.f(), imageVector$Builder$GroupParams0.d(), imageVector$Builder$GroupParams0.e(), imageVector$Builder$GroupParams0.g(), imageVector$Builder$GroupParams0.h(), imageVector$Builder$GroupParams0.i(), imageVector$Builder$GroupParams0.j(), imageVector$Builder$GroupParams0.b(), imageVector$Builder$GroupParams0.a());
        }

        @l
        public final ImageVector f() {
            this.h();
            while(this.i.size() > 1) {
                this.g();
            }
            VectorGroup vectorGroup0 = this.e(this.j);
            ImageVector imageVector0 = new ImageVector(this.a, this.b, this.c, this.d, this.e, vectorGroup0, this.f, this.g, this.h, null);
            this.k = true;
            return imageVector0;
        }

        @l
        public final Builder g() {
            this.h();
            GroupParams imageVector$Builder$GroupParams0 = (GroupParams)ImageVectorKt.i(this.i);
            this.i().a().add(this.e(imageVector$Builder$GroupParams0));
            return this;
        }

        private final void h() {
            if(this.k) {
                throw new IllegalStateException("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
        }

        private final GroupParams i() {
            return (GroupParams)ImageVectorKt.h(this.i);
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    @l
    private final String a;
    private final float b;
    private final float c;
    private final float d;
    private final float e;
    @l
    private final VectorGroup f;
    private final long g;
    private final int h;
    private final boolean i;
    @l
    public static final Companion j;
    public static final int k;

    static {
        ImageVector.j = new Companion(null);
    }

    private ImageVector(String s, float f, float f1, float f2, float f3, VectorGroup vectorGroup0, long v, int v1, boolean z) {
        this.a = s;
        this.b = f;
        this.c = f1;
        this.d = f2;
        this.e = f3;
        this.f = vectorGroup0;
        this.g = v;
        this.h = v1;
        this.i = z;
    }

    public ImageVector(String s, float f, float f1, float f2, float f3, VectorGroup vectorGroup0, long v, int v1, boolean z, w w0) {
        this(s, f, f1, f2, f3, vectorGroup0, v, v1, z);
    }

    public final boolean a() {
        return this.i;
    }

    public final float b() {
        return this.c;
    }

    public final float c() {
        return this.b;
    }

    @l
    public final String d() {
        return this.a;
    }

    @l
    public final VectorGroup e() {
        return this.f;
    }

    @Override
    public boolean equals(@y4.m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ImageVector)) {
            return false;
        }
        if(!L.g(this.a, ((ImageVector)object0).a)) {
            return false;
        }
        if(!Dp.l(this.b, ((ImageVector)object0).b)) {
            return false;
        }
        if(!Dp.l(this.c, ((ImageVector)object0).c)) {
            return false;
        }
        if(this.d != ((ImageVector)object0).d || this.e != ((ImageVector)object0).e || !L.g(this.f, ((ImageVector)object0).f)) {
            return false;
        }
        if(!Color.y(this.g, ((ImageVector)object0).g)) {
            return false;
        }
        return BlendMode.G(this.h, ((ImageVector)object0).h) ? this.i == ((ImageVector)object0).i : false;
    }

    public final int f() {
        return this.h;
    }

    public final long g() {
        return this.g;
    }

    public final float h() {
        return this.e;
    }

    @Override
    public int hashCode() {
        return (((((((this.a.hashCode() * 0x1F + Dp.n(this.b)) * 0x1F + Dp.n(this.c)) * 0x1F + Float.floatToIntBits(this.d)) * 0x1F + Float.floatToIntBits(this.e)) * 0x1F + this.f.hashCode()) * 0x1F + Color.K(this.g)) * 0x1F + this.h) * 0x1F + c.a(this.i);
    }

    public final float i() {
        return this.d;
    }
}

