package j$.util.stream;

import j..util.Spliterator;
import jeb.synthetic.TWR;

final class p extends j2 {
    public final int b;
    boolean c;
    Object d;

    public p(R3 r30, n2 n20) {
        this.b = 2;
        this.d = r30;
        super(n20);
        this.c = true;
    }

    public p(n2 n20) {
        this.b = 0;
        super(n20);
    }

    public p(v v0, n2 n20) {
        this.b = 1;
        this.d = v0;
        super(n20);
    }

    @Override
    public final void accept(Object object0) {
        switch(this.b) {
            case 0: {
                n2 n20 = this.a;
                if(object0 == null) {
                    if(!this.c) {
                        this.c = true;
                        this.d = null;
                        n20.accept(null);
                        return;
                    }
                }
                else if(this.d == null || !object0.equals(this.d)) {
                    this.d = object0;
                    n20.accept(object0);
                }
                return;
            }
            case 1: {
                Stream stream0 = (Stream)((m)((v)this.d).o).apply(object0);
                if(stream0 != null) {
                    try {
                        n2 n21 = this.a;
                        if(this.c) {
                            Spliterator spliterator0 = ((Stream)stream0.sequential()).spliterator();
                            while(!n21.n() && spliterator0.tryAdvance(n21)) {
                            }
                        }
                        else {
                            ((Stream)stream0.sequential()).forEach(n21);
                        }
                    }
                    catch(Throwable throwable0) {
                        TWR.safeClose$NT(stream0, throwable0);
                        throw throwable0;
                    }
                }
                if(stream0 != null) {
                    stream0.close();
                }
                return;
            }
            default: {
                if(this.c) {
                    boolean z = ((R3)this.d).n.test(object0);
                    this.c = z;
                    if(z) {
                        this.a.accept(object0);
                    }
                }
            }
        }
    }

    @Override  // j$.util.stream.j2
    public void k() {
        if(this.b != 0) {
            super.k();
            return;
        }
        this.c = false;
        this.d = null;
        this.a.k();
    }

    @Override  // j$.util.stream.j2
    public final void l(long v) {
        switch(this.b) {
            case 0: {
                this.c = false;
                this.d = null;
                this.a.l(-1L);
                return;
            }
            case 1: {
                this.a.l(-1L);
                return;
            }
            default: {
                this.a.l(-1L);
            }
        }
    }

    @Override  // j$.util.stream.j2
    public boolean n() {
        switch(this.b) {
            case 1: {
                this.c = true;
                return this.a.n();
            }
            case 2: {
                return !this.c || this.a.n();
            }
            default: {
                return super.n();
            }
        }
    }
}

