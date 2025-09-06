package com.vungle.ads.internal.executor;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.w;
import y4.l;

public final class d implements a {
    public static final class com.vungle.ads.internal.executor.d.a {
        private com.vungle.ads.internal.executor.d.a() {
        }

        public com.vungle.ads.internal.executor.d.a(w w0) {
        }
    }

    @l
    private i API_EXECUTOR;
    @l
    private i BACKGROUND_EXECUTOR;
    @l
    public static final com.vungle.ads.internal.executor.d.a Companion = null;
    @l
    private i DOWNLOADER_EXECUTOR;
    @l
    private i IO_EXECUTOR;
    private static final int IO_KEEP_ALIVE_TIME_SECONDS = 5;
    private static final int JOBS_KEEP_ALIVE_TIME_SECONDS = 1;
    @l
    private i JOB_EXECUTOR;
    @l
    private i LOGGER_EXECUTOR;
    private final int NUMBER_OF_CORES;
    @l
    private i OFFLOAD_EXECUTOR;
    private static final int SINGLE_CORE_POOL_SIZE = 1;
    @l
    private i UA_EXECUTOR;
    private static final int VUNGLE_KEEP_ALIVE_TIME_SECONDS = 10;

    static {
        d.Companion = new com.vungle.ads.internal.executor.d.a(null);
    }

    public d() {
        this.NUMBER_OF_CORES = Runtime.getRuntime().availableProcessors();
        TimeUnit timeUnit0 = TimeUnit.SECONDS;
        this.JOB_EXECUTOR = new i(1, 1, 1L, timeUnit0, new LinkedBlockingQueue(), new c("vng_jr"));
        this.IO_EXECUTOR = new i(1, 1, 5L, timeUnit0, new LinkedBlockingQueue(), new c("vng_io"));
        this.API_EXECUTOR = new i(1, 1, 10L, timeUnit0, new LinkedBlockingQueue(), new c("vng_api"));
        this.LOGGER_EXECUTOR = new i(1, 1, 10L, timeUnit0, new LinkedBlockingQueue(), new c("vng_logger"));
        this.BACKGROUND_EXECUTOR = new i(1, 1, 10L, timeUnit0, new LinkedBlockingQueue(), new c("vng_background"));
        this.UA_EXECUTOR = new i(1, 1, 10L, timeUnit0, new LinkedBlockingQueue(), new c("vng_ua"));
        this.DOWNLOADER_EXECUTOR = new i(4, 4, 1L, timeUnit0, new PriorityBlockingQueue(), new c("vng_down"));
        this.OFFLOAD_EXECUTOR = new i(1, 1, 10L, timeUnit0, new LinkedBlockingQueue(), new c("vng_ol"));
    }

    @Override  // com.vungle.ads.internal.executor.a
    @l
    public i getApiExecutor() {
        return this.API_EXECUTOR;
    }

    @Override  // com.vungle.ads.internal.executor.a
    @l
    public i getBackgroundExecutor() {
        return this.BACKGROUND_EXECUTOR;
    }

    @Override  // com.vungle.ads.internal.executor.a
    @l
    public i getDownloaderExecutor() {
        return this.DOWNLOADER_EXECUTOR;
    }

    @Override  // com.vungle.ads.internal.executor.a
    @l
    public i getIoExecutor() {
        return this.IO_EXECUTOR;
    }

    @Override  // com.vungle.ads.internal.executor.a
    @l
    public i getJobExecutor() {
        return this.JOB_EXECUTOR;
    }

    @Override  // com.vungle.ads.internal.executor.a
    @l
    public i getLoggerExecutor() {
        return this.LOGGER_EXECUTOR;
    }

    @Override  // com.vungle.ads.internal.executor.a
    @l
    public i getOffloadExecutor() {
        return this.OFFLOAD_EXECUTOR;
    }

    @Override  // com.vungle.ads.internal.executor.a
    @l
    public i getUaExecutor() {
        return this.UA_EXECUTOR;
    }
}

