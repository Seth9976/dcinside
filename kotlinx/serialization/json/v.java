package kotlinx.serialization.json;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.c0;
import kotlin.jvm.internal.L;
import kotlin.k;
import kotlin.m;
import kotlinx.serialization.f;
import kotlinx.serialization.s;
import s3.b;
import y4.l;
import z3.i;

@Retention(RetentionPolicy.RUNTIME)
@Target({})
@f
@s
@s3.f(allowedTargets = {b.d})
public @interface v {
    @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
    public static final class a implements v {
        private final String[] H2;

        private a() {
        }

        public a(@l String[] arr_s) {
            L.p(arr_s, "names");
            super();
            this.H2 = arr_s;
        }

        @Override  // kotlinx.serialization.json.v
        @i(name = "names")
        public final String[] names() {
            return this.H2;
        }
    }

    String[] names();
}

