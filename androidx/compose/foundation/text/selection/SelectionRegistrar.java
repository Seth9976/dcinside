package androidx.compose.foundation.text.selection;

import androidx.compose.ui.layout.LayoutCoordinates;
import java.util.Map;
import y4.l;

public interface SelectionRegistrar {
    public static final class Companion {
        static final Companion a;
        public static final long b;

        static {
            Companion.a = new Companion();
        }
    }

    @l
    public static final Companion a;
    public static final long b;

    static {
        SelectionRegistrar.a = Companion.a;
    }

    void a(@l LayoutCoordinates arg1, long arg2, @l SelectionAdjustment arg3);

    void b(long arg1);

    void c(@l Selectable arg1);

    void d();

    long e();

    @l
    Map f();

    boolean g(@l LayoutCoordinates arg1, long arg2, long arg3, boolean arg4, @l SelectionAdjustment arg5);

    void h(long arg1);

    void i(long arg1);

    @l
    Selectable j(@l Selectable arg1);
}

