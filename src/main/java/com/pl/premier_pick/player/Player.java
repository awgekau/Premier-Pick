package com.pl.premier_pick.player;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="player_statistic")
public class Player {
    @Id
    @Column(name= "name", unique = true)
    private String name;
    private String nation;
    private String position;
    private Integer age;
    private Integer mp;
    private Integer starts;
    private Double min;
    private Double goals;
    private Double assists;
    private Double penalties_scored;
    private Double crdy;
    private Double crdr;
    private Double xG;
    private Double xGA;
    private String team;

    public Player() {
    }

    public Player(String name, String nation, String position, Integer age, Integer mp, Integer starts, Double min, Double goals, Double assists, Double penalties_scored, Double crdy, Double crdr, Double xG, Double xGA, String team) {
        this.name = name;
        this.nation = nation;
        this.position = position;
        this.age = age;
        this.mp = mp;
        this.starts = starts;
        this.min = min;
        this.goals = goals;
        this.assists = assists;
        this.penalties_scored = penalties_scored;
        this.crdy = crdy;
        this.crdr = crdr;
        this.xG = xG;
        this.xGA = xGA;
        this.team = team;
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getNation() {
        return nation;
    }

    public String getPosition() {
        return position;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getMp() {
        return mp;
    }

    public Integer getStarts() {
        return starts;
    }

    public Double getMin() {
        return min;
    }

    public Double getGoals() {
        return goals;
    }

    public Double getAssists() {
        return assists;
    }

    public Double getPenalties_scored() {
        return penalties_scored;
    }

    public Double getCrdy() {
        return crdy;
    }

    public Double getCrdr() {
        return crdr;
    }

    public Double getxG() {
        return xG;
    }

    public Double getxGA() {
        return xGA;
    }

    public String getTeam() {
        return team;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setMp(Integer mp) {
        this.mp = mp;
    }

    public void setStarts(Integer starts) {
        this.starts = starts;
    }

    public void setMin(Double min) {
        this.min = min;
    }

    public void setGoals(Double goals) {
        this.goals = goals;
    }

    public void setAssists(Double assists) {
        this.assists = assists;
    }

    public void setPenalties_scored(Double penalties_scored) {
        this.penalties_scored = penalties_scored;
    }

    public void setCrdy(Double crdy) {
        this.crdy = crdy;
    }

    public void setCrdr(Double crdr) {
        this.crdr = crdr;
    }

    public void setxG(Double xG) {
        this.xG = xG;
    }

    public void setxGA(Double xGA) {
        this.xGA = xGA;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
