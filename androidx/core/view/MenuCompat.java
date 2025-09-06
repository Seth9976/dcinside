package androidx.core.view;

import android.os.Build.VERSION;
import android.view.Menu;
import android.view.MenuItem;
import androidx.annotation.ReplaceWith;
import androidx.annotation.RequiresApi;
import androidx.core.internal.view.SupportMenu;

public final class MenuCompat {
    @RequiresApi(28)
    static class Api28Impl {
        static void a(Menu menu0, boolean z) {
            menu0.setGroupDividerEnabled(z);
        }
    }

    public static void a(Menu menu0, boolean z) {
        if(menu0 instanceof SupportMenu) {
            ((SupportMenu)menu0).setGroupDividerEnabled(z);
            return;
        }
        if(Build.VERSION.SDK_INT >= 28) {
            Api28Impl.a(menu0, z);
        }
    }

    @ReplaceWith(expression = "item.setShowAsAction(actionEnum)")
    @Deprecated
    public static void b(MenuItem menuItem0, int v) {
        menuItem0.setShowAsAction(v);
    }
}

