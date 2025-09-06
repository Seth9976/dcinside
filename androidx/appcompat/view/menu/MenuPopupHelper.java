package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.dimen;
import androidx.core.view.GravityCompat;

@RestrictTo({Scope.c})
public class MenuPopupHelper implements MenuHelper {
    private final Context a;
    private final MenuBuilder b;
    private final boolean c;
    private final int d;
    private final int e;
    private View f;
    private int g;
    private boolean h;
    private Callback i;
    private MenuPopup j;
    private PopupWindow.OnDismissListener k;
    private final PopupWindow.OnDismissListener l;
    private static final int m = 0x30;

    public MenuPopupHelper(@NonNull Context context0, @NonNull MenuBuilder menuBuilder0) {
        this(context0, menuBuilder0, null, false, attr.popupMenuStyle, 0);
    }

    public MenuPopupHelper(@NonNull Context context0, @NonNull MenuBuilder menuBuilder0, @NonNull View view0) {
        this(context0, menuBuilder0, view0, false, attr.popupMenuStyle, 0);
    }

    public MenuPopupHelper(@NonNull Context context0, @NonNull MenuBuilder menuBuilder0, @NonNull View view0, boolean z, @AttrRes int v) {
        this(context0, menuBuilder0, view0, z, v, 0);
    }

    public MenuPopupHelper(@NonNull Context context0, @NonNull MenuBuilder menuBuilder0, @NonNull View view0, boolean z, @AttrRes int v, @StyleRes int v1) {
        this.g = 0x800003;
        this.l = () -> {
            MenuPopupHelper.this.j = null;
            PopupWindow.OnDismissListener popupWindow$OnDismissListener0 = MenuPopupHelper.this.k;
            if(popupWindow$OnDismissListener0 != null) {
                popupWindow$OnDismissListener0.onDismiss();
            }
        };
        this.a = context0;
        this.b = menuBuilder0;
        this.f = view0;
        this.c = z;
        this.d = v;
        this.e = v1;
    }

    @Override  // androidx.appcompat.view.menu.MenuHelper
    public void a(@Nullable Callback menuPresenter$Callback0) {
        this.i = menuPresenter$Callback0;
        MenuPopup menuPopup0 = this.j;
        if(menuPopup0 != null) {
            menuPopup0.k(menuPresenter$Callback0);
        }
    }

    @NonNull
    private MenuPopup b() {
        Display display0 = ((WindowManager)this.a.getSystemService("window")).getDefaultDisplay();
        Point point0 = new Point();
        display0.getRealSize(point0);
        MenuPopup menuPopup0 = Math.min(point0.x, point0.y) >= this.a.getResources().getDimensionPixelSize(dimen.abc_cascading_menus_min_smallest_width) ? new CascadingMenuPopup(this.a, this.f, this.d, this.e, this.c) : new StandardMenuPopup(this.a, this.b, this.f, this.d, this.e, this.c);
        menuPopup0.n(this.b);
        menuPopup0.w(this.l);
        menuPopup0.r(this.f);
        menuPopup0.k(this.i);
        menuPopup0.t(this.h);
        menuPopup0.u(this.g);
        return menuPopup0;
    }

    public int c() {
        return this.g;
    }

    public ListView d() {
        return this.e().j();
    }

    @Override  // androidx.appcompat.view.menu.MenuHelper
    public void dismiss() {
        if(this.f()) {
            this.j.dismiss();
        }
    }

    @NonNull
    @RestrictTo({Scope.a})
    public MenuPopup e() {
        if(this.j == null) {
            this.j = this.b();
        }
        return this.j;
    }

    public boolean f() {
        return this.j != null && this.j.b();
    }

    // 检测为 Lambda 实现
    protected void g() [...]

    public void h(@NonNull View view0) {
        this.f = view0;
    }

    public void i(boolean z) {
        this.h = z;
        MenuPopup menuPopup0 = this.j;
        if(menuPopup0 != null) {
            menuPopup0.t(z);
        }
    }

    public void j(int v) {
        this.g = v;
    }

    public void k(@Nullable PopupWindow.OnDismissListener popupWindow$OnDismissListener0) {
        this.k = popupWindow$OnDismissListener0;
    }

    public void l() {
        if(!this.o()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public void m(int v, int v1) {
        if(!this.p(v, v1)) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    private void n(int v, int v1, boolean z, boolean z1) {
        MenuPopup menuPopup0 = this.e();
        menuPopup0.x(z1);
        if(z) {
            if((GravityCompat.d(this.g, this.f.getLayoutDirection()) & 7) == 5) {
                v -= this.f.getWidth();
            }
            menuPopup0.v(v);
            menuPopup0.y(v1);
            int v2 = (int)(this.a.getResources().getDisplayMetrics().density * 48.0f / 2.0f);
            menuPopup0.s(new Rect(v - v2, v1 - v2, v + v2, v1 + v2));
        }
        menuPopup0.show();
    }

    public boolean o() {
        if(this.f()) {
            return true;
        }
        if(this.f == null) {
            return false;
        }
        this.n(0, 0, false, false);
        return true;
    }

    public boolean p(int v, int v1) {
        if(this.f()) {
            return true;
        }
        if(this.f == null) {
            return false;
        }
        this.n(v, v1, true, true);
        return true;
    }

    class androidx.appcompat.view.menu.MenuPopupHelper.1 implements PopupWindow.OnDismissListener {
        final MenuPopupHelper a;

        @Override  // android.widget.PopupWindow$OnDismissListener
        public void onDismiss() {
            MenuPopupHelper.this.g();
        }
    }

}

