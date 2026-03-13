public class finalkeyword {
    final int a=3;
    static final int c;
    final void display(){
        System.out.println("welcome");
    } 
    
    static final int b;
    static{
        b=10;
    }
    public static void main(String[] args) {
        finalkeyword f = new finalkeyword();
    }
}

class finalinherited extends finalkeyword{
    @Override
    final void display(){
        System.out.println("welcome to java");
    }
}

final class cannotinherit{

}

class tryingtoinherit extends cannotinherit{

}