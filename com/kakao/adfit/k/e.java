package com.kakao.adfit.k;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Reader;
import java.io.Writer;
import kotlin.jvm.internal.L;
import kotlin.text.v;
import org.json.JSONException;
import org.json.JSONObject;

public final class e implements d {
    @Override  // com.kakao.adfit.k.d
    public com.kakao.adfit.common.matrix.e a(Reader reader0) {
        JSONObject jSONObject0;
        L.p(reader0, "reader");
        String s = (reader0 instanceof BufferedReader ? ((BufferedReader)reader0) : new BufferedReader(reader0, 0x2000)).readLine();
        if(s != null && !v.x3(s)) {
            try {
                L.o(s, "line");
                jSONObject0 = new JSONObject(s);
            }
            catch(JSONException unused_ex) {
                return null;
            }
            return com.kakao.adfit.common.matrix.e.t.a(jSONObject0);
        }
        return null;
    }

    @Override  // com.kakao.adfit.k.d
    public void a(com.kakao.adfit.common.matrix.e e0, Writer writer0) {
        L.p(e0, "event");
        L.p(writer0, "writer");
        String s = e0.p().toString();
        L.o(s, "event.toJsonObject().toString()");
        BufferedWriter bufferedWriter0 = writer0 instanceof BufferedWriter ? ((BufferedWriter)writer0) : new BufferedWriter(writer0, 0x2000);
        bufferedWriter0.write(s);
        bufferedWriter0.flush();
    }
}

