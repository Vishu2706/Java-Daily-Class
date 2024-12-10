
import com.p1.Derived;
import com.p1.NonDerived;
import com.p1.Protection;

public class Demo {

    public static void main(String[] args) {
        Protection p = new Protection();
        Derived d = new Derived();
        NonDerived n = new NonDerived();
    }
}
