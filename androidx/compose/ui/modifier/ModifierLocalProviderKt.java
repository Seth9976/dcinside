package androidx.compose.ui.modifier;

import A3.a;
import A3.o;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.b;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nModifierLocalProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalProvider.kt\nandroidx/compose/ui/modifier/ModifierLocalProviderKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,69:1\n135#2:70\n*S KotlinDebug\n*F\n+ 1 ModifierLocalProvider.kt\nandroidx/compose/ui/modifier/ModifierLocalProviderKt\n*L\n59#1:70\n*E\n"})
public final class ModifierLocalProviderKt {
    @ExperimentalComposeUiApi
    @l
    public static final Modifier a(@l Modifier modifier0, @l ProvidableModifierLocal providableModifierLocal0, @l a a0) {
        L.p(modifier0, "<this>");
        L.p(providableModifierLocal0, "key");
        L.p(a0, "value");
        return modifier0.r0(new ModifierLocalProvider(InspectableValueKt.b()) {
            @l
            private final ProvidableModifierLocal d;
            @l
            private final State e;

            {
                ProvidableModifierLocal providableModifierLocal0 = providableModifierLocal0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                a a0 = a0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                Function1 function10 = InspectableValueKt.b();  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.d = providableModifierLocal0;
                this.e = SnapshotStateKt.c(a0);
            }

            @Override  // androidx.compose.ui.Modifier$Element
            public boolean H(Function1 function10) {
                return b.b(this, function10);
            }

            @Override  // androidx.compose.ui.Modifier$Element
            public Object P(Object object0, o o0) {
                return b.c(this, object0, o0);
            }

            @Override  // androidx.compose.ui.Modifier$Element
            public Object U(Object object0, o o0) {
                return b.d(this, object0, o0);
            }

            @Override  // androidx.compose.ui.modifier.ModifierLocalProvider
            @l
            public ProvidableModifierLocal getKey() {
                return this.d;
            }

            @Override  // androidx.compose.ui.modifier.ModifierLocalProvider
            public Object getValue() {
                return this.e.getValue();
            }

            @Override  // androidx.compose.ui.Modifier
            public Modifier r0(Modifier modifier0) {
                return androidx.compose.ui.a.a(this, modifier0);
            }

            @Override  // androidx.compose.ui.Modifier$Element
            public boolean u(Function1 function10) {
                return b.a(this, function10);
            }
        });

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 ModifierLocalProvider.kt\nandroidx/compose/ui/modifier/ModifierLocalProviderKt\n*L\n1#1,170:1\n60#2,4:171\n*E\n"})
        public final class androidx.compose.ui.modifier.ModifierLocalProviderKt.modifierLocalProvider..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final ProvidableModifierLocal e;
            final a f;

            public androidx.compose.ui.modifier.ModifierLocalProviderKt.modifierLocalProvider..inlined.debugInspectorInfo.1(ProvidableModifierLocal providableModifierLocal0, a a0) {
                this.e = providableModifierLocal0;
                this.f = a0;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("modifierLocalProvider");
                inspectorInfo0.b().c("key", this.e);
                inspectorInfo0.b().c("value", this.f);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }
}

