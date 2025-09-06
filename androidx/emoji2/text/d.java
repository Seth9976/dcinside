package androidx.emoji2.text;

import java.util.concurrent.ThreadPoolExecutor;

public final class d implements Runnable {
    public final BackgroundDefaultLoader a;
    public final MetadataRepoLoaderCallback b;
    public final ThreadPoolExecutor c;

    public d(BackgroundDefaultLoader emojiCompatInitializer$BackgroundDefaultLoader0, MetadataRepoLoaderCallback emojiCompat$MetadataRepoLoaderCallback0, ThreadPoolExecutor threadPoolExecutor0) {
        this.a = emojiCompatInitializer$BackgroundDefaultLoader0;
        this.b = emojiCompat$MetadataRepoLoaderCallback0;
        this.c = threadPoolExecutor0;
    }

    @Override
    public final void run() {
        this.a.d(this.b, this.c);
    }
}

