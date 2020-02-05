import java.util.*;
import java.util.stream.Collectors;

public class Streams {

    public List<String> getReverceNames(List<Product> productList){
        List<String> collect = productList
                .stream()
                .map(product -> new StringBuilder(product.getName()).reverse().toString())
                .collect(Collectors.toList());
        return collect;
    }

    public String getNamesAsc (List<Product> productList){
        Optional<String> optional = productList
                .stream()
                .map(Product::getName)
                .sorted(String::compareTo)
                .reduce((product1, product2) -> product1 + product2);
        return optional.orElse("String is null");
    }

    public List<Product> getSortedProductByPrice(List<Product> productList){
        List<Product> collect = productList
                .stream()
                .sorted((product1, product2) -> (int) (product2.getPrice() - product1.getPrice()))
                .skip(5)
                .collect(Collectors.toList());
        return collect;
    }

    public double getAveragePrice(List<Product> productList){
        OptionalDouble average = productList
                .stream()
                .mapToDouble(Product::getPrice)
                .average();
        return average.orElse(0);
    }

    public Map<Long, Product> getMapIdProduct(List<Product> productList){
        Map<Long, Product> productMap = productList
                .stream()
                .collect(Collectors.toMap(Product::getId, product -> product));
        return productMap;
    }

    public Map<String, Long> getMapProductCount(List<Product> productList){
        Map<String, Long> collect = productList
                .stream()
                .map(Product::getName)
                .sorted(String::compareTo)
                .collect(Collectors.groupingBy(product -> product, Collectors.counting()));
        return collect;
    }

}
