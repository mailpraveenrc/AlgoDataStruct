import java.util.*;


public class SortOnMultipleParam {
    class Car implements Comparable<Car>{
        String product;
        Float rating;
        Double price;

        public String getProduct() {
            return product;
        }

        public void setProduct(String product) {
            this.product = product;
        }

        public Float getRating() {
            return rating;
        }

        public void setRating(Float rating) {
            this.rating = rating;
        }

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }

        @Override
        public int compareTo(Car e){
            if(this.getRating() > e.getRating()){
                return 1;
            }
            else if(this.getRating() < e.getRating()){
                return -1;
            }
            else {
                if(this.getPrice() < e.getPrice()){
                    return 1;
                }
                else if(this.getPrice() > e.getPrice()){
                    return -1;
                }
                else {
                    return 0;
                }
            }

        }

    }
    class Product{
        String product;
        Float rating;
        Double price;

        public String getProduct() {
            return product;
        }

        public void setProduct(String product) {
            this.product = product;
        }

        public Float getRating() {
            return rating;
        }

        public void setRating(Float rating) {
            this.rating = rating;
        }

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }
    }

    class ProductRatingComparator implements Comparator<Product>{

        @Override
        public int compare(Product p1, Product p2) {
            if(p1.getRating() > p2.getRating()){
                return 1;
            }
            else if(p1.getRating() < p2.getRating()){
                return -1;
            }
            else {
                if(p1.getPrice() < p2.getPrice()){
                    return 1;
                }
                else if(p1.getPrice() > p2.getPrice()){
                    return -1;
                }
                else {
                    return 0;
                }
            }
        }
    }

    class ProductPriceComparator implements Comparator<Product>{

        @Override
        public int compare(Product p1, Product p2) {
            if(p1.getPrice() < p2.getPrice()){
                return 1;
            }
            else if(p1.getPrice() > p2.getPrice()){
                return -1;
            }
            else {
                return 0;
            }
        }
    }


    public String[] sort(String[] products,Float[] popularity, Double[] price,boolean reverse ){
        String[] result = new String[products.length];
        int L = products.length;
        Map<String,Integer> productRank = new HashMap<>();
        List<Product> productsList = new ArrayList<>();
        for(int i =0; i < L;i++){
            Product prod = new Product();
            prod.setProduct(products[i]);
            prod.setRating(popularity[i]);
            prod.setPrice(price[i]);
            productsList.add(prod);
        }

        Comparator<Product> ratingComparator;
        if(reverse){
            ratingComparator = Collections.reverseOrder(new ProductRatingComparator());
        }else{
            ratingComparator = new ProductRatingComparator();
        }
        Collections.sort(productsList,ratingComparator);

        //Collections.sort(productsList,new ProductPriceComparator());
        for(int i=0; i < productsList.size(); i++){
            result[i] = productsList.get(i).getProduct();
        }
        return  result;
    }

    public String[] sort2(String[] products,Float[] popularity, Double[] price,boolean reverse ){
        String[] result = new String[products.length];
        int L = products.length;
        List<Car> carsList = new ArrayList<>();
        for(int i =0; i < L;i++){
            Car car = new Car();
            car.setProduct(products[i]);
            car.setRating(popularity[i]);
            car.setPrice(price[i]);
            carsList.add(car);
        }


        if(reverse){
            carsList.sort(Collections.reverseOrder());
        }else{
            Collections.sort(carsList);
        }

        for(int i=0; i < carsList.size(); i++){
            result[i] = carsList.get(i).getProduct();
        }
        return  result;
    }


    public static void main(String[] args) {
        String[] product = new String[]{"Honda","Tesla","Merc","Toyota","Royce"};
        Float[] rating = new Float[]{5f,5f,4.2f,9f,9f};
        Double[] price = new Double[]{30.2d,65.2d,44.4d,22d,99d};

        System.out.println("--------Comparator-----------");
        SortOnMultipleParam o = new SortOnMultipleParam();
        String[] productR = o.sort(product,rating,price,false);
        for(String p : productR){
            System.out.println(p);
        }
        System.out.println("REVERESE");
        String[] productR_rev = o.sort(product,rating,price,true);
        for(String p : productR_rev){
            System.out.println(p);
        }
        System.out.println("--------Comparable-----------");

        String[] productR2 = o.sort2(product,rating,price,false);
        for(String p : productR2){
            System.out.println(p);
        }
        System.out.println("REVERESE");
        String[] productR_rev2 = o.sort2(product,rating,price,true);
        for(String p : productR_rev2){
            System.out.println(p);
        }


    }
}
