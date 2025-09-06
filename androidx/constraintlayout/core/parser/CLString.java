package androidx.constraintlayout.core.parser;

import androidx.annotation.NonNull;

public class CLString extends CLElement {
    public CLString(char[] arr_c) {
        super(arr_c);
    }

    public static CLElement A(char[] arr_c) {
        return new CLString(arr_c);
    }

    @NonNull
    public static CLString B(@NonNull String s) {
        CLString cLString0 = new CLString(s.toCharArray());
        cLString0.x(0L);
        cLString0.u(((long)(s.length() - 1)));
        return cLString0;
    }

    @Override  // androidx.constraintlayout.core.parser.CLElement
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return !(object0 instanceof CLString) || !this.c().equals(((CLString)object0).c()) ? super.equals(object0) : true;
    }

    @Override  // androidx.constraintlayout.core.parser.CLElement
    public int hashCode() {
        return super.hashCode();
    }

    @Override  // androidx.constraintlayout.core.parser.CLElement
    protected String y(int v, int v1) {
        StringBuilder stringBuilder0 = new StringBuilder();
        this.a(stringBuilder0, v);
        stringBuilder0.append("\'");
        stringBuilder0.append(this.c());
        stringBuilder0.append("\'");
        return stringBuilder0.toString();
    }

    @Override  // androidx.constraintlayout.core.parser.CLElement
    protected String z() {
        return "\'" + this.c() + "\'";
    }
}

