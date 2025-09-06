package androidx.lifecycle;

public final class b implements Runnable {
    public final ComputableLiveData a;

    public b(ComputableLiveData computableLiveData0) {
        this.a = computableLiveData0;
    }

    @Override
    public final void run() {
        ComputableLiveData.k(this.a);
    }
}

