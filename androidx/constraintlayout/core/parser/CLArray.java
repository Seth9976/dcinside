package androidx.constraintlayout.core.parser;

public class CLArray extends CLContainer {
    public CLArray(char[] arr_c) {
        super(arr_c);
    }

    @Override  // androidx.constraintlayout.core.parser.CLContainer
    public static CLElement B(char[] arr_c) {
        return new CLArray(arr_c);
    }

    @Override  // androidx.constraintlayout.core.parser.CLElement
    protected String y(int v, int v1) {
        StringBuilder stringBuilder0 = new StringBuilder();
        String s = this.z();
        if(v1 <= 0 && s.length() + v < CLElement.f) {
            stringBuilder0.append(s);
            return stringBuilder0.toString();
        }
        stringBuilder0.append("[\n");
        boolean z = true;
        for(Object object0: this.h) {
            if(z) {
                z = false;
            }
            else {
                stringBuilder0.append(",\n");
            }
            this.a(stringBuilder0, CLElement.g + v);
            stringBuilder0.append(((CLElement)object0).y(CLElement.g + v, v1 - 1));
        }
        stringBuilder0.append("\n");
        this.a(stringBuilder0, v);
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }

    @Override  // androidx.constraintlayout.core.parser.CLElement
    protected String z() {
        StringBuilder stringBuilder0 = new StringBuilder("[");
        boolean z = true;
        for(int v = 0; v < this.h.size(); ++v) {
            if(z) {
                z = false;
            }
            else {
                stringBuilder0.append(", ");
            }
            stringBuilder0.append("");
        }
        return stringBuilder0 + "]";
    }
}

