package androidx.lifecycle;

import kotlin.jvm.internal.L;
import kotlinx.coroutines.O;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.j1;
import y4.l;

public final class ViewModelKt {
    @l
    private static final String a = "androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY";

    @l
    public static final O a(@l ViewModel viewModel0) {
        L.p(viewModel0, "<this>");
        O o0 = (O)viewModel0.getTag("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
        if(o0 != null) {
            return o0;
        }
        Object object0 = viewModel0.setTagIfAbsent("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY", new CloseableCoroutineScope(j1.c(null, 1, null).plus(h0.e().u1())));
        L.o(object0, "setTagIfAbsent(\n        …Main.immediate)\n        )");
        return (O)object0;
    }
}

