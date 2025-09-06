package androidx.appcompat.widget;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View.OnTouchListener;
import android.view.View;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import androidx.annotation.AttrRes;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.R.attr;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuBuilder.Callback;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.view.menu.ShowableListMenu;

public class PopupMenu {
    public interface OnDismissListener {
        void a(PopupMenu arg1);
    }

    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem arg1);
    }

    private final Context a;
    private final MenuBuilder b;
    private final View c;
    final MenuPopupHelper d;
    OnMenuItemClickListener e;
    OnDismissListener f;
    private View.OnTouchListener g;

    public PopupMenu(@NonNull Context context0, @NonNull View view0) {
        this(context0, view0, 0);
    }

    public PopupMenu(@NonNull Context context0, @NonNull View view0, int v) {
        this(context0, view0, v, attr.popupMenuStyle, 0);
    }

    public PopupMenu(@NonNull Context context0, @NonNull View view0, int v, @AttrRes int v1, @StyleRes int v2) {
        this.a = context0;
        this.c = view0;
        MenuBuilder menuBuilder0 = new MenuBuilder(context0);
        this.b = menuBuilder0;
        menuBuilder0.Y(new Callback() {
            final PopupMenu a;

            @Override  // androidx.appcompat.view.menu.MenuBuilder$Callback
            public boolean a(@NonNull MenuBuilder menuBuilder0, @NonNull MenuItem menuItem0) {
                OnMenuItemClickListener popupMenu$OnMenuItemClickListener0 = PopupMenu.this.e;
                return popupMenu$OnMenuItemClickListener0 == null ? false : popupMenu$OnMenuItemClickListener0.onMenuItemClick(menuItem0);
            }

            @Override  // androidx.appcompat.view.menu.MenuBuilder$Callback
            public void b(@NonNull MenuBuilder menuBuilder0) {
            }
        });
        MenuPopupHelper menuPopupHelper0 = new MenuPopupHelper(context0, menuBuilder0, view0, false, v1, v2);
        this.d = menuPopupHelper0;
        menuPopupHelper0.j(v);
        menuPopupHelper0.k(new PopupWindow.OnDismissListener() {
            final PopupMenu a;

            @Override  // android.widget.PopupWindow$OnDismissListener
            public void onDismiss() {
                PopupMenu popupMenu0 = PopupMenu.this;
                OnDismissListener popupMenu$OnDismissListener0 = popupMenu0.f;
                if(popupMenu$OnDismissListener0 != null) {
                    popupMenu$OnDismissListener0.a(popupMenu0);
                }
            }
        });
    }

    public void a() {
        this.d.dismiss();
    }

    @NonNull
    public View.OnTouchListener b() {
        if(this.g == null) {
            this.g = new ForwardingListener(this.c) {
                final PopupMenu j;

                @Override  // androidx.appcompat.widget.ForwardingListener
                public ShowableListMenu b() {
                    return PopupMenu.this.d.e();
                }

                @Override  // androidx.appcompat.widget.ForwardingListener
                protected boolean c() {
                    PopupMenu.this.l();
                    return true;
                }

                @Override  // androidx.appcompat.widget.ForwardingListener
                protected boolean d() {
                    PopupMenu.this.a();
                    return true;
                }
            };
        }
        return this.g;
    }

    public int c() {
        return this.d.c();
    }

    @NonNull
    public Menu d() {
        return this.b;
    }

    @NonNull
    public MenuInflater e() {
        return new SupportMenuInflater(this.a);
    }

    @RestrictTo({Scope.c})
    ListView f() {
        return this.d.f() ? this.d.d() : null;
    }

    public void g(@MenuRes int v) {
        this.e().inflate(v, this.b);
    }

    public void h(boolean z) {
        this.d.i(z);
    }

    public void i(int v) {
        this.d.j(v);
    }

    public void j(@Nullable OnDismissListener popupMenu$OnDismissListener0) {
        this.f = popupMenu$OnDismissListener0;
    }

    public void k(@Nullable OnMenuItemClickListener popupMenu$OnMenuItemClickListener0) {
        this.e = popupMenu$OnMenuItemClickListener0;
    }

    public void l() {
        this.d.l();
    }
}

