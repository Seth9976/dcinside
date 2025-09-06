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
public final class SplitPairFilter {
    @l
    private final ComponentName a;
    @l
    private final ComponentName b;
    @m
    private final String c;

    public SplitPairFilter(@l ComponentName componentName0, @l ComponentName componentName1, @m String s) {
        L.p(componentName0, "primaryActivityName");
        L.p(componentName1, "secondaryActivityName");
        super();
        this.a = componentName0;
        this.b = componentName1;
        this.c = s;
        String s1 = componentName0.getPackageName();
        L.o(s1, "primaryActivityName.packageName");
        String s2 = componentName0.getClassName();
        L.o(s2, "primaryActivityName.className");
        String s3 = componentName1.getPackageName();
        L.o(s3, "secondaryActivityName.packageName");
        String s4 = componentName1.getClassName();
        L.o(s4, "secondaryActivityName.className");
        if(s1.length() == 0 || s3.length() == 0) {
            throw new IllegalArgumentException("Package name must not be empty");
        }
        if(s2.length() == 0 || s4.length() == 0) {
            throw new IllegalArgumentException("Activity class name must not be empty.");
        }
        if(v.W2(s1, "*", false, 2, null) && v.s3(s1, "*", 0, false, 6, null) != s1.length() - 1) {
            throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.");
        }
        if(v.W2(s2, "*", false, 2, null) && v.s3(s2, "*", 0, false, 6, null) != s2.length() - 1) {
            throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.");
        }
        if(v.W2(s3, "*", false, 2, null) && v.s3(s3, "*", 0, false, 6, null) != s3.length() - 1) {
            throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.");
        }
        if(v.W2(s4, "*", false, 2, null) && v.s3(s4, "*", 0, false, 6, null) != s4.length() - 1) {
            throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.");
        }
    }

    @l
    public final ComponentName a() {
        return this.a;
    }

    @m
    public final String b() {
        return this.c;
    }

    @l
    public final ComponentName c() {
        return this.b;
    }

    public final boolean d(@l Activity activity0, @l Intent intent0) {
        L.p(activity0, "primaryActivity");
        L.p(intent0, "secondaryActivityIntent");
        ComponentName componentName0 = activity0.getComponentName();
        return MatcherUtils.a.b(componentName0, this.a) && MatcherUtils.a.b(intent0.getComponent(), this.b) && (this.c == null || L.g(this.c, intent0.getAction()));
    }

    public final boolean e(@l Activity activity0, @l Activity activity1) {
        L.p(activity0, "primaryActivity");
        L.p(activity1, "secondaryActivity");
        boolean z = MatcherUtils.a.b(activity0.getComponentName(), this.a) && MatcherUtils.a.b(activity1.getComponentName(), this.b);
        if(activity1.getIntent() != null) {
            if(z) {
                Intent intent0 = activity1.getIntent();
                L.o(intent0, "secondaryActivity.intent");
                return this.d(activity0, intent0);
            }
            return false;
        }
        return z;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SplitPairFilter)) {
            return false;
        }
        if(!L.g(this.a, ((SplitPairFilter)object0).a)) {
            return false;
        }
        return L.g(this.b, ((SplitPairFilter)object0).b) ? L.g(this.c, ((SplitPairFilter)object0).c) : false;
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        int v1 = this.b.hashCode();
        return this.c == null ? (v * 0x1F + v1) * 0x1F : (v * 0x1F + v1) * 0x1F + this.c.hashCode();
    }

    @Override
    @l
    public String toString() {
        return "SplitPairFilter{primaryActivityName=" + this.a + ", secondaryActivityName=" + this.b + ", secondaryActivityAction=" + this.c + '}';
    }
}

