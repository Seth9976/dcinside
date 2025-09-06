package androidx.core.internal.view;

import android.view.Menu;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.c})
public interface SupportMenu extends Menu {
    public static final int a = 0xFFFF;
    public static final int b = 0;
    public static final int c = 0xFFFF0000;
    public static final int d = 16;
    public static final int e = 0x1100F;
    public static final int f = 4;

    @Override  // android.view.Menu
    void setGroupDividerEnabled(boolean arg1);
}

