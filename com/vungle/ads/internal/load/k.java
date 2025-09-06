package com.vungle.ads.internal.load;

import com.vungle.ads.internal.downloader.d;
import com.vungle.ads.internal.downloader.e;
import com.vungle.ads.internal.executor.i;
import com.vungle.ads.internal.model.b;
import com.vungle.ads.internal.util.h;
import com.vungle.ads.internal.util.o;
import com.vungle.ads.internal.util.p;
import com.vungle.ads.internal.util.q;
import com.vungle.ads.u0;
import java.io.File;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class k {
    public interface a {
        void onDownloadResult(int arg1);
    }

    @l
    public static final k INSTANCE = null;
    public static final int MRAID_AVAILABLE = 13;
    public static final int MRAID_DOWNLOADED = 10;
    public static final int MRAID_DOWNLOAD_FAILED = 12;
    public static final int MRAID_INVALID_ENDPOINT = 11;
    @l
    private static final String TAG = "MraidJsLoader";
    @l
    private static final AtomicBoolean isDownloading;
    @l
    private static final CopyOnWriteArrayList listeners;

    static {
        k.INSTANCE = new k();
        k.isDownloading = new AtomicBoolean(false);
        k.listeners = new CopyOnWriteArrayList();
    }

    public final void downloadJs(@l q q0, @l e e0, @l i i0, @m a k$a0, @m b b0) {
        L.p(q0, "pathProvider");
        L.p(e0, "downloader");
        L.p(i0, "executor");
        i0.execute(() -> {
            public static final class com.vungle.ads.internal.load.k.b implements com.vungle.ads.internal.downloader.a {
                final b $advertisement;
                final i $executor;
                final File $jsPath;
                final File $mraidJsFile;

                com.vungle.ads.internal.load.k.b(i i0, b b0, File file0, File file1) {
                    this.$executor = i0;
                    this.$advertisement = b0;
                    this.$jsPath = file0;
                    this.$mraidJsFile = file1;
                    super();
                }

                @Override  // com.vungle.ads.internal.downloader.a
                public void onError(@m com.vungle.ads.internal.downloader.a.a a$a0, @l d d0) {
                    L.p(d0, "downloadRequest");
                    com.vungle.ads.internal.load.m m0 = () -> {
                        String s;
                        L.p(d0, "$downloadRequest");
                        L.p(this.$jsPath, "$jsPath");
                        try {
                            StringBuilder stringBuilder0 = new StringBuilder();
                            stringBuilder0.append("download mraid js error: ");
                            o o0 = null;
                            stringBuilder0.append((a$a0 == null ? null : a$a0.getServerCode()));
                            stringBuilder0.append(". Failed to load ");
                            stringBuilder0.append(d0.getAsset().getServerPath());
                            stringBuilder0.append(", reason: ");
                            if(a$a0 == null) {
                                s = null;
                            }
                            else {
                                Throwable throwable0 = a$a0.getCause();
                                s = throwable0 == null ? null : throwable0.getMessage();
                            }
                            stringBuilder0.append(s);
                            String s1 = stringBuilder0.toString();
                            p.Companion.d("MraidJsLoader", s1);
                            u0 u00 = new u0(com.vungle.ads.internal.protos.Sdk.SDKError.b.MRAID_DOWNLOAD_JS_ERROR, s1);
                            if(this.$advertisement != null) {
                                o0 = this.$advertisement.getLogEntry$vungle_ads_release();
                            }
                            u00.setLogEntry$vungle_ads_release(o0).logErrorNoReturnValue$vungle_ads_release();
                            h.deleteContents(this.$jsPath);
                        }
                        catch(Exception exception0) {
                            p.Companion.e("MraidJsLoader", "Failed to delete js assets", exception0);
                        }
                        finally {
                            k.INSTANCE.notifyListeners(12);
                        }
                    };
                    this.$executor.execute(m0);
                }

                // 检测为 Lambda 实现
                private static final void onError$lambda-0(com.vungle.ads.internal.downloader.a.a a$a0, d d0, b b0, File file0) [...]

                @Override  // com.vungle.ads.internal.downloader.a
                public void onSuccess(@l File file0, @l d d0) {
                    L.p(file0, "file");
                    L.p(d0, "downloadRequest");
                    com.vungle.ads.internal.load.l l0 = () -> {
                        L.p(file0, "$file");
                        L.p(this.$mraidJsFile, "$mraidJsFile");
                        L.p(this.$jsPath, "$jsPath");
                        try {
                            if(file0.exists() && file0.length() > 0L) {
                                k.INSTANCE.notifyListeners(10);
                                return;
                            }
                            new u0(com.vungle.ads.internal.protos.Sdk.SDKError.b.MRAID_JS_WRITE_FAILED, "Mraid js downloaded but write failure: " + this.$mraidJsFile.getAbsolutePath()).setLogEntry$vungle_ads_release((this.$advertisement == null ? null : this.$advertisement.getLogEntry$vungle_ads_release())).logErrorNoReturnValue$vungle_ads_release();
                            h.deleteContents(this.$jsPath);
                            k.INSTANCE.notifyListeners(12);
                            return;
                        }
                        catch(Exception exception0) {
                        }
                        p.Companion.e("MraidJsLoader", "Failed to delete js assets", exception0);
                        k.INSTANCE.notifyListeners(12);
                    };
                    this.$executor.execute(l0);
                }

                // 检测为 Lambda 实现
                private static final void onSuccess$lambda-1(File file0, File file1, b b0, File file2) [...]
            }

            L.p(q0, "$pathProvider");
            L.p(e0, "$downloader");
            L.p(i0, "$executor");
            try {
                if(k$a0 != null) {
                    k.listeners.add(k$a0);
                }
                if(k.isDownloading.getAndSet(true)) {
                    p.Companion.w("MraidJsLoader", "mraid js is downloading, waiting for the previous request.");
                    return;
                }
                String s = com.vungle.ads.internal.k.INSTANCE.getMraidEndpoint();
                o o0 = null;
                if(s != null && s.length() != 0) {
                    File file0 = new File(q0.getJsAssetDir("mraid_1"), "mraid.min.js");
                    if(file0.exists()) {
                        p.Companion.w("MraidJsLoader", "mraid js already downloaded");
                        k.INSTANCE.notifyListeners(13);
                        return;
                    }
                    File file1 = q0.getJsDir();
                    h.deleteContents(file1);
                    String s1 = file0.getAbsolutePath();
                    L.o(s1, "mraidJsFile.absolutePath");
                    com.vungle.ads.internal.model.a a0 = new com.vungle.ads.internal.model.a("mraid.min.js", s + "/mraid.min.js", s1, com.vungle.ads.internal.model.a.a.ASSET, true);
                    com.vungle.ads.internal.downloader.d.a d$a0 = com.vungle.ads.internal.downloader.d.a.HIGH;
                    if(b0 != null) {
                        o0 = b0.getLogEntry$vungle_ads_release();
                    }
                    e0.download(new d(d$a0, a0, o0), new com.vungle.ads.internal.load.k.b(i0, b0, file1, file0));
                    return;
                }
                u0 u00 = new u0(com.vungle.ads.internal.protos.Sdk.SDKError.b.MRAID_DOWNLOAD_JS_ERROR, "Mraid endpoint is empty");
                if(b0 != null) {
                    o0 = b0.getLogEntry$vungle_ads_release();
                }
                u00.setLogEntry$vungle_ads_release(o0).logErrorNoReturnValue$vungle_ads_release();
                k.INSTANCE.notifyListeners(11);
                return;
            }
            catch(Exception exception0) {
            }
            p.Companion.e("MraidJsLoader", "Failed to download mraid js", exception0);
        });
    }

    public static void downloadJs$default(k k0, q q0, e e0, i i0, a k$a0, b b0, int v, Object object0) {
        k0.downloadJs(q0, e0, i0, ((v & 8) == 0 ? k$a0 : null), ((v & 16) == 0 ? b0 : null));
    }

    // 检测为 Lambda 实现
    private static final void downloadJs$lambda-1(a k$a0, b b0, q q0, e e0, i i0) [...]

    private final void notifyListeners(int v) {
        for(Object object0: k.listeners) {
            ((a)object0).onDownloadResult(v);
        }
        k.listeners.clear();
        k.isDownloading.set(false);
    }
}

