package androidx.constraintlayout.core.parser;

public class CLParser {
    static enum TYPE {
        UNKNOWN,
        OBJECT,
        ARRAY,
        NUMBER,
        STRING,
        KEY,
        TOKEN;

        private static TYPE[] a() [...] // Inlined contents
    }

    private String a;
    private boolean b;
    private int c;
    static boolean d = false;

    static {
    }

    public CLParser(String s) {
        this.b = false;
        this.a = s;
    }

    private CLElement a(CLElement cLElement0, int v, TYPE cLParser$TYPE0, boolean z, char[] arr_c) {
        CLElement cLElement1;
        switch(cLParser$TYPE0.ordinal()) {
            case 1: {
                cLElement1 = CLObject.d0(arr_c);
                ++v;
                break;
            }
            case 2: {
                cLElement1 = CLArray.B(arr_c);
                ++v;
                break;
            }
            case 3: {
                cLElement1 = CLNumber.A(arr_c);
                break;
            }
            case 4: {
                cLElement1 = CLString.A(arr_c);
                break;
            }
            case 5: {
                cLElement1 = CLKey.B(arr_c);
                break;
            }
            case 6: {
                cLElement1 = CLToken.A(arr_c);
                break;
            }
            default: {
                cLElement1 = null;
            }
        }
        if(cLElement1 == null) {
            return null;
        }
        cLElement1.v(this.c);
        if(z) {
            cLElement1.x(((long)v));
        }
        if(cLElement0 instanceof CLContainer) {
            cLElement1.t(((CLContainer)cLElement0));
        }
        return cLElement1;
    }

    private CLElement b(int v, char c, CLElement cLElement0, char[] arr_c) throws CLParsingException {
        switch(c) {
            case 34: 
            case 39: {
                return cLElement0 instanceof CLObject ? this.a(cLElement0, v, TYPE.f, true, arr_c) : this.a(cLElement0, v, TYPE.e, true, arr_c);
            }
            case 0x2F: {
                if(v + 1 < arr_c.length && arr_c[v + 1] == 0x2F) {
                    this.b = true;
                    return cLElement0;
                }
                break;
            }
            case 43: 
            case 45: 
            case 46: 
            case 0x30: 
            case 49: 
            case 50: 
            case 51: 
            case 52: 
            case 53: 
            case 54: 
            case 55: 
            case 56: 
            case 57: {
                return this.a(cLElement0, v, TYPE.d, true, arr_c);
            }
            case 9: 
            case 10: 
            case 13: 
            case 0x20: 
            case 44: 
            case 58: {
                break;
            }
            case 91: {
                return this.a(cLElement0, v, TYPE.c, true, arr_c);
            }
            case 0x7B: {
                return this.a(cLElement0, v, TYPE.b, true, arr_c);
            label_10:
                if(!(cLElement0 instanceof CLContainer) || cLElement0 instanceof CLObject) {
                    return this.a(cLElement0, v, TYPE.f, true, arr_c);
                }
                cLElement0 = this.a(cLElement0, v, TYPE.g, true, arr_c);
                if(!((CLToken)cLElement0).E(c, ((long)v))) {
                    throw new CLParsingException("incorrect token <" + c + "> at line " + this.c, ((CLToken)cLElement0));
                }
                break;
            }
            case 93: 
            case 0x7D: {
                cLElement0.u(((long)(v - 1)));
                cLElement0 = cLElement0.d();
                cLElement0.u(((long)v));
                return cLElement0;
            }
            default: {
                goto label_10;
            }
        }
        return cLElement0;
    }

    public CLObject c() throws CLParsingException {
        char[] arr_c = this.a.toCharArray();
        this.c = 1;
        int v;
        for(v = 0; true; ++v) {
            if(v >= arr_c.length) {
                v = -1;
                break;
            }
            int v1 = arr_c[v];
            if(v1 == 0x7B) {
                break;
            }
            if(v1 == 10) {
                ++this.c;
            }
        }
        if(v == -1) {
            throw new CLParsingException("invalid json content", null);
        }
        CLObject cLObject0 = CLObject.d0(arr_c);
        cLObject0.v(this.c);
        cLObject0.x(((long)v));
        int v2 = v + 1;
        CLElement cLElement0 = cLObject0;
        while(v2 < arr_c.length) {
            int v3 = arr_c[v2];
            if(v3 == 10) {
                ++this.c;
            }
            if(!this.b) {
            label_25:
                if(cLElement0 == null) {
                    break;
                }
                if(cLElement0.p()) {
                    cLElement0 = this.b(v2, ((char)v3), cLElement0, arr_c);
                }
                else if(cLElement0 instanceof CLObject) {
                    if(v3 == 0x7D) {
                        cLElement0.u(((long)(v2 - 1)));
                    }
                    else {
                        cLElement0 = this.b(v2, ((char)v3), cLElement0, arr_c);
                    }
                }
                else if(cLElement0 instanceof CLArray) {
                    if(v3 == 93) {
                        cLElement0.u(((long)(v2 - 1)));
                    }
                    else {
                        cLElement0 = this.b(v2, ((char)v3), cLElement0, arr_c);
                    }
                }
                else if(cLElement0 instanceof CLString) {
                    long v4 = cLElement0.b;
                    if(arr_c[((int)v4)] == v3) {
                        cLElement0.x(v4 + 1L);
                        cLElement0.u(((long)(v2 - 1)));
                    }
                }
                else {
                    if(cLElement0 instanceof CLToken && !((CLToken)cLElement0).E(((char)v3), ((long)v2))) {
                        throw new CLParsingException("parsing incorrect token " + ((CLToken)cLElement0).c() + " at line " + this.c, ((CLToken)cLElement0));
                    }
                    if(cLElement0 instanceof CLKey || cLElement0 instanceof CLString) {
                        long v5 = cLElement0.b;
                        int v6 = arr_c[((int)v5)];
                        if((v6 == 34 || v6 == 39) && v6 == v3) {
                            cLElement0.x(v5 + 1L);
                            cLElement0.u(((long)(v2 - 1)));
                        }
                    }
                    if(!cLElement0.p()) {
                        if(v3 != 93 && v3 != 0x7D) {
                            switch(v3) {
                                case 9: 
                                case 10: 
                                case 13: 
                                case 0x20: 
                                case 44: 
                                case 58: {
                                    break;
                                }
                                default: {
                                    goto label_66;
                                }
                            }
                        }
                        cLElement0.u(((long)(v2 - 1)));
                        if(v3 == 93 || v3 == 0x7D) {
                            cLElement0 = cLElement0.d();
                            cLElement0.u(((long)(v2 - 1)));
                            if(cLElement0 instanceof CLKey) {
                                cLElement0 = cLElement0.d();
                                cLElement0.u(((long)(v2 - 1)));
                            }
                        }
                    }
                }
            label_66:
                if(cLElement0.p() && (!(cLElement0 instanceof CLKey) || ((CLKey)cLElement0).h.size() > 0)) {
                    cLElement0 = cLElement0.d();
                }
            }
            else if(v3 == 10) {
                this.b = false;
                goto label_25;
            }
            ++v2;
        }
        while(cLElement0 != null && !cLElement0.p()) {
            if(cLElement0 instanceof CLString) {
                cLElement0.x(((long)(((int)cLElement0.b) + 1)));
            }
            cLElement0.u(((long)(arr_c.length - 1)));
            cLElement0 = cLElement0.d();
        }
        return cLObject0;
    }

    public static CLObject d(String s) throws CLParsingException {
        return new CLParser(s).c();
    }
}

