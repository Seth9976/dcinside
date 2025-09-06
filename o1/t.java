package O1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface t {
    String allowedOnPath() default "";

    Class[] allowlistAnnotations() default {};

    Class[] allowlistWithWarningAnnotations() default {};

    String explanation();

    String link() default "";
}

