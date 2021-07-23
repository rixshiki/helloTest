public class MyRange {
    private final String input;

    public MyRange(String input){
        this.input = input;
    }

    public boolean isStartWithInclude() {
        return this.input.startsWith("[");
    }

    public boolean isStopWithInclude() {
        return this.input.endsWith("]");
    }

    public int startNumberWithInclude() {
        return this.input.charAt(1) - '0';
    }
}
