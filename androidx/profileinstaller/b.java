package androidx.profileinstaller;

public final class b implements Runnable {
    public final DeviceProfileWriter a;
    public final int b;
    public final Object c;

    public b(DeviceProfileWriter deviceProfileWriter0, int v, Object object0) {
        this.a = deviceProfileWriter0;
        this.b = v;
        this.c = object0;
    }

    @Override
    public final void run() {
        this.a.g(this.b, this.c);
    }
}

