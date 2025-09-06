package androidx.constraintlayout.core.state;

import androidx.annotation.NonNull;
import androidx.constraintlayout.core.motion.CustomAttribute;
import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLKey;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.widgets.ConstraintAnchor.Type;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.HashMap;
import java.util.Set;

public class WidgetFrame {
    public ConstraintWidget a;
    public int b;
    public int c;
    public int d;
    public int e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public int r;
    private final HashMap s;
    public String t;
    TypedBundle u;
    public static float v = NaNf;

    static {
    }

    public WidgetFrame() {
        this.a = null;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = NaNf;
        this.g = NaNf;
        this.h = NaNf;
        this.i = NaNf;
        this.j = NaNf;
        this.k = NaNf;
        this.l = NaNf;
        this.m = NaNf;
        this.n = NaNf;
        this.o = NaNf;
        this.p = NaNf;
        this.q = NaNf;
        this.r = 0;
        this.s = new HashMap();
        this.t = null;
    }

    public WidgetFrame(WidgetFrame widgetFrame0) {
        this.a = null;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = NaNf;
        this.g = NaNf;
        this.h = NaNf;
        this.i = NaNf;
        this.j = NaNf;
        this.k = NaNf;
        this.l = NaNf;
        this.m = NaNf;
        this.n = NaNf;
        this.o = NaNf;
        this.p = NaNf;
        this.q = NaNf;
        this.r = 0;
        this.s = new HashMap();
        this.t = null;
        this.a = widgetFrame0.a;
        this.b = widgetFrame0.b;
        this.c = widgetFrame0.c;
        this.d = widgetFrame0.d;
        this.e = widgetFrame0.e;
        this.G(widgetFrame0);
    }

    public WidgetFrame(ConstraintWidget constraintWidget0) {
        this.a = null;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = NaNf;
        this.g = NaNf;
        this.h = NaNf;
        this.i = NaNf;
        this.j = NaNf;
        this.k = NaNf;
        this.l = NaNf;
        this.m = NaNf;
        this.n = NaNf;
        this.o = NaNf;
        this.p = NaNf;
        this.q = NaNf;
        this.r = 0;
        this.s = new HashMap();
        this.t = null;
        this.a = constraintWidget0;
    }

    public void A(String s, int v, boolean z) {
        if(this.s.containsKey(s)) {
            ((CustomVariable)this.s.get(s)).t(z);
            return;
        }
        CustomVariable customVariable0 = new CustomVariable(s, v, z);
        this.s.put(s, customVariable0);
    }

    public void B(CustomAttribute customAttribute0, float[] arr_f) {
    }

    void C(TypedBundle typedBundle0) {
        this.u = typedBundle0;
    }

