package o3;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import q3.c;
import q3.f;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@c
public @interface g {
    public static class a implements f {
        @Override  // q3.f
        public q3.g a(Annotation annotation0, Object object0) {
            return this.b(((g)annotation0), object0);
        }

        public q3.g b(g g0, Object object0) {
            return object0 == null ? q3.g.d : q3.g.a;
        }
    }

    q3.g when() default q3.g.a;
}

