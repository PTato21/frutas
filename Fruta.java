import java.util.ArrayList;
import java.util.List;

public class Fruta {

private List<Banana> bananas;

public Fruta() {
    bananas = new ArrayList<>();

    bananas.add(new Banana("Banana prata", 10));
    bananas.add(new Banana("Banana nanica", 15));
    bananas.add(new Banana("Banana maca", 8));
}

public List<Banana> getBananas() {
    return bananas;
}

}