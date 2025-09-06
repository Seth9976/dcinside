package androidx.compose.ui.autofill;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
@ExperimentalComposeUiApi
public final class AutofillTree {
    @l
    private final Map a;
    public static final int b = 8;

    static {
    }

    public AutofillTree() {
        this.a = new LinkedHashMap();
    }

    @l
    public final Map a() {
        return this.a;
    }

    @m
    public final S0 b(int v, @l String s) {
        L.p(s, "value");
        AutofillNode autofillNode0 = (AutofillNode)this.a.get(v);
        if(autofillNode0 != null) {
            Function1 function10 = autofillNode0.f();
            if(function10 != null) {
                function10.invoke(s);
                return S0.a;
            }
        }
        return null;
    }

    public final void c(@l AutofillNode autofillNode0) {
        L.p(autofillNode0, "autofillNode");
        this.a.put(autofillNode0.e(), autofillNode0);
    }
}

