public class BaseClass {
    public int getAttribute() {
        return attribute;
    }

    public void setAttribute(int attribute) {
        assert (attribute>10);
        this.attribute = attribute;
    }

    private int attribute;
    
}
