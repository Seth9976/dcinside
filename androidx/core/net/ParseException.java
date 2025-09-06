package androidx.core.net;

public class ParseException extends RuntimeException {
    public final String a;

    ParseException(String s) {
        super(s);
        this.a = s;
    }
}

