package androidx.media3.common;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.media3.common.util.TimestampIterator;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.concurrent.Executor;

@UnstableApi
public interface VideoFrameProcessor {
    public interface Factory {
        VideoFrameProcessor a(Context arg1, DebugViewProvider arg2, ColorInfo arg3, boolean arg4, Executor arg5, Listener arg6) throws VideoFrameProcessingException;
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface InputType {
    }

    public interface Listener {
        void a(VideoFrameProcessingException arg1);

        void b(long arg1);

        void d(int arg1, int arg2);

        void e();

        void f(int arg1, List arg2, FrameInfo arg3);
    }

    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    public static final long d = -1L;
    public static final long e = -2L;

    Surface a();

    void b(@Nullable SurfaceInfo arg1);

    void c(long arg1);

    boolean d(int arg1, long arg2);

    void e(OnInputFrameProcessedListener arg1);

    boolean f(Bitmap arg1, TimestampIterator arg2);

    void flush();

    void g();

    void h(int arg1, List arg2, FrameInfo arg3);

    boolean i();

    int j();

    void release();
}

