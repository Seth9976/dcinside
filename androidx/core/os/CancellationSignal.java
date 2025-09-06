package androidx.core.os;

@Deprecated
public final class CancellationSignal {
    public interface OnCancelListener {
        void onCancel();
    }

    private boolean a;
    private OnCancelListener b;
    private Object c;
    private boolean d;

    public void a() {
        Object object0;
        OnCancelListener cancellationSignal$OnCancelListener0;
        synchronized(this) {
            if(this.a) {
                return;
            }
            this.a = true;
            this.d = true;
            cancellationSignal$OnCancelListener0 = this.b;
            object0 = this.c;
        }
        try {
            if(cancellationSignal$OnCancelListener0 != null) {
                cancellationSignal$OnCancelListener0.onCancel();
            }
            if(object0 != null) {
                ((android.os.CancellationSignal)object0).cancel();
            }
            goto label_24;
        }
        catch(Throwable throwable0) {
        }
        synchronized(this) {
            this.d = false;
            this.notifyAll();
        }
        throw throwable0;
    label_24:
        synchronized(this) {
            this.d = false;
            this.notifyAll();
        }
    }

    public Object b() {
        synchronized(this) {
            if(this.c == null) {
                android.os.CancellationSignal cancellationSignal0 = new android.os.CancellationSignal();
                this.c = cancellationSignal0;
                if(this.a) {
                    cancellationSignal0.cancel();
                }
            }
            return this.c;
        }
    }

    public boolean c() {
        synchronized(this) {
        }
        return this.a;
    }

    public void d(OnCancelListener cancellationSignal$OnCancelListener0) {
        synchronized(this) {
            this.f();
            if(this.b == cancellationSignal$OnCancelListener0) {
                return;
            }
            this.b = cancellationSignal$OnCancelListener0;
            if(this.a && cancellationSignal$OnCancelListener0 != null) {
                cancellationSignal$OnCancelListener0.onCancel();
            }
        }
    }

    public void e() {
        if(this.c()) {
            throw new OperationCanceledException();
        }
    }

    private void f() {
        while(this.d) {
            try {
                this.wait();
            }
            catch(InterruptedException unused_ex) {
            }
        }
    }
}

