package kotlinx.serialization.json;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.c0;
import kotlin.jvm.internal.L;
import kotlin.k;
import kotlin.m;
import kotlinx.serialization.f;
import kotlinx.serialization.g;
import s3.b;
import y4.l;
import z3.i;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@f
@g
@s3.f(allowedTargets = {b.a})
public @interface kotlinx.serialization.json.g {
    @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
    public static final class a implements kotlinx.serialization.json.g {
        private final String H2;

        private a() {
        }

        public a(@l String s) {
            L.p(s, "discriminator");
            super();
            this.H2 = s;
        }

        @Override  // kotlinx.serialization.json.g
        @i(name = "discriminator")
        public final String discriminator() {
            return this.H2;
        }
    }

    String discriminator();
}

