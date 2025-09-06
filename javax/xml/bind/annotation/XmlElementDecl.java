package javax.xml.bind.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface XmlElementDecl {
    public static final class GLOBAL {
    }

    String defaultValue() default "\u0000";

    String name();

    String namespace() default "##default";

    Class scope() default GLOBAL.class;

    String substitutionHeadName() default "";

    String substitutionHeadNamespace() default "##default";
}

