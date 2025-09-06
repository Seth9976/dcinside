package bolts;

class l {
    private j a;

    public l(j j0) {
        this.a = j0;
    }

    public void a() {
        this.a = null;
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            j j0 = this.a;
            if(j0 != null) {
                q j$q0 = j.G();
                if(j$q0 != null) {
                    j$q0.a(j0, new m(j0.E()));
                }
            }
        }
        finally {
            super.finalize();
        }
    }
}

