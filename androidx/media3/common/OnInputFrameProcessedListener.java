package androidx.media3.common;

import androidx.media3.common.util.UnstableApi;

@UnstableApi
public interface OnInputFrameProcessedListener {
    void a(int arg1, long arg2) throws VideoFrameProcessingException;
}

