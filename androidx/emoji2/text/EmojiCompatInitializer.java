package androidx.emoji2.text;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.WorkerThread;
import androidx.core.os.TraceCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.c;
import androidx.startup.AppInitializer;
import androidx.startup.Initializer;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

public class EmojiCompatInitializer implements Initializer {
    @RequiresApi(19)
    static class BackgroundDefaultConfig extends Config {
        protected BackgroundDefaultConfig(Context context0) {
            super(new BackgroundDefaultLoader(context0));
            this.f(1);
        }
    }

    @RequiresApi(19)
    static class BackgroundDefaultLoader implements MetadataRepoLoader {
        private final Context a;

        BackgroundDefaultLoader(Context context0) {
            this.a = context0.getApplicationContext();
        }

        @Override  // androidx.emoji2.text.EmojiCompat$MetadataRepoLoader
        public void a(@NonNull MetadataRepoLoaderCallback emojiCompat$MetadataRepoLoaderCallback0) {
            ThreadPoolExecutor threadPoolExecutor0 = ConcurrencyHelpers.c("EmojiCompatInitializer");
            threadPoolExecutor0.execute(() -> this.c(emojiCompat$MetadataRepoLoaderCallback0, threadPoolExecutor0));
        }

        @WorkerThread
        void c(@NonNull MetadataRepoLoaderCallback emojiCompat$MetadataRepoLoaderCallback0, @NonNull ThreadPoolExecutor threadPoolExecutor0) {
            try {
                FontRequestEmojiCompatConfig fontRequestEmojiCompatConfig0 = DefaultEmojiCompatConfig.a(this.a);
                if(fontRequestEmojiCompatConfig0 == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                fontRequestEmojiCompatConfig0.m(threadPoolExecutor0);
                fontRequestEmojiCompatConfig0.a().a(new MetadataRepoLoaderCallback() {
                    final BackgroundDefaultLoader c;

                    @Override  // androidx.emoji2.text.EmojiCompat$MetadataRepoLoaderCallback
                    public void a(@Nullable Throwable throwable0) {
                        try {
                            emojiCompat$MetadataRepoLoaderCallback0.a(throwable0);
                        }
                        finally {
                            threadPoolExecutor0.shutdown();
                        }
                    }

                    @Override  // androidx.emoji2.text.EmojiCompat$MetadataRepoLoaderCallback
                    public void b(@NonNull MetadataRepo metadataRepo0) {
                        try {
                            emojiCompat$MetadataRepoLoaderCallback0.b(metadataRepo0);
                        }
                        finally {
                            threadPoolExecutor0.shutdown();
                        }
                    }
                });
                return;
            }
            catch(Throwable throwable0) {
            }
            emojiCompat$MetadataRepoLoaderCallback0.a(throwable0);
            threadPoolExecutor0.shutdown();
        }

        // 检测为 Lambda 实现
        private void d(MetadataRepoLoaderCallback emojiCompat$MetadataRepoLoaderCallback0, ThreadPoolExecutor threadPoolExecutor0) [...]
    }

    static class LoadEmojiCompatRunnable implements Runnable {
        @Override
        public void run() {
            try {
                TraceCompat.b("EmojiCompat.EmojiCompatInitializer.run");
            }
            finally {
                TraceCompat.d();
            }
        }
    }

    private static final long a = 500L;
    private static final String b = "EmojiCompatInitializer";

    @NonNull
    public Boolean a(@NonNull Context context0) {
        EmojiCompat.p(new BackgroundDefaultConfig(context0));
        this.b(context0);
        return true;
    }

    @RequiresApi(19)
    void b(@NonNull Context context0) {
        Lifecycle lifecycle0 = ((LifecycleOwner)AppInitializer.e(context0).f(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle0.a(new DefaultLifecycleObserver() {
            final EmojiCompatInitializer b;

            @Override  // androidx.lifecycle.DefaultLifecycleObserver
            public void m(@NonNull LifecycleOwner lifecycleOwner0) {
                EmojiCompatInitializer.this.c();
                lifecycle0.d(this);
            }

            @Override  // androidx.lifecycle.DefaultLifecycleObserver
            public void n(LifecycleOwner lifecycleOwner0) {
                c.c(this, lifecycleOwner0);
            }

            @Override  // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(LifecycleOwner lifecycleOwner0) {
                c.b(this, lifecycleOwner0);
            }

            @Override  // androidx.lifecycle.DefaultLifecycleObserver
            public void onStart(LifecycleOwner lifecycleOwner0) {
                c.e(this, lifecycleOwner0);
            }

            @Override  // androidx.lifecycle.DefaultLifecycleObserver
            public void onStop(LifecycleOwner lifecycleOwner0) {
                c.f(this, lifecycleOwner0);
            }

            @Override  // androidx.lifecycle.DefaultLifecycleObserver
            public void r(LifecycleOwner lifecycleOwner0) {
                c.a(this, lifecycleOwner0);
            }
        });
    }

    @RequiresApi(19)
    void c() {
        ConcurrencyHelpers.e().postDelayed(new LoadEmojiCompatRunnable(), 500L);
    }

    @Override  // androidx.startup.Initializer
    @NonNull
    public Object create(@NonNull Context context0) {
        return this.a(context0);
    }

    @Override  // androidx.startup.Initializer
    @NonNull
    public List dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}

