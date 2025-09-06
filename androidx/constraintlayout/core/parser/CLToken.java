package androidx.constraintlayout.core.parser;

public class CLToken extends CLElement {
    static enum Type {
        UNKNOWN,
        TRUE,
        FALSE,
        NULL;

        private static Type[] a() [...] // Inlined contents
    }

    int h;
    Type i;
    char[] j;
    char[] k;
    char[] l;

    public CLToken(char[] arr_c) {
        super(arr_c);
        this.h = 0;
        this.i = Type.a;
        this.j = "true".toCharArray();
        this.k = "false".toCharArray();
        this.l = "null".toCharArray();
    }

    public static CLElement A(char[] arr_c) {
        return new CLToken(arr_c);
    }

    public boolean B() throws CLParsingException {
        Type cLToken$Type0 = this.i;
        if(cLToken$Type0 == Type.b) {
            return true;
        }
        if(cLToken$Type0 != Type.c) {
            throw new CLParsingException("this token is not a boolean: <" + this.c() + ">", this);
        }
        return false;
    }

    public Type C() {
        return this.i;
    }

    public boolean D() throws CLParsingException {
        if(this.i != Type.d) {
            throw new CLParsingException("this token is not a null: <" + this.c() + ">", this);
        }
        return true;
    }

    public boolean E(char c, long v) {
        boolean z = false;
        switch(this.i.ordinal()) {
            case 0: {
                int v1 = this.h;
                if(this.j[v1] == c) {
                    this.i = Type.b;
                    z = true;
                }
                else if(this.k[v1] == c) {
                    this.i = Type.c;
                    z = true;
                }
                else if(this.l[v1] == c) {
                    this.i = Type.d;
                    z = true;
                }
                break;
            }
            case 1: {
                char[] arr_c = this.j;
                int v2 = this.h;
                if(arr_c[v2] == c) {
                    z = true;
                    if(v2 + 1 == arr_c.length) {
                        this.u(v);
                    }
                }
                break;
            }
            case 2: {
                char[] arr_c1 = this.k;
                int v3 = this.h;
                if(arr_c1[v3] == c) {
                    z = true;
                    if(v3 + 1 == arr_c1.length) {
                        this.u(v);
                    }
                }
                break;
            }
            case 3: {
                char[] arr_c2 = this.l;
                int v4 = this.h;
                if(arr_c2[v4] == c) {
                    z = true;
                    if(v4 + 1 == arr_c2.length) {
                        this.u(v);
                    }
                }
            }
        }
        ++this.h;
        return z;
    }

    @Override  // androidx.constraintlayout.core.parser.CLElement
    protected String y(int v, int v1) {
        StringBuilder stringBuilder0 = new StringBuilder();
        this.a(stringBuilder0, v);
        stringBuilder0.append(this.c());
        return stringBuilder0.toString();
    }

    @Override  // androidx.constraintlayout.core.parser.CLElement
    protected String z() {
        return this.c();
    }
}

