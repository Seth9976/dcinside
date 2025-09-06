package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import androidx.annotation.VisibleForTesting;
import y4.l;

@VisibleForTesting(otherwise = 2)
public interface PopupLayoutHelper {
    void a(@l WindowManager arg1, @l View arg2, @l ViewGroup.LayoutParams arg3);

    void b(@l View arg1, int arg2, int arg3);

    void c(@l View arg1, @l Rect arg2);
}

