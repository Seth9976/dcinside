package h4;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import x4.A;
import x4.p;
import x4.r;
import x4.x;

@Documented
@Repeatable(a.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@p
@x(qualifier = f.class)
public @interface b {
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @p
    @x(qualifier = f.class)
    public @interface a {
        b[] value();
    }

    @A("value")
    @r
    String[] map();

    String[] value();
}

