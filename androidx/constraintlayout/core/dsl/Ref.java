package androidx.constraintlayout.core.dsl;

import java.util.ArrayList;
import java.util.Arrays;

public class Ref {
    private String a;
    private float b;
    private float c;
    private float d;

    Ref(String s) {
        this.b = NaNf;
        this.c = NaNf;
        this.d = NaNf;
        this.a = s;
    }

    Ref(String s, float f) {
        this.c = NaNf;
        this.d = NaNf;
        this.a = s;
        this.b = f;
    }

    Ref(String s, float f, float f1) {
        this.d = NaNf;
        this.a = s;
        this.b = f;
        this.c = f1;
    }

    Ref(String s, float f, float f1, float f2) {
        this.a = s;
        this.b = f;
        this.c = f1;
        this.d = f2;
    }

    public static void a(String s, ArrayList arrayList0) {
        if(s != null && s.length() != 0) {
            Object[] arr_object = new Object[4];
            StringBuilder stringBuilder0 = new StringBuilder();
            int v1 = 0;
            int v2 = 0;
            for(int v = 0; v < s.length(); ++v) {
                int v3 = s.charAt(v);
                switch(v3) {
                    case 0x20: 
                    case 39: {
                        break;
                    }
                    case 44: {
                        if(v1 < 3) {
                            arr_object[v1] = stringBuilder0.toString();
                            stringBuilder0.setLength(0);
                            ++v1;
                        }
                        if(v2 == 1) {
                            Object object1 = arr_object[0];
                            if(object1 != null) {
                                arrayList0.add(new Ref(object1.toString()));
                                arr_object[0] = null;
                                v1 = 0;
                            }
                        }
                        break;
                    }
                    case 91: {
                        ++v2;
                        break;
                    }
                    case 93: {
                        if(v2 > 0) {
                            --v2;
                            arr_object[v1] = stringBuilder0.toString();
                            stringBuilder0.setLength(0);
                            Object object0 = arr_object[0];
                            if(object0 != null) {
                                arrayList0.add(new Ref(object0.toString(), Ref.f(arr_object[1]), Ref.f(arr_object[2]), Ref.f(arr_object[3])));
                                Arrays.fill(arr_object, null);
                                v1 = 0;
                            }
                        }
                        break;
                    }
                    default: {
                        stringBuilder0.append(((char)v3));
                    }
                }
            }
        }
    }

    public String b() {
        return this.a;
    }

    public float c() {
        return this.d;
    }

    public float d() {
        return this.c;
    }

    public float e() {
        return this.b;
    }

    public static float f(Object object0) {
        try {
            return Float.parseFloat(object0.toString());
        }
        catch(Exception unused_ex) {
            return NaNf;
        }
    }

    public static Ref g(String s) {
        String[] arr_s = s.replaceAll("[\\[\\]\\\']", "").split(",");
        if(arr_s.length == 0) {
            return null;
        }
        Object[] arr_object = new Object[4];
        for(int v = 0; v < arr_s.length && v < 4; ++v) {
            arr_object[v] = arr_s[v];
        }
        return new Ref(arr_object[0].toString().replace("\'", ""), Ref.f(arr_object[1]), Ref.f(arr_object[2]), Ref.f(arr_object[3]));
    }

    public void h(String s) {
        this.a = s;
    }

    public void i(float f) {
        this.d = f;
    }

    public void j(float f) {
        this.c = f;
    }

    public void k(float f) {
        this.b = f;
    }

    @Override
    public String toString() {
        if(this.a != null && this.a.length() != 0) {
            StringBuilder stringBuilder0 = new StringBuilder();
            boolean z = !Float.isNaN(this.b) || !Float.isNaN(this.c) || !Float.isNaN(this.d);
            if(z) {
                stringBuilder0.append("[");
            }
            stringBuilder0.append("\'");
            stringBuilder0.append(this.a);
            stringBuilder0.append("\'");
            float f = 0.0f;
            if(!Float.isNaN(this.d)) {
                stringBuilder0.append(",");
                stringBuilder0.append((Float.isNaN(this.b) ? 0.0f : this.b));
                stringBuilder0.append(",");
                if(!Float.isNaN(this.c)) {
                    f = this.c;
                }
                stringBuilder0.append(f);
                stringBuilder0.append(",");
                stringBuilder0.append(this.d);
            }
            else if(!Float.isNaN(this.c)) {
                stringBuilder0.append(",");
                if(!Float.isNaN(this.b)) {
                    f = this.b;
                }
                stringBuilder0.append(f);
                stringBuilder0.append(",");
                stringBuilder0.append(this.c);
            }
            else if(!Float.isNaN(this.b)) {
                stringBuilder0.append(",");
                stringBuilder0.append(this.b);
            }
            if(z) {
                stringBuilder0.append("]");
            }
            stringBuilder0.append(",");
            return stringBuilder0.toString();
        }
        return "";
    }
}

