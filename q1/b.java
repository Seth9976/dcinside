package Q1;

import androidx.annotation.Nullable;
import com.google.firebase.analytics.FirebaseAnalytics.a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.k;
import y4.l;
import y4.m;

@k(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.")
public final class b {
    @m
    private a a;
    @m
    private a b;

    @l
    public final Map a() {
        Map map0 = new LinkedHashMap();
        a firebaseAnalytics$a0 = this.a;
        if(firebaseAnalytics$a0 != null) {
            map0.put(com.google.firebase.analytics.FirebaseAnalytics.b.a, firebaseAnalytics$a0);
        }
        a firebaseAnalytics$a1 = this.b;
        if(firebaseAnalytics$a1 != null) {
            map0.put(com.google.firebase.analytics.FirebaseAnalytics.b.b, firebaseAnalytics$a1);
        }
        return map0;
    }

    @Nullable
    public final a b() {
        return this.a;
    }

    @Nullable
    public final a c() {
        return this.b;
    }

    public final void d(@m a firebaseAnalytics$a0) {
        this.a = firebaseAnalytics$a0;
    }

    public final void e(@m a firebaseAnalytics$a0) {
        this.b = firebaseAnalytics$a0;
    }
}

