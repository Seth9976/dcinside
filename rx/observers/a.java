package rx.observers;

import java.util.List;
import java.util.concurrent.TimeUnit;
import rx.h;
import rx.i;
import rx.o;

public interface a extends h, o {
    a A(long arg1, TimeUnit arg2);

    a B(int arg1, long arg2, TimeUnit arg3);

    a C();

    a D(List arg1);

    a E(Throwable arg1);

    a F(Object arg1);

    a G();

    a H(Object[] arg1);

    int I();

    a J(long arg1);

    a K(Class arg1, String arg2, Object[] arg3);

    Thread L();

    a M(Class arg1);

    a N();

    a O();

    a P();

    List S();

    a U(int arg1);

    a V(long arg1, TimeUnit arg2);

    a W(Class arg1, Object[] arg2);

    void X(i arg1);

    a Z(rx.functions.a arg1);

    int getValueCount();

    @Override  // rx.o
    boolean j();

    @Override  // rx.o
    void l();

    void onStart();

    a r();

    a s(Object arg1, Object[] arg2);

    a u(Object[] arg1);

    a w();

    a y();

    List z();
}

