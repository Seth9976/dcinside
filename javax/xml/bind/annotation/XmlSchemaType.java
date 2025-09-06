package javax.xml.bind.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PACKAGE})
public @interface XmlSchemaType {
    public static final class DEFAULT {
    }

    String name();

    String namespace() default "http://www.w3.org/2001/XMLSchema";

    Class type() default DEFAULT.class;
}

