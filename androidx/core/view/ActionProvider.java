package androidx.core.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

public abstract class ActionProvider {
    @RestrictTo({Scope.c})
    public interface SubUiVisibilityListener {
        void b(boolean arg1);
    }

    public interface VisibilityListener {
        void onActionProviderVisibilityChanged(boolean arg1);
    }

    private final Context a;
    private SubUiVisibilityListener b;
    private VisibilityListener c;
    private static final String d = "ActionProvider(support)";

    public ActionProvider(Context context0) {
        this.a = context0;
    }

    public Context a() {
        return this.a;
    }

    public boolean b() {
        return false;
    }

    public boolean c() {
        return true;
    }

    public abstract View d();

    public View e(MenuItem menuItem0) {
        return this.d();
    }

    public boolean f() {
        return false;
    }

    public void g(SubMenu subMenu0) {
    }

    public boolean h() {
        return false;
    }

    public void i() {
        if(this.c != null && this.h()) {
            this.c.onActionProviderVisibilityChanged(this.c());
        }
    }

    @RestrictTo({Scope.c})
    public void j() {
        this.c = null;
        this.b = null;
    }

    @RestrictTo({Scope.c})
    public void k(SubUiVisibilityListener actionProvider$SubUiVisibilityListener0) {
        this.b = actionProvider$SubUiVisibilityListener0;
    }

    public void l(VisibilityListener actionProvider$VisibilityListener0) {
        if(this.c != null && actionProvider$VisibilityListener0 != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + this.getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.c = actionProvider$VisibilityListener0;
    }

    @RestrictTo({Scope.c})
    public void m(boolean z) {
        SubUiVisibilityListener actionProvider$SubUiVisibilityListener0 = this.b;
        if(actionProvider$SubUiVisibilityListener0 != null) {
            actionProvider$SubUiVisibilityListener0.b(z);
        }
    }
}

