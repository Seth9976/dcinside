package androidx.lifecycle;

public final class a implements Runnable {
    public final ComputableLiveData a;

    public a(ComputableLiveData computableLiveData0) {
        this.a = computableLiveData0;
    }

    @Override
    public final void run() {
        ComputableLiveData.l(this.a);
    }
}

