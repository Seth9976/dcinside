package O1;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
public @interface l {
    String[] imports() default {};

    String replacement();

    String[] staticImports() default {};
}

