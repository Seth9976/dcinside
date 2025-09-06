package androidx.navigation.ui;

import android.annotation.SuppressLint;
import android.view.Menu;
import androidx.customview.widget.Openable;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavGraph;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.k;
import y4.l;
import y4.m;

public final class AppBarConfiguration {
    public static final class Builder {
        @l
        private final Set a;
        @m
        private Openable b;
        @m
        private OnNavigateUpListener c;

        public Builder(@l Menu menu0) {
            L.p(menu0, "topLevelMenu");
            super();
            this.a = new HashSet();
            int v = menu0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                Integer integer0 = menu0.getItem(v1).getItemId();
                this.a.add(integer0);
            }
        }

        public Builder(@l NavGraph navGraph0) {
            L.p(navGraph0, "navGraph");
            super();
            HashSet hashSet0 = new HashSet();
            this.a = hashSet0;
            hashSet0.add(NavGraph.p.a(navGraph0).q());
        }

        public Builder(@l Set set0) {
            L.p(set0, "topLevelDestinationIds");
            super();
            HashSet hashSet0 = new HashSet();
            this.a = hashSet0;
            hashSet0.addAll(set0);
        }

        public Builder(@l int[] arr_v) {
            L.p(arr_v, "topLevelDestinationIds");
            super();
            this.a = new HashSet();
            for(int v = 0; v < arr_v.length; ++v) {
                this.a.add(((int)arr_v[v]));
            }
        }

        @SuppressLint({"SyntheticAccessor"})
        @l
        public final AppBarConfiguration a() {
            return new AppBarConfiguration(this.a, this.b, this.c, null);
        }

        @k(message = "Use {@link #setOpenableLayout(Openable)}.")
        @l
        public final Builder b(@m DrawerLayout drawerLayout0) {
            this.b = drawerLayout0;
            return this;
        }

        @l
        public final Builder c(@m OnNavigateUpListener appBarConfiguration$OnNavigateUpListener0) {
            this.c = appBarConfiguration$OnNavigateUpListener0;
            return this;
        }

        @l
        public final Builder d(@m Openable openable0) {
            this.b = openable0;
            return this;
        }
    }

    public interface OnNavigateUpListener {
        boolean a();
    }

    @l
    private final Set a;
    @m
    private final Openable b;
    @m
    private final OnNavigateUpListener c;

    private AppBarConfiguration(Set set0, Openable openable0, OnNavigateUpListener appBarConfiguration$OnNavigateUpListener0) {
        this.a = set0;
        this.b = openable0;
        this.c = appBarConfiguration$OnNavigateUpListener0;
    }

    public AppBarConfiguration(Set set0, Openable openable0, OnNavigateUpListener appBarConfiguration$OnNavigateUpListener0, w w0) {
        this(set0, openable0, appBarConfiguration$OnNavigateUpListener0);
    }

    // 去混淆评级： 低(20)
    @k(message = "Use {@link #getOpenableLayout()}.")
    @m
    public final DrawerLayout a() {
        return this.b instanceof DrawerLayout ? ((DrawerLayout)this.b) : null;
    }

    @m
    public final OnNavigateUpListener b() {
        return this.c;
    }

    @m
    public final Openable c() {
        return this.b;
    }

    @l
    public final Set d() {
        return this.a;
    }
}

