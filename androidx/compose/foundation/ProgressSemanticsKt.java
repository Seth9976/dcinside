package androidx.compose.foundation;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.ranges.f;
import kotlin.ranges.s;
import y4.l;

public final class ProgressSemanticsKt {
    @Stable
    @l
    public static final Modifier a(@l Modifier modifier0) {
        L.p(modifier0, "<this>");
        return SemanticsModifierKt.b(modifier0, true, androidx.compose.foundation.ProgressSemanticsKt.progressSemantics.2.e);

        final class androidx.compose.foundation.ProgressSemanticsKt.progressSemantics.2 extends N implements Function1 {
            public static final androidx.compose.foundation.ProgressSemanticsKt.progressSemantics.2 e;

            static {
                androidx.compose.foundation.ProgressSemanticsKt.progressSemantics.2.e = new androidx.compose.foundation.ProgressSemanticsKt.progressSemantics.2();
            }

            androidx.compose.foundation.ProgressSemanticsKt.progressSemantics.2() {
                super(1);
            }

            public final void a(@l SemanticsPropertyReceiver semanticsPropertyReceiver0) {
                L.p(semanticsPropertyReceiver0, "$this$semantics");
                SemanticsPropertiesKt.Q0(semanticsPropertyReceiver0, ProgressBarRangeInfo.d.a());
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((SemanticsPropertyReceiver)object0));
                return S0.a;
            }
        }

    }

    @Stable
    @l
    public static final Modifier b(@l Modifier modifier0, float f, @l f f1, int v) {
        L.p(modifier0, "<this>");
        L.p(f1, "valueRange");
        return SemanticsModifierKt.b(modifier0, true, new Function1(f, f1, v) {
            final float e;
            final f f;
            final int g;

            {
                this.e = f;
                this.f = f1;
                this.g = v;
                super(1);
            }

            public final void a(@l SemanticsPropertyReceiver semanticsPropertyReceiver0) {
                L.p(semanticsPropertyReceiver0, "$this$semantics");
                SemanticsPropertiesKt.Q0(semanticsPropertyReceiver0, new ProgressBarRangeInfo(((Number)s.N(this.e, this.f)).floatValue(), this.f, this.g));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((SemanticsPropertyReceiver)object0));
                return S0.a;
            }
        });
    }

    public static Modifier c(Modifier modifier0, float f, f f1, int v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            f1 = s.e(0.0f, 1.0f);
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        return ProgressSemanticsKt.b(modifier0, f, f1, v);
    }
}

