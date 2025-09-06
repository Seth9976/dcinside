package androidx.navigation.ui;

import android.view.Menu;
import androidx.customview.widget.Openable;
import androidx.navigation.NavGraph;
import java.util.Set;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.v;
import y4.l;
import y4.m;

public final class AppBarConfigurationKt {
    public static final class a implements OnNavigateUpListener, D {
        private final A3.a a;

        public a(A3.a a0) {
            this.a = a0;
        }

        @Override  // androidx.navigation.ui.AppBarConfiguration$OnNavigateUpListener
        public final boolean a() {
            return ((Boolean)this.a.invoke()).booleanValue();
        }

        // 去混淆评级： 低(20)
        @Override
        public final boolean equals(@m Object object0) {
            return !(object0 instanceof OnNavigateUpListener) || !(object0 instanceof D) ? false : L.g(this.getFunctionDelegate(), ((D)object0).getFunctionDelegate());
        }

        @Override  // kotlin.jvm.internal.D
        @l
        public final v getFunctionDelegate() {
            return this.a;
        }

        @Override
        public final int hashCode() {
            return this.getFunctionDelegate().hashCode();
        }
    }

    @l
    public static final AppBarConfiguration a(@l Menu menu0, @m Openable openable0, @l A3.a a0) {
        L.p(menu0, "topLevelMenu");
        L.p(a0, "fallbackOnNavigateUpListener");
        return new Builder(menu0).d(openable0).c(new AppBarConfigurationKt.sam.i.androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener.0(a0)).a();
    }

    @l
    public static final AppBarConfiguration b(@l NavGraph navGraph0, @m Openable openable0, @l A3.a a0) {
        L.p(navGraph0, "navGraph");
        L.p(a0, "fallbackOnNavigateUpListener");
        return new Builder(navGraph0).d(openable0).c(new AppBarConfigurationKt.sam.i.androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener.0(a0)).a();
    }

    @l
    public static final AppBarConfiguration c(@l Set set0, @m Openable openable0, @l A3.a a0) {
        L.p(set0, "topLevelDestinationIds");
        L.p(a0, "fallbackOnNavigateUpListener");
        return new Builder(set0).d(openable0).c(new AppBarConfigurationKt.sam.i.androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener.0(a0)).a();
    }

    public static AppBarConfiguration d(Menu menu0, Openable openable0, A3.a a0, int v, Object object0) {
        if((v & 2) != 0) {
            openable0 = null;
        }
        if((v & 4) != 0) {
            a0 = androidx.navigation.ui.AppBarConfigurationKt.AppBarConfiguration.2.e;
        }
        L.p(menu0, "topLevelMenu");
        L.p(a0, "fallbackOnNavigateUpListener");
        return new Builder(menu0).d(openable0).c(new AppBarConfigurationKt.sam.i.androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener.0(a0)).a();

        public final class androidx.navigation.ui.AppBarConfigurationKt.AppBarConfiguration.2 extends N implements A3.a {
            public static final androidx.navigation.ui.AppBarConfigurationKt.AppBarConfiguration.2 e;

            static {
                androidx.navigation.ui.AppBarConfigurationKt.AppBarConfiguration.2.e = new androidx.navigation.ui.AppBarConfigurationKt.AppBarConfiguration.2();
            }

            public androidx.navigation.ui.AppBarConfigurationKt.AppBarConfiguration.2() {
                super(0);
            }

            @l
            public final Boolean b() {
                return false;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

    }

    public static AppBarConfiguration e(NavGraph navGraph0, Openable openable0, A3.a a0, int v, Object object0) {
        if((v & 2) != 0) {
            openable0 = null;
        }
        if((v & 4) != 0) {
            a0 = androidx.navigation.ui.AppBarConfigurationKt.AppBarConfiguration.1.e;
        }
        L.p(navGraph0, "navGraph");
        L.p(a0, "fallbackOnNavigateUpListener");
        return new Builder(navGraph0).d(openable0).c(new AppBarConfigurationKt.sam.i.androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener.0(a0)).a();

        public final class androidx.navigation.ui.AppBarConfigurationKt.AppBarConfiguration.1 extends N implements A3.a {
            public static final androidx.navigation.ui.AppBarConfigurationKt.AppBarConfiguration.1 e;

            static {
                androidx.navigation.ui.AppBarConfigurationKt.AppBarConfiguration.1.e = new androidx.navigation.ui.AppBarConfigurationKt.AppBarConfiguration.1();
            }

            public androidx.navigation.ui.AppBarConfigurationKt.AppBarConfiguration.1() {
                super(0);
            }

            @l
            public final Boolean b() {
                return false;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

    }

    public static AppBarConfiguration f(Set set0, Openable openable0, A3.a a0, int v, Object object0) {
        if((v & 2) != 0) {
            openable0 = null;
        }
        if((v & 4) != 0) {
            a0 = androidx.navigation.ui.AppBarConfigurationKt.AppBarConfiguration.3.e;
        }
        L.p(set0, "topLevelDestinationIds");
        L.p(a0, "fallbackOnNavigateUpListener");
        return new Builder(set0).d(openable0).c(new AppBarConfigurationKt.sam.i.androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener.0(a0)).a();

        public final class androidx.navigation.ui.AppBarConfigurationKt.AppBarConfiguration.3 extends N implements A3.a {
            public static final androidx.navigation.ui.AppBarConfigurationKt.AppBarConfiguration.3 e;

            static {
                androidx.navigation.ui.AppBarConfigurationKt.AppBarConfiguration.3.e = new androidx.navigation.ui.AppBarConfigurationKt.AppBarConfiguration.3();
            }

            public androidx.navigation.ui.AppBarConfigurationKt.AppBarConfiguration.3() {
                super(0);
            }

            @l
            public final Boolean b() {
                return false;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

    }
}

