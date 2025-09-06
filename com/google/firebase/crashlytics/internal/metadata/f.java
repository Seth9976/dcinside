package com.google.firebase.crashlytics.internal.metadata;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.persistence.g;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class f {
    private final g a;
    private static final Charset b = null;
    private static final String c = "userId";

    static {
        f.b = Charset.forName("UTF-8");
    }

    public f(g g0) {
        this.a = g0;
    }

    @NonNull
    public File a(String s) {
        return this.a.r(s, "internal-keys");
    }

    @NonNull
    public File b(String s) {
        return this.a.r(s, "keys");
    }

    @NonNull
    public File c(String s) {
        return this.a.r(s, "rollouts-state");
    }

    @NonNull
    public File d(String s) {
        return this.a.r(s, "user-data");
    }

    private static Map e(String s) throws JSONException {
        JSONObject jSONObject0 = new JSONObject(s);
        Map map0 = new HashMap();
        Iterator iterator0 = jSONObject0.keys();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            map0.put(((String)object0), f.p(jSONObject0, ((String)object0)));
        }
        return map0;
    }

    private static List f(String s) throws JSONException {
        JSONArray jSONArray0 = new JSONObject(s).getJSONArray("rolloutsState");
        List list0 = new ArrayList();
        for(int v = 0; v < jSONArray0.length(); ++v) {
            String s1 = jSONArray0.getString(v);
            try {
                list0.add(i.a(s1));
            }
            catch(Exception exception0) {
                com.google.firebase.crashlytics.internal.g.f().n("Failed de-serializing rollouts state. " + s1, exception0);
            }
        }
        return list0;
    }

    @Nullable
    private String g(String s) throws JSONException {
        return f.p(new JSONObject(s), "userId");
    }

    private static String h(Map map0) {
        return new JSONObject(map0).toString();
    }

    public Map i(String s) {
        return this.j(s, false);
    }

    Map j(String s, boolean z) {
        Map map0;
        Exception exception1;
        FileInputStream fileInputStream1;
        FileInputStream fileInputStream0;
        File file0 = z ? this.a(s) : this.b(s);
        if(file0.exists() && file0.length() != 0L) {
            try {
                fileInputStream0 = null;
                fileInputStream1 = null;
                fileInputStream1 = new FileInputStream(file0);
            }
            catch(Exception exception0) {
                exception1 = exception0;
                goto label_14;
            }
            catch(Throwable throwable0) {
                com.google.firebase.crashlytics.internal.common.i.f(fileInputStream0, "Failed to close user metadata file.");
                throw throwable0;
            }
            try {
                map0 = f.e(com.google.firebase.crashlytics.internal.common.i.D(fileInputStream1));
                goto label_22;
            }
            catch(Exception exception1) {
                try {
                label_14:
                    com.google.firebase.crashlytics.internal.g.f().n("Error deserializing user metadata.", exception1);
                    f.n(file0);
                }
                catch(Throwable throwable0) {
                    fileInputStream0 = fileInputStream1;
                    com.google.firebase.crashlytics.internal.common.i.f(fileInputStream0, "Failed to close user metadata file.");
                    throw throwable0;
                }
                com.google.firebase.crashlytics.internal.common.i.f(fileInputStream1, "Failed to close user metadata file.");
                return Collections.emptyMap();
            }
            catch(Throwable throwable0) {
                fileInputStream0 = fileInputStream1;
            }
            com.google.firebase.crashlytics.internal.common.i.f(fileInputStream0, "Failed to close user metadata file.");
            throw throwable0;
        label_22:
            com.google.firebase.crashlytics.internal.common.i.f(fileInputStream1, "Failed to close user metadata file.");
            return map0;
        }
        f.n(file0);
        return Collections.emptyMap();
    }

    public List k(String s) {
        List list0;
        FileInputStream fileInputStream0;
        File file0 = this.c(s);
        if(file0.exists() && file0.length() != 0L) {
            try {
                fileInputStream0 = null;
                fileInputStream0 = new FileInputStream(file0);
                list0 = f.f(com.google.firebase.crashlytics.internal.common.i.D(fileInputStream0));
                com.google.firebase.crashlytics.internal.g.f().b("Loaded rollouts state:\n" + list0 + "\nfor session " + s);
                return list0;
            }
            catch(Exception exception0) {
                com.google.firebase.crashlytics.internal.g.f().n("Error deserializing rollouts state.", exception0);
                f.n(file0);
                return Collections.emptyList();
            }
            finally {
                com.google.firebase.crashlytics.internal.common.i.f(fileInputStream0, "Failed to close rollouts state file.");
            }
        }
        f.n(file0);
        return Collections.emptyList();
    }

    @Nullable
    public String l(String s) {
        String s1;
        FileInputStream fileInputStream1;
        File file0 = this.d(s);
        FileInputStream fileInputStream0 = null;
        if(file0.exists() && file0.length() != 0L) {
            try {
                fileInputStream1 = null;
                fileInputStream1 = new FileInputStream(file0);
                goto label_8;
            }
            catch(Exception exception0) {
                goto label_12;
            }
            catch(Throwable throwable0) {
            }
            com.google.firebase.crashlytics.internal.common.i.f(fileInputStream0, "Failed to close user metadata file.");
            throw throwable0;
            try {
                try {
                label_8:
                    s1 = this.g(com.google.firebase.crashlytics.internal.common.i.D(fileInputStream1));
                    com.google.firebase.crashlytics.internal.g.f().b("Loaded userId " + s1 + " for session " + s);
                    goto label_20;
                }
                catch(Exception exception0) {
                }
            label_12:
                com.google.firebase.crashlytics.internal.g.f().n("Error deserializing user metadata.", exception0);
                f.n(file0);
            }
            catch(Throwable throwable0) {
                fileInputStream0 = fileInputStream1;
                com.google.firebase.crashlytics.internal.common.i.f(fileInputStream0, "Failed to close user metadata file.");
                throw throwable0;
            }
            com.google.firebase.crashlytics.internal.common.i.f(fileInputStream1, "Failed to close user metadata file.");
            return null;
        label_20:
            com.google.firebase.crashlytics.internal.common.i.f(fileInputStream1, "Failed to close user metadata file.");
            return s1;
        }
        com.google.firebase.crashlytics.internal.g.f().b("No userId set for session " + s);
        f.n(file0);
        return null;
    }

    private static String m(List list0) {
        HashMap hashMap0 = new HashMap();
        JSONArray jSONArray0 = new JSONArray();
        for(int v = 0; v < list0.size(); ++v) {
            Object object0 = list0.get(v);
            String s = i.b.b(object0);
            try {
                jSONArray0.put(new JSONObject(s));
            }
            catch(JSONException jSONException0) {
                com.google.firebase.crashlytics.internal.g.f().n("Exception parsing rollout assignment!", jSONException0);
            }
        }
        hashMap0.put("rolloutsState", jSONArray0);
        return new JSONObject(hashMap0).toString();
    }

    private static void n(File file0) {
        if(file0.exists() && file0.delete()) {
            com.google.firebase.crashlytics.internal.g.f().g("Deleted corrupt file: " + file0.getAbsolutePath());
        }
    }

    private static String o(String s) throws JSONException {
        class a extends JSONObject {
            final String a;

            a(String s) throws JSONException {
                this.put("userId", s);
            }
        }

        return new a(s).toString();
    }

    private static String p(JSONObject jSONObject0, String s) {
        return jSONObject0.isNull(s) ? null : jSONObject0.optString(s, null);
    }

    public void q(String s, Map map0) {
        this.r(s, map0, false);
    }

    public void r(String s, Map map0, boolean z) {
        BufferedWriter bufferedWriter1;
        String s1;
        BufferedWriter bufferedWriter0;
        File file0 = z ? this.a(s) : this.b(s);
        try {
            bufferedWriter0 = null;
            s1 = f.h(map0);
            bufferedWriter1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file0), f.b));
            goto label_7;
        }
        catch(Exception exception0) {
            goto label_12;
            try {
            label_7:
                bufferedWriter1.write(s1);
                bufferedWriter1.flush();
                goto label_23;
            }
            catch(Exception exception0) {
            }
            catch(Throwable throwable0) {
                bufferedWriter0 = bufferedWriter1;
                com.google.firebase.crashlytics.internal.common.i.f(bufferedWriter0, "Failed to close key/value metadata file.");
                throw throwable0;
            }
            bufferedWriter0 = bufferedWriter1;
            try {
            label_12:
                com.google.firebase.crashlytics.internal.g.f().n("Error serializing key/value metadata.", exception0);
                f.n(file0);
                goto label_17;
            }
            catch(Throwable throwable0) {
            }
            com.google.firebase.crashlytics.internal.common.i.f(bufferedWriter0, "Failed to close key/value metadata file.");
            throw throwable0;
        }
        catch(Throwable throwable0) {
            com.google.firebase.crashlytics.internal.common.i.f(bufferedWriter0, "Failed to close key/value metadata file.");
            throw throwable0;
        }
    label_17:
        com.google.firebase.crashlytics.internal.common.i.f(bufferedWriter0, "Failed to close key/value metadata file.");
        return;
    label_23:
        com.google.firebase.crashlytics.internal.common.i.f(bufferedWriter1, "Failed to close key/value metadata file.");
    }

    public void s(String s, List list0) {
        BufferedWriter bufferedWriter1;
        String s1;
        BufferedWriter bufferedWriter0;
        File file0 = this.c(s);
        if(list0.isEmpty()) {
            f.n(file0);
            return;
        }
        try {
            bufferedWriter0 = null;
            s1 = f.m(list0);
            bufferedWriter1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file0), f.b));
            goto label_10;
        }
        catch(Exception exception0) {
            goto label_15;
            try {
            label_10:
                bufferedWriter1.write(s1);
                bufferedWriter1.flush();
                goto label_26;
            }
            catch(Exception exception0) {
            }
            catch(Throwable throwable0) {
                bufferedWriter0 = bufferedWriter1;
                com.google.firebase.crashlytics.internal.common.i.f(bufferedWriter0, "Failed to close rollouts state file.");
                throw throwable0;
            }
            bufferedWriter0 = bufferedWriter1;
            try {
            label_15:
                com.google.firebase.crashlytics.internal.g.f().n("Error serializing rollouts state.", exception0);
                f.n(file0);
                goto label_20;
            }
            catch(Throwable throwable0) {
            }
            com.google.firebase.crashlytics.internal.common.i.f(bufferedWriter0, "Failed to close rollouts state file.");
            throw throwable0;
        }
        catch(Throwable throwable0) {
            com.google.firebase.crashlytics.internal.common.i.f(bufferedWriter0, "Failed to close rollouts state file.");
            throw throwable0;
        }
    label_20:
        com.google.firebase.crashlytics.internal.common.i.f(bufferedWriter0, "Failed to close rollouts state file.");
        return;
    label_26:
        com.google.firebase.crashlytics.internal.common.i.f(bufferedWriter1, "Failed to close rollouts state file.");
    }

    public void t(String s, String s1) {
        BufferedWriter bufferedWriter1;
        String s2;
        File file0 = this.d(s);
        BufferedWriter bufferedWriter0 = null;
        try {
            s2 = f.o(s1);
            bufferedWriter1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file0), f.b));
            goto label_7;
        }
        catch(Exception exception0) {
            goto label_12;
            try {
            label_7:
                bufferedWriter1.write(s2);
                bufferedWriter1.flush();
                goto label_22;
            }
            catch(Exception exception0) {
            }
            catch(Throwable throwable0) {
                bufferedWriter0 = bufferedWriter1;
                com.google.firebase.crashlytics.internal.common.i.f(bufferedWriter0, "Failed to close user metadata file.");
                throw throwable0;
            }
            bufferedWriter0 = bufferedWriter1;
            try {
            label_12:
                com.google.firebase.crashlytics.internal.g.f().n("Error serializing user metadata.", exception0);
                goto label_16;
            }
            catch(Throwable throwable0) {
            }
            com.google.firebase.crashlytics.internal.common.i.f(bufferedWriter0, "Failed to close user metadata file.");
            throw throwable0;
        }
        catch(Throwable throwable0) {
            com.google.firebase.crashlytics.internal.common.i.f(bufferedWriter0, "Failed to close user metadata file.");
            throw throwable0;
        }
    label_16:
        com.google.firebase.crashlytics.internal.common.i.f(bufferedWriter0, "Failed to close user metadata file.");
        return;
    label_22:
        com.google.firebase.crashlytics.internal.common.i.f(bufferedWriter1, "Failed to close user metadata file.");
    }
}

