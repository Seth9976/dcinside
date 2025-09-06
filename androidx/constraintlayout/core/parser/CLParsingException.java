package androidx.constraintlayout.core.parser;

public class CLParsingException extends Exception {
    private final String a;
    private final int b;
    private final String c;

    public CLParsingException(String s, CLElement cLElement0) {
        super(s);
        this.a = s;
        if(cLElement0 != null) {
            this.c = cLElement0.n();
            this.b = cLElement0.l();
            return;
        }
        this.c = "unknown";
        this.b = 0;
    }

    public String a() {
        return this.a + " (" + this.c + " at line " + this.b + ")";
    }

    @Override
    public String toString() {
        return "CLParsingException (" + this.hashCode() + ") : " + this.a();
    }
}

