package androidx.compose.foundation.layout;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment.Horizontal;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.VerticalAlignmentLine;
import kotlin.jvm.functions.Function1;
import y4.l;

@LayoutScopeMarker
@Immutable
public interface ColumnScope {
    public static final class DefaultImpls {
        public static Modifier a(ColumnScope columnScope0, Modifier modifier0, float f, boolean z, int v, Object object0) {
            return d.a(columnScope0, modifier0, f, z, v, object0);
        }
    }

    @Stable
    @l
    Modifier a(@l Modifier arg1, @l Function1 arg2);

    @Stable
    @l
    Modifier b(@l Modifier arg1, float arg2, boolean arg3);

    @Stable
    @l
    Modifier c(@l Modifier arg1, @l VerticalAlignmentLine arg2);

    @Stable
    @l
    Modifier d(@l Modifier arg1, @l Horizontal arg2);
}

