import java.lang.reflect.Constructor;

public class CreateObjectWithPrivateConstruction {
    public static void main(String[] args) throws Exception{
        //    Aa a = new Aa();
        Constructor<Aa> constructor = Aa.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Aa a = constructor.newInstance();
    }
}

class Aa {
    private Aa(){
        System.out.println("private construtor");
    }
}
