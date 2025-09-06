package androidx.media3.exoplayer.video.spherical;

import androidx.media3.common.util.Assertions;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

final class Projection {
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface DrawMode {
    }

    public static final class Mesh {
        private final SubMesh[] a;

        public Mesh(SubMesh[] arr_projection$SubMesh) {
            this.a = arr_projection$SubMesh;
        }

        public SubMesh a(int v) {
            return this.a[v];
        }

        public int b() {
            return this.a.length;
        }
    }

    public static final class SubMesh {
        public final int a;
        public final int b;
        public final float[] c;
        public final float[] d;
        public static final int e;

        public SubMesh(int v, float[] arr_f, float[] arr_f1, int v1) {
            this.a = v;
            Assertions.a(((long)arr_f.length) * 2L == ((long)arr_f1.length) * 3L);
            this.c = arr_f;
            this.d = arr_f1;
            this.b = v1;
        }

        public int a() {
            return this.c.length / 3;
        }
    }

    public final Mesh a;
    public final Mesh b;
    public final int c;
    public final boolean d;
    public static final int e = 0;
    public static final int f = 1;
    public static final int g = 2;
    public static final int h = 2;
    public static final int i = 3;

    public Projection(Mesh projection$Mesh0, int v) {
        this(projection$Mesh0, projection$Mesh0, v);
    }

    public Projection(Mesh projection$Mesh0, Mesh projection$Mesh1, int v) {
        this.a = projection$Mesh0;
        this.b = projection$Mesh1;
        this.c = v;
        this.d = projection$Mesh0 == projection$Mesh1;
    }

    public static Projection a(float f, int v, int v1, float f1, float f2, int v2) {
        int v11;
        int v10;
        float f10;
        float f9;
        Assertions.a(f > 0.0f);
        Assertions.a(v >= 1);
        Assertions.a(v1 >= 1);
        Assertions.a(f1 > 0.0f && f1 <= 180.0f);
        Assertions.a(f2 > 0.0f && f2 <= 360.0f);
        float f3 = (float)Math.toRadians(f1);
        float f4 = (float)Math.toRadians(f2);
        float f5 = f3 / ((float)v);
        int v3 = ((v1 + 1) * 2 + 2) * v;
        float[] arr_f = new float[v3 * 3];
        float[] arr_f1 = new float[v3 * 2];
        int v4 = 0;
        int v5 = 0;
        int v6 = 0;
        while(v4 < v) {
            float f6 = ((float)v4) * f5 - f3 / 2.0f;
            float f7 = ((float)(v4 + 1)) * f5 - f3 / 2.0f;
            int v7 = 0;
            while(v7 < v1 + 1) {
                float f8 = f6;
                int v8 = v6;
                int v9 = 0;
                while(v9 < 2) {
                    if(v9 == 0) {
                        f9 = f8;
                        f10 = f7;
                    }
                    else {
                        f9 = f7;
                        f10 = f9;
                    }
                    float f11 = ((float)v7) * (f4 / ((float)v1));
                    double f12 = (double)(f11 + 3.141593f - f4 / 2.0f);
                    arr_f[v5] = -((float)(Math.sin(f12) * ((double)f) * Math.cos(f9)));
                    arr_f[v5 + 1] = (float)(((double)f) * Math.sin(f9));
                    arr_f[v5 + 2] = (float)(((double)f) * Math.cos(f12) * Math.cos(f9));
                    arr_f1[v8] = f11 / f4;
                    arr_f1[v8 + 1] = ((float)(v4 + v9)) * f5 / f3;
                    if(v7 == 0 && v9 == 0) {
                        v11 = 0;
                        v10 = 0;
                    }
                    else {
                        v10 = v7;
                        v11 = v9;
                        if(v10 != v1 || v11 != 1) {
                            v8 += 2;
                            v5 += 3;
                            goto label_49;
                        }
                    }
                    System.arraycopy(arr_f, v5, arr_f, v5 + 3, 3);
                    v5 += 6;
                    System.arraycopy(arr_f1, v8, arr_f1, v8 + 2, 2);
                    v8 += 4;
                label_49:
                    v7 = v10;
                    v9 = v11 + 1;
                    f7 = f10;
                }
                v6 = v8;
                ++v7;
            }
            ++v4;
        }
        return new Projection(new Mesh(new SubMesh[]{new SubMesh(0, arr_f, arr_f1, 1)}), v2);
    }

    public static Projection b(int v) {
        return Projection.a(50.0f, 36, 72, 180.0f, 360.0f, v);
    }
}

