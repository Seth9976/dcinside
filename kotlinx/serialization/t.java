package kotlinx.serialization;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import s3.b;
import s3.f;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@f(allowedTargets = {b.d, b.a})
public @interface t {
    String value();
}

