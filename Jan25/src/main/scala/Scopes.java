public class Scopes {
    int i = 0;//0x1
    {
        int i = 2;//0x1
        i = 5;//0x1
        {
            class X {
                int i = 0;//0x2
            }
            i = 7;//0x2
            {
                i = 0; //0x3
                i = 9;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(new Scopes().i);
    }
}
