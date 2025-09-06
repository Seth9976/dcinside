package androidx.emoji2.text;

public final class e implements Runnable {
    public final FontRequestMetadataLoader a;

    public e(FontRequestMetadataLoader fontRequestEmojiCompatConfig$FontRequestMetadataLoader0) {
        this.a = fontRequestEmojiCompatConfig$FontRequestMetadataLoader0;
    }

    @Override
    public final void run() {
        this.a.c();
    }
}

