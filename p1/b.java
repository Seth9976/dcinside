package P1;

import O1.k;
import O1.o;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@k(modifier = {o.g})
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface b {
}

