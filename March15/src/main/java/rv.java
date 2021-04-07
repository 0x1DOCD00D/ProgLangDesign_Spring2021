public class rv {
    public boolean val;
    boolean rv() throws Throwable {
        try{
            val = true;
            throw new Throwable();
        }
        catch(Exception e){
            val = true;
        }
        finally{
            val = false;
//            return val;
        }
        return val;
    }
    public static void main(String[] args){
        rv r = new rv();
        System.out.println(r.rv());
    }
}