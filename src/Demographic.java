public class Demographic
{
    boolean sex;
    int age;
    String name;
    char favoriteLetter;
    public void setMan(Demographic demographic)
    {
        demographic.sex = true;
        demographic.age = 18;
        demographic.name = "Vlad";
        demographic.favoriteLetter = 'd';
    }

}
