package v4;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import x4.A;
import x4.c;
import x4.p;

@Documented
@Repeatable(a.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@c(qualifier = o.class)
@p
public @interface g {
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @c(qualifier = o.class)
    @p
    public @interface a {
        g[] value();
    }

    String[] expression();

    boolean result();

    @A("value")
    int targetValue() default 0;
}

