package j$.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class a implements Iterator {
    private final BufferedReader a;
    String b;

    a(BufferedReader bufferedReader0) {
        this.b = null;
        this.a = bufferedReader0;
    }

    @Override
    public final boolean hasNext() {
        if(this.b != null) {
            return true;
        }
        try {
            String s = this.a.readLine();
            this.b = s;
            return s != null;
        }
        catch(IOException iOException0) {
            throw new UncheckedIOException(iOException0);
        }
    }

    @Override
    public final Object next() {
        if(this.b == null && !this.hasNext()) {
            throw new NoSuchElementException();
        }
        String s = this.b;
        this.b = null;
        return s;
    }
}

