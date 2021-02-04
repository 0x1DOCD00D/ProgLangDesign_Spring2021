public class HumanFactory {
    static public Human[] createPeople(int i) {
        Human[] people = new Human[i];
        people[0] = new Human("dd");
        people[1] = new Worker();
        return people;
    }
}
