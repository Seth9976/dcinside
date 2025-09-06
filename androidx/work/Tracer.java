package androidx.work;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import y4.l;

@RestrictTo({Scope.b})
public interface Tracer {
    void a(@l String arg1);

    void b();

    void c(@l String arg1, int arg2);

    void d(@l String arg1, int arg2);

    boolean isEnabled();
}

