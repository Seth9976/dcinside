package androidx.core.provider;

import android.graphics.Typeface;
import java.util.concurrent.Executor;

class CallbackWrapper {
    private final FontRequestCallback a;
    private final Executor b;

    CallbackWrapper(FontRequestCallback fontsContractCompat$FontRequestCallback0) {
        this(fontsContractCompat$FontRequestCallback0, RequestExecutor.b(CalleeHandler.a()));
    }

    CallbackWrapper(FontRequestCallback fontsContractCompat$FontRequestCallback0, Executor executor0) {
        this.a = fontsContractCompat$FontRequestCallback0;
        this.b = executor0;
    }

    private void a(int v) {
        androidx.core.provider.CallbackWrapper.2 callbackWrapper$20 = new Runnable() {
            final CallbackWrapper c;

            @Override
            public void run() {
                this.a.a(v);
            }
        };
        this.b.execute(callbackWrapper$20);
    }

    void b(TypefaceResult fontRequestWorker$TypefaceResult0) {
        if(fontRequestWorker$TypefaceResult0.a()) {
            this.c(fontRequestWorker$TypefaceResult0.a);
            return;
        }
        this.a(fontRequestWorker$TypefaceResult0.b);
    }

    private void c(Typeface typeface0) {
        androidx.core.provider.CallbackWrapper.1 callbackWrapper$10 = new Runnable() {
            final CallbackWrapper c;

            @Override
            public void run() {
                this.a.b(typeface0);
            }
        };
        this.b.execute(callbackWrapper$10);
    }
}

