package x4;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Repeatable(a.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@p
public @interface j {
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.METHOD})
    @p
    public @interface a {
        j[] value();
    }

    String[] expression();

    Class qualifier();

    boolean result();
}

