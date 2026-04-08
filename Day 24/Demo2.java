
public class Demo2 {
    public static void main(String[] args) {
        Payment p = new deditCard();
        p.pay();
    }
}

interface Payment {
    void pay();
}


class CreditCard implements Payment {
    @Override
    public void pay(){
        System.out.println("Paying via Credit Car");
    }
}

class deditCard implements Payment {
    @Override
    public void pay(){
        System.out.println("Paying via dedit Car");
    }
}