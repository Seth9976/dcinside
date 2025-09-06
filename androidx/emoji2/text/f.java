package androidx.emoji2.text;

public final class f implements Runnable {
    public final FontRequestMetadataLoader a;

    public f(FontRequestMetadataLoader fontRequestEmojiCompatConfig$FontRequestMetadataLoader0) {
        this.a = fontRequestEmojiCompatConfig$FontRequestMetadataLoader0;
    }

    @Override
    public final void run() {
        this.a.d();
    }
}

