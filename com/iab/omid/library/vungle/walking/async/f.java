package com.iab.omid.library.vungle.walking.async;

import android.text.TextUtils;
import com.iab.omid.library.vungle.adsession.q;
import com.iab.omid.library.vungle.utils.c;
import java.util.HashSet;
import org.json.JSONObject;

public class f extends a {
    public f(b b$b0, HashSet hashSet0, JSONObject jSONObject0, long v) {
        super(b$b0, hashSet0, jSONObject0, v);
    }

    @Override  // com.iab.omid.library.vungle.walking.async.b
    protected void b(String s) {
        if(!TextUtils.isEmpty(s)) {
            this.e(s);
        }
        super.b(s);
    }

    protected String d(Object[] arr_object) {
        JSONObject jSONObject0 = this.b.a();
        if(c.v(this.d, jSONObject0)) {
            return null;
        }
        this.b.a(this.d);
        return this.d.toString();
    }

    @Override  // android.os.AsyncTask
    protected Object doInBackground(Object[] arr_object) {
        return this.d(arr_object);
    }

    private void e(String s) {
        com.iab.omid.library.vungle.internal.c c0 = com.iab.omid.library.vungle.internal.c.e();
        if(c0 != null) {
            for(Object object0: c0.c()) {
                q q0 = (q)object0;
                if(this.c.contains(q0.e())) {
                    q0.f().q(s, this.e);
                }
            }
        }
    }

    @Override  // com.iab.omid.library.vungle.walking.async.b
    protected void onPostExecute(Object object0) {
        this.b(((String)object0));
    }
}

