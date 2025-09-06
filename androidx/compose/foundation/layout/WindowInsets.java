package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import y4.l;

@Stable
public interface WindowInsets {
    public static final class Companion {
        static final Companion a;

        static {
            Companion.a = new Companion();
        }
    }

    @l
    public static final Companion a;

    static {
        WindowInsets.a = Companion.a;
    }

    int a(@l Density arg1);

    int b(@l Density arg1, @l LayoutDirection arg2);

    int c(@l Density arg1);

    int d(@l Density arg1, @l LayoutDirection arg2);
}

