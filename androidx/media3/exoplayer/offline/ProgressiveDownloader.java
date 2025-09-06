package androidx.media3.exoplayer.offline;

import androidx.annotation.Nullable;
import androidx.media3.common.MediaItem;
import androidx.media3.common.PriorityTaskManager.PriorityTooLowException;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.RunnableFutureTask;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSpec.Builder;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.cache.CacheDataSource.Factory;
import androidx.media3.datasource.cache.CacheDataSource;
import androidx.media3.datasource.cache.CacheWriter;
import androidx.media3.exoplayer.dash.offline.a;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

@UnstableApi
public final class ProgressiveDownloader implements Downloader {
    private final Executor a;
    private final DataSpec b;
    private final CacheDataSource c;
    private final CacheWriter d;
    @Nullable
    private final PriorityTaskManager e;
    @Nullable
    private ProgressListener f;
    private volatile RunnableFutureTask g;
    private volatile boolean h;

    public ProgressiveDownloader(MediaItem mediaItem0, Factory cacheDataSource$Factory0) {
        this(mediaItem0, cacheDataSource$Factory0, new a());
    }

    public ProgressiveDownloader(MediaItem mediaItem0, Factory cacheDataSource$Factory0, Executor executor0) {
        this.a = (Executor)Assertions.g(executor0);
        Assertions.g(mediaItem0.b);
        DataSpec dataSpec0 = new Builder().j(mediaItem0.b.a).g(mediaItem0.b.f).c(4).a();
        this.b = dataSpec0;
        CacheDataSource cacheDataSource0 = cacheDataSource$Factory0.d();
        this.c = cacheDataSource0;
        this.d = new CacheWriter(cacheDataSource0, dataSpec0, null, (long v, long v1, long v2) -> {
            ProgressListener downloader$ProgressListener0 = this.f;
            if(downloader$ProgressListener0 == null) {
                return;
            }
            downloader$ProgressListener0.a(v, v1, (v == -1L || v == 0L ? -1.0f : ((float)v1) * 100.0f / ((float)v)));
        });
        this.e = cacheDataSource$Factory0.i();
    }

    @Override  // androidx.media3.exoplayer.offline.Downloader
    public void a(@Nullable ProgressListener downloader$ProgressListener0) throws IOException, InterruptedException {
        this.f = downloader$ProgressListener0;
        PriorityTaskManager priorityTaskManager0 = this.e;
        if(priorityTaskManager0 != null) {
            priorityTaskManager0.a(-4000);
        }
        boolean z = false;
        try {
            while(!z && !this.h) {
                this.g = new RunnableFutureTask() {
                    final ProgressiveDownloader h;

                    @Override  // androidx.media3.common.util.RunnableFutureTask
                    protected void c() {
                        ProgressiveDownloader.this.d.b();
                    }

                    @Override  // androidx.media3.common.util.RunnableFutureTask
                    protected Object d() throws Exception {
                        return this.f();
                    }

                    protected Void f() throws IOException {
                        ProgressiveDownloader.this.d.a();
                        return null;
                    }
                };
                PriorityTaskManager priorityTaskManager1 = this.e;
                if(priorityTaskManager1 != null) {
                    priorityTaskManager1.b(-4000);
                }
                this.a.execute(this.g);
                try {
                    this.g.get();
                    z = true;
                }
                catch(ExecutionException executionException0) {
                    Throwable throwable0 = (Throwable)Assertions.g(executionException0.getCause());
                    if(throwable0 instanceof PriorityTooLowException) {
                        continue;
                    }
                    if(throwable0 instanceof IOException) {
                        throw (IOException)throwable0;
                    }
                    Util.k2(throwable0);
                    continue;
                }
            }
        }
        finally {
            ((RunnableFutureTask)Assertions.g(this.g)).a();
            PriorityTaskManager priorityTaskManager2 = this.e;
            if(priorityTaskManager2 != null) {
                priorityTaskManager2.e(-4000);
            }
        }
    }

    @Override  // androidx.media3.exoplayer.offline.Downloader
    public void cancel() {
        this.h = true;
        RunnableFutureTask runnableFutureTask0 = this.g;
        if(runnableFutureTask0 != null) {
            runnableFutureTask0.cancel(true);
        }
    }

    // 检测为 Lambda 实现
    private void d(long v, long v1, long v2) [...]

    @Override  // androidx.media3.exoplayer.offline.Downloader
    public void remove() {
        String s = this.c.w().a(this.b);
        this.c.v().f(s);
    }
}

