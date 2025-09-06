package androidx.media3.common.util;

import androidx.annotation.RequiresOptIn.Level;
import androidx.annotation.RequiresOptIn;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@RequiresOptIn(level = Level.b)
@UnstableApi
@Documented
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD})
public @interface UnstableApi {
}

