package chrvk.javaelementary.hw18.task3.Model;

public class User {
    private int id;
    private String name;
    private String username;
    private String email;
    private Address address;
    private String phone;
    private String website;
    private Company company;

    public User() {
    }

    public User(int id, String name, String username, String email, Address address, String phone, String website, Company company) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.website = website;
        this.company = company;
    }

    private static class Address {
        private String street;
        private String suite;
        private String city;
        private String zipcode;
        private Geo geo;

        public Address() {
        }

        public Address(String street, String suite, String city, String zipcode, Geo geo) {
            this.street = street;
            this.suite = suite;
            this.city = city;
            this.zipcode = zipcode;
            this.geo = geo;
        }

        private static class Geo {
            private float lat;
            private float lng;

            public Geo() {
            }

            public Geo(float lat, float lng) {
                this.lat = lat;
                this.lng = lng;
            }

            @Override
            public String toString() {
                return "\n         lat: " + lat +
                        "\n         lng: " + lng;
            }
        }

        @Override
        public String toString() {
            return "\n     street: '" + street + '\'' +
                    "\n     suite: '" + suite + '\'' +
                    "\n     city: '" + city + '\'' +
                    "\n     zipcode: '" + zipcode + '\'' +
                    "\n     geo: " + geo;
        }
    }

    private static class Company {
        private String name;
        private String catchPhrase;
        private String bs;

        public Company() {
        }

        public Company(String name, String catchPhrase, String bs) {
            this.name = name;
            this.catchPhrase = catchPhrase;
            this.bs = bs;
        }

        @Override
        public String toString() {
            return "\n     name: '" + name + '\'' +
                    "\n     catchPhrase: '" + catchPhrase + '\'' +
                    "\n     bs: '" + bs + '\'';
        }
    }

    @Override
    public String toString() {
        return "{" +
                "\n id: " + id +
                "\n name: '" + name + '\'' +
                "\n username: '" + username + '\'' +
                "\n email: '" + email + '\'' +
                "\n address: " + address +
                "\n phone: '" + phone + '\'' +
                "\n website: '" + website + '\'' +
                "\n company:" + company +
                "\n}";
    }
}
