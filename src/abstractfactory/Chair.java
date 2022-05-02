package abstractfactory;

public class Chair extends Products{

    int length;
    String shape;
    int type;
    String opt;

    @Override
    public int getLength() {
        return this.length;
    }

    @Override
    public String getShape() {
        return this.shape;
    }

    public int getType() {
        return type;
    }

    public String getOpt() {
        return opt;
    }

    private Chair(ChairBuilder cb) {
        this.length = cb.length;
        this.shape = cb.shape;
        this.type = cb.type;
        this.opt=cb.opt;
    }

    public static class ChairBuilder{
        int length;
        String shape;
        int type;
        String opt;

        public ChairBuilder(int length, String shape, int type) {
            this.length = length;
            this.shape = shape;
            this.type = type;
        }

        public ChairBuilder setOpt(String opt){
            this.opt=opt;
            return this;
        }

        public Chair build(){
            return new Chair(this);
        }
    }
}
