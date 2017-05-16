package com.test.models;

import javax.persistence.*;

/**
 * Created by LheaJLove on 5/16/2017.
 */
@Entity
@Table(name = "users", schema = "bitsandbytes", catalog = "")
public class UsersEntity {
    private int userId;
    private String name;
    private int age;
    private String favoriteDrink;
    private String favoritePastry;
    private String allerties;
    private String time;

    @Id
    @Column(name = "UserID", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "Name", nullable = false, length = 20)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "Age", nullable = false)
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Basic
    @Column(name = "FavoriteDrink", nullable = false, length = 20)
    public String getFavoriteDrink() {
        return favoriteDrink;
    }

    public void setFavoriteDrink(String favoriteDrink) {
        this.favoriteDrink = favoriteDrink;
    }

    @Basic
    @Column(name = "FavoritePastry", nullable = false, length = 20)
    public String getFavoritePastry() {
        return favoritePastry;
    }

    public void setFavoritePastry(String favoritePastry) {
        this.favoritePastry = favoritePastry;
    }

    @Basic
    @Column(name = "Allerties", nullable = false, length = 20)
    public String getAllerties() {
        return allerties;
    }

    public void setAllerties(String allerties) {
        this.allerties = allerties;
    }

    @Basic
    @Column(name = "Time", nullable = false, length = 20)
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsersEntity that = (UsersEntity) o;

        if (userId != that.userId) return false;
        if (age != that.age) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (favoriteDrink != null ? !favoriteDrink.equals(that.favoriteDrink) : that.favoriteDrink != null)
            return false;
        if (favoritePastry != null ? !favoritePastry.equals(that.favoritePastry) : that.favoritePastry != null)
            return false;
        if (allerties != null ? !allerties.equals(that.allerties) : that.allerties != null) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (favoriteDrink != null ? favoriteDrink.hashCode() : 0);
        result = 31 * result + (favoritePastry != null ? favoritePastry.hashCode() : 0);
        result = 31 * result + (allerties != null ? allerties.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        return result;
    }
}
