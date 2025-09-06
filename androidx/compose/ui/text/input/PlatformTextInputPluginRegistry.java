package androidx.compose.ui.text.input;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.text.ExperimentalTextApi;
import y4.l;
import y4.m;

@Stable
@ExperimentalTextApi
public interface PlatformTextInputPluginRegistry {
    @Composable
    @l
    PlatformTextInputAdapter a(@l PlatformTextInputPlugin arg1, @m Composer arg2, int arg3);
}

