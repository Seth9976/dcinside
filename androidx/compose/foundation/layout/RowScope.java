package androidx.compose.foundation.layout;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment.Vertical;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import kotlin.jvm.functions.Function1;
import y4.l;

@LayoutScopeMarker
@Immutable
public interface RowScope {
    public static final class DefaultImpls {
        public static Modifier a(RowScope rowScope0, Modifier modifier0, float f, boolean z, int v, Object object0) {
            return e.a(rowScope0, modifier0, f, z, v, object0);
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
    Modifier c(@l Modifier arg1, @l HorizontalAlignmentLine arg2);

    @Stable
    @l
    Modifier d(@l Modifier arg1, @l Vertical arg2);

    @Stable
    @l
    Modifier e(@l Modifier arg1);
}

