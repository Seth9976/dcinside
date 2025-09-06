package androidx.compose.foundation.layout;

import A3.o;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment.Companion;
import androidx.compose.ui.Alignment.Horizontal;
import androidx.compose.ui.Alignment.Vertical;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,1024:1\n135#2:1025\n135#2:1026\n135#2:1027\n135#2:1028\n135#2:1029\n135#2:1030\n135#2:1031\n135#2:1032\n135#2:1033\n135#2:1034\n135#2:1035\n135#2:1036\n135#2:1037\n135#2:1038\n135#2:1039\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n61#1:1025\n85#1:1026\n111#1:1027\n138#1:1028\n176#1:1029\n199#1:1030\n226#1:1031\n257#1:1032\n285#1:1033\n315#1:1034\n342#1:1035\n381#1:1036\n405#1:1037\n434#1:1038\n619#1:1039\n*E\n"})
public final class SizeKt {
    @l
    private static final FillModifier a;
    @l
    private static final FillModifier b;
    @l
    private static final FillModifier c;
    @l
    private static final WrapContentModifier d;
    @l
    private static final WrapContentModifier e;
    @l
    private static final WrapContentModifier f;
    @l
    private static final WrapContentModifier g;
    @l
    private static final WrapContentModifier h;
    @l
    private static final WrapContentModifier i;

    static {
        SizeKt.a = SizeKt.c(1.0f);
        SizeKt.b = SizeKt.a(1.0f);
        SizeKt.c = SizeKt.b(1.0f);
        SizeKt.d = SizeKt.f(Alignment.a.m(), false);
        SizeKt.e = SizeKt.f(Alignment.a.u(), false);
        SizeKt.f = SizeKt.d(Alignment.a.q(), false);
        SizeKt.g = SizeKt.d(Alignment.a.w(), false);
        SizeKt.h = SizeKt.e(Alignment.a.i(), false);
        SizeKt.i = SizeKt.e(Alignment.a.C(), false);
    }

