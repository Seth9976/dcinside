package androidx.compose.ui.tooling.preview;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.jvm.internal.o0;
import s3.a;
import s3.b;
import s3.c;
import s3.d;
import s3.e;
import s3.f;

@Documented
@Repeatable(Container.class)
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@c
@d
@e(a.b)
@f(allowedTargets = {b.b, b.i})
public @interface Preview {
    @Retention(RetentionPolicy.CLASS)
    @Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
    @o0
    @e(a.b)
    @f(allowedTargets = {b.b, b.i})
    public @interface Container {
        Preview[] value();
    }

    int apiLevel() default -1;

    long backgroundColor() default 0L;

    String device() default "";

    float fontScale() default 1.0f;

    String group() default "";

    int heightDp() default -1;

    String locale() default "";

    String name() default "";

    boolean showBackground() default false;

    boolean showSystemUi() default false;

    int uiMode() default 0;

    int wallpaper() default -1;

    int widthDp() default -1;
}

