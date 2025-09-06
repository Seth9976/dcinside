package j$.io;

import j..util.Spliterators;
import j..util.stream.Stream;
import j..util.stream.StreamSupport;
import java.io.BufferedReader;

public final class BufferedReaderRetargetClass {
    public static Stream lines(BufferedReader bufferedReader0) {
        return StreamSupport.stream(Spliterators.spliteratorUnknownSize(new a(bufferedReader0), 0x110), false);
    }
}

