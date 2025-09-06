package o3;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import q3.c;
import q3.g;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@c(applicableTo = CharSequence.class)
public @interface o {
    String value();

    g when() default g.a;
}

