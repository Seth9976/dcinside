package com.vungle.ads.internal.downloader;

import com.vungle.ads.Y0;
import com.vungle.ads.internal.protos.Sdk.SDKMetric.b;
import com.vungle.ads.internal.util.o;
import com.vungle.ads.r;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class d {
    public static enum a {
        CRITICAL(0x80000001),
        HIGHEST(0),
        HIGH(1),
        LOWEST(0x7FFFFFFF);

        private final int priority;

        private static final a[] $values() [...] // Inlined contents

        private a(int v1) {
            this.priority = v1;
        }

        public final int getPriority() {
            return this.priority;
        }
    }

    @l
    private final com.vungle.ads.internal.model.a asset;
    @l
    private final AtomicBoolean cancelled;
    @m
    private Y0 downloadDuration;
    @m
    private final o logEntry;
    @l
    private final a priority;

    public d(@l a d$a0, @l com.vungle.ads.internal.model.a a0, @m o o0) {
        L.p(d$a0, "priority");
        L.p(a0, "asset");
        super();
        this.priority = d$a0;
        this.asset = a0;
        this.logEntry = o0;
        this.cancelled = new AtomicBoolean(false);
    }

    public d(a d$a0, com.vungle.ads.internal.model.a a0, o o0, int v, w w0) {
        if((v & 4) != 0) {
            o0 = null;
        }
        this(d$a0, a0, o0);
    }

    public final void cancel() {
        this.cancelled.set(true);
    }

    @l
    public final com.vungle.ads.internal.model.a getAsset() {
        return this.asset;
    }

    @m
    public final o getLogEntry$vungle_ads_release() {
        return this.logEntry;
    }

    public final int getPriority() {
        return this.priority.getPriority();
    }

    @l
    public final a getPriority() {
        return this.priority;
    }

    public final boolean isCancelled() {
        return this.cancelled.get();
    }

    public final boolean isHtmlTemplate() {
        return L.g(this.asset.getAdIdentifier(), "vmURL");
    }

    public final boolean isMainVideo() {
        return L.g(this.asset.getAdIdentifier(), "MAIN_VIDEO");
    }

    public final boolean isTemplate() {
        return this.asset.getFileType() == com.vungle.ads.internal.model.a.a.ZIP || this.isHtmlTemplate();
    }

    public final void startRecord() {
        Y0 y00 = new Y0(b.TEMPLATE_DOWNLOAD_DURATION_MS);
        this.downloadDuration = y00;
        y00.markStart();
    }

    public final void stopRecord() {
        Y0 y00 = this.downloadDuration;
        if(y00 != null) {
            y00.markEnd();
            String s = this.asset.getServerPath();
            r.INSTANCE.logMetric$vungle_ads_release(y00, this.logEntry, s);
        }
    }

    @Override
    @l
    public String toString() {
        return "DownloadRequest{, priority=" + this.priority + ", url=\'" + this.asset.getServerPath() + "\', path=\'" + this.asset.getLocalPath() + "\', cancelled=" + this.cancelled + ", logEntry=" + this.logEntry + '}';
    }
}

