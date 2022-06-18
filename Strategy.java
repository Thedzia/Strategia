public class Strategy {
    public static void main(String[] args) {
        int[] numers = { 5, 1, 4, 6, 7, 2 };
        Context context = new Context(new BubbleSort());
        context.execute(numbers);
        context = new Context(new QuictSort());
        context.execute(numbers);
    }
}

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void execute(int[] numbers) {
        strategy.sort(numbers);
    }
}

public interface Strategy {
    void sort(int[] numbers);
}

public class BubbleSort implements Strategy {
    @Override
    public void sort(int[] numbers) {
        System.out.println("Sortowanie bąbelkowe");
    }
}

public class QuictSort implements Strategy {
    @Override
    public void sort(int[] numbers) {
        System.out.println("Sortowanie quicksort");
    }
}