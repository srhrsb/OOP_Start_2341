public class Character {

    private int hp = 100;
    private String name;

    public Character( ){

    }

    public Character( String name ){
        this.name = name;
    }

    public Character(int hp, String name) {
        this.hp = hp;
        this.name = name;
    }

    public void talk(){
        System.out.println("Ich bin ein Character");
    }

    public void talk(String text){
        System.out.println(text);
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
