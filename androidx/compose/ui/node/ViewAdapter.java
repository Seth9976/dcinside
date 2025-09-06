package androidx.compose.ui.node;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import y4.l;

@RestrictTo({Scope.b})
public interface ViewAdapter {
    void a(@l View arg1, @l ViewGroup arg2);

    void b(@l View arg1, @l ViewGroup arg2);

    void c(@l View arg1, @l ViewGroup arg2);

    int getId();
}

