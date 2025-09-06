package androidx.compose.ui.layout;

import A3.a;
import A3.o;
import A3.p;
import A3.q;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nLookaheadLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadLayout.kt\nandroidx/compose/ui/layout/LookaheadLayoutScopeImpl\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,200:1\n135#2:201\n135#2:202\n*S KotlinDebug\n*F\n+ 1 LookaheadLayout.kt\nandroidx/compose/ui/layout/LookaheadLayoutScopeImpl\n*L\n173#1:201\n194#1:202\n*E\n"})
final class LookaheadLayoutScopeImpl implements LookaheadLayoutScope {
    @m
    private NodeCoordinator a;

    @Override  // androidx.compose.ui.layout.LookaheadLayoutScope
    @l
    public Modifier a(@l Modifier modifier0, @l q q0) {
        L.p(modifier0, "<this>");
        L.p(q0, "measure");
        return modifier0.r0(new LookaheadIntermediateLayoutModifierImpl(q0, InspectableValueKt.b()));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 LookaheadLayout.kt\nandroidx/compose/ui/layout/LookaheadLayoutScopeImpl\n*L\n1#1,170:1\n195#2,3:171\n*E\n"})
        public final class androidx.compose.ui.layout.LookaheadLayoutScopeImpl.intermediateLayout..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final q e;

            public androidx.compose.ui.layout.LookaheadLayoutScopeImpl.intermediateLayout..inlined.debugInspectorInfo.1(q q0) {
                this.e = q0;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("intermediateLayout");
                inspectorInfo0.b().c("measure", this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    @Override  // androidx.compose.ui.layout.LookaheadLayoutScope
    @l
    public Modifier b(@l Modifier modifier0, @l o o0) {
        L.p(modifier0, "<this>");
        L.p(o0, "onPlaced");
        return ComposedModifierKt.e(modifier0, InspectableValueKt.b(), new p(this) {
            final o e;
            final LookaheadLayoutScopeImpl f;

            {
                this.e = o0;
                this.f = lookaheadLayoutScopeImpl0;
                super(3);
            }

            @Composable
            @l
            public final Modifier a(@l Modifier modifier0, @m Composer composer0, int v) {
                L.p(modifier0, "$this$composed");
                composer0.V(0xCF79EA85);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0xCF79EA85, v, -1, "androidx.compose.ui.layout.LookaheadLayoutScopeImpl.onPlaced.<anonymous> (LookaheadLayout.kt:176)");
                }
                o o0 = this.e;
                LookaheadLayoutScopeImpl lookaheadLayoutScopeImpl0 = this.f;
                composer0.V(0xE2A708A4);
                LookaheadOnPlacedModifier lookaheadOnPlacedModifier0 = composer0.W();
                if(lookaheadOnPlacedModifier0 == Composer.a.a()) {
                    lookaheadOnPlacedModifier0 = new LookaheadOnPlacedModifier(o0, new a() {
                        final LookaheadLayoutScopeImpl e;

                        {
                            this.e = lookaheadLayoutScopeImpl0;
                            super(0);
                        }

                        @l
                        public final LookaheadLayoutCoordinates b() {
                            NodeCoordinator nodeCoordinator0 = this.e.c();
                            if(nodeCoordinator0 != null) {
                                LookaheadDelegate lookaheadDelegate0 = nodeCoordinator0.I2();
                                L.m(lookaheadDelegate0);
                                LookaheadLayoutCoordinates lookaheadLayoutCoordinates0 = lookaheadDelegate0.l2();
                                if(lookaheadLayoutCoordinates0 != null) {
                                    return lookaheadLayoutCoordinates0;
                                }
                            }
                            throw new IllegalStateException("Lookahead root has not been set up yet");
                        }

                        @Override  // A3.a
                        public Object invoke() {
                            return this.b();
                        }
                    });
                    composer0.O(lookaheadOnPlacedModifier0);
                }
                composer0.g0();
                Modifier modifier1 = modifier0.r0(lookaheadOnPlacedModifier0);
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

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 LookaheadLayout.kt\nandroidx/compose/ui/layout/LookaheadLayoutScopeImpl\n*L\n1#1,170:1\n174#2,3:171\n*E\n"})
        public final class androidx.compose.ui.layout.LookaheadLayoutScopeImpl.onPlaced..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final o e;

            public androidx.compose.ui.layout.LookaheadLayoutScopeImpl.onPlaced..inlined.debugInspectorInfo.1(o o0) {
                this.e = o0;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("onPlaced");
                inspectorInfo0.b().c("onPlaced", this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    @m
    public final NodeCoordinator c() {
        return this.a;
    }

    public final void d(@m NodeCoordinator nodeCoordinator0) {
        this.a = nodeCoordinator0;
    }
}

