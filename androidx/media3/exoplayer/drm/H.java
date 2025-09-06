package androidx.media3.exoplayer.drm;

public final class h implements Runnable {
    public final DefaultDrmSession a;

    public h(DefaultDrmSession defaultDrmSession0) {
        this.a = defaultDrmSession0;
    }

    @Override
    public final void run() {
        ReferenceCountListenerImpl.d(this.a);
    }
}

