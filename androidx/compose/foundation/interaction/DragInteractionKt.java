package androidx.compose.foundation.interaction;

import A3.o;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import java.util.ArrayList;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import y4.l;
import y4.m;

@s0({"SMAP\nDragInteraction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragInteraction.kt\nandroidx/compose/foundation/interaction/DragInteractionKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,95:1\n25#2:96\n50#2:103\n49#2:104\n1114#3,6:97\n1114#3,6:105\n*S KotlinDebug\n*F\n+ 1 DragInteraction.kt\nandroidx/compose/foundation/interaction/DragInteractionKt\n*L\n81#1:96\n82#1:103\n82#1:104\n81#1:97,6\n82#1:105,6\n*E\n"})
public final class DragInteractionKt {
    @Composable
    @l
    public static final State a(@l InteractionSource interactionSource0, @m Composer composer0, int v) {
        L.p(interactionSource0, "<this>");
        composer0.V(0x6095CA1);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x6095CA1, v, -1, "androidx.compose.foundation.interaction.collectIsDraggedAsState (DragInteraction.kt:79)");
        }
        composer0.V(0xE2A708A4);
        MutableState mutableState0 = composer0.W();
        Companion composer$Companion0 = Composer.a;
        if(mutableState0 == composer$Companion0.a()) {
            mutableState0 = SnapshotStateKt__SnapshotStateKt.g(Boolean.FALSE, null, 2, null);
            composer0.O(mutableState0);
        }
        composer0.g0();
        composer0.V(0x1E7B2B64);
        boolean z = composer0.t(interactionSource0);
        boolean z1 = composer0.t(mutableState0);
        androidx.compose.foundation.interaction.DragInteractionKt.collectIsDraggedAsState.1.1 dragInteractionKt$collectIsDraggedAsState$1$10 = composer0.W();
        if(z || z1 || dragInteractionKt$collectIsDraggedAsState$1$10 == composer$Companion0.a()) {
            dragInteractionKt$collectIsDraggedAsState$1$10 = new o(interactionSource0, mutableState0, null) {
                int k;
                final InteractionSource l;
                final MutableState m;

                {
                    this.l = interactionSource0;
                    this.m = mutableState0;
                    super(2, d0);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @l
                public final d create(@m Object object0, @l d d0) {
                    return new androidx.compose.foundation.interaction.DragInteractionKt.collectIsDraggedAsState.1.1(this.l, this.m, d0);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.invoke(((O)object0), ((d)object1));
                }

                @m
                public final Object invoke(@l O o0, @m d d0) {
                    return ((androidx.compose.foundation.interaction.DragInteractionKt.collectIsDraggedAsState.1.1)this.create(o0, d0)).invokeSuspend(S0.a);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    Object object1 = b.l();
                    switch(this.k) {
                        case 0: {
                            f0.n(object0);
                            ArrayList arrayList0 = new ArrayList();
                            i i0 = this.l.c();
                            androidx.compose.foundation.interaction.DragInteractionKt.collectIsDraggedAsState.1.1.1 dragInteractionKt$collectIsDraggedAsState$1$1$10 = new j() {
                                @m
                                public final Object a(@l Interaction interaction0, @l d d0) {
                                    if(interaction0 instanceof Start) {
                                        this.m.add(interaction0);
                                    }
                                    else if(interaction0 instanceof Stop) {
                                        Start dragInteraction$Start0 = ((Stop)interaction0).a();
                                        this.m.remove(dragInteraction$Start0);
                                    }
                                    else if(interaction0 instanceof Cancel) {
                                        Start dragInteraction$Start1 = ((Cancel)interaction0).a();
                                        this.m.remove(dragInteraction$Start1);
                                    }
                                    this.b.setValue(kotlin.coroutines.jvm.internal.b.a(!this.m.isEmpty()));
                                    return S0.a;
                                }

                                @Override  // kotlinx.coroutines.flow.j
                                public Object emit(Object object0, d d0) {
                                    return this.a(((Interaction)object0), d0);
                                }
                            };
                            this.k = 1;
                            return i0.collect(dragInteractionKt$collectIsDraggedAsState$1$1$10, this) == object1 ? object1 : S0.a;
                        }
                        case 1: {
                            f0.n(object0);
                            return S0.a;
                        }
                        default: {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                    }
                }
            };
            composer0.O(dragInteractionKt$collectIsDraggedAsState$1$10);
        }
        composer0.g0();
        EffectsKt.g(interactionSource0, dragInteractionKt$collectIsDraggedAsState$1$10, composer0, v & 14 | 0x40);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return mutableState0;
    }
}

