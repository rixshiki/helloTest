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

    public int getStartNumber() {
        int startNumber = this.input.charAt(1) - '0';
        if (isStartWithInclude()) return startNumber;
        return startNumber + 1;
    }

    public int getEndNumber() {
        int endNumber = this.input.charAt(3) - '0';
        if (isStopWithInclude()) return endNumber ;
        return endNumber - 1;
    }

    public String getResult() {
        String result = "";
        for (int i = getStartNumber(); i <= getEndNumber(); i++){
            result +=  String.valueOf(i);
            if(i != getEndNumber()) result += ',';
        }
        return result;
    }
}
