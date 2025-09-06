package androidx.media3.common;

import android.content.Context;
import androidx.media3.common.util.UnstableApi;
import java.util.List;
import java.util.concurrent.Executor;

@UnstableApi
public interface PreviewingVideoGraph extends VideoGraph {
    public interface Factory {
        PreviewingVideoGraph a(Context arg1, ColorInfo arg2, DebugViewProvider arg3, Listener arg4, Executor arg5, List arg6, long arg7) throws VideoFrameProcessingException;
    }

    void c(long arg1);
}

