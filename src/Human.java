import java.security.PublicKey;
import java.util.Scanner;

public class Human {
    public static void main(String[] args) {
        Human human = new Human();

        Demographic demographic = new Demographic();

        demographic.setMan(demographic);


        if (demographic.sex)
        {
            System.out.println(demographic.name + " is a Man with age of " + demographic.age + " and his favorite character of alphabet is '" + demographic.favoriteLetter + "'");
        } else    {
            System.out.println(demographic.name + " is a Woman with age of " + demographic.age + " and her favorite character of alphabet is '" + demographic.favoriteLetter + "'");
        }

        human.gettingOlder(demographic);

        human.changeSex(demographic);

        human.changeName(demographic);

        human.changeChar(demographic);

        if (demographic.sex)
        {
            System.out.println(demographic.name + " is a Man with age of " + demographic.age + " and his favorite character of alphabet is '" + demographic.favoriteLetter + "'");
        } else    {
            System.out.println(demographic.name + " is a Woman with age of " + demographic.age + " and her favorite character of alphabet is '" + demographic.favoriteLetter + "'");
        }
    }
    public void gettingOlder(Demographic demographic)
    {
        demographic.age = ++demographic.age;
    }
    public void changeSex(Demographic demographic)
    {
        if (demographic.sex){
            demographic.sex = false;
        }  else {
            demographic.sex = true;
        }
    }
    public void changeName(Demographic demographic)
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter new name: ");
        String name = myObj.nextLine();
        demographic.name = name;
    }
    public void changeChar(Demographic demographic)
    {
        Scanner chara = new Scanner(System.in);
        System.out.println("Enter new favorite latter: ");
        char character = chara.next().charAt(0);
        demographic.favoriteLetter = character;
    }
}