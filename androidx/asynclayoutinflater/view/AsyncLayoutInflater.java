package androidx.asynclayoutinflater.view;

import android.content.Context;
import android.os.Handler.Callback;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.core.util.Pools.SynchronizedPool;
import java.util.concurrent.ArrayBlockingQueue;

public final class AsyncLayoutInflater {
    static class BasicInflater extends LayoutInflater {
        private static final String[] a;

        static {
            BasicInflater.a = new String[]{"android.widget.", "android.webkit.", "android.app."};
        }

        BasicInflater(Context context0) {
            super(context0);
        }

        @Override  // android.view.LayoutInflater
        public LayoutInflater cloneInContext(Context context0) {
            return new BasicInflater(context0);
        }

        @Override  // android.view.LayoutInflater
        protected View onCreateView(String s, AttributeSet attributeSet0) throws ClassNotFoundException {
            String[] arr_s = BasicInflater.a;
            for(int v = 0; v < arr_s.length; ++v) {
                String s1 = arr_s[v];
                try {
                    View view0 = this.createView(s, s1, attributeSet0);
                    if(view0 != null) {
                        return view0;
                    }
                }
                catch(ClassNotFoundException unused_ex) {
                }
            }
            return super.onCreateView(s, attributeSet0);
        }
    }

    static class InflateRequest {
        AsyncLayoutInflater a;
        ViewGroup b;
        int c;
        View d;
        OnInflateFinishedListener e;

    }

    static class InflateThread extends Thread {
        private ArrayBlockingQueue a;
        private SynchronizedPool b;
        private static final InflateThread c;

        static {
            InflateThread asyncLayoutInflater$InflateThread0 = new InflateThread();
            InflateThread.c = asyncLayoutInflater$InflateThread0;
            asyncLayoutInflater$InflateThread0.start();
        }

        private InflateThread() {
            this.a = new ArrayBlockingQueue(10);
            this.b = new SynchronizedPool(10);
        }

        public void a(InflateRequest asyncLayoutInflater$InflateRequest0) {
            try {
                this.a.put(asyncLayoutInflater$InflateRequest0);
            }
            catch(InterruptedException interruptedException0) {
                throw new RuntimeException("Failed to enqueue async inflate request", interruptedException0);
            }
        }

        public static InflateThread b() {
            return InflateThread.c;
        }

        public InflateRequest c() {
            InflateRequest asyncLayoutInflater$InflateRequest0 = (InflateRequest)this.b.b();
            return asyncLayoutInflater$InflateRequest0 == null ? new InflateRequest() : asyncLayoutInflater$InflateRequest0;
        }

        public void d(InflateRequest asyncLayoutInflater$InflateRequest0) {
            asyncLayoutInflater$InflateRequest0.e = null;
            asyncLayoutInflater$InflateRequest0.a = null;
            asyncLayoutInflater$InflateRequest0.b = null;
            asyncLayoutInflater$InflateRequest0.c = 0;
            asyncLayoutInflater$InflateRequest0.d = null;
            this.b.a(asyncLayoutInflater$InflateRequest0);
        }

        public void e() {
            InflateRequest asyncLayoutInflater$InflateRequest0;
            try {
                asyncLayoutInflater$InflateRequest0 = (InflateRequest)this.a.take();
            }
            catch(InterruptedException interruptedException0) {
                Log.w("AsyncLayoutInflater", interruptedException0);
                return;
            }
            try {
                asyncLayoutInflater$InflateRequest0.d = asyncLayoutInflater$InflateRequest0.a.a.inflate(asyncLayoutInflater$InflateRequest0.c, asyncLayoutInflater$InflateRequest0.b, false);
            }
            catch(RuntimeException runtimeException0) {
                Log.w("AsyncLayoutInflater", "Failed to inflate resource in the background! Retrying on the UI thread", runtimeException0);
            }
            Message.obtain(asyncLayoutInflater$InflateRequest0.a.b, 0, asyncLayoutInflater$InflateRequest0).sendToTarget();
        }

        @Override
        public void run() {
            while(true) {
                this.e();
            }
        }
    }

    public interface OnInflateFinishedListener {
        void a(@NonNull View arg1, @LayoutRes int arg2, @Nullable ViewGroup arg3);
    }

    LayoutInflater a;
    Handler b;
    InflateThread c;
    private Handler.Callback d;
    private static final String e = "AsyncLayoutInflater";

    public AsyncLayoutInflater(@NonNull Context context0) {
        this.d = new Handler.Callback() {
            final AsyncLayoutInflater a;

            @Override  // android.os.Handler$Callback
            public boolean handleMessage(Message message0) {
                InflateRequest asyncLayoutInflater$InflateRequest0 = (InflateRequest)message0.obj;
                if(asyncLayoutInflater$InflateRequest0.d == null) {
                    asyncLayoutInflater$InflateRequest0.d = AsyncLayoutInflater.this.a.inflate(asyncLayoutInflater$InflateRequest0.c, asyncLayoutInflater$InflateRequest0.b, false);
                }
                asyncLayoutInflater$InflateRequest0.e.a(asyncLayoutInflater$InflateRequest0.d, asyncLayoutInflater$InflateRequest0.c, asyncLayoutInflater$InflateRequest0.b);
                AsyncLayoutInflater.this.c.d(asyncLayoutInflater$InflateRequest0);
                return true;
            }
        };
        this.a = new BasicInflater(context0);
        this.b = new Handler(this.d);
        this.c = InflateThread.b();
    }

    @UiThread
    public void a(@LayoutRes int v, @Nullable ViewGroup viewGroup0, @NonNull OnInflateFinishedListener asyncLayoutInflater$OnInflateFinishedListener0) {
        if(asyncLayoutInflater$OnInflateFinishedListener0 == null) {
            throw new NullPointerException("callback argument may not be null!");
        }
        InflateRequest asyncLayoutInflater$InflateRequest0 = this.c.c();
        asyncLayoutInflater$InflateRequest0.a = this;
        asyncLayoutInflater$InflateRequest0.c = v;
        asyncLayoutInflater$InflateRequest0.b = viewGroup0;
        asyncLayoutInflater$InflateRequest0.e = asyncLayoutInflater$OnInflateFinishedListener0;
        this.c.a(asyncLayoutInflater$InflateRequest0);
    }
}

