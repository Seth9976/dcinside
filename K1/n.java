package k1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import o3.g;
import q3.d;
import t3.a;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE})
@g
@d({ElementType.METHOD, ElementType.PARAMETER})
@t3.d(status = a.c)
public @interface n {
    public static enum k1.n.a {
        LOCAL,
        STRICT;

    }

    public @interface b {
        boolean trustAll() default false;

        Class[] value();
    }

    b trustOnly() default @b(trustAll = true, value = {});

    k1.n.a value();
}

