package q4;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import x4.A;
import x4.p;
import x4.x;

@Documented
@Repeatable(a.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@p
@x(qualifier = b.class)
public @interface q4.a {
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @p
    @x(qualifier = b.class)
    public @interface a {
        q4.a[] value();
    }

    @A("value")
    String[] fields();

    String[] value() default {"this"};
}

