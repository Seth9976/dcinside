package h4;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import x4.A;
import x4.c;
import x4.p;
import x4.r;

@Documented
@Repeatable(a.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@c(qualifier = f.class)
@p
public @interface h4.c {
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @c(qualifier = f.class)
    @p
    public @interface a {
        h4.c[] value();
    }

    String[] expression();

    @A("value")
    @r
    String[] map();

    boolean result();
}

