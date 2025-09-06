package androidx.compose.ui.text.input;

public final class d implements Runnable {
    public final TextInputServiceAndroid a;

    public d(TextInputServiceAndroid textInputServiceAndroid0) {
        this.a = textInputServiceAndroid0;
    }

    @Override
    public final void run() {
        TextInputServiceAndroid.t(this.a);
    }
}

