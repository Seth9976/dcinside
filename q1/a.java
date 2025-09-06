package Q1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.k;
import n2.b;
import n2.c;
import y4.l;
import y4.m;

public final class a {
    @m
    private static volatile FirebaseAnalytics a;
    @l
    private static final Object b;

    static {
        a.b = new Object();
    }

    @Nullable
    public static final FirebaseAnalytics a() {
        return a.a;
    }

    @l
    public static final FirebaseAnalytics b(@NonNull b b0) {
        L.p(b0, "<this>");
        if(a.a == null) {
            synchronized(a.b) {
                if(a.a == null) {
                    a.a = FirebaseAnalytics.getInstance(c.c(b.a).n());
                }
            }
        }
        FirebaseAnalytics firebaseAnalytics0 = a.a;
        L.m(firebaseAnalytics0);
        return firebaseAnalytics0;
    }

    @l
    public static final Object c() {
        return a.b;
    }

    @k(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.")
    public static final void d(@NonNull FirebaseAnalytics firebaseAnalytics0, @NonNull String s, @NonNull Function1 function10) {
        L.p(firebaseAnalytics0, "<this>");
        L.p(s, "name");
        L.p(function10, "block");
        d d0 = new d();
        function10.invoke(d0);
        firebaseAnalytics0.c(s, d0.a());
    }

    public static final void e(@m FirebaseAnalytics firebaseAnalytics0) {
        a.a = firebaseAnalytics0;
    }

    @k(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.")
    public static final void f(@NonNull FirebaseAnalytics firebaseAnalytics0, @NonNull Function1 function10) {
        L.p(firebaseAnalytics0, "<this>");
        L.p(function10, "block");
        Q1.b b0 = new Q1.b();
        function10.invoke(b0);
        firebaseAnalytics0.f(b0.a());
    }
}

