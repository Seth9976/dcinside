package Q1;

import android.os.Bundle;
import androidx.annotation.NonNull;
import kotlin.jvm.internal.L;
import kotlin.k;
import y4.l;

@k(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.")
public final class d {
    @l
    private final Bundle a;

    public d() {
        this.a = new Bundle();
    }

    @l
    public final Bundle a() {
        return this.a;
    }

    @k(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.")
    public final void b(@NonNull String s, double f) {
        L.p(s, "key");
        this.a.putDouble(s, f);
    }

    @k(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.")
    public final void c(@NonNull String s, long v) {
        L.p(s, "key");
        this.a.putLong(s, v);
    }

    @k(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.")
    public final void d(@NonNull String s, @NonNull Bundle bundle0) {
        L.p(s, "key");
        L.p(bundle0, "value");
        this.a.putBundle(s, bundle0);
    }

    @k(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.")
    public final void e(@NonNull String s, @NonNull String s1) {
        L.p(s, "key");
        L.p(s1, "value");
        this.a.putString(s, s1);
    }

    @k(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.")
    public final void f(@NonNull String s, @NonNull Bundle[] arr_bundle) {
        L.p(s, "key");
        L.p(arr_bundle, "value");
        this.a.putParcelableArray(s, arr_bundle);
    }
}

