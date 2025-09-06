package androidx.compose.ui.autofill;

import android.view.ViewStructure;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@RequiresApi(23)
public final class AutofillApi23Helper {
    @l
    public static final AutofillApi23Helper a;

    static {
        AutofillApi23Helper.a = new AutofillApi23Helper();
    }

    @DoNotInline
    @RequiresApi(23)
    public final int a(@l ViewStructure viewStructure0, int v) {
        L.p(viewStructure0, "structure");
        return viewStructure0.addChildCount(v);
    }

    @DoNotInline
    @RequiresApi(23)
    @m
    public final ViewStructure b(@l ViewStructure viewStructure0, int v) {
        L.p(viewStructure0, "structure");
        return viewStructure0.newChild(v);
    }

    @DoNotInline
    @RequiresApi(23)
    public final void c(@l ViewStructure viewStructure0, int v, int v1, int v2, int v3, int v4, int v5) {
        L.p(viewStructure0, "structure");
        viewStructure0.setDimens(v, v1, v2, v3, v4, v5);
    }

    @DoNotInline
    @RequiresApi(23)
    public final void d(@l ViewStructure viewStructure0, int v, @m String s, @m String s1, @m String s2) {
        L.p(viewStructure0, "structure");
        viewStructure0.setId(v, s, s1, s2);
    }
}

