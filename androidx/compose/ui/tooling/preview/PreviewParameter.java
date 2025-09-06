package androidx.compose.ui.tooling.preview;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface PreviewParameter {
    int limit() default 0x7FFFFFFF;

    Class provider();
}

