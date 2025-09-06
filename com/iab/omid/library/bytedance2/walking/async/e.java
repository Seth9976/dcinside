package com.iab.omid.library.bytedance2.walking.async;

import com.iab.omid.library.bytedance2.internal.c;
import java.util.HashSet;
import org.json.JSONObject;

public class e extends a {
    public e(b b$b0, HashSet hashSet0, JSONObject jSONObject0, long v) {
        super(b$b0, hashSet0, jSONObject0, v);
    }

    protected String a(Object[] arr_object) {
        return this.d.toString();
    }

    @Override  // com.iab.omid.library.bytedance2.walking.async.b
    protected void a(String s) {
        this.b(s);
        super.a(s);
    }

    private void b(String s) {
        c c0 = c.c();
        if(c0 != null) {
            for(Object object0: c0.b()) {
                com.iab.omid.library.bytedance2.adsession.a a0 = (com.iab.omid.library.bytedance2.adsession.a)object0;
                if(this.c.contains(a0.getAdSessionId())) {
                    a0.getAdSessionStatePublisher().a(s, this.e);
                }
            }
        }
    }

    @Override  // android.os.AsyncTask
    protected Object doInBackground(Object[] arr_object) {
        return this.a(arr_object);
    }

    @Override  // com.iab.omid.library.bytedance2.walking.async.b
    protected void onPostExecute(Object object0) {
        this.a(((String)object0));
    }
}

