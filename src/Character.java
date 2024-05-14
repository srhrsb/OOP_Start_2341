public class Character {

    private int hp = 100;
    private String name;

    public Character( String name ){
        this.name = name;
    }

    public Character(int hp, String name) {
        this.hp = hp;
        this.name = name;
    }


    //<editor-fold desc="GETTER and SETTER">
    public void setHp( int hp ){
        Math.clamp( hp, 0, 200);
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //</editor-fold>
}
