package main.java.com.hadiyasa.dependency_example;

public class Hero {
    String name;
    Integer damage;
    Integer hp;

    public Hero(String name, Integer damage, Integer hp) {
        this.name = name;
        this.damage = damage;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", damage='" + damage + '\'' +
                ", hp='" + hp + '\'' +
                '}';
    }
}
