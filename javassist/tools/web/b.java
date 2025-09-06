package javassist.tools.web;

import java.io.IOException;
import java.net.Socket;

class b extends Thread {
    d a;
    Socket b;

    public b(d d0, Socket socket0) {
        this.a = d0;
        this.b = socket0;
    }

    @Override
    public void run() {
        try {
            this.a.k(this.b);
        }
        catch(IOException unused_ex) {
        }
    }
}

