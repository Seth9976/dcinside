package androidx.constraintlayout.core.parser;

public class CLNumber extends CLElement {
    float h;

    public CLNumber(float f) {
        super(null);
        this.h = f;
    }

    public CLNumber(char[] arr_c) {
        super(arr_c);
        this.h = NaNf;
    }

    public static CLElement A(char[] arr_c) {
        return new CLNumber(arr_c);
    }

    public boolean B() {
        float f = this.j();
        return ((float)(((int)f))) == f;
    }

    public void C(float f) {
        this.h = f;
    }

    @Override  // androidx.constraintlayout.core.parser.CLElement
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 instanceof CLNumber) {
            float f = this.j();
            float f1 = ((CLNumber)object0).j();
            return !Float.isNaN(f) || !Float.isNaN(f1) ? f == f1 : true;
        }
        return false;
    }

    @Override  // androidx.constraintlayout.core.parser.CLElement
    public int hashCode() {
        int v = super.hashCode();
        return this.h == 0.0f ? v * 0x1F : v * 0x1F + Float.floatToIntBits(this.h);
    }

    @Override  // androidx.constraintlayout.core.parser.CLElement
    public float j() {
        if(Float.isNaN(this.h) && this.o()) {
            this.h = Float.parseFloat(this.c());
        }
        return this.h;
    }

    @Override  // androidx.constraintlayout.core.parser.CLElement
    public int k() {
        if(Float.isNaN(this.h) && this.o()) {
            this.h = (float)Integer.parseInt(this.c());
        }
        return (int)this.h;
    }

    @Override  // androidx.constraintlayout.core.parser.CLElement
    protected String y(int v, int v1) {
        StringBuilder stringBuilder0 = new StringBuilder();
        this.a(stringBuilder0, v);
        float f = this.j();
        if(((float)(((int)f))) == f) {
            stringBuilder0.append(((int)f));
            return stringBuilder0.toString();
        }
        stringBuilder0.append(f);
        return stringBuilder0.toString();
    }

    @Override  // androidx.constraintlayout.core.parser.CLElement
    protected String z() {
        float f = this.j();
        return ((float)(((int)f))) == f ? "" + ((int)f) : "" + f;
    }
}

