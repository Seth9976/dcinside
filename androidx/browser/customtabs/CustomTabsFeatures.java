package androidx.browser.customtabs;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@RestrictTo({Scope.a})
public class CustomTabsFeatures {
    @RestrictTo({Scope.a})
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.PARAMETER, ElementType.METHOD})
    public @interface CustomTabsFeature {
    }

    public static final String a = "ENGAGEMENT_SIGNALS";

}

