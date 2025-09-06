package y4;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.intellij.lang.annotations.d;

public final class f {
    @Retention(RetentionPolicy.CLASS)
    @Target({ElementType.TYPE})
    public @interface a {
        @d(prefix = "class Renderer{Object[] $childrenArray(){return ", suffix = ";}}", value = "JAVA")
        @k
        String childrenArray() default "";

        @d(prefix = "class Renderer{boolean $hasChildren(){return ", suffix = ";}}", value = "JAVA")
        @k
        String hasChildren() default "";

        @d(prefix = "class Renderer{String $text(){return ", suffix = ";}}", value = "JAVA")
        @k
        String text() default "";
    }

    private f() {
        throw new AssertionError("Debug should not be instantiated");
    }
}

