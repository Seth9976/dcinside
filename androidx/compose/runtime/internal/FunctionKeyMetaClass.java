package androidx.compose.runtime.internal;

import androidx.compose.runtime.ComposeCompilerApi;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import s3.a;
import s3.b;
import s3.e;
import s3.f;

@ComposeCompilerApi
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@e(a.c)
@f(allowedTargets = {b.a})
public @interface FunctionKeyMetaClass {
    String file();
}

