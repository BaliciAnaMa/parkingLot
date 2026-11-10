package ro.ulbs.parkinglot.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long ID;
    private String licensePlate;
    private String parkingSpot;

    @ManyToOne(optional = false)
    @JoinColumn(name = "owner_id", nullable = false)
    private User owner;

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(String parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public Long getId() {
        return ID;
    }

    public void setId(Long id) {
        this.ID = id;
    }

}