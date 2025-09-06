package androidx.media3.extractor;

import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
public interface SeekMap {
    public static final class SeekPoints {
        public final SeekPoint a;
        public final SeekPoint b;

        public SeekPoints(SeekPoint seekPoint0) {
            this(seekPoint0, seekPoint0);
        }

        public SeekPoints(SeekPoint seekPoint0, SeekPoint seekPoint1) {
            this.a = (SeekPoint)Assertions.g(seekPoint0);
            this.b = (SeekPoint)Assertions.g(seekPoint1);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(object0 != null) {
                Class class0 = object0.getClass();
                return SeekPoints.class == class0 && (this.a.equals(((SeekPoints)object0).a) && this.b.equals(((SeekPoints)object0).b));
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode() * 0x1F + this.b.hashCode();
        }

        // 去混淆评级： 低(20)
        @Override
        public String toString() {
            return "[" + this.a + (this.a.equals(this.b) ? "" : ", " + this.b) + "]";
        }
    }

    public static class Unseekable implements SeekMap {
        private final long d;
        private final SeekPoints e;

        public Unseekable(long v) {
            this(v, 0L);
        }

        public Unseekable(long v, long v1) {
            this.d = v;
            this.e = new SeekPoints((v1 == 0L ? SeekPoint.c : new SeekPoint(0L, v1)));
        }

        @Override  // androidx.media3.extractor.SeekMap
        public long c1() {
            return this.d;
        }

        @Override  // androidx.media3.extractor.SeekMap
        public SeekPoints d1(long v) {
            return this.e;
        }

        @Override  // androidx.media3.extractor.SeekMap
        public boolean e1() {
            return false;
        }
    }

    long c1();

    SeekPoints d1(long arg1);

    boolean e1();
}

