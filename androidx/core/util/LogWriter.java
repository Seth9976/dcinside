package androidx.core.util;

import android.util.Log;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.io.Writer;

@RestrictTo({Scope.c})
@Deprecated
public class LogWriter extends Writer {
    private final String a;
    private StringBuilder b;

    public LogWriter(String s) {
        this.b = new StringBuilder(0x80);
        this.a = s;
    }

    private void a() {
        if(this.b.length() > 0) {
            Log.d(this.a, this.b.toString());
            this.b.delete(0, this.b.length());
        }
    }

    @Override
    public void close() {
        this.a();
    }

    @Override
    public void flush() {
        this.a();
    }

    @Override
    public void write(char[] arr_c, int v, int v1) {
        for(int v2 = 0; v2 < v1; ++v2) {
            int v3 = arr_c[v + v2];
            if(v3 == 10) {
                this.a();
            }
            else {
                this.b.append(((char)v3));
            }
        }
    }
}

