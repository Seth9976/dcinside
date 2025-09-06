package androidx.media3.exoplayer.source;

import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;
import java.util.Random;

@UnstableApi
public interface ShuffleOrder {
    public static class DefaultShuffleOrder implements ShuffleOrder {
        private final Random a;
        private final int[] b;
        private final int[] c;

        public DefaultShuffleOrder(int v) {
            this(v, new Random());
        }

        public DefaultShuffleOrder(int v, long v1) {
            this(v, new Random(v1));
        }

        private DefaultShuffleOrder(int v, Random random0) {
            this(DefaultShuffleOrder.h(v, random0), random0);
        }

        public DefaultShuffleOrder(int[] arr_v, long v) {
            this(Arrays.copyOf(arr_v, arr_v.length), new Random(v));
        }

        private DefaultShuffleOrder(int[] arr_v, Random random0) {
            this.b = arr_v;
            this.a = random0;
            this.c = new int[arr_v.length];
            for(int v = 0; v < arr_v.length; ++v) {
                this.c[arr_v[v]] = v;
            }
        }

        @Override  // androidx.media3.exoplayer.source.ShuffleOrder
        public int a(int v) {
            int v1 = this.c[v] - 1;
            return v1 < 0 ? -1 : this.b[v1];
        }

        @Override  // androidx.media3.exoplayer.source.ShuffleOrder
        public int b(int v) {
            int v1 = this.c[v] + 1;
            return v1 >= this.b.length ? -1 : this.b[v1];
        }

        @Override  // androidx.media3.exoplayer.source.ShuffleOrder
        public int c() {
            return this.b.length <= 0 ? -1 : this.b[this.b.length - 1];
        }

        @Override  // androidx.media3.exoplayer.source.ShuffleOrder
        public ShuffleOrder d() {
            return new DefaultShuffleOrder(0, new Random(this.a.nextLong()));
        }

        @Override  // androidx.media3.exoplayer.source.ShuffleOrder
        public int e() {
            return this.b.length <= 0 ? -1 : this.b[0];
        }

        @Override  // androidx.media3.exoplayer.source.ShuffleOrder
        public ShuffleOrder f(int v, int v1) {
            int v2 = v1 - v;
            int[] arr_v = new int[this.b.length - v2];
            int v4 = 0;
            for(int v3 = 0; true; ++v3) {
                int[] arr_v1 = this.b;
                if(v3 >= arr_v1.length) {
                    break;
                }
                int v5 = arr_v1[v3];
                if(v5 < v || v5 >= v1) {
                    if(v5 >= v) {
                        v5 -= v2;
                    }
                    arr_v[v3 - v4] = v5;
                }
                else {
                    ++v4;
                }
            }
            return new DefaultShuffleOrder(arr_v, new Random(this.a.nextLong()));
        }

        @Override  // androidx.media3.exoplayer.source.ShuffleOrder
        public ShuffleOrder g(int v, int v1) {
            int[] arr_v = new int[v1];
            int[] arr_v1 = new int[v1];
            for(int v3 = 0; v3 < v1; ++v3) {
                arr_v[v3] = this.a.nextInt(this.b.length + 1);
                int v4 = this.a.nextInt(v3 + 1);
                arr_v1[v3] = arr_v1[v4];
                arr_v1[v4] = v3 + v;
            }
            Arrays.sort(arr_v);
            int[] arr_v2 = new int[this.b.length + v1];
            int v5 = 0;
            int v6 = 0;
            for(int v2 = 0; true; ++v2) {
                int[] arr_v3 = this.b;
                if(v2 >= arr_v3.length + v1) {
                    break;
                }
                if(v5 >= v1 || v6 != arr_v[v5]) {
                    int v7 = arr_v3[v6];
                    arr_v2[v2] = v7;
                    if(v7 >= v) {
                        arr_v2[v2] = v7 + v1;
                    }
                    ++v6;
                }
                else {
                    arr_v2[v2] = arr_v1[v5];
                    ++v5;
                }
            }
            return new DefaultShuffleOrder(arr_v2, new Random(this.a.nextLong()));
        }

        @Override  // androidx.media3.exoplayer.source.ShuffleOrder
        public int getLength() {
            return this.b.length;
        }

        private static int[] h(int v, Random random0) {
            int[] arr_v = new int[v];
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = random0.nextInt(v1 + 1);
                arr_v[v1] = arr_v[v2];
                arr_v[v2] = v1;
            }
            return arr_v;
        }
    }

    public static final class UnshuffledShuffleOrder implements ShuffleOrder {
        private final int a;

        public UnshuffledShuffleOrder(int v) {
            this.a = v;
        }

        @Override  // androidx.media3.exoplayer.source.ShuffleOrder
        public int a(int v) {
            return v - 1 < 0 ? -1 : v - 1;
        }

        @Override  // androidx.media3.exoplayer.source.ShuffleOrder
        public int b(int v) {
            return v + 1 < this.a ? v + 1 : -1;
        }

        @Override  // androidx.media3.exoplayer.source.ShuffleOrder
        public int c() {
            return this.a <= 0 ? -1 : this.a - 1;
        }

        @Override  // androidx.media3.exoplayer.source.ShuffleOrder
        public ShuffleOrder d() {
            return new UnshuffledShuffleOrder(0);
        }

        @Override  // androidx.media3.exoplayer.source.ShuffleOrder
        public int e() {
            return this.a <= 0 ? -1 : 0;
        }

        @Override  // androidx.media3.exoplayer.source.ShuffleOrder
        public ShuffleOrder f(int v, int v1) {
            return new UnshuffledShuffleOrder(this.a - v1 + v);
        }

        @Override  // androidx.media3.exoplayer.source.ShuffleOrder
        public ShuffleOrder g(int v, int v1) {
            return new UnshuffledShuffleOrder(this.a + v1);
        }

        @Override  // androidx.media3.exoplayer.source.ShuffleOrder
        public int getLength() {
            return this.a;
        }
    }

    int a(int arg1);

    int b(int arg1);

    int c();

    ShuffleOrder d();

    int e();

    ShuffleOrder f(int arg1, int arg2);

    ShuffleOrder g(int arg1, int arg2);

    int getLength();
}

