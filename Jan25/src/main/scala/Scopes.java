public class Scopes {
    int i = 0;//0x1

    {
        int i = 2;//0x122
        i = 5;//0x122
        {
            class X {
                int i = 10;
            }
            i = 0;//0x122
            i = 7;//0x122
            {
                i = 0; //0x122
                i = 9;//0x122
                i = 1;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new Scopes().i);
    }
}
