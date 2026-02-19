package org.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "formula_one")
public class FormulaOne {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "driver_name", nullable = false, length = 100)
    private String driverName;

    @Column(name = "team_name", length = 100)
    private String teamName;

    @Column(name = "championships_won")
    private int championshipsWon;

    @Column(name = "race_wins")
    private int raceWins;

    @Column(length = 50)
    private String nationality;

    public FormulaOne() {
    }

    public FormulaOne(String driverName, String teamName,
                      int championshipsWon, int raceWins, String nationality) {
        this.driverName = driverName;
        this.teamName = teamName;
        this.championshipsWon = championshipsWon;
        this.raceWins = raceWins;
        this.nationality = nationality;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getChampionshipsWon() {
        return championshipsWon;
    }

    public void setChampionshipsWon(int championshipsWon) {
        this.championshipsWon = championshipsWon;
    }

    public int getRaceWins() {
        return raceWins;
    }

    public void setRaceWins(int raceWins) {
        this.raceWins = raceWins;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    // Useful for debugging
    @Override
    public String toString() {
        return "FormulaOne{" +
                "id=" + id +
                ", driverName='" + driverName + '\'' +
                ", teamName='" + teamName + '\'' +
                ", championshipsWon=" + championshipsWon +
                ", raceWins=" + raceWins +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}
