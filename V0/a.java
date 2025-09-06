package v0;

import java.io.File;
import k1.n.a;
import k1.n;

@n(a.a)
public class v0.a {
    public static boolean a(File file0) {
        File[] arr_file = file0.listFiles();
        boolean z = true;
        if(arr_file != null) {
            for(int v = 0; v < arr_file.length; ++v) {
                z &= v0.a.b(arr_file[v]);
            }
        }
        return z;
    }

    public static boolean b(File file0) {
        if(file0.isDirectory()) {
            v0.a.a(file0);
        }
        return file0.delete();
    }

    public static void c(File file0, b b0) {
        b0.c(file0);
        File[] arr_file = file0.listFiles();
        if(arr_file != null) {
            for(int v = 0; v < arr_file.length; ++v) {
                File file1 = arr_file[v];
                if(file1.isDirectory()) {
                    v0.a.c(file1, b0);
                }
                else {
                    b0.a(file1);
                }
            }
        }
        b0.b(file0);
    }
}

