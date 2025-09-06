package androidx.room;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import s3.a;
import s3.b;
import s3.e;
import s3.f;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE})
@e(a.b)
@f(allowedTargets = {b.a})
public @interface Database {
    AutoMigration[] autoMigrations() default {};

    Class[] entities() default {};

    boolean exportSchema() default true;

    int version();

    Class[] views() default {};
}

