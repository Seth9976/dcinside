package androidx.compose.ui.graphics.vector;

import A3.a;
import A3.o;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import java.util.List;
import kotlin.S0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nVectorCompose.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorCompose.kt\nandroidx/compose/ui/graphics/vector/VectorComposeKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,165:1\n325#2,11:166\n251#2,10:177\n*S KotlinDebug\n*F\n+ 1 VectorCompose.kt\nandroidx/compose/ui/graphics/vector/VectorComposeKt\n*L\n59#1:166,11\n116#1:177,10\n*E\n"})
public final class VectorComposeKt {
    @Composable
    @VectorComposable
    public static final void a(@m String s, float f, float f1, float f2, float f3, float f4, float f5, float f6, @m List list0, @l o o0, @m Composer composer0, int v, int v1) {
        List list1;
        float f15;
        float f14;
        float f13;
        float f12;
        float f11;
        float f10;
        float f9;
        String s1;
        List list2;
        float f18;
        float f17;
        float f16;
        float f8;
        float f7;
        int v2;
        L.p(o0, "content");
        Composer composer1 = composer0.G(0xF3478136);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.t(s) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.x(f) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            f7 = f1;
        }
        else if((v & 0x380) == 0) {
            f7 = f1;
            v2 |= (composer1.x(f7) ? 0x100 : 0x80);
        }
        else {
            f7 = f1;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            f8 = f2;
        }
        else if((v & 0x1C00) == 0) {
            f8 = f2;
            v2 |= (composer1.x(f8) ? 0x800 : 0x400);
        }
        else {
            f8 = f2;
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((v & 0xE000) == 0) {
            v2 |= (composer1.x(f3) ? 0x4000 : 0x2000);
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((v & 0x70000) == 0) {
            v2 |= (composer1.x(f4) ? 0x20000 : 0x10000);
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
        }
        else if((v & 0x380000) == 0) {
            v2 |= (composer1.x(f5) ? 0x100000 : 0x80000);
        }
        if((v1 & 0x80) != 0) {
            v2 |= 0xC00000;
        }
        else if((v & 0x1C00000) == 0) {
            v2 |= (composer1.x(f6) ? 0x800000 : 0x400000);
        }
        if((v1 & 0x100) != 0) {
            v2 |= 0x2000000;
        }
        if((v1 & 0x200) != 0) {
            v2 |= 0x30000000;
        }
        else if((0x70000000 & v) == 0) {
            v2 |= (composer1.Y(o0) ? 0x20000000 : 0x10000000);
        }
        if((v1 & 0x100) != 0x100 || (0x5B6DB6DB & v2) != 306783378 || !composer1.c()) {
            composer1.Z();
            if((v & 1) == 0 || composer1.p()) {
                s1 = (v1 & 1) == 0 ? s : "";
                f18 = 0.0f;
                f9 = (v1 & 2) == 0 ? f : 0.0f;
                if((v1 & 4) != 0) {
                    f7 = 0.0f;
                }
                if((v1 & 8) != 0) {
                    f8 = 0.0f;
                }
                f16 = 1.0f;
                f10 = (v1 & 16) == 0 ? f3 : 1.0f;
                if((v1 & 0x20) == 0) {
                    f16 = f4;
                }
                f17 = (v1 & 0x40) == 0 ? f5 : 0.0f;
                if((v1 & 0x80) == 0) {
                    f18 = f6;
                }
                if((v1 & 0x100) == 0) {
                    list2 = list0;
                }
                else {
                    list2 = VectorKt.h();
                    v2 &= 0xF1FFFFFF;
                }
            }
            else {
                composer1.m();
                if((v1 & 0x100) != 0) {
                    v2 &= 0xF1FFFFFF;
                }
                s1 = s;
                f9 = f;
                f10 = f3;
                f16 = f4;
                f17 = f5;
                f18 = f6;
                list2 = list0;
            }
            composer1.P();
            if(ComposerKt.g0()) {
                ComposerKt.w0(0xF3478136, v2, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:46)");
            }
            androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1 vectorComposeKt$Group$10 = androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1.e;
            composer1.V(0xDF52C09C);
            if(!(composer1.H() instanceof VectorApplier)) {
                ComposablesKt.n();
            }
            composer1.K();
            if(composer1.E()) {
                composer1.k(vectorComposeKt$Group$10);
            }
            else {
                composer1.f();
            }
            Composer composer2 = Updater.b(composer1);
            Updater.j(composer2, s1, androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.1.e);
            Updater.j(composer2, f9, androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.2.e);
            Updater.j(composer2, f7, androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.3.e);
            Updater.j(composer2, f8, androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.4.e);
            Updater.j(composer2, f10, androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.5.e);
            Updater.j(composer2, f16, androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.6.e);
            Updater.j(composer2, f17, androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.7.e);
            Updater.j(composer2, f18, androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.8.e);
            Updater.j(composer2, list2, androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.9.e);
            o0.invoke(composer1, ((int)(v2 >> 27 & 14)));
            composer1.g();
            composer1.g0();
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
            f13 = f18;
            f11 = f16;
            f14 = f7;
            f15 = f8;
            f12 = f17;
            list1 = list2;
        }
        else {
            composer1.m();
            s1 = s;
            f9 = f;
            f10 = f3;
            f11 = f4;
            f12 = f5;
            f13 = f6;
            f14 = f7;
            f15 = f8;
            list1 = list0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(s1, f9, f14, f15, f10, f11, f12, f13, list1, o0, v, v1) {
                final String e;
                final float f;
                final float g;
                final float h;
                final float i;
                final float j;
                final float k;
                final float l;
                final List m;
                final o n;
                final int o;
                final int p;

                {
                    this.e = s;
                    this.f = f;
                    this.g = f1;
                    this.h = f2;
                    this.i = f3;
                    this.j = f4;
                    this.k = f5;
                    this.l = f6;
                    this.m = list0;
                    this.n = o0;
                    this.o = v;
                    this.p = v1;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    VectorComposeKt.a(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, composer0, (this.o | 1) & -920350135 | ((0x24924924 & (this.o | 1)) >> 1 | 306783378 & (this.o | 1)) | (306783378 & (this.o | 1)) << 1 & (0x24924924 & (this.o | 1)), this.p);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }

        final class androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1 extends N implements a {
            public static final androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1 e;

            static {
                androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1.e = new androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1();
            }

            androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1() {
                super(0);
            }

            @l
            public final GroupComponent b() {
                return new GroupComponent();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        final class androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.1 extends N implements o {
            public static final androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.1 e;

            static {
                androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.1.e = new androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.1();
            }

            androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.1() {
                super(2);
            }

            public final void a(@l GroupComponent groupComponent0, @l String s) {
                L.p(groupComponent0, "$this$set");
                L.p(s, "it");
                groupComponent0.t(s);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((GroupComponent)object0), ((String)object1));
                return S0.a;
            }
        }


        final class androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.2 extends N implements o {
            public static final androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.2 e;

            static {
                androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.2.e = new androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.2();
            }

            androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.2() {
                super(2);
            }

            public final void a(@l GroupComponent groupComponent0, float f) {
                L.p(groupComponent0, "$this$set");
                groupComponent0.w(f);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((GroupComponent)object0), ((Number)object1).floatValue());
                return S0.a;
            }
        }


        final class androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.3 extends N implements o {
            public static final androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.3 e;

            static {
                androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.3.e = new androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.3();
            }

            androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.3() {
                super(2);
            }

            public final void a(@l GroupComponent groupComponent0, float f) {
                L.p(groupComponent0, "$this$set");
                groupComponent0.u(f);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((GroupComponent)object0), ((Number)object1).floatValue());
                return S0.a;
            }
        }


        final class androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.4 extends N implements o {
            public static final androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.4 e;

            static {
                androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.4.e = new androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.4();
            }

            androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.4() {
                super(2);
            }

            public final void a(@l GroupComponent groupComponent0, float f) {
                L.p(groupComponent0, "$this$set");
                groupComponent0.v(f);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((GroupComponent)object0), ((Number)object1).floatValue());
                return S0.a;
            }
        }


        final class androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.5 extends N implements o {
            public static final androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.5 e;

            static {
                androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.5.e = new androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.5();
            }

            androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.5() {
                super(2);
            }

            public final void a(@l GroupComponent groupComponent0, float f) {
                L.p(groupComponent0, "$this$set");
                groupComponent0.x(f);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((GroupComponent)object0), ((Number)object1).floatValue());
                return S0.a;
            }
        }


        final class androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.6 extends N implements o {
            public static final androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.6 e;

            static {
                androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.6.e = new androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.6();
            }

            androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.6() {
                super(2);
            }

            public final void a(@l GroupComponent groupComponent0, float f) {
                L.p(groupComponent0, "$this$set");
                groupComponent0.y(f);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((GroupComponent)object0), ((Number)object1).floatValue());
                return S0.a;
            }
        }


