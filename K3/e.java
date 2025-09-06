package K3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.jvm.internal.o0;
import s3.b;
import s3.d;
import s3.e;
import s3.f;

@Repeatable(a.class)
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.TYPE})
@d
@e(s3.a.a)
@f(allowedTargets = {b.a, b.d})
public @interface K3.e {
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE})
    @o0
    @e(s3.a.a)
    @f(allowedTargets = {b.a, b.d})
    public @interface a {
        K3.e[] value();
    }

}

