//package builders;
//
//import clients.Address;
//
//public abstract class ClientBuilder {
//    private String id;
//    private String name;
//    private Address address;
//    private String phone;
//    private String email;
//
//    public ClientBuilder id(String id){
//        this.id = id;
//        return this;
//    }
//
//    public ClientBuilder name(String name) {
//        this.name = name;
//        return this;
//    }
//
//    public ClientBuilder Address(Address address) {
//        this.address = address;
//        return this;
//    }
//
//    public ClientBuilder phone(String phone) {
//        this.phone = phone;
//        return this;
//    }
//
//    public ClientBuilder email(String email) {
//        this.email = email;
//        return this;
//    }
//
//
//    public Client build() {
//        return new Client(this);
//    }
//}
