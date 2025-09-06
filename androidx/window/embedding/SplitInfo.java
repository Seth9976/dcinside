package androidx.window.embedding;

import android.app.Activity;
import androidx.window.core.ExperimentalWindowApi;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@ExperimentalWindowApi
public final class SplitInfo {
    @l
    private final ActivityStack a;
    @l
    private final ActivityStack b;
    private final float c;

    public SplitInfo(@l ActivityStack activityStack0, @l ActivityStack activityStack1, float f) {
        L.p(activityStack0, "primaryActivityStack");
        L.p(activityStack1, "secondaryActivityStack");
        super();
        this.a = activityStack0;
        this.b = activityStack1;
        this.c = f;
    }

    public final boolean a(@l Activity activity0) {
        L.p(activity0, "activity");
        return this.a.a(activity0) || this.b.a(activity0);
    }

    @l
    public final ActivityStack b() {
        return this.a;
    }

    @l
    public final ActivityStack c() {
        return this.b;
    }

    public final float d() {
        return this.c;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SplitInfo)) {
            return false;
        }
        if(!L.g(this.a, ((SplitInfo)object0).a)) {
            return false;
        }
        return L.g(this.b, ((SplitInfo)object0).b) ? this.c == ((SplitInfo)object0).c : false;
    }

    @Override
    public int hashCode() {
        return (this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + Float.floatToIntBits(this.c);
    }

    @Override
    @l
    public String toString() {
        String s = "SplitInfo:{" + ("primaryActivityStack=" + this.b() + ',') + ("secondaryActivityStack=" + this.c() + ',') + ("splitRatio=" + this.d() + '}');
        L.o(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }
}

