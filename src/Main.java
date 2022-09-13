import com.company.Hero;
import com.company.Magic;
import com.company.Medic;
import com.company.Warrior;

public class Main {

    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Medic medic = new Medic();
        Magic magic = new Magic();

        Hero[] heroes ={warrior,magic,medic};
        for (int i = 0; i < heroes.length ; i++) {
            heroes[i].applySuperAbility();


        }

    }
}