package h4;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import x4.c;
import x4.p;

@Documented
@Repeatable(a.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@c(qualifier = i.class)
@p
public @interface e {
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @c(qualifier = i.class)
    @p
    public @interface a {
        e[] value();
    }

    String[] expression();

    boolean result();
}

