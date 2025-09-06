package com.google.android.datatransport.cct.internal;

import android.util.JsonReader;
import android.util.JsonToken;
import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import java.io.IOException;
import java.io.Reader;

@AutoValue
public abstract class v {
    private static final String a = "LogResponseInternal";

    static v a(long v) {
        return new l(v);
    }

    @NonNull
    public static v b(@NonNull Reader reader0) throws IOException {
        try(JsonReader jsonReader0 = new JsonReader(reader0)) {
            jsonReader0.beginObject();
            while(true) {
                if(!jsonReader0.hasNext()) {
                    break;
                }
                if(jsonReader0.nextName().equals("nextRequestWaitMillis")) {
                    return jsonReader0.peek() == JsonToken.STRING ? v.a(Long.parseLong(jsonReader0.nextString())) : v.a(jsonReader0.nextLong());
                }
                jsonReader0.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        }
    }

    public abstract long c();
}

