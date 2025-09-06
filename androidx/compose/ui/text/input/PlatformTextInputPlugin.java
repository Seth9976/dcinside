package androidx.compose.ui.text.input;

import android.view.View;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.ExperimentalTextApi;
import y4.l;

@Immutable
@ExperimentalTextApi
public interface PlatformTextInputPlugin {
    @l
    PlatformTextInputAdapter a(@l PlatformTextInput arg1, @l View arg2);
}

