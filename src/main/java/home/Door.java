package home;

/**
 * Класс для описание двери
 */
public class Door {

    private final boolean isPrize;

    public Door(boolean isPrize) {
        this.isPrize = isPrize;
    }

    public boolean isPrize() {
        return isPrize;
    }
        @Override
        public String toString() {
            return "Door{" +
                    "isPrize=" + isPrize +
                    '}';
        }
}
