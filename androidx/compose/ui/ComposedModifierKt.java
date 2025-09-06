package androidx.compose.ui;

import A3.o;
import A3.p;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.v0;
import y4.l;
import y4.m;

public final class ComposedModifierKt {
    @ExperimentalComposeUiApi
    @l
    public static final Modifier a(@l Modifier modifier0, @l String s, @m Object object0, @m Object object1, @m Object object2, @l Function1 function10, @l p p0) {
        L.p(modifier0, "<this>");
        L.p(s, "fullyQualifiedName");
        L.p(function10, "inspectorInfo");
        L.p(p0, "factory");
        return modifier0.r0(new KeyedComposedModifier3(s, object0, object1, object2, function10, p0));
    }

    @ExperimentalComposeUiApi
    @l
    public static final Modifier b(@l Modifier modifier0, @l String s, @m Object object0, @m Object object1, @l Function1 function10, @l p p0) {
        L.p(modifier0, "<this>");
        L.p(s, "fullyQualifiedName");
        L.p(function10, "inspectorInfo");
        L.p(p0, "factory");
        return modifier0.r0(new KeyedComposedModifier2(s, object0, object1, function10, p0));
    }

    @ExperimentalComposeUiApi
    @l
    public static final Modifier c(@l Modifier modifier0, @l String s, @m Object object0, @l Function1 function10, @l p p0) {
        L.p(modifier0, "<this>");
        L.p(s, "fullyQualifiedName");
        L.p(function10, "inspectorInfo");
        L.p(p0, "factory");
        return modifier0.r0(new KeyedComposedModifier1(s, object0, function10, p0));
    }

    @ExperimentalComposeUiApi
    @l
    public static final Modifier d(@l Modifier modifier0, @l String s, @l Object[] arr_object, @l Function1 function10, @l p p0) {
        L.p(modifier0, "<this>");
        L.p(s, "fullyQualifiedName");
        L.p(arr_object, "keys");
        L.p(function10, "inspectorInfo");
        L.p(p0, "factory");
        return modifier0.r0(new KeyedComposedModifierN(s, arr_object, function10, p0));
    }

    @l
    public static final Modifier e(@l Modifier modifier0, @l Function1 function10, @l p p0) {
        L.p(modifier0, "<this>");
        L.p(function10, "inspectorInfo");
        L.p(p0, "factory");
        return modifier0.r0(new ComposedModifier(function10, p0));
    }

    public static Modifier f(Modifier modifier0, String s, Object object0, Object object1, Object object2, Function1 function10, p p0, int v, Object object3) {
        if((v & 16) != 0) {
            function10 = InspectableValueKt.b();
        }
        return ComposedModifierKt.a(modifier0, s, object0, object1, object2, function10, p0);
    }

    public static Modifier g(Modifier modifier0, String s, Object object0, Object object1, Function1 function10, p p0, int v, Object object2) {
        if((v & 8) != 0) {
            function10 = InspectableValueKt.b();
        }
        return ComposedModifierKt.b(modifier0, s, object0, object1, function10, p0);
    }

    public static Modifier h(Modifier modifier0, String s, Object object0, Function1 function10, p p0, int v, Object object1) {
        if((v & 4) != 0) {
            function10 = InspectableValueKt.b();
        }
        return ComposedModifierKt.c(modifier0, s, object0, function10, p0);
    }

    public static Modifier i(Modifier modifier0, String s, Object[] arr_object, Function1 function10, p p0, int v, Object object0) {
        if((v & 4) != 0) {
            function10 = InspectableValueKt.b();
        }
        return ComposedModifierKt.d(modifier0, s, arr_object, function10, p0);
    }

    public static Modifier j(Modifier modifier0, Function1 function10, p p0, int v, Object object0) {
        if((v & 1) != 0) {
            function10 = InspectableValueKt.b();
        }
        return ComposedModifierKt.e(modifier0, function10, p0);
    }

    @l
    public static final Modifier k(@l Composer composer0, @l Modifier modifier0) {
        L.p(composer0, "<this>");
        L.p(modifier0, "modifier");
        if(modifier0.u(androidx.compose.ui.ComposedModifierKt.materialize.1.e)) {
            return modifier0;
        }
        composer0.V(1219399079);
        androidx.compose.ui.ComposedModifierKt.materialize.result.1 composedModifierKt$materialize$result$10 = new o(composer0) {
            final Composer e;

            {
                this.e = composer0;
                super(2);
            }

            @l
            public final Modifier a(@l Modifier modifier0, @l Element modifier$Element0) {
                L.p(modifier0, "acc");
                L.p(modifier$Element0, "element");
                if(modifier$Element0 instanceof ComposedModifier) {
                    p p0 = ((ComposedModifier)modifier$Element0).j();
                    L.n(p0, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
                    Modifier modifier1 = (Modifier)((p)v0.q(p0, 3)).invoke(Modifier.m0, this.e, 0);
                    modifier$Element0 = ComposedModifierKt.k(this.e, modifier1);
                }
                return modifier0.r0(modifier$Element0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((Modifier)object0), ((Element)object1));
            }
        };
        Modifier modifier1 = (Modifier)modifier0.P(Modifier.m0, composedModifierKt$materialize$result$10);
        composer0.g0();
        return modifier1;

        final class androidx.compose.ui.ComposedModifierKt.materialize.1 extends N implements Function1 {
            public static final androidx.compose.ui.ComposedModifierKt.materialize.1 e;

            static {
                androidx.compose.ui.ComposedModifierKt.materialize.1.e = new androidx.compose.ui.ComposedModifierKt.materialize.1();
            }

            androidx.compose.ui.ComposedModifierKt.materialize.1() {
                super(1);
            }

            @l
            public final Boolean a(@l Element modifier$Element0) {
                L.p(modifier$Element0, "it");
                return Boolean.valueOf(!(modifier$Element0 instanceof ComposedModifier));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Element)object0));
            }
        }

    }
}

