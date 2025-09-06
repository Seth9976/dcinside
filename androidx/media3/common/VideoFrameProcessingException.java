package androidx.media3.common;

import androidx.media3.common.util.UnstableApi;

@UnstableApi
public final class VideoFrameProcessingException extends Exception {
    public final long a;

    public VideoFrameProcessingException(String s) {
        this(s, 0x8000000000000001L);
    }

    public VideoFrameProcessingException(String s, long v) {
        super(s);
        this.a = v;
    }

    public VideoFrameProcessingException(String s, Throwable throwable0) {
        this(s, throwable0, 0x8000000000000001L);
    }

    public VideoFrameProcessingException(String s, Throwable throwable0, long v) {
        super(s, throwable0);
        this.a = v;
    }

    public VideoFrameProcessingException(Throwable throwable0) {
        this(throwable0, 0x8000000000000001L);
    }

    public VideoFrameProcessingException(Throwable throwable0, long v) {
        super(throwable0);
        this.a = v;
    }

    public static VideoFrameProcessingException a(Exception exception0) {
        return VideoFrameProcessingException.b(exception0, 0x8000000000000001L);
    }

    // 去混淆评级： 低(20)
    public static VideoFrameProcessingException b(Exception exception0, long v) {
        return exception0 instanceof VideoFrameProcessingException ? ((VideoFrameProcessingException)exception0) : new VideoFrameProcessingException(exception0, v);
    }
}

