package Y1;

import com.google.firebase.crashlytics.j;
import kotlin.c0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.k;
import y4.l;

public final class b {
    @l
    public static final j a(@l n2.b b0) {
        L.p(b0, "<this>");
        j j0 = j.e();
        L.o(j0, "getInstance()");
        return j0;
    }

    @k(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.", replaceWith = @c0(expression = "", imports = {}))
    public static final void b(@l j j0, @l Function1 function10) {
        L.p(j0, "<this>");
        L.p(function10, "init");
        function10.invoke(new c(j0));
    }
}

