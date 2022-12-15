package business.object;

import java.math.BigDecimal;

public class PackageDeals {
    private String title;
    private String servicesIncluded;
    private int numberOfSessions;
    private BigDecimal price;

    public PackageDeals(String title, String servicesIncluded, int numberOfSessions, BigDecimal price) {
        this.title = title;
        this.servicesIncluded = servicesIncluded;
        this.numberOfSessions = numberOfSessions;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getServicesIncluded() {
        return servicesIncluded;
    }

    public void setServicesIncluded(String servicesIncluded) {
        this.servicesIncluded = servicesIncluded;
    }

    public int getNumberOfSessions() {
        return numberOfSessions;
    }

    public void setNumberOfSessions(int numberOfSessions) {
        this.numberOfSessions = numberOfSessions;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "PackageDeals{" +
                "title='" + title + '\'' +
                ", servicesIncluded='" + servicesIncluded + '\'' +
                ", numberOfSessions=" + numberOfSessions +
                ", price=" + price +
                '}';
    }
}

