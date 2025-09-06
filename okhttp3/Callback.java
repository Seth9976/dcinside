package okhttp3;

import java.io.IOException;
import y4.l;

public interface Callback {
    void onFailure(@l Call arg1, @l IOException arg2);

    void onResponse(@l Call arg1, @l Response arg2) throws IOException;
}

