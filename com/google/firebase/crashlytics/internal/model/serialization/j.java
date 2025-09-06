package com.google.firebase.crashlytics.internal.model.serialization;

import android.util.Base64;
import android.util.JsonReader;
import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.F.e.b;
import com.google.firebase.crashlytics.internal.model.F.f.d.a.c;
import com.google.firebase.crashlytics.internal.model.F.f.d.d;
import com.google.firebase.crashlytics.internal.model.F.f.d.f;
import com.google.firebase.crashlytics.internal.model.F;
import com.google.firebase.encoders.json.e;
import j..util.DesugarCollections;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class j {
    interface a {
        Object a(@NonNull JsonReader arg1) throws IOException;
    }

    private static final com.google.firebase.encoders.a a;

    static {
        j.a = new e().k(com.google.firebase.crashlytics.internal.model.a.b).l(true).j();
    }

    @NonNull
    private static d A(@NonNull JsonReader jsonReader0) throws IOException {
        com.google.firebase.crashlytics.internal.model.F.f.d.d.a f$f$d$d$a0 = d.a();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            if(jsonReader0.nextName().equals("content")) {
                f$f$d$d$a0.b(jsonReader0.nextString());
            }
            else {
                jsonReader0.skipValue();
            }
        }
        jsonReader0.endObject();
        return f$f$d$d$a0.a();
    }

    // 检测为 Lambda 实现
    @NonNull
    private static com.google.firebase.crashlytics.internal.model.F.f.d.e B(@NonNull JsonReader jsonReader0) throws IOException [...]

    @NonNull
    private static f C(@NonNull JsonReader jsonReader0) throws IOException {
        com.google.firebase.crashlytics.internal.model.F.f.d.f.a f$f$d$f$a0 = f.a();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            s.hashCode();
            if(s.equals("assignments")) {
                f$f$d$f$a0.b(j.p(jsonReader0, (JsonReader jsonReader0) -> {
                    com.google.firebase.crashlytics.internal.model.F.f.d.e.a f$f$d$e$a0 = com.google.firebase.crashlytics.internal.model.F.f.d.e.a();
                    jsonReader0.beginObject();
                    while(jsonReader0.hasNext()) {
                        String s = jsonReader0.nextName();
                        s.hashCode();
                        switch(s) {
                            case "parameterKey": {
                                f$f$d$e$a0.b(jsonReader0.nextString());
                                break;
                            }
                            case "parameterValue": {
                                f$f$d$e$a0.c(jsonReader0.nextString());
                                break;
                            }
                            case "rolloutVariant": {
                                f$f$d$e$a0.d(j.K(jsonReader0));
                                break;
                            }
                            case "templateVersion": {
                                f$f$d$e$a0.e(jsonReader0.nextLong());
                                break;
                            }
                            default: {
                                jsonReader0.skipValue();
                            }
                        }
                    }
                    jsonReader0.endObject();
                    return f$f$d$e$a0.a();
                }));
            }
            else {
                jsonReader0.skipValue();
            }
        }
        jsonReader0.endObject();
        return f$f$d$f$a0.a();
    }

    @NonNull
    private static com.google.firebase.crashlytics.internal.model.F.f.d.a.b.d D(@NonNull JsonReader jsonReader0) throws IOException {
        com.google.firebase.crashlytics.internal.model.F.f.d.a.b.d.a f$f$d$a$b$d$a0 = com.google.firebase.crashlytics.internal.model.F.f.d.a.b.d.a();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            s.hashCode();
            switch(s) {
                case "address": {
                    f$f$d$a$b$d$a0.b(jsonReader0.nextLong());
                    break;
                }
                case "code": {
                    f$f$d$a$b$d$a0.c(jsonReader0.nextString());
                    break;
                }
                case "name": {
                    f$f$d$a$b$d$a0.d(jsonReader0.nextString());
                    break;
                }
                default: {
                    jsonReader0.skipValue();
                }
            }
        }
        jsonReader0.endObject();
        return f$f$d$a$b$d$a0.a();
    }

    // 检测为 Lambda 实现
    @NonNull
    private static com.google.firebase.crashlytics.internal.model.F.f.d.a.b.e E(@NonNull JsonReader jsonReader0) throws IOException [...]

    // 检测为 Lambda 实现
    @NonNull
    private static b F(@NonNull JsonReader jsonReader0) throws IOException [...]

    @NonNull
    private static com.google.firebase.crashlytics.internal.model.F.e G(@NonNull JsonReader jsonReader0) throws IOException {
        com.google.firebase.crashlytics.internal.model.F.e.a f$e$a0 = com.google.firebase.crashlytics.internal.model.F.e.a();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            s.hashCode();
            if(s.equals("files")) {
                f$e$a0.b(j.p(jsonReader0, (JsonReader jsonReader0) -> {
                    com.google.firebase.crashlytics.internal.model.F.e.b.a f$e$b$a0 = b.a();
                    jsonReader0.beginObject();
                    while(jsonReader0.hasNext()) {
                        String s = jsonReader0.nextName();
                        s.hashCode();
                        if(s.equals("filename")) {
                            f$e$b$a0.c(jsonReader0.nextString());
                        }
                        else if(s.equals("contents")) {
                            f$e$b$a0.b(Base64.decode(jsonReader0.nextString(), 2));
                        }
                        else {
                            jsonReader0.skipValue();
                        }
                    }
                    jsonReader0.endObject();
                    return f$e$b$a0.a();
                }));
            }
            else if(s.equals("orgId")) {
                f$e$a0.c(jsonReader0.nextString());
            }
            else {
                jsonReader0.skipValue();
            }
        }
        jsonReader0.endObject();
        return f$e$a0.a();
    }

    @NonNull
    private static com.google.firebase.crashlytics.internal.model.F.f.e H(@NonNull JsonReader jsonReader0) throws IOException {
        com.google.firebase.crashlytics.internal.model.F.f.e.a f$f$e$a0 = com.google.firebase.crashlytics.internal.model.F.f.e.a();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            s.hashCode();
            switch(s) {
                case "buildVersion": {
                    f$f$e$a0.b(jsonReader0.nextString());
                    break;
                }
                case "jailbroken": {
                    f$f$e$a0.c(jsonReader0.nextBoolean());
                    break;
                }
                case "platform": {
                    f$f$e$a0.d(jsonReader0.nextInt());
                    break;
                }
                case "version": {
                    f$f$e$a0.e(jsonReader0.nextString());
                    break;
                }
                default: {
                    jsonReader0.skipValue();
                }
            }
        }
        jsonReader0.endObject();
        return f$f$e$a0.a();
    }

    // 检测为 Lambda 实现
    @NonNull
    private static c I(@NonNull JsonReader jsonReader0) throws IOException [...]

    @NonNull
    private static F J(@NonNull JsonReader jsonReader0) throws IOException {
        com.google.firebase.crashlytics.internal.model.F.c f$c0 = F.b();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            s.hashCode();
            switch(s) {
                case "appExitInfo": {
                    f$c0.b(j.o(jsonReader0));
                    break;
                }
                case "appQualitySessionId": {
                    f$c0.c(jsonReader0.nextString());
                    break;
                }
                case "buildVersion": {
                    f$c0.d(jsonReader0.nextString());
                    break;
                }
                case "displayVersion": {
                    f$c0.e(jsonReader0.nextString());
                    break;
                }
                case "firebaseAuthenticationToken": {
                    f$c0.f(jsonReader0.nextString());
                    break;
                }
                case "firebaseInstallationId": {
                    f$c0.g(jsonReader0.nextString());
                    break;
                }
                case "gmpAppId": {
                    f$c0.h(jsonReader0.nextString());
                    break;
                }
                case "installationUuid": {
                    f$c0.i(jsonReader0.nextString());
                    break;
                }
                case "ndkPayload": {
                    f$c0.j(j.G(jsonReader0));
                    break;
                }
                case "platform": {
                    f$c0.k(jsonReader0.nextInt());
                    break;
                }
                case "sdkVersion": {
                    f$c0.l(jsonReader0.nextString());
                    break;
                }
                case "session": {
                    f$c0.m(j.L(jsonReader0));
                    break;
                }
                default: {
                    jsonReader0.skipValue();
                }
            }
        }
        jsonReader0.endObject();
        return f$c0.a();
    }

    @NonNull
    private static com.google.firebase.crashlytics.internal.model.F.f.d.e.b K(@NonNull JsonReader jsonReader0) throws IOException {
        com.google.firebase.crashlytics.internal.model.F.f.d.e.b.a f$f$d$e$b$a0 = com.google.firebase.crashlytics.internal.model.F.f.d.e.b.a();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            s.hashCode();
            if(s.equals("variantId")) {
                f$f$d$e$b$a0.c(jsonReader0.nextString());
            }
            else if(s.equals("rolloutId")) {
                f$f$d$e$b$a0.b(jsonReader0.nextString());
            }
            else {
                jsonReader0.skipValue();
            }
        }
        jsonReader0.endObject();
        return f$f$d$e$b$a0.a();
    }

    @NonNull
    private static com.google.firebase.crashlytics.internal.model.F.f L(@NonNull JsonReader jsonReader0) throws IOException {
        com.google.firebase.crashlytics.internal.model.F.f.b f$f$b0 = com.google.firebase.crashlytics.internal.model.F.f.a();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            s.hashCode();
            switch(s) {
                case "app": {
                    f$f$b0.b(j.n(jsonReader0));
                    break;
                }
                case "appQualitySessionId": {
                    f$f$b0.c(jsonReader0.nextString());
                    break;
                }
                case "crashed": {
                    f$f$b0.d(jsonReader0.nextBoolean());
                    break;
                }
                case "device": {
                    f$f$b0.e(j.s(jsonReader0));
                    break;
                }
                case "endedAt": {
                    f$f$b0.f(jsonReader0.nextLong());
                    break;
                }
                case "events": {
                    f$f$b0.g(j.p(jsonReader0, (JsonReader jsonReader0) -> {
                        com.google.firebase.crashlytics.internal.model.F.f.d.b f$f$d$b0 = com.google.firebase.crashlytics.internal.model.F.f.d.a();
                        jsonReader0.beginObject();
                        while(jsonReader0.hasNext()) {
                            String s = jsonReader0.nextName();
                            s.hashCode();
                            switch(s) {
                                case "app": {
                                    f$f$d$b0.b(j.u(jsonReader0));
                                    break;
                                }
                                case "device": {
                                    f$f$d$b0.c(j.w(jsonReader0));
                                    break;
                                }
                                case "log": {
                                    f$f$d$b0.d(j.A(jsonReader0));
                                    break;
                                }
                                case "rollouts": {
                                    f$f$d$b0.e(j.C(jsonReader0));
                                    break;
                                }
                                case "timestamp": {
                                    f$f$d$b0.f(jsonReader0.nextLong());
                                    break;
                                }
                                case "type": {
                                    f$f$d$b0.g(jsonReader0.nextString());
                                    break;
                                }
                                default: {
                                    jsonReader0.skipValue();
                                }
                            }
                        }
                        jsonReader0.endObject();
                        return f$f$d$b0.a();
                    }));
                    break;
                }
                case "generator": {
                    f$f$b0.h(jsonReader0.nextString());
                    break;
                }
                case "generatorType": {
                    f$f$b0.i(jsonReader0.nextInt());
                    break;
                }
                case "identifier": {
                    f$f$b0.k(Base64.decode(jsonReader0.nextString(), 2));
                    break;
                }
                case "os": {
                    f$f$b0.l(j.H(jsonReader0));
                    break;
                }
                case "startedAt": {
                    f$f$b0.m(jsonReader0.nextLong());
                    break;
                }
                case "user": {
                    f$f$b0.n(j.M(jsonReader0));
                    break;
                }
                default: {
                    jsonReader0.skipValue();
                }
            }
        }
        jsonReader0.endObject();
        return f$f$b0.a();
    }

    @NonNull
    private static com.google.firebase.crashlytics.internal.model.F.f.f M(@NonNull JsonReader jsonReader0) throws IOException {
        com.google.firebase.crashlytics.internal.model.F.f.f.a f$f$f$a0 = com.google.firebase.crashlytics.internal.model.F.f.f.a();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            if(jsonReader0.nextName().equals("identifier")) {
                f$f$f$a0.b(jsonReader0.nextString());
            }
            else {
                jsonReader0.skipValue();
            }
        }
        jsonReader0.endObject();
        return f$f$f$a0.a();
    }

    @NonNull
    public F N(@NonNull String s) throws IOException {
        try(JsonReader jsonReader0 = new JsonReader(new StringReader(s))) {
            return j.J(jsonReader0);
        }
        catch(IllegalStateException illegalStateException0) {
            throw new IOException(illegalStateException0);
        }
    }

    @NonNull
    public String O(@NonNull F f0) {
        return j.a.b(f0);
    }

    @NonNull
    public com.google.firebase.crashlytics.internal.model.F.a j(@NonNull String s) throws IOException {
        try(JsonReader jsonReader0 = new JsonReader(new StringReader(s))) {
            return j.o(jsonReader0);
        }
        catch(IllegalStateException illegalStateException0) {
            throw new IOException(illegalStateException0);
        }
    }

    @NonNull
    public String k(@NonNull com.google.firebase.crashlytics.internal.model.F.a f$a0) {
        return j.a.b(f$a0);
    }

    @NonNull
    public com.google.firebase.crashlytics.internal.model.F.f.d l(@NonNull String s) throws IOException {
        try(JsonReader jsonReader0 = new JsonReader(new StringReader(s))) {
            return j.t(jsonReader0);
        }
        catch(IllegalStateException illegalStateException0) {
            throw new IOException(illegalStateException0);
        }
    }

    @NonNull
    public String m(@NonNull com.google.firebase.crashlytics.internal.model.F.f.d f$f$d0) {
        return j.a.b(f$f$d0);
    }

    @NonNull
    private static com.google.firebase.crashlytics.internal.model.F.f.a n(@NonNull JsonReader jsonReader0) throws IOException {
        com.google.firebase.crashlytics.internal.model.F.f.a.a f$f$a$a0 = com.google.firebase.crashlytics.internal.model.F.f.a.a();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            s.hashCode();
            switch(s) {
                case "developmentPlatform": {
                    f$f$a$a0.b(jsonReader0.nextString());
                    break;
                }
                case "developmentPlatformVersion": {
                    f$f$a$a0.c(jsonReader0.nextString());
                    break;
                }
                case "displayVersion": {
                    f$f$a$a0.d(jsonReader0.nextString());
                    break;
                }
                case "identifier": {
                    f$f$a$a0.e(jsonReader0.nextString());
                    break;
                }
                case "installationUuid": {
                    f$f$a$a0.f(jsonReader0.nextString());
                    break;
                }
                case "version": {
                    f$f$a$a0.h(jsonReader0.nextString());
                    break;
                }
                default: {
                    jsonReader0.skipValue();
                }
            }
        }
        jsonReader0.endObject();
        return f$f$a$a0.a();
    }

    @NonNull
    private static com.google.firebase.crashlytics.internal.model.F.a o(@NonNull JsonReader jsonReader0) throws IOException {
        com.google.firebase.crashlytics.internal.model.F.a.b f$a$b0 = com.google.firebase.crashlytics.internal.model.F.a.a();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            s.hashCode();
            switch(s) {
                case "buildIdMappingForArch": {
                    f$a$b0.b(j.p(jsonReader0, (JsonReader jsonReader0) -> {
                        com.google.firebase.crashlytics.internal.model.F.a.a.a f$a$a$a0 = com.google.firebase.crashlytics.internal.model.F.a.a.a();
                        jsonReader0.beginObject();
                        while(jsonReader0.hasNext()) {
                            String s = jsonReader0.nextName();
                            s.hashCode();
                            switch(s) {
                                case "arch": {
                                    f$a$a$a0.b(jsonReader0.nextString());
                                    break;
                                }
                                case "buildId": {
                                    f$a$a$a0.c(jsonReader0.nextString());
                                    break;
                                }
                                case "libraryName": {
                                    f$a$a$a0.d(jsonReader0.nextString());
                                    break;
                                }
                                default: {
                                    jsonReader0.skipValue();
                                }
                            }
                        }
                        jsonReader0.endObject();
                        return f$a$a$a0.a();
                    }));
                    break;
                }
                case "importance": {
                    f$a$b0.c(jsonReader0.nextInt());
                    break;
                }
                case "pid": {
                    f$a$b0.d(jsonReader0.nextInt());
                    break;
                }
                case "processName": {
                    f$a$b0.e(jsonReader0.nextString());
                    break;
                }
                case "pss": {
                    f$a$b0.f(jsonReader0.nextLong());
                    break;
                }
                case "reasonCode": {
                    f$a$b0.g(jsonReader0.nextInt());
                    break;
                }
                case "rss": {
                    f$a$b0.h(jsonReader0.nextLong());
                    break;
                }
                case "timestamp": {
                    f$a$b0.i(jsonReader0.nextLong());
                    break;
                }
                case "traceFile": {
                    f$a$b0.j(jsonReader0.nextString());
                    break;
                }
                default: {
                    jsonReader0.skipValue();
                }
            }
        }
        jsonReader0.endObject();
        return f$a$b0.a();
    }

    @NonNull
    private static List p(@NonNull JsonReader jsonReader0, @NonNull a j$a0) throws IOException {
        ArrayList arrayList0 = new ArrayList();
        jsonReader0.beginArray();
        while(jsonReader0.hasNext()) {
            arrayList0.add(j$a0.a(jsonReader0));
        }
        jsonReader0.endArray();
        return DesugarCollections.unmodifiableList(arrayList0);
    }

    // 检测为 Lambda 实现
    @NonNull
    private static com.google.firebase.crashlytics.internal.model.F.a.a q(@NonNull JsonReader jsonReader0) throws IOException [...]

    // 检测为 Lambda 实现
    @NonNull
    private static com.google.firebase.crashlytics.internal.model.F.d r(@NonNull JsonReader jsonReader0) throws IOException [...]

    @NonNull
    private static com.google.firebase.crashlytics.internal.model.F.f.c s(@NonNull JsonReader jsonReader0) throws IOException {
        com.google.firebase.crashlytics.internal.model.F.f.c.a f$f$c$a0 = com.google.firebase.crashlytics.internal.model.F.f.c.a();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            s.hashCode();
            switch(s) {
                case "arch": {
                    f$f$c$a0.b(jsonReader0.nextInt());
                    break;
                }
                case "cores": {
                    f$f$c$a0.c(jsonReader0.nextInt());
                    break;
                }
                case "diskSpace": {
                    f$f$c$a0.d(jsonReader0.nextLong());
                    break;
                }
                case "manufacturer": {
                    f$f$c$a0.e(jsonReader0.nextString());
                    break;
                }
                case "model": {
                    f$f$c$a0.f(jsonReader0.nextString());
                    break;
                }
                case "modelClass": {
                    f$f$c$a0.g(jsonReader0.nextString());
                    break;
                }
                case "ram": {
                    f$f$c$a0.h(jsonReader0.nextLong());
                    break;
                }
                case "simulator": {
                    f$f$c$a0.i(jsonReader0.nextBoolean());
                    break;
                }
                case "state": {
                    f$f$c$a0.j(jsonReader0.nextInt());
                    break;
                }
                default: {
                    jsonReader0.skipValue();
                }
            }
        }
        jsonReader0.endObject();
        return f$f$c$a0.a();
    }

    // 检测为 Lambda 实现
    @NonNull
    private static com.google.firebase.crashlytics.internal.model.F.f.d t(@NonNull JsonReader jsonReader0) throws IOException [...]

    @NonNull
    private static com.google.firebase.crashlytics.internal.model.F.f.d.a u(@NonNull JsonReader jsonReader0) throws IOException {
        com.google.firebase.crashlytics.internal.model.F.f.d.a.a f$f$d$a$a0 = com.google.firebase.crashlytics.internal.model.F.f.d.a.a();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            s.hashCode();
            switch(s) {
                case "appProcessDetails": {
                    f$f$d$a$a0.b(j.p(jsonReader0, (JsonReader jsonReader0) -> {
                        com.google.firebase.crashlytics.internal.model.F.f.d.a.c.a f$f$d$a$c$a0 = c.a();
                        jsonReader0.beginObject();
                        while(jsonReader0.hasNext()) {
                            String s = jsonReader0.nextName();
                            s.hashCode();
                            switch(s) {
                                case "defaultProcess": {
                                    f$f$d$a$c$a0.b(jsonReader0.nextBoolean());
                                    break;
                                }
                                case "importance": {
                                    f$f$d$a$c$a0.c(jsonReader0.nextInt());
                                    break;
                                }
                                case "pid": {
                                    f$f$d$a$c$a0.d(jsonReader0.nextInt());
                                    break;
                                }
                                case "processName": {
                                    f$f$d$a$c$a0.e(jsonReader0.nextString());
                                    break;
                                }
                                default: {
                                    jsonReader0.skipValue();
                                }
                            }
                        }
                        jsonReader0.endObject();
                        return f$f$d$a$c$a0.a();
                    }));
                    break;
                }
                case "background": {
                    f$f$d$a$a0.c(Boolean.valueOf(jsonReader0.nextBoolean()));
                    break;
                }
                case "currentProcessDetails": {
                    f$f$d$a$a0.d(j.I(jsonReader0));
                    break;
                }
                case "customAttributes": {
                    f$f$d$a$a0.e(j.p(jsonReader0, (JsonReader jsonReader0) -> {
                        com.google.firebase.crashlytics.internal.model.F.d.a f$d$a0 = com.google.firebase.crashlytics.internal.model.F.d.a();
                        jsonReader0.beginObject();
                        while(jsonReader0.hasNext()) {
                            String s = jsonReader0.nextName();
                            s.hashCode();
                            if(s.equals("key")) {
                                f$d$a0.b(jsonReader0.nextString());
                            }
                            else if(s.equals("value")) {
                                f$d$a0.c(jsonReader0.nextString());
                            }
                            else {
                                jsonReader0.skipValue();
                            }
                        }
                        jsonReader0.endObject();
                        return f$d$a0.a();
                    }));
                    break;
                }
                case "execution": {
                    f$f$d$a$a0.f(j.x(jsonReader0));
                    break;
                }
                case "internalKeys": {
                    f$f$d$a$a0.g(j.p(jsonReader0, (JsonReader jsonReader0) -> {
                        com.google.firebase.crashlytics.internal.model.F.d.a f$d$a0 = com.google.firebase.crashlytics.internal.model.F.d.a();
                        jsonReader0.beginObject();
                        while(jsonReader0.hasNext()) {
                            String s = jsonReader0.nextName();
                            s.hashCode();
                            if(s.equals("key")) {
                                f$d$a0.b(jsonReader0.nextString());
                            }
                            else if(s.equals("value")) {
                                f$d$a0.c(jsonReader0.nextString());
                            }
                            else {
                                jsonReader0.skipValue();
                            }
                        }
                        jsonReader0.endObject();
                        return f$d$a0.a();
                    }));
                    break;
                }
                case "uiOrientation": {
                    f$f$d$a$a0.h(jsonReader0.nextInt());
                    break;
                }
                default: {
                    jsonReader0.skipValue();
                }
            }
        }
        jsonReader0.endObject();
        return f$f$d$a$a0.a();
    }

    // 检测为 Lambda 实现
    @NonNull
    private static com.google.firebase.crashlytics.internal.model.F.f.d.a.b.a v(@NonNull JsonReader jsonReader0) throws IOException [...]

    @NonNull
    private static com.google.firebase.crashlytics.internal.model.F.f.d.c w(@NonNull JsonReader jsonReader0) throws IOException {
        com.google.firebase.crashlytics.internal.model.F.f.d.c.a f$f$d$c$a0 = com.google.firebase.crashlytics.internal.model.F.f.d.c.a();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            s.hashCode();
            switch(s) {
                case "batteryLevel": {
                    f$f$d$c$a0.b(jsonReader0.nextDouble());
                    break;
                }
                case "batteryVelocity": {
                    f$f$d$c$a0.c(jsonReader0.nextInt());
                    break;
                }
                case "diskUsed": {
                    f$f$d$c$a0.d(jsonReader0.nextLong());
                    break;
                }
                case "orientation": {
                    f$f$d$c$a0.e(jsonReader0.nextInt());
                    break;
                }
                case "proximityOn": {
                    f$f$d$c$a0.f(jsonReader0.nextBoolean());
                    break;
                }
                case "ramUsed": {
                    f$f$d$c$a0.g(jsonReader0.nextLong());
                    break;
                }
                default: {
                    jsonReader0.skipValue();
                }
            }
        }
        jsonReader0.endObject();
        return f$f$d$c$a0.a();
    }

    @NonNull
    private static com.google.firebase.crashlytics.internal.model.F.f.d.a.b x(@NonNull JsonReader jsonReader0) throws IOException {
        com.google.firebase.crashlytics.internal.model.F.f.d.a.b.b f$f$d$a$b$b0 = com.google.firebase.crashlytics.internal.model.F.f.d.a.b.a();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            s.hashCode();
            switch(s) {
                case "appExitInfo": {
                    f$f$d$a$b$b0.b(j.o(jsonReader0));
                    break;
                }
                case "binaries": {
                    f$f$d$a$b$b0.c(j.p(jsonReader0, (JsonReader jsonReader0) -> {
                        com.google.firebase.crashlytics.internal.model.F.f.d.a.b.a.a f$f$d$a$b$a$a0 = com.google.firebase.crashlytics.internal.model.F.f.d.a.b.a.a();
                        jsonReader0.beginObject();
                        while(jsonReader0.hasNext()) {
                            String s = jsonReader0.nextName();
                            s.hashCode();
                            switch(s) {
                                case "baseAddress": {
                                    f$f$d$a$b$a$a0.b(jsonReader0.nextLong());
                                    break;
                                }
                                case "name": {
                                    f$f$d$a$b$a$a0.c(jsonReader0.nextString());
                                    break;
                                }
                                case "size": {
                                    f$f$d$a$b$a$a0.d(jsonReader0.nextLong());
                                    break;
                                }
                                case "uuid": {
                                    f$f$d$a$b$a$a0.f(Base64.decode(jsonReader0.nextString(), 2));
                                    break;
                                }
                                default: {
                                    jsonReader0.skipValue();
                                }
                            }
                        }
                        jsonReader0.endObject();
                        return f$f$d$a$b$a$a0.a();
                    }));
                    break;
                }
                case "exception": {
                    f$f$d$a$b$b0.d(j.y(jsonReader0));
                    break;
                }
                case "signal": {
                    f$f$d$a$b$b0.e(j.D(jsonReader0));
                    break;
                }
                case "threads": {
                    f$f$d$a$b$b0.f(j.p(jsonReader0, (JsonReader jsonReader0) -> {
                        com.google.firebase.crashlytics.internal.model.F.f.d.a.b.e.a f$f$d$a$b$e$a0 = com.google.firebase.crashlytics.internal.model.F.f.d.a.b.e.a();
                        jsonReader0.beginObject();
                        while(jsonReader0.hasNext()) {
                            String s = jsonReader0.nextName();
                            s.hashCode();
                            switch(s) {
                                case "frames": {
                                    f$f$d$a$b$e$a0.b(j.p(jsonReader0, (JsonReader jsonReader0) -> {
                                        com.google.firebase.crashlytics.internal.model.F.f.d.a.b.e.b.a f$f$d$a$b$e$b$a0 = com.google.firebase.crashlytics.internal.model.F.f.d.a.b.e.b.a();
                                        jsonReader0.beginObject();
                                        while(jsonReader0.hasNext()) {
                                            String s = jsonReader0.nextName();
                                            s.hashCode();
                                            switch(s) {
                                                case "file": {
                                                    f$f$d$a$b$e$b$a0.b(jsonReader0.nextString());
                                                    break;
                                                }
                                                case "importance": {
                                                    f$f$d$a$b$e$b$a0.c(jsonReader0.nextInt());
                                                    break;
                                                }
                                                case "offset": {
                                                    f$f$d$a$b$e$b$a0.d(jsonReader0.nextLong());
                                                    break;
                                                }
                                                case "pc": {
                                                    f$f$d$a$b$e$b$a0.e(jsonReader0.nextLong());
                                                    break;
                                                }
                                                case "symbol": {
                                                    f$f$d$a$b$e$b$a0.f(jsonReader0.nextString());
                                                    break;
                                                }
                                                default: {
                                                    jsonReader0.skipValue();
                                                }
                                            }
                                        }
                                        jsonReader0.endObject();
                                        return f$f$d$a$b$e$b$a0.a();
                                    }));
                                    break;
                                }
                                case "importance": {
                                    f$f$d$a$b$e$a0.c(jsonReader0.nextInt());
                                    break;
                                }
                                case "name": {
                                    f$f$d$a$b$e$a0.d(jsonReader0.nextString());
                                    break;
                                }
                                default: {
                                    jsonReader0.skipValue();
                                }
                            }
                        }
                        jsonReader0.endObject();
                        return f$f$d$a$b$e$a0.a();
                    }));
                    break;
                }
                default: {
                    jsonReader0.skipValue();
                }
            }
        }
        jsonReader0.endObject();
        return f$f$d$a$b$b0.a();
    }

    @NonNull
    private static com.google.firebase.crashlytics.internal.model.F.f.d.a.b.c y(@NonNull JsonReader jsonReader0) throws IOException {
        com.google.firebase.crashlytics.internal.model.F.f.d.a.b.c.a f$f$d$a$b$c$a0 = com.google.firebase.crashlytics.internal.model.F.f.d.a.b.c.a();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            s.hashCode();
            switch(s) {
                case "causedBy": {
                    f$f$d$a$b$c$a0.b(j.y(jsonReader0));
                    break;
                }
                case "frames": {
                    f$f$d$a$b$c$a0.c(j.p(jsonReader0, (JsonReader jsonReader0) -> {
                        com.google.firebase.crashlytics.internal.model.F.f.d.a.b.e.b.a f$f$d$a$b$e$b$a0 = com.google.firebase.crashlytics.internal.model.F.f.d.a.b.e.b.a();
                        jsonReader0.beginObject();
                        while(jsonReader0.hasNext()) {
                            String s = jsonReader0.nextName();
                            s.hashCode();
                            switch(s) {
                                case "file": {
                                    f$f$d$a$b$e$b$a0.b(jsonReader0.nextString());
                                    break;
                                }
                                case "importance": {
                                    f$f$d$a$b$e$b$a0.c(jsonReader0.nextInt());
                                    break;
                                }
                                case "offset": {
                                    f$f$d$a$b$e$b$a0.d(jsonReader0.nextLong());
                                    break;
                                }
                                case "pc": {
                                    f$f$d$a$b$e$b$a0.e(jsonReader0.nextLong());
                                    break;
                                }
                                case "symbol": {
                                    f$f$d$a$b$e$b$a0.f(jsonReader0.nextString());
                                    break;
                                }
                                default: {
                                    jsonReader0.skipValue();
                                }
                            }
                        }
                        jsonReader0.endObject();
                        return f$f$d$a$b$e$b$a0.a();
                    }));
                    break;
                }
                case "overflowCount": {
                    f$f$d$a$b$c$a0.d(jsonReader0.nextInt());
                    break;
                }
                case "reason": {
                    f$f$d$a$b$c$a0.e(jsonReader0.nextString());
                    break;
                }
                case "type": {
                    f$f$d$a$b$c$a0.f(jsonReader0.nextString());
                    break;
                }
                default: {
                    jsonReader0.skipValue();
                }
            }
        }
        jsonReader0.endObject();
        return f$f$d$a$b$c$a0.a();
    }

    // 检测为 Lambda 实现
    @NonNull
    private static com.google.firebase.crashlytics.internal.model.F.f.d.a.b.e.b z(@NonNull JsonReader jsonReader0) throws IOException [...]
}

