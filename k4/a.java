package k4;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import x4.F;
import x4.q;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({})
@F({e.class})
@q
public @interface a {
    String value() default "";
}