    @Stable
    @l
    public static final Modifier A(@l Modifier modifier0, float f, float f1) {
        L.p(modifier0, "$this$requiredWidthIn");
        return modifier0.r0(new SizeModifier(f, 0.0f, f1, 0.0f, false, InspectableValueKt.b(), 10, null));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,170:1\n382#2,4:171\n*E\n"})
        public final class androidx.compose.foundation.layout.SizeKt.requiredWidthIn-VpY3zN4..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final float e;
            final float f;

            public androidx.compose.foundation.layout.SizeKt.requiredWidthIn-VpY3zN4..inlined.debugInspectorInfo.1(float f, float f1) {
                this.e = f;
                this.f = f1;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("requiredWidthIn");
                inspectorInfo0.b().c("min", Dp.d(this.e));
                inspectorInfo0.b().c("max", Dp.d(this.f));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    public static Modifier B(Modifier modifier0, float f, float f1, int v, Object object0) {
        if((v & 1) != 0) {
            f = NaNf;
        }
        if((v & 2) != 0) {
            f1 = NaNf;
        }
        return SizeKt.A(modifier0, f, f1);
    }

    @Stable
    @l
    public static final Modifier C(@l Modifier modifier0, float f) {
        L.p(modifier0, "$this$size");
        return modifier0.r0(new SizeModifier(f, f, f, f, true, InspectableValueKt.b(), null));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,170:1\n112#2,3:171\n*E\n"})
        public final class androidx.compose.foundation.layout.SizeKt.size-3ABfNKs..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final float e;

            public androidx.compose.foundation.layout.SizeKt.size-3ABfNKs..inlined.debugInspectorInfo.1(float f) {
                this.e = f;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("size");
                inspectorInfo0.e(Dp.d(this.e));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    @Stable
    @l
    public static final Modifier D(@l Modifier modifier0, long v) {
        L.p(modifier0, "$this$size");
        return SizeKt.E(modifier0, DpSize.p(v), DpSize.m(v));
    }

    @Stable
    @l
    public static final Modifier E(@l Modifier modifier0, float f, float f1) {
        L.p(modifier0, "$this$size");
        return modifier0.r0(new SizeModifier(f, f1, f, f1, true, InspectableValueKt.b(), null));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,170:1\n139#2,4:171\n*E\n"})
        public final class androidx.compose.foundation.layout.SizeKt.size-VpY3zN4..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final float e;
            final float f;

            public androidx.compose.foundation.layout.SizeKt.size-VpY3zN4..inlined.debugInspectorInfo.1(float f, float f1) {
                this.e = f;
                this.f = f1;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("size");
                inspectorInfo0.b().c("width", Dp.d(this.e));
                inspectorInfo0.b().c("height", Dp.d(this.f));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    @Stable
    @l
    public static final Modifier F(@l Modifier modifier0, float f, float f1, float f2, float f3) {
        L.p(modifier0, "$this$sizeIn");
        return modifier0.r0(new SizeModifier(f, f1, f2, f3, true, InspectableValueKt.b(), null));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,170:1\n227#2,6:171\n*E\n"})
        public final class androidx.compose.foundation.layout.SizeKt.sizeIn-qDBjuR0..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final float e;
            final float f;
            final float g;
            final float h;

            public androidx.compose.foundation.layout.SizeKt.sizeIn-qDBjuR0..inlined.debugInspectorInfo.1(float f, float f1, float f2, float f3) {
                this.e = f;
                this.f = f1;
                this.g = f2;
                this.h = f3;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("sizeIn");
                inspectorInfo0.b().c("minWidth", Dp.d(this.e));
                inspectorInfo0.b().c("minHeight", Dp.d(this.f));
                inspectorInfo0.b().c("maxWidth", Dp.d(this.g));
                inspectorInfo0.b().c("maxHeight", Dp.d(this.h));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    public static Modifier G(Modifier modifier0, float f, float f1, float f2, float f3, int v, Object object0) {
        if((v & 1) != 0) {
            f = NaNf;
        }
        if((v & 2) != 0) {
            f1 = NaNf;
        }
        if((v & 4) != 0) {
            f2 = NaNf;
        }
        if((v & 8) != 0) {
            f3 = NaNf;
        }
        return SizeKt.F(modifier0, f, f1, f2, f3);
    }

    @Stable
    @l
    public static final Modifier H(@l Modifier modifier0, float f) {
        L.p(modifier0, "$this$width");
        return modifier0.r0(new SizeModifier(f, 0.0f, f, 0.0f, true, InspectableValueKt.b(), 10, null));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,170:1\n62#2,3:171\n*E\n"})
        public final class androidx.compose.foundation.layout.SizeKt.width-3ABfNKs..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final float e;

            public androidx.compose.foundation.layout.SizeKt.width-3ABfNKs..inlined.debugInspectorInfo.1(float f) {
                this.e = f;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("width");
                inspectorInfo0.e(Dp.d(this.e));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    @Stable
    @l
    public static final Modifier I(@l Modifier modifier0, float f, float f1) {
        L.p(modifier0, "$this$widthIn");
        return modifier0.r0(new SizeModifier(f, 0.0f, f1, 0.0f, true, InspectableValueKt.b(), 10, null));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,170:1\n177#2,4:171\n*E\n"})
        public final class androidx.compose.foundation.layout.SizeKt.widthIn-VpY3zN4..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final float e;
            final float f;

            public androidx.compose.foundation.layout.SizeKt.widthIn-VpY3zN4..inlined.debugInspectorInfo.1(float f, float f1) {
                this.e = f;
                this.f = f1;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("widthIn");
                inspectorInfo0.b().c("min", Dp.d(this.e));
                inspectorInfo0.b().c("max", Dp.d(this.f));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    public static Modifier J(Modifier modifier0, float f, float f1, int v, Object object0) {
        if((v & 1) != 0) {
            f = NaNf;
        }
        if((v & 2) != 0) {
            f1 = NaNf;
        }
        return SizeKt.I(modifier0, f, f1);
    }

    @Stable
    @l
    public static final Modifier K(@l Modifier modifier0, @l Vertical alignment$Vertical0, boolean z) {
        L.p(modifier0, "<this>");
        L.p(alignment$Vertical0, "align");
        Companion alignment$Companion0 = Alignment.a;
        if(L.g(alignment$Vertical0, alignment$Companion0.q()) && !z) {
            return modifier0.r0(SizeKt.f);
        }
        return !L.g(alignment$Vertical0, alignment$Companion0.w()) || z ? modifier0.r0(SizeKt.d(alignment$Vertical0, z)) : modifier0.r0(SizeKt.g);
    }

    public static Modifier L(Modifier modifier0, Vertical alignment$Vertical0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            alignment$Vertical0 = Alignment.a.q();
        }
        if((v & 2) != 0) {
            z = false;
        }
        return SizeKt.K(modifier0, alignment$Vertical0, z);
    }

    @Stable
    @l
    public static final Modifier M(@l Modifier modifier0, @l Alignment alignment0, boolean z) {
        L.p(modifier0, "<this>");
        L.p(alignment0, "align");
        Companion alignment$Companion0 = Alignment.a;
        if(L.g(alignment0, alignment$Companion0.i()) && !z) {
            return modifier0.r0(SizeKt.h);
        }
        return !L.g(alignment0, alignment$Companion0.C()) || z ? modifier0.r0(SizeKt.e(alignment0, z)) : modifier0.r0(SizeKt.i);
    }

    public static Modifier N(Modifier modifier0, Alignment alignment0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            alignment0 = Alignment.a.i();
        }
        if((v & 2) != 0) {
            z = false;
        }
        return SizeKt.M(modifier0, alignment0, z);
    }

    @Stable
    @l
    public static final Modifier O(@l Modifier modifier0, @l Horizontal alignment$Horizontal0, boolean z) {
        L.p(modifier0, "<this>");
        L.p(alignment$Horizontal0, "align");
        Companion alignment$Companion0 = Alignment.a;
        if(L.g(alignment$Horizontal0, alignment$Companion0.m()) && !z) {
            return modifier0.r0(SizeKt.d);
        }
        return !L.g(alignment$Horizontal0, alignment$Companion0.u()) || z ? modifier0.r0(SizeKt.f(alignment$Horizontal0, z)) : modifier0.r0(SizeKt.e);
    }

    public static Modifier P(Modifier modifier0, Horizontal alignment$Horizontal0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            alignment$Horizontal0 = Alignment.a.m();
        }
        if((v & 2) != 0) {
            z = false;
        }
        return SizeKt.O(modifier0, alignment$Horizontal0, z);
    }

    private static final FillModifier a(float f) {
        androidx.compose.foundation.layout.SizeKt.createFillHeightModifier.1 sizeKt$createFillHeightModifier$10 = new Function1(f) {
            final float e;

            {
                this.e = f;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$$receiver");
                inspectorInfo0.d("fillMaxHeight");
                inspectorInfo0.b().c("fraction", this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        };
        return new FillModifier(Direction.a, f, sizeKt$createFillHeightModifier$10);
    }

    private static final FillModifier b(float f) {
        androidx.compose.foundation.layout.SizeKt.createFillSizeModifier.1 sizeKt$createFillSizeModifier$10 = new Function1(f) {
            final float e;

            {
                this.e = f;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$$receiver");
                inspectorInfo0.d("fillMaxSize");
                inspectorInfo0.b().c("fraction", this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        };
        return new FillModifier(Direction.c, f, sizeKt$createFillSizeModifier$10);
    }

    private static final FillModifier c(float f) {
        androidx.compose.foundation.layout.SizeKt.createFillWidthModifier.1 sizeKt$createFillWidthModifier$10 = new Function1(f) {
            final float e;

            {
                this.e = f;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$$receiver");
                inspectorInfo0.d("fillMaxWidth");
                inspectorInfo0.b().c("fraction", this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        };
        return new FillModifier(Direction.b, f, sizeKt$createFillWidthModifier$10);
    }

    private static final WrapContentModifier d(Vertical alignment$Vertical0, boolean z) {
        androidx.compose.foundation.layout.SizeKt.createWrapContentHeightModifier.1 sizeKt$createWrapContentHeightModifier$10 = new o(alignment$Vertical0) {
            final Vertical e;

            {
                this.e = alignment$Vertical0;
                super(2);
            }

            public final long a(long v, @l LayoutDirection layoutDirection0) {
                L.p(layoutDirection0, "<anonymous parameter 1>");
                return IntOffsetKt.a(0, this.e.a(0, ((int)(v & 0xFFFFFFFFL))));
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return IntOffset.b(this.a(((IntSize)object0).q(), ((LayoutDirection)object1)));
            }
        };
        androidx.compose.foundation.layout.SizeKt.createWrapContentHeightModifier.2 sizeKt$createWrapContentHeightModifier$20 = new Function1(alignment$Vertical0, z) {
            final Vertical e;
            final boolean f;

            {
                this.e = alignment$Vertical0;
                this.f = z;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$$receiver");
                inspectorInfo0.d("wrapContentHeight");
                inspectorInfo0.b().c("align", this.e);
                inspectorInfo0.b().c("unbounded", Boolean.valueOf(this.f));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        };
        return new WrapContentModifier(Direction.a, z, sizeKt$createWrapContentHeightModifier$10, alignment$Vertical0, sizeKt$createWrapContentHeightModifier$20);
    }

    private static final WrapContentModifier e(Alignment alignment0, boolean z) {
        androidx.compose.foundation.layout.SizeKt.createWrapContentSizeModifier.1 sizeKt$createWrapContentSizeModifier$10 = new o(alignment0) {
            final Alignment e;

            {
                this.e = alignment0;
                super(2);
            }

            public final long a(long v, @l LayoutDirection layoutDirection0) {
                L.p(layoutDirection0, "layoutDirection");
                return this.e.a(0L, v, layoutDirection0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return IntOffset.b(this.a(((IntSize)object0).q(), ((LayoutDirection)object1)));
            }
        };
        androidx.compose.foundation.layout.SizeKt.createWrapContentSizeModifier.2 sizeKt$createWrapContentSizeModifier$20 = new Function1(alignment0, z) {
            final Alignment e;
            final boolean f;

            {
                this.e = alignment0;
                this.f = z;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$$receiver");
                inspectorInfo0.d("wrapContentSize");
                inspectorInfo0.b().c("align", this.e);
                inspectorInfo0.b().c("unbounded", Boolean.valueOf(this.f));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        };
        return new WrapContentModifier(Direction.c, z, sizeKt$createWrapContentSizeModifier$10, alignment0, sizeKt$createWrapContentSizeModifier$20);
    }

    private static final WrapContentModifier f(Horizontal alignment$Horizontal0, boolean z) {
        androidx.compose.foundation.layout.SizeKt.createWrapContentWidthModifier.1 sizeKt$createWrapContentWidthModifier$10 = new o(alignment$Horizontal0) {
            final Horizontal e;

            {
                this.e = alignment$Horizontal0;
                super(2);
            }

            public final long a(long v, @l LayoutDirection layoutDirection0) {
                L.p(layoutDirection0, "layoutDirection");
                return IntOffsetKt.a(this.e.a(0, ((int)(v >> 0x20)), layoutDirection0), 0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return IntOffset.b(this.a(((IntSize)object0).q(), ((LayoutDirection)object1)));
            }
        };
        androidx.compose.foundation.layout.SizeKt.createWrapContentWidthModifier.2 sizeKt$createWrapContentWidthModifier$20 = new Function1(alignment$Horizontal0, z) {
            final Horizontal e;
            final boolean f;

            {
                this.e = alignment$Horizontal0;
                this.f = z;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$$receiver");
                inspectorInfo0.d("wrapContentWidth");
                inspectorInfo0.b().c("align", this.e);
                inspectorInfo0.b().c("unbounded", Boolean.valueOf(this.f));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        };
        return new WrapContentModifier(Direction.b, z, sizeKt$createWrapContentWidthModifier$10, alignment$Horizontal0, sizeKt$createWrapContentWidthModifier$20);
    }

    @Stable
    @l
    public static final Modifier g(@l Modifier modifier0, float f, float f1) {
        L.p(modifier0, "$this$defaultMinSize");
        return modifier0.r0(new UnspecifiedConstraintsModifier(f, f1, InspectableValueKt.b(), null));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,170:1\n620#2,4:171\n*E\n"})
        public final class androidx.compose.foundation.layout.SizeKt.defaultMinSize-VpY3zN4..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final float e;
            final float f;

            public androidx.compose.foundation.layout.SizeKt.defaultMinSize-VpY3zN4..inlined.debugInspectorInfo.1(float f, float f1) {
                this.e = f;
                this.f = f1;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("defaultMinSize");
                inspectorInfo0.b().c("minWidth", Dp.d(this.e));
                inspectorInfo0.b().c("minHeight", Dp.d(this.f));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    public static Modifier h(Modifier modifier0, float f, float f1, int v, Object object0) {
        if((v & 1) != 0) {
            f = NaNf;
        }
        if((v & 2) != 0) {
            f1 = NaNf;
        }
        return SizeKt.g(modifier0, f, f1);
    }

    @Stable
    @l
    public static final Modifier i(@l Modifier modifier0, float f) {
        L.p(modifier0, "<this>");
        return f == 1.0f ? modifier0.r0(SizeKt.b) : modifier0.r0(SizeKt.a(f));
    }

    public static Modifier j(Modifier modifier0, float f, int v, Object object0) {
        if((v & 1) != 0) {
            f = 1.0f;
        }
        return SizeKt.i(modifier0, f);
    }

    @Stable
    @l
    public static final Modifier k(@l Modifier modifier0, float f) {
        L.p(modifier0, "<this>");
        return f == 1.0f ? modifier0.r0(SizeKt.c) : modifier0.r0(SizeKt.b(f));
    }

    public static Modifier l(Modifier modifier0, float f, int v, Object object0) {
        if((v & 1) != 0) {
            f = 1.0f;
        }
        return SizeKt.k(modifier0, f);
    }

    @Stable
    @l
    public static final Modifier m(@l Modifier modifier0, float f) {
        L.p(modifier0, "<this>");
        return f == 1.0f ? modifier0.r0(SizeKt.a) : modifier0.r0(SizeKt.c(f));
    }

    public static Modifier n(Modifier modifier0, float f, int v, Object object0) {
        if((v & 1) != 0) {
            f = 1.0f;
        }
        return SizeKt.m(modifier0, f);
    }

    @Stable
    @l
    public static final Modifier o(@l Modifier modifier0, float f) {
        L.p(modifier0, "$this$height");
        return modifier0.r0(new SizeModifier(0.0f, f, 0.0f, f, true, InspectableValueKt.b(), 5, null));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,170:1\n86#2,3:171\n*E\n"})
        public final class androidx.compose.foundation.layout.SizeKt.height-3ABfNKs..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final float e;

            public androidx.compose.foundation.layout.SizeKt.height-3ABfNKs..inlined.debugInspectorInfo.1(float f) {
                this.e = f;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("height");
                inspectorInfo0.e(Dp.d(this.e));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    @Stable
    @l
    public static final Modifier p(@l Modifier modifier0, float f, float f1) {
        L.p(modifier0, "$this$heightIn");
        return modifier0.r0(new SizeModifier(0.0f, f, 0.0f, f1, true, InspectableValueKt.b(), 5, null));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,170:1\n200#2,4:171\n*E\n"})
        public final class androidx.compose.foundation.layout.SizeKt.heightIn-VpY3zN4..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final float e;
            final float f;

            public androidx.compose.foundation.layout.SizeKt.heightIn-VpY3zN4..inlined.debugInspectorInfo.1(float f, float f1) {
                this.e = f;
                this.f = f1;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("heightIn");
                inspectorInfo0.b().c("min", Dp.d(this.e));
                inspectorInfo0.b().c("max", Dp.d(this.f));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    public static Modifier q(Modifier modifier0, float f, float f1, int v, Object object0) {
        if((v & 1) != 0) {
            f = NaNf;
        }
        if((v & 2) != 0) {
            f1 = NaNf;
        }
        return SizeKt.p(modifier0, f, f1);
    }

    @Stable
    @l
    public static final Modifier r(@l Modifier modifier0, float f) {
        L.p(modifier0, "$this$requiredHeight");
        return modifier0.r0(new SizeModifier(0.0f, f, 0.0f, f, false, InspectableValueKt.b(), 5, null));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,170:1\n286#2,3:171\n*E\n"})
        public final class androidx.compose.foundation.layout.SizeKt.requiredHeight-3ABfNKs..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final float e;

            public androidx.compose.foundation.layout.SizeKt.requiredHeight-3ABfNKs..inlined.debugInspectorInfo.1(float f) {
                this.e = f;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("requiredHeight");
                inspectorInfo0.e(Dp.d(this.e));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    @Stable
    @l
    public static final Modifier s(@l Modifier modifier0, float f, float f1) {
        L.p(modifier0, "$this$requiredHeightIn");
        return modifier0.r0(new SizeModifier(0.0f, f, 0.0f, f1, false, InspectableValueKt.b(), 5, null));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,170:1\n406#2,4:171\n*E\n"})
        public final class androidx.compose.foundation.layout.SizeKt.requiredHeightIn-VpY3zN4..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final float e;
            final float f;

            public androidx.compose.foundation.layout.SizeKt.requiredHeightIn-VpY3zN4..inlined.debugInspectorInfo.1(float f, float f1) {
                this.e = f;
                this.f = f1;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("requiredHeightIn");
                inspectorInfo0.b().c("min", Dp.d(this.e));
                inspectorInfo0.b().c("max", Dp.d(this.f));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    public static Modifier t(Modifier modifier0, float f, float f1, int v, Object object0) {
        if((v & 1) != 0) {
            f = NaNf;
        }
        if((v & 2) != 0) {
            f1 = NaNf;
        }
        return SizeKt.s(modifier0, f, f1);
    }

    @Stable
    @l
    public static final Modifier u(@l Modifier modifier0, float f) {
        L.p(modifier0, "$this$requiredSize");
        return modifier0.r0(new SizeModifier(f, f, f, f, false, InspectableValueKt.b(), null));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,170:1\n316#2,3:171\n*E\n"})
        public final class androidx.compose.foundation.layout.SizeKt.requiredSize-3ABfNKs..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final float e;

            public androidx.compose.foundation.layout.SizeKt.requiredSize-3ABfNKs..inlined.debugInspectorInfo.1(float f) {
                this.e = f;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("requiredSize");
                inspectorInfo0.e(Dp.d(this.e));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    @Stable
    @l
    public static final Modifier v(@l Modifier modifier0, long v) {
        L.p(modifier0, "$this$requiredSize");
        return SizeKt.w(modifier0, DpSize.p(v), DpSize.m(v));
    }

    @Stable
    @l
    public static final Modifier w(@l Modifier modifier0, float f, float f1) {
        L.p(modifier0, "$this$requiredSize");
        return modifier0.r0(new SizeModifier(f, f1, f, f1, false, InspectableValueKt.b(), null));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,170:1\n343#2,4:171\n*E\n"})
        public final class androidx.compose.foundation.layout.SizeKt.requiredSize-VpY3zN4..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final float e;
            final float f;

            public androidx.compose.foundation.layout.SizeKt.requiredSize-VpY3zN4..inlined.debugInspectorInfo.1(float f, float f1) {
                this.e = f;
                this.f = f1;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("requiredSize");
                inspectorInfo0.b().c("width", Dp.d(this.e));
                inspectorInfo0.b().c("height", Dp.d(this.f));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    @Stable
    @l
    public static final Modifier x(@l Modifier modifier0, float f, float f1, float f2, float f3) {
        L.p(modifier0, "$this$requiredSizeIn");
        return modifier0.r0(new SizeModifier(f, f1, f2, f3, false, InspectableValueKt.b(), null));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,170:1\n435#2,6:171\n*E\n"})
        public final class androidx.compose.foundation.layout.SizeKt.requiredSizeIn-qDBjuR0..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final float e;
            final float f;
            final float g;
            final float h;

            public androidx.compose.foundation.layout.SizeKt.requiredSizeIn-qDBjuR0..inlined.debugInspectorInfo.1(float f, float f1, float f2, float f3) {
                this.e = f;
                this.f = f1;
                this.g = f2;
                this.h = f3;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("requiredSizeIn");
                inspectorInfo0.b().c("minWidth", Dp.d(this.e));
                inspectorInfo0.b().c("minHeight", Dp.d(this.f));
                inspectorInfo0.b().c("maxWidth", Dp.d(this.g));
                inspectorInfo0.b().c("maxHeight", Dp.d(this.h));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    public static Modifier y(Modifier modifier0, float f, float f1, float f2, float f3, int v, Object object0) {
        if((v & 1) != 0) {
            f = NaNf;
        }
        if((v & 2) != 0) {
            f1 = NaNf;
        }
        if((v & 4) != 0) {
            f2 = NaNf;
        }
        if((v & 8) != 0) {
            f3 = NaNf;
        }
        return SizeKt.x(modifier0, f, f1, f2, f3);
    }

    @Stable
    @l
    public static final Modifier z(@l Modifier modifier0, float f) {
        L.p(modifier0, "$this$requiredWidth");
        return modifier0.r0(new SizeModifier(f, 0.0f, f, 0.0f, false, InspectableValueKt.b(), 10, null));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,170:1\n258#2,3:171\n*E\n"})
        public final class androidx.compose.foundation.layout.SizeKt.requiredWidth-3ABfNKs..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final float e;

            public androidx.compose.foundation.layout.SizeKt.requiredWidth-3ABfNKs..inlined.debugInspectorInfo.1(float f) {
                this.e = f;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("requiredWidth");
                inspectorInfo0.e(Dp.d(this.e));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }
}

