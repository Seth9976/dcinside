package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;
import y4.l;
import y4.m;

@Stable
public interface Indication {
    @Composable
    @l
    IndicationInstance a(@l InteractionSource arg1, @m Composer arg2, int arg3);
}

