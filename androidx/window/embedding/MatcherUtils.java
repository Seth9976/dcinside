package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import androidx.window.core.ExperimentalWindowApi;
import kotlin.jvm.internal.L;
import kotlin.text.v;
import y4.l;
import y4.m;

@ExperimentalWindowApi
public final class MatcherUtils {
    @l
    public static final MatcherUtils a = null;
    public static final boolean b = false;
    @l
    public static final String c = "SplitRuleResolution";

    static {
        MatcherUtils.a = new MatcherUtils();
    }

    public final boolean a(@l Activity activity0, @l ComponentName componentName0) {
        L.p(activity0, "activity");
        L.p(componentName0, "ruleComponent");
        if(this.b(activity0.getComponentName(), componentName0)) {
            return true;
        }
        Intent intent0 = activity0.getIntent();
        if(intent0 != null) {
            ComponentName componentName1 = intent0.getComponent();
            return componentName1 == null ? false : MatcherUtils.a.b(componentName1, componentName0);
        }
        return false;
    }

    public final boolean b(@m ComponentName componentName0, @l ComponentName componentName1) {
        boolean z;
        L.p(componentName1, "ruleComponent");
        if(componentName0 == null) {
            return L.g(componentName1.getPackageName(), "*") && L.g(componentName1.getClassName(), "*");
        }
        String s = componentName0.toString();
        L.o(s, "activityComponent.toString()");
        if(v.W2(s, "*", false, 2, null)) {
            throw new IllegalArgumentException("Wildcard can only be part of the rule.");
        }
        if(L.g(componentName0.getPackageName(), componentName1.getPackageName())) {
            z = true;
        }
        else {
            String s1 = componentName0.getPackageName();
            L.o(s1, "activityComponent.packageName");
            String s2 = componentName1.getPackageName();
            L.o(s2, "ruleComponent.packageName");
            z = this.c(s1, s2);
        }
        if(!L.g(componentName0.getClassName(), componentName1.getClassName())) {
            String s3 = componentName0.getClassName();
            L.o(s3, "activityComponent.className");
            String s4 = componentName1.getClassName();
            L.o(s4, "ruleComponent.className");
            return this.c(s3, s4) ? z : false;
        }
        return z;
    }

    private final boolean c(String s, String s1) {
        if(!v.W2(s1, "*", false, 2, null)) {
            return false;
        }
        if(L.g(s1, "*")) {
            return true;
        }
        if(v.s3(s1, "*", 0, false, 6, null) != v.H3(s1, "*", 0, false, 6, null) || !v.N1(s1, "*", false, 2, null)) {
            throw new IllegalArgumentException("Name pattern with a wildcard must only contain a single wildcard in the end");
        }
        String s2 = s1.substring(0, s1.length() - 1);
        L.o(s2, "this as java.lang.String…ing(startIndex, endIndex)");
        return v.v2(s, s2, false, 2, null);
    }
}

