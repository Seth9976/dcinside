package androidx.media3.exoplayer.video;

import android.graphics.Bitmap;
import android.view.Surface;
import androidx.annotation.FloatRange;
import androidx.media3.common.Format;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Size;
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
public interface VideoSink {
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface InputType {
    }

    public interface Listener {
        public static final Listener a;

        static {
            Listener.a = new Listener() {
                @Override  // androidx.media3.exoplayer.video.VideoSink$Listener
                public void a(VideoSink videoSink0) {
                }

                @Override  // androidx.media3.exoplayer.video.VideoSink$Listener
                public void b(VideoSink videoSink0, VideoSinkException videoSink$VideoSinkException0) {
                }

                @Override  // androidx.media3.exoplayer.video.VideoSink$Listener
                public void c(VideoSink videoSink0) {
                }

                @Override  // androidx.media3.exoplayer.video.VideoSink$Listener
                public void d(VideoSink videoSink0, VideoSize videoSize0) {
                }
            };
        }

        void a(VideoSink arg1);

        void b(VideoSink arg1, VideoSinkException arg2);

        void c(VideoSink arg1);

        void d(VideoSink arg1, VideoSize arg2);
    }

    public static final class VideoSinkException extends Exception {
        public final Format a;

        public VideoSinkException(Throwable throwable0, Format format0) {
            super(throwable0);
            this.a = format0;
        }
    }

    public static final int a = 1;
    public static final int b = 2;

    void K(List arg1);

    Surface a();

    boolean b();

    void c(Surface arg1, Size arg2);

    void d(long arg1, long arg2) throws VideoSinkException;

    void e(VideoFrameMetadataListener arg1);

    void f();

    void g();

    long i(long arg1, boolean arg2);

    boolean isInitialized();

    boolean isReady();

    void j();

    void k(long arg1, long arg2);

    void l(Format arg1) throws VideoSinkException;

    void m(boolean arg1);

    boolean o(Bitmap arg1, TimestampIterator arg2);

    void p(@FloatRange(from = 0.0, fromInclusive = false) float arg1);

    void r(Listener arg1, Executor arg2);

    void release();

    void s(int arg1, Format arg2);

    boolean t();

    void u();

    void w();

    void x(boolean arg1);

    void y(List arg1);
}

