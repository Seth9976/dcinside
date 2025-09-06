package androidx.compose.ui.draw;

import A3.p;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nDrawModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawModifier.kt\nandroidx/compose/ui/draw/DrawModifierKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,276:1\n135#2:277\n*S KotlinDebug\n*F\n+ 1 DrawModifier.kt\nandroidx/compose/ui/draw/DrawModifierKt\n*L\n137#1:277\n*E\n"})
public final class DrawModifierKt {
    @l
    public static final Modifier a(@l Modifier modifier0, @l Function1 function10) {
        L.p(modifier0, "<this>");
        L.p(function10, "onDraw");
        return modifier0.r0(new DrawBehindElement(function10));
    }

    @l
    public static final Modifier b(@l Modifier modifier0, @l Function1 function10) {
        L.p(modifier0, "<this>");
        L.p(function10, "onBuildDrawCache");
        return ComposedModifierKt.e(modifier0, InspectableValueKt.b(), new p(function10) {
            final Function1 e;

            {
                this.e = function10;
                super(3);
            }

            @Composable
            @l
            public final Modifier a(@l Modifier modifier0, @m Composer composer0, int v) {
                L.p(modifier0, "$this$composed");
                composer0.V(0x9B4B3905);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0x9B4B3905, v, -1, "androidx.compose.ui.draw.drawWithCache.<anonymous> (DrawModifier.kt:140)");
                }
                composer0.V(0xE2A708A4);
                CacheDrawScope cacheDrawScope0 = composer0.W();
                if(cacheDrawScope0 == Composer.a.a()) {
                    cacheDrawScope0 = new CacheDrawScope();
                    composer0.O(cacheDrawScope0);
                }
                composer0.g0();
                Modifier modifier1 = modifier0.r0(new DrawContentCacheModifier(cacheDrawScope0, this.e));
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                composer0.g0();
                return modifier1;
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        });

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 DrawModifier.kt\nandroidx/compose/ui/draw/DrawModifierKt\n*L\n1#1,170:1\n138#2,3:171\n*E\n"})
        public final class androidx.compose.ui.draw.DrawModifierKt.drawWithCache..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final Function1 e;

            public androidx.compose.ui.draw.DrawModifierKt.drawWithCache..inlined.debugInspectorInfo.1(Function1 function10) {
                this.e = function10;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("drawWithCache");
                inspectorInfo0.b().c("onBuildDrawCache", this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    @l
    public static final Modifier c(@l Modifier modifier0, @l Function1 function10) {
        L.p(modifier0, "<this>");
        L.p(function10, "onDraw");
        return modifier0.r0(new DrawWithContentElement(function10));
    }
}

