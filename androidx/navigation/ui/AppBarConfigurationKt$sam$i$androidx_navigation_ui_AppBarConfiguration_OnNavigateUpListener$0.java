package androidx.navigation.ui;

import A3.a;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.L;
import kotlin.v;
import y4.l;
import y4.m;

public final class AppBarConfigurationKt.sam.i.androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener.0 implements OnNavigateUpListener, D {
    private final a a;

    public AppBarConfigurationKt.sam.i.androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener.0(a a0) {
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

