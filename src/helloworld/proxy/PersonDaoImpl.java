package helloworld.proxy;

public class PersonDaoImpl implements PersonDao {
    @Override
    public void say(String str) {
        System.out.println("say: " + str);
    }
}