        final class androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.7 extends N implements o {
            public static final androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.7 e;

            static {
                androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.7.e = new androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.7();
            }

            androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.7() {
                super(2);
            }

            public final void a(@l GroupComponent groupComponent0, float f) {
                L.p(groupComponent0, "$this$set");
                groupComponent0.z(f);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((GroupComponent)object0), ((Number)object1).floatValue());
                return S0.a;
            }
        }


        final class androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.8 extends N implements o {
            public static final androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.8 e;

            static {
                androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.8.e = new androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.8();
            }

            androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.8() {
                super(2);
            }

            public final void a(@l GroupComponent groupComponent0, float f) {
                L.p(groupComponent0, "$this$set");
                groupComponent0.A(f);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((GroupComponent)object0), ((Number)object1).floatValue());
                return S0.a;
            }
        }


        final class androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.9 extends N implements o {
            public static final androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.9 e;

            static {
                androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.9.e = new androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.9();
            }

            androidx.compose.ui.graphics.vector.VectorComposeKt.Group.2.9() {
                super(2);
            }

            public final void a(@l GroupComponent groupComponent0, @l List list0) {
                L.p(groupComponent0, "$this$set");
                L.p(list0, "it");
                groupComponent0.s(list0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((GroupComponent)object0), ((List)object1));
                return S0.a;
            }
        }

    }

    @Composable
    @VectorComposable
    public static final void b(@l List list0, int v, @m String s, @m Brush brush0, float f, @m Brush brush1, float f1, float f2, int v1, int v2, float f3, float f4, float f5, float f6, @m Composer composer0, int v3, int v4, int v5) {
        L.p(list0, "pathData");
        Composer composer1 = composer0.G(-1478270750);
        int v6 = (v5 & 2) == 0 ? v : 0;
        String s1 = (v5 & 4) == 0 ? s : "";
        Brush brush2 = null;
        Brush brush3 = (v5 & 8) == 0 ? brush0 : null;
        float f7 = (v5 & 16) == 0 ? f : 1.0f;
        if((v5 & 0x20) == 0) {
            brush2 = brush1;
        }
        float f8 = (v5 & 0x40) == 0 ? f1 : 1.0f;
        float f9 = (v5 & 0x80) == 0 ? f2 : 0.0f;
        int v7 = (v5 & 0x100) == 0 ? v1 : 0;
        int v8 = (v5 & 0x200) == 0 ? v2 : 0;
        float f10 = (v5 & 0x400) == 0 ? f3 : 4.0f;
        float f11 = (v5 & 0x800) == 0 ? f4 : 0.0f;
        float f12 = (v5 & 0x1000) == 0 ? f5 : 1.0f;
        float f13 = (v5 & 0x2000) == 0 ? f6 : 0.0f;
        if(ComposerKt.g0()) {
            ComposerKt.w0(-1478270750, v3, v4, "androidx.compose.ui.graphics.vector.Path (VectorCompose.kt:99)");
        }
        androidx.compose.ui.graphics.vector.VectorComposeKt.Path.1 vectorComposeKt$Path$10 = androidx.compose.ui.graphics.vector.VectorComposeKt.Path.1.e;
        composer1.V(0x7076B8D0);
        if(!(composer1.H() instanceof VectorApplier)) {
            ComposablesKt.n();
        }
        composer1.K();
        if(composer1.E()) {
            composer1.k(new a(vectorComposeKt$Path$10) {
                final a e;

                {
                    this.e = a0;
                    super(0);
                }

                @Override  // A3.a
                @l
                public final Object invoke() {
                    return this.e.invoke();
                }
            });
        }
        else {
            composer1.f();
        }
        Composer composer2 = Updater.b(composer1);
        Updater.j(composer2, s1, androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.1.e);
        Updater.j(composer2, list0, androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.2.e);
        Updater.j(composer2, PathFillType.c(v6), androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.3.e);
        Updater.j(composer2, brush3, androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.4.e);
        Updater.j(composer2, f7, androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.5.e);
        Updater.j(composer2, brush2, androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.6.e);
        Updater.j(composer2, f8, androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.7.e);
        Updater.j(composer2, f9, androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.8.e);
        Updater.j(composer2, StrokeJoin.d(v8), androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.9.e);
        Updater.j(composer2, StrokeCap.d(v7), androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.10.e);
        Updater.j(composer2, f10, androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.11.e);
        Updater.j(composer2, f11, androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.12.e);
        Updater.j(composer2, f12, androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.13.e);
        Updater.j(composer2, f13, androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.14.e);
        composer1.g();
        composer1.g0();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(list0, v6, s1, brush3, f7, brush2, f8, f9, v7, v8, f10, f11, f12, f13, v3, v4, v5) {
                final List e;
                final int f;
                final String g;
                final Brush h;
                final float i;
                final Brush j;
                final float k;
                final float l;
                final int m;
                final int n;
                final float o;
                final float p;
                final float q;
                final float r;
                final int s;
                final int t;
                final int u;

                {
                    this.e = list0;
                    this.f = v;
                    this.g = s;
                    this.h = brush0;
                    this.i = f;
                    this.j = brush1;
                    this.k = f1;
                    this.l = f2;
                    this.m = v1;
                    this.n = v2;
                    this.o = f3;
                    this.p = f4;
                    this.q = f5;
                    this.r = f6;
                    this.s = v3;
                    this.t = v4;
                    this.u = v5;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    VectorComposeKt.b(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, composer0, (this.s | 1) & -920350135 | ((0x24924924 & (this.s | 1)) >> 1 | 306783378 & (this.s | 1)) | (306783378 & (this.s | 1)) << 1 & (0x24924924 & (this.s | 1)), this.t & -920350135 | ((0x24924924 & this.t) >> 1 | 306783378 & this.t) | (306783378 & this.t) << 1 & (0x24924924 & this.t), this.u);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }

        final class androidx.compose.ui.graphics.vector.VectorComposeKt.Path.1 extends N implements a {
            public static final androidx.compose.ui.graphics.vector.VectorComposeKt.Path.1 e;

            static {
                androidx.compose.ui.graphics.vector.VectorComposeKt.Path.1.e = new androidx.compose.ui.graphics.vector.VectorComposeKt.Path.1();
            }

            androidx.compose.ui.graphics.vector.VectorComposeKt.Path.1() {
                super(0);
            }

            @l
            public final PathComponent b() {
                return new PathComponent();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        final class androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.10 extends N implements o {
            public static final androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.10 e;

            static {
                androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.10.e = new androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.10();
            }

            androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.10() {
                super(2);
            }

            public final void a(@l PathComponent pathComponent0, int v) {
                L.p(pathComponent0, "$this$set");
                pathComponent0.A(v);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((PathComponent)object0), ((StrokeCap)object1).j());
                return S0.a;
            }
        }


        final class androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.11 extends N implements o {
            public static final androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.11 e;

            static {
                androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.11.e = new androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.11();
            }

            androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.11() {
                super(2);
            }

            public final void a(@l PathComponent pathComponent0, float f) {
                L.p(pathComponent0, "$this$set");
                pathComponent0.C(f);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((PathComponent)object0), ((Number)object1).floatValue());
                return S0.a;
            }
        }


        final class androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.12 extends N implements o {
            public static final androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.12 e;

            static {
                androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.12.e = new androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.12();
            }

            androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.12() {
                super(2);
            }

            public final void a(@l PathComponent pathComponent0, float f) {
                L.p(pathComponent0, "$this$set");
                pathComponent0.G(f);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((PathComponent)object0), ((Number)object1).floatValue());
                return S0.a;
            }
        }


        final class androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.13 extends N implements o {
            public static final androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.13 e;

            static {
                androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.13.e = new androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.13();
            }

            androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.13() {
                super(2);
            }

            public final void a(@l PathComponent pathComponent0, float f) {
                L.p(pathComponent0, "$this$set");
                pathComponent0.E(f);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((PathComponent)object0), ((Number)object1).floatValue());
                return S0.a;
            }
        }


        final class androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.14 extends N implements o {
            public static final androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.14 e;

            static {
                androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.14.e = new androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.14();
            }

            androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.14() {
                super(2);
            }

            public final void a(@l PathComponent pathComponent0, float f) {
                L.p(pathComponent0, "$this$set");
                pathComponent0.F(f);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((PathComponent)object0), ((Number)object1).floatValue());
                return S0.a;
            }
        }


        final class androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.1 extends N implements o {
            public static final androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.1 e;

            static {
                androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.1.e = new androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.1();
            }

            androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.1() {
                super(2);
            }

            public final void a(@l PathComponent pathComponent0, @l String s) {
                L.p(pathComponent0, "$this$set");
                L.p(s, "it");
                pathComponent0.v(s);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((PathComponent)object0), ((String)object1));
                return S0.a;
            }
        }


        final class androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.2 extends N implements o {
            public static final androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.2 e;

            static {
                androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.2.e = new androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.2();
            }

            androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.2() {
                super(2);
            }

            public final void a(@l PathComponent pathComponent0, @l List list0) {
                L.p(pathComponent0, "$this$set");
                L.p(list0, "it");
                pathComponent0.w(list0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((PathComponent)object0), ((List)object1));
                return S0.a;
            }
        }


        final class androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.3 extends N implements o {
            public static final androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.3 e;

            static {
                androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.3.e = new androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.3();
            }

            androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.3() {
                super(2);
            }

            public final void a(@l PathComponent pathComponent0, int v) {
                L.p(pathComponent0, "$this$set");
                pathComponent0.x(v);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((PathComponent)object0), ((PathFillType)object1).i());
                return S0.a;
            }
        }


        final class androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.4 extends N implements o {
            public static final androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.4 e;

            static {
                androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.4.e = new androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.4();
            }

            androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.4() {
                super(2);
            }

            public final void a(@l PathComponent pathComponent0, @m Brush brush0) {
                L.p(pathComponent0, "$this$set");
                pathComponent0.t(brush0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((PathComponent)object0), ((Brush)object1));
                return S0.a;
            }
        }


        final class androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.5 extends N implements o {
            public static final androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.5 e;

            static {
                androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.5.e = new androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.5();
            }

            androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.5() {
                super(2);
            }

            public final void a(@l PathComponent pathComponent0, float f) {
                L.p(pathComponent0, "$this$set");
                pathComponent0.u(f);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((PathComponent)object0), ((Number)object1).floatValue());
                return S0.a;
            }
        }


        final class androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.6 extends N implements o {
            public static final androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.6 e;

            static {
                androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.6.e = new androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.6();
            }

            androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.6() {
                super(2);
            }

            public final void a(@l PathComponent pathComponent0, @m Brush brush0) {
                L.p(pathComponent0, "$this$set");
                pathComponent0.y(brush0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((PathComponent)object0), ((Brush)object1));
                return S0.a;
            }
        }


        final class androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.7 extends N implements o {
            public static final androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.7 e;

            static {
                androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.7.e = new androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.7();
            }

            androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.7() {
                super(2);
            }

            public final void a(@l PathComponent pathComponent0, float f) {
                L.p(pathComponent0, "$this$set");
                pathComponent0.z(f);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((PathComponent)object0), ((Number)object1).floatValue());
                return S0.a;
            }
        }


        final class androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.8 extends N implements o {
            public static final androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.8 e;

            static {
                androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.8.e = new androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.8();
            }

            androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.8() {
                super(2);
            }

            public final void a(@l PathComponent pathComponent0, float f) {
                L.p(pathComponent0, "$this$set");
                pathComponent0.D(f);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((PathComponent)object0), ((Number)object1).floatValue());
                return S0.a;
            }
        }


        final class androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.9 extends N implements o {
            public static final androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.9 e;

            static {
                androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.9.e = new androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.9();
            }

            androidx.compose.ui.graphics.vector.VectorComposeKt.Path.2.9() {
                super(2);
            }

            public final void a(@l PathComponent pathComponent0, int v) {
                L.p(pathComponent0, "$this$set");
                pathComponent0.B(v);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((PathComponent)object0), ((StrokeJoin)object1).j());
                return S0.a;
            }
        }

    }
}

