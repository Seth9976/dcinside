package androidx.media3.extractor.mp3;

import androidx.media3.extractor.SeekMap.Unseekable;
import androidx.media3.extractor.SeekMap;

interface Seeker extends SeekMap {
    public static class UnseekableSeeker extends Unseekable implements Seeker {
        public UnseekableSeeker() {
            super(0x8000000000000001L);
        }

        @Override  // androidx.media3.extractor.mp3.Seeker
        public long b(long v) {
            return 0L;
        }

        @Override  // androidx.media3.extractor.mp3.Seeker
        public long f() {
            return -1L;
        }

        @Override  // androidx.media3.extractor.mp3.Seeker
        public int i() {
            return 0x80000001;
        }
    }

    long b(long arg1);

    long f();

    int i();
}

