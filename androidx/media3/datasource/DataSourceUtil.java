package androidx.media3.datasource;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;
import java.util.Arrays;

@UnstableApi
public final class DataSourceUtil {
    public static void a(@Nullable DataSource dataSource0) {
        if(dataSource0 != null) {
            try {
                dataSource0.close();
            }
            catch(IOException unused_ex) {
            }
        }
    }

    public static byte[] b(DataSource dataSource0, int v) throws IOException {
        byte[] arr_b = new byte[v];
        for(int v1 = 0; v1 < v; v1 += v2) {
            int v2 = dataSource0.read(arr_b, v1, v - v1);
            if(v2 == -1) {
                throw new IllegalStateException("Not enough data could be read: " + v1 + " < " + v);
            }
        }
        return arr_b;
    }

    public static byte[] c(DataSource dataSource0) throws IOException {
        byte[] arr_b = new byte[0x400];
        int v = 0;
        int v1 = 0;
        while(v1 != -1) {
            if(v == arr_b.length) {
                arr_b = Arrays.copyOf(arr_b, arr_b.length * 2);
            }
            v1 = dataSource0.read(arr_b, v, arr_b.length - v);
            if(v1 != -1) {
                v += v1;
            }
        }
        return Arrays.copyOf(arr_b, v);
    }
}

