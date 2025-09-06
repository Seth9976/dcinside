package androidx.compose.ui.platform.actionmodecallback;

import A3.a;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.annotation.VisibleForTesting;
import androidx.compose.ui.geometry.Rect;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class TextActionModeCallback {
    @m
    private final a a;
    @l
    private Rect b;
    @m
    private a c;
    @m
    private a d;
    @m
    private a e;
    @m
    private a f;

    public TextActionModeCallback() {
        this(null, null, null, null, null, null, 0x3F, null);
    }

    public TextActionModeCallback(@m a a0, @l Rect rect0, @m a a1, @m a a2, @m a a3, @m a a4) {
        L.p(rect0, "rect");
        super();
        this.a = a0;
        this.b = rect0;
        this.c = a1;
        this.d = a2;
        this.e = a3;
        this.f = a4;
    }

    public TextActionModeCallback(a a0, Rect rect0, a a1, a a2, a a3, a a4, int v, w w0) {
        if((v & 2) != 0) {
            rect0 = Rect.e.a();
        }
        this(((v & 1) == 0 ? a0 : null), rect0, ((v & 4) == 0 ? a1 : null), ((v & 8) == 0 ? a2 : null), ((v & 16) == 0 ? a3 : null), ((v & 0x20) == 0 ? a4 : null));
    }

    public final void a(@l Menu menu0, @l MenuItemOption menuItemOption0) {
        L.p(menu0, "menu");
        L.p(menuItemOption0, "item");
        menu0.add(0, menuItemOption0.b(), menuItemOption0.c(), menuItemOption0.d()).setShowAsAction(1);
    }

    private final void b(Menu menu0, MenuItemOption menuItemOption0, a a0) {
        if(a0 != null && menu0.findItem(menuItemOption0.b()) == null) {
            this.a(menu0, menuItemOption0);
            return;
        }
        if(a0 == null && menu0.findItem(menuItemOption0.b()) != null) {
            menu0.removeItem(menuItemOption0.b());
        }
    }

    @m
    public final a c() {
        return this.a;
    }

    @m
    public final a d() {
        return this.c;
    }

    @m
    public final a e() {
        return this.e;
    }

    @m
    public final a f() {
        return this.d;
    }

    @m
    public final a g() {
        return this.f;
    }

    @l
    public final Rect h() {
        return this.b;
    }

    public final boolean i(@m ActionMode actionMode0, @m MenuItem menuItem0) {
        L.m(menuItem0);
        int v = menuItem0.getItemId();
        if(v == MenuItemOption.c.b()) {
            a a0 = this.c;
            if(a0 == null) {
                goto label_21;
            }
            a0.invoke();
        }
        else {
            if(v == MenuItemOption.d.b()) {
                a a1 = this.d;
                if(a1 == null) {
                    goto label_21;
                }
                a1.invoke();
                goto label_21;
            }
            if(v == MenuItemOption.e.b()) {
                a a2 = this.e;
                if(a2 == null) {
                    goto label_21;
                }
                a2.invoke();
            }
            else if(v == MenuItemOption.f.b()) {
                a a3 = this.f;
                if(a3 != null) {
                    a3.invoke();
                }
            }
            else {
                return false;
            }
        }
    label_21:
        if(actionMode0 != null) {
            actionMode0.finish();
        }
        return true;
    }

    public final boolean j(@m ActionMode actionMode0, @m Menu menu0) {
        if(menu0 == null || actionMode0 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if(this.c != null) {
            this.a(menu0, MenuItemOption.c);
        }
        if(this.d != null) {
            this.a(menu0, MenuItemOption.d);
        }
        if(this.e != null) {
            this.a(menu0, MenuItemOption.e);
        }
        if(this.f != null) {
            this.a(menu0, MenuItemOption.f);
        }
        return true;
    }

    public final void k() {
        a a0 = this.a;
        if(a0 != null) {
            a0.invoke();
        }
    }

    public final boolean l(@m ActionMode actionMode0, @m Menu menu0) {
        if(actionMode0 != null && menu0 != null) {
            this.r(menu0);
            return true;
        }
        return false;
    }

    public final void m(@m a a0) {
        this.c = a0;
    }

    public final void n(@m a a0) {
        this.e = a0;
    }

    public final void o(@m a a0) {
        this.d = a0;
    }

    public final void p(@m a a0) {
        this.f = a0;
    }

    public final void q(@l Rect rect0) {
        L.p(rect0, "<set-?>");
        this.b = rect0;
    }

    @VisibleForTesting
    public final void r(@l Menu menu0) {
        L.p(menu0, "menu");
        this.b(menu0, MenuItemOption.c, this.c);
        this.b(menu0, MenuItemOption.d, this.d);
        this.b(menu0, MenuItemOption.e, this.e);
        this.b(menu0, MenuItemOption.f, this.f);
    }
}

