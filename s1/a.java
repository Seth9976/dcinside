package S1;

import androidx.annotation.NonNull;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.L;

public final class a {
    public static final void a(@NonNull FirebaseAnalytics firebaseAnalytics0, @NonNull A3.a a0) {
        L.p(firebaseAnalytics0, "analytics");
        L.p(a0, "block");
        synchronized(com.google.firebase.analytics.a.c()) {
            FirebaseAnalytics firebaseAnalytics1 = com.google.firebase.analytics.a.a();
            com.google.firebase.analytics.a.e(firebaseAnalytics0);
            try {
                a0.invoke();
            }
            catch(Throwable throwable0) {
                com.google.firebase.analytics.a.e(firebaseAnalytics1);
                throw throwable0;
            }
            com.google.firebase.analytics.a.e(firebaseAnalytics1);
        }
    }
}

