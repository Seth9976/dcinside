package javassist.bytecode;

class o implements c0 {
    private t a;
    private p b;

    public o(p p0) {
        this.b = p0;
        this.a = p0.d();
    }

    private void a(int v, int v1, int v2, int[] arr_v, int v3) throws e {
        if(v1 < 0 || v2 <= v1) {
            throw new e("bad branch offset at " + v);
        }
        int v4 = arr_v[v1];
        if(v4 == 0) {
            arr_v[v1] = -v3;
            return;
        }
        if(v4 != v3 && v4 != -v3) {
            throw new e("verification error (" + v3 + "," + v4 + ") at " + v);
        }
    }

    public int b() throws e {
        q q0 = this.b.G();
        int v = q0.j();
        int[] arr_v = new int[v];
        this.a = this.b.d();
        this.d(arr_v, this.b);
        do {
            boolean z = false;
            for(int v2 = 0; v2 < v; ++v2) {
                if(arr_v[v2] < 0) {
                    this.g(q0, arr_v, v2);
                    z = true;
                }
            }
        }
        while(z);
        int v3 = 1;
        for(int v1 = 0; v1 < v; ++v1) {
            int v4 = arr_v[v1];
            if(v4 > v3) {
                v3 = v4;
            }
        }
        return v3 - 1;
    }

    private int c(q q0, int v) {
        return w.e(this.a.J(q0.T(v + 1)));
    }

    private void d(int[] arr_v, p p0) {
        arr_v[0] = -1;
        A a0 = p0.C();
        if(a0 != null) {
            int v1 = a0.p();
            for(int v = 0; v < v1; ++v) {
                arr_v[a0.g(v)] = -2;
            }
        }
    }

    // 去混淆评级： 低(20)
    private static boolean e(int v) {
        return 0xAC <= v && v <= 0xB1 || v == 0xBF;
    }

    private boolean f(int v, q q0, int v1, int v2, int[] arr_v, int v3, int[] arr_v1) throws e {
        int v4 = 0;
        if(0x99 > v || v > 0xA6) {
            switch(v) {
                case 0xA7: {
                    this.a(v1, v1 + q0.L(v1 + 1), v2, arr_v, v3);
                    return true;
                }
                case 0xA9: {
                    int v6 = arr_v1[0];
                    if(v6 < 0) {
                        arr_v1[0] = v3 + 1;
                        return false;
                    }
                    if(v3 + 1 != v6) {
                        throw new e("sorry, cannot compute this data flow due to RET: " + v3 + "," + arr_v1[0]);
                    }
                    return true;
                }
                case 170: 
                case 0xAB: {
                    this.a(v1, v1 + q0.M((v1 & -4) + 4), v2, arr_v, v3);
                    if(v == 0xAB) {
                        int v7 = q0.M((v1 & -4) + 8);
                        int v8 = (v1 & -4) + 16;
                        while(v4 < v7) {
                            this.a(v1, v1 + q0.M(v8), v2, arr_v, v3);
                            v8 += 8;
                            ++v4;
                        }
                        return true;
                    }
                    int v9 = q0.M((v1 & -4) + 8);
                    int v10 = q0.M((v1 & -4) + 12);
                    int v11 = (v1 & -4) + 16;
                    while(v4 < v10 - v9 + 1) {
                        this.a(v1, v1 + q0.M(v11), v2, arr_v, v3);
                        v11 += 4;
                        ++v4;
                    }
                    return true;
                }
                case 0xC6: 
                case 0xC7: {
                    break;
                }
                case 200: {
                    this.a(v1, v1 + q0.M(v1 + 1), v2, arr_v, v3);
                    return true;
                }
                case 0xA8: 
                case 201: {
                    this.a(v1, (v == 0xA8 ? q0.L(v1 + 1) : q0.M(v1 + 1)) + v1, v2, arr_v, v3);
                    int v5 = arr_v1[0];
                    if(v5 < 0) {
                        arr_v1[0] = v3;
                        return false;
                    }
                    if(v3 != v5) {
                        throw new e("sorry, cannot compute this data flow due to JSR: " + v3 + "," + arr_v1[0]);
                    }
                    return false;
                }
                default: {
                    return false;
                }
            }
        }
        this.a(v1, v1 + q0.L(v1 + 1), v2, arr_v, v3);
        return false;
    }

    private void g(q q0, int[] arr_v, int v) throws e {
        q0.H(v);
        int v1 = -arr_v[v];
        while(q0.l()) {
            int v2 = q0.J();
            arr_v[v2] = v1;
            int v3 = q0.f(v2);
            v1 = this.h(v3, q0, v2, v1);
            if(v1 < 1) {
                throw new e("stack underflow at " + v2);
            }
            if(this.f(v3, q0, v2, arr_v.length, arr_v, v1, new int[]{-1}) || o.e(v3)) {
                break;
            }
            if(v3 == 0xA8 || v3 == 201) {
                --v1;
            }
        }
    }

    private int h(int v, q q0, int v1, int v2) throws e {
        switch(v) {
            case 0xB2: {
                return v2 + this.c(q0, v1);
            }
            case 0xB3: {
                return v2 - this.c(q0, v1);
            }
            case 180: {
                return v2 + (this.c(q0, v1) - 1);
            }
            case 0xB5: {
                return v2 - (this.c(q0, v1) + 1);
            }
            case 0xB6: 
            case 0xB7: {
                return v2 + (w.e(this.a.g0(q0.T(v1 + 1))) - 1);
            }
            case 0xB8: {
                return v2 + w.e(this.a.g0(q0.T(v1 + 1)));
            }
            case 0xB9: {
                return v2 + (w.e(this.a.Q(q0.T(v1 + 1))) - 1);
            }
            case 0xBA: {
                return v2 + w.e(this.a.T(q0.T(v1 + 1)));
            }
            case 0xBF: {
                return 1;
            }
            case 0xC4: {
                return v2 + c0.M6[q0.f(v1 + 1)];
            }
            case 0xC5: {
                return 1 - q0.f(v1 + 3) + v2;
            }
            default: {
                return v2 + c0.M6[v];
            }
        }
    }
}

