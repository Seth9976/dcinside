package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.CustomAttribute;
import androidx.constraintlayout.core.motion.CustomVariable;
import java.io.PrintStream;
import java.util.Arrays;

public class KeyFrameArray {
    public static class CustomArray {
        int[] a;
        CustomAttribute[] b;
        int c;
        private static final int d = 999;

        public CustomArray() {
            this.a = new int[101];
            this.b = new CustomAttribute[101];
            this.b();
        }

        public void a(int v, CustomAttribute customAttribute0) {
            if(this.b[v] != null) {
                this.e(v);
            }
            this.b[v] = customAttribute0;
            int[] arr_v = this.a;
            int v1 = this.c;
            this.c = v1 + 1;
            arr_v[v1] = v;
            Arrays.sort(arr_v);
        }

        public void b() {
            Arrays.fill(this.a, 999);
            Arrays.fill(this.b, null);
            this.c = 0;
        }

        public void c() {
            PrintStream printStream0 = System.out;
            printStream0.println("V: " + Arrays.toString(Arrays.copyOf(this.a, this.c)));
            printStream0.print("K: [");
            for(int v = 0; v < this.c; ++v) {
                System.out.print((v == 0 ? "" : ", ") + this.g(v));
            }
            System.out.println("]");
        }

        public int d(int v) {
            return this.a[v];
        }

        public void e(int v) {
            int v3;
            this.b[v] = null;
            int v2 = 0;
            for(int v1 = 0; true; ++v1) {
                v3 = this.c;
                if(v1 >= v3) {
                    break;
                }
                int[] arr_v = this.a;
                if(v == arr_v[v1]) {
                    arr_v[v1] = 999;
                    ++v2;
                }
                if(v1 != v2) {
                    arr_v[v1] = arr_v[v2];
                }
                ++v2;
            }
            this.c = v3 - 1;
        }

        public int f() {
            return this.c;
        }

        public CustomAttribute g(int v) {
            return this.b[this.a[v]];
        }
    }

    public static class CustomVar {
        int[] a;
        CustomVariable[] b;
        int c;
        private static final int d = 999;

        public CustomVar() {
            this.a = new int[101];
            this.b = new CustomVariable[101];
            this.b();
        }

        public void a(int v, CustomVariable customVariable0) {
            if(this.b[v] != null) {
                this.e(v);
            }
            this.b[v] = customVariable0;
            int[] arr_v = this.a;
            int v1 = this.c;
            this.c = v1 + 1;
            arr_v[v1] = v;
            Arrays.sort(arr_v);
        }

        public void b() {
            Arrays.fill(this.a, 999);
            Arrays.fill(this.b, null);
            this.c = 0;
        }

        public void c() {
            PrintStream printStream0 = System.out;
            printStream0.println("V: " + Arrays.toString(Arrays.copyOf(this.a, this.c)));
            printStream0.print("K: [");
            for(int v = 0; v < this.c; ++v) {
                System.out.print((v == 0 ? "" : ", ") + this.g(v));
            }
            System.out.println("]");
        }

        public int d(int v) {
            return this.a[v];
        }

        public void e(int v) {
            int v3;
            this.b[v] = null;
            int v2 = 0;
            for(int v1 = 0; true; ++v1) {
                v3 = this.c;
                if(v1 >= v3) {
                    break;
                }
                int[] arr_v = this.a;
                if(v == arr_v[v1]) {
                    arr_v[v1] = 999;
                    ++v2;
                }
                if(v1 != v2) {
                    arr_v[v1] = arr_v[v2];
                }
                ++v2;
            }
            this.c = v3 - 1;
        }

        public int f() {
            return this.c;
        }

        public CustomVariable g(int v) {
            return this.b[this.a[v]];
        }
    }

    static class FloatArray {
        int[] a;
        float[][] b;
        int c;
        private static final int d = 999;

        FloatArray() {
            this.a = new int[101];
            this.b = new float[101][];
            this.b();
        }

        public void a(int v, float[] arr_f) {
            if(this.b[v] != null) {
                this.e(v);
            }
            this.b[v] = arr_f;
            int[] arr_v = this.a;
            int v1 = this.c;
            this.c = v1 + 1;
            arr_v[v1] = v;
            Arrays.sort(arr_v);
        }

        public void b() {
            Arrays.fill(this.a, 999);
            Arrays.fill(this.b, null);
            this.c = 0;
        }

        public void c() {
            PrintStream printStream0 = System.out;
            printStream0.println("V: " + Arrays.toString(Arrays.copyOf(this.a, this.c)));
            printStream0.print("K: [");
            for(int v = 0; v < this.c; ++v) {
                System.out.print((v == 0 ? "" : ", ") + Arrays.toString(this.g(v)));
            }
            System.out.println("]");
        }

        public int d(int v) {
            return this.a[v];
        }

        public void e(int v) {
            int v3;
            this.b[v] = null;
            int v2 = 0;
            for(int v1 = 0; true; ++v1) {
                v3 = this.c;
                if(v1 >= v3) {
                    break;
                }
                int[] arr_v = this.a;
                if(v == arr_v[v1]) {
                    arr_v[v1] = 999;
                    ++v2;
                }
                if(v1 != v2) {
                    arr_v[v1] = arr_v[v2];
                }
                ++v2;
            }
            this.c = v3 - 1;
        }

        public int f() {
            return this.c;
        }

        public float[] g(int v) {
            return this.b[this.a[v]];
        }
    }

}

