package androidx.core.widget;

import android.widget.ListView;
import androidx.annotation.ReplaceWith;

@Deprecated
public final class ListViewCompat {
    @ReplaceWith(expression = "listView.canScrollList(direction)")
    @Deprecated
    public static boolean a(ListView listView0, int v) {
        return listView0.canScrollList(v);
    }

    @ReplaceWith(expression = "listView.scrollListBy(y)")
    @Deprecated
    public static void b(ListView listView0, int v) {
        listView0.scrollListBy(v);
    }
}

