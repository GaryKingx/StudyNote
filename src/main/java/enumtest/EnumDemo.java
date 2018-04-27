package enumtest;

public enum  EnumDemo {
    RED("红色",1),
    GREEN("绿色",2),
    BLANK("白色",3),
    YELLOW("黄色",4);
    EnumDemo(String name, int index) {
    }
    private int index;
    private String name;


    public String getName(int index){
        for(EnumDemo demo : EnumDemo.values()){
            if(demo.index == index)
                return demo.name;
        }
        return null;
    }
    

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        System.out.println(EnumDemo.RED);
    }
}
