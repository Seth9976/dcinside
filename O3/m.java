package o3;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import q3.e;
import q3.f;
import q3.g;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@o("RegEx")
@e
public @interface m {
    public static class a implements f {
        @Override  // q3.f
        public g a(Annotation annotation0, Object object0) {
            return this.b(((m)annotation0), object0);
        }

        public g b(m m0, Object object0) {
            if(!(object0 instanceof String)) {
                return g.d;
            }
            try {
                Pattern.compile(((String)object0));
                return g.a;
            }
            catch(PatternSyntaxException unused_ex) {
                return g.d;
            }
        }
    }

    g when() default g.a;
}

