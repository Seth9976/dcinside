package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder.Callback;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

@RestrictTo({Scope.c})
public class StandaloneActionMode extends ActionMode implements Callback {
    private Context c;
    private ActionBarContextView d;
    private androidx.appcompat.view.ActionMode.Callback e;
    private WeakReference f;
    private boolean g;
    private boolean h;
    private MenuBuilder i;

    public StandaloneActionMode(Context context0, ActionBarContextView actionBarContextView0, androidx.appcompat.view.ActionMode.Callback actionMode$Callback0, boolean z) {
        this.c = context0;
        this.d = actionBarContextView0;
        this.e = actionMode$Callback0;
        MenuBuilder menuBuilder0 = new MenuBuilder(actionBarContextView0.getContext()).a0(1);
        this.i = menuBuilder0;
        menuBuilder0.Y(this);
        this.h = z;
    }

    @Override  // androidx.appcompat.view.menu.MenuBuilder$Callback
    public boolean a(@NonNull MenuBuilder menuBuilder0, @NonNull MenuItem menuItem0) {
        return this.e.b(this, menuItem0);
    }

    @Override  // androidx.appcompat.view.menu.MenuBuilder$Callback
    public void b(@NonNull MenuBuilder menuBuilder0) {
        this.k();
        this.d.o();
    }

    @Override  // androidx.appcompat.view.ActionMode
    public void c() {
        if(this.g) {
            return;
        }
        this.g = true;
        this.e.d(this);
    }

    @Override  // androidx.appcompat.view.ActionMode
    public View d() {
        return this.f == null ? null : ((View)this.f.get());
    }

    @Override  // androidx.appcompat.view.ActionMode
    public Menu e() {
        return this.i;
    }

    @Override  // androidx.appcompat.view.ActionMode
    public MenuInflater f() {
        return new SupportMenuInflater(this.d.getContext());
    }

    @Override  // androidx.appcompat.view.ActionMode
    public CharSequence g() {
        return this.d.getSubtitle();
    }

    @Override  // androidx.appcompat.view.ActionMode
    public CharSequence i() {
        return this.d.getTitle();
    }

    @Override  // androidx.appcompat.view.ActionMode
    public void k() {
        this.e.c(this, this.i);
    }

    @Override  // androidx.appcompat.view.ActionMode
    public boolean l() {
        return this.d.s();
    }

    @Override  // androidx.appcompat.view.ActionMode
    public boolean m() {
        return this.h;
    }

    @Override  // androidx.appcompat.view.ActionMode
    public void n(View view0) {
        this.d.setCustomView(view0);
        this.f = view0 == null ? null : new WeakReference(view0);
    }

    @Override  // androidx.appcompat.view.ActionMode
    public void o(int v) {
        this.p(this.c.getString(v));
    }

    @Override  // androidx.appcompat.view.ActionMode
    public void p(CharSequence charSequence0) {
        this.d.setSubtitle(charSequence0);
    }

    @Override  // androidx.appcompat.view.ActionMode
    public void r(int v) {
        this.s(this.c.getString(v));
    }

    @Override  // androidx.appcompat.view.ActionMode
    public void s(CharSequence charSequence0) {
        this.d.setTitle(charSequence0);
    }

    @Override  // androidx.appcompat.view.ActionMode
    public void t(boolean z) {
        super.t(z);
        this.d.setTitleOptional(z);
    }

    public void u(MenuBuilder menuBuilder0, boolean z) {
    }

    public void v(SubMenuBuilder subMenuBuilder0) {
    }

    public boolean w(SubMenuBuilder subMenuBuilder0) {
        if(!subMenuBuilder0.hasVisibleItems()) {
            return true;
        }
        new MenuPopupHelper(this.d.getContext(), subMenuBuilder0).l();
        return true;
    }
}

