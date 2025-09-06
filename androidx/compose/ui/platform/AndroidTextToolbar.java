package androidx.compose.ui.platform;

import A3.a;
import android.os.Build.VERSION;
import android.view.ActionMode;
import android.view.View;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.actionmodecallback.FloatingTextActionModeCallback;
import androidx.compose.ui.platform.actionmodecallback.PrimaryTextActionModeCallback;
import androidx.compose.ui.platform.actionmodecallback.TextActionModeCallback;
import kotlin.S0;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class AndroidTextToolbar implements TextToolbar {
    @l
    private final View a;
    @m
    private ActionMode b;
    @l
    private final TextActionModeCallback c;
    @l
    private TextToolbarStatus d;

    public AndroidTextToolbar(@l View view0) {
        L.p(view0, "view");
        super();
        this.a = view0;
        this.c = new TextActionModeCallback(new a() {
            final AndroidTextToolbar e;

            {
                this.e = androidTextToolbar0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                this.e.b = null;
            }
        }, null, null, null, null, null, 62, null);
        this.d = TextToolbarStatus.b;
    }

    @Override  // androidx.compose.ui.platform.TextToolbar
    public void a() {
        this.d = TextToolbarStatus.b;
        ActionMode actionMode0 = this.b;
        if(actionMode0 != null) {
            actionMode0.finish();
        }
        this.b = null;
    }

    @Override  // androidx.compose.ui.platform.TextToolbar
    public void b(@l Rect rect0, @m a a0, @m a a1, @m a a2, @m a a3) {
        ActionMode actionMode1;
        L.p(rect0, "rect");
        this.c.q(rect0);
        this.c.m(a0);
        this.c.n(a2);
        this.c.o(a1);
        this.c.p(a3);
        ActionMode actionMode0 = this.b;
        if(actionMode0 == null) {
            this.d = TextToolbarStatus.a;
            if(Build.VERSION.SDK_INT >= 23) {
                FloatingTextActionModeCallback floatingTextActionModeCallback0 = new FloatingTextActionModeCallback(this.c);
                actionMode1 = TextToolbarHelperMethods.a.b(this.a, floatingTextActionModeCallback0, 1);
            }
            else {
                PrimaryTextActionModeCallback primaryTextActionModeCallback0 = new PrimaryTextActionModeCallback(this.c);
                actionMode1 = this.a.startActionMode(primaryTextActionModeCallback0);
            }
            this.b = actionMode1;
            return;
        }
        if(actionMode0 != null) {
            actionMode0.invalidate();
        }
    }

    @Override  // androidx.compose.ui.platform.TextToolbar
    @l
    public TextToolbarStatus getStatus() {
        return this.d;
    }
}

