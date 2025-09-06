package androidx.media3.exoplayer.audio;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import androidx.annotation.Nullable;

final class AudioTimestampPoller {
    static final class AudioTimestampWrapper {
        private final AudioTrack a;
        private final AudioTimestamp b;
        private long c;
        private long d;
        private long e;
        private boolean f;
        private long g;

        public AudioTimestampWrapper(AudioTrack audioTrack0) {
            this.a = audioTrack0;
            this.b = new AudioTimestamp();
        }

        public void a() {
            this.f = true;
        }

        public long b() {
            return this.e;
        }

        public long c() {
            return this.b.nanoTime / 1000L;
        }

        public boolean d() {
            boolean z = this.a.getTimestamp(this.b);
            if(z) {
                long v = this.b.framePosition;
                long v1 = this.d;
                if(v1 > v) {
                    if(this.f) {
                        this.g += v1;
                        this.f = false;
                    }
                    else {
                        ++this.c;
                    }
                }
                this.d = v;
                this.e = v + this.g + (this.c << 0x20);
            }
            return z;
        }
    }

    @Nullable
    private final AudioTimestampWrapper a;
    private int b;
    private long c;
    private long d;
    private long e;
    private long f;
    private static final int g = 0;
    private static final int h = 1;
    private static final int i = 2;
    private static final int j = 3;
    private static final int k = 4;
    private static final int l = 10000;
    private static final int m = 10000000;
    private static final int n = 500000;
    private static final int o = 500000;

    public AudioTimestampPoller(AudioTrack audioTrack0) {
        this.a = new AudioTimestampWrapper(audioTrack0);
        this.i();
    }

    public void a() {
        if(this.b == 4) {
            this.i();
        }
    }

    public void b() {
        AudioTimestampWrapper audioTimestampPoller$AudioTimestampWrapper0 = this.a;
        if(audioTimestampPoller$AudioTimestampWrapper0 != null) {
            audioTimestampPoller$AudioTimestampWrapper0.a();
        }
    }

    public long c() {
        return this.a == null ? -1L : this.a.b();
    }

    public long d() {
        return this.a == null ? 0x8000000000000001L : this.a.c();
    }

    public boolean e() {
        return this.b == 2;
    }

    public boolean f() {
        return this.b == 1 || this.b == 2;
    }

    public boolean g(long v) {
        AudioTimestampWrapper audioTimestampPoller$AudioTimestampWrapper0 = this.a;
        if(audioTimestampPoller$AudioTimestampWrapper0 != null && v - this.e >= this.d) {
            this.e = v;
            boolean z = audioTimestampPoller$AudioTimestampWrapper0.d();
            int v1 = this.b;
            if(v1 != 0) {
                switch(v1) {
                    case 1: {
                        if(z) {
                            if(this.a.b() <= this.f) {
                                return z;
                            }
                            this.j(2);
                            return true;
                        }
                        this.i();
                        return false;
                    }
                    case 2: {
                        if(z) {
                            return z;
                        }
                        this.i();
                        return false;
                    }
                    case 3: {
                        if(!z) {
                            return z;
                        }
                        this.i();
                        return true;
                    }
                    default: {
                        if(v1 != 4) {
                            throw new IllegalStateException();
                        }
                        return z;
                    }
                }
            }
            if(!z) {
                if(v - this.c > 500000L) {
                    this.j(3);
                }
                return z;
            }
            else if(this.a.c() >= this.c) {
                this.f = this.a.b();
                this.j(1);
                return true;
            }
        }
        return false;
    }

    public void h() {
        this.j(4);
    }

    public void i() {
        if(this.a != null) {
            this.j(0);
        }
    }

    private void j(int v) {
        this.b = v;
        switch(v) {
            case 0: {
                this.e = 0L;
                this.f = -1L;
                this.c = System.nanoTime() / 1000L;
                this.d = 10000L;
                return;
            }
            case 1: {
                this.d = 10000L;
                return;
            }
            case 2: 
            case 3: {
                this.d = 10000000L;
                return;
            }
            case 4: {
                this.d = 500000L;
                return;
            }
            default: {
                throw new IllegalStateException();
            }
        }
    }
}

