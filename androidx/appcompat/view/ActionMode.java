package androidx.appcompat.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

public abstract class ActionMode {
    public interface Callback {
        boolean a(ActionMode arg1, Menu arg2);

        boolean b(ActionMode arg1, MenuItem arg2);

        boolean c(ActionMode arg1, Menu arg2);

        void d(ActionMode arg1);
    }

    private Object a;
    private boolean b;

    public abstract void c();

    public abstract View d();

    public abstract Menu e();

    public abstract MenuInflater f();

    public abstract CharSequence g();

    public Object h() {
        return this.a;
    }

    public abstract CharSequence i();

    public boolean j() {
        return this.b;
    }

    public abstract void k();

    public boolean l() {
        return false;
    }

    @RestrictTo({Scope.c})
    public boolean m() {
        return true;
    }

    public abstract void n(View arg1);

    public abstract void o(int arg1);

    public abstract void p(CharSequence arg1);

    public void q(Object object0) {
        this.a = object0;
    }

    public abstract void r(int arg1);

    public abstract void s(CharSequence arg1);

    public void t(boolean z) {
        this.b = z;
    }
}

