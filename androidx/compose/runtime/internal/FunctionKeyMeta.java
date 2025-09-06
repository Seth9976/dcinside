package androidx.compose.runtime.internal;

import androidx.compose.runtime.ComposeCompilerApi;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.jvm.internal.o0;
import s3.a;
import s3.b;
import s3.d;
import s3.e;
import s3.f;

@ComposeCompilerApi
@Repeatable(Container.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@d
@e(a.c)
@f(allowedTargets = {b.a})
public @interface FunctionKeyMeta {
    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.TYPE})
    @o0
    @e(a.c)
    @f(allowedTargets = {b.a})
    public @interface Container {
        FunctionKeyMeta[] value();
    }

    int endOffset();

    int key();

    int startOffset();
}

