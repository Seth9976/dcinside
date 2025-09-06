package com.iab.omid.library.unity3d.walking.async;

import android.text.TextUtils;
import com.iab.omid.library.unity3d.adsession.p;
import com.iab.omid.library.unity3d.utils.c;
import java.util.HashSet;
import org.json.JSONObject;

public class f extends a {
    public f(b b$b0, HashSet hashSet0, JSONObject jSONObject0, long v) {
        super(b$b0, hashSet0, jSONObject0, v);
    }

    @Override  // com.iab.omid.library.unity3d.walking.async.b
    protected void b(String s) {
        if(!TextUtils.isEmpty(s)) {
            this.e(s);
        }
        super.b(s);
    }

    protected String d(Object[] arr_object) {
        JSONObject jSONObject0 = this.b.a();
        if(c.u(this.d, jSONObject0)) {
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
        com.iab.omid.library.unity3d.internal.c c0 = com.iab.omid.library.unity3d.internal.c.e();
        if(c0 != null) {
            for(Object object0: c0.c()) {
                p p0 = (p)object0;
                if(this.c.contains(p0.e())) {
                    p0.f().q(s, this.e);
                }
            }
        }
    }

    @Override  // com.iab.omid.library.unity3d.walking.async.b
    protected void onPostExecute(Object object0) {
        this.b(((String)object0));
    }
}