    public boolean D(String s, CLElement cLElement0) throws CLParsingException {
        s.hashCode();
        switch(s) {
            case "alpha": {
                this.p = cLElement0.j();
                return true;
            }
            case "bottom": {
                this.e = cLElement0.k();
                return true;
            }
            case "custom": {
                this.s(cLElement0);
                return true;
            }
            case "interpolatedPos": {
                this.q = cLElement0.j();
                return true;
            }
            case "left": {
                this.b = cLElement0.k();
                return true;
            }
            case "phone_orientation": {
                WidgetFrame.v = cLElement0.j();
                return true;
            }
            case "pivotX": {
                this.f = cLElement0.j();
                return true;
            }
            case "pivotY": {
                this.g = cLElement0.j();
                return true;
            }
            case "right": {
                this.d = cLElement0.k();
                return true;
            }
            case "rotationX": {
                this.h = cLElement0.j();
                return true;
            }
            case "rotationY": {
                this.i = cLElement0.j();
                return true;
            }
            case "rotationZ": {
                this.j = cLElement0.j();
                return true;
            }
            case "scaleX": {
                this.n = cLElement0.j();
                return true;
            }
            case "scaleY": {
                this.o = cLElement0.j();
                return true;
            }
            case "top": {
                this.c = cLElement0.k();
                return true;
            }
            case "translationX": {
                this.k = cLElement0.j();
                return true;
            }
            case "translationY": {
                this.l = cLElement0.j();
                return true;
            }
            case "translationZ": {
                this.m = cLElement0.j();
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public WidgetFrame E() {
        ConstraintWidget constraintWidget0 = this.a;
        if(constraintWidget0 != null) {
            this.b = constraintWidget0.L();
            this.c = this.a.e0();
            this.d = this.a.X();
            this.e = this.a.v();
            this.G(this.a.n);
        }
        return this;
    }

    public WidgetFrame F(ConstraintWidget constraintWidget0) {
        if(constraintWidget0 == null) {
            return this;
        }
        this.a = constraintWidget0;
        this.E();
        return this;
    }

    public void G(WidgetFrame widgetFrame0) {
        if(widgetFrame0 == null) {
            return;
        }
        this.f = widgetFrame0.f;
        this.g = widgetFrame0.g;
        this.h = widgetFrame0.h;
        this.i = widgetFrame0.i;
        this.j = widgetFrame0.j;
        this.k = widgetFrame0.k;
        this.l = widgetFrame0.l;
        this.m = widgetFrame0.m;
        this.n = widgetFrame0.n;
        this.o = widgetFrame0.o;
        this.p = widgetFrame0.p;
        this.r = widgetFrame0.r;
        this.C(widgetFrame0.u);
        this.s.clear();
        for(Object object0: widgetFrame0.s.values()) {
            String s = ((CustomVariable)object0).k();
            CustomVariable customVariable0 = ((CustomVariable)object0).d();
            this.s.put(s, customVariable0);
        }
    }

    public int H() {
        return Math.max(0, this.d - this.b);
    }

    private static void a(StringBuilder stringBuilder0, String s, float f) {
        if(Float.isNaN(f)) {
            return;
        }
        stringBuilder0.append(s);
        stringBuilder0.append(": ");
        stringBuilder0.append(f);
        stringBuilder0.append(",\n");
    }

    private static void b(StringBuilder stringBuilder0, String s, int v) {
        stringBuilder0.append(s);
        stringBuilder0.append(": ");
        stringBuilder0.append(v);
        stringBuilder0.append(",\n");
    }

    public void c(String s, int v) {
        this.y(s, 902, v);
    }

    public void d(String s, float f) {
        this.x(s, 901, f);
    }

    public float e() {
        return ((float)this.b) + ((float)(this.d - this.b)) / 2.0f;
    }

    public float f() {
        return ((float)this.c) + ((float)(this.e - this.c)) / 2.0f;
    }

    public boolean g(@NonNull String s) {
        return this.s.containsKey(s);
    }

    public CustomVariable h(String s) {
        return (CustomVariable)this.s.get(s);
    }

    public Set i() {
        return this.s.keySet();
    }

    // 去混淆评级： 低(20)
    public int j(String s) {
        return this.s.containsKey(s) ? ((CustomVariable)this.s.get(s)).g() : -21880;
    }

    // 去混淆评级： 低(20)
    public float k(String s) {
        return this.s.containsKey(s) ? ((CustomVariable)this.s.get(s)).h() : NaNf;
    }

    public String l() [...] // 潜在的解密器

    public TypedBundle m() {
        return this.u;
    }

    public int n() {
        return Math.max(0, this.e - this.c);
    }

    private static float o(float f, float f1, float f2, float f3) {
        boolean z = Float.isNaN(f);
        boolean z1 = Float.isNaN(f1);
        if(z && z1) {
            return NaNf;
        }
        if(z) {
            f = f2;
        }
        if(z1) {
            f1 = f2;
        }
        return f + f3 * (f1 - f);
    }

    public static void p(int v, int v1, WidgetFrame widgetFrame0, WidgetFrame widgetFrame1, WidgetFrame widgetFrame2, Transition transition0, float f) {
        float f7;
        int v18;
        int v17;
        int v16;
        int v15;
        int v14;
        int v13;
        float f5;
        float f4;
        float f3;
        int v12;
        int v11;
        int v10;
        int v2 = widgetFrame1.b;
        int v3 = widgetFrame1.c;
        int v4 = widgetFrame2.b;
        int v5 = widgetFrame2.c;
        int v6 = widgetFrame2.d - v4;
        int v7 = widgetFrame1.d - v2;
        int v8 = widgetFrame2.e - v5;
        int v9 = widgetFrame1.e - v3;
        float f1 = widgetFrame1.p;
        float f2 = widgetFrame2.p;
        if(widgetFrame1.r == 8) {
            v3 -= (int)(((float)v8) / 2.0f);
            v10 = v2 - ((int)(((float)v6) / 2.0f));
            if(Float.isNaN(f1)) {
                v11 = v8;
                v12 = v6;
                f3 = 0.0f;
            }
            else {
                f3 = f1;
                v12 = v6;
                v11 = v8;
            }
        }
        else {
            v12 = v7;
            f3 = f1;
            v11 = v9;
            v10 = v2;
        }
        if(widgetFrame2.r == 8) {
            v4 -= (int)(((float)v12) / 2.0f);
            v5 -= (int)(((float)v11) / 2.0f);
            v6 = v12;
            v8 = v11;
            if(Float.isNaN(f2)) {
                f2 = 0.0f;
            }
        }
        if(Float.isNaN(f3) && !Float.isNaN(f2)) {
            f3 = 1.0f;
        }
        if(!Float.isNaN(f3) && Float.isNaN(f2)) {
            f2 = 1.0f;
        }
        if(widgetFrame1.r == 4) {
            f4 = f2;
            f5 = 0.0f;
        }
        else {
            f5 = f3;
            f4 = f2;
        }
        float f6 = widgetFrame2.r == 4 ? 0.0f : f4;
        if(widgetFrame0.a == null || !transition0.W()) {
            v13 = v3;
            f7 = f;
            v16 = v10;
            v17 = v4;
        }
        else {
            KeyPosition transition$KeyPosition0 = transition0.C(widgetFrame0.a.o, ((int)(100.0f * f)));
            v13 = v3;
            KeyPosition transition$KeyPosition1 = transition0.B(widgetFrame0.a.o, ((int)(100.0f * f)));
            if(transition$KeyPosition0 == transition$KeyPosition1) {
                transition$KeyPosition1 = null;
            }
            if(transition$KeyPosition0 == null) {
                v14 = v4;
                v16 = v10;
                v15 = 0;
            }
            else {
                v14 = v4;
                v13 = (int)(transition$KeyPosition0.e * ((float)v1));
                v15 = transition$KeyPosition0.a;
                v16 = (int)(transition$KeyPosition0.d * ((float)v));
            }
            if(transition$KeyPosition1 == null) {
                v18 = 100;
                v17 = v14;
            }
            else {
                v17 = (int)(transition$KeyPosition1.d * ((float)v));
                v5 = (int)(transition$KeyPosition1.e * ((float)v1));
                v18 = transition$KeyPosition1.a;
            }
            f7 = (100.0f * f - ((float)v15)) / ((float)(v18 - v15));
        }
        widgetFrame0.a = widgetFrame1.a;
        int v19 = (int)(((float)v16) + ((float)(v17 - v16)) * f7);
        widgetFrame0.b = v19;
        int v20 = (int)(((float)v13) + f7 * ((float)(v5 - v13)));
        widgetFrame0.c = v20;
        widgetFrame0.d = v19 + ((int)(((float)v12) * (1.0f - f) + ((float)v6) * f));
        widgetFrame0.e = v20 + ((int)((1.0f - f) * ((float)v11) + ((float)v8) * f));
        widgetFrame0.f = WidgetFrame.o(widgetFrame1.f, widgetFrame2.f, 0.5f, f);
        widgetFrame0.g = WidgetFrame.o(widgetFrame1.g, widgetFrame2.g, 0.5f, f);
        widgetFrame0.h = WidgetFrame.o(widgetFrame1.h, widgetFrame2.h, 0.0f, f);
        widgetFrame0.i = WidgetFrame.o(widgetFrame1.i, widgetFrame2.i, 0.0f, f);
        widgetFrame0.j = WidgetFrame.o(widgetFrame1.j, widgetFrame2.j, 0.0f, f);
        widgetFrame0.n = WidgetFrame.o(widgetFrame1.n, widgetFrame2.n, 1.0f, f);
        widgetFrame0.o = WidgetFrame.o(widgetFrame1.o, widgetFrame2.o, 1.0f, f);
        widgetFrame0.k = WidgetFrame.o(widgetFrame1.k, widgetFrame2.k, 0.0f, f);
        widgetFrame0.l = WidgetFrame.o(widgetFrame1.l, widgetFrame2.l, 0.0f, f);
        widgetFrame0.m = WidgetFrame.o(widgetFrame1.m, widgetFrame2.m, 0.0f, f);
        widgetFrame0.p = WidgetFrame.o(f5, f6, 1.0f, f);
        Set set0 = widgetFrame2.s.keySet();
        widgetFrame0.s.clear();
        for(Object object0: set0) {
            String s = (String)object0;
            if(widgetFrame1.s.containsKey(s)) {
                CustomVariable customVariable0 = (CustomVariable)widgetFrame1.s.get(s);
                CustomVariable customVariable1 = (CustomVariable)widgetFrame2.s.get(s);
                CustomVariable customVariable2 = new CustomVariable(customVariable0);
                widgetFrame0.s.put(s, customVariable2);
                if(customVariable0.r() == 1) {
                    customVariable2.y(WidgetFrame.o(customVariable0.n(), customVariable1.n(), 0.0f, f));
                }
                else {
                    int v21 = customVariable0.r();
                    float[] arr_f = new float[v21];
                    float[] arr_f1 = new float[v21];
                    customVariable0.o(arr_f);
                    customVariable1.o(arr_f1);
                    for(int v22 = 0; v22 < v21; ++v22) {
                        arr_f[v22] = WidgetFrame.o(arr_f[v22], arr_f1[v22], 0.0f, f);
                        customVariable2.z(arr_f);
                    }
                }
            }
        }
    }

    // 去混淆评级： 中等(90)
    public boolean q() {
        return Float.isNaN(this.h) && Float.isNaN(this.i) && Float.isNaN(this.j) && Float.isNaN(this.k) && Float.isNaN(this.l) && Float.isNaN(this.m) && Float.isNaN(this.n) && Float.isNaN(this.o) && Float.isNaN(this.p);
    }

    void r(String s) {
        StackTraceElement stackTraceElement0 = new Throwable().getStackTrace()[1];
        String s1 = ".(" + stackTraceElement0.getFileName() + ":" + stackTraceElement0.getLineNumber() + ") " + "r" + " " + this.hashCode() % 1000;
        System.out.println((this.a == null ? s1 + "/NULL" : s1 + "/" + this.a.hashCode() % 1000) + " " + s);
    }

    void s(CLElement cLElement0) throws CLParsingException {
        int v = ((CLObject)cLElement0).size();
        for(int v1 = 0; v1 < v; ++v1) {
            CLElement cLElement1 = ((CLKey)((CLObject)cLElement0).D(v1)).h0();
            String s = cLElement1.c();
            if(s.matches("#[0-9a-fA-F]+")) {
                int v2 = Integer.parseInt(s.substring(1), 16);
                this.y(this.t, 902, v2);
            }
            else if(cLElement1 instanceof CLNumber) {
                this.x(this.t, 901, cLElement1.j());
            }
            else {
                this.z(this.t, 903, s);
            }
        }
    }

    void t() {
        StackTraceElement stackTraceElement0 = new Throwable().getStackTrace()[1];
        String s = ".(" + stackTraceElement0.getFileName() + ":" + stackTraceElement0.getLineNumber() + ") " + "t" + " " + this.hashCode() % 1000;
        String s1 = this.a == null ? s + "/NULL " : s + "/" + this.a.hashCode() % 1000 + " ";
        HashMap hashMap0 = this.s;
        if(hashMap0 != null) {
            for(Object object0: hashMap0.keySet()) {
                System.out.println(s1 + ((CustomVariable)this.s.get(((String)object0))).toString());
            }
        }
    }

    public StringBuilder u(StringBuilder stringBuilder0) {
        return this.v(stringBuilder0, false);
    }

    public StringBuilder v(StringBuilder stringBuilder0, boolean z) {
        stringBuilder0.append("{\n");
        WidgetFrame.b(stringBuilder0, "left", this.b);
        WidgetFrame.b(stringBuilder0, "top", this.c);
        WidgetFrame.b(stringBuilder0, "right", this.d);
        WidgetFrame.b(stringBuilder0, "bottom", this.e);
        WidgetFrame.a(stringBuilder0, "pivotX", this.f);
        WidgetFrame.a(stringBuilder0, "pivotY", this.g);
        WidgetFrame.a(stringBuilder0, "rotationX", this.h);
        WidgetFrame.a(stringBuilder0, "rotationY", this.i);
        WidgetFrame.a(stringBuilder0, "rotationZ", this.j);
        WidgetFrame.a(stringBuilder0, "translationX", this.k);
        WidgetFrame.a(stringBuilder0, "translationY", this.l);
        WidgetFrame.a(stringBuilder0, "translationZ", this.m);
        WidgetFrame.a(stringBuilder0, "scaleX", this.n);
        WidgetFrame.a(stringBuilder0, "scaleY", this.o);
        WidgetFrame.a(stringBuilder0, "alpha", this.p);
        WidgetFrame.b(stringBuilder0, "visibility", this.r);
        WidgetFrame.a(stringBuilder0, "interpolatedPos", this.q);
        if(this.a != null) {
            Type[] arr_constraintAnchor$Type = Type.values();
            for(int v = 0; v < arr_constraintAnchor$Type.length; ++v) {
                this.w(stringBuilder0, arr_constraintAnchor$Type[v]);
            }
        }
        if(z) {
            WidgetFrame.a(stringBuilder0, "phone_orientation", WidgetFrame.v);
        }
        if(z) {
            WidgetFrame.a(stringBuilder0, "phone_orientation", WidgetFrame.v);
        }
        if(this.s.size() != 0) {
            stringBuilder0.append("custom : {\n");
            for(Object object0: this.s.keySet()) {
                CustomVariable customVariable0 = (CustomVariable)this.s.get(((String)object0));
                stringBuilder0.append(((String)object0));
                stringBuilder0.append(": ");
                switch(customVariable0.m()) {
                    case 900: {
                        stringBuilder0.append(customVariable0.i());
                        stringBuilder0.append(",\n");
                        break;
                    }
                    case 902: {
                        stringBuilder0.append("\'");
                        stringBuilder0.append(CustomVariable.c(customVariable0.i()));
                        stringBuilder0.append("\',\n");
                        break;
                    }
                    case 903: {
                        stringBuilder0.append("\'");
                        stringBuilder0.append(customVariable0.l());
                        stringBuilder0.append("\',\n");
                        break;
                    }
                    case 904: {
                        stringBuilder0.append("\'");
                        stringBuilder0.append(customVariable0.f());
                        stringBuilder0.append("\',\n");
                        break;
                    }
                    case 901: 
                    case 905: {
                        stringBuilder0.append(customVariable0.h());
                        stringBuilder0.append(",\n");
                    }
                }
            }
            stringBuilder0.append("}\n");
        }
        stringBuilder0.append("}\n");
        return stringBuilder0;
    }

    private void w(StringBuilder stringBuilder0, Type constraintAnchor$Type0) {
        ConstraintAnchor constraintAnchor0 = this.a.r(constraintAnchor$Type0);
        if(constraintAnchor0 != null && constraintAnchor0.f != null) {
            stringBuilder0.append("Anchor");
            stringBuilder0.append(constraintAnchor$Type0.name());
            stringBuilder0.append(": [\'");
            String s = constraintAnchor0.f.i().o;
            if(s == null) {
                s = "#PARENT";
            }
            stringBuilder0.append(s);
            stringBuilder0.append("\', \'");
            stringBuilder0.append(constraintAnchor0.f.l().name());
            stringBuilder0.append("\', \'");
            stringBuilder0.append(constraintAnchor0.g);
            stringBuilder0.append("\'],\n");
        }
    }

    public void x(String s, int v, float f) {
        if(this.s.containsKey(s)) {
            ((CustomVariable)this.s.get(s)).u(f);
            return;
        }
        CustomVariable customVariable0 = new CustomVariable(s, v, f);
        this.s.put(s, customVariable0);
    }

    public void y(String s, int v, int v1) {
        if(this.s.containsKey(s)) {
            ((CustomVariable)this.s.get(s)).v(v1);
            return;
        }
        CustomVariable customVariable0 = new CustomVariable(s, v, v1);
        this.s.put(s, customVariable0);
    }

    public void z(String s, int v, String s1) {
        if(this.s.containsKey(s)) {
            ((CustomVariable)this.s.get(s)).x(s1);
            return;
        }
        CustomVariable customVariable0 = new CustomVariable(s, v, s1);
        this.s.put(s, customVariable0);
    }
}

