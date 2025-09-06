package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.ComposableTargetMarker;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import s3.a;
import s3.b;
import s3.e;
import s3.f;

@ComposableTargetMarker(description = "Vector Composable")
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.METHOD, ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
@e(a.b)
@f(allowedTargets = {b.n, b.i, b.j, b.l, b.c})
public @interface VectorComposable {
}

