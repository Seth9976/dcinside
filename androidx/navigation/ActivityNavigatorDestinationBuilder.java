package androidx.navigation;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import androidx.annotation.IdRes;
import kotlin.c0;
import kotlin.jvm.internal.L;
import kotlin.k;
import kotlin.reflect.d;
import y4.l;
import y4.m;
import z3.b;

@NavDestinationDsl
public final class ActivityNavigatorDestinationBuilder extends NavDestinationBuilder {
    @l
    private Context h;
    @m
    private String i;
    @m
    private d j;
    @m
    private String k;
    @m
    private Uri l;
    @m
    private String m;

    @k(message = "Use routes to create your ActivityNavigatorDestinationBuilder instead", replaceWith = @c0(expression = "ActivityNavigatorDestinationBuilder(navigator, route = id.toString())", imports = {}))
    public ActivityNavigatorDestinationBuilder(@l ActivityNavigator activityNavigator0, @IdRes int v) {
        L.p(activityNavigator0, "navigator");
        super(activityNavigator0, v);
        this.h = activityNavigator0.n();
    }

    public ActivityNavigatorDestinationBuilder(@l ActivityNavigator activityNavigator0, @l String s) {
        L.p(activityNavigator0, "navigator");
        L.p(s, "route");
        super(activityNavigator0, s);
        this.h = activityNavigator0.n();
    }

    @Override  // androidx.navigation.NavDestinationBuilder
    public NavDestination c() {
        return this.k();
    }

    @l
    public Destination k() {
        Destination activityNavigator$Destination0 = (Destination)super.c();
        activityNavigator$Destination0.b0(this.i);
        d d0 = this.j;
        if(d0 != null) {
            activityNavigator$Destination0.X(new ComponentName(this.h, b.e(d0)));
        }
        activityNavigator$Destination0.W(this.k);
        activityNavigator$Destination0.Y(this.l);
        activityNavigator$Destination0.Z(this.m);
        return activityNavigator$Destination0;
    }

    @m
    public final String l() {
        return this.k;
    }

    @m
    public final d m() {
        return this.j;
    }

    @m
    public final Uri n() {
        return this.l;
    }

    @m
    public final String o() {
        return this.m;
    }

    @m
    public final String p() {
        return this.i;
    }

    public final void q(@m String s) {
        this.k = s;
    }

    public final void r(@m d d0) {
        this.j = d0;
    }

    public final void s(@m Uri uri0) {
        this.l = uri0;
    }

    public final void t(@m String s) {
        this.m = s;
    }

    public final void u(@m String s) {
        this.i = s;
    }
}

