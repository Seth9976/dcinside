package com.iab.omid.library.bytedance2.walking.async;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

public abstract class b extends AsyncTask {
    public interface a {
        void a(b arg1);
    }

    public interface com.iab.omid.library.bytedance2.walking.async.b.b {
        JSONObject a();

        void a(JSONObject arg1);
    }

    private a a;
    protected final com.iab.omid.library.bytedance2.walking.async.b.b b;

    public b(com.iab.omid.library.bytedance2.walking.async.b.b b$b0) {
        this.b = b$b0;
    }

    public void a(a b$a0) {
        this.a = b$a0;
    }

    protected void a(String s) {
        a b$a0 = this.a;
        if(b$a0 != null) {
            b$a0.a(this);
        }
    }

    public void a(ThreadPoolExecutor threadPoolExecutor0) {
        this.executeOnExecutor(threadPoolExecutor0, new Object[0]);
    }

    @Override  // android.os.AsyncTask
    protected void onPostExecute(Object object0) {
        this.a(((String)object0));
    }
}

