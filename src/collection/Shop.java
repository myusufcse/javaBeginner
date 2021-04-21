package collection;

import java.util.ArrayList;
import java.util.Comparator;

import static collection.Condition.*;

public class Shop {
    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<>();
        list.add(new Product("Milk", WARM));
        list.add(new Product("Tea", HOT));
        list.add(new Product("Coffee", COLD));
        list.add(new Product("Cake"));
        Product product = new Product("Water");
        list.add(product);
        Product p2 = product;

        list.forEach(s -> System.out.printf("%d.%s\t",s.getId(),s.getName()));
        System.out.println("\nSorted Objects based on length");
        list.sort(new LengthComparator());

        list.forEach(s -> System.out.printf("%d.%s --> %s\n",s.getId(),s.getName(),s.getCondition().getCaution()));

    }

    private static class LengthComparator implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return o1.toString().length()-o2.toString().length();
        }
    }
}
