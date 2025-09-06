package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode.Callback;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import androidx.appcompat.view.menu.MenuWrapperICS;
import androidx.collection.SimpleArrayMap;
import androidx.core.internal.view.SupportMenu;
import androidx.core.internal.view.SupportMenuItem;
import java.util.ArrayList;

@RestrictTo({Scope.c})
public class SupportActionModeWrapper extends ActionMode {
    @RestrictTo({Scope.c})
    public static class CallbackWrapper implements Callback {
        final ActionMode.Callback a;
        final Context b;
        final ArrayList c;
        final SimpleArrayMap d;

        public CallbackWrapper(Context context0, ActionMode.Callback actionMode$Callback0) {
            this.b = context0;
            this.a = actionMode$Callback0;
            this.c = new ArrayList();
            this.d = new SimpleArrayMap();
        }

        @Override  // androidx.appcompat.view.ActionMode$Callback
        public boolean a(androidx.appcompat.view.ActionMode actionMode0, Menu menu0) {
            ActionMode actionMode1 = this.e(actionMode0);
            Menu menu1 = this.f(menu0);
            return this.a.onCreateActionMode(actionMode1, menu1);
        }

        @Override  // androidx.appcompat.view.ActionMode$Callback
        public boolean b(androidx.appcompat.view.ActionMode actionMode0, MenuItem menuItem0) {
            ActionMode actionMode1 = this.e(actionMode0);
            MenuItemWrapperICS menuItemWrapperICS0 = new MenuItemWrapperICS(this.b, ((SupportMenuItem)menuItem0));
            return this.a.onActionItemClicked(actionMode1, menuItemWrapperICS0);
        }

        @Override  // androidx.appcompat.view.ActionMode$Callback
        public boolean c(androidx.appcompat.view.ActionMode actionMode0, Menu menu0) {
            ActionMode actionMode1 = this.e(actionMode0);
            Menu menu1 = this.f(menu0);
            return this.a.onPrepareActionMode(actionMode1, menu1);
        }

        @Override  // androidx.appcompat.view.ActionMode$Callback
        public void d(androidx.appcompat.view.ActionMode actionMode0) {
            ActionMode actionMode1 = this.e(actionMode0);
            this.a.onDestroyActionMode(actionMode1);
        }

        public ActionMode e(androidx.appcompat.view.ActionMode actionMode0) {
            int v = this.c.size();
            for(int v1 = 0; v1 < v; ++v1) {
                ActionMode actionMode1 = (SupportActionModeWrapper)this.c.get(v1);
                if(actionMode1 != null && actionMode1.b == actionMode0) {
                    return actionMode1;
                }
            }
            ActionMode actionMode2 = new SupportActionModeWrapper(this.b, actionMode0);
            this.c.add(actionMode2);
            return actionMode2;
        }

        private Menu f(Menu menu0) {
            Menu menu1 = (Menu)this.d.get(menu0);
            if(menu1 == null) {
                menu1 = new MenuWrapperICS(this.b, ((SupportMenu)menu0));
                this.d.put(menu0, menu1);
            }
            return menu1;
        }
    }

    final Context a;
    final androidx.appcompat.view.ActionMode b;

    public SupportActionModeWrapper(Context context0, androidx.appcompat.view.ActionMode actionMode0) {
        this.a = context0;
        this.b = actionMode0;
    }

    @Override  // android.view.ActionMode
    public void finish() {
        this.b.c();
    }

    @Override  // android.view.ActionMode
    public View getCustomView() {
        return this.b.d();
    }

    @Override  // android.view.ActionMode
    public Menu getMenu() {
        SupportMenu supportMenu0 = (SupportMenu)this.b.e();
        return new MenuWrapperICS(this.a, supportMenu0);
    }

    @Override  // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.b.f();
    }

    @Override  // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.b.g();
    }

    @Override  // android.view.ActionMode
    public Object getTag() {
        return this.b.h();
    }

    @Override  // android.view.ActionMode
    public CharSequence getTitle() {
        return this.b.i();
    }

    @Override  // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.b.j();
    }

    @Override  // android.view.ActionMode
    public void invalidate() {
        this.b.k();
    }

    @Override  // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.b.l();
    }

    @Override  // android.view.ActionMode
    public void setCustomView(View view0) {
        this.b.n(view0);
    }

    @Override  // android.view.ActionMode
    public void setSubtitle(int v) {
        this.b.o(v);
    }

    @Override  // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence0) {
        this.b.p(charSequence0);
    }

    @Override  // android.view.ActionMode
    public void setTag(Object object0) {
        this.b.q(object0);
    }

    @Override  // android.view.ActionMode
    public void setTitle(int v) {
        this.b.r(v);
    }

    @Override  // android.view.ActionMode
    public void setTitle(CharSequence charSequence0) {
        this.b.s(charSequence0);
    }

    @Override  // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.b.t(z);
    }
}

