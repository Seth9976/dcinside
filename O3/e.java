package o3;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.regex.Pattern;
import q3.c;
import q3.f;
import q3.g;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@c(applicableTo = String.class)
public @interface e {
    public static class a implements f {
        @Override  // q3.f
        public g a(Annotation annotation0, Object object0) {
            return this.b(((e)annotation0), object0);
        }

        // 去混淆评级： 低(20)
        public g b(e e0, Object object0) {
            return Pattern.compile(e0.value(), e0.flags()).matcher(((String)object0)).matches() ? g.a : g.d;
        }
    }

    int flags() default 0;

    @m
    String value();
}

