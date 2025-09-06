package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.core.graphics.TypefaceCompatUtil;
import androidx.core.os.TraceCompat;
import androidx.core.provider.FontRequest;
import androidx.core.provider.FontsContractCompat.FontFamilyResult;
import androidx.core.provider.FontsContractCompat.FontInfo;
import androidx.core.provider.FontsContractCompat;
import androidx.core.util.Preconditions;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

public class FontRequestEmojiCompatConfig extends Config {
    public static class ExponentialBackoffRetryPolicy extends RetryPolicy {
        private final long a;
        private long b;

        public ExponentialBackoffRetryPolicy(long v) {
            this.a = v;
        }

        @Override  // androidx.emoji2.text.FontRequestEmojiCompatConfig$RetryPolicy
        public long a() {
            if(this.b == 0L) {
                this.b = SystemClock.uptimeMillis();
                return 0L;
            }
            long v = SystemClock.uptimeMillis() - this.b;
            return v <= this.a ? Math.min(Math.max(v, 1000L), this.a - v) : -1L;
        }
    }

    @RestrictTo({Scope.a})
    public static class FontProviderHelper {
        @Nullable
        public Typeface a(@NonNull Context context0, @NonNull FontInfo fontsContractCompat$FontInfo0) throws PackageManager.NameNotFoundException {
            return FontsContractCompat.a(context0, null, new FontInfo[]{fontsContractCompat$FontInfo0});
        }

        @NonNull
        public FontFamilyResult b(@NonNull Context context0, @NonNull FontRequest fontRequest0) throws PackageManager.NameNotFoundException {
            return FontsContractCompat.b(context0, null, fontRequest0);
        }

        public void c(@NonNull Context context0, @NonNull Uri uri0, @NonNull ContentObserver contentObserver0) {
            context0.getContentResolver().registerContentObserver(uri0, false, contentObserver0);
        }

        public void d(@NonNull Context context0, @NonNull ContentObserver contentObserver0) {
            context0.getContentResolver().unregisterContentObserver(contentObserver0);
        }
    }

    static class FontRequestMetadataLoader implements MetadataRepoLoader {
        @NonNull
        private final Context a;
        @NonNull
        private final FontRequest b;
        @NonNull
        private final FontProviderHelper c;
        @NonNull
        private final Object d;
        @GuardedBy("mLock")
        @Nullable
        private Handler e;
        @GuardedBy("mLock")
        @Nullable
        private Executor f;
        @GuardedBy("mLock")
        @Nullable
        private ThreadPoolExecutor g;
        @GuardedBy("mLock")
        @Nullable
        private RetryPolicy h;
        @GuardedBy("mLock")
        @Nullable
        MetadataRepoLoaderCallback i;
        @GuardedBy("mLock")
        @Nullable
        private ContentObserver j;
        @GuardedBy("mLock")
        @Nullable
        private Runnable k;
        private static final String l = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface";

        FontRequestMetadataLoader(@NonNull Context context0, @NonNull FontRequest fontRequest0, @NonNull FontProviderHelper fontRequestEmojiCompatConfig$FontProviderHelper0) {
            this.d = new Object();
            Preconditions.m(context0, "Context cannot be null");
            Preconditions.m(fontRequest0, "FontRequest cannot be null");
            this.a = context0.getApplicationContext();
            this.b = fontRequest0;
            this.c = fontRequestEmojiCompatConfig$FontProviderHelper0;
        }

        @Override  // androidx.emoji2.text.EmojiCompat$MetadataRepoLoader
        @RequiresApi(19)
        public void a(@NonNull MetadataRepoLoaderCallback emojiCompat$MetadataRepoLoaderCallback0) {
            Preconditions.m(emojiCompat$MetadataRepoLoaderCallback0, "LoaderCallback cannot be null");
            synchronized(this.d) {
                this.i = emojiCompat$MetadataRepoLoaderCallback0;
            }
            this.d();
        }

        private void b() {
            synchronized(this.d) {
                this.i = null;
                ContentObserver contentObserver0 = this.j;
                if(contentObserver0 != null) {
                    this.c.d(this.a, contentObserver0);
                    this.j = null;
                }
                Handler handler0 = this.e;
                if(handler0 != null) {
                    handler0.removeCallbacks(this.k);
                }
                this.e = null;
                ThreadPoolExecutor threadPoolExecutor0 = this.g;
                if(threadPoolExecutor0 != null) {
                    threadPoolExecutor0.shutdown();
                }
                this.f = null;
                this.g = null;
            }
        }

        // 检测为 Lambda 实现
        @RequiresApi(19)
        @WorkerThread
        void c() [...]

        // 检测为 Lambda 实现
        @RequiresApi(19)
        void d() [...]

        @WorkerThread
        private FontInfo e() {
            FontFamilyResult fontsContractCompat$FontFamilyResult0;
            try {
                fontsContractCompat$FontFamilyResult0 = this.c.b(this.a, this.b);
            }
            catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                throw new RuntimeException("provider not found", packageManager$NameNotFoundException0);
            }
            if(fontsContractCompat$FontFamilyResult0.e() != 0) {
                throw new RuntimeException("fetchFonts failed (" + fontsContractCompat$FontFamilyResult0.e() + ")");
            }
            FontInfo[] arr_fontsContractCompat$FontInfo = fontsContractCompat$FontFamilyResult0.c();
            if(arr_fontsContractCompat$FontInfo == null || arr_fontsContractCompat$FontInfo.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return arr_fontsContractCompat$FontInfo[0];
        }

