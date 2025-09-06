package pl.droidsonroids.gif;

class c {
    private volatile boolean a;

    void a() throws InterruptedException {
        synchronized(this) {
            while(!this.a) {
                this.wait();
            }
        }
    }

    void b() {
        synchronized(this) {
            this.a = false;
        }
    }

    void c() {
        synchronized(this) {
            boolean z = this.a;
            this.a = true;
            if(!z) {
                this.notify();
            }
        }
    }

    void d(boolean z) {
        synchronized(this) {
            if(z) {
                this.c();
            }
            else {
                this.b();
            }
        }
    }
}

