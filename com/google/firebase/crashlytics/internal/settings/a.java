package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.common.i;
import com.google.firebase.crashlytics.internal.persistence.g;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;

public class a {
    private final File a;
    private static final String b = "com.crashlytics.settings.json";

    public a(g g0) {
        this.a = g0.h("com.crashlytics.settings.json");
    }

    private File a() {
        return this.a;
    }

    public JSONObject b() {
        JSONObject jSONObject1;
        FileInputStream fileInputStream0;
        com.google.firebase.crashlytics.internal.g.f().b("Checking for cached settings...");
        JSONObject jSONObject0 = null;
        try {
            File file0 = this.a();
            if(file0.exists()) {
                fileInputStream0 = new FileInputStream(file0);
                jSONObject1 = new JSONObject(i.D(fileInputStream0));
                jSONObject0 = fileInputStream0;
            }
            else {
                goto label_10;
            }
            goto label_26;
        }
        catch(Exception exception0) {
            goto label_14;
        }
        catch(Throwable throwable0) {
            fileInputStream0 = null;
            throwable1 = throwable0;
            i.f(fileInputStream0, "Error while closing settings cache file.");
            throw throwable1;
        }
        try {
            jSONObject1 = new JSONObject(i.D(fileInputStream0));
            jSONObject0 = fileInputStream0;
            goto label_26;
        }
        catch(Exception exception0) {
            goto label_15;
            try {
            label_10:
                com.google.firebase.crashlytics.internal.g.f().k("Settings file does not exist.");
                jSONObject1 = null;
                goto label_26;
            }
            catch(Exception exception0) {
            }
            catch(Throwable throwable0) {
                fileInputStream0 = null;
                throwable1 = throwable0;
                i.f(fileInputStream0, "Error while closing settings cache file.");
                throw throwable1;
            }
        label_14:
            fileInputStream0 = null;
            try {
            label_15:
                com.google.firebase.crashlytics.internal.g.f().e("Failed to fetch cached settings", exception0);
                goto label_19;
            }
            catch(Throwable throwable1) {
            }
            i.f(fileInputStream0, "Error while closing settings cache file.");
            throw throwable1;
        }
        catch(Throwable throwable1) {
            i.f(fileInputStream0, "Error while closing settings cache file.");
            throw throwable1;
        }
    label_19:
        i.f(fileInputStream0, "Error while closing settings cache file.");
        return null;
    label_26:
        i.f(((Closeable)jSONObject0), "Error while closing settings cache file.");
        return jSONObject1;
    }

    public void c(long v, JSONObject jSONObject0) {
        FileWriter fileWriter1;
        FileWriter fileWriter0;
        com.google.firebase.crashlytics.internal.g.f().k("Writing settings to cache file...");
        if(jSONObject0 != null) {
            try {
                fileWriter0 = null;
                jSONObject0.put("expires_at", v);
                fileWriter1 = new FileWriter(this.a());
                goto label_8;
            }
            catch(Exception exception0) {
                goto label_13;
                try {
                label_8:
                    fileWriter1.write(jSONObject0.toString());
                    fileWriter1.flush();
                    goto label_23;
                }
                catch(Exception exception0) {
                }
                catch(Throwable throwable0) {
                    fileWriter0 = fileWriter1;
                    i.f(fileWriter0, "Failed to close settings writer.");
                    throw throwable0;
                }
                fileWriter0 = fileWriter1;
                try {
                label_13:
                    com.google.firebase.crashlytics.internal.g.f().e("Failed to cache settings", exception0);
                    goto label_17;
                }
                catch(Throwable throwable0) {
                }
                i.f(fileWriter0, "Failed to close settings writer.");
                throw throwable0;
            }
            catch(Throwable throwable0) {
                i.f(fileWriter0, "Failed to close settings writer.");
                throw throwable0;
            }
        label_17:
            i.f(fileWriter0, "Failed to close settings writer.");
            return;
        label_23:
            i.f(fileWriter1, "Failed to close settings writer.");
        }
    }
}

