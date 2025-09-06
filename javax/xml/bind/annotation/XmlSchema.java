package javax.xml.bind.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.PACKAGE})
public @interface XmlSchema {
    public static final String NO_LOCATION = "##generate";

    XmlNsForm attributeFormDefault() default XmlNsForm.UNSET;

    XmlNsForm elementFormDefault() default XmlNsForm.UNSET;

    String location() default "##generate";

    String namespace() default "";

    XmlNs[] xmlns() default {};
}

