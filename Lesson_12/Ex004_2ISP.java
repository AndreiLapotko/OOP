// Interface segregation principle
// Принцип разделения интерфейса 
// Модули высокого уровня не должны зависеть от модулей нижнего уровня.
//   И те, и другие должны зависеть от абстракций.
// Абстракции не должны зависеть от деталей. Детали должны зависеть от абстракций.

import java.util.ArrayList;
import java.util.List;

public class Ex004_2ISP {
    public static void main(String[] args) {
        List<BasePhone> phone1 = new ArrayList<BasePhone>();
        phone1.add(new IPhone());
        phone1.add(new Nokia3311());
        for (BasePhone basePhone : phone1) {
            basePhone.Call();
        }

        List<Fax> phone2 = new ArrayList<>();
        phone2.add(new IPhone());
    }
}

interface BasePhone {
    void Call();
    void SendSMS();
}

interface Fax {
    void SendFax();

}

interface EMail extends BasePhone{
    void SendEMail();
}

class IPhone implements Fax, EMail {

    @Override
    public void Call() {
    }

    @Override
    public void SendSMS() {
       

    }

    @Override
    public void SendEMail() {
        

    }

    @Override
    public void SendFax() {
    }
}

class Nokia3311 implements BasePhone {

    @Override
    public void Call() {
    }

    @Override
    public void SendSMS() {

    }
}