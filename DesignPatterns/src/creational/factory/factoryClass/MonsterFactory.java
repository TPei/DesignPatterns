package creational.factory.factoryClass;

/**
 * Created by thomas on 05/03/15.
 */
public class MonsterFactory {
    public Monster createMonster(String type) {
        if (type.equals("zombie")) {
            return new Zombie();
        }
        return new Alien();
    }
}