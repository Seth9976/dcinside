package com.bytedance.adsdk.Zh.JQp;

import android.graphics.Color;
import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.adsdk.Zh.ReZ.Zh.cr;
import com.bytedance.adsdk.Zh.cz.JQp;
import com.bytedance.adsdk.Zh.cz.Zh;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class qla implements IJ {
    private int PjT;

    public qla(int v) {
        this.PjT = v;
    }

    private int PjT(float f, int v, float[] arr_f, float[] arr_f1) {
        if(arr_f1.length >= 2 && f > arr_f[0]) {
            int v1 = 1;
            while(v1 < arr_f.length) {
                float f1 = arr_f[v1];
                int v2 = Float.compare(f1, f);
                if(v2 < 0 && v1 != arr_f.length - 1) {
                    ++v1;
                    continue;
                }
                if(v2 <= 0) {
                    return Color.argb(((int)(arr_f1[v1] * 255.0f)), Color.red(v), Color.green(v), Color.blue(v));
                }
                float f2 = arr_f[v1 - 1];
                return Color.argb(((int)(JQp.PjT(arr_f1[v1 - 1], arr_f1[v1], (f - f2) / (f1 - f2)) * 255.0f)), Color.red(v), Color.green(v), Color.blue(v));
            }
            throw new IllegalArgumentException("Unreachable code.");
        }
        return Color.argb(((int)(arr_f1[0] * 255.0f)), Color.red(v), Color.green(v), Color.blue(v));
    }

    private cr PjT(cr cr0, List list0) {
        int v = this.PjT * 4;
        if(list0.size() <= v) {
            return cr0;
        }
        float[] arr_f = cr0.PjT();
        int[] arr_v = cr0.Zh();
        int v1 = (list0.size() - v) / 2;
        float[] arr_f1 = new float[v1];
        float[] arr_f2 = new float[v1];
        int v3 = 0;
        while(v < list0.size()) {
            if(v % 2 == 0) {
                arr_f1[v3] = (float)(((Float)list0.get(v)));
            }
            else {
                arr_f2[v3] = (float)(((Float)list0.get(v)));
                ++v3;
            }
            ++v;
        }
        float[] arr_f3 = qla.PjT(cr0.PjT(), arr_f1);
        int[] arr_v1 = new int[arr_f3.length];
        for(int v2 = 0; v2 < arr_f3.length; ++v2) {
            float f = arr_f3[v2];
            int v4 = Arrays.binarySearch(arr_f, f);
            int v5 = Arrays.binarySearch(arr_f1, f);
            if(v4 < 0 || v5 > 0) {
                if(v5 < 0) {
                    v5 = -(v5 + 1);
                }
                arr_v1[v2] = this.PjT(f, arr_f2[v5], arr_f, arr_v);
            }
            else {
                arr_v1[v2] = this.PjT(f, arr_v[v4], arr_f1, arr_f2);
            }
        }
        return new cr(arr_f3, arr_v1);
    }

    protected static float[] PjT(float[] arr_f, float[] arr_f1) {
        if(arr_f.length == 0) {
            return arr_f1;
        }
        if(arr_f1.length == 0) {
            return arr_f;
        }
        int v = arr_f.length + arr_f1.length;
        float[] arr_f2 = new float[v];
        int v2 = 0;
        int v3 = 0;
        int v4 = 0;
        for(int v1 = 0; true; ++v1) {
            float f = NaNf;
            if(v1 >= v) {
                break;
            }
            float f1 = v3 >= arr_f.length ? NaNf : arr_f[v3];
            if(v4 < arr_f1.length) {
                f = arr_f1[v4];
            }
            if(Float.isNaN(f) || f1 < f) {
                arr_f2[v1] = f1;
                ++v3;
            }
            else if(Float.isNaN(f1) || f < f1) {
                arr_f2[v1] = f;
                ++v4;
            }
            else {
                arr_f2[v1] = f1;
                ++v3;
                ++v4;
                ++v2;
            }
        }
        return v2 == 0 ? arr_f2 : Arrays.copyOf(arr_f2, v - v2);
    }

    int PjT(float f, float f1, float[] arr_f, int[] arr_v) {
        if(arr_v.length >= 2 && f != arr_f[0]) {
            int v = 1;
            while(v < arr_f.length) {
                float f2 = arr_f[v];
                if(f2 < f && v != arr_f.length - 1) {
                    ++v;
                    continue;
                }
                float f3 = arr_f[v - 1];
                float f4 = (f - f3) / (f2 - f3);
                int v1 = arr_v[v];
                int v2 = arr_v[v - 1];
                return Color.argb(((int)(f1 * 255.0f)), Zh.PjT(f4, Color.red(v2), Color.red(v1)), Zh.PjT(f4, Color.green(v2), Color.green(v1)), Zh.PjT(f4, Color.blue(v2), Color.blue(v1)));
            }
            throw new IllegalArgumentException("Unreachable code.");
        }
        return arr_v[0];
    }

    public cr PjT(JsonReader jsonReader0, float f) throws IOException {
        ArrayList arrayList0 = new ArrayList();
        boolean z = jsonReader0.peek() == JsonToken.BEGIN_ARRAY;
        if(z) {
            jsonReader0.beginArray();
        }
        while(jsonReader0.hasNext()) {
            arrayList0.add(((float)jsonReader0.nextDouble()));
        }
        if(arrayList0.size() == 4 && ((float)(((Float)arrayList0.get(0)))) == 1.0f) {
            arrayList0.set(0, 0.0f);
            arrayList0.add(1.0f);
            arrayList0.add(arrayList0.get(1));
            arrayList0.add(arrayList0.get(2));
            arrayList0.add(arrayList0.get(3));
            this.PjT = 2;
        }
        if(z) {
            jsonReader0.endArray();
        }
        if(this.PjT == -1) {
            this.PjT = arrayList0.size() / 4;
        }
        int v1 = this.PjT;
        float[] arr_f = new float[v1];
        int[] arr_v = new int[v1];
        int v2 = 0;
        int v3 = 0;
        for(int v = 0; v < this.PjT * 4; ++v) {
            double f1 = (double)(((float)(((Float)arrayList0.get(v)))));
            if(v % 4 != 0) {
                switch(v % 4) {
                    case 1: {
                        v2 = (int)(f1 * 255.0);
                        break;
                    }
                    case 2: {
                        v3 = (int)(f1 * 255.0);
                        break;
                    }
                    case 3: {
                        arr_v[v / 4] = Color.argb(0xFF, v2, v3, ((int)(f1 * 255.0)));
                    }
                }
            }
            else if(v / 4 <= 0 || arr_f[v / 4 - 1] < ((float)f1)) {
                arr_f[v / 4] = (float)f1;
            }
            else {
                arr_f[v / 4] = ((float)f1) + 0.01f;
            }
        }
        return this.PjT(new cr(arr_f, arr_v), arrayList0);
    }

    @Override  // com.bytedance.adsdk.Zh.JQp.IJ
    public Object Zh(JsonReader jsonReader0, float f) throws IOException {
        return this.PjT(jsonReader0, f);
    }
}

