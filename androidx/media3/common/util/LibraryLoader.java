package androidx.media3.common.util;

import java.util.Arrays;

@UnstableApi
public abstract class LibraryLoader {
    private String[] a;
    private boolean b;
    private boolean c;
    private static final String d = "LibraryLoader";

    public LibraryLoader(String[] arr_s) {
        this.a = arr_s;
    }

    public boolean a() {
        synchronized(this) {
            if(this.b) {
                return this.c;
            }
            try {
                this.b = true;
                String[] arr_s = this.a;
                for(int v1 = 0; v1 < arr_s.length; ++v1) {
                    this.b(arr_s[v1]);
                }
                this.c = true;
            }
            catch(UnsatisfiedLinkError unused_ex) {
                Log.n("LibraryLoader", "Failed to load " + Arrays.toString(this.a));
            }
            return this.c;
        }
    }

    protected abstract void b(String arg1);

    public void c(String[] arr_s) {
        synchronized(this) {
            Assertions.j(!this.b, "Cannot set libraries after loading");
            this.a = arr_s;
        }
    }
}

