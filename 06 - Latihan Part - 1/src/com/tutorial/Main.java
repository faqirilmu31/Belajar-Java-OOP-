package com.tutorial;

// player
class Player{
    String name;
    double health;
    int level;

    // object member
    Weapon weapon;
    Armor armor;

    Player(String name, double health){
        this.name = name;
        this.health = health;
    }

    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    void equipArmor(Armor armor){
        this.armor = armor;
    }

    void display(){
        System.out.println("\nName: " + this.name);
        System.out.println("Health : " + this.health + " hp");
        this.weapon.display();
        this.armor.display();
    }
}

// senjata
class Weapon{
    double attackPower;
    String name;

    Weapon(String name, double attackPower){
        this.name = name;
        this.attackPower = attackPower;
    }

    void display(){
        System.out.println("Weapon : " + this.name + " , Attack : " + this.attackPower);
    }
}

// armor
class Armor{
    double defensePower;
    String name;

    Armor(String name, double defensePower){
        this.name = name;
        this.defensePower = defensePower;
    }

    void display(){
        System.out.println("Armor : " + this.name + " , Defense : " + this.defensePower);
    }
}

public class Main {
    public static void main(String[] args) {
        
        // membuat object player
        Player player1 = new Player("Ucup", 100);
        Player player2 = new Player("otong", 50);

        // membuat object weapon
        Weapon pedang = new Weapon("pedang", 15);
        Weapon ketapel = new Weapon("ketapel", 1);

         // membuat object armor
         Armor bajuBesi = new Armor("Baju Besi", 10);
         Armor kaos = new Armor("Kaos", 0);

         // player 1
         player1.equipWeapon(pedang);
         player1.equipArmor(bajuBesi);
         player1.display();

        // player 2
        player2.equipWeapon(ketapel);
        player2.equipArmor(kaos);
        player2.display();
    }
}
