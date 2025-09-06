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
public final class ActivityFilter {
    @l
    private final ComponentName a;
    @m
    private final String b;

    public ActivityFilter(@l ComponentName componentName0, @m String s) {
        L.p(componentName0, "componentName");
        super();
        this.a = componentName0;
        this.b = s;
        String s1 = componentName0.getPackageName();
        L.o(s1, "componentName.packageName");
        String s2 = componentName0.getClassName();
        L.o(s2, "componentName.className");
        if(s1.length() <= 0) {
            throw new IllegalArgumentException("Package name must not be empty");
        }
        if(s2.length() <= 0) {
            throw new IllegalArgumentException("Activity class name must not be empty.");
        }
        if(v.W2(s1, "*", false, 2, null) && v.s3(s1, "*", 0, false, 6, null) != s1.length() - 1) {
            throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.");
        }
        if(v.W2(s2, "*", false, 2, null) && v.s3(s2, "*", 0, false, 6, null) != s2.length() - 1) {
            throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.");
        }
    }

    @l
    public final ComponentName a() {
        return this.a;
    }

    @m
    public final String b() {
        return this.b;
    }

    public final boolean c(@l Activity activity0) {
        L.p(activity0, "activity");
        if(MatcherUtils.a.a(activity0, this.a)) {
            String s = this.b;
            if(s != null) {
                Intent intent0 = activity0.getIntent();
                return L.g(s, (intent0 == null ? null : intent0.getAction()));
            }
            return true;
        }
        return false;
    }

    public final boolean d(@l Intent intent0) {
        L.p(intent0, "intent");
        ComponentName componentName0 = intent0.getComponent();
        return MatcherUtils.a.b(componentName0, this.a) && (this.b == null || L.g(this.b, intent0.getAction()));
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ActivityFilter)) {
            return false;
        }
        return L.g(this.a, ((ActivityFilter)object0).a) ? L.g(this.b, ((ActivityFilter)object0).b) : false;
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? v * 0x1F : v * 0x1F + this.b.hashCode();
    }

    @Override
    @l
    public String toString() {
        return "ActivityFilter(componentName=" + this.a + ", intentAction=" + this.b + ')';
    }
}

