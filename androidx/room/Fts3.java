package androidx.room;

import androidx.annotation.RequiresApi;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import s3.a;
import s3.b;
import s3.e;
import s3.f;

@RequiresApi(16)
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE})
@e(a.b)
@f(allowedTargets = {b.a})
public @interface Fts3 {
    String tokenizer() default "simple";

    String[] tokenizerArgs() default {};
}

