package androidx.media3.exoplayer.text;

import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.UnstableApi;
import java.util.List;

@UnstableApi
public interface TextOutput {
    @Deprecated
    void r(List arg1);

    void w(CueGroup arg1);
}

