package o3;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import q3.c;
import q3.g;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@c(applicableTo = Number.class)
public @interface f {
    public static class a implements q3.f {
        @Override  // q3.f
        public g a(Annotation annotation0, Object object0) {
            return this.b(((f)annotation0), object0);
        }

        public g b(f f0, Object object0) {
            if(!(object0 instanceof Number)) {
                return g.d;
            }
            if(((Number)object0) instanceof Long) {
                return ((Number)object0).longValue() >= 0L ? g.a : g.d;
            }
            if(((Number)object0) instanceof Double) {
                return ((Number)object0).doubleValue() < 0.0 ? g.d : g.a;
            }
            if(((Number)object0) instanceof Float) {
                return ((Number)object0).floatValue() < 0.0f ? g.d : g.a;
            }
            return ((Number)object0).intValue() >= 0 ? g.a : g.d;
        }
    }

    g when() default g.a;
}

