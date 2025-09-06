package com.vungle.ads.internal.util;

import android.content.Context;
import android.os.StatFs;
import java.io.File;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class q {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @l
    private static final String CLEVER_CACHE_FOLDER = "clever_cache";
    @l
    public static final a Companion = null;
    @l
    private static final String DOWNLOADS_FOLDER = "downloads";
    @l
    private static final String JS_FOLDER = "js";
    private static final long UNKNOWN_SIZE = -1L;
    @l
    private static final String VUNGLE_FOLDER = "vungle_cache";
    @l
    private final File cleverCacheDir;
    @l
    private final Context context;
    @l
    private final File downloadsDir;
    @l
    private final File jsDir;
    @l
    private final File vungleDir;

    static {
        q.Companion = new a(null);
    }

    public q(@l Context context0) {
        L.p(context0, "context");
        super();
        this.context = context0;
        File file0 = new File(context0.getNoBackupFilesDir(), "vungle_cache");
        this.vungleDir = file0;
        File file1 = new File(file0, "downloads");
        this.downloadsDir = file1;
        File file2 = new File(file0, "js");
        this.jsDir = file2;
        File file3 = new File(file0, "clever_cache");
        this.cleverCacheDir = file3;
        for(Object object0: u.O(new File[]{file0, file1, file2, file3})) {
            File file4 = (File)object0;
            if(!file4.exists()) {
                file4.mkdirs();
            }
        }
    }

    public final long getAvailableBytes(@l String s) {
        L.p(s, "path");
        try {
            return new StatFs(s).getAvailableBytes();
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            p.Companion.w("PathProvider", "Failed to get available bytes " + illegalArgumentException0.getMessage());
            return -1L;
        }
    }

    @l
    public final File getCleverCacheDir() {
        if(!this.cleverCacheDir.exists()) {
            this.cleverCacheDir.mkdirs();
        }
        return this.cleverCacheDir;
    }

    @l
    public final Context getContext() {
        return this.context;
    }

    @l
    public final File getDownloadDir() {
        if(!this.downloadsDir.exists()) {
            this.downloadsDir.mkdirs();
        }
        return this.downloadsDir;
    }

    @m
    public final File getDownloadsDirForAd(@m String s) {
        if(s != null && s.length() != 0) {
            File file0 = new File(this.getDownloadDir().getPath() + "/" + s);
            if(!file0.exists()) {
                file0.mkdirs();
            }
            return file0;
        }
        return null;
    }

    @l
    public final File getJsAssetDir(@l String s) {
        L.p(s, "jsVersion");
        File file0 = new File(this.getJsDir(), s);
        if(!file0.exists()) {
            file0.mkdirs();
        }
        return file0;
    }

    @l
    public final File getJsDir() {
        if(!this.jsDir.exists()) {
            this.jsDir.mkdirs();
        }
        return this.jsDir;
    }

    @l
    public final File getSharedPrefsDir() {
        File file0 = this.context.getNoBackupFilesDir();
        L.o(file0, "{\n        context.noBackupFilesDir\n    }");
        return file0;
    }

    @l
    public final File getUnclosedAdFile(@l String s) {
        L.p(s, "name");
        return new File(this.getSharedPrefsDir(), s);
    }

    @l
    public final File getVungleDir() {
        if(!this.vungleDir.exists()) {
            this.vungleDir.mkdirs();
        }
        return this.vungleDir;
    }
}

