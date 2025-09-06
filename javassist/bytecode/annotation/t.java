package javassist.bytecode.annotation;

import java.io.IOException;
import java.io.OutputStream;

public class t extends d {
    public t(OutputStream outputStream0, javassist.bytecode.t t0) {
        super(outputStream0, t0);
    }

    public void A(int v) throws IOException {
        this.a.write(v);
    }

    public void B(int v) throws IOException {
        this.a.write(22);
        this.a.write(v);
    }

    public void C(int v, int v1) throws IOException {
        this.a.write(v);
        this.y(v1);
    }

    public void D(int v, int v1, int v2) throws IOException {
        this.y(v);
        this.y(v1);
        this.y(v2);
    }

    public void E(int v, int v1) throws IOException {
        this.a.write(v);
        this.y(v1);
    }

    public void F(int v) throws IOException {
        this.a.write(16);
        this.y(v);
    }

    public void G(int v) throws IOException {
        this.a.write(23);
        this.y(v);
    }

    public void H(int v, int v1, int v2) throws IOException {
        this.a.write(v);
        this.y(v1);
        this.a.write(v2);
    }

    public void I(int v, int v1, int v2) throws IOException {
        this.a.write(v);
        this.a.write(v1);
        this.a.write(v2);
    }

    public void J(int v, int v1) throws IOException {
        this.a.write(v);
        this.a.write(v1);
    }

    public void K(int v) throws IOException {
        this.a.write(v);
    }

    public void L(int v, int v1) throws IOException {
        this.a.write(v);
        this.a.write(v1);
    }

    @Override  // javassist.bytecode.annotation.d
    public void w(int v) throws IOException {
        super.w(v);
    }

    public void z(int v) throws IOException {
        this.a.write(66);
        this.y(v);
    }
}

