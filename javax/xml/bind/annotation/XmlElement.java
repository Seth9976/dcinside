package javax.xml.bind.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
public @interface XmlElement {
    public static final class DEFAULT {
    }

    String defaultValue() default "\u0000";

    String name() default "##default";

    String namespace() default "##default";

    boolean nillable() default false;

    boolean required() default false;

    Class type() default DEFAULT.class;
}