        @RequiresApi(19)
        @WorkerThread
        private void f(Uri uri0, long v) {
            synchronized(this.d) {
                Handler handler0 = this.e;
                if(handler0 == null) {
                    handler0 = ConcurrencyHelpers.e();
                    this.e = handler0;
                }
                if(this.j == null) {
                    androidx.emoji2.text.FontRequestEmojiCompatConfig.FontRequestMetadataLoader.1 fontRequestEmojiCompatConfig$FontRequestMetadataLoader$10 = new ContentObserver(handler0) {
                        final FontRequestMetadataLoader a;

                        @Override  // android.database.ContentObserver
                        public void onChange(boolean z, Uri uri0) {
                            FontRequestMetadataLoader.this.d();
                        }
                    };
                    this.j = fontRequestEmojiCompatConfig$FontRequestMetadataLoader$10;
                    this.c.c(this.a, uri0, fontRequestEmojiCompatConfig$FontRequestMetadataLoader$10);
                }
                if(this.k == null) {
                    this.k = () -> synchronized(this.d) {
                        if(this.i == null) {
                            return;
                        }
                        if(this.f == null) {
                            ThreadPoolExecutor threadPoolExecutor0 = ConcurrencyHelpers.c("emojiCompat");
                            this.g = threadPoolExecutor0;
                            this.f = threadPoolExecutor0;
                        }
                        this.f.execute(() -> {
                            synchronized(this.d) {
                                if(this.i == null) {
                                    return;
                                }
                            }
                            try {
                                FontInfo fontsContractCompat$FontInfo0 = this.e();
                                int v = fontsContractCompat$FontInfo0.b();
                                if(v == 2) {
                                    synchronized(this.d) {
                                        RetryPolicy fontRequestEmojiCompatConfig$RetryPolicy0 = this.h;
                                        if(fontRequestEmojiCompatConfig$RetryPolicy0 != null) {
                                            long v2 = fontRequestEmojiCompatConfig$RetryPolicy0.a();
                                            if(v2 >= 0L) {
                                                this.f(fontsContractCompat$FontInfo0.d(), v2);
                                                return;
                                            }
                                        }
                                    }
                                }
                                if(v != 0) {
                                    throw new RuntimeException("fetchFonts result is not OK. (" + v + ")");
                                }
                                try {
                                    TraceCompat.b("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                    Typeface typeface0 = this.c.a(this.a, fontsContractCompat$FontInfo0);
                                    ByteBuffer byteBuffer0 = TypefaceCompatUtil.f(this.a, null, fontsContractCompat$FontInfo0.d());
                                    if(byteBuffer0 != null && typeface0 != null) {
                                        MetadataRepo metadataRepo0 = MetadataRepo.e(typeface0, byteBuffer0);
                                        synchronized(this.d) {
                                            MetadataRepoLoaderCallback emojiCompat$MetadataRepoLoaderCallback0 = this.i;
                                            if(emojiCompat$MetadataRepoLoaderCallback0 != null) {
                                                emojiCompat$MetadataRepoLoaderCallback0.b(metadataRepo0);
                                            }
                                        }
                                        this.b();
                                        return;
                                    }
                                }
                                finally {
                                    TraceCompat.d();
                                }
                                throw new RuntimeException("Unable to open file.");
                            }
                            catch(Throwable throwable0) {
                                synchronized(this.d) {
                                    MetadataRepoLoaderCallback emojiCompat$MetadataRepoLoaderCallback1 = this.i;
                                    if(emojiCompat$MetadataRepoLoaderCallback1 != null) {
                                        emojiCompat$MetadataRepoLoaderCallback1.a(throwable0);
                                    }
                                }
                                this.b();
                            }
                        });
                    };
                }
                handler0.postDelayed(this.k, v);
            }
        }

        public void g(@NonNull Executor executor0) {
            synchronized(this.d) {
                this.f = executor0;
            }
        }

        public void h(@Nullable RetryPolicy fontRequestEmojiCompatConfig$RetryPolicy0) {
            synchronized(this.d) {
                this.h = fontRequestEmojiCompatConfig$RetryPolicy0;
            }
        }
    }

    public static abstract class RetryPolicy {
        public abstract long a();
    }

    private static final FontProviderHelper k;

    static {
        FontRequestEmojiCompatConfig.k = new FontProviderHelper();
    }

    public FontRequestEmojiCompatConfig(@NonNull Context context0, @NonNull FontRequest fontRequest0) {
        super(new FontRequestMetadataLoader(context0, fontRequest0, FontRequestEmojiCompatConfig.k));
    }

    @RestrictTo({Scope.a})
    public FontRequestEmojiCompatConfig(@NonNull Context context0, @NonNull FontRequest fontRequest0, @NonNull FontProviderHelper fontRequestEmojiCompatConfig$FontProviderHelper0) {
        super(new FontRequestMetadataLoader(context0, fontRequest0, fontRequestEmojiCompatConfig$FontProviderHelper0));
    }

    @NonNull
    @Deprecated
    public FontRequestEmojiCompatConfig l(@Nullable Handler handler0) {
        if(handler0 == null) {
            return this;
        }
        this.m(ConcurrencyHelpers.b(handler0));
        return this;
    }

    @NonNull
    public FontRequestEmojiCompatConfig m(@NonNull Executor executor0) {
        ((FontRequestMetadataLoader)this.a()).g(executor0);
        return this;
    }

    @NonNull
    public FontRequestEmojiCompatConfig n(@Nullable RetryPolicy fontRequestEmojiCompatConfig$RetryPolicy0) {
        ((FontRequestMetadataLoader)this.a()).h(fontRequestEmojiCompatConfig$RetryPolicy0);
        return this;
    }
}

