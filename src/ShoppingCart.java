import java.util.List;
import java.util.Map;

public class ShoppingCart {
    class Product{
        Long productId;
        String productName;
        Double price;
        Double discount;

        public Long getProductId() {
            return productId;
        }

        public void setProductId(Long productId) {
            this.productId = productId;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }

        public Double getDiscount() {
            return discount;
        }

        public void setDiscount(Double discount) {
            this.discount = discount;
        }
    }

    class Category{
        Long categoryId;
        List<Product> products;

        public Long getCategoryId() {
            return categoryId;
        }

        public void setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
        }

        public List<Product> getProducts() {
            return products;
        }

        public void setProducts(List<Product> products) {
            this.products = products;
        }
    }

    class Order{
        Long orderId;
        Customer customer;
        Map<Product,Integer> productCount;

        public Long getOrderId() {
            return orderId;
        }

        public void setOrderId(Long orderId) {
            this.orderId = orderId;
        }

        public Customer getCustomer() {
            return customer;
        }

        public void setCustomer(Customer customer) {
            this.customer = customer;
        }

        public Map<Product, Integer> getProductCount() {
            return productCount;
        }

        public void setProductCount(Map<Product, Integer> productCount) {
            this.productCount = productCount;
        }
    }

    class Customer{
        Long customerId;
        String userName;
        String fullName;
        Address address;

        public Long getCustomerId() {
            return customerId;
        }

        public void setCustomerId(Long customerId) {
            this.customerId = customerId;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public Address getAddress() {
            return address;
        }

        public void setAddress(Address address) {
            this.address = address;
        }
    }

    class Address{
        public boolean isApartment() {
            return isApartment;
        }

        public void setApartment(boolean apartment) {
            isApartment = apartment;
        }

        public Integer getHouseNUmber() {
            return houseNUmber;
        }

        public void setHouseNUmber(Integer houseNUmber) {
            this.houseNUmber = houseNUmber;
        }

        public String getApartNumber() {
            return apartNumber;
        }

        public void setApartNumber(String apartNumber) {
            this.apartNumber = apartNumber;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getZip() {
            return zip;
        }

        public void setZip(String zip) {
            this.zip = zip;
        }

        boolean isApartment;
        Integer houseNUmber;
        String apartNumber;
        String street;
        String city;
        String state;
        String zip;
    }

    public void addProducts(){

    }
    public void addCustomers(){

    }
    public void addCategories(){

    }
    public void shoppingCart(){

    }
    public static void main(String[] args) {

    }


    }
