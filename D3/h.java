package d3;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.TYPE})
public @interface h {
    public static final String o2 = "none";
    public static final String p2 = "custom";
    public static final String q2 = "io.reactivex:computation";
    public static final String r2 = "io.reactivex:io";
    public static final String s2 = "io.reactivex:new-thread";
    public static final String t2 = "io.reactivex:trampoline";
    public static final String u2 = "io.reactivex:single";

    String value();
}

