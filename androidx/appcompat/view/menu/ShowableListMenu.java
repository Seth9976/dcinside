package androidx.appcompat.view.menu;

import android.widget.ListView;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.c})
public interface ShowableListMenu {
    boolean b();

    void dismiss();

    ListView j();

    void show();
}

