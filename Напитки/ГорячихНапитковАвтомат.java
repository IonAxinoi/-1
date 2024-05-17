import java.util.ArrayList;
import java.util.List;

public class ГорячихНапитковАвтомат implements ТорговыйАвтомат {
    private List<ГорячийНапитокСТемпературой> напитки;

    public ГорячихНапитковАвтомат() {
        напитки = new ArrayList<>();
    }

    public void добавитьНапиток(ГорячийНапитокСТемпературой напиток) {
        напитки.add(напиток);
    }

    @Override
    public ГорячийНапиток getProduct(String name, int volume, int температура) {
        for (ГорячийНапитокСТемпературой напиток : напитки) {
            boolean nameMatches = напиток.getName().equals(name);
            boolean volumeMatches = напиток.getVolume() == volume;
            boolean temperatureMatches = напиток.getТемпература() == температура;

            if (nameMatches && volumeMatches && temperatureMatches) {
                return напиток;
            }
        }
        return null;
    }

    public void показатьНапитки() {
        for (ГорячийНапитокСТемпературой напиток : напитки) {
            System.out.print(" - ");
            System.out.print(напиток.getName() + ", ");
            System.out.print(напиток.getVolume() + "ml, ");
            System.out.println(напиток.getТемпература() + "°");
        }
    }
}
