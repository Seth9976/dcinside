package androidx.compose.foundation.selection;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;

public final class SelectableGroupKt {
    @l
    public static final Modifier a(@l Modifier modifier0) {
        L.p(modifier0, "<this>");
        return SemanticsModifierKt.c(modifier0, false, androidx.compose.foundation.selection.SelectableGroupKt.selectableGroup.1.e, 1, null);

        final class androidx.compose.foundation.selection.SelectableGroupKt.selectableGroup.1 extends N implements Function1 {
            public static final androidx.compose.foundation.selection.SelectableGroupKt.selectableGroup.1 e;

            static {
                androidx.compose.foundation.selection.SelectableGroupKt.selectableGroup.1.e = new androidx.compose.foundation.selection.SelectableGroupKt.selectableGroup.1();
            }

            androidx.compose.foundation.selection.SelectableGroupKt.selectableGroup.1() {
                super(1);
            }

            public final void a(@l SemanticsPropertyReceiver semanticsPropertyReceiver0) {
                L.p(semanticsPropertyReceiver0, "$this$semantics");
                SemanticsPropertiesKt.C0(semanticsPropertyReceiver0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((SemanticsPropertyReceiver)object0));
                return S0.a;
            }
        }

    }
}

