public class ГорячийНапиток {
    protected String name;
    protected int volume;
    

    public ГорячийНапиток(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "ГорячийНапиток{name='" + name + "', volume=" + volume + '}';
    }
}
