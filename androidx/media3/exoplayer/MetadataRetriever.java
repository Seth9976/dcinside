package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.exoplayer.source.MediaPeriod.Callback;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource.Factory;
import androidx.media3.exoplayer.source.MediaSource.MediaPeriodId;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.SequenceableLoader;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.DefaultAllocator;
import androidx.media3.extractor.DefaultExtractorsFactory;
import com.google.common.util.concurrent.O0;
import com.google.common.util.concurrent.t0;

@UnstableApi
public final class MetadataRetriever {
    static final class MetadataRetrieverInternal {
        final class MediaSourceHandlerCallback implements Handler.Callback {
            final class MediaSourceCaller implements androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller {
                final class MediaPeriodCallback implements Callback {
                    final MediaSourceCaller a;

                    private MediaPeriodCallback() {
                    }

                    MediaPeriodCallback(androidx.media3.exoplayer.MetadataRetriever.1 metadataRetriever$10) {
                    }

                    public void a(MediaPeriod mediaPeriod0) {
                        MetadataRetrieverInternal.this.c.c(3).a();
                    }

                    @Override  // androidx.media3.exoplayer.source.MediaPeriod$Callback
                    public void h(MediaPeriod mediaPeriod0) {
                        TrackGroupArray trackGroupArray0 = mediaPeriod0.n();
                        MetadataRetrieverInternal.this.d.B(trackGroupArray0);
                        MetadataRetrieverInternal.this.c.c(4).a();
                    }

                    @Override  // androidx.media3.exoplayer.source.SequenceableLoader$Callback
                    public void l(SequenceableLoader sequenceableLoader0) {
                        this.a(((MediaPeriod)sequenceableLoader0));
                    }
                }

                private final MediaPeriodCallback a;
                private final Allocator b;
                private boolean c;
                final MediaSourceHandlerCallback d;

                public MediaSourceCaller() {
                    this.a = new MediaPeriodCallback(this, null);
                    this.b = new DefaultAllocator(true, 0x10000);
                }

                @Override  // androidx.media3.exoplayer.source.MediaSource$MediaSourceCaller
                public void H(MediaSource mediaSource0, Timeline timeline0) {
                    if(this.c) {
                        return;
                    }
                    this.c = true;
                    MediaPeriod mediaPeriod0 = mediaSource0.C(new MediaPeriodId(timeline0.s(0)), this.b, 0L);
                    MediaSourceHandlerCallback.this.c = mediaPeriod0;
                    MediaSourceHandlerCallback.this.c.t(this.a, 0L);
                }
            }

            private final MediaSourceCaller a;
            private MediaSource b;
            private MediaPeriod c;
            final MetadataRetrieverInternal d;
            private static final int e = 100;

            public MediaSourceHandlerCallback() {
                this.a = new MediaSourceCaller(this);
            }

            @Override  // android.os.Handler$Callback
            public boolean handleMessage(Message message0) {
                switch(message0.what) {
                    case 1: {
                        MediaSource mediaSource0 = MetadataRetrieverInternal.this.a.g(((MediaItem)message0.obj));
                        this.b = mediaSource0;
                        mediaSource0.I(this.a, null, PlayerId.d);
                        MetadataRetrieverInternal.this.c.m(2);
                        return true;
                    }
                    case 2: {
                        try {
                            MediaPeriod mediaPeriod0 = this.c;
                            if(mediaPeriod0 == null) {
                                ((MediaSource)Assertions.g(this.b)).w();
                            }
                            else {
                                mediaPeriod0.s();
                            }
                            MetadataRetrieverInternal.this.c.a(2, 100);
                            return true;
                        }
                        catch(Exception exception0) {
                        }
                        MetadataRetrieverInternal.this.d.C(exception0);
                        MetadataRetrieverInternal.this.c.c(4).a();
                        return true;
                    }
                    case 3: {
                        ((MediaPeriod)Assertions.g(this.c)).f(new Builder().f(0L).d());
                        return true;
                    }
                    case 4: {
                        if(this.c != null) {
                            ((MediaSource)Assertions.g(this.b)).r(this.c);
                        }
                        ((MediaSource)Assertions.g(this.b)).u(this.a);
                        MetadataRetrieverInternal.this.c.f(null);
                        MetadataRetrieverInternal.this.b.quit();
                        return true;
                    }
                    default: {
                        return false;
                    }
                }
            }
        }

        private final Factory a;
        private final HandlerThread b;
        private final HandlerWrapper c;
        private final O0 d;
        private static final int e = 1;
        private static final int f = 2;
        private static final int g = 3;
        private static final int h = 4;

        public MetadataRetrieverInternal(Factory mediaSource$Factory0, Clock clock0) {
            this.a = mediaSource$Factory0;
            HandlerThread handlerThread0 = new HandlerThread("ExoPlayer:MetadataRetriever");
            this.b = handlerThread0;
            handlerThread0.start();
            this.c = clock0.c(handlerThread0.getLooper(), new MediaSourceHandlerCallback(this));
            this.d = O0.F();
        }

        public t0 e(MediaItem mediaItem0) {
            this.c.e(1, mediaItem0).a();
            return this.d;
        }
    }

    public static t0 a(Context context0, MediaItem mediaItem0) {
        return MetadataRetriever.b(context0, mediaItem0, Clock.a);
    }

    @VisibleForTesting
    static t0 b(Context context0, MediaItem mediaItem0, Clock clock0) {
        return MetadataRetriever.d(new DefaultMediaSourceFactory(context0, new DefaultExtractorsFactory().t(6)), mediaItem0, clock0);
    }

    public static t0 c(Factory mediaSource$Factory0, MediaItem mediaItem0) {
        return MetadataRetriever.d(mediaSource$Factory0, mediaItem0, Clock.a);
    }

    private static t0 d(Factory mediaSource$Factory0, MediaItem mediaItem0, Clock clock0) {
        return new MetadataRetrieverInternal(mediaSource$Factory0, clock0).e(mediaItem0);
    }

    class androidx.media3.exoplayer.MetadataRetriever.1 {
    }

}

