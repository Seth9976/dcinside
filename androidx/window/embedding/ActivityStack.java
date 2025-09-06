package androidx.window.embedding;

import android.app.Activity;
import androidx.window.core.ExperimentalWindowApi;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@ExperimentalWindowApi
public final class ActivityStack {
    @l
    private final List a;
    private final boolean b;

    public ActivityStack(@l List list0, boolean z) {
        L.p(list0, "activities");
        super();
        this.a = list0;
        this.b = z;
    }

    public ActivityStack(List list0, boolean z, int v, w w0) {
        if((v & 2) != 0) {
            z = false;
        }
        this(list0, z);
    }

    public final boolean a(@l Activity activity0) {
        L.p(activity0, "activity");
        return this.a.contains(activity0);
    }

    @l
    public final List b() {
        return this.a;
    }

    public final boolean c() {
        return this.b;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof ActivityStack ? !L.g(this.a, ((ActivityStack)object0).a) && this.b != ((ActivityStack)object0).b : false;
    }

    @Override
    public int hashCode() {
        return this.b * 0x1F + this.a.hashCode();
    }

    @Override
    @l
    public String toString() {
        String s = "ActivityStack{" + ("activities=" + this.b()) + ("isEmpty=" + this.b + '}');
        L.o(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }
}

