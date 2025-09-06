package androidx.media3.exoplayer.offline;

import android.util.SparseArray;
import androidx.media3.common.MediaItem.Builder;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.cache.CacheDataSource.Factory;
import androidx.media3.exoplayer.dash.offline.DashDownloader;
import androidx.media3.exoplayer.dash.offline.a;
import java.lang.reflect.Constructor;
import java.util.concurrent.Executor;

@UnstableApi
public class DefaultDownloaderFactory implements DownloaderFactory {
    private final Factory a;
    private final Executor b;
    private static final SparseArray c;

    static {
        DefaultDownloaderFactory.c = DefaultDownloaderFactory.c();
    }

    @Deprecated
    public DefaultDownloaderFactory(Factory cacheDataSource$Factory0) {
        this(cacheDataSource$Factory0, new a());
    }

    public DefaultDownloaderFactory(Factory cacheDataSource$Factory0, Executor executor0) {
        this.a = (Factory)Assertions.g(cacheDataSource$Factory0);
        this.b = (Executor)Assertions.g(executor0);
    }

    @Override  // androidx.media3.exoplayer.offline.DownloaderFactory
    public Downloader a(DownloadRequest downloadRequest0) {
        int v = Util.Y0(downloadRequest0.b, downloadRequest0.c);
        switch(v) {
            case 0: 
            case 1: 
            case 2: {
                return this.b(downloadRequest0, v);
            }
            case 4: {
                return new ProgressiveDownloader(new Builder().M(downloadRequest0.b).l(downloadRequest0.f).a(), this.a, this.b);
            }
            default: {
                throw new IllegalArgumentException("Unsupported type: " + v);
            }
        }
    }

    private Downloader b(DownloadRequest downloadRequest0, int v) {
        Constructor constructor0 = (Constructor)DefaultDownloaderFactory.c.get(v);
        if(constructor0 != null) {
            MediaItem mediaItem0 = new Builder().M(downloadRequest0.b).I(downloadRequest0.d).l(downloadRequest0.f).a();
            try {
                return (Downloader)constructor0.newInstance(mediaItem0, this.a, this.b);
            }
            catch(Exception exception0) {
                throw new IllegalStateException("Failed to instantiate downloader for content type " + v, exception0);
            }
        }
        throw new IllegalStateException("Module missing for content type " + v);
    }

    private static SparseArray c() {
        SparseArray sparseArray0 = new SparseArray();
        try {
            sparseArray0.put(0, DefaultDownloaderFactory.d(DashDownloader.class));
        }
        catch(ClassNotFoundException unused_ex) {
        }
        try {
            sparseArray0.put(2, DefaultDownloaderFactory.d(Class.forName("androidx.media3.exoplayer.hls.offline.HlsDownloader")));
        }
        catch(ClassNotFoundException unused_ex) {
        }
        try {
            sparseArray0.put(1, DefaultDownloaderFactory.d(Class.forName("androidx.media3.exoplayer.smoothstreaming.offline.SsDownloader")));
        }
        catch(ClassNotFoundException unused_ex) {
        }
        return sparseArray0;
    }

    private static Constructor d(Class class0) {
        try {
            return class0.asSubclass(Downloader.class).getConstructor(MediaItem.class, Factory.class, Executor.class);
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            throw new IllegalStateException("Downloader constructor missing", noSuchMethodException0);
        }
    }
}

