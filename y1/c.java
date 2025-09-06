package Y1;

import com.google.firebase.crashlytics.j;
import kotlin.c0;
import kotlin.jvm.internal.L;
import kotlin.k;
import y4.l;

@k(message = "Use `com.google.firebase.crashlytics.KeyValueBuilder` from the main module.")
public final class c {
    @l
    private final j a;

    public c(@l j j0) {
        L.p(j0, "crashlytics");
        super();
        this.a = j0;
    }

    @k(message = "Use `com.google.firebase.crashlytics.KeyValueBuilder.key(key, value)` from the main module.", replaceWith = @c0(expression = "", imports = {}))
    public final void a(@l String s, double f) {
        L.p(s, "key");
        this.a.n(s, f);
    }

    @k(message = "Use `com.google.firebase.crashlytics.KeyValueBuilder.key(key, value)` from the main module.", replaceWith = @c0(expression = "", imports = {}))
    public final void b(@l String s, float f) {
        L.p(s, "key");
        this.a.o(s, f);
    }

    @k(message = "Use `com.google.firebase.crashlytics.KeyValueBuilder.key(key, value)` from the main module.", replaceWith = @c0(expression = "", imports = {}))
    public final void c(@l String s, int v) {
        L.p(s, "key");
        this.a.p(s, v);
    }

    @k(message = "Use `com.google.firebase.crashlytics.KeyValueBuilder.key(key, value)` from the main module.", replaceWith = @c0(expression = "", imports = {}))
    public final void d(@l String s, long v) {
        L.p(s, "key");
        this.a.q(s, v);
    }

    @k(message = "Use `com.google.firebase.crashlytics.KeyValueBuilder.key(key, value)` from the main module.", replaceWith = @c0(expression = "", imports = {}))
    public final void e(@l String s, @l String s1) {
        L.p(s, "key");
        L.p(s1, "value");
        this.a.r(s, s1);
    }

    @k(message = "Use `com.google.firebase.crashlytics.KeyValueBuilder.key(key, value)` from the main module.", replaceWith = @c0(expression = "", imports = {}))
    public final void f(@l String s, boolean z) {
        L.p(s, "key");
        this.a.s(s, z);
    }
}

