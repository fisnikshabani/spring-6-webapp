package guru.springframework.spring6webapp.domain;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Publisher {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String publisherName;
    private String publisherAddress;
    private String publisherCity;
    private String publisherState;
    private String publisherZip;

    @OneToMany (mappedBy = "publisher")
    private Set<Book> books = new HashSet<>(); // a book is going to have one publisher

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getPublisherAddress() {
        return publisherAddress;
    }

    public void setPublisherAddress(String publisherAddress) {
        this.publisherAddress = publisherAddress;
    }

    public String getPublisherCity() {
        return publisherCity;
    }

    public void setPublisherCity(String publisherCity) {
        this.publisherCity = publisherCity;
    }

    public String getPublisherState() {
        return publisherState;
    }

    public void setPublisherState(String publisherState) {
        this.publisherState = publisherState;
    }

    public String getPublisherZip() {
        return publisherZip;
    }

    public void setPublisherZip(String publisherZip) {
        this.publisherZip = publisherZip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Publisher publisher)) return false;

        return getId() != null ? getId().equals(publisher.getId()) : publisher.getId() == null;
    }

    @Override
    public int hashCode() {
        return getId() != null ? getId().hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "id=" + id +
                ", publisherName='" + publisherName + '\'' +
                ", publisherAddress='" + publisherAddress + '\'' +
                ", publisherCity='" + publisherCity + '\'' +
                ", publisherState='" + publisherState + '\'' +
                ", publisherZip='" + publisherZip + '\'' +
                '}';
    }
}
