package androidx.compose.foundation.layout;

import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.a;
import kotlin.coroutines.d;
import y4.l;

final class DoNothingNestedScrollConnection implements NestedScrollConnection {
    @l
    public static final DoNothingNestedScrollConnection a;

    static {
        DoNothingNestedScrollConnection.a = new DoNothingNestedScrollConnection();
    }

    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public Object a(long v, long v1, d d0) {
        return a.a(this, v, v1, d0);
    }

    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public long b(long v, long v1, int v2) {
        return a.b(this, v, v1, v2);
    }

    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public Object d(long v, d d0) {
        return a.c(this, v, d0);
    }

    @Override  // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    public long i(long v, int v1) {
        return a.d(this, v, v1);
    }
}

