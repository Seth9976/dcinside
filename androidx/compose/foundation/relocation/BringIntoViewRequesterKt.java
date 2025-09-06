package androidx.compose.foundation.relocation;

import A3.p;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
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

@s0({"SMAP\nBringIntoViewRequester.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewRequester.kt\nandroidx/compose/foundation/relocation/BringIntoViewRequesterKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,154:1\n135#2:155\n*S KotlinDebug\n*F\n+ 1 BringIntoViewRequester.kt\nandroidx/compose/foundation/relocation/BringIntoViewRequesterKt\n*L\n103#1:155\n*E\n"})
public final class BringIntoViewRequesterKt {
    @ExperimentalFoundationApi
    @l
    public static final BringIntoViewRequester a() {
        return new BringIntoViewRequesterImpl();
    }

    @ExperimentalFoundationApi
    @l
    public static final Modifier b(@l Modifier modifier0, @l BringIntoViewRequester bringIntoViewRequester0) {
        L.p(modifier0, "<this>");
        L.p(bringIntoViewRequester0, "bringIntoViewRequester");
        return ComposedModifierKt.e(modifier0, InspectableValueKt.b(), new p(bringIntoViewRequester0) {
            final BringIntoViewRequester e;

            {
                this.e = bringIntoViewRequester0;
                super(3);
            }

            @Composable
            @l
            public final Modifier a(@l Modifier modifier0, @m Composer composer0, int v) {
                L.p(modifier0, "$this$composed");
                composer0.V(0xC4D24017);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0xC4D24017, v, -1, "androidx.compose.foundation.relocation.bringIntoViewRequester.<anonymous> (BringIntoViewRequester.kt:105)");
                }
                BringIntoViewParent bringIntoViewParent0 = BringIntoViewResponder_androidKt.b(composer0, 0);
                composer0.V(0x44FAF204);
                boolean z = composer0.t(bringIntoViewParent0);
                BringIntoViewRequesterModifier bringIntoViewRequesterModifier0 = composer0.W();
                if(z || bringIntoViewRequesterModifier0 == Composer.a.a()) {
                    bringIntoViewRequesterModifier0 = new BringIntoViewRequesterModifier(bringIntoViewParent0);
                    composer0.O(bringIntoViewRequesterModifier0);
                }
                composer0.g0();
                BringIntoViewRequester bringIntoViewRequester0 = this.e;
                if(bringIntoViewRequester0 instanceof BringIntoViewRequesterImpl) {
                    EffectsKt.c(bringIntoViewRequester0, new Function1(bringIntoViewRequesterModifier0) {
                        final BringIntoViewRequester e;
                        final BringIntoViewRequesterModifier f;

                        {
                            this.e = bringIntoViewRequester0;
                            this.f = bringIntoViewRequesterModifier0;
                            super(1);
                        }

                        @l
                        public final DisposableEffectResult a(@l DisposableEffectScope disposableEffectScope0) {
                            L.p(disposableEffectScope0, "$this$DisposableEffect");
                            ((BringIntoViewRequesterImpl)this.e).b().b(this.f);
                            return new DisposableEffectResult() {
                                @Override  // androidx.compose.runtime.DisposableEffectResult
                                public void dispose() {
                                    ((BringIntoViewRequesterImpl)this.f).b().a0(this.b);
                                }
                            };
                        }

                        @Override  // kotlin.jvm.functions.Function1
                        public Object invoke(Object object0) {
                            return this.a(((DisposableEffectScope)object0));
                        }
                    }, composer0, 0);
                }
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                composer0.g0();
                return bringIntoViewRequesterModifier0;
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        });

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 BringIntoViewRequester.kt\nandroidx/compose/foundation/relocation/BringIntoViewRequesterKt\n*L\n1#1,170:1\n104#2,3:171\n*E\n"})
        public final class androidx.compose.foundation.relocation.BringIntoViewRequesterKt.bringIntoViewRequester..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final BringIntoViewRequester e;

            public androidx.compose.foundation.relocation.BringIntoViewRequesterKt.bringIntoViewRequester..inlined.debugInspectorInfo.1(BringIntoViewRequester bringIntoViewRequester0) {
                this.e = bringIntoViewRequester0;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("bringIntoViewRequester");
                inspectorInfo0.b().c("bringIntoViewRequester", this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }
}

