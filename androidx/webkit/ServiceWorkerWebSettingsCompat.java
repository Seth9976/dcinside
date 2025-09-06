package androidx.webkit;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Set;

public abstract class ServiceWorkerWebSettingsCompat {
    @RestrictTo({Scope.a})
    @Retention(RetentionPolicy.SOURCE)
    public @interface CacheMode {
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c();

    public abstract int d();

    @NonNull
    public abstract Set e();

    public abstract void f(boolean arg1);

    public abstract void g(boolean arg1);

    public abstract void h(boolean arg1);

    public abstract void i(int arg1);

    public abstract void j(@NonNull Set arg1);
}

