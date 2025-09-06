package okhttp3;

import java.io.IOException;
import okio.q0;
import y4.l;

public interface Call extends Cloneable {
    public interface Factory {
        @l
        Call newCall(@l Request arg1);
    }

    void cancel();

    @l
    Call clone();

    void enqueue(@l Callback arg1);

    @l
    Response execute() throws IOException;

    boolean isCanceled();

    boolean isExecuted();

    @l
    Request request();

    @l
    q0 timeout();
}

